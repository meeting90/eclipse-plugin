package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.model.Link;
import org.eclipse.bpel.ui.commands.DeleteLinkCommand;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELDeleteLinkCommand extends DeleteLinkCommand {
	public BPELDeleteLinkCommand(Link link) {
		super(link);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}

}
