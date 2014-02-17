package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.model.messageproperties.PropertyAlias;
import org.eclipse.bpel.ui.commands.SetPropertyAliasPartCommand;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELSetPropertyAliasPartCommand extends SetPropertyAliasPartCommand {
	public BPELSetPropertyAliasPartCommand(PropertyAlias target,
			String newPartName) {
		super(target, newPartName);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
