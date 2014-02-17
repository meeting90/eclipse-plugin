package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.ui.commands.SetVariableKindCommand;
import org.eclipse.bpel.ui.uiextensionmodel.VariableExtension;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELSetVariableKindCommand extends SetVariableKindCommand {
	public BPELSetVariableKindCommand(VariableExtension target, int newKind) {
		super(target, newKind);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
