package cn.edu.nju.cs.workflow.ui.feature.add;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;

import cn.edu.nju.cs.workflow.model.AdviceTask;

import cn.edu.nju.cs.workflow.ui.util.StyleUtil;

public class AdviceTaskAddFeature extends BaseAddFeature {
	 private  int totalWidth=150;
	 private  int totalHeight=100;
	 private  int portWidth=0;
	 private  int portMargin=0;
	 private  int pointCutR=0;
	 
	public AdviceTaskAddFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
		super.setTotalWidth(totalWidth);
		super.setTotalHeight(totalHeight);
		super.setPortWidth(portWidth);
		super.setPortMargin(portMargin);
		super.setPointCutR(pointCutR);
		
	}
	@Override
	public boolean canAdd(IAddContext context) {
		// TODO Auto-generated method stub
		return super.canAdd(context) && context.getNewObject() instanceof AdviceTask;
	}
	@Override
	public PictogramElement add(IAddContext context) {
		// TODO Auto-generated method stub
		final IPeCreateService peCreateService = Graphiti.getPeCreateService();
    	final IGaService gaService = Graphiti.getGaService();
		ContainerShape containerShape=add(context, getTotalWidth(), getTotalHeight());
		AdviceTask task=(AdviceTask)context.getNewObject();
		//add line
		{
			final Shape shape = peCreateService.createShape(containerShape, false);
			final Polyline polyline = gaService.createPlainPolyline(shape, new int[] { getBodyX(), getBodyY()+getTextAreaHeight(), getBodyWidth()+getBodyX(),  getBodyY()+getTextAreaHeight() });
			polyline.setStyle(StyleUtil.getStyleForElement(getDiagram()));
		}
		//add compoundTask area
		{
			ContainerShape shape = peCreateService.createContainerShape(containerShape, true);
			RoundedRectangle portRectangle=gaService.createPlainRoundedRectangle(shape, 0, 0);
			portRectangle.setStyle(StyleUtil.getStyleForElement(getDiagram()));
			gaService.setLocationAndSize(portRectangle,getBodyX(),getBodyY()+getTextAreaHeight(),getBodyWidth(),getBodyHeight()-getTextAreaHeight());
				
			link(shape,task.getSubworkflow());
		}	
    		
		addElementName(task, containerShape);
		
	
		

		return containerShape;
				
	}
	

}
