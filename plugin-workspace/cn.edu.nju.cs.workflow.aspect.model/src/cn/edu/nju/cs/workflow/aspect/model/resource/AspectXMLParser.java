package cn.edu.nju.cs.workflow.aspect.model.resource;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;

import org.apache.xerces.parsers.DOMParser;
import org.eclipse.bpel.model.Activity;
import org.eclipse.bpel.model.BPELFactory;
import org.eclipse.bpel.model.BPELPlugin;
import org.eclipse.bpel.model.Sequence;
import org.eclipse.bpel.model.resource.BPELReader;
import org.eclipse.bpel.model.resource.LineCapturingDOMParser;
import org.eclipse.bpel.model.util.BPELConstants;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;

import cn.edu.nju.cs.workflow.aspect.model.Advice;
import cn.edu.nju.cs.workflow.aspect.model.Aspect;
import cn.edu.nju.cs.workflow.aspect.model.AspectFactory;
import cn.edu.nju.cs.workflow.aspect.model.Aspects;
import cn.edu.nju.cs.workflow.aspect.model.Transition;
import cn.edu.nju.cs.workflow.aspect.model.Transitions;





public class AspectXMLParser extends BPELReader{
	private Aspects aspects=null;
	private Resource fCurrentResource=null;
	private Resource fResource=null;
	private DocumentBuilder docBuilder=null;
	private DOMParser fDOMParser;
	
	
	public AspectXMLParser(DocumentBuilder builder) throws IOException {
		if (builder == null) {
			throw new IOException(BPELPlugin.INSTANCE.getString("%BPELReader.missing_doc_builder"));
		}
		this.docBuilder = builder;
	}
	public AspectXMLParser(DOMParser parser){
		this.fDOMParser=parser;
	}
	public AspectXMLParser(){
		this.fDOMParser = new LineCapturingDOMParser();
		
		// domParser.setProperty("http://xml.org/sax/features/namespaces",true);
		try {
			fDOMParser.setFeature( "http://apache.org/xml/features/dom/defer-node-expansion", false );
			fDOMParser.setFeature( "http://apache.org/xml/features/xinclude", false);
		} catch (SAXNotRecognizedException e) { 
			BPELPlugin.log("Not Recognized DOM Parser Feature",e );
		} catch (SAXNotSupportedException e) {		
			BPELPlugin.log("Not Supported DOM Parser Feature",e );
		}				
	}


	
	private Document read ( InputSource inputSource ) throws IOException, SAXException {	
		assert (docBuilder  != null || fDOMParser != null) : "No document builder/parser set";

		if (docBuilder != null) {
			return docBuilder.parse(inputSource);
		} 		
		fDOMParser.parse(inputSource);
		return fDOMParser.getDocument();
	}
	
	public void read(AspectResource resource, Document doc) {
		// TODO Auto-generated method stub
		this.fResource=resource;
		pass1(doc);
		pass2();
	}
	
	public void read(AspectResource resource, InputStream inputStream) {
		// TODO Auto-generated method stub
		
		
		Document doc = null;
		try {
			InputSource inputSource = new InputSource(inputStream);
			inputSource.setPublicId( resource.getURI().toString() );
			inputSource.setSystemId( resource.getURI().toString() );
			fCurrentResource = resource;
			doc = read ( inputSource );
	
			fResource = resource;
		} catch (SAXException sax) {
				
		} catch (IOException ioe) {
			BPELPlugin.log("I/O Error Reading BPEL XML", ioe ) ;
		} finally {
			
		}

		
		if (doc != null) {
			pass1(doc);		
			pass2();
		}
		fCurrentResource = null;
	}

	
	public Resource getResource() {
		// TODO Auto-generated method stub
		return fResource;
	}
	
	

	protected void pass1(Document document) {
		// TODO Auto-generated method stub
		Aspects aspects= xml2AspectsResource(document);
		if (aspects != null) {
			getResource().getContents().add((EObject) aspects);
		}
	}
	protected Aspects xml2AspectsResource(Document document) {
		Element aspectsElement = (document != null)? document.getDocumentElement(): null;
		if (aspectsElement == null) {
			return null;
		}
		return xml2Aspects(aspectsElement);
	}
	
	protected Aspects xml2Aspects(Element aspectsElement) {
		if(!aspectsElement.getLocalName().equals("aspects"))
			return null;
		aspects=AspectFactory.eINSTANCE.createAspects();
		aspects.setElement(aspectsElement);
		if(aspectsElement.hasAttribute("name")){
			aspects.setName(aspectsElement.getAttribute("name"));
		}else{
			aspects.setName(null);
		}
		if(aspectsElement.hasAttribute("targetNamespace")){
			aspects.setTargetnamespace(aspectsElement.getAttribute("targetNamespace"));
		}else{
			aspects.setTargetnamespace(null);
		}
		for(Element child:getAspectChildElementsByLocalName(aspectsElement,"aspect") ){
			aspects.getChildren().add(xml2Aspect(child));
		}
		xml2ExtensibleElement(aspects, aspectsElement);
		return aspects;
		
	}
	protected Aspect xml2Aspect(Element aspectElement) {
		// TODO Auto-generated method stub
		if(!aspectElement.getLocalName().equals("aspect"))
			return null;
		
		Aspect aspect=AspectFactory.eINSTANCE.createAspect();
		aspect.setElement(aspectElement);
		
		if(aspectElement.hasAttribute("name")){
			
			aspect.setName(aspectElement.getAttribute("name"));
		}else{
			aspect.setName(null);
		}
		
		Element transitionsElement=getAspectChildElementByLocalName(aspectElement, "transitions");
		if(transitionsElement!=null){
			aspect.setTransitions(xml2transitions(transitionsElement));
			
		}
		Element joinTransitionsElement=getAspectChildElementByLocalName(aspectElement, "joinTransitions");
		if(joinTransitionsElement!=null){
			aspect.setJoinTransitions(xml2joinTransitions(joinTransitionsElement));
		}
		
		Element adviceElement=getAspectChildElementByLocalName(aspectElement, "advice");
		if(adviceElement!=null){
			aspect.setAdvice(xml2Advice(adviceElement));
		}

		xml2ExtensibleElement(aspect, aspectElement);
		return aspect;
		
	}
	protected Transitions xml2joinTransitions(Element jtse) {
		if(!jtse.getLocalName().equals("joinTransitions"))
			return null;
		Transitions jts=AspectFactory.eINSTANCE.createTransitions();
		jts.setElement(jtse);
		if(jtse.hasAttribute("name"))
			jts.setName(jtse.getAttribute("name"));
		else
			jts.setName(null);
		for(Element e: getAspectChildElementsByLocalName(jtse, "transition")){
			jts.getChildren().add(xml2transition(e));
		}
		xml2ExtensibleElement(jts, jtse);
		return jts;
	}
	
	protected Transitions xml2transitions(Element tse) {
		if(!tse.getLocalName().equals("transitions"))
			return null;
		Transitions ts=AspectFactory.eINSTANCE.createTransitions();
		ts.setElement(tse);
		if(tse.hasAttribute("name"))
			ts.setName(tse.getAttribute("name"));
		else
			ts.setName(null);
		for(Element e: getAspectChildElementsByLocalName(tse, "transition")){
			ts.getChildren().add(xml2transition(e));
		}
		xml2ExtensibleElement(ts, tse);
		return ts;
	}
	private Transition xml2transition(Element te) {
		// TODO Auto-generated method stub
		if(!te.getLocalName().equals("transition"))
			return null;
		Transition t=AspectFactory.eINSTANCE.createTransition();
		t.setElement(te);
		if(te.hasAttribute("name"))
			t.setName(te.getAttribute("name"));
		else
			t.setElement(null);
		
		if(te.hasAttribute("type"))
			t.setType(te.getAttribute("type"));
		
		if(te.hasAttribute("pointName"));
			t.setPointName(te.getAttribute("pointName"));
			
		xml2ExtensibleElement(t, te);
		return t;
	}

	protected Advice xml2Advice(Element adviceElement) {
		if (!adviceElement.getLocalName().equals("advice")) {
			return null;
		}
		
		Advice	advice=AspectFactory.eINSTANCE.createAdvice();
		advice.setElement(adviceElement);
		if (!BPELConstants.isBPELNamespace(adviceElement.getNamespaceURI())) {
			return null;
		}
		
		// Save all the references to external namespaces		
		saveNamespacePrefix(advice, adviceElement);
		
		// Handle advice element
		if (adviceElement.hasAttribute("name")) 
			advice.setName(adviceElement.getAttribute("name"));
		
		if (adviceElement.hasAttribute("targetNamespace"))	
			advice.setTargetNamespace(adviceElement.getAttribute("targetNamespace"));
		
		if (adviceElement.hasAttribute("suppressJoinFailure"))
			advice.setSuppressJoinFailure( Boolean.valueOf( adviceElement.getAttribute("suppressJoinFailure").equals("yes")));
		
		if (adviceElement.hasAttribute("exitOnStandardFault"))
			advice.setExitOnStandardFault( Boolean.valueOf( adviceElement.getAttribute("exitOnStandardFault").equals("yes")));
		
		if (adviceElement.hasAttribute("variableAccessSerializable"))
			advice.setVariableAccessSerializable( Boolean.valueOf( adviceElement.getAttribute("variableAccessSerializable").equals("yes")));

		if (adviceElement.hasAttribute("queryLanguage"))
			advice.setQueryLanguage(adviceElement.getAttribute("queryLanguage"));

		if (adviceElement.hasAttribute("expressionLanguage"))
			advice.setExpressionLanguage(adviceElement.getAttribute("expressionLanguage"));
			
		// Handle Import Elements
		for(Element e : getBPELChildElementsByLocalName(adviceElement, "import")) {
			advice.getImports().add(xml2Import(e));
		}
		
		// Handle PartnerLinks Element
		Element partnerLinksElement = getBPELChildElementByLocalName(adviceElement, "partnerLinks");
		if (partnerLinksElement != null)
			advice.setPartnerLinks(xml2PartnerLinks(partnerLinksElement));
			
		// Handle Variables Element
		Element variablesElement = getBPELChildElementByLocalName(adviceElement, "variables");
		if (variablesElement != null)
			advice.setVariables(xml2Variables(variablesElement));
			
		// Handle CorrelationSets Element
		Element correlationSetsElement = getBPELChildElementByLocalName(adviceElement, "correlationSets");
		if (correlationSetsElement != null)
			advice.setCorrelationSets(xml2CorrelationSets(correlationSetsElement));
			 
		// Handle MessageExchanges Element
		Element messageExchangesElements = getBPELChildElementByLocalName(adviceElement, "messageExchanges");
		if (messageExchangesElements != null)
			advice.setMessageExchanges(xml2MessageExchanges(messageExchangesElements));
		
		// Handle Extensions Element
		Element extensionsElement = getBPELChildElementByLocalName(adviceElement, "extensions");
		if (extensionsElement != null)
			advice.setExtensions(xml2Extensions(extensionsElement));

		// Handle FaultHandler element
		setFaultHandler(adviceElement, advice);
		
		// Handle EventHandler element
		setEventHandler(adviceElement, advice);
		
 		// Handle Activity elements
        Activity activity = xml2Activity(adviceElement); 
        advice.setActivity(activity); 

		xml2ExtensibleElement(advice,adviceElement);
		return advice;
	}
	
	
	public static List<Element> getAspectChildElementsByLocalName(
			Element parentElement, String localName) {
		List<Element> list = new ArrayList<Element>();
		NodeList children = parentElement.getChildNodes();
		for (int i = 0; i < children.getLength(); i++) {
			Node node = children.item(i);
			if (localName.equals(node.getLocalName())//is Aspect Node
					) {
				list.add((Element) node);
			}
		}
		return list;
	}
	public static Element getAspectChildElementByLocalName(Element parentElement,
			String localName) {
		if (parentElement == null) {
			return null;
		}
		NodeList children = parentElement.getChildNodes();
		for (int i = 0; i < children.getLength(); i++) {
			Node node = children.item(i);
			if (localName.equals(node.getLocalName())) {
				return (Element) node;
			}
		}
		return null;
	}
	
	
	

	
	
}
