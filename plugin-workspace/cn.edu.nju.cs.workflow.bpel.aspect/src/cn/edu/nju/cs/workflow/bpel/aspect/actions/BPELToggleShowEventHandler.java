package cn.edu.nju.cs.workflow.bpel.aspect.actions;

import java.util.List;

import org.eclipse.bpel.model.Scope;
import org.eclipse.bpel.ui.Messages;
import org.eclipse.bpel.ui.adapters.IEventHandlerHolder;
import org.eclipse.bpel.ui.editparts.ScopeEditPart;
import org.eclipse.bpel.ui.util.BPELUtil;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.ui.IWorkbenchPart;

import cn.edu.nju.cs.workflow.bpel.aspect.editors.AspectEditor;
@SuppressWarnings("rawtypes")
public class BPELToggleShowEventHandler extends SelectionAction {

public static final String ACTION_ID = "ToggleShowEventHandler"; //$NON-NLS-1$
	
	protected AspectEditor editor;
	
	public BPELToggleShowEventHandler(IWorkbenchPart part) {
		super(part);
		this.editor = (AspectEditor)part;
		setId(ACTION_ID);
		setText(Messages.ToggleShowEventHandler_Show_Event_Handler_2); 
		setToolTipText(Messages.ToggleShowEventHandler_Shows_event_handler_activities_3); 
	}

	@Override
	public void run() {
		List selList = getSelectedObjects();
		if (selList.size() == 1) {
			Scope scope = (Scope)selList.get(0);
			ScopeEditPart editPart = (ScopeEditPart)editor.getGraphicalViewer().getEditPartRegistry().get(scope);
			if (editPart != null) {
				boolean state = BPELUtil.getShowEventHandler(editPart);
				BPELUtil.setShowEventHandler(editPart, !state);
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
			IEventHandlerHolder holder = BPELUtil.adapt(o, IEventHandlerHolder.class);
			if (holder != null) {
				if (holder.getEventHandler(o) != null)
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
			return BPELUtil.getShowEventHandler(editPart);
		}
		return false;
	}

}
