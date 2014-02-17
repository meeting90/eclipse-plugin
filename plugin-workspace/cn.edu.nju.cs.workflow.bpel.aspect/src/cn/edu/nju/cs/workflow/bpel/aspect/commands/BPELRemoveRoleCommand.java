package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.model.partnerlinktype.PartnerLinkType;
import org.eclipse.bpel.model.partnerlinktype.Role;
import org.eclipse.bpel.ui.commands.RemoveRoleCommand;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELRemoveRoleCommand extends RemoveRoleCommand {
	public BPELRemoveRoleCommand(PartnerLinkType target, Role oldRole) {
		super(target, oldRole);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
