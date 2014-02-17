package cn.edu.nju.cs.workflow.bpel.aspect.adapters;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.bpel.ui.actions.editpart.AbstractAction;
import org.eclipse.bpel.ui.adapters.ICompensationHandlerHolder;
import org.eclipse.bpel.ui.adapters.IEventHandlerHolder;
import org.eclipse.bpel.ui.adapters.IFaultHandlerHolder;
import org.eclipse.bpel.ui.adapters.ITerminationHandlerHolder;
import org.eclipse.bpel.ui.adapters.SequenceAdapter;
import org.eclipse.bpel.ui.util.BPELUtil;
import org.eclipse.bpel.ui.util.FlowLinkUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;

import cn.edu.nju.cs.workflow.bpel.aspect.actions.BPELCreateCompensationHandlerAction;
import cn.edu.nju.cs.workflow.bpel.aspect.actions.BPELCreateEventHandlerAction;
import cn.edu.nju.cs.workflow.bpel.aspect.actions.BPELCreateFaultHandlerAction;
import cn.edu.nju.cs.workflow.bpel.aspect.actions.BPELCreateFlowLinkAction;
import cn.edu.nju.cs.workflow.bpel.aspect.actions.BPELCreateTerminationHandlerAction;

public class BPELSequenceAdapter extends SequenceAdapter {

	@Override
	public List<AbstractAction> getEditPartActions(EditPart editPart) {

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
		IEventHandlerHolder ieh =BPELUtil.adapt(modelObject, IEventHandlerHolder.class);
		if (ieh != null && ieh.getEventHandler(modelObject) == null) {
	    	actions.add(new BPELCreateEventHandlerAction(editPart));
		}
		if (FlowLinkUtil.hasParentFlow((EObject)modelObject)) {
			actions.add(new BPELCreateFlowLinkAction(editPart));
		}
		return actions;
		
		
	}
}
