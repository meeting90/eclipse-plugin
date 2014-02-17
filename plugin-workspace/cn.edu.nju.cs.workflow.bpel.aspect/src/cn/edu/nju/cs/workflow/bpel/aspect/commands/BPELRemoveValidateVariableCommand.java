package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.model.Variable;
import org.eclipse.bpel.ui.commands.RemoveValidateVariableCommand;
import org.eclipse.emf.ecore.EObject;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELRemoveValidateVariableCommand extends
		RemoveValidateVariableCommand {
	public BPELRemoveValidateVariableCommand(EObject target,
			Variable oldVariable) {
		super(target, oldVariable);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
