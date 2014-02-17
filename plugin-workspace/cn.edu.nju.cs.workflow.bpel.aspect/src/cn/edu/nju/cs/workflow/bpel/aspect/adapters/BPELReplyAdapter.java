package cn.edu.nju.cs.workflow.bpel.aspect.adapters;

import org.eclipse.bpel.model.PartnerLink;
import org.eclipse.bpel.model.Variable;
import org.eclipse.bpel.model.partnerlinktype.Role;
import org.eclipse.bpel.ui.adapters.AnnotationHelper;
import org.eclipse.bpel.ui.adapters.IAnnotatedElement;
import org.eclipse.bpel.ui.adapters.Messages;
import org.eclipse.wst.wsdl.Operation;

import cn.edu.nju.cs.workflow.bpel.aspect.AspectModelHelper;


public class BPELReplyAdapter extends BPELActivityAdapter implements IAnnotatedElement{
/* IAnnotatedElement */
	
	public String[] getAnnotation(Object object) {
		PartnerLink pLink = AspectModelHelper.getPartnerLink(object);
		Operation operation = AspectModelHelper.getOperation(object);
		Variable outVar = AspectModelHelper.getVariable(object, AspectModelHelper.INCOMING);
		Role myRole = pLink != null ? pLink.getMyRole() : null;
		Role partnerRole = pLink != null ? pLink.getPartnerRole() : null;
		
		return new String[] {
			Messages.PARTNER_LINK, AnnotationHelper.getAnnotation(pLink),
			Messages.OPERATION, AnnotationHelper.getAnnotation(operation),
			Messages.OUTPUT, AnnotationHelper.getAnnotation(outVar),
			Messages.MY_ROLE, AnnotationHelper.getAnnotation(myRole),
			Messages.PARTNER_ROLE, AnnotationHelper.getAnnotation(partnerRole)
		};
	}

	
}
