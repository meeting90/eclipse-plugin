package cn.edu.nju.cs.workflow.ui.feature.add;



import org.eclipse.graphiti.features.IDirectEditingInfo;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.algorithms.Ellipse;

import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;


import org.eclipse.graphiti.mm.pictograms.BoxRelativeAnchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;

import cn.edu.nju.cs.workflow.model.AdviceEdge;
import cn.edu.nju.cs.workflow.model.AdviceType;
import cn.edu.nju.cs.workflow.model.ConditionalOutputPort;
import cn.edu.nju.cs.workflow.model.FaultPort;
import cn.edu.nju.cs.workflow.model.InputPort;
import cn.edu.nju.cs.workflow.model.ModelFactory;
import cn.edu.nju.cs.workflow.model.OutputPort;
import cn.edu.nju.cs.workflow.model.WorkflowElement;
import cn.edu.nju.cs.workflow.model.WorkflowNode;
import cn.edu.nju.cs.workflow.ui.util.ConfigureUtil;
import cn.edu.nju.cs.workflow.ui.util.StyleUtil;



public class BaseAddFeature extends AbstractAddFeature {
    private  int totalWidth=250;
    private  int totalHeight=150;
    private  int portWidth=20;
    private  int portMargin=35;
    private  int pointCutR=5;
    private  int textAreaHeight=20; 
    private  int nodeMarkMargin=10;
    
	

	public BaseAddFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}
  
	public int getTotalWidth() {
		return totalWidth;
	}

	public int getTextAreaHeight() {
		return textAreaHeight;
	}

	public void setTextAreaHeight(int textAreaHeight) {
		this.textAreaHeight = textAreaHeight;
	}

	public void setTotalWidth(int totalWidth) {
		this.totalWidth = totalWidth;
	}

	public int getTotalHeight() {
		return totalHeight;
	}

	public void setTotalHeight(int totalHeight) {
		this.totalHeight = totalHeight;
	}

	public int getPortWidth() {
		return portWidth;
	}

	public void setPortWidth(int portWidth) {
		this.portWidth = portWidth;
	}

	public int getPortMargin() {
		return portMargin;
	}

	public void setPortMargin(int portMargin) {
		this.portMargin = portMargin;
	}

	public int getPointCutR() {
		return pointCutR;
	}

	public void setPointCutR(int pointCutR) {
		this.pointCutR = pointCutR;
	}

	public int getBodyX() {
		return portWidth+pointCutR*2;
	}

	

	public int getBodyY() {
		return pointCutR*2;
	}

	
	public int getBodyWidth() {
		return totalWidth-(portWidth+pointCutR*2)*2;
	}

	

	public int getBodyHeight() {
		return totalHeight-pointCutR*4;
	}

	public int getNodeMarkMargin() {
		return nodeMarkMargin;
	}

	public void setNodeMarkMargin(int nodeMarkMargin) {
		this.nodeMarkMargin = nodeMarkMargin;
	}
	

	@Override
	public boolean canAdd(IAddContext context) {
		// TODO Auto-generated method stub
		 if (context.getNewObject() instanceof WorkflowNode) {
	            // check if user wants to add to a diagram
	            if (context.getTargetContainer() instanceof Diagram) {
	                return true;
	            }
	        }
	        return false;
	}
	@Override
	public PictogramElement add(IAddContext context) {
		// TODO Auto-generated method stub
		return add(context,getTotalWidth(),getTotalHeight());
	}
	
	public ContainerShape add(IAddContext context,int totalWidth,int totalHeight ) {
		// TODO Auto-generated method stub
		final WorkflowNode element = (WorkflowNode) context.getNewObject();
		
		final Diagram targetDiagram = (Diagram) context.getTargetContainer();
		final IPeCreateService peCreateService = Graphiti.getPeCreateService();
		final ContainerShape containerShape = peCreateService.createContainerShape(targetDiagram, true);
		final int width = context.getWidth() <= 0 ? totalWidth : context.getWidth();
		final int height = context.getHeight() <= 0 ? totalHeight : context.getHeight();
		final IGaService gaService = Graphiti.getGaService();
		final Rectangle invisibleRectangle = gaService.createInvisibleRectangle(containerShape);
		gaService.setLocationAndSize(invisibleRectangle, context.getX(), context.getY(), width, height);
        if (element.eResource() == null) {
				getDiagram().eResource().getContents().add(element);
	    }
		link(containerShape, element);
		
		RoundedRectangle bodyRectangle=gaService.createRoundedRectangle(invisibleRectangle, 5, 5);
		bodyRectangle.setStyle(StyleUtil.getStyleForElement(getDiagram()));
		gaService.setLocationAndSize(bodyRectangle,getBodyX(), getBodyY(), getBodyWidth(), getBodyHeight());
		
		
		peCreateService.createChopboxAnchor(containerShape);
		
		
		final BoxRelativeAnchor boxAnchor = peCreateService.createBoxRelativeAnchor(containerShape);
    	boxAnchor.setRelativeWidth(0.5);
		boxAnchor.setRelativeHeight(0.5); 
		boxAnchor.setReferencedGraphicsAlgorithm(bodyRectangle);
		boxAnchor.setUseAnchorLocationAsConnectionEndpoint(true);
		Ellipse anchorEllipse = gaService.createEllipse(boxAnchor);
		gaService.setLocationAndSize(anchorEllipse, 0, 0, 0, 0);
        
		return containerShape;

	}
	public ContainerShape addStartNodeMark(WorkflowNode node,ContainerShape containerShape){
		final IPeCreateService peCreateService = Graphiti.getPeCreateService();
    	final IGaService gaService = Graphiti.getGaService();
    	ContainerShape shape = peCreateService.createContainerShape(containerShape, true);
//    	RoundedRectangle portRectangle=gaService.createPlainRoundedRectangle(shape, 0, 0);
//		portRectangle.setStyle(StyleUtil.getStyleForPort(getDiagram()));
		//gaService.setLocationAndSize(portRectangle,getBodyX()+getNodeMarkMargin() ,getBodyY()+getBodyWidth()-getNodeMarkMargin()-getPortWidth() ,getPortWidth(), getPortWidth());
		
		int[] xy={0,0,0,getPortWidth(),getPortWidth(),getPortWidth()/2};
		Polygon polygon=gaService.createPlainPolygon(shape, xy);
		polygon.setStyle(StyleUtil.getStyleForStartNodeMark(getDiagram()));
		gaService.setLocationAndSize(polygon,getBodyX()+getNodeMarkMargin() ,getBodyY()+getBodyHeight()-getNodeMarkMargin()-getPortWidth() ,getPortWidth(), getPortWidth());
		
		return shape;
	
	}
	public ContainerShape addEndNodeMark(WorkflowNode node,ContainerShape containerShape){
		final IPeCreateService peCreateService = Graphiti.getPeCreateService();
    	final IGaService gaService = Graphiti.getGaService();
    	ContainerShape shape = peCreateService.createContainerShape(containerShape, true);
    	RoundedRectangle portRectangle=gaService.createPlainRoundedRectangle(shape, 0, 0);
		portRectangle.setStyle(StyleUtil.getStyleForEndNodeMark(getDiagram()));
		gaService.setLocationAndSize(portRectangle,getBodyX()+getBodyWidth()-getNodeMarkMargin()-getPortWidth() ,getBodyY()+getBodyHeight()-getNodeMarkMargin()-getPortWidth() ,getPortWidth(), getPortWidth());

		return shape;
	
	}
    public void addInputPort(WorkflowNode node,ContainerShape containerShape){
    	final IPeCreateService peCreateService = Graphiti.getPeCreateService();
    	final IGaService gaService = Graphiti.getGaService();
    	ContainerShape shape = peCreateService.createContainerShape(containerShape, true);
    	
		RoundedRectangle portRectangle=gaService.createPlainRoundedRectangle(shape, 0, 0);
		portRectangle.setStyle(StyleUtil.getStyleForPort(getDiagram()));
		gaService.setLocationAndSize(portRectangle,getBodyX()-getPortWidth() ,getBodyY()+getPortMargin() ,getPortWidth(), getPortWidth());
	
		int[] xy={0,0,0,getPortWidth(),getPortWidth(),getPortWidth()/2};
		Polygon polygon=gaService.createPlainPolygon(portRectangle, xy);
		polygon.setStyle(StyleUtil.getStyleForInputAngle(getDiagram()));
	
		InputPort inPort=ModelFactory.eINSTANCE.createInputPort();
		inPort.setId(ConfigureUtil.getId());
		node.setInput(inPort);
		inPort.setNode(node);
		link(shape,inPort);
		peCreateService.createChopboxAnchor(shape);
	
		final BoxRelativeAnchor boxAnchor = peCreateService.createBoxRelativeAnchor(shape);
		boxAnchor.setRelativeWidth(0.0);
		boxAnchor.setRelativeHeight(0.5); 
		boxAnchor.setReferencedGraphicsAlgorithm(portRectangle);
		boxAnchor.setUseAnchorLocationAsConnectionEndpoint(true);
	
		Ellipse anchorEllipse = gaService.createEllipse(boxAnchor);
		gaService.setLocationAndSize(anchorEllipse, 0, 0, 0, 0);	
    }
    public void addOutputPort(WorkflowNode node,ContainerShape containerShape){
    	final IPeCreateService peCreateService = Graphiti.getPeCreateService();
    	final IGaService gaService = Graphiti.getGaService();
    	
    		ContainerShape shape = peCreateService.createContainerShape(containerShape, true);
        	RoundedRectangle portRectangle=gaService.createPlainRoundedRectangle(shape, 0, 0);
    		portRectangle.setStyle(StyleUtil.getStyleForPort(getDiagram()));
    		gaService.setLocationAndSize(portRectangle,getBodyX()+getBodyWidth() ,getBodyY()+getPortMargin() ,getPortWidth(), getPortWidth());
    		
    		int[] xy={0,0,0,getPortWidth(),getPortWidth(),getPortWidth()/2};
    		Polygon polygon=gaService.createPlainPolygon(portRectangle, xy);
    		polygon.setStyle(StyleUtil.getStyleForOutputAngle(getDiagram()));
    		
    		OutputPort outPort=ModelFactory.eINSTANCE.createOutputPort();
    		outPort.setId(ConfigureUtil.getId());
    		node.getOutputs().add(outPort);
    		outPort.setNode(node);
    		link(shape,outPort);
    		peCreateService.createChopboxAnchor(shape);
    		
    		final BoxRelativeAnchor boxAnchor = peCreateService.createBoxRelativeAnchor(shape);
        	boxAnchor.setRelativeWidth(1.0);
    		boxAnchor.setRelativeHeight(0.5); 
    		boxAnchor.setReferencedGraphicsAlgorithm(portRectangle);
    		boxAnchor.setUseAnchorLocationAsConnectionEndpoint(true);
        	
    		
    		Ellipse anchorEllipse = gaService.createEllipse(boxAnchor);
    		gaService.setLocationAndSize(anchorEllipse, 0, 0, 0, 0);
    }

    public void addFaultPort(WorkflowNode node,ContainerShape containerShape){
    	final IPeCreateService peCreateService = Graphiti.getPeCreateService();
    	final IGaService gaService = Graphiti.getGaService();
 
    	ContainerShape shape = peCreateService.createContainerShape(containerShape, true);
    	RoundedRectangle portRectangle=gaService.createPlainRoundedRectangle(shape, 0, 0);
		portRectangle.setStyle(StyleUtil.getStyleForPort(getDiagram()));
		gaService.setLocationAndSize(portRectangle,getBodyX()+getBodyWidth() ,getTotalHeight()-getPortMargin()-getPortWidth() ,getPortWidth(), getPortWidth());
		
		int[] xy={0,0,0,getPortWidth(),getPortWidth(),getPortWidth()/2};
		Polygon polygon=gaService.createPlainPolygon(portRectangle, xy);
		polygon.setStyle(StyleUtil.getStyleForFaultAngle(getDiagram()));
		
		FaultPort faultPort=ModelFactory.eINSTANCE.createFaultPort();
		faultPort.setId(ConfigureUtil.getId());
		node.getOutputs().add(faultPort);
		faultPort.setNode(node);
		link(shape,faultPort);
		peCreateService.createChopboxAnchor(shape);
		
		
		final BoxRelativeAnchor boxAnchor = peCreateService.createBoxRelativeAnchor(shape);
    	boxAnchor.setRelativeWidth(1.0);
		boxAnchor.setRelativeHeight(0.5); 
		boxAnchor.setReferencedGraphicsAlgorithm(portRectangle);
		boxAnchor.setUseAnchorLocationAsConnectionEndpoint(true);
		Ellipse anchorEllipse = gaService.createEllipse(boxAnchor);
		gaService.setLocationAndSize(anchorEllipse, 0, 0, 0, 0);
		
    	
    }
    public void addConditionalOutputPort(WorkflowNode node,ContainerShape containerShape,int branchNum){
    	final IPeCreateService peCreateService = Graphiti.getPeCreateService();
    	final IGaService gaService = Graphiti.getGaService();
    	for(int i=1;i<=branchNum;i++){
    		ContainerShape shape = peCreateService.createContainerShape(containerShape, true);
    		
    		final Rectangle invisibleRectangle = gaService.createInvisibleRectangle(shape);
    		gaService.setLocationAndSize(invisibleRectangle,getBodyX() ,getBodyY()+getPortMargin()*i ,getPortWidth()+getBodyWidth(), getPortWidth());
    		
    		
    		ContainerShape portShape=peCreateService.createContainerShape(shape, true);
        	RoundedRectangle portRectangle=gaService.createPlainRoundedRectangle(portShape, 0, 0);
    		portRectangle.setStyle(StyleUtil.getStyleForPort(getDiagram()));
    		gaService.setLocationAndSize(portRectangle,getBodyWidth(),0 ,getPortWidth(), getPortWidth());
    		
    		int[] xy={0,0,0,getPortWidth(),getPortWidth(),getPortWidth()/2};
    		Polygon polygon=gaService.createPlainPolygon(portRectangle, xy);
    		polygon.setStyle(StyleUtil.getStyleForOutputAngle(getDiagram()));
    		
    		ConditionalOutputPort outPort=ModelFactory.eINSTANCE.createConditionalOutputPort();
    		outPort.setId(ConfigureUtil.getId());
    		outPort.setNode(node);
    		outPort.setCondition(ConfigureUtil.getConditionName());
    		link(shape,outPort);
    		link(portShape,outPort);
    		
    		peCreateService.createChopboxAnchor(portShape);
    	
    		{
    			
    	    	final Shape textshape = peCreateService.createShape(shape, false);
    	    	
    	    	
    			final Text text = gaService.createPlainText(textshape, outPort.getCondition());
    			text.setStyle(StyleUtil.getStyleForElementText(getDiagram()));
    			text.setHorizontalAlignment(Orientation.ALIGNMENT_RIGHT);
    			gaService.setLocationAndSize(text, 0, 0, getBodyWidth(), getTextAreaHeight());
    			link(textshape, outPort);
    			final IDirectEditingInfo directEditingInfo = getFeatureProvider().getDirectEditingInfo();
    			directEditingInfo.setMainPictogramElement(shape);
    			directEditingInfo.setPictogramElement(textshape);
    			directEditingInfo.setGraphicsAlgorithm(text); 
    		}
    		
    		final BoxRelativeAnchor boxAnchor = peCreateService.createBoxRelativeAnchor(portShape);
        	boxAnchor.setRelativeWidth(1.0d);
    		boxAnchor.setRelativeHeight(0.5d); 
    		boxAnchor.setReferencedGraphicsAlgorithm(portRectangle);
    		boxAnchor.setUseAnchorLocationAsConnectionEndpoint(true);
    		Ellipse anchorEllipse = gaService.createEllipse(boxAnchor);
    		gaService.setLocationAndSize(anchorEllipse, 0, 0, 0, 0);
    		
    		
    	}
		
    }
    
    public void addElementName(WorkflowElement e,ContainerShape containerShape){
    	final IPeCreateService peCreateService = Graphiti.getPeCreateService();
    	final IGaService gaService = Graphiti.getGaService();
    	final Shape shape = peCreateService.createShape(containerShape, false);
    	
		final Text text = gaService.createPlainText(shape, e.getName());
		text.setStyle(StyleUtil.getStyleForElementText(getDiagram()));
		gaService.setLocationAndSize(text, getBodyX(), getBodyY(), getBodyWidth(), getTextAreaHeight());
		link(shape, e);
		final IDirectEditingInfo directEditingInfo = getFeatureProvider().getDirectEditingInfo();
		directEditingInfo.setMainPictogramElement(containerShape);
		directEditingInfo.setPictogramElement(shape);
		directEditingInfo.setGraphicsAlgorithm(text); 
    	
    }
    public void addPointCut(WorkflowNode e,ContainerShape containerShape,int pointCutX,int pointCutY,AdviceType type){
    	final IPeCreateService peCreateService = Graphiti.getPeCreateService();
    	final IGaService gaService = Graphiti.getGaService();
    	ContainerShape shape = peCreateService.createContainerShape(containerShape, true);
    	Rectangle invisibleRectangle = gaService.createInvisibleRectangle(shape);
    	//Ellipse invisibleRectangle=gaService.createEllipse(shape);
    	invisibleRectangle.setStyle(StyleUtil.getStyleForElement(getDiagram()));
    	gaService.setLocationAndSize(invisibleRectangle,pointCutX ,pointCutY ,getPointCutR()*2, getPointCutR()*2);
    	
    	AdviceEdge edge=ModelFactory.eINSTANCE.createAdviceEdge();

    	e.getAdviceEdges().add(edge);
    	edge.setId(ConfigureUtil.getId());
    	edge.setAdvicetype(type);
    	
    	link(shape,edge);
    	
    	peCreateService.createChopboxAnchor(shape);
    	final BoxRelativeAnchor boxAnchor = peCreateService.createBoxRelativeAnchor(shape);
        boxAnchor.setRelativeWidth(0.5d);
    	boxAnchor.setRelativeHeight(0.5d); 
    	boxAnchor.setReferencedGraphicsAlgorithm(invisibleRectangle);
    	boxAnchor.setUseAnchorLocationAsConnectionEndpoint(true);
    	Ellipse anchorEllipse = gaService.createEllipse(boxAnchor);
    	gaService.setLocationAndSize(anchorEllipse, 0, 0, 0, 0);
    	
    	
    }
}
