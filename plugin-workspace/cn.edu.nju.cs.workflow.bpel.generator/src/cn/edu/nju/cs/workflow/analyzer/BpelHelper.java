package cn.edu.nju.cs.workflow.analyzer;

import javax.xml.namespace.QName;

import org.eclipse.bpel.model.Activity;
import org.eclipse.bpel.model.Assign;
import org.eclipse.bpel.model.BPELExtensibleElement;
import org.eclipse.bpel.model.BPELFactory;
import org.eclipse.bpel.model.Copy;
import org.eclipse.bpel.model.OnMessage;
import org.eclipse.bpel.model.PartnerActivity;
import org.eclipse.bpel.model.PartnerLink;
import org.eclipse.bpel.model.Pick;
import org.eclipse.bpel.model.Process;
import org.eclipse.bpel.model.Sequence;
import org.eclipse.bpel.model.partnerlinktype.PartnerLinkType;
import org.eclipse.emf.common.util.EList;
import org.eclipse.wst.wsdl.Definition;
import org.eclipse.wst.wsdl.PortType;
import org.eclipse.wst.wsdl.util.WSDLConstants;

public class BpelHelper {
	Process bpelProcess;
	Definition artifactsDefinition;
	//WsdlHelper helper;

	public BpelHelper(Process bpelProcess, Definition artifactsDefinition){
		this.bpelProcess=bpelProcess;
		this.artifactsDefinition=artifactsDefinition;
	}
	public void addPartnerLinks(){

		for( Object elt : artifactsDefinition.getEExtensibilityElements()) {
			if(!(elt instanceof PartnerLinkType))
				continue;
			PartnerLink pl = BPELFactory.eINSTANCE.createPartnerLink();
			pl.setName(((PartnerLinkType)elt).getName().replace("PLT", "PL"));
			pl.setPartnerLinkType((PartnerLinkType)elt);
			pl.setMyRole(((PartnerLinkType)elt).getRole().get(0));
			pl.setPartnerRole(((PartnerLinkType)elt).getRole().get(0));
			PortType portType=(PortType) pl.getMyRole().getPortType();
			portType.getQName();
			boolean matched=setPartnerLinkIfPosible(portType.getQName(), pl);
			this.bpelProcess.getPartnerLinks().getChildren().add( pl );
		
		}
	}

	public void formatExpression(BPELExtensibleElement element){
		if(element instanceof OnMessage){
			formatExpression(((OnMessage)element).getActivity());
			
		}else if (element instanceof Sequence){
			
			EList<Activity> activities=((Sequence)element).getActivities();
			for(Activity activity : activities){
				formatExpression(activity);
			}	
		}else if(element instanceof Assign){
			Assign assign=(Assign)element;
			EList<Copy> copys=assign.getCopy();
			for(Copy copy: copys){
				String expression=(String) copy.getFrom().getExpression().getBody();
				expression.startsWith("$");		
			}
		}
		
	}
	
	private boolean setPartnerLinkIfPosible(QName qname, PartnerLink pl){
		Activity activity=bpelProcess.getActivity();
		return setPartnerLink(activity,qname,pl);
	}
	
	private boolean setPartnerLink(BPELExtensibleElement element,QName qname, PartnerLink partnerLink){
		
		if(element instanceof OnMessage){
			((OnMessage)element).getPortType().getQName().toString();
			boolean seted=setPartnerLink(((OnMessage)element).getActivity(), qname, partnerLink);
			if(((OnMessage) element).getPortType().getQName().toString().equals(qname.toString())){
				((OnMessage) element).setPartnerLink(partnerLink);
				
				return true;
			}
			return seted;
		}
		else if(element instanceof PartnerActivity){
			((PartnerActivity)element).getPortType().getQName().toString();
			if(((PartnerActivity)element).getPortType().getQName().toString().equals(qname.toString())){
				((PartnerActivity) element).setPartnerLink(partnerLink);
				((PartnerActivity)element).setPortType(null);
				return true;
			}
		}else if (element instanceof Sequence){
			boolean seted=false;
			EList<Activity> activities=((Sequence)element).getActivities();
			for(Activity activity : activities){
				if( setPartnerLink(activity,qname, partnerLink))
					seted=true;
			}
			return seted;
		}else if(element instanceof Pick){
			boolean seted=false;
			EList<OnMessage> onMsgs=((Pick)element).getMessages();
			for(OnMessage onMsg : onMsgs){
				if( setPartnerLink(onMsg,qname, partnerLink))
					seted=true;
			}
			return seted;
		}
		return false;
	}

}
