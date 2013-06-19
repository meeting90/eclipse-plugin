package cn.edu.nju.cs.workflow.ui.feature.add;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

import cn.edu.nju.cs.workflow.model.Choice;


public class ChoiceTaskAddFeature extends BaseAddFeature{
    private int totalWidth=200;
    private int totalHeight=200;
    private int portMargin=40;
    private int branchNum=2;
	public ChoiceTaskAddFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
		super.setTotalWidth(totalWidth);
		super.setTotalHeight(totalHeight);
		super.setPortMargin(portMargin);
	}
	@Override
	public boolean canAdd(IAddContext context) {
		// TODO Auto-generated method stub
		return (super.canAdd(context) && context.getNewObject() instanceof Choice);
	}
	@Override
	public PictogramElement add(IAddContext context) {
		// TODO Auto-generated method stub
		ContainerShape containerShape= (ContainerShape) super.add(context);
		Choice choice=(Choice) context.getNewObject();
		addInputPort(choice, containerShape);
		addConditionalOutputPort(choice, containerShape, branchNum);
		addFaultPort(choice, containerShape);
		addElementName(choice, containerShape);
//		int beforeX=0;
//		int beforeY=getBodyY()+getPortMargin()+getPortWidth()/2-getPointCutR();
//		int afterX=getTotalWidth()-getPointCutR()*2;
//		int afterY=beforeY;
//		int aroundX=getTotalWidth()/2-getPointCutR();
//		int aroundY=getTotalHeight()-getPointCutR()*2;
//		addPointCut(choice, containerShape, beforeX, beforeY,AdviceType.BEFORE);
//		for(int i=1;i<=branchNum;i++){
//			addPointCut(choice, containerShape, afterX, afterY+getPortMargin()*i,AdviceType.AFTER);
//			
//		}
//		addPointCut(choice, containerShape, aroundX,aroundY,AdviceType.AROUND);
		return containerShape;
	}

}
