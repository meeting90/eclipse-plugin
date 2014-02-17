package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.ui.commands.SetForEachIsParallelCommand;
import org.eclipse.emf.ecore.EObject;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELSetForEachIsParallelCommand extends
		SetForEachIsParallelCommand {
	public BPELSetForEachIsParallelCommand(EObject forEach, boolean isParallel) {
		super(forEach, isParallel);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
