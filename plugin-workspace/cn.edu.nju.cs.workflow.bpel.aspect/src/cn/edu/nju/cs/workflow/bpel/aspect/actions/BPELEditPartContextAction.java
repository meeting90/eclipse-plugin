package cn.edu.nju.cs.workflow.bpel.aspect.actions;

import org.eclipse.bpel.ui.actions.EditPartContextAction;
import org.eclipse.bpel.ui.actions.editpart.IEditPartAction;
import org.eclipse.gef.EditPart;
import org.eclipse.ui.IWorkbenchPart;

public class BPELEditPartContextAction extends EditPartContextAction {

	public BPELEditPartContextAction(IWorkbenchPart part, EditPart editPart,
			IEditPartAction action) {
		super(part, editPart, action);
	}

	

}
