package cn.edu.nju.cs.workflow.model.aspect.util;


import java.util.List;


import org.eclipse.bpel.model.util.BPELUtils;
import org.eclipse.bpel.model.util.ReconciliationBPELReader;
import org.eclipse.bpel.model.util.ReconciliationHelper;


import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.wst.wsdl.WSDLElement;


import org.w3c.dom.Document;
import org.w3c.dom.Element;

import cn.edu.nju.cs.workflow.model.aspect.Advice;
import cn.edu.nju.cs.workflow.model.aspect.Aspect;
import cn.edu.nju.cs.workflow.model.aspect.AspectFactory;
import cn.edu.nju.cs.workflow.model.aspect.Pointcut;
import cn.edu.nju.cs.workflow.model.aspect.Pointcuts;

public class AspectReconciliationReader extends ReconciliationBPELReader{
    private Aspect aspect;
    private Resource fResource=null;
	public AspectReconciliationReader(Aspect aspect) {
		this.aspect=aspect;
		this.fResource=aspect.eResource();
		
	}
	public Resource getResource() {
		return fResource;
	}
	
	
	protected Pointcut xml2Pointcut(Pointcut pointcut, Element pointcutElement) {
		if (!pointcutElement.getLocalName().equals("pointcut"))
			return null;

		if (pointcut == null) {
			pointcut = AspectFactory.eINSTANCE.createPointcut();
			pointcut.setElement(pointcutElement);
		}
		
		if(pointcutElement.hasAttribute("name")){
			pointcut.setName(pointcutElement.getAttribute("name"));
		}else{
			pointcut.setName(null);
		}
		
		if(pointcutElement.hasAttribute("language")){
			pointcut.setLanguage(pointcutElement.getAttribute("language"));
		}else{
			pointcut.setLanguage(null);
		}
		Element startpointElement = AspectReconciliationHelper
				.getAspectChildElementByLocalName(pointcutElement, "startpoint");
		if (startpointElement != null && pointcut.getStartpoint() == null) {
			pointcut.setStartpoint((xml2Expression(startpointElement, pointcut.getStartpoint())));
		} else if (startpointElement == null) {
			pointcut.setStartpoint(null);
		}
		Element endpointElement = AspectReconciliationHelper
				.getAspectChildElementByLocalName(pointcutElement, "endpoint");
		if (startpointElement != null && pointcut.getEndpoint() == null) {
			pointcut.setEndpoint((xml2Expression(endpointElement, pointcut.getEndpoint())));
		} else if (endpointElement == null) {
			pointcut.setEndpoint(null);
		}
		Element pointElement = AspectReconciliationHelper
				.getAspectChildElementByLocalName(pointcutElement, "point");
		if (pointElement != null && pointcut.getPoint() == null) {
			pointcut.setPoint((xml2Expression(pointElement, pointcut.getPoint())));
		} else if (pointElement == null) {
			pointcut.setPoint(null);
		}
		xml2ExtensibleElement(pointcut, pointcutElement);
		return pointcut;
	}

	protected Pointcuts xml2Pointcuts(Pointcuts pointcuts, Element pointcutsElement) {
		if(!pointcutsElement.getLastChild().equals("pointcuts"))
			return null;
		if(pointcuts==null){
			pointcuts=AspectFactory.eINSTANCE.createPointcuts();
			pointcuts.setElement(pointcutsElement);
		}
		List<Element> childElements=AspectReconciliationHelper.getAspectChildElementsByLocalName(pointcutsElement, "pointcut");
		EList<Pointcut> childrenList=pointcuts.getChildren();
		syncLists(pointcutsElement,childElements,childrenList,new Creator(){
			public WSDLElement create(Element element) {
				return xml2Pointcut(null, element);
			}
		});
		
		xml2ExtensibleElement(pointcuts, pointcutsElement);
		
		return null;
		
	}
	protected Advice xml2Advice(Advice advice, Element adviceElement) {
		if (!adviceElement.getLocalName().equals("advice")) {
			return null;
		}
		if(advice==null){
			advice=AspectFactory.eINSTANCE.createAdvice();
			advice.setElement(adviceElement);
		}
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
		List<Element> childElements = ReconciliationHelper
				.getBPELChildElementsByLocalName(adviceElement, "import");
		syncLists(adviceElement, childElements, advice.getImports(),
				new Creator() {
					public WSDLElement create(Element element) {
						return xml2Import(null,element);
					}

					
				});

		// Handle PartnerLinks Element
		Element partnerLinksElement = ReconciliationHelper
				.getBPELChildElementByLocalName(adviceElement, "partnerLinks");
		if (partnerLinksElement != null
				&& (advice.getPartnerLinks() == null || advice
						.getPartnerLinks().getChildren().size() == 0)) {
			advice.setPartnerLinks(xml2PartnerLinks(advice.getPartnerLinks(),
					partnerLinksElement));
		} else if (partnerLinksElement == null) {
			advice.setPartnerLinks(null);
		}

		// Handle Variables Element
		Element variablesElement = ReconciliationHelper
				.getBPELChildElementByLocalName(adviceElement, "variables");
		if (variablesElement != null) {
			if (advice.getVariables() == null
					|| advice.getVariables().getChildren() == null
					|| advice.getVariables().getChildren().size() == 0) {
				advice.setVariables(xml2Variables(advice.getVariables(),
						variablesElement));
			}
		} else {
			advice.setVariables(null);
		}

		// Handle CorrelationSets Element
		Element correlationSetsElement = ReconciliationHelper
				.getBPELChildElementByLocalName(adviceElement,
						"correlationSets");
		if (correlationSetsElement != null
				&& (advice.getCorrelationSets() == null || advice
						.getCorrelationSets().getChildren() == null)) {
			advice.setCorrelationSets(xml2CorrelationSets(advice
					.getCorrelationSets(), correlationSetsElement));
		} else if (correlationSetsElement == null) {
			advice.setCorrelationSets(null);
		}

		// Handle MessageExchanges Element
		Element messageExchangesElements = ReconciliationHelper
				.getBPELChildElementByLocalName(adviceElement,
						"messageExchanges");
		
		if (messageExchangesElements != null
				&& (advice.getMessageExchanges() == null || advice
						.getMessageExchanges().getChildren() == null
						)) {
			advice.setMessageExchanges(xml2MessageExchanges(advice
					.getMessageExchanges(), messageExchangesElements));
		} else if(messageExchangesElements == null){
			// add if(messageExchangesElements == null) by Grid.Qian
			advice.setMessageExchanges(null);
		}

		// Handle Extensions Element
		Element extensionsElement = ReconciliationHelper
				.getBPELChildElementByLocalName(adviceElement, "extensions");
		if (extensionsElement != null && advice.getExtensions() == null) {
			advice.setExtensions(xml2Extensions(advice.getExtensions(),
					extensionsElement));
		} else if (extensionsElement == null) {
			advice.setExtensions(null);
		}


		setFaultHandler(adviceElement, advice);

		setEventHandler(adviceElement, advice);

		advice.setActivity(xml2Activity(adviceElement));

		xml2ExtensibleElement(advice, adviceElement);

		return advice;
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
		if(aspect==null){
			aspect=AspectFactory.eINSTANCE.createAspect();
			aspect.setElement(aspectElement);
		}
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
		if(pointcutsElement!=null &&(aspect.getPointcuts()==null || aspect.getPointcuts().getChildren().size()==0)) {
			aspect.setPointcuts(xml2Pointcuts(aspect.getPointcuts(), pointcutsElement));
		}else{
			aspect.setPointcuts(null);
		}
		Element adviceElement=AspectReconciliationHelper.getAspectChildElementByLocalName(aspectElement, "advice");
		if(adviceElement!=null && aspect.getAdvice()==null) {
			aspect.setAdvice(xml2Advice(aspect.getAdvice(), adviceElement));
		}else{
			aspect.setAdvice(null);
		}
		xml2ExtensibleElement(aspect, aspectElement);
		return aspect;

	}
	
	
	private interface Creator {
		WSDLElement create(Element element);
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void syncLists(Element ifElement, List<Element> childElements,
			EList childrenList, Creator creator) {
		WSDLElement[] children = (WSDLElement[]) childrenList
				.toArray(new WSDLElement[childrenList.size()]);
		int i, j, insertionIndex = 0;
		for (i = 0, j = 0; i < children.length && j < childElements.size(); i++) {
			WSDLElement elseIf = children[i];
			if (elseIf.getElement() == null
					|| elseIf.getElement().getParentNode() != ifElement) {
				childrenList.remove(insertionIndex);
				continue;
			}
			Element element = childElements.get(j);
			while (elseIf.getElement() != element && j < childElements.size()) {
				childrenList.add(insertionIndex, creator.create(element));
				j++;
				insertionIndex++;
				element = childElements.get(j);
			}
			if (elseIf.getElement() == element) {
				j++;
				insertionIndex++;
			}
		}
		for (int k = i; k < children.length; k++) {
			WSDLElement elseIf = children[k];
			if (elseIf.getElement() == null
					|| elseIf.getElement().getParentNode() != ifElement) {
				childrenList.remove(elseIf);
			}
		}
		for (int k = j; k < childElements.size(); k++) {
			childrenList.add(creator.create(childElements.get(k)));

		}
	}
	

	

}
