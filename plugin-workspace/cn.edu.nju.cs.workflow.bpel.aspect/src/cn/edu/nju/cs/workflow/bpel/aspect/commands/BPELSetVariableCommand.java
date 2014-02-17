package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.model.Variable;
import org.eclipse.bpel.ui.commands.SetVariableCommand;
import org.eclipse.emf.ecore.EObject;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELSetVariableCommand extends SetVariableCommand {
	public BPELSetVariableCommand(EObject target, Variable newVariable) {
		super(target, newVariable);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
