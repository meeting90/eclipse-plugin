package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.ui.commands.SetSelectionCommand;
import org.eclipse.emf.ecore.EObject;

import cn.edu.nju.cs.workflow.bpel.aspect.AspectModelHelper;
import cn.edu.nju.cs.workflow.bpel.aspect.editors.AspectEditor;

public class BPELSetSelectionCommand extends SetSelectionCommand {
	public BPELSetSelectionCommand(EObject eObj, boolean onUndo) {
		super(eObj, onUndo);
	}
	@Override
	protected void select() {

		AspectEditor editor = AspectModelHelper.getAspectEditor(fTarget);
		if (editor != null) {
			editor.selectModelObject(fTarget);
		}
	}

}
