package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.model.CorrelationSet;
import org.eclipse.bpel.model.messageproperties.Property;
import org.eclipse.bpel.ui.commands.RemovePropertyCommand;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELRemovePropertyCommand extends RemovePropertyCommand {
	public BPELRemovePropertyCommand(CorrelationSet target, Property oldProperty) {
		super(target, oldProperty);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
