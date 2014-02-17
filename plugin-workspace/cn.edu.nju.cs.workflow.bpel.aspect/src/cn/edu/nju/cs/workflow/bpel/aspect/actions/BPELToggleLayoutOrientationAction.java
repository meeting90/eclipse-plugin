package cn.edu.nju.cs.workflow.bpel.aspect.actions;

import java.util.List;

import org.eclipse.bpel.ui.Messages;
import org.eclipse.bpel.ui.editparts.BPELEditPart;
import org.eclipse.bpel.ui.figures.ILayoutAware;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.ui.IWorkbenchPart;

import cn.edu.nju.cs.workflow.bpel.aspect.AspectEditPart;
import cn.edu.nju.cs.workflow.bpel.aspect.editors.AspectEditor;
@SuppressWarnings("rawtypes")
public class BPELToggleLayoutOrientationAction extends SelectionAction {
	public final static String ACTION_ID = "ToggleLayoutOrientationAction"; //$NON-NLS-1$

	public BPELToggleLayoutOrientationAction(IWorkbenchPart part) {
		super(part);
		setId(ACTION_ID);
		setText(getText()); 
	}
	
	@Override
	public void run() {
		AspectEditor editor = (AspectEditor)getWorkbenchPart();
		editor.setHorizontalLayout(!editor.isHorizontalLayout());
		
		
		AspectEditPart process = (AspectEditPart)editor.getGraphicalViewer().getEditPartRegistry().get(editor.getAspect());
		
		doSwitchOrientation(process, editor.isHorizontalLayout());
		
		setText(getText());

		editor.refreshGraphicalViewer();
	}
	
	@SuppressWarnings("unchecked")
	private void doSwitchOrientation(BPELEditPart part, boolean horizontal){
		List<BPELEditPart> children = part.getChildren();
		for(BPELEditPart child : children){
			doSwitchOrientation(child, horizontal);
		}
		if(part instanceof ILayoutAware){
			((ILayoutAware)part).switchLayout(horizontal);
		}
		
	}
	
	@Override
	protected boolean calculateEnabled() {
		List sel = getSelectedObjects();
		return sel.size() > 0 && sel.get(0) instanceof org.eclipse.bpel.model.Process; 
	}
	
	@Override
	public String getText() {
		AspectEditor editor = (AspectEditor)getWorkbenchPart();
		if(editor.isHorizontalLayout())
			return Messages.ToggleLayoutOrientation_2;
		else
			return Messages.ToggleLayoutOrientation_1;
	}
	
}
