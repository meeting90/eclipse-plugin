package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.ui.commands.SetOperationCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.wst.wsdl.Operation;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELSetOperationCommand extends SetOperationCommand {
	public BPELSetOperationCommand(EObject target, Operation newOperation) {
		super(target, newOperation);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
