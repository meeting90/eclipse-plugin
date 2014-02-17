package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.ui.commands.SetWSDLFaultCommand;
import org.eclipse.wst.wsdl.Fault;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELSetWSDLFaultCommand extends SetWSDLFaultCommand {
	public BPELSetWSDLFaultCommand(Object target, Fault newFault) {
		super(target, newFault);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
