package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.model.OnEvent;
import org.eclipse.bpel.ui.commands.SetOnEventVariableTypeCommand;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELSetOnEventVariableTypeCommand extends
		SetOnEventVariableTypeCommand {
	public BPELSetOnEventVariableTypeCommand(OnEvent onEvent) {
		super(onEvent);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
