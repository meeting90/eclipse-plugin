package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.ui.commands.SetSuppressJoinFailureCommand;
import org.eclipse.emf.ecore.EObject;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELSetSuppressJoinFailureCommand extends SetSuppressJoinFailureCommand {
	public BPELSetSuppressJoinFailureCommand(EObject target, Boolean newValue) {
		super(target, newValue);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
