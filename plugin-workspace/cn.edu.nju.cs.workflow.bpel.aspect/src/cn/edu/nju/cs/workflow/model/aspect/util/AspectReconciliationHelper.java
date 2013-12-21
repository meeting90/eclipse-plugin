package cn.edu.nju.cs.workflow.model.aspect.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;




import org.eclipse.bpel.model.impl.BPELExtensibilityElementImpl;
import org.eclipse.bpel.model.impl.BPELExtensibleElementImpl;

import org.eclipse.bpel.model.util.ElementPlacer;

import org.eclipse.bpel.model.util.ReconciliationHelper;
import org.eclipse.wst.wsdl.WSDLElement;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import cn.edu.nju.cs.workflow.model.aspect.Advice;
import cn.edu.nju.cs.workflow.model.aspect.Aspect;
import cn.edu.nju.cs.workflow.model.aspect.Pointcut;
import cn.edu.nju.cs.workflow.model.aspect.Pointcuts;
import cn.edu.nju.cs.workflow.model.aspect.impl.PointcutsImpl;

public class AspectReconciliationHelper extends ReconciliationHelper{
	
	private static AspectReconciliationHelper helper;
	private  HashMap<Document,AspectReconciliationReader> document2reader=new HashMap<Document,AspectReconciliationReader>();
	private static HashMap<String,List<String>> mapper=new HashMap<String,List<String>>();
	static{
		String aspectElements[]={AspectConstants.ND_POINTCUTS,AspectConstants.ND_ADVICE};
		mapper.put(AspectConstants.ND_ASPECT, Arrays.asList(aspectElements));
		String pointcutsElements[]={AspectConstants.ND_POINTCUT};
		mapper.put(AspectConstants.ND_POINTCUTS, Arrays.asList(pointcutsElements));
		
	}
	public static AspectReconciliationHelper getIntance(){
		if(helper==null){
			helper=new AspectReconciliationHelper();
		}
		return helper;
	}
	
	public static boolean isLoading(WSDLElement element){
		Aspect aspect =AspectUtils.getAspect(element);
		return aspect==null||aspect.eResource()==null || !aspect.eResource().isLoaded();
	}
	private static boolean isUpdatingDom(WSDLElement element) {
		if (element instanceof BPELExtensibleElementImpl) {
			return ((BPELExtensibleElementImpl) element).isUpdatingDOM();			
		} else if (element instanceof BPELExtensibilityElementImpl) {
			return ((BPELExtensibilityElementImpl) element).isUpdatingDOM();			
		} 
		return false;
	}
	
	private static void setUpdatingDom(WSDLElement element, boolean updatingDOM) {
		if (element instanceof BPELExtensibleElementImpl) {
			((BPELExtensibleElementImpl) element).setUpdatingDOM(updatingDOM);			
		} else if (element instanceof BPELExtensibilityElementImpl) {
			((BPELExtensibilityElementImpl) element).setUpdatingDOM(updatingDOM);			
		} 
	}
	public static void replaceChild(WSDLElement parent, WSDLElement oldElement,
			WSDLElement newElement){
		boolean oldUpdatingDom = isUpdatingDom(parent);
		try {
			setUpdatingDom(parent, true);		
			
			if (isLoading(parent)) {
				return;
			}

			Element parseElement = parent.getElement();

			if (parseElement == null) {
				System.err.println("trying to replace child on null element: "
						+ parent.getClass());
				return;
			}
			if (oldElement == newElement) {
				return;
			}
			if (newElement != null) {
				if (newElement.getElement() == null) {
					Element newDomElement = AspectElementFactory.getInstance()
							.createElement(newElement, parent);
					if (newDomElement == null) {
						return;
					}
					newElement.setElement(newDomElement);
				}
				if (oldElement != null
						&& oldElement.getElement() != null
						&& parseElement == oldElement.getElement()
								.getParentNode()) {
					parseElement.replaceChild(newElement.getElement(),
							oldElement.getElement());
				} else {
					placeChild(parent, newElement.getElement());
				}
			} else if (oldElement != null
					&& oldElement.getElement() != null
					&& parseElement == oldElement.getElement()
							.getParentNode()) {
				ElementPlacer.niceRemoveChild(parent, oldElement.getElement());
			}
		} finally {
			setUpdatingDom(parent, oldUpdatingDom);
		}
		
	}
	
	private static void placeChild(WSDLElement parent, Node child) {
		Element parentElement = parent.getElement();
		
	
		List<String> nodeTypeList = mapper.get(parentElement.getLocalName());
		if (nodeTypeList != null) {
			String nodeName = child.getLocalName();
			String nodeType = findType(nodeName, nodeTypeList);
			if (nodeType != null) {
				Node beforeElement = parentElement.getFirstChild();
				while (beforeElement != null
						&& (!isPreviousType(nodeType, findType(beforeElement
								.getLocalName(), nodeTypeList), nodeTypeList) || beforeElement
								.getNodeType() != Node.ELEMENT_NODE)) {
					beforeElement = beforeElement.getNextSibling();
				}
				while (beforeElement != null
						&& (isType(beforeElement.getLocalName(), nodeType) || beforeElement
								.getNodeType() != Node.ELEMENT_NODE)) {
					beforeElement = beforeElement.getNextSibling();
				}
				ElementPlacer.niceInsertBefore(parent, child, beforeElement);
				return;
			}
		}
		ElementPlacer.niceAppend(parent, child);
		
	}
	private static String findType(String nodeName, List<String> nodeTypeList) {
		for (String nodeType : nodeTypeList) {
			if (isType(nodeName, nodeType)) {
				return nodeType;
			}
		}
		return null;
	}

	private static boolean isPreviousType(String typeName1, String typeName2,
			List<String> nodeTypeList) {
		int type1Index = nodeTypeList.indexOf(typeName1);
		int type2Index = nodeTypeList.indexOf(typeName2);
		return type1Index < type2Index || (type2Index < 0 && type1Index >= 0);
	}

	private static boolean isType(String nodeName, String typeName) {
		return typeName.equals(nodeName);
	}
	
	@Override
	public void reconcile(WSDLElement element, Element changedElement) {
		
		AspectReconciliationReader reader=getReader(element,changedElement);
		 if(element instanceof Pointcut){
			reader.xml2Pointcut((Pointcut)element,changedElement);
		}else if(element instanceof Pointcuts){
			reader.xml2Pointcuts((Pointcuts)element,changedElement);
		}else if(element instanceof Advice){
			reader.xml2Advice((Advice)element,changedElement);
		}else{
			super.reconcile(element, changedElement);
		}
		
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
	public static void adoptChild(WSDLElement parent, List<? extends WSDLElement> children, WSDLElement newChild, String nodeName) {
		boolean oldUpdatingDom = isUpdatingDom(parent);
		try {
			setUpdatingDom(parent, true);
			
			if (isLoading(parent) || parent.getElement() == null) {
				return;
			}
			Element parseElement = parent.getElement();
			
			
			if (newChild.getElement() == null) {
				newChild.setElement(AspectElementFactory.getInstance().createElement(newChild, parent));
			}
			if (newChild.getElement().getParentNode() == parseElement) {
				// already in the dom tree
				return;
			}
			int index = children.indexOf(newChild);
			List<Element> domChildren;
			
			domChildren = getAspectChildElementsByLocalName(parseElement, nodeName);
			
			if (index >= domChildren.size()) {
				placeChild(parent, newChild.getElement());
			} else {
				ElementPlacer.niceInsertBefore(parent, newChild.getElement(), domChildren.get(index));
			}
		} finally {
			setUpdatingDom(parent, oldUpdatingDom);
		}
	}

	
	
	public static void orphanChild(WSDLElement parent, WSDLElement child) {
		boolean oldUpdatingDom = isUpdatingDom(parent);
		try {
			setUpdatingDom(parent, true);
			if (isLoading(parent) || parent.getElement() == null) {
				return;
			}
			if (parent.getElement() != null && child.getElement() != null
					&& child.getElement().getParentNode() == parent.getElement()) {
				parent.getElement().removeChild(child.getElement());
			}
			
		   //remove pointcuts when size=0
			if ((child instanceof Pointcut) && (((Pointcuts) parent).getChildren().size() == 0) && !((PointcutsImpl)parent).isReconciling()){
				if (parent.getContainer() instanceof Aspect)
					((Aspect) parent.getContainer()).setPointcuts(null);
				else
					throw new IllegalStateException();
			}
			
		} finally {
			setUpdatingDom(parent, oldUpdatingDom);
		}
	}		
	
	
	
	private AspectReconciliationReader getReader(WSDLElement element,
			Element changedElement) {
		// TODO Auto-generated method stub
		AspectReconciliationReader reader=document2reader.get(changedElement);
		if(reader==null){
			reader=new AspectReconciliationReader(AspectUtils.getAspect(element));
			document2reader.put(changedElement.getOwnerDocument(),reader);
		}
		return reader;
	}
	
	
	
	
}
