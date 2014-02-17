package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.ui.commands.SetExtensibilityElementCommand;
import org.eclipse.wst.wsdl.ExtensibilityElement;
import org.eclipse.wst.wsdl.ExtensibleElement;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELSetExtensibilityElementCommand extends SetExtensibilityElementCommand {
	@SuppressWarnings("rawtypes")
	public BPELSetExtensibilityElementCommand(ExtensibleElement target,
			Class clazz, ExtensibilityElement newExtension) {
		super(target, clazz, newExtension);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
