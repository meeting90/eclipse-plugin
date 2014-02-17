package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import java.util.Collection;

import org.eclipse.bpel.ui.commands.RevalidateLinksCommand;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELRevalidateLinksCommand extends RevalidateLinksCommand {
	@SuppressWarnings("rawtypes")
	public BPELRevalidateLinksCommand(Collection activityCollection) {
		super(activityCollection);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
