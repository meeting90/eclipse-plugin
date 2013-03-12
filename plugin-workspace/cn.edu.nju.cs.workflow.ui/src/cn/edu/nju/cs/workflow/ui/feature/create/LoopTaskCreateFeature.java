package cn.edu.nju.cs.workflow.ui.feature.create;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import cn.edu.nju.cs.workflow.model.LoopTask;
import cn.edu.nju.cs.workflow.model.ModelFactory;
import cn.edu.nju.cs.workflow.model.WhileCondition;
import cn.edu.nju.cs.workflow.model.Workflow;
import cn.edu.nju.cs.workflow.ui.diagram.WorkflowFeatureProvider;
import cn.edu.nju.cs.workflow.ui.util.ConfigureUtil;

public class LoopTaskCreateFeature extends  AbstractCreateFeature {

	public LoopTaskCreateFeature(IFeatureProvider fp) {
		super(fp, "LoopTask","create LoopTask");
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canCreate(ICreateContext context) {
		// TODO Auto-generated method stub
		return context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public Object[] create(ICreateContext context) {
		// TODO Auto-generated method stub
		LoopTask task=ModelFactory.eINSTANCE.createLoopTask();
		task=configureTask(task);
	    getDiagram().eResource().getContents().add(task);
	    addGraphicalRepresentation(context, task);
		getFeatureProvider().getDirectEditingInfo().setActive(true);
	    return new Object[] { task };
	}
	private LoopTask configureTask(LoopTask task){
		task.setId(ConfigureUtil.getId());
		task.setName(ConfigureUtil.getLoopTaskName());

		WhileCondition condition=ModelFactory.eINSTANCE.createWhileCondition();
		condition.setId(ConfigureUtil.getId());
		condition.setName(ConfigureUtil.getWhileConditionName());
		condition.setCondition("while(true())");
		condition.setLooptask(task);
		
		Workflow subworkflow=ModelFactory.eINSTANCE.createWorkflow();
		subworkflow.setId(ConfigureUtil.getId());
		subworkflow.setName(task.getName()+"-subworkflow");
		//getDiagram().eResource().getContents().add(subworkflow);
		task.setSubworkflow(subworkflow);
		WorkflowFeatureProvider provider=(WorkflowFeatureProvider) getFeatureProvider();
		provider.getWorkflow().getNodes().add(task);
		
		return task;
	}

}
