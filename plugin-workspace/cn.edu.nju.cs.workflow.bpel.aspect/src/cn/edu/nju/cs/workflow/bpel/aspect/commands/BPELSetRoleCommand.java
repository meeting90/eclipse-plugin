package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.model.PartnerLink;
import org.eclipse.bpel.model.partnerlinktype.Role;
import org.eclipse.bpel.ui.commands.SetRoleCommand;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELSetRoleCommand extends SetRoleCommand {
	public BPELSetRoleCommand(PartnerLink partnerLink, Role newRole, int roleNum) {
		super(partnerLink, newRole, roleNum);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
