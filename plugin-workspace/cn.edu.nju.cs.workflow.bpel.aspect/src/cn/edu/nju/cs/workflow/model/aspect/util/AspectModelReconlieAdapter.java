package cn.edu.nju.cs.workflow.model.aspect.util;

import org.eclipse.bpel.model.BPELExtensibleElement;
import org.eclipse.bpel.model.adapters.INamespaceMap;
import org.eclipse.bpel.model.impl.BPELExtensibilityElementImpl;
import org.eclipse.bpel.model.util.BPELConstants;
import org.eclipse.bpel.model.util.BPELUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.wst.sse.core.internal.provisional.INodeNotifier;
import org.eclipse.wst.sse.core.internal.provisional.IStructuredModel;
import org.eclipse.wst.wsdl.internal.impl.WSDLElementImpl;
import org.eclipse.wst.wsdl.internal.impl.XSDSchemaExtensibilityElementImpl;
import org.eclipse.wst.wsdl.ui.internal.util.NodeAssociationManager;
import org.eclipse.wst.xsd.ui.internal.util.ModelReconcileAdapter;
import org.eclipse.xsd.XSDConcreteComponent;
import org.eclipse.xsd.impl.XSDSchemaImpl;
import org.eclipse.xsd.util.XSDConstants;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import cn.edu.nju.cs.workflow.bpel.aspect.editors.AspectEditor;
import cn.edu.nju.cs.workflow.model.aspect.Advice;
import cn.edu.nju.cs.workflow.model.aspect.Aspect;

@SuppressWarnings("restriction")
public class AspectModelReconlieAdapter extends ModelReconcileAdapter{


	protected Aspect aspect;
	protected Advice advice;
	protected Resource aspectResource;
	private AspectEditor fEditor;

	NodeAssociationManager manager=new NodeAssociationManager();

	public AspectModelReconlieAdapter(Document document, Aspect aspect,
			Resource aspectResource, AspectEditor editor) {
		super(document);
		this.aspect = aspect;
		this.advice=this.aspect.getAdvice();
		this.aspectResource =aspectResource;
		this.fEditor = editor;
	}
	// This method is clever enough to deal with 'bad' documents that happen
	// to have more than one root element. It picks of the first 'matching'
	// element.
	private Element getAspectElement(Document document) {
		Element aspectElement = null;
		for (Node node = document.getFirstChild(); node != null; node = node
				.getNextSibling()) {
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				if (element.getLocalName().equals(
						AspectConstants.ND_ASPECT)) {
					aspectElement = element;
					break;
				}
			}
		}
		return aspectElement;
	}

	@Override
	protected void handleNodeChanged(Node node) {
		if (node instanceof Element
				&& !BPELConstants.ND_LITERAL.equals(node.getLocalName())) {
			reconcileModelObjectForElement((Element) node);
		} else if (node instanceof Document) {
			Document document = (Document) node;
			Element aspectElement = getAspectElement(document);
			if (aspectElement != null
					&& aspect.getElement() != aspectElement) {
				aspect.setElement(aspectElement);
			} else if (aspectElement != null) {
				aspect.elementChanged(aspectElement);
			} else {
				aspect.setName(null);
				aspect.setDocumentation(null);
				aspect.setPointcuts(null);
				aspect.setAdvice(null);
				aspect.setTargetnamespace(null);
				aspect.setExpressionLanguage(null);
				if (aspectElement != null) {
					aspect.setElement(aspectElement);
					aspect.elementChanged(aspectElement);
				}
			}
		} else if (node.getNodeType() == Node.CDATA_SECTION_NODE
				|| BPELConstants.ND_LITERAL.equals(node.getLocalName())) {
			reconcileModelObjectForElement((Element) node.getParentNode());
		}
	}

	private void reconcileModelObjectForElement(Element elementCandidate) {
		Object modelObjectCandidate = manager.getModelObjectForNode(aspect, elementCandidate);

		// Get out of possible nested XML within the literal
		while (modelObjectCandidate == null
				&& elementCandidate.getParentNode() != null) {
			elementCandidate = (Element) elementCandidate.getParentNode();
			
			modelObjectCandidate = manager.getModelObjectForNode(aspect, elementCandidate);
			
		}

		// Wrap changes in source tab to the Command
		if (modelObjectCandidate != null) {
			final Object modelObject = modelObjectCandidate;
			final Element element = elementCandidate;
					if (modelObject instanceof BPELExtensibleElement) {
						((BPELExtensibleElement) modelObject)
								.elementChanged(element);
						this.fEditor.getMultipageEditor().updateMarkers((BPELExtensibleElement)modelObject);
					} else if (modelObject instanceof BPELExtensibilityElementImpl) {
						((BPELExtensibilityElementImpl) modelObject)
								.elementChanged(element);
					} else if (modelObject instanceof XSDSchemaExtensibilityElementImpl) {
						XSDSchemaExtensibilityElementImpl ee = (XSDSchemaExtensibilityElementImpl) modelObject;
						((XSDSchemaImpl) ee.getSchema())
								.elementChanged(element);
						ee.elementChanged(element);
					} else if (modelObject instanceof WSDLElementImpl) {
						((WSDLElementImpl) modelObject).elementChanged(element);
					} else if (modelObject instanceof XSDConcreteComponent) {
						((XSDConcreteComponent) modelObject)
								.elementChanged(element);
					}

		}
	}

	@Override
	public void modelDirtyStateChanged(IStructuredModel model, boolean isDirty) {
		if (!isDirty) {
			
		}
	}

	@Override
	public void handleNotifyChange(INodeNotifier notifier, int eventType,
			final Object feature, final Object oldValue, final Object newValue,
			int index) {
		final Node node = (Node) notifier;
		switch (eventType) {
		case INodeNotifier.ADD: {
			if (newValue instanceof Element) {
				Element element = (Element) newValue;
				adapt(element);
			}
			break;
		}
		case INodeNotifier.REMOVE: {
			break;
		}
		case INodeNotifier.CHANGE:
		case INodeNotifier.STRUCTURE_CHANGED: {
			if (feature instanceof Attr
					&& XSDConstants.XMLNS_URI_2000.equals(((Attr) feature)
							.getNamespaceURI())) {
				final Attr attr = (Attr) feature;
				final EObject modelObject = (EObject) manager.getModelObjectForNode(aspect,
								(Element) node);
				final INamespaceMap<String, String> objectMap = BPELUtils
						.getNamespaceMap(modelObject);
						if (newValue == null) {
							objectMap.remove(BPELUtils.getNSPrefixMapKey(attr
									.getLocalName()));
						} else {
							objectMap.put(BPELUtils.getNSPrefixMapKey(attr
									.getLocalName()), attr.getValue());
						}

				if (!BPELConstants.NAMESPACE.equals(attr.getValue()))
					break;
			}
			handleNodeChanged(node);
			break;
		}
		case INodeNotifier.CONTENT_CHANGED: {
			handleNodeChanged(node);
			break;
		}
		}
	}
}
