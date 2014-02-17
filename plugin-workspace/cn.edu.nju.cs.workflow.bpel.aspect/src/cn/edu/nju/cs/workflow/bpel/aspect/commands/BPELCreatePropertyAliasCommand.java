package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.model.messageproperties.PropertyAlias;
import org.eclipse.bpel.ui.commands.CreatePropertyAliasCommand;
import org.eclipse.wst.wsdl.Definition;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELCreatePropertyAliasCommand extends CreatePropertyAliasCommand {
	public BPELCreatePropertyAliasCommand(Definition definition,
			PropertyAlias propertyAlias) {
		super(definition, propertyAlias);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
