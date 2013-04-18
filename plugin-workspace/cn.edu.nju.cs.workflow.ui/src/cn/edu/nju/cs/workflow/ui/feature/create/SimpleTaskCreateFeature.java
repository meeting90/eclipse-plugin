package cn.edu.nju.cs.workflow.ui.feature.create;

import javax.xml.namespace.QName;

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
	protected PortType portType;
	

	public SimpleTaskCreateFeature(IFeatureProvider fp, PortType portType) {
		super(fp, "SimpleTask", "Create Simple Task");
		this.portType=portType;
	}
    @Override
    public String getCreateName() {
    	QName qname=QName.valueOf( portType.getQName().toString());
    	return qname.getLocalPart();
    
    }
    @Override
    public String getCreateDescription() {
    	QName qname=QName.valueOf( portType.getQName().toString());
    	return qname.getNamespaceURI();
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
	protected SimpleTask configureTask(SimpleTask task){
		task.setId(ConfigureUtil.getId());
		task.setName(ConfigureUtil.getSimpleTaskName(getCreateName()));	
		task.setPorttype(portType);
		WorkflowFeatureProvider provider=(WorkflowFeatureProvider) getFeatureProvider();
		task.setWorkflow(provider.getWorkflow());
		provider.getWorkflow().getNodes().add(task);
		return task;
	}
}
