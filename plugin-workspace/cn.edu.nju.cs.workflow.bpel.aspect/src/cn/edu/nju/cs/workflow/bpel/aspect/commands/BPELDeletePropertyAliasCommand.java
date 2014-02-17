package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.model.messageproperties.PropertyAlias;
import org.eclipse.bpel.ui.commands.DeletePropertyAliasCommand;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELDeletePropertyAliasCommand extends DeletePropertyAliasCommand {
	public BPELDeletePropertyAliasCommand(PropertyAlias propertyAlias) {
		super(propertyAlias);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
