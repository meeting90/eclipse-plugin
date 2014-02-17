package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.ui.commands.SetPortTypeCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.wst.wsdl.PortType;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELSetPortTypeCommand extends SetPortTypeCommand {
	public BPELSetPortTypeCommand(EObject target, PortType newPortType) {
		super(target, newPortType);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
