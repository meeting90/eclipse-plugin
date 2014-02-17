package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.ui.commands.ReplaceInContainerCommand;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELReplaceInContainerCommand extends ReplaceInContainerCommand {
	public BPELReplaceInContainerCommand(Object parent, Object oldElement,
			Object newElement) {
		super(parent, oldElement, newElement);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
