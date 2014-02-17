package cn.edu.nju.cs.workflow.bpel.aspect.actions;

import java.util.List;

import org.eclipse.bpel.model.Scope;
import org.eclipse.bpel.model.adapters.AdapterRegistry;
import org.eclipse.bpel.ui.Messages;
import org.eclipse.bpel.ui.adapters.ITerminationHandlerHolder;
import org.eclipse.bpel.ui.editparts.ScopeEditPart;
import org.eclipse.bpel.ui.util.BPELUtil;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.ui.IWorkbenchPart;

import cn.edu.nju.cs.workflow.bpel.aspect.editors.AspectEditor;
@SuppressWarnings("rawtypes")
public class BPELToggleShowTerminationHandler extends
		SelectionAction {

	public static final String ACTION_ID = "ToggleShowTerminationHandler"; //$NON-NLS-1$

	protected AspectEditor editor;

	public BPELToggleShowTerminationHandler(IWorkbenchPart part) {
		super(part);
		this.editor = (AspectEditor)part;
		setId(ACTION_ID);
		setText(Messages.ToggleShowTerminationHandler_Show_Termination_Handler_2);
		setToolTipText(Messages.ToggleShowTerminationHandler_Shows_termination_handler_activities_3);
	}

	@Override
	public void run() {
		List selList = getSelectedObjects();
		if (selList.size() == 1) {
			Scope scope = (Scope)selList.get(0);
			ScopeEditPart editPart = (ScopeEditPart)editor.getGraphicalViewer().getEditPartRegistry().get(scope);
			if (editPart != null) {
				boolean state = BPELUtil.getShowTerminationHandler(editPart);
				BPELUtil.setShowTerminationHandler(editPart, !state);
			}
		}
	}

	@Override
	protected boolean calculateEnabled() {
		List selList = getSelectedObjects();
		if (selList.size() != 1)
			return false;
		Object o = selList.get(0);
		if (o instanceof Scope) {
			ITerminationHandlerHolder holder = BPELUtil.adapt(o, ITerminationHandlerHolder.class);
			if (holder != null) {
				if (holder.getTerminationHandler(o) != null)
					return true;
			}
		}
		return false;
	}

	@Override
	public boolean isChecked() {
		List selList = getSelectedObjects();
		if (selList.size() == 1) {
			ScopeEditPart editPart = (ScopeEditPart)editor.getGraphicalViewer().getEditPartRegistry().get(selList.get(0));
			return BPELUtil.getShowTerminationHandler(editPart);
		}
		return false;
	}

}
