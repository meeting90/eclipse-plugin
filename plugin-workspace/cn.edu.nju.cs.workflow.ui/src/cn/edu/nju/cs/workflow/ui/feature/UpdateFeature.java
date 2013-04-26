package cn.edu.nju.cs.workflow.ui.feature;


import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;

import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

import cn.edu.nju.cs.workflow.model.ConditionalOutputPort;
import cn.edu.nju.cs.workflow.model.WorkflowElement;
import cn.edu.nju.cs.workflow.model.WorkflowNode;
import cn.edu.nju.cs.workflow.ui.util.StyleUtil;

public class UpdateFeature extends AbstractUpdateFeature {

	public UpdateFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canUpdate(IUpdateContext context) {
		// TODO Auto-generated method stub
		Object bo =
	            getBusinessObjectForPictogramElement(context.getPictogramElement());
	        return (bo instanceof WorkflowElement);
	}

	@Override
	public IReason updateNeeded(IUpdateContext context) {
		// TODO Auto-generated method stub
//		 String pictogramName = null;
//	        PictogramElement pictogramElement = context.getPictogramElement();
//	        if (pictogramElement  instanceof ContainerShape) {
//	            ContainerShape cs = (ContainerShape) pictogramElement;
//	            for (Shape shape : cs.getChildren()) {
//	                if (shape.getGraphicsAlgorithm() instanceof Text) {
//	                    Text text = (Text) shape.getGraphicsAlgorithm();
//	                    pictogramName = text.getValue();
//	                }
//	            }
//	        }
//	 
//	        // retrieve name from business model
//	        String businessName = null;
//	        Object bo = getBusinessObjectForPictogramElement(pictogramElement);
//	        if (bo instanceof WorkflowElement) {
//	            WorkflowElement element = (WorkflowElement) bo;
//	            if(element instanceof ConditionalOutputPort)
//	            	 businessName= ((ConditionalOutputPort)element).getCondition();  
//		        else 
//		        	 businessName = element.getName();
//	        }
//	 
//	        // update needed, if names are different
//	        boolean updateNameNeeded =
//	            ((pictogramName == null && businessName != null) || 
//	                (pictogramName != null && !pictogramName.equals(businessName)));
//	        if (updateNameNeeded) {
//	            return Reason.createTrueReason("Name is out of date");
//	        } else {
	            return Reason.createFalseReason();
//	        }
	}

	@Override
	public boolean update(IUpdateContext context) {
		// TODO Auto-generated method stub
		updateText(context);
		updateNodeMark(context);
 
        return true;
    }
	
	private void updateNodeMark(IUpdateContext context){
		PictogramElement pictogramElement = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		boolean isStartNode=true;
		boolean isEndNode=false;
		 if (bo instanceof WorkflowNode) {
			 WorkflowNode node = (WorkflowNode) bo;
	         isStartNode=node.isIsStartNode();
	         isEndNode=node.isIsFinishNode();
	       }
		 if (pictogramElement instanceof ContainerShape) {
	            ContainerShape cs = (ContainerShape) pictogramElement;
	            for (Shape shape : cs.getChildren()) {
	                if (shape.getGraphicsAlgorithm().getStyle()==StyleUtil.getStyleForStartNodeMark(getDiagram())){	
	                	shape.setVisible(isStartNode);	
	                }
	            	if (shape.getGraphicsAlgorithm().getStyle()==StyleUtil.getStyleForEndNodeMark(getDiagram())){	
	            		shape.setVisible(isEndNode);
		 			}
	            }
	        }
        
 
	}
	private void updateText(IUpdateContext context){
		String businessName = null;
        PictogramElement pictogramElement = context.getPictogramElement();
        Object bo = getBusinessObjectForPictogramElement(pictogramElement);
        if (bo instanceof WorkflowElement) {
        	WorkflowElement element = (WorkflowElement) bo;
        	 if(element instanceof ConditionalOutputPort)
            	 businessName= ((ConditionalOutputPort)element).getCondition();  
	        else 
	        	 businessName = element.getName();
        }
 
        // Set name in pictogram model
        if (pictogramElement instanceof ContainerShape) {
            ContainerShape cs = (ContainerShape) pictogramElement;
            for (Shape shape : cs.getChildren()) {
                if (shape.getGraphicsAlgorithm() instanceof Text) {
                	Object object=shape.getLink().getBusinessObjects().get(0);
                	if(object instanceof  WorkflowElement)
                		if(((WorkflowElement)object).getId()==((WorkflowElement)bo).getId())
                		{
                			 Text text = (Text) shape.getGraphicsAlgorithm();
                             text.setValue(businessName);
                		}
                		
                   
                }
            }
        }
		
	}
}
