package cn.edu.nju.cs.wsdl.lib;


import java.util.ArrayList;
import java.util.List;


import org.eclipse.bpel.common.wsdl.parsers.WsdlParser;

import org.eclipse.emf.common.util.URI;
import org.eclipse.wst.wsdl.Definition;

import org.eclipse.wst.wsdl.Message;
import org.eclipse.wst.wsdl.Operation;

import org.eclipse.wst.wsdl.PortType;








public class WsdlHelper {


	public String wsdlUrl;

	private Definition businessDefinition;
	private List<PortType> portTypes;
	
	public WsdlHelper(String url){
		this.wsdlUrl=url;
		init();
	}
	
	private void init(){
		
		//File f=new File(wsdlUrl);
		URI uri=URI.createURI(wsdlUrl);
		
		this.businessDefinition=WsdlParser.loadWsdlDefinition(uri, WsdlParser.createBasicResourceSetForWsdl());
		
		this.portTypes=new ArrayList<PortType>();
		for(Object obj :this.businessDefinition.getPortTypes().values()){
			PortType portType=(PortType)obj;
			this.portTypes.add(portType);
		}
	}
	
	public Definition getBusinessDefinition() {
		return businessDefinition;
	}

	public List<PortType> getPortTypes() {
		return portTypes;
	}

	@SuppressWarnings("unchecked")
	public List<Operation> getOperations(PortType portType){
		return portType.getOperations();
	}
	
	public Message getInputMessage(Operation operation){
		Message msg = (Message) operation.getInput().getMessage();
		return msg;
	}
	
	
	
	
	
	
}
