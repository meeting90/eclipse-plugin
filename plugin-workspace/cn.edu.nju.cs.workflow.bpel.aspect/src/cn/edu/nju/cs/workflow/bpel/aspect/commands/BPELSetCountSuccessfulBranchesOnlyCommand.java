package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.ui.commands.SetCountSuccessfulBranchesOnlyCommand;
import org.eclipse.emf.ecore.EObject;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELSetCountSuccessfulBranchesOnlyCommand extends
		SetCountSuccessfulBranchesOnlyCommand {
	public BPELSetCountSuccessfulBranchesOnlyCommand(EObject branches,
			boolean successfulBranchesOnly) {
		super(branches, successfulBranchesOnly);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
