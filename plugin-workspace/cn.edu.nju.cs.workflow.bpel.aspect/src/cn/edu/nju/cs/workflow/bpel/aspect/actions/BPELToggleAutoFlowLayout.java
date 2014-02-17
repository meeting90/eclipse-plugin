package cn.edu.nju.cs.workflow.bpel.aspect.actions;

import org.eclipse.bpel.ui.Messages;
import org.eclipse.bpel.ui.actions.ToggleAutoFlowLayout;
import org.eclipse.ui.IWorkbenchPart;

import cn.edu.nju.cs.workflow.bpel.aspect.editors.AspectEditor;

public class BPELToggleAutoFlowLayout extends ToggleAutoFlowLayout {
public static final String ACTION_ID = "ToggleAutoFlowLayout"; //$NON-NLS-1$
	
	public BPELToggleAutoFlowLayout(IWorkbenchPart part) {
		super(part);
		setId(ACTION_ID);
		setText(Messages.ToggleAutoFlowLayout_Align_Flow_Contents_Automatically_2); 
		setToolTipText(Messages.ToggleAutoFlowLayout_Align_activities_in_Flows_automatically_3); 
	}

	@Override
	public void run() {
		AspectEditor editor = (AspectEditor)getWorkbenchPart();
		editor.setAutoFlowLayout(!editor.getAutoFlowLayout());
		editor.refreshGraphicalViewer();
	}

	@Override
	protected boolean calculateEnabled() {
		return true;
	}

	@Override
	public boolean isChecked() {
		return ((AspectEditor)getWorkbenchPart()).getAutoFlowLayout();
	}
}
