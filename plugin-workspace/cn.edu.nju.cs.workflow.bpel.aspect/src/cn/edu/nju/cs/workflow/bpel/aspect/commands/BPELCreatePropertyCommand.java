package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.model.messageproperties.Property;
import org.eclipse.bpel.ui.commands.CreatePropertyCommand;
import org.eclipse.wst.wsdl.Definition;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELCreatePropertyCommand extends CreatePropertyCommand {
	public BPELCreatePropertyCommand(Definition definition, Property property) {
		super(definition, property);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
