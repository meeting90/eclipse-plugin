package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.model.partnerlinktype.PartnerLinkType;
import org.eclipse.bpel.model.partnerlinktype.Role;
import org.eclipse.bpel.ui.commands.AddRoleCommand;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELAddRoleCommand extends AddRoleCommand {
	public BPELAddRoleCommand(PartnerLinkType target, Role newRole) {
		super(target, newRole);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
