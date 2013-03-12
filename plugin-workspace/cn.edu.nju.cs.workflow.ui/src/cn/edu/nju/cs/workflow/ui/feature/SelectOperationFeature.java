package cn.edu.nju.cs.workflow.ui.feature;


import java.util.ArrayList;

import java.util.List;



import org.eclipse.bpel.model.Assign;
import org.eclipse.bpel.model.BPELFactory;

import org.eclipse.bpel.model.Invoke;
import org.eclipse.bpel.model.PartnerLink;
import org.eclipse.bpel.model.Variable;
import org.eclipse.bpel.model.Process;
import org.eclipse.bpel.model.Variables;

import org.eclipse.bpel.model.Sequence;

import org.eclipse.bpel.ui.util.BPELUtil;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;




import org.eclipse.wst.wsdl.Message;
import org.eclipse.wst.wsdl.Operation;
import org.eclipse.wst.wsdl.Part;
import org.eclipse.wst.wsdl.PortType;





import cn.edu.nju.cs.workflow.dialog.SelectOperationDialog;
import cn.edu.nju.cs.workflow.model.SimpleTask;
import cn.edu.nju.cs.workflow.provider.OperationLabelProvider;
import cn.edu.nju.cs.workflow.ui.diagram.WorkflowFeatureProvider;


public class SelectOperationFeature  extends AbstractCustomFeature{
	private PartnerLink partnerLink;
	public SelectOperationFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(ICustomContext context) {
		// TODO Auto-generated method stub
		 PictogramElement[] pes = context.getPictogramElements();
	     Object bo = getBusinessObjectForPictogramElement(pes[0]);
	     SimpleTask task=(SimpleTask)bo;      
	     List<Operation> operationList=new ArrayList<Operation>();
		
			
			PortType porttype=task.getPorttype();
			System.out.println("PortType:"+porttype);
			@SuppressWarnings("unchecked")
			List<Operation> operations=porttype.getOperations();
			System.out.println("Operation.size:"+operations.size());
			operationList.addAll(operations);			
			Shell shell=PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
			SelectOperationDialog dialog=new SelectOperationDialog(shell, operationList.toArray(new Operation[operationList.size()]), new OperationLabelProvider());
		
			
			dialog.open();	
			Operation result=dialog.getOperation();
			if(result!=null){
				
				Operation operation=result;
				task.setOperation(operation);
				WorkflowFeatureProvider provider=(WorkflowFeatureProvider) getFeatureProvider();
				Process process=provider.getWorkflowProcess().getBpelProcess();
				Variables variables=process.getVariables();
				Variable input=BPELFactory.eINSTANCE.createVariable();
				
				input.setName(task.getName()+operation.getName()+"input");
				Message messageType=(Message)operation.getInput().getMessage();
				input.setMessageType(messageType);
				
				Variable output=BPELFactory.eINSTANCE.createVariable();
				
				
				output.setName(task.getName()+operation.getName()+"output");
				messageType=(Message)operation.getInput().getMessage();
				output.setMessageType(messageType);
				
				
				
				Assign assign=BPELFactory.eINSTANCE.createAssign();
				
				
				
				
				
				
				process.getVariables().getChildren().add(input);
				process.getVariables().getChildren().add(output);
				task.getInput().setInputValue(input);
				task.getOutputs().get(0).setOutputValue(output);
				
				PartnerLink partner = BPELFactory.eINSTANCE.createPartnerLink();
				String newName=porttype.getQName().getLocalPart()+"PL";
				newName = BPELUtil.generateUniqueModelName(process, newName, partner);
				partner.setName(newName);
			
				
//				PartnerLinkType partnerLinkType=PartnerlinktypeFactory.eINSTANCE.createPartnerLinkType();
//				Definition def=(Definition) porttype.getContainer();
//				partnerLinkType.setName(BPELUtil.generateUniqueModelName(def, partner.getName() + "PLT",partnerLinkType));
//				Role providerRole=PartnerlinktypeFactory.eINSTANCE.createRole();
//				providerRole.setPortType(porttype);
//				providerRole.setName(newName+"provider");
//				partnerLinkType.getRole().add(providerRole);
//				Role requesterRole=PartnerlinktypeFactory.eINSTANCE.createRole();
//				requesterRole.setPortType(porttype);
//				requesterRole.setName(newName+"requester");
//				partnerLinkType.getRole().add(requesterRole);
//				partner.setPartnerLinkType(partnerLinkType);
//				partner.setMyRole(providerRole);
//				partner.setPartnerRole(requesterRole);
				
				process.getPartnerLinks().getChildren().add(partner);
				Invoke invoke=BPELFactory.eINSTANCE.createInvoke();
				invoke.setInputVariable(input);
				invoke.setOutputVariable(output);
				invoke.setOperation(operation);
				invoke.setPortType(porttype);
				invoke.setPartnerLink(partner);
				
				((Sequence)process.getActivity()).getActivities().add(assign);
				((Sequence)process.getActivity()).getActivities().add(invoke);
				task.getInput().setAssign(assign);
				
			
				

			}

	}
	@Override
	public boolean canExecute(ICustomContext context) {
		// TODO Auto-generated method stub
		 PictogramElement[] pes = context.getPictogramElements();
	        if (pes != null && pes.length == 1) {
	            Object bo = getBusinessObjectForPictogramElement(pes[0]);
	            if (bo instanceof SimpleTask) {
	            	return true;	              
	            }
	        }
	        return false;
	}
	
	
	private void setVariableXmlType( Variable variable,Message msg) {
		if( msg.getEParts().size() == 1 ) {
				Part part = (Part) msg.getEParts().get( 0 );
				if( part.getTypeDefinition() != null )
					variable.setType( part.getTypeDefinition());
				else if( part.getElementDeclaration() != null ){
				
					variable.setXSDElement( part.getElementDeclaration());
				}
		}
		


	
	}


}
