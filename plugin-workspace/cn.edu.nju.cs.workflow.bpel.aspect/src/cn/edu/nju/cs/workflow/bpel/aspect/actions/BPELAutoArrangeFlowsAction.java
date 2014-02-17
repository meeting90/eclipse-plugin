package cn.edu.nju.cs.workflow.bpel.aspect.actions;

import java.util.Iterator;
import java.util.List;

import org.eclipse.bpel.ui.actions.AutoArrangeFlowsAction;
import org.eclipse.bpel.ui.editparts.FlowEditPart;
import org.eclipse.gef.EditPart;
import org.eclipse.ui.IWorkbenchPart;

public class BPELAutoArrangeFlowsAction extends AutoArrangeFlowsAction {

	public BPELAutoArrangeFlowsAction(IWorkbenchPart part) {
		super(part);
	}
	@SuppressWarnings("rawtypes")
	@Override
	protected boolean calculateEnabled() {
		List sel = getSelectedObjects();
		return sel.size() > 0 && 
				hasTargetFlows2(sel);
	}
	@SuppressWarnings("rawtypes")
	private boolean hasTargetFlows2(List selectedObjects) {
		boolean foundFlow = false;
		for (Iterator it = selectedObjects.iterator(); it.hasNext(); ) {
			Object object = it.next();
			if (object instanceof FlowEditPart) {
				foundFlow = true;
				if (isFreeform((FlowEditPart)object))  return true;
			}
		}
		if (!foundFlow) {
			// There are no flows selected.  Instead, return any FlowEditParts which are
			// parents of a selected object and are freeform.
			for (Iterator it = selectedObjects.iterator(); it.hasNext(); ) {
				Object object = it.next();
				if (object instanceof EditPart) {
					object = ((EditPart)object).getParent();
					if (object instanceof FlowEditPart) {
						foundFlow = true;
						if (isFreeform((FlowEditPart)object))  return true;
					}
				}
			}
		}
		return false;
	}

}
