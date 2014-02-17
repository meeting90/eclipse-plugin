package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.model.PartnerLink;
import org.eclipse.bpel.ui.commands.SetPartnerLinkCommand;
import org.eclipse.emf.ecore.EObject;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELSetPartnerLinkCommand extends SetPartnerLinkCommand {
	public BPELSetPartnerLinkCommand(EObject target, PartnerLink newPartnerLink) {
		super(target, newPartnerLink);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
