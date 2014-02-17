package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import java.util.Set;

import org.eclipse.bpel.ui.commands.DeleteNonContainmentRefsCommand;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELDeleteNonContainmentRefsCommand extends
		DeleteNonContainmentRefsCommand {
	public BPELDeleteNonContainmentRefsCommand(Set<Object> deletingSet,
			Set<Object> modelRootSet) {
		super(deletingSet, modelRootSet);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}

}
