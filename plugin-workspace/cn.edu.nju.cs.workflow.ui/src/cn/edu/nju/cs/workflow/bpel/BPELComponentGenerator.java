package cn.edu.nju.cs.workflow.bpel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.bpel.model.Activity;
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
import org.eclipse.bpel.model.Receive;
import org.eclipse.bpel.model.Reply;
import org.eclipse.bpel.model.Scope;
import org.eclipse.bpel.model.Sequence;
import org.eclipse.bpel.model.To;
import org.eclipse.bpel.model.Variable;
import org.eclipse.bpel.ui.util.BPELUtil;
import org.eclipse.emf.common.util.EList;
import org.eclipse.wst.wsdl.Message;
import org.eclipse.wst.wsdl.Operation;
import org.eclipse.wst.wsdl.PortType;

public class BPELComponentGenerator {
	Process bpelProcess = null;
	Map<Operation, PartnerLink> operationPTMap = new HashMap<Operation, PartnerLink>();

	public BPELComponentGenerator(Process bpelProcess) {
		this.bpelProcess = bpelProcess;
	}

	public OnMessage createOnMessageActivity(Operation operation, Pick pick) {
		String opName = org.eclipse.bpel.ui.util.BPELUtil
				.lowerCaseFirstLetter(operation.getName());
		// Input: create the variable...
		Variable var = BPELFactory.eINSTANCE.createVariable();
		var.setName(opName + "Request");
		var.setMessageType(operation.getEInput().getEMessage());
		bpelProcess.getVariables().getChildren().add(var);

		// ... and add an OnMessage activity
		OnMessage onMessage = BPELFactory.eINSTANCE.createOnMessage();
		// onMessage.setPartnerLink( partnerLink );
		onMessage.setVariable(var);
		onMessage.setOperation(operation);
		onMessage.setPortType((PortType) operation.eContainer());
		pick.getMessages().add(onMessage);
		
		onMessage.setActivity(createScopeNode("scope_"+opName));
	
		return onMessage;
	}
	public Scope  createScopeNode(String name){
		Scope scope=BPELFactory.eINSTANCE.createScope();
		scope.setName(name);
		scope.setActivity(BPELFactory.eINSTANCE.createSequence());
		scope.setVariables(BPELFactory.eINSTANCE.createVariables());
		scope.setPartnerLinks(BPELFactory.eINSTANCE.createPartnerLinks());
		scope.setCorrelationSets(BPELFactory.eINSTANCE.createCorrelationSets());
		return scope;
	}

	public Reply createReplyNode(Operation operation, Scope scope,Sequence sequence) {
		String opName = org.eclipse.bpel.ui.util.BPELUtil
				.lowerCaseFirstLetter(operation.getName());
		// PartnerLink
		// partnerLink=findPartnerLink(((PortType)operation.eContainer()).getQName());
		if (operation.getOutput() != null) {
			Variable var = BPELFactory.eINSTANCE.createVariable();
			// Create the variable...

			var.setName(opName + "Response");
			var.setMessageType(operation.getEOutput().getEMessage());
			scope.getVariables().getChildren().add(var);

			// And add a Reply activity
			Reply reply = BPELFactory.eINSTANCE.createReply();
			reply.setName("ReplyTo"
					+ org.eclipse.bpel.ui.util.BPELUtil
							.upperCaseFirstLetter(opName));
			reply.setVariable(var);
			reply.setOperation(operation);
			reply.setPortType((PortType) operation.eContainer());
			sequence.getActivities().add(0, reply);
			return reply;

		}
		return null;

	}
    public Receive createReceiveNode(Operation operation, Scope scope,Sequence sequence){
    	Variable input = BPELFactory.eINSTANCE.createVariable();
		String name = operation.getName() + "Response";
		input.setName(BPELUtil.generateUniqueModelName(scope, name, input));
		Message messageType = (Message) operation.getInput().getMessage();
		
		input.setMessageType(messageType);
		scope.getVariables().getChildren().add(input);
		Receive receive = BPELFactory.eINSTANCE.createReceive();
		receive.setName(BPELUtil.generateUniqueModelName(operation,
				operation.getName(), input));
		receive.setVariable(input);
		receive.setOperation(operation);
		receive.setPortType((PortType) operation.eContainer());

		sequence.getActivities().add(0, receive);
		return receive;
    }
    public Receive replaceReceiveNode(Operation operation, Scope scope,Activity activity){
    	Variable input=null;
    	if(activity instanceof Receive){
    		input =((Receive)activity).getVariable();
    	}else if(activity instanceof Invoke){
    		input=((Invoke)activity).getInputVariable();
    	}
    	((Sequence)scope.getActivity()).getActivities().remove(activity);
		String name = operation.getName() + "Response";
		input.setName(BPELUtil.generateUniqueModelName(scope, name, input));
		Message messageType = (Message) operation.getInput().getMessage();
		
		input.setMessageType(messageType);
		scope.getVariables().getChildren().add(input);
		Receive receive=BPELFactory.eINSTANCE.createReceive();
		receive.setName(BPELUtil.generateUniqueModelName(operation,
				operation.getName(), input));
		receive.setVariable(input);
		receive.setOperation(operation);
		receive.setPortType((PortType) operation.eContainer());
		((Sequence)scope.getActivity()).getActivities().add(0,receive);
		return receive;
    }
	public Invoke createInvokeNode(Operation operation, Scope scope,Sequence sequence) {

		Variable input = BPELFactory.eINSTANCE.createVariable();
		String name = operation.getName() + "Request";
		input.setName(BPELUtil.generateUniqueModelName(scope, name, input));
		Message messageType = (Message) operation.getInput().getMessage();
		
		input.setMessageType(messageType);
		scope.getVariables().getChildren().add(input);
		
		Variable output = null;
		if(operation.getOutput()!=null){
			output=BPELFactory.eINSTANCE.createVariable();
			name = operation.getName() + "Response";
			output.setName(BPELUtil.generateUniqueModelName(scope, name, output));
			messageType = (Message) operation.getOutput().getMessage();
			output.setMessageType(messageType);
			scope.getVariables().getChildren().add(output);
		}
	
		

		Invoke invoke = BPELFactory.eINSTANCE.createInvoke();
		invoke.setName(BPELUtil.generateUniqueModelName(operation,
				operation.getName(), input));
		invoke.setInputVariable(input);
		invoke.setOutputVariable(output);
		invoke.setOperation(operation);
		invoke.setPortType((PortType) operation.eContainer());

		sequence.getActivities().add(0, invoke);
		return invoke;
	}

	public Invoke replaceInvokeNode(Operation operation, Scope scope,Activity activity) {
		Variable input = null;
		if(activity instanceof Receive){
    		input =((Receive)activity).getVariable();
    	}else if(activity instanceof Invoke){
    		input=((Invoke)activity).getInputVariable();
    	}
		String name = operation.getName() + "Request";
		input.setName(BPELUtil.generateUniqueModelName(bpelProcess, name, input));
		Message messageType = (Message) operation.getInput().getMessage();
		input.setMessageType(messageType);
		
		Variable output =null;
		if(operation.getOutput()!=null){
			
			if(activity instanceof Invoke &&((Invoke)activity).getOutputVariable()!=null)
				output=((Invoke)activity).getOutputVariable();
			else{
				output=BPELFactory.eINSTANCE.createVariable();
				scope.getVariables().getChildren().add(output);
			}
			name = operation.getName() + "Response";
			output.setName(BPELUtil.generateUniqueModelName(bpelProcess, name, output));
			messageType = (Message) operation.getOutput().getMessage();
			output.setMessageType(messageType);
		}
		((Sequence)scope.getActivity()).getActivities().remove(activity);
		Invoke invoke=BPELFactory.eINSTANCE.createInvoke();
		invoke.setName(BPELUtil.generateUniqueModelName(operation,
				operation.getName(), input));
		invoke.setInputVariable(input);
		invoke.setOutputVariable(output);
		invoke.setOperation(operation);
		invoke.setPortType((PortType) operation.eContainer());

		return invoke;
	}

	public Assign createAssignNode(Variable variable, Sequence sequence) {
		Assign assign = BPELFactory.eINSTANCE.createAssign();
		String name = "Assign" + variable.getName();
		assign.setName(BPELUtil.generateUniqueModelName(variable, name, assign));

		sequence.getActivities().add(0, assign);
		return assign;
	}

	public Copy createCopyNode(Assign assign, String fromStr, String toStr) {
		From from = BPELFactory.eINSTANCE.createFrom();
		Expression expression = BPELFactory.eINSTANCE.createExpression();

		expression.setBody(fromStr);
		from.setExpression(expression);

		expression = BPELFactory.eINSTANCE.createExpression();
		expression.setBody(toStr);
		To to = BPELFactory.eINSTANCE.createTo();
		to.setExpression(expression);

		Copy copy = BPELFactory.eINSTANCE.createCopy();
		copy.setFrom(from);
		copy.setTo(to);
		assign.getCopy().add(copy);

		return copy;

	}

	public Copy replaceCopyNode(List<Copy> copys, String fromStr, String toStr) {
		Copy copy=copys.get(0);
		copy.getFrom().getExpression().setBody(fromStr);
		copy.getTo().getExpression().setBody(toStr);
		Assign assign=(Assign) copy.eContainer();
		copys.remove(copy);
		assign.getCopy().removeAll(copys);
		return copy;
	}

	public Assign replaceAssignNode(Variable variable, Assign assign) {

		String name = "Assign" + variable.getName();
		assign.setName(BPELUtil.generateUniqueModelName(variable, name, assign));

		return assign;
	}

	public void reorderCopyNode(Assign assign, int oldIndex, int newIndex) {
		if (oldIndex == newIndex)
			return;
		EList<Copy> list = assign.getCopy();
		List<Copy> newList = new ArrayList<Copy>();
		Copy currentCopy = list.get(oldIndex);
		boolean flag = oldIndex < newIndex;
		int start = flag ? oldIndex : newIndex;
		int end = flag ? newIndex : oldIndex;
		int i = 0;
		while (i < list.size()) {
			if (i < start)
				newList.add(list.get(i));
			else if (i > end)
				newList.add(list.get(i));
			else {

				if (i == newIndex){	
					if(flag){
						newList.add(list.get(i));
						newList.add(currentCopy);
					}else{
						newList.add(currentCopy);
						newList.add(list.get(i));
					}
				}
				else if (i == oldIndex)
					;
				else
					newList.add(list.get(i));

			}
			i++;

		}
		assign.getCopy().removeAll(list);
		assign.getCopy().addAll(newList);
	}

	
}
