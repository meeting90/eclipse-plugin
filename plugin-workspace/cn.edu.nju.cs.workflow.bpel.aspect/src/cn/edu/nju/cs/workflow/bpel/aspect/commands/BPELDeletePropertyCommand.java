package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.model.messageproperties.Property;
import org.eclipse.bpel.ui.commands.DeletePropertyCommand;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELDeletePropertyCommand extends DeletePropertyCommand {
	public BPELDeletePropertyCommand(Property property) {
		super(property);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
