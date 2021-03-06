package cn.edu.nju.cs.workflow.ui.feature.create;




import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;


import cn.edu.nju.cs.workflow.model.CompoundTask;
import cn.edu.nju.cs.workflow.model.ModelFactory;
import cn.edu.nju.cs.workflow.model.Workflow;
import cn.edu.nju.cs.workflow.ui.diagram.WorkflowFeatureProvider;
import cn.edu.nju.cs.workflow.ui.util.ConfigureUtil;

public  class CompoundTaskCreateFeature  extends  AbstractCreateFeature {

	public CompoundTaskCreateFeature(IFeatureProvider fp) {
		super(fp, "CompundTask", "create CompoundTask");
		// TODO Auto-gtenerated constructor stub
	}
	 @Override
    public String getCreateName() {
    
    	return "CompoundTask";
    
	 }
    @Override
    public String getCreateDescription() {
    	return "create CompoundTask";
    }
	@Override
	public boolean canCreate(ICreateContext context) {
		// TODO Auto-generated method stub
		return context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public Object[] create(ICreateContext context) {
		// TODO Auto-generated method stub
		CompoundTask task=ModelFactory.eINSTANCE.createCompoundTask();
		task=configureTask(task);
		
		addGraphicalRepresentation(context, task);
	    getFeatureProvider().getDirectEditingInfo().setActive(true);
		return new Object[] { task };
	}
	private CompoundTask configureTask(CompoundTask task){
		getDiagram().setActive(true);
		task.setId(ConfigureUtil.getId());
		task.setName(ConfigureUtil.getCompoundTaskName());
		
		Workflow subworkflow=ModelFactory.eINSTANCE.createWorkflow();
		subworkflow.setId(ConfigureUtil.getId());
		subworkflow.setName(task.getName()+"-part"+subworkflow.getId());
		
		task.setSubworkflow(subworkflow);
		WorkflowFeatureProvider provider=(WorkflowFeatureProvider) getFeatureProvider();	
		provider.getWorkflow().getNodes().add(task);
		
		return task;
	}

}
