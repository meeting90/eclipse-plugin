package cn.edu.nju.cs.workflow.bpel.aspect.adapters;

import java.util.List;

import org.eclipse.bpel.model.PartnerLink;
import org.eclipse.bpel.model.Variable;
import org.eclipse.bpel.model.partnerlinktype.Role;
import org.eclipse.bpel.ui.actions.editpart.AbstractAction;
import org.eclipse.bpel.ui.actions.editpart.SetPartnerLinkAction;
import org.eclipse.bpel.ui.actions.editpart.SetVariableAction;
import org.eclipse.bpel.ui.adapters.AnnotationHelper;
import org.eclipse.bpel.ui.adapters.IAnnotatedElement;
import org.eclipse.bpel.ui.adapters.Messages;
import org.eclipse.gef.EditPart;
import org.eclipse.wst.wsdl.Operation;

import cn.edu.nju.cs.workflow.bpel.aspect.AspectModelHelper;


public class BPELReceiveAdapter extends BPELActivityAdapter implements IAnnotatedElement{

	@Override
	public List<AbstractAction> getEditPartActions(EditPart editPart) {
		// TODO Auto-generated method stub
		List<AbstractAction> actions=super.getEditPartActions(editPart);
		actions.add(new SetPartnerLinkAction(editPart));
		actions.add(new SetVariableAction(editPart, SetVariableAction.REQUEST));
		return actions;
	}

	@Override
	public String[] getAnnotation(Object object) {
		PartnerLink pLink = AspectModelHelper.getPartnerLink(object);
		Operation operation =AspectModelHelper.getOperation(object);
		Variable inVar = AspectModelHelper.getVariable(object, AspectModelHelper.OUTGOING);
		Role myRole = pLink != null ? pLink.getMyRole() : null;
		Role partnerRole = pLink != null ? pLink.getPartnerRole() : null;
		
		return new String[] {
			Messages.PARTNER_LINK, AnnotationHelper.getAnnotation(pLink),
			Messages.OPERATION, AnnotationHelper.getAnnotation(operation),
			Messages.INPUT, AnnotationHelper.getAnnotation(inVar),		
			Messages.MY_ROLE, AnnotationHelper.getAnnotation(myRole),
			Messages.PARTNER_ROLE, AnnotationHelper.getAnnotation(partnerRole)
		};
	}
}
