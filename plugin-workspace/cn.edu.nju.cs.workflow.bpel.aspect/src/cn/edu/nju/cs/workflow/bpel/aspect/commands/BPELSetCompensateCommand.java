package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.model.Activity;
import org.eclipse.bpel.model.CompensateScope;
import org.eclipse.bpel.ui.commands.SetCompensateCommand;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELSetCompensateCommand extends SetCompensateCommand {
	public BPELSetCompensateCommand(CompensateScope activity,
			Activity targetActivity) {
		super(activity, targetActivity);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
