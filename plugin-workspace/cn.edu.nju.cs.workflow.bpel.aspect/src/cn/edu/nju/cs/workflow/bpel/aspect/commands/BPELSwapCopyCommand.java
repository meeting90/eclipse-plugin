package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.model.Assign;
import org.eclipse.bpel.ui.commands.SwapCopyCommand;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELSwapCopyCommand extends SwapCopyCommand {
	public BPELSwapCopyCommand(Assign target, int firstElement,
			int secondElement) {
		super(target, firstElement, secondElement);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
