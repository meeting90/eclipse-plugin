package cn.edu.nju.cs.workflow.bpel.aspect.actions;

import java.util.List;

import org.eclipse.bpel.model.Scope;
import org.eclipse.bpel.ui.Messages;
import org.eclipse.bpel.ui.adapters.IFaultHandlerHolder;
import org.eclipse.bpel.ui.editparts.ScopeEditPart;
import org.eclipse.bpel.ui.util.BPELUtil;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.ui.IWorkbenchPart;

import cn.edu.nju.cs.workflow.bpel.aspect.editors.AspectEditor;
@SuppressWarnings("rawtypes")
public class BPELToggleShowFaultHandler extends SelectionAction {

public static final String ACTION_ID = "ToggleShowFaultHandler"; //$NON-NLS-1$
	
	protected AspectEditor editor;
	
	public BPELToggleShowFaultHandler(IWorkbenchPart part) {
		super(part);
		this.editor = (AspectEditor)part;
		setId(ACTION_ID);
		setText(Messages.ToggleShowFaultHandler_Show_Fault_Handler_2); 
		setToolTipText(Messages.ToggleShowFaultHandler_Shows_fault_handler_activities_3); 
	}

	@Override
	public void run() {
		List selList = getSelectedObjects();
		if (selList.size() == 1) {
			Scope scope = (Scope)selList.get(0);
			ScopeEditPart editPart = (ScopeEditPart)editor.getGraphicalViewer().getEditPartRegistry().get(scope);
			if (editPart != null) {
				boolean state = BPELUtil.getShowFaultHandler(editPart);
				BPELUtil.setShowFaultHandler(editPart, !state);
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
			IFaultHandlerHolder holder = BPELUtil.adapt(o, IFaultHandlerHolder.class);
			if (holder != null) {
				if (holder.getFaultHandler(o) != null)
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
			return BPELUtil.getShowFaultHandler(editPart);
		}
		return false;
	}

}
