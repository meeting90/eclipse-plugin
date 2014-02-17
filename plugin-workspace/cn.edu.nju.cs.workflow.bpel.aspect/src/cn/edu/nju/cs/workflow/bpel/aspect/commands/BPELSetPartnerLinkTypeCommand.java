package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.model.PartnerLink;
import org.eclipse.bpel.model.partnerlinktype.PartnerLinkType;
import org.eclipse.bpel.ui.commands.SetPartnerLinkTypeCommand;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELSetPartnerLinkTypeCommand extends SetPartnerLinkTypeCommand {
	public BPELSetPartnerLinkTypeCommand(PartnerLink partnerLink,
			PartnerLinkType newPLT) {
		super(partnerLink, newPLT);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
