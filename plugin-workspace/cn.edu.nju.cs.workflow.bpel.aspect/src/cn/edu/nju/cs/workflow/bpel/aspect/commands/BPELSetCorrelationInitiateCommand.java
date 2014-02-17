package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.model.Correlation;
import org.eclipse.bpel.ui.commands.SetCorrelationInitiateCommand;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELSetCorrelationInitiateCommand extends
		SetCorrelationInitiateCommand {
	public BPELSetCorrelationInitiateCommand(Correlation target,
			String newInitiation) {
		super(target, newInitiation);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
