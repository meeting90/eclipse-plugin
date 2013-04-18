package cn.edu.nju.cs.workflow.ui.feature.add;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

import cn.edu.nju.cs.workflow.model.AdviceType;
import cn.edu.nju.cs.workflow.model.SimpleTask;


public class SimpleTaskAddFeature extends BaseAddFeature{

	private int totalWidth=200;
	private int totalHeight=160;
	
	public SimpleTaskAddFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
		super.setTotalWidth(totalWidth);
		super.setTotalHeight(totalHeight);
	}
	
	@Override
	public boolean canAdd(IAddContext context) {
		// TODO Auto-generated method stub
		if (super.canAdd(context) && context.getNewObject() instanceof SimpleTask)
			return true;
		return false;
	}
	@Override
	public PictogramElement add(IAddContext context) {
		// TODO Auto-generated method stub
		ContainerShape containerShape= (ContainerShape) add(context,getTotalWidth(),getTotalHeight());
		SimpleTask task=(SimpleTask) context.getNewObject();
		addInputPort(task, containerShape);
		addOutputPort(task, containerShape);
		addFaultPort(task, containerShape);
		addElementName(task, containerShape);
		
		
		addStartNodeMark(task, containerShape).setVisible(task.isIsStartNode());
		
		addEndNodeMark(task, containerShape).setVisible(task.isIsFinishNode());
		
		int beforeX=0;
		int beforeY=getBodyY()+getPortMargin()+getPortWidth()/2-getPointCutR();
		int afterX=getTotalWidth()-getPointCutR()*2;
		int afterY=beforeY;
		int aroundX=getTotalWidth()/2-getPointCutR();
		int aroundY=getTotalHeight()-getPointCutR()*2;
		
		int afterSoapinX=getBodyX();
		int afterSoapinY=beforeY;
		int aroundSoapinX=(beforeX+afterSoapinX)/2;
		int aroundSopainY=beforeY+getPortWidth()/2+getPointCutR();
		
		int beforeSoapoutX=getBodyX()+getBodyWidth()-getPointCutR()*2;
		int beforeSoapoutY=beforeY;
		int aroundSoapoutX=(beforeSoapoutX+afterX)/2;
		int aroundSoapoutY=aroundSopainY;
		
		addPointCut(task, containerShape, beforeX, beforeY,AdviceType.BEFORE);
		addPointCut(task, containerShape, afterX, afterY,AdviceType.AFTER);
		addPointCut(task, containerShape, aroundX,aroundY,AdviceType.AROUND);
		
		addPointCut(task,containerShape, afterSoapinX,afterSoapinY,AdviceType.AFTER_SOAPMESSAGEIN);
		addPointCut(task, containerShape, aroundSoapinX, aroundSopainY, AdviceType.AROUND_SOAPMESSAGEIN);
		
		addPointCut(task, containerShape, beforeSoapoutX, beforeSoapoutY, AdviceType.BEFORE_SOAPMESSAGEOUT);
		
		addPointCut(task, containerShape, aroundSoapoutX, aroundSoapoutY, AdviceType.AROUND_SOAPMESSAGEOUT);
		
		

		return containerShape;
		
		
	}

}
