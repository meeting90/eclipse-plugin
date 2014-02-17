package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.model.Variable;
import org.eclipse.bpel.ui.commands.SetVariableTypeCommand;
import org.eclipse.emf.ecore.EObject;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELSetVariableTypeCommand extends SetVariableTypeCommand {
	public BPELSetVariableTypeCommand(Variable target, EObject newVariableType) {
		super(target, newVariableType);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
