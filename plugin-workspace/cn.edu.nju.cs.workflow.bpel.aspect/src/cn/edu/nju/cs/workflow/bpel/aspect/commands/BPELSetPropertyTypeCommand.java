package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.model.messageproperties.Property;
import org.eclipse.bpel.ui.commands.SetPropertyTypeCommand;
import org.eclipse.emf.ecore.EObject;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELSetPropertyTypeCommand extends SetPropertyTypeCommand {
	public BPELSetPropertyTypeCommand(Property target, EObject newType) {
		super(target, newType);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
