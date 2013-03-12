package cn.edu.nju.cs.workflow.ui.feature.create;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import cn.edu.nju.cs.workflow.model.Choice;
import cn.edu.nju.cs.workflow.model.ModelFactory;

import cn.edu.nju.cs.workflow.ui.diagram.WorkflowFeatureProvider;
import cn.edu.nju.cs.workflow.ui.util.ConfigureUtil;

public class ChoiceTaskCreateFeature extends  AbstractCreateFeature {

	public ChoiceTaskCreateFeature(IFeatureProvider fp) {
		super(fp, "ChoiceTask", "create ChoiceTask");
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
		Choice task=ModelFactory.eINSTANCE.createChoice();
		task=configureTask(task);
		//getDiagram().eResource().getContents().add(task);
		addGraphicalRepresentation(context, task);
	    getFeatureProvider().getDirectEditingInfo().setActive(true);
		return new Object[] { task };
	}
	private Choice configureTask(Choice task){
		task.setId(ConfigureUtil.getId());
		task.setName(ConfigureUtil.getChoiceTaskName());
		WorkflowFeatureProvider provider=(WorkflowFeatureProvider) getFeatureProvider();
		provider.getWorkflow().getNodes().add(task);
	
		return task;
	}

}
