package cn.edu.nju.cs.workflow.ui.feature.create;
import org.eclipse.bpel.model.Assign;
import org.eclipse.bpel.model.BPELFactory;
import org.eclipse.bpel.model.Invoke;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.wst.wsdl.PortType;



import cn.edu.nju.cs.workflow.model.ModelFactory;
import cn.edu.nju.cs.workflow.model.SimpleTask;

import cn.edu.nju.cs.workflow.ui.diagram.WorkflowFeatureProvider;
import cn.edu.nju.cs.workflow.ui.util.ConfigureUtil;

public class SimpleTaskCreateFeature extends  AbstractCreateFeature{
	private PortType portType;

	public SimpleTaskCreateFeature(IFeatureProvider fp, PortType portType) {
		super(fp, "SimpleTask", "Create Simple Task");
		this.portType=portType;
	}
    @Override
    public String getCreateName() {

    	
    	return portType.getQName().getLocalPart();
    
    }
    @Override
    public String getCreateDescription() {
    	return portType.getQName().getNamespaceURI();
    }
	@Override
	public boolean canCreate(ICreateContext context) {
		// TODO Auto-generated method stub
		return context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public Object[] create(ICreateContext context) {
		// TODO Auto-generated method stub
		
		SimpleTask task=ModelFactory.eINSTANCE.createSimpleTask();
		task=configureTask(task);
	    addGraphicalRepresentation(context, task);
		getFeatureProvider().getDirectEditingInfo().setActive(true);
	    return new Object[] { task };
	}
	private SimpleTask configureTask(SimpleTask task){
		task.setId(ConfigureUtil.getId());
		task.setName(ConfigureUtil.getSimpleTaskName(getCreateName()));
		//getDiagram().eResource().getContents().add(task);
		task.setIsStartNode(true);
		task.setIsFinishNode(true);
		
		task.setPorttype(portType);
		WorkflowFeatureProvider provider=(WorkflowFeatureProvider) getFeatureProvider();
		task.setWorkflow(provider.getWorkflow());
		provider.getWorkflow().getNodes().add(task);
		provider.getWorkflow().getPortTypes().add(portType);
		return task;
	}
}
