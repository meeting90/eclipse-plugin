package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.model.PartnerLink;
import org.eclipse.bpel.model.partnerlinktype.PartnerLinkType;
import org.eclipse.bpel.ui.commands.CreatePartnerLinkTypeCommand;
import org.eclipse.wst.wsdl.Definition;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELCreatePartnerLinkTypeCommand extends
		CreatePartnerLinkTypeCommand {
	public BPELCreatePartnerLinkTypeCommand(Definition defn, PartnerLinkType plt) {
		super(defn, plt);
	}
	public BPELCreatePartnerLinkTypeCommand(Definition defn, PartnerLinkType plt,PartnerLink pl) {
		super(defn, plt,pl);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
