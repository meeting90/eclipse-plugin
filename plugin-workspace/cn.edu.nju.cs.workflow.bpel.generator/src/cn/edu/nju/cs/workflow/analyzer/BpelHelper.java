package cn.edu.nju.cs.workflow.analyzer;

import javax.xml.namespace.QName;

import org.eclipse.bpel.model.Activity;
import org.eclipse.bpel.model.Assign;
import org.eclipse.bpel.model.BPELExtensibleElement;
import org.eclipse.bpel.model.BPELFactory;
import org.eclipse.bpel.model.Copy;
import org.eclipse.bpel.model.Expression;
import org.eclipse.bpel.model.From;
import org.eclipse.bpel.model.OnMessage;
import org.eclipse.bpel.model.PartnerActivity;
import org.eclipse.bpel.model.PartnerLink;
import org.eclipse.bpel.model.Pick;
import org.eclipse.bpel.model.Process;
import org.eclipse.bpel.model.Scope;
import org.eclipse.bpel.model.Sequence;
import org.eclipse.bpel.model.To;
import org.eclipse.bpel.model.Variable;
import org.eclipse.bpel.model.partnerlinktype.PartnerLinkType;
import org.eclipse.bpel.model.util.BPELUtils;
import org.eclipse.bpel.model.util.XSD2XMLGenerator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.wst.wsdl.Definition;
import org.eclipse.wst.wsdl.Message;
import org.eclipse.wst.wsdl.Part;
import org.eclipse.wst.wsdl.PortType;
import org.eclipse.xsd.XSDElementDeclaration;

import cn.edu.nju.cs.workflow.model.WorkflowProcess;

public class BpelHelper {
	Process bpelProcess;
	Definition artifactsDefinition;
	WorkflowProcess wfprocess;
	
	//WsdlHelper helper;

	public BpelHelper(Process bpelProcess, WorkflowProcess wfProcess, Definition artifactsDefinition){
		this.bpelProcess=bpelProcess;
		this.artifactsDefinition=artifactsDefinition;
		this.wfprocess=wfProcess;
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
			
			boolean matched=setPartnerLinkIfPosible(portType.getQName(), pl);
			if(matched){
				this.bpelProcess.getPartnerLinks().getChildren().add( pl );
			}
		}
	}
	public void initVariables(){
		Assign assign=BPELFactory.eINSTANCE.createAssign();
		assign.setName("initVariables");
		
		Pick pick=(Pick) this.wfprocess.getRootWorkflow().getRootActivity();
		for (OnMessage msg:pick.getMessages()){
		  Scope scope=	(Scope) msg.getActivity();
		  for(Variable var: scope.getVariables().getChildren()){
				assign.getCopy().add(initVariable(var));
			}
			((Sequence)scope.getActivity()).getActivities().add(0, assign);
		}
		
		
	}
	private Copy initVariable(Variable variable){
		String rootElement = null;
		String uriWSDL = null;

		// Variable is defined using "messageType"
		Message msg = variable.getMessageType();
		if (msg != null) {
			for(Object part:msg.getEParts()){
				XSDElementDeclaration declaration=((Part)part).getElementDeclaration();
				if (declaration != null) {
					uriWSDL = declaration.getSchema().getSchemaLocation();
					rootElement = declaration.getName();
					break;
				}
				
			}
		}
		if (rootElement == null || uriWSDL == null) {
			return null;
		}
		XSD2XMLGenerator generator = new XSD2XMLGenerator(uriWSDL, rootElement);

		try {
			String literal = generator.createXML();
			Copy copy = BPELFactory.eINSTANCE.createCopy();
			
			To to = BPELFactory.eINSTANCE.createTo();
			From from = BPELFactory.eINSTANCE.createFrom();
			from.setLiteral(literal);
			copy.setFrom(from);
			Expression expression=BPELFactory.eINSTANCE.createExpression();
			expression.setBody("$"+variable.getName()+"."+((Part)msg.getEParts().get(0)).getName());
			to.setExpression(expression);
			copy.setTo(to);
			return copy;
			
			
		} catch (Exception e) {
			throw new IllegalStateException(
					"Can't generate initializer, check WSDL file");
		}
	}

	public void formatExpression(){
		Pick pick=(Pick) this.wfprocess.getRootWorkflow().getRootActivity();
		for(OnMessage msg: pick.getMessages()){
			Scope scope= (Scope) msg.getActivity();
			formatExpIter(scope.getActivity(),scope);
		}
		
	}
	private void formatExpIter(BPELExtensibleElement element,Scope scope){
		
		if (element instanceof Sequence){
			
			EList<Activity> activities=((Sequence)element).getActivities();
			for(Activity activity : activities){
				formatExpIter(activity,scope);
			}	
		}
		if(element instanceof Assign){
			Assign assign=(Assign)element;
			EList<Copy> copys=assign.getCopy();
			for(Copy copy: copys){
				if(copy.getFrom().getExpression()!=null){
					String expression=(String) copy.getFrom().getExpression().getBody();
					copy.getFrom().getExpression().setBody(addPrefix2Exp(expression,scope));
					
				}
				if(copy.getTo().getExpression()!=null){
					String expression=(String) copy.getTo().getExpression().getBody();
					
					copy.getTo().getExpression().setBody(addPrefix2Exp(expression,scope));
					
				}
			}
				
			}
		
		
		
	}
	public Variable findVariable(String name,Scope scope){
		for(Variable variable: this.bpelProcess.getVariables().getChildren()){
			if(variable.getName().equals(name)){
				return variable;
			}
		}
		for(Variable variable: scope.getVariables().getChildren()){
			if(variable.getName().equals(name)){
				return variable;
			}
		}
		
		return null;
	}
	private  String addPrefix2Exp(String expression,Scope scope){
	
		if(expression.startsWith("$")){
			
			String valName=expression.split("\\.")[0].substring(1);
			//String []xsdElement=expression.split("/");//without 0
			
			Variable variable=findVariable(valName,scope);
			
			if(variable!=null){
				String namespace=variable.getMessageType().getQName().getNamespaceURI();
				String prefix=addNameSpacePrefix(variable, namespace, "twf");
				for(Object obj:variable.getMessageType().getParts().values()){
					Part part=(Part)obj;
					
					namespace=part.getElementDeclaration().getSchema().getTargetNamespace();
					prefix=addNameSpacePrefix(variable, namespace, "xsd");
					expression=expression.replaceAll("/", "/"+prefix+":");
					
				}
				
				
				
				
			}
		}
		return expression;
	}
private  String addNameSpacePrefix ( Variable variable, String namespace ,String prefixRoot) {

		
		String nsPrefix = BPELUtils.getNamespacePrefix(variable, namespace);
		if (nsPrefix != null && nsPrefix.length() > 0) {
			return nsPrefix;
		}
		// Find a suitable prefix
		
		int idx = 0;
		nsPrefix = prefixRoot+idx;
		do {
			if (BPELUtils.getNamespace(variable, nsPrefix) == null) {
				BPELUtils.setNamespacePrefix(variable, namespace, nsPrefix);
				return nsPrefix;
			}
			nsPrefix = prefixRoot + idx;
			idx += 1;
		} while (true);
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
				partnerLink.setPartnerRole(null);
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
		}else if(element instanceof Scope){
			return setPartnerLink(((Scope)element).getActivity(), qname, partnerLink);
			
		}
		return false;
	}

}
