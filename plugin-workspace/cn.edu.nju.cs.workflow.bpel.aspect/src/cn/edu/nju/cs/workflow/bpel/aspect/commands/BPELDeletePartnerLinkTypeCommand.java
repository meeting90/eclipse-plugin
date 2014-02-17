package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.model.partnerlinktype.PartnerLinkType;
import org.eclipse.bpel.ui.commands.DeletePartnerLinkTypeCommand;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELDeletePartnerLinkTypeCommand extends
		DeletePartnerLinkTypeCommand {
	public BPELDeletePartnerLinkTypeCommand(PartnerLinkType plt) {
		super(plt);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
