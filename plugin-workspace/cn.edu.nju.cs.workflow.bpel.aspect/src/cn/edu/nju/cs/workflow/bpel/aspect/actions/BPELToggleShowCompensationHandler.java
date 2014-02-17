package cn.edu.nju.cs.workflow.bpel.aspect.actions;

import java.util.List;

import org.eclipse.bpel.model.Scope;
import org.eclipse.bpel.ui.Messages;
import org.eclipse.bpel.ui.adapters.ICompensationHandlerHolder;
import org.eclipse.bpel.ui.editparts.ScopeEditPart;
import org.eclipse.bpel.ui.util.BPELUtil;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.ui.IWorkbenchPart;

import cn.edu.nju.cs.workflow.bpel.aspect.editors.AspectEditor;
@SuppressWarnings("rawtypes")
public class BPELToggleShowCompensationHandler extends
		SelectionAction {


	public static final String ACTION_ID = "ToggleShowCompensationHandler"; //$NON-NLS-1$
	
	protected AspectEditor editor;
	
	public BPELToggleShowCompensationHandler(IWorkbenchPart part) {
		super(part);
		this.editor = (AspectEditor)part;
		setId(ACTION_ID);
		setText(Messages.ToggleShowCompensationHandler_Show_Compensation_Handler_2); 
		setToolTipText(Messages.ToggleShowCompensationHandler_Shows_compensation_handler_activities_3); 
	}

	
	@Override
	public void run() {
		List selList = getSelectedObjects();
		if (selList.size() == 1) {
			Scope scope = (Scope)selList.get(0);
			ScopeEditPart editPart = (ScopeEditPart)editor.getGraphicalViewer().getEditPartRegistry().get(scope);
			if (editPart != null) {
				boolean state = BPELUtil.getShowCompensationHandler(editPart);
				BPELUtil.setShowCompensationHandler(editPart, !state);
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
			ICompensationHandlerHolder holder = BPELUtil.adapt(o, ICompensationHandlerHolder.class);
			if (holder != null) {
				if (holder.getCompensationHandler(o) != null)
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
			return BPELUtil.getShowCompensationHandler(editPart);
		}
		return false;
	}

}
