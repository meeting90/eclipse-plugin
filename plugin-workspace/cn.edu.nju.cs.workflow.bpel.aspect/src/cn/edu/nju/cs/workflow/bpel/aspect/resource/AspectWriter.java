package cn.edu.nju.cs.workflow.bpel.aspect.resource;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.wsdl.extensions.ExtensibilityElement;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;
import org.eclipse.bpel.model.BPELFactory;
import org.eclipse.bpel.model.Branches;
import org.eclipse.bpel.model.Catch;
import org.eclipse.bpel.model.CatchAll;
import org.eclipse.bpel.model.CompensationHandler;
import org.eclipse.bpel.model.CompletionCondition;
import org.eclipse.bpel.model.Copy;
import org.eclipse.bpel.model.Correlation;
import org.eclipse.bpel.model.CorrelationSet;
import org.eclipse.bpel.model.CorrelationSets;
import org.eclipse.bpel.model.Correlations;
import org.eclipse.bpel.model.Documentation;
import org.eclipse.bpel.model.Else;
import org.eclipse.bpel.model.ElseIf;
import org.eclipse.bpel.model.EventHandler;
import org.eclipse.bpel.model.Expression;
import org.eclipse.bpel.model.Extension;
import org.eclipse.bpel.model.Extensions;
import org.eclipse.bpel.model.FaultHandler;
import org.eclipse.bpel.model.From;
import org.eclipse.bpel.model.FromPart;
import org.eclipse.bpel.model.FromParts;
import org.eclipse.bpel.model.Import;
import org.eclipse.bpel.model.Link;
import org.eclipse.bpel.model.Links;
import org.eclipse.bpel.model.MessageExchange;
import org.eclipse.bpel.model.MessageExchanges;
import org.eclipse.bpel.model.OnAlarm;
import org.eclipse.bpel.model.OnEvent;
import org.eclipse.bpel.model.OnMessage;
import org.eclipse.bpel.model.PartnerLink;
import org.eclipse.bpel.model.PartnerLinks;
import org.eclipse.bpel.model.Process;
import org.eclipse.bpel.model.Query;
import org.eclipse.bpel.model.ServiceRef;
import org.eclipse.bpel.model.Source;
import org.eclipse.bpel.model.Sources;
import org.eclipse.bpel.model.Target;
import org.eclipse.bpel.model.Targets;
import org.eclipse.bpel.model.TerminationHandler;
import org.eclipse.bpel.model.To;
import org.eclipse.bpel.model.ToPart;
import org.eclipse.bpel.model.ToParts;
import org.eclipse.bpel.model.Validate;
import org.eclipse.bpel.model.Variable;
import org.eclipse.bpel.model.Variables;
import org.eclipse.bpel.model.adapters.INamespaceMap;
import org.eclipse.bpel.model.resource.BPELResource;
import org.eclipse.bpel.model.resource.BPELWriter;
import org.eclipse.bpel.model.util.BPELConstants;
import org.eclipse.bpel.model.util.BPELUtils;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.wst.wsdl.util.WSDLConstants;
import org.eclipse.wst.wsdl.util.WSDLResourceImpl;
import org.eclipse.xsd.util.XSDConstants;
import org.eclipse.xsd.util.XSDResourceImpl;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import cn.edu.nju.cs.workflow.model.aspect.Advice;
import cn.edu.nju.cs.workflow.model.aspect.Aspect;
import cn.edu.nju.cs.workflow.model.aspect.AspectPackage;
import cn.edu.nju.cs.workflow.model.aspect.Pointcut;
import cn.edu.nju.cs.workflow.model.aspect.Pointcuts;
import cn.edu.nju.cs.workflow.model.aspect.util.AspectConstants;

@SuppressWarnings("deprecation")
public class AspectWriter extends BPELWriter{
	private Document document=null;
	private AspectResource fAspectResource=null;
	AspectPackage aspectPackage=null;
	WsdlImportsManager wsdlNamespacePrefixManager;
	
	class WsdlImportsManager {

		Process fProcessContext;

		// Map of resource URIs to namespaces
		private final Map<String, String> fResourceNamespaceMap;

		/**
		 * @param context
		 */
		WsdlImportsManager(Process process) {

			this.fProcessContext = process;

			this.fResourceNamespaceMap = new HashMap<String, String>();

			// For each existing import in the process, add it to the namespace
			// map.
			for (Object next : this.fProcessContext.getImports()) {
				Import imp = (org.eclipse.bpel.model.Import) next;
				if (imp.getLocation() == null) {
					System.err.println("Import location is unexpectedly null: "
							+ imp);
				} else {
					URI locationURI = URI.createURI(imp.getLocation());
					String importPath = locationURI.resolve(
							getResource().getURI()).toString();

					this.fResourceNamespaceMap.put(importPath, imp.getNamespace());
				}
			}
		}

		/**
		 * Ensure that there exists an import mapping the given namespace to the
		 * given resource. If the import doesn't exist in our map, add it to the
		 * map and create a new Import in the process.
		 *
		 * @param resource
		 * @param namespace
		 */

		void ensureImported(Resource resource, String namespace) {

			// For service references. If the declaration comes from the
			// bpel xsd, bail out.
			if (BPELConstants.NAMESPACE.equals(namespace)) {
				return;
			}

			String key = resource.getURI().toString();

			if (this.fResourceNamespaceMap.containsKey(key)) {
				return;
			}
			// second check to ensure the calculated path is not empty
			String locationURI = getRelativeLocation(resource.getURI());
			if (locationURI != null && locationURI.length() != 0) {

				// Create and add the import to the process
				org.eclipse.bpel.model.Import _import = BPELFactory.eINSTANCE
						.createImport();

				_import.setNamespace(namespace);
				_import.setLocation(locationURI);

				if (resource instanceof WSDLResourceImpl) {
					_import.setImportType(WSDLConstants.WSDL_NAMESPACE_URI);
				} else if (resource instanceof XSDResourceImpl) {
					_import
							.setImportType(XSDConstants.SCHEMA_FOR_SCHEMA_URI_2001);
				}

				this.fProcessContext.getImports().add(_import);

				// Add it to our namespace map for easy reference
				this.fResourceNamespaceMap.put(key, namespace);
			}
		}

		/**
		 * Helper method. Return the relative location of the given file uri,
		 * relative to the location of the BPEL file.
		 */
		String getRelativeLocation(URI importedFileUri) {
			URI relativeURI = importedFileUri.deresolve(getResourceURI(), true,
					true, false);
			return relativeURI.toString();
		}

		URI getResourceURI() {
			return getResource().getURI();
		}
	}
	public AspectWriter() {
		// TODO Auto-generated constructor stub
	}
	public AspectWriter(AspectResource resource, Document document){
		this();
		this.fAspectResource=resource;
		this.document=document;
	}
	public AspectResource getResource(){
		return this.fAspectResource;
	}
	@Override
	public void write(BPELResource resource, OutputStream out, Map<?, ?> args)
			throws IOException {
		try{
			final DocumentBuilderFactory documentBuilderFactory=new org.apache.xerces.jaxp.DocumentBuilderFactoryImpl();
			documentBuilderFactory.setNamespaceAware(true);
			documentBuilderFactory.setValidating(false);
			DocumentBuilder builder = documentBuilderFactory
					.newDocumentBuilder();
			this.document = builder.newDocument();
			this.aspectPackage=AspectPackage.eINSTANCE;
			this.fAspectResource=(AspectResource) resource;
			Process process=this.fAspectResource.getProcess();
			this.wsdlNamespacePrefixManager = new WsdlImportsManager(process);

			Boolean skipAutoImport = (Boolean) args.get( SKIP_AUTO_IMPORT );
			if( skipAutoImport == null || ! skipAutoImport )
				walkExternalReferences();
			this.document=resource2XML(this.fAspectResource);
					
			OutputFormat fmt = new OutputFormat(this.document);
			fmt.setIndenting(true);
			fmt.setIndent(4);

			XMLSerializer serializer = new XMLSerializer(out, fmt);
			serializer.serialize(this.document);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	protected Document resource2XML(AspectResource resource) {
		Aspect aspect = resource.getAspect();
		Element aspectElement = aspect2XML(aspect);
		this.document.appendChild(aspectElement);
		serializePrefixes(aspect, aspectElement);
		return this.document;
	}
	private Aspect getAspect(){
		return getResource().getAspect();
	}
	private Element createAspectElement(String tagName) {
		// TODO Auto-generated method stub
		String namespaceURI = null;

		if (getResource() != null) {
			namespaceURI = getResource().getNamespaceURI();
		} else {
			namespaceURI = AspectConstants.NAMESPACE;
		}

		if (namespaceURI != null) {
			List<String> prefixes = BPELUtils.getNamespaceMap(
					getAspect()).getReverse(namespaceURI);
			if (!prefixes.isEmpty() && !prefixes.get(0).equals("")) {
				return this.document.createElementNS(namespaceURI, prefixes.get(0)
						+ ":" + tagName);
			}
		}

		return this.document.createElement(tagName);
	}
	private void serializePrefixes(EObject eObject, Element context) {
		INamespaceMap<String, String> nsMap = BPELUtils
				.getNamespaceMap(eObject);
		if (!nsMap.isEmpty()) {
			for( Map.Entry<String,String> entry : nsMap.entrySet()) {
				String prefix = entry.getKey();
				String namespace = entry.getValue();
				if (prefix.length() == 0)
					context.setAttributeNS(XSDConstants.XMLNS_URI_2000,
							"xmlns", namespace);
				else
					context.setAttributeNS(XSDConstants.XMLNS_URI_2000,
							"xmlns:" + prefix, namespace);
			}
		}
	}
	public Element aspect2XML(Aspect aspect) {
		Element aspectElement=createAspectElement("aspect");
		if(aspect.getName()!=null)
			aspectElement.setAttribute("name", aspect.getName());
		if(aspect.getTargetnamespace()!=null)
			aspectElement.setAttribute("targetNamespace", aspect.getTargetnamespace());
		if(aspect.getExpressionLanguage()!=null)
			aspectElement.setAttribute("expressionLanguage", aspect.getExpressionLanguage());
		if(aspect.getPointcuts()!=null&& !aspect.getPointcuts().getChildren().isEmpty())
			aspectElement.appendChild(pointcuts2XML(aspect.getPointcuts()));
		if(aspect.getAdvice()!=null)
			aspectElement.appendChild(Advice2XML(aspect.getAdvice()));
		extensibleElement2XML(aspect, aspectElement);
		return aspectElement;
	}

	
	public Element pointcut2XML(Pointcut pointcut) {
		// TODO Auto-generated method stub
		Element pointcutElement=createBPELElement("pointcut");
		if(pointcut.getName()!=null){
			pointcutElement.setAttribute("name", pointcut.getName());
		}
		if(pointcut.getLanguage()!=null){
			pointcutElement.setAttribute("language", pointcut.getLanguage());
		}
		if(pointcut.getStartpoint()!=null){
			pointcutElement.appendChild(expression2XML(pointcut.getStartpoint(),"startpoint"));
		}
		if(pointcut.getEndpoint()!=null){
			pointcutElement.appendChild(expression2XML(pointcut.getEndpoint(),"endpoint"));
		}
		if(pointcut.getPoint()!=null){
			pointcutElement.appendChild(expression2XML(pointcut.getPoint(),"point"));
		}
		serializePrefixes(pointcut, pointcutElement);
		
		return pointcutElement;
		
		
		
		
	}

	public Element pointcuts2XML(Pointcuts pointcuts) {
		if(pointcuts.getChildren().isEmpty())
			return null;
		Element pointcutsElement=createAspectElement("pointcuts");
		for(Object next : pointcuts.getChildren()){
			pointcutsElement.appendChild(pointcut2XML((Pointcut) next));
		}
		serializePrefixes(pointcuts, pointcutsElement);
		return pointcutsElement;
	}

	public Element Advice2XML(Advice advice) {
		// TODO Auto-generated method stub
		Element adviceElement=createAspectElement("advice");
		if(advice.getType()!=null)
			adviceElement.setAttribute("type", advice.getType());
		if (advice.getName() != null)
			adviceElement.setAttribute("name", advice.getName());
		if (advice.getTargetNamespace() != null)
			adviceElement.setAttribute("targetNamespace", advice
					.getTargetNamespace());
		if (advice.isSetSuppressJoinFailure())
			adviceElement.setAttribute("suppressJoinFailure", BPELUtils
					.boolean2XML(advice.getSuppressJoinFailure()));
		if (advice.getExitOnStandardFault() != null)
			adviceElement.setAttribute("exitOnStandardFault", BPELUtils
					.boolean2XML(advice.getExitOnStandardFault()));
		if (advice.isSetVariableAccessSerializable())
			adviceElement.setAttribute("variableAccessSerializable", BPELUtils
					.boolean2XML(advice.getVariableAccessSerializable()));
		if (advice.isSetQueryLanguage())
			adviceElement.setAttribute("queryLanguage", advice
					.getQueryLanguage());
		if (advice.isSetExpressionLanguage())
			adviceElement.setAttribute("expressionLanguage", advice
					.getExpressionLanguage());
		if (advice.isSetAbstractProcessProfile())
			adviceElement.setAttribute("abstractProcessProfile", advice
					.getAbstractProcessProfile());

        
		for (Object next : advice.getImports()) {
			adviceElement
					.appendChild(import2XML((org.eclipse.bpel.model.Import) next));
		}

		if (advice.getPartnerLinks() != null
				&& !advice.getPartnerLinks().getChildren().isEmpty())
			adviceElement.appendChild(partnerLinks2XML(advice
					.getPartnerLinks()));

		if (advice.getVariables() != null
				&& !advice.getVariables().getChildren().isEmpty())
			adviceElement.appendChild(variables2XML(advice.getVariables()));

		if (advice.getCorrelationSets() != null
				&& !advice.getCorrelationSets().getChildren().isEmpty())
			adviceElement.appendChild(correlationSets2XML(advice
					.getCorrelationSets()));

		if (advice.getExtensions() != null)
			adviceElement.appendChild(extensions2XML(advice.getExtensions()));

		if (advice.getFaultHandlers() != null)
			adviceElement.appendChild(faultHandlers2XML(advice
					.getFaultHandlers()));

		if (advice.getEventHandlers() != null)
			adviceElement.appendChild(eventHandler2XML(advice
					.getEventHandlers()));

		if (advice.getMessageExchanges() != null
				&& !advice.getMessageExchanges().getChildren().isEmpty())
			adviceElement.appendChild(messageExchanges2XML(advice
					.getMessageExchanges()));

		if (advice.getActivity() != null)
			adviceElement.appendChild(activity2XML(advice.getActivity()));

		extensibleElement2XML(advice, adviceElement);
		
		return adviceElement;

			
	}
	public AspectWriter(BPELResource resource, Document document){
		super(resource,document);
	}

	@Override
	public Element createBPELElement(String tagName) {
		return super.createBPELElement(tagName);
	}

	@Override
	public Element activity2XML(org.eclipse.bpel.model.Activity activity) {
		return super.activity2XML(activity);
	}

	@Override
	public Element variable2XML(Variable variable) {
		return super.variable2XML(variable);
	}

	@Override
	public Element variables2XML(Variables variables) {
		return super.variables2XML(variables);
	}

	@Override
	public Element completionCondition2XML(
			CompletionCondition completionCondition) {
		return super.completionCondition2XML(completionCondition);
	}

	@Override
	public Element expression2XML(Expression expression,
			String elementName) {
		return super.expression2XML(expression, elementName);
	}

	@Override
	public Element branches2XML(Branches branches) {
		return super.branches2XML(branches);
	}

	@Override
	public Element extensibilityElement2XML(
			ExtensibilityElement extensibilityElement) {
		return super.extensibilityElement2XML(extensibilityElement);
	}

	@Override
	public Element correlationSets2XML(CorrelationSets correlationSets) {
		return super.correlationSets2XML(correlationSets);
	}

	@Override
	public Element fromParts2XML(FromParts fromParts) {
		return super.fromParts2XML(fromParts);
	}

	@Override
	public Element fromPart2XML(FromPart fromPart) {
		return super.fromPart2XML(fromPart);
	}

	@Override
	public Element toParts2XML(ToParts toParts) {
		return super.toParts2XML(toParts);
	}

	@Override
	public Element toPart2XML(ToPart toPart) {
		return super.toPart2XML(toPart);
	}

	@Override
	public Element correlationSet2XML(CorrelationSet correlationSet) {
		return super.correlationSet2XML(correlationSet);
	}

	@Override
	public Element partnerLinks2XML(PartnerLinks partnerLinks) {
		return super.partnerLinks2XML(partnerLinks);
	}

	@Override
	public Element messageExchanges2XML(MessageExchanges messageExchanges) {
		return super.messageExchanges2XML(messageExchanges);
	}

	@Override
	public Element elseIf2XML(ElseIf elseIf) {
		return super.elseIf2XML(elseIf);
	}

	@Override
	public Element else2XML(Else _else) {
		return super.else2XML(_else);
	}

	@Override
	public Element onAlarm2XML(OnAlarm onAlarm) {
		return super.onAlarm2XML(onAlarm);
	}

	@Override
	public Element onMessage2XML(OnMessage onMsg) {
		return super.onMessage2XML(onMsg);
	}

	@Override
	public Element onEvent2XML(OnEvent onEvent) {
		return super.onEvent2XML(onEvent);
	}

	@Override
	public Element copy2XML(Copy copy) {
		return super.copy2XML(copy);
	}

	@Override
	public Element catch2XML(Catch _catch) {
		return super.catch2XML(_catch);
	}

	@Override
	public Element catchAll2XML(CatchAll catchAll) {
		return super.catchAll2XML(catchAll);
	}

	@Override
	public Element compensationHandler2XML(
			CompensationHandler compensationHandler) {
		return super.compensationHandler2XML(compensationHandler);
	}

	@Override
	public void to2XML(To to, Element toElement) {
		super.to2XML(to, toElement);
	}

	@Override
	public void from2XML(From from, Element fromElement) {
		super.from2XML(from, fromElement);
	}

	@Override
	public Element eventHandler2XML(EventHandler eventHandler) {
		return super.eventHandler2XML(eventHandler);
	}

	@Override
	public Element partnerLink2XML(PartnerLink partnerLink) {
		return super.partnerLink2XML(partnerLink);
	}

	@Override
	public Element messageExchange2XML(MessageExchange messageExchange) {
		return super.messageExchange2XML(messageExchange);
	}

	@Override
	public Element validate2XML(Validate activity) {
		return super.validate2XML(activity);
	}

	@Override
	public Element query2XML(Query query) {
		return super.query2XML(query);
	}

	@Override
	public Element faultHandlers2XML(FaultHandler faultHandler) {
		return super.faultHandlers2XML(faultHandler);
	}

	@Override
	public void faultHandler2XML(Element parentElement,
			FaultHandler faultHandler) {
		super.faultHandler2XML(parentElement, faultHandler);
	}

	@Override
	public Element import2XML(Import imp) {
		return super.import2XML(imp);
	}

	@Override
	public Element correlation2XML(Correlation correlation) {
		return super.correlation2XML(correlation);
	}

	@Override
	public Element correlations2XML(Correlations correlations) {
		return super.correlations2XML(correlations);
	}

	@Override
	public String properties2XML(CorrelationSet correlationSet) {
		return super.properties2XML(correlationSet);
	}

	@Override
	public Element link2XML(Link link) {
		return super.link2XML(link);
	}

	@Override
	public Element links2XML(Links links) {
		return super.links2XML(links);
	}

	@Override
	public Element extension2XML(Extension extension) {
		return super.extension2XML(extension);
	}

	@Override
	public Element extensions2XML(Extensions extensions) {
		return super.extensions2XML(extensions);
	}

	@Override
	public Element terminationHandler2XML(
			TerminationHandler terminationHandler) {
		return super.terminationHandler2XML(terminationHandler);
	}

	@Override
	public Element source2XML(Source source) {
		return super.source2XML(source);
	}

	@Override
	public Element sources2XML(Sources sources) {
		return super.sources2XML(sources);
	}

	@Override
	public Element target2XML(Target target) {
		return super.target2XML(target);
	}

	@Override
	public Element targets2XML(Targets targets) {
		return super.targets2XML(targets);
	}

	@Override
	public Element serviceRef2XML(ServiceRef serviceRef) {
		return super.serviceRef2XML(serviceRef);
	}

	@Override
	public Node serviceRefValue2XML(ServiceRef serviceRef) {
		return super.serviceRefValue2XML(serviceRef);
	}
	
	@Override
	public Element documentation2XML(Documentation documentation) {
		return super.documentation2XML(documentation);
	}
	

}
