package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.ui.commands.SetSpecCompliantProcessCommand;
import org.eclipse.bpel.ui.uiextensionmodel.ProcessExtension;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELSetSpecCompliantProcessCommand extends SetSpecCompliantProcessCommand {
	public BPELSetSpecCompliantProcessCommand(ProcessExtension target,
			boolean specCompliant) {
		super(target, specCompliant);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
