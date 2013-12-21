package cn.edu.nju.cs.workflow.model.aspect.util;

import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

import javax.wsdl.extensions.ExtensibilityElement;
import javax.xml.namespace.QName;


import org.eclipse.bpel.model.Activity;
import org.eclipse.bpel.model.BPELExtensibleElement;
import org.eclipse.bpel.model.Branches;
import org.eclipse.bpel.model.Catch;
import org.eclipse.bpel.model.CatchAll;
import org.eclipse.bpel.model.CompensationHandler;
import org.eclipse.bpel.model.CompletionCondition;
import org.eclipse.bpel.model.Condition;
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
import org.eclipse.bpel.model.util.BPELConstants;
import org.eclipse.bpel.model.util.BPELUtils;




import org.eclipse.emf.ecore.EObject;
import org.eclipse.wst.wsdl.WSDLElement;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import cn.edu.nju.cs.workflow.bpel.aspect.resource.AspectResource;
import cn.edu.nju.cs.workflow.bpel.aspect.resource.AspectWriter;
import cn.edu.nju.cs.workflow.model.aspect.Advice;
import cn.edu.nju.cs.workflow.model.aspect.Aspect;
import cn.edu.nju.cs.workflow.model.aspect.Pointcut;
import cn.edu.nju.cs.workflow.model.aspect.Pointcuts;

public class AspectElementFactory {
	private WeakHashMap<Document, WeakReference<MyAspectWriter>> document2Writers = new WeakHashMap<Document, WeakReference<MyAspectWriter>>();
	static class MyAspectWriter extends AspectWriter{
		public MyAspectWriter(AspectResource resource, Document document){
			super(resource,document);
		}

		
	}
	private static AspectElementFactory factory;
	private AspectElementFactory(){
		super();
	}
	public static AspectElementFactory getInstance(){
		if(factory==null){
			factory=new AspectElementFactory();
		}
		return factory;
	}
	
	public Element createElement(WSDLElement element, Object parent){
		MyAspectWriter writer=getWriter(parent);
		if(element instanceof Aspect){
			return writer.aspect2XML((Aspect)element);
		}
		if(element instanceof Pointcut){
			return writer.pointcut2XML((Pointcut)element);
		}
		if(element instanceof Pointcuts){
			return writer.pointcuts2XML((Pointcuts)element);
		}
		if(element instanceof Advice){
			return writer.Advice2XML((Advice)element);
		}
		
		if(element instanceof Activity){
			return writer.activity2XML((Activity)element);
		}
		if(element instanceof Variable){
			return writer.variable2XML((Variable)element);
		} 
		if(element instanceof Variables){
			return writer.variables2XML((Variables)element);
		}
		if (element instanceof CompletionCondition) {
			return writer
					.completionCondition2XML((CompletionCondition) element);
		}
		if (element instanceof PartnerLinks) {
			return writer.partnerLinks2XML((PartnerLinks) element);
		}
		if (element instanceof MessageExchanges) {
			return writer.messageExchanges2XML((MessageExchanges) element);
		}
		if (element instanceof CorrelationSets) {
			return writer.correlationSets2XML((CorrelationSets) element);
		}
		if (element instanceof ElseIf) {
			return writer.elseIf2XML((ElseIf) element);
		}
		if (element instanceof Else) {
			return writer.else2XML((Else) element);
		}
		if (element instanceof OnAlarm) {
			return writer.onAlarm2XML((OnAlarm) element);
		}
		if (element instanceof OnMessage) {
			return writer.onMessage2XML((OnMessage) element);
		}
		if (element instanceof OnEvent) {
			return writer.onEvent2XML((OnEvent) element);
		}
		if (element instanceof Copy) {
			return writer.copy2XML((Copy) element);
		}
		if (element instanceof Catch) {
			return writer.catch2XML((Catch) element);
		}
		if (element instanceof CatchAll) {
			return writer.catchAll2XML((CatchAll) element);
		}
		if (element instanceof CompensationHandler) {
			return writer
					.compensationHandler2XML((CompensationHandler) element);
		}
		if (element instanceof TerminationHandler) {
			return writer.terminationHandler2XML((TerminationHandler) element);
		}
		if (element instanceof To) {
			Element toElement = writer.createBPELElement("to");
			writer.to2XML((To) element, toElement);
			return toElement;
		}
		if (element instanceof From) {
			Element fromElement = writer.createBPELElement("from");
			writer.from2XML((From) element, fromElement);
			return fromElement;
		}
		if (element instanceof CorrelationSet) {
			return writer.correlationSet2XML((CorrelationSet) element);
		}
		if (element instanceof EventHandler) {
			return writer.eventHandler2XML((EventHandler) element);
		}
		if (element instanceof Branches) {
			Element branches = writer.branches2XML((Branches) element);
			branches.setAttribute(BPELConstants.AT_SUCCESSFUL_BRANCHES_ONLY,
					BPELUtils.boolean2XML(((Branches) element)
							.getCountCompletedBranchesOnly()));
			return branches;
		}
		if (element instanceof Condition) {
			return writer.expression2XML((Condition) element,
					BPELConstants.ND_CONDITION);
		}
		if (element instanceof PartnerLink) {
			return writer.partnerLink2XML((PartnerLink) element);
		}
		if (element instanceof MessageExchange) {
			return writer.messageExchange2XML((MessageExchange) element);
		}
		if (element instanceof Validate) {
			return writer.validate2XML((Validate) element);
		}
		if (element instanceof Query) {
			return writer.query2XML((Query) element);
		}
		if (element instanceof FaultHandler) {
			return writer.faultHandlers2XML((FaultHandler) element);
		}
		if (element instanceof FromParts) {
			return writer.fromParts2XML((FromParts) element);
		}
		if (element instanceof ToParts) {
			return writer.toParts2XML((ToParts) element);
		}
		if (element instanceof FromPart) {
			return writer.fromPart2XML((FromPart) element);
		}
		if (element instanceof ToPart) {
			return writer.toPart2XML((ToPart) element);
		}
		if (element instanceof Import) {
			return writer.import2XML((Import) element);
		}
		if (element instanceof Correlation) {
			return writer.correlation2XML((Correlation) element);
		}
		if (element instanceof Correlations) {
			return writer.correlations2XML((Correlations) element);
		}
		if (element instanceof Link) {
			return writer.link2XML((Link) element);
		}
		if (element instanceof Links) {
			return writer.links2XML((Links) element);
		}
		if (element instanceof Extension) {
			return writer.extension2XML((Extension) element);
		}
		if (element instanceof Extensions) {
			return writer.extensions2XML((Extensions) element);
		}
		if (element instanceof Source) {
			return writer.source2XML((Source) element);
		}
		if (element instanceof Sources) {
			return writer.sources2XML((Sources) element);
		}
		if (element instanceof Target) {
			return writer.target2XML((Target) element);
		}
		if (element instanceof Targets) {
			return writer.targets2XML((Targets) element);
		}
		if (element instanceof ServiceRef) {
			return writer.serviceRef2XML((ServiceRef) element);
		}
		if (element instanceof ExtensibilityElement) {
			return writer
					.extensibilityElement2XML((ExtensibilityElement) element);
		}
		if (element instanceof Documentation) {
			return writer.documentation2XML((Documentation) element);
		}
		throw new IllegalArgumentException("Cannot create element for type: " + element.getClass().getName());
			
	
		
	}
	public Node createLiteral(From from, String text) {
		MyAspectWriter writer = getWriter(from);
		Node node = null;
		Element literal = writer.createBPELElement("literal"); //$NON-NLS-1$
		literal.setAttribute("xml:space", "preserve"); //$NON-NLS-1$ //$NON-NLS-2$

		if (Boolean.TRUE.equals(from.getUnsafeLiteral())) {
			node = BPELUtils.convertStringToNode(from, text, writer
					.getResource());
		}

		if (node != null) {
			for (Node child = node.getFirstChild(); child != null; child = child
					.getNextSibling()) {
				// TODO: (DU) This is here due to
				// https://issues.apache.org/jira/browse/XERCESJ-1289
				BPELUtils.copyInto(child, literal);
			}
		} else {
			CDATASection cdata = BPELUtils.createCDATASection(from.getElement()
					.getOwnerDocument(), text);
			BPELUtils.copyInto(cdata, literal);
		}

		return literal;
	}
	public String createPropertiesString(CorrelationSet correlationSet) {
		return getWriter(correlationSet).properties2XML(correlationSet);
	}
	public Element createExpressionElement(Expression element, Object parent,
			String name) {
		MyAspectWriter writer = getWriter(parent);
		return writer.expression2XML(element, name);
	}

	public String createName(WSDLElement element, QName name) {
		String namespace = name.getNamespaceURI();
		String prefix = BPELUtils.getNamespacePrefix(element, namespace);
		String localPart = name.getLocalPart();
		
		if (localPart == "") {
			return null;
		}
		
		if (prefix != null) {
			return prefix + ":" + localPart;
		} else {
			return localPart;
		}
	}	

	private MyAspectWriter getWriter(Object parent) {
		Document ownerDocument = getOwnerDocument(parent);
		MyAspectWriter writer = document2Writers.get(ownerDocument) != null ? document2Writers.get(ownerDocument).get() : null;
		if (writer == null) {
			AspectResource resource = (AspectResource) ((EObject) parent)
					.eResource();
			INamespaceMap<String, String> nsMap = AspectUtils
					.getNamespaceMap(resource.getAspect());
			if (resource.getOptionUseNSPrefix()) {
				nsMap.remove("");
				if (!nsMap.containsValue(resource.getNamespaceURI())) {
					nsMap.put(AspectConstants.PREFIX, resource.getNamespaceURI());
				}
			} else {
				nsMap.put("", resource.getNamespaceURI());
			}
			writer = new MyAspectWriter(resource, ownerDocument);
			document2Writers.put(ownerDocument, new WeakReference<MyAspectWriter>(writer));
		}
		return writer;
	}
	private static Document getOwnerDocument(Object parent) {
		Document ownerDocument = null;
		
		if (((BPELExtensibleElement) parent).getElement() != null)
			ownerDocument = ((BPELExtensibleElement) parent).getElement()
					.getOwnerDocument();
		
		return ownerDocument;
	}
	void writeFaultHandler(FaultHandler faultHandler, WSDLElement parent) {
		getWriter(parent).faultHandler2XML(parent.getElement(), faultHandler);
	}

	public Node createValue(ServiceRef serviceRef) {
		return getWriter(serviceRef).serviceRefValue2XML(serviceRef);
	}
}
