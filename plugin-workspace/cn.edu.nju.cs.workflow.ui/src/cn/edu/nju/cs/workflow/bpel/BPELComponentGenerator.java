package cn.edu.nju.cs.workflow.bpel;

import java.util.HashMap;
import java.util.Map;
import org.eclipse.bpel.model.Assign;
import org.eclipse.bpel.model.BPELFactory;
import org.eclipse.bpel.model.Copy;
import org.eclipse.bpel.model.Expression;
import org.eclipse.bpel.model.From;
import org.eclipse.bpel.model.Invoke;
import org.eclipse.bpel.model.OnMessage;
import org.eclipse.bpel.model.PartnerLink;
import org.eclipse.bpel.model.Pick;
import org.eclipse.bpel.model.Process;
import org.eclipse.bpel.model.Reply;
import org.eclipse.bpel.model.Sequence;
import org.eclipse.bpel.model.To;
import org.eclipse.bpel.model.Variable;
import org.eclipse.bpel.ui.util.BPELUtil;
import org.eclipse.wst.wsdl.Message;
import org.eclipse.wst.wsdl.Operation;
import org.eclipse.wst.wsdl.PortType;


public class BPELComponentGenerator {
	Process bpelProcess=null;
	Map<Operation,PartnerLink> operationPTMap=new HashMap<Operation, PartnerLink>();
	
	public BPELComponentGenerator(Process bpelProcess){
		this.bpelProcess=bpelProcess;
	}
	public OnMessage createOnMessageActivity(Operation operation,Pick pick){
		String opName = org.eclipse.bpel.ui.util.BPELUtil.lowerCaseFirstLetter( operation.getName());
		// Input: create the variable...
		Variable var = BPELFactory.eINSTANCE.createVariable();
		var.setName( opName + "Request" );
		var.setMessageType(operation.getEInput().getEMessage());
		bpelProcess.getVariables().getChildren().add( var );

		// ... and add an OnMessage activity
		OnMessage onMessage = BPELFactory.eINSTANCE.createOnMessage();
		//onMessage.setPartnerLink( partnerLink );
		onMessage.setVariable( var );
		onMessage.setOperation( operation );
		onMessage.setPortType((PortType) operation.eContainer());
		pick.getMessages().add( onMessage );
		Sequence sequence=BPELFactory.eINSTANCE.createSequence();
		sequence.setName("impl"+opName);
		onMessage.setActivity(sequence);
		return onMessage;
	}
	
	public Reply createReplyNode(Operation operation, Sequence sequence){
		String opName = org.eclipse.bpel.ui.util.BPELUtil.lowerCaseFirstLetter( operation.getName());
		//PartnerLink partnerLink=findPartnerLink(((PortType)operation.eContainer()).getQName());
		if( operation.getOutput() != null ) {
			Variable var = BPELFactory.eINSTANCE.createVariable();
			// Create the variable...
			
			var.setName( opName + "Response" );
			var.setMessageType(operation.getEOutput().getEMessage());
			bpelProcess.getVariables().getChildren().add( var );

			// And add a Reply activity
			Reply reply = BPELFactory.eINSTANCE.createReply();
			reply.setName( "ReplyTo" + org.eclipse.bpel.ui.util.BPELUtil.upperCaseFirstLetter( opName ));
			reply.setVariable( var );
			reply.setOperation( operation );
			reply.setPortType((PortType) operation.eContainer());
			sequence.getActivities().add(0,reply);
			return reply;
			
		} 
		return null;
		
	}
	public Invoke createInvokeNode(Operation operation, Sequence sequence){
		
		Variable input=BPELFactory.eINSTANCE.createVariable();
		String name=operation.getName()+"Request";
		input.setName(BPELUtil.generateUniqueModelName(operation, name, input));
		Message messageType=(Message)operation.getInput().getMessage();
		input.setMessageType(messageType);
		
		Variable output=BPELFactory.eINSTANCE.createVariable();
		
		name=operation.getName()+"Response";
		output.setName(BPELUtil.generateUniqueModelName(operation, name, input));
		messageType=(Message)operation.getOutput().getMessage();
		output.setMessageType(messageType);
		bpelProcess.getVariables().getChildren().add(input);
		bpelProcess.getVariables().getChildren().add(output);
		
		
		Invoke invoke=BPELFactory.eINSTANCE.createInvoke();
		invoke.setName(BPELUtil.generateUniqueModelName(operation, operation.getName(), input));
		invoke.setInputVariable(input);
		invoke.setOutputVariable(output);
		invoke.setOperation(operation);
		invoke.setPortType((PortType) operation.eContainer());
		
		
	
		sequence.getActivities().add(0, invoke);
		return invoke;
	}
	public Invoke replaceInvokeNode(Operation operation, Invoke invoke){
		Variable input=invoke.getInputVariable();
		String name=operation.getName()+"Request";
		input.setName(BPELUtil.generateUniqueModelName(operation, name, input));
		Message messageType=(Message)operation.getInput().getMessage();
		input.setMessageType(messageType);
		
		Variable output=invoke.getOutputVariable();
		
		name=operation.getName()+"Response";
		output.setName(BPELUtil.generateUniqueModelName(operation, name, input));
		messageType=(Message)operation.getInput().getMessage();
		output.setMessageType(messageType);
		
		//bpelProcess.getVariables().getChildren().set(findVariableIndex(input), input);
		//bpelProcess.getVariables().getChildren().add(findVariableIndex(output),output);
		
		
		invoke.setName(BPELUtil.generateUniqueModelName(operation, operation.getName(), input));
		invoke.setInputVariable(input);
		invoke.setOutputVariable(output);
		invoke.setOperation(operation);
		invoke.setPortType((PortType) operation.eContainer());

		return invoke;
	}
	
	public Assign createAssignNode(Variable variable, Sequence sequence){
		Assign assign = BPELFactory.eINSTANCE.createAssign();
		String name= "Assign" + variable.getName();
		assign.setName(BPELUtil.generateUniqueModelName(variable, name, assign));
		
		sequence.getActivities().add(0,assign);
		return assign;
	}
	
    public Copy createCopyNode(Assign assign,String fromStr, String toStr){
    	From from=BPELFactory.eINSTANCE.createFrom();
		Expression expression=BPELFactory.eINSTANCE.createExpression();
		
		expression.setBody(fromStr);
		from.setExpression(expression);

		expression=BPELFactory.eINSTANCE.createExpression();
		expression.setBody(toStr);
		To to=BPELFactory.eINSTANCE.createTo();
		to.setExpression(expression);

		
		Copy copy=BPELFactory.eINSTANCE.createCopy();
		copy.setFrom(from);
		copy.setTo(to);
		assign.getCopy().add(copy);
		
		return copy;
	
    }
    public Copy replaceCopyNode(Copy copy, String fromStr,String toStr){
    	copy.getFrom().getExpression().setBody(fromStr);
    	copy.getTo().getExpression().setBody(toStr);
    	return copy;
    }
	public Assign replaceAssignNode(Variable variable, Assign assign){
		
		String name= "Assign" + variable.getName();
		assign.setName(BPELUtil.generateUniqueModelName(variable, name, assign));
		
		return assign;
	}

}
