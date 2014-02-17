package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.model.CorrelationSet;
import org.eclipse.bpel.model.messageproperties.Property;
import org.eclipse.bpel.ui.commands.ReplacePropertyCommand;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELReplacePropertyCommand extends ReplacePropertyCommand {
	public BPELReplacePropertyCommand(CorrelationSet target,
			Property oldProperty, Property newProperty) {
		super(target, oldProperty, newProperty);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
