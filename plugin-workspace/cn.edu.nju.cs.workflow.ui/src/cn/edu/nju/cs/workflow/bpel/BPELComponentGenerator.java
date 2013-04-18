package cn.edu.nju.cs.workflow.bpel;

import java.util.HashMap;
import java.util.Map;

import javax.xml.namespace.QName;

import org.eclipse.bpel.model.Assign;
import org.eclipse.bpel.model.BPELFactory;
import org.eclipse.bpel.model.Copy;
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
import org.eclipse.bpel.model.util.XSD2XMLGenerator;
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
	
	public Reply createReplyAcitvity(Operation operation, Sequence sequence){
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
			//reply.setPartnerLink( partnerLink );
			
			sequence.getActivities().add(0,reply);
			return reply;
			
		} 
		return null;
		
	}
	public Invoke createInvokeActivity(Operation operation, Sequence sequence){
		
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
	public Invoke replaceInvokeAcitivity(Operation operation, Invoke invoke){
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
		bpelProcess.getVariables().getChildren().add(input);
		bpelProcess.getVariables().getChildren().add(output);
		
		
		invoke.setName(BPELUtil.generateUniqueModelName(operation, operation.getName(), input));
		invoke.setInputVariable(input);
		invoke.setOutputVariable(output);
		invoke.setOperation(operation);
		invoke.setPortType((PortType) operation.eContainer());

		return invoke;
	}
	
	public Assign createAssignAcitvity(Variable variable, Sequence sequence){
		Assign assign = BPELFactory.eINSTANCE.createAssign();
		String name= "Assign" + variable.getName();
		assign.setName(BPELUtil.generateUniqueModelName(variable, name, assign));
		//assign.getCopy().add(initVariable(variable));
		sequence.getActivities().add(0,assign);
		return assign;
	}
	public Copy initVariable(Variable variable){
		String rootElement = null;
		String uriWSDL = null;

		// Variable is defined using "messageType"
		Message msg = variable.getMessageType();
		if (msg != null) {
			QName qname=QName.valueOf(msg.getQName().toString());
			rootElement = qname.getLocalPart();
			uriWSDL = msg.eResource().getURI().toString();
		}
		if (rootElement == null || uriWSDL == null) {
			return null;
		}
		XSD2XMLGenerator generator = new XSD2XMLGenerator(uriWSDL, rootElement);

		try {
			String literal = generator.createXML();
			Copy copy = BPELFactory.eINSTANCE.createCopy();
			
			To to = BPELFactory.eINSTANCE.createTo();
			From from = BPELFactory.eINSTANCE.createFrom();
			from.setLiteral(literal);
			copy.setFrom(from);
			to.setVariable(variable);
			copy.setTo(to);
			copy.setTo(to);
			
		} catch (Exception e) {
			throw new IllegalStateException(
					"Can't generate initializer, check WSDL file");
		}
		
		return null;
	}
//	public Copy assignVariable(){
//		
//	}
	public Assign replaceAssignActivity(Variable variable, Assign assign){
		
		String name= "Assign" + variable.getName();
		assign.setName(BPELUtil.generateUniqueModelName(variable, name, assign));
		
		return assign;
	}
	

}
