package cn.edu.nju.cs.workflow.ui.feature.create;


import org.eclipse.bpel.model.Scope;
import org.eclipse.bpel.model.Sequence;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import cn.edu.nju.cs.workflow.bpel.BPELComponentGenerator;
import cn.edu.nju.cs.workflow.model.AdviceTask;
import cn.edu.nju.cs.workflow.model.ModelFactory;
import cn.edu.nju.cs.workflow.model.Workflow;
import cn.edu.nju.cs.workflow.ui.diagram.WorkflowFeatureProvider;
import cn.edu.nju.cs.workflow.ui.util.ConfigureUtil;

public class AdviceTaskCreateFeature extends AbstractCreateFeature {

	public AdviceTaskCreateFeature(IFeatureProvider fp) {
		super(fp, "AdviceTask", "create AdviceTask");
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
		AdviceTask task=ModelFactory.eINSTANCE.createAdviceTask();
		task=configureTask(task);
		//getDiagram().eResource().getContents().add(task);
		addGraphicalRepresentation(context, task);
	    getFeatureProvider().getDirectEditingInfo().setActive(true);
		return new Object[] { task };
	}
	private AdviceTask configureTask(AdviceTask task){
		task.setId(ConfigureUtil.getId());
		task.setName(ConfigureUtil.getAdviceTaskName());
		Workflow subworkflow=ModelFactory.eINSTANCE.createWorkflow();
		subworkflow.setId(ConfigureUtil.getId());
		subworkflow.setName(task.getName()+"-part"+subworkflow.getId());
		//getDiagram().eResource().getContents().add(subworkflow);
		task.setSubworkflow(subworkflow);
		WorkflowFeatureProvider provider=(WorkflowFeatureProvider) getFeatureProvider();
		provider.getWorkflow().getNodes().add(task);
	
		BPELComponentGenerator bpelGen=new BPELComponentGenerator(provider.getWorkflowProcess().getBpelProcess());	
		Scope scope=(Scope)provider.getWorkflow().getActivity();
		Scope subScope=bpelGen.createScopeNode("scope_"+task.getName());
	   ((Sequence) scope.getActivity()).getActivities().add(subScope);
	    subworkflow.setActivity(subScope);
		return task;
	}

}
