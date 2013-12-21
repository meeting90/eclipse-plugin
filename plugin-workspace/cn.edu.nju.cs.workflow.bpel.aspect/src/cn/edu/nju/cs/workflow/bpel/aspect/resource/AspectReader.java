package cn.edu.nju.cs.workflow.bpel.aspect.resource;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


import javax.xml.parsers.DocumentBuilder;

import org.apache.xerces.parsers.DOMParser;
import org.eclipse.bpel.model.BPELPlugin;
import org.eclipse.bpel.model.resource.BPELReader;
import org.eclipse.bpel.model.resource.LineCapturingDOMParser;
import org.eclipse.bpel.model.resource.SAXParseDiagnostic;
import org.eclipse.bpel.model.util.BPELUtils;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.SAXParseException;

import cn.edu.nju.cs.workflow.model.aspect.Advice;
import cn.edu.nju.cs.workflow.model.aspect.Aspect;
import cn.edu.nju.cs.workflow.model.aspect.AspectFactory;
import cn.edu.nju.cs.workflow.model.aspect.Pointcut;
import cn.edu.nju.cs.workflow.model.aspect.Pointcuts;
import cn.edu.nju.cs.workflow.model.aspect.util.AspectReconciliationHelper;
import cn.edu.nju.cs.workflow.model.aspect.util.AspectUtils;


public class AspectReader extends BPELReader{
	private Aspect aspect=null;
	private Resource fCurrentResource=null;
	private Resource fResource=null;
	private DocumentBuilder docBuilder=null;
	private DOMParser fDOMParser;
	ErrorHandler fErrorHandler = null;
	public AspectReader(DocumentBuilder builder) throws IOException {
		if (builder == null) {
			throw new IOException(BPELPlugin.INSTANCE.getString("%BPELReader.missing_doc_builder"));
		}
		this.docBuilder = builder;
	}
	public AspectReader(DOMParser parser){
		this.fDOMParser=parser;
	}
	public AspectReader(){
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
	private void armErrorHandler2 ( ) {
		
		assert (docBuilder  != null || fDOMParser != null);
		
		if (docBuilder != null) {
			docBuilder.setErrorHandler(fErrorHandler != null ? fErrorHandler : this);
		} else {
			fDOMParser.setErrorHandler(fErrorHandler != null ? fErrorHandler : this);
		}	
	}

	
	private Document read2 ( InputSource inputSource ) throws IOException, SAXException {	
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
		armErrorHandler2 ();
		
		Document doc = null;
		try {
			InputSource inputSource = new InputSource(inputStream);
			inputSource.setPublicId( resource.getURI().toString() );
			inputSource.setSystemId( resource.getURI().toString() );
			
			resource.setErrorHandler(fErrorHandler != null ? fErrorHandler : this);
			
			fCurrentResource = resource;
			doc = read2 ( inputSource );
	
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
	@Override
	public void setErrorHandler(ErrorHandler errorHandler) {
		// TODO Auto-generated method stub
		fErrorHandler=errorHandler;
	}
	@Override
	public Resource getResource() {
		// TODO Auto-generated method stub
		return fResource;
	}
	
	
	@Override
	protected void pass1(Document document) {
		// TODO Auto-generated method stub
		Aspect p = xml2AspectResource(document);
		if (p != null) {
			getResource().getContents().add((EObject) p);
		}
	}
	protected Aspect xml2AspectResource(Document document) {
		Element aspectElement = (document != null)? document.getDocumentElement(): null;
		if (aspectElement == null) {
			return null;
		}
		return xml2Aspect(aspectElement);
	}
	protected Aspect xml2Aspect(Element aspectElement) {
		// TODO Auto-generated method stub
		if(!aspectElement.getLocalName().equals("aspect"))
			return null;
		aspect=AspectFactory.eINSTANCE.createAspect();
		aspect.setElement(aspectElement);
		
		if(aspectElement.hasAttribute("name")){
			aspect.setName(aspectElement.getAttribute("name"));
		}else{
			aspect.setName(null);
		}
		if(aspectElement.hasAttribute("targetNamespace")){
			aspect.setTargetnamespace(aspectElement.getAttribute("targetNamespace"));
		}else{
			aspect.setTargetnamespace(null);
		}
		if(aspectElement.hasAttribute("expressionLanguage")){
			aspect.setExpressionLanguage(aspectElement.getAttribute("expressionLanguage"));
		}else{
			aspect.setExpressionLanguage("null");
		}
		Element pointcutsElement=AspectReconciliationHelper.getAspectChildElementByLocalName(aspectElement, "pointcuts");
		if(pointcutsElement!=null ) {
			aspect.setPointcuts(xml2Pointcuts( pointcutsElement));
		}
		Element adviceElement=AspectReconciliationHelper.getAspectChildElementByLocalName(aspectElement, "advice");
		if(adviceElement!=null) {
			aspect.setAdvice(xml2Advice(adviceElement));
		}
		xml2ExtensibleElement(aspect, aspectElement);
		return aspect;
		
	}
	
	protected Pointcut xml2Pointcut( Element pointcutElement) {
		if (!pointcutElement.getLocalName().equals("pointcut"))
			return null;
		
		
		Pointcut	pointcut = AspectFactory.eINSTANCE.createPointcut();
		pointcut.setElement(pointcutElement);
		
		
		if(pointcutElement.hasAttribute("name")){
			pointcut.setName(pointcutElement.getAttribute("name"));
		}
		
		if(pointcutElement.hasAttribute("language")){
			pointcut.setLanguage(pointcutElement.getAttribute("language"));
		}
		Element startpointElement = getAspectChildElementByLocalName(pointcutElement, "startpoint");
		if (startpointElement != null ) {
			pointcut.setStartpoint((xml2Expression(startpointElement, pointcut.getStartpoint())));
		}
		Element endpointElement = getAspectChildElementByLocalName(pointcutElement, "endpoint");
		if (startpointElement != null ) {
			pointcut.setEndpoint((xml2Expression(endpointElement, pointcut.getEndpoint())));
		} 
		Element pointElement = getAspectChildElementByLocalName(pointcutElement, "point");
		if (pointElement != null) {
			pointcut.setPoint((xml2Expression(pointElement, pointcut.getPoint())));
		} 
		xml2ExtensibleElement(pointcut, pointcutElement);
		return pointcut;
	}

	protected Pointcuts xml2Pointcuts(Element pointcutsElement) {
		if(!pointcutsElement.getLastChild().equals("pointcuts"))
			return null;
		
		Pointcuts pointcuts=AspectFactory.eINSTANCE.createPointcuts();
		pointcuts.setElement(pointcutsElement);
		
		for(Element e: getAspectChildElementsByLocalName(pointcutsElement, "pointcut")){
			pointcuts.getChildren().add(xml2Pointcut(e));
		}
		xml2ExtensibleElement(pointcuts, pointcutsElement);
		
		
		return pointcuts;
		
	}
	protected Advice xml2Advice(Element adviceElement) {
		if (!adviceElement.getLocalName().equals("advice")) {
			return null;
		}
		
		Advice	advice=AspectFactory.eINSTANCE.createAdvice();
		advice.setElement(adviceElement);
		
		if(adviceElement.hasAttribute("name")){
			advice.setName(adviceElement.getAttribute("name"));
		}else{
			advice.setName(null);
		}
		if(adviceElement.hasAttribute("type")){
			advice.setType(adviceElement.getAttribute("type"));
		}else{
			advice.setType(null);
		}
		if(adviceElement.hasAttribute("targetNamepace")){
			advice.setTargetNamespace(adviceElement.getAttribute("targetNamespace"));
		}else{
			advice.setTargetNamespace(null);
		}
		if (adviceElement.hasAttribute("suppressJoinFailure")) {
			advice.setSuppressJoinFailure(BPELUtils.xml2boolean(adviceElement
					.getAttribute("suppressJoinFailure")));
		} else {
			advice.unsetSuppressJoinFailure();
		}

		if (adviceElement.hasAttribute("exitOnStandardFault")) {
			advice.setExitOnStandardFault(BPELUtils.xml2boolean(adviceElement
					.getAttribute("exitOnStandardFault")));
		} else {
			advice.setExitOnStandardFault(false);
		}
		if (adviceElement.hasAttribute("variableAccessSerializable")) {
			advice.setVariableAccessSerializable(BPELUtils
					.xml2boolean(adviceElement
							.getAttribute("variableAccessSerializable")));
		} else {
			advice.unsetVariableAccessSerializable();
		}
		if (adviceElement.hasAttribute("queryLanguage")) {
			advice.setQueryLanguage(adviceElement
					.getAttribute("queryLanguage"));
		} else {
			advice.unsetQueryLanguage();
		}

		if (adviceElement.hasAttribute("expressionLanguage")) {
			advice.setExpressionLanguage(adviceElement
					.getAttribute("expressionLanguage"));
		} else {
			advice.unsetExpressionLanguage();
		}

		if (adviceElement.hasAttribute("abstractadviceProfile")) {
			advice.setAbstractProcessProfile(adviceElement
					.getAttribute("abstractadviceProfile"));
		} else {
			advice.unsetAbstractProcessProfile();
		}
		// Handle Import Elements
		for(Element e: getBPELChildElementsByLocalName(adviceElement, "import")){
			advice.getImports().add(xml2Import(e));
		}

		// Handle PartnerLinks Element
		Element partnerLinksElement = getBPELChildElementByLocalName(adviceElement, "partnerLinks");
		if (partnerLinksElement != null) {
			advice.setPartnerLinks(xml2PartnerLinks(partnerLinksElement));
		} 

		// Handle Variables Element
		Element variablesElement = getBPELChildElementByLocalName(adviceElement, "variables");
		if (variablesElement != null) {
			advice.setVariables(xml2Variables(variablesElement));
			
		}

		// Handle CorrelationSets Element
		Element correlationSetsElement = getBPELChildElementByLocalName(adviceElement,
						"correlationSets");
		if (correlationSetsElement != null) {
			advice.setCorrelationSets(xml2CorrelationSets( correlationSetsElement));
		} 

		// Handle MessageExchanges Element
		Element messageExchangesElements = getBPELChildElementByLocalName(adviceElement,
						"messageExchanges");
		
		if (messageExchangesElements != null) {
			advice.setMessageExchanges(xml2MessageExchanges(messageExchangesElements));
		} 

		// Handle Extensions Element
		Element extensionsElement =getBPELChildElementByLocalName(adviceElement, "extensions");
		if (extensionsElement != null) {
			advice.setExtensions(xml2Extensions(extensionsElement));
		} 


		setFaultHandler(adviceElement, advice);

		setEventHandler(adviceElement, advice);

		advice.setActivity(xml2Activity(adviceElement));

		xml2ExtensibleElement(advice, adviceElement);

		return advice;
	}

	
	public static List<Element> getAspectChildElementsByLocalName(
			Element parentElement, String localName) {
		List<Element> list = new ArrayList<Element>();
		NodeList children = parentElement.getChildNodes();
		for (int i = 0; i < children.getLength(); i++) {
			Node node = children.item(i);
			if (localName.equals(node.getLocalName())
					&& AspectUtils.isAspectElement(node)) {
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
	
	@Override
	public void error(SAXParseException exception) {
		// TODO Auto-generated method stub
		String message = java.text.MessageFormat.format(
				"Error in {0} [{2}:{3}] {4}",				
				exception.getPublicId(),
				exception.getSystemId(),
				exception.getLineNumber(), 
				exception.getColumnNumber(),
				exception.getLocalizedMessage()
		);			
		BPELPlugin.logMessage(message, exception, IStatus.ERROR);		

		
		// Bugzilla 324165
		// add the error to resource
		if (fCurrentResource!=null)
			fCurrentResource.getErrors().add(new MySAXParseDiagnostic(exception, SAXParseDiagnostic.ERROR));
	}
	@Override
	public void warning(SAXParseException exception) {
		// TODO Auto-generated method stub
		String message = java.text.MessageFormat.format(
				"Error in {0} [{2}:{3}] {4}",				
				exception.getPublicId(),
				exception.getSystemId(),
				exception.getLineNumber(), 
				exception.getColumnNumber(),
				exception.getLocalizedMessage()
		);			
		BPELPlugin.logMessage(message, exception, IStatus.WARNING);		

		
		// Bugzilla 324165
		// add the error to resource
		if (fCurrentResource!=null)
			fCurrentResource.getErrors().add(new MySAXParseDiagnostic(exception, SAXParseDiagnostic.WARNING));
	}
	@Override
	public void fatalError(SAXParseException exception) {
		// TODO Auto-generated method stub
		String message = java.text.MessageFormat.format(
				"Error in {0} [{2}:{3}] {4}",				
				exception.getPublicId(),
				exception.getSystemId(),
				exception.getLineNumber(), 
				exception.getColumnNumber(),
				exception.getLocalizedMessage()
		);			
		BPELPlugin.logMessage(message, exception, IStatus.ERROR);		

	
		if (fCurrentResource!=null)
			fCurrentResource.getErrors().add(new MySAXParseDiagnostic(exception, SAXParseDiagnostic.FATAL_ERROR));
	}
	
}
