package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.model.Correlation;
import org.eclipse.bpel.model.CorrelationSet;
import org.eclipse.bpel.ui.commands.SetCorrelationSetRefCommand;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELSetCorrelationSetRefCommand extends
		SetCorrelationSetRefCommand {
	public BPELSetCorrelationSetRefCommand(Correlation target,
			CorrelationSet newSetRef) {
		super(target, newSetRef);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
