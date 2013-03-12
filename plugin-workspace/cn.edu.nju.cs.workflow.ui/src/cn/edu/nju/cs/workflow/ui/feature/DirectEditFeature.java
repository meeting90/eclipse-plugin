package cn.edu.nju.cs.workflow.ui.feature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.impl.AbstractDirectEditingFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

import cn.edu.nju.cs.workflow.model.ConditionalOutputPort;
import cn.edu.nju.cs.workflow.model.WorkflowElement;

public class DirectEditFeature extends AbstractDirectEditingFeature {

	public DirectEditFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getEditingType() {
		// TODO Auto-generated method stub
		return TYPE_TEXT;
	}

	 @Override
	    public boolean canDirectEdit(IDirectEditingContext context) {
	        PictogramElement pe = context.getPictogramElement();
	        Object bo = getBusinessObjectForPictogramElement(pe);
	        GraphicsAlgorithm ga = context.getGraphicsAlgorithm();
	        // support direct editing, if it is a EClass, and the user clicked
	        // directly on the text and not somewhere else in the rectangle
	        if (bo instanceof WorkflowElement  && ga instanceof Text) {
	            return true;
	        }
	        // direct editing not supported in all other cases
	        return false;
	    }
	 
	    public String getInitialValue(IDirectEditingContext context) {
	        // return the current name of the EClass
	        PictogramElement pe = context.getPictogramElement();
	        WorkflowElement element = (WorkflowElement) getBusinessObjectForPictogramElement(pe);
	        if(element instanceof ConditionalOutputPort)
	        	return ((ConditionalOutputPort)element).getCondition();  
	        else 
	        	return element.getName();
	    }
	 
	    @Override
	    public String checkValueValid(String value, IDirectEditingContext context) {
	       
	        return null;
	    }
	 
	    public void setValue(String value, IDirectEditingContext context) {
	        // set the new name for the EClass
	        PictogramElement pe = context.getPictogramElement();
	        WorkflowElement element = (WorkflowElement) getBusinessObjectForPictogramElement(pe);
	        if(element instanceof ConditionalOutputPort)
	        	 ((ConditionalOutputPort)element).setCondition(value);
	        else
	        	element.setName(value);
	        updatePictogramElement(((Shape) pe).getContainer());
	       // updatePictogramElement((Shape)pe);
	    }

}
