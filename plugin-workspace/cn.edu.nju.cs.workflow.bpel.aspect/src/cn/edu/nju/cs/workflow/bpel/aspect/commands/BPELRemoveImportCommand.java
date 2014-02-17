package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.ui.commands.RemoveImportCommand;
import org.eclipse.emf.ecore.EObject;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELRemoveImportCommand extends RemoveImportCommand {
	public BPELRemoveImportCommand(EObject target, Object oldElement,
			String cmdLabel) {
		super(target, oldElement, cmdLabel);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
