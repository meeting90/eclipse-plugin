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

import cn.edu.nju.cs.workflow.model.AdviceType;
import cn.edu.nju.cs.workflow.model.CompoundTask;

import cn.edu.nju.cs.workflow.ui.util.StyleUtil;

public class CompoundTaskAddFeature extends BaseAddFeature{
    private int totalWidth=400;
    private int totalHeight=160;
	public CompoundTaskAddFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
		super.setTotalWidth(totalWidth);
		super.setTotalHeight(totalHeight);
		
	}
	@Override
	public boolean canAdd(IAddContext context) {
		// TODO Auto-generated method stub
		return super.canAdd(context) && context.getNewObject() instanceof CompoundTask;
	}
	@Override
	public PictogramElement add(IAddContext context) {
		// TODO Auto-generated method stub
		final IPeCreateService peCreateService = Graphiti.getPeCreateService();
    	final IGaService gaService = Graphiti.getGaService();
		ContainerShape containerShape=add(context, getTotalWidth(), getTotalHeight());
		CompoundTask task=(CompoundTask)context.getNewObject();
		//add line
		{
			final Shape shape = peCreateService.createShape(containerShape, false);

			// create and set graphics algorithm
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
		addInputPort(task, containerShape);
		addOutputPort(task, containerShape);
		addFaultPort(task, containerShape);
		addElementName(task, containerShape);
		
		int beforeX=0;
		int beforeY=getBodyY()+getPortMargin()+getPortWidth()/2-getPointCutR();
		int afterX=getTotalWidth()-getPointCutR()*2;
		int afterY=beforeY;
		int aroundX=getTotalWidth()/2-getPointCutR();
		int aroundY=getTotalHeight()-getPointCutR()*2;
		addPointCut(task, containerShape, beforeX, beforeY,AdviceType.BEFORE);
		addPointCut(task, containerShape, afterX, afterY,AdviceType.AFTER);
		addPointCut(task, containerShape, aroundX,aroundY,AdviceType.AROUND);
		return containerShape;
				
	}
	
	
	

}
