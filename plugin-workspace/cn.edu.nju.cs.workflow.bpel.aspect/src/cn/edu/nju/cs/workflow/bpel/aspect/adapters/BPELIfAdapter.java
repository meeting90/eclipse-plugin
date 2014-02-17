package cn.edu.nju.cs.workflow.bpel.aspect.adapters;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.bpel.model.BPELPackage;
import org.eclipse.bpel.model.If;
import org.eclipse.bpel.ui.actions.editpart.AbstractAction;
import org.eclipse.bpel.ui.adapters.ICompensationHandlerHolder;
import org.eclipse.bpel.ui.adapters.IContainer;
import org.eclipse.bpel.ui.adapters.IEventHandlerHolder;
import org.eclipse.bpel.ui.adapters.IFaultHandlerHolder;
import org.eclipse.bpel.ui.adapters.ITerminationHandlerHolder;
import org.eclipse.bpel.ui.adapters.IfAdapter;
import org.eclipse.bpel.ui.adapters.delegates.MultiContainer;
import org.eclipse.bpel.ui.adapters.delegates.ReferenceContainer;
import org.eclipse.bpel.ui.util.BPELUtil;
import org.eclipse.bpel.ui.util.FlowLinkUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;

import cn.edu.nju.cs.workflow.bpel.aspect.actions.BPELCreateCompensationHandlerAction;
import cn.edu.nju.cs.workflow.bpel.aspect.actions.BPELCreateElseAction;
import cn.edu.nju.cs.workflow.bpel.aspect.actions.BPELCreateElseIfAction;
import cn.edu.nju.cs.workflow.bpel.aspect.actions.BPELCreateEventHandlerAction;
import cn.edu.nju.cs.workflow.bpel.aspect.actions.BPELCreateFaultHandlerAction;
import cn.edu.nju.cs.workflow.bpel.aspect.actions.BPELCreateFlowLinkAction;
import cn.edu.nju.cs.workflow.bpel.aspect.actions.BPELCreateTerminationHandlerAction;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.delegates.BPELActivityContainer;

public class BPELIfAdapter extends IfAdapter {

	/* IContainer delegate */
	
	@Override
	public IContainer<?> createContainerDelegate() {
		MultiContainer omc = new MultiContainer();
		omc.add(new BPELActivityContainer(BPELPackage.eINSTANCE.getIf_Activity()));
		omc.add(new ReferenceContainer(BPELPackage.eINSTANCE.getIf_ElseIf()));
		omc.add(new ReferenceContainer(BPELPackage.eINSTANCE.getIf_Else()));
		return omc;
	}

	
	/* IEditPartActionContributor */
	
	@Override
	public List<AbstractAction> getEditPartActions(final EditPart editPart) {
		
		List<AbstractAction> actions = new ArrayList<AbstractAction>();
		Object modelObject = editPart.getModel();
		
		IFaultHandlerHolder ifh = BPELUtil.adapt(modelObject, IFaultHandlerHolder.class);
		if (ifh != null && ifh.getFaultHandler(modelObject) == null) {
			actions.add(new BPELCreateFaultHandlerAction(editPart));
		}			
		ICompensationHandlerHolder ich = BPELUtil.adapt(modelObject, ICompensationHandlerHolder.class);
		if (ich != null && ich.getCompensationHandler(modelObject) == null) {
    		actions.add(new BPELCreateCompensationHandlerAction(editPart));
		}
		ITerminationHandlerHolder ith = BPELUtil.adapt(modelObject, ITerminationHandlerHolder.class);
		if (ith != null && ith.getTerminationHandler(modelObject) == null) {
    		actions.add(new BPELCreateTerminationHandlerAction(editPart));
		}
		IEventHandlerHolder ieh = BPELUtil.adapt(modelObject, IEventHandlerHolder.class);
		if (ieh != null && ieh.getEventHandler(modelObject) == null) {
	    	actions.add(new BPELCreateEventHandlerAction(editPart));
		}
		if (FlowLinkUtil.hasParentFlow((EObject)modelObject)) {
			actions.add(new BPELCreateFlowLinkAction(editPart));
		}

		
		
		actions.add(new BPELCreateElseIfAction(editPart));		  
		if (((If)modelObject).getElse() == null) {
			actions.add(new BPELCreateElseAction(editPart));
		}
		return actions;
	}
	

}
