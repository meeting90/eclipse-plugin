package cn.edu.nju.cs.workflow.ui.feature;


import java.util.ArrayList;

import java.util.List;




import org.eclipse.bpel.model.Activity;
import org.eclipse.bpel.model.Assign;
import org.eclipse.bpel.model.Receive;
import org.eclipse.bpel.model.Scope;

import org.eclipse.bpel.model.Invoke;

import org.eclipse.bpel.model.Sequence;


import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;



import org.eclipse.wst.wsdl.Operation;

import org.eclipse.wst.wsdl.PortType;





import cn.edu.nju.cs.workflow.bpel.BPELComponentGenerator;
import cn.edu.nju.cs.workflow.dialog.SelectOperationDialog;
import cn.edu.nju.cs.workflow.model.SimpleTask;
import cn.edu.nju.cs.workflow.provider.OperationLabelProvider;
import cn.edu.nju.cs.workflow.ui.diagram.WorkflowFeatureProvider;


public class SelectOperationFeature  extends AbstractCustomFeature{
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
			boolean isInvoke=dialog.getIsInvoke();
			if(result!=null){
				
				Operation operation=result;
				task.setOperation(operation);
				WorkflowFeatureProvider provider=(WorkflowFeatureProvider) getFeatureProvider();
				BPELComponentGenerator bpelGen=provider.getBpelGenerator();
				Invoke invoke;
				Assign assign;
				Scope scope=(Scope) task.getWorkflow().getActivity();
				if(isInvoke){
					if(task.getPartnerActivity()==null){
						
						invoke=bpelGen.createInvokeNode(operation, scope,(Sequence)scope.getActivity());
						assign=bpelGen.createAssignNode(invoke.getInputVariable(), (Sequence)scope.getActivity());
					}else{
						invoke=bpelGen.replaceInvokeNode(operation,scope,(Invoke) task.getPartnerActivity());
						assign=bpelGen.replaceAssignNode(invoke.getInputVariable(), task.getInput().getAssign());
					}		
					task.getInput().setInputValue(invoke.getInputVariable());
					task.getOutputs().get(0).setOutputValue(invoke.getOutputVariable());
					task.getInput().setAssign(assign);
					task.setPartnerActivity(invoke);
				}else{
					Receive receive;
					if(task.getPartnerActivity()==null){
						
						receive=bpelGen.createReceiveNode(operation, scope,(Sequence)scope.getActivity());
						
					}else{
						receive=bpelGen.replaceReceiveNode(operation, scope, (Activity) task.getPartnerActivity());
						
					}
					task.getInput().setInputValue(receive.getVariable());
					task.getOutputs().get(0).setOutputValue(null);
					task.getInput().setAssign(null);
					task.setPartnerActivity(receive);
				}
				
				
			
			
				

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
}
