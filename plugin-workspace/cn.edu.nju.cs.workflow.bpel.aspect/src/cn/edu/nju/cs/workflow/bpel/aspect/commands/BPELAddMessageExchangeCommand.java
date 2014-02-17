package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.model.MessageExchange;
import org.eclipse.bpel.ui.commands.AddMessageExchangeCommand;
import org.eclipse.emf.ecore.EObject;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELAddMessageExchangeCommand extends AddMessageExchangeCommand {
	public BPELAddMessageExchangeCommand(EObject eObj,
			MessageExchange messageExchange) {
		super(eObj, messageExchange);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
