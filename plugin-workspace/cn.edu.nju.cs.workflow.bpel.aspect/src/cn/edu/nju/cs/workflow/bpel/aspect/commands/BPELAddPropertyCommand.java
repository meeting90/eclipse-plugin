package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.model.CorrelationSet;
import org.eclipse.bpel.model.messageproperties.Property;
import org.eclipse.bpel.ui.commands.AddPropertyCommand;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELAddPropertyCommand extends AddPropertyCommand {
	public BPELAddPropertyCommand(CorrelationSet target, Property newProperty) {
		super(target, newProperty);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
