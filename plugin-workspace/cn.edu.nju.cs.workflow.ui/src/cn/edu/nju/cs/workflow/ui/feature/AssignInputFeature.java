package cn.edu.nju.cs.workflow.ui.feature;



import org.eclipse.bpel.model.Variable;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;


import cn.edu.nju.cs.workflow.dialog.AssignInputDialog;
import cn.edu.nju.cs.workflow.model.InputPort;
import cn.edu.nju.cs.workflow.ui.diagram.WorkflowFeatureProvider;


public class AssignInputFeature  extends AbstractCustomFeature{

	public AssignInputFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(ICustomContext context) {
		// TODO Auto-generated method stub

         WorkflowFeatureProvider provider=(WorkflowFeatureProvider) this.getFeatureProvider();
		 PictogramElement[] pes = context.getPictogramElements();
		 Object bo = getBusinessObjectForPictogramElement(pes[0]);
		 InputPort port=(InputPort)bo;
		 
	     Variable input=port.getInputValue();
	     
	     
	
	    
	 	 Shell shell=PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		
	 	 AssignInputDialog dialog = new AssignInputDialog (
	        		shell, input,null, provider.getBpelGenerator(),port.getAssign()
	        		);
	 	
	        dialog.open();
	 	
	      
	
	    
	}
	@Override
	public boolean canExecute(ICustomContext context) {
		// TODO Auto-generated method stub
		 PictogramElement[] pes = context.getPictogramElements();
	        if (pes != null && pes.length == 1) {
	            Object bo = getBusinessObjectForPictogramElement(pes[0]);
	            if (bo instanceof InputPort) {
	            	return true;	              
	            }
	        }
	        return false;
	}

}
