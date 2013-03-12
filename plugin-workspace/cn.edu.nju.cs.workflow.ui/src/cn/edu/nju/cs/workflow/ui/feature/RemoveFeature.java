package cn.edu.nju.cs.workflow.ui.feature;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IRemoveContext;
import org.eclipse.graphiti.features.impl.DefaultRemoveFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

import cn.edu.nju.cs.workflow.model.InputPort;
import cn.edu.nju.cs.workflow.model.OutputPort;


public class RemoveFeature extends DefaultRemoveFeature{
	
	public RemoveFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void preRemove(IRemoveContext context) {
		// TODO Auto-generated method stub
		PictogramElement pe = context.getPictogramElement();
		if(pe instanceof Connection){
			Anchor source=((Connection)pe).getStart();
			Anchor target=((Connection)pe).getEnd();
			Shape outputShape=(Shape) source.getParent().getLink().getPictogramElement();
			Shape inputShape=(Shape) target.getParent().getLink().getPictogramElement();
         
			Object obj = getBusinessObjectForPictogramElement(source.getParent());
			if(obj!=null && obj instanceof OutputPort){
				OutputPort port=(OutputPort)obj;
				if(port.getEdges().size()==1)
					port.getNode().setIsFinishNode(true);	
			}
			Object obj2 = getBusinessObjectForPictogramElement(target.getParent());
			if(obj2!=null && obj2 instanceof InputPort){
				InputPort port=(InputPort)obj2;
				if(port.getEdges().size()==1)
					port.getNode().setIsStartNode(true);	
			}
            updatePictogramElement(outputShape.getContainer());
            updatePictogramElement(inputShape.getContainer());
			
			
		}
			
		
	}
	

}
