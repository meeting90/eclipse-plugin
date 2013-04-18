package cn.edu.nju.cs.workflow.ui.feature.create;

import org.eclipse.bpel.model.Assign;
import org.eclipse.bpel.model.BPELFactory;
import org.eclipse.bpel.model.Reply;
import org.eclipse.bpel.model.Sequence;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.wst.wsdl.Operation;
import org.eclipse.wst.wsdl.PortType;

import cn.edu.nju.cs.workflow.bpel.BPELComponentGenerator;
import cn.edu.nju.cs.workflow.model.InputPort;
import cn.edu.nju.cs.workflow.model.ModelFactory;
import cn.edu.nju.cs.workflow.model.SimpleTask;
import cn.edu.nju.cs.workflow.model.WorkflowNode;
import cn.edu.nju.cs.workflow.ui.diagram.WorkflowFeatureProvider;
import cn.edu.nju.cs.workflow.ui.util.ConfigureUtil;

public class EndTaskCreateFeature  extends  SimpleTaskCreateFeature{
	protected Operation operation;
	public EndTaskCreateFeature(IFeatureProvider fp, PortType portType,Operation operation) {
		super(fp, portType);
		this.operation=operation;
		// TODO Auto-generated constructor stub
	}
	@Override
	protected SimpleTask configureTask(SimpleTask task) {
		// TODO Auto-generated method stub
		task= super.configureTask(task);
		task.setIsFinishNode(true);
		task.setOperation(operation);
		InputPort port=ModelFactory.eINSTANCE.createInputPort();
		task.setInput(port);
		port.setNode(task);
		
		WorkflowFeatureProvider provider=(WorkflowFeatureProvider) getFeatureProvider();
		provider.getWorkflow().getNodes().add(task);
		BPELComponentGenerator bpelGen=new BPELComponentGenerator(provider.getWorkflowProcess().getBpelProcess());	
		Sequence sequence=(Sequence) provider.getWorkflow().getActivity();
		Operation operation=task.getOperation();
		
		Reply reply=bpelGen.createReplyAcitvity(operation, sequence);
		Assign assign=bpelGen.createAssignAcitvity(reply.getVariable(), sequence);
		port.setAssign(assign);
		port.setInputValue(reply.getVariable());
		task.setPartnerActivity(reply);
		return task;
	}

	

}

