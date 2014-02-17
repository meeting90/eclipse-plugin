package cn.edu.nju.cs.workflow.bpel.aspect.actions;

import org.eclipse.bpel.model.PartnerLink;
import org.eclipse.bpel.model.partnerlinktype.PartnerLinkType;
import org.eclipse.bpel.model.partnerlinktype.PartnerlinktypeFactory;
import org.eclipse.bpel.model.partnerlinktype.Role;
import org.eclipse.bpel.ui.IBPELUIConstants;
import org.eclipse.bpel.ui.actions.MakePartner2WayAction;
import org.eclipse.bpel.ui.commands.CompoundCommand;
import org.eclipse.ui.IWorkbenchPart;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.BPELAddRoleCommand;
import cn.edu.nju.cs.workflow.bpel.aspect.commands.BPELSetRoleCommand;
import cn.edu.nju.cs.workflow.bpel.aspect.editors.AspectEditor;

public class BPELMakePartner2WayAction extends MakePartner2WayAction {

	public BPELMakePartner2WayAction(IWorkbenchPart part) {
		super(part);
	}
	@Override
	public void run() {
		PartnerLink partner = getPartnerLink();
		PartnerLinkType plt = partner.getPartnerLinkType();
		if (plt == null) return;
		CompoundCommand cmd = new CompoundCommand();
		Role role = PartnerlinktypeFactory.eINSTANCE.createRole();
		role.setName( IBPELUIConstants.ROLE_NAME_PARTNERROLE);
		cmd.add(new BPELAddRoleCommand(plt, role));
		cmd.add(new BPELSetRoleCommand(partner, role, 1));//Partener Role
		
		AspectEditor editor = (AspectEditor)getWorkbenchPart();
		editor.getCommandStack().execute(cmd);
	}

}
