package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.model.PartnerLink;
import org.eclipse.bpel.ui.commands.AddPartnerLinkCommand;
import org.eclipse.emf.ecore.EObject;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELAddPartnerLinkCommand extends AddPartnerLinkCommand {
	public BPELAddPartnerLinkCommand(EObject eObj, PartnerLink partnerLink) {
		super(eObj, partnerLink);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
