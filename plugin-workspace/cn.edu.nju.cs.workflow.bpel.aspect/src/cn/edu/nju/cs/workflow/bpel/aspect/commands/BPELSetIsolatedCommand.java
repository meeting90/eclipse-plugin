package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.ui.commands.SetIsolatedCommand;
import org.eclipse.emf.ecore.EObject;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELSetIsolatedCommand extends SetIsolatedCommand {
	public BPELSetIsolatedCommand(EObject target, Boolean isolated) {
		super(target, isolated);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
