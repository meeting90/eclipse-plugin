package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.ui.commands.ReorderInContainerCommand;
import org.eclipse.emf.ecore.EObject;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELReorderInContainerCommand extends ReorderInContainerCommand {
	public BPELReorderInContainerCommand(EObject parent, Object child,
			Object before) {
		super(parent, child, before);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
