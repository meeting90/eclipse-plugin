package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.model.MessageExchange;
import org.eclipse.bpel.ui.commands.SetMessageExchangeCommand;
import org.eclipse.emf.ecore.EObject;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELSetMessageExchangeCommand extends SetMessageExchangeCommand {
	public BPELSetMessageExchangeCommand(EObject target,
			MessageExchange newMessageExchange) {
		super(target, newMessageExchange);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
