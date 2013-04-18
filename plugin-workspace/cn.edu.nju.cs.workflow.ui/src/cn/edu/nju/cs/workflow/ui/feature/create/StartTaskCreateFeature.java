package cn.edu.nju.cs.workflow.ui.feature.create;

import org.eclipse.bpel.model.Assign;
import org.eclipse.bpel.model.OnMessage;
import org.eclipse.bpel.model.Pick;
import org.eclipse.bpel.model.Reply;
import org.eclipse.bpel.model.Sequence;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.wst.wsdl.Operation;
import org.eclipse.wst.wsdl.PortType;

import cn.edu.nju.cs.workflow.bpel.BPELComponentGenerator;
import cn.edu.nju.cs.workflow.model.ModelFactory;
import cn.edu.nju.cs.workflow.model.OutputPort;
import cn.edu.nju.cs.workflow.model.SimpleTask;
import cn.edu.nju.cs.workflow.model.WorkflowNode;
import cn.edu.nju.cs.workflow.ui.diagram.WorkflowFeatureProvider;
import cn.edu.nju.cs.workflow.ui.util.ConfigureUtil;

public class StartTaskCreateFeature  extends  SimpleTaskCreateFeature{
	protected Operation operation;
	public StartTaskCreateFeature(IFeatureProvider fp, PortType portType,Operation operation) {
		super(fp, portType);
		this.operation=operation;
		// TODO Auto-generated constructor stub
	}
	@Override
	protected SimpleTask configureTask(SimpleTask task) {
		// TODO Auto-generated method stub
		getDiagram().setActive(true);
		task= super.configureTask(task);
		task.setOperation(operation);
		task.setIsStartNode(true);
		OutputPort port=ModelFactory.eINSTANCE.createOutputPort();
		port.setNode(task);
		task.getOutputs().add(port);
		WorkflowFeatureProvider provider=(WorkflowFeatureProvider) getFeatureProvider();
		BPELComponentGenerator bpelGen=new BPELComponentGenerator(provider.getWorkflowProcess().getBpelProcess());	
		
		Pick pick=(Pick) provider.getWorkflow().getActivity();
		Operation operation=task.getOperation();
		OnMessage onMsg=bpelGen.createOnMessageActivity(operation, pick);
		provider.getWorkflow().setActivity(onMsg.getActivity());
		port.setOutputValue(onMsg.getVariable());
		task.setPartnerActivity(onMsg);
		provider.getWorkflow().getNodes().add(task);
		return task;
	}

}
