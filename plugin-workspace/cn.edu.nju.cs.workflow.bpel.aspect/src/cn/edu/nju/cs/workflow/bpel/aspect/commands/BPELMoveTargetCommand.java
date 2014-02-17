package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.model.Activity;
import org.eclipse.bpel.model.Target;
import org.eclipse.bpel.ui.commands.MoveTargetCommand;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELMoveTargetCommand extends MoveTargetCommand {
	public BPELMoveTargetCommand(Activity fromActivity, Activity toActivity,
			Target target) {
		super(fromActivity, toActivity, target);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
