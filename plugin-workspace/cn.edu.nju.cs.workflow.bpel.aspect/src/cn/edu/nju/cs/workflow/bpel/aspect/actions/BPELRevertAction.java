package cn.edu.nju.cs.workflow.bpel.aspect.actions;

import org.eclipse.bpel.ui.actions.RevertAction;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.ui.IEditorPart;

import cn.edu.nju.cs.workflow.bpel.aspect.editors.AspectMultipageEditorPart;

public class BPELRevertAction extends RevertAction {

	public BPELRevertAction(IEditorPart editor) {
		super(editor);
	}
	@Override
	public void run() {
		AspectMultipageEditorPart part= ((AspectMultipageEditorPart)getEditorPart());
		part.doRevertToSaved(new NullProgressMonitor());
		getEditorPart().setFocus();
	}
	

}
