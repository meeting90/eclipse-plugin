package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.ui.commands.AddLinkCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELAddLinkCommand extends AddLinkCommand {
	public BPELAddLinkCommand(Command setNameCmd, EObject modelRoot) {
		super(setNameCmd, modelRoot);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
	

	
}
