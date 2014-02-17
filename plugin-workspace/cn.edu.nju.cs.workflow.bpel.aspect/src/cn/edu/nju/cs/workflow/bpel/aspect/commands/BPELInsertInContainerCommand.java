package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.ui.commands.InsertInContainerCommand;
import org.eclipse.emf.ecore.EObject;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELInsertInContainerCommand extends InsertInContainerCommand {
	public BPELInsertInContainerCommand(EObject aParent, EObject aChild,
			EObject aBeforeMarker) {
		super(aParent, aChild, aBeforeMarker);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
