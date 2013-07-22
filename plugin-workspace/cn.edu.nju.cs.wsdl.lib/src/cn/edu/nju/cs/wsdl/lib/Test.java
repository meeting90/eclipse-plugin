package cn.edu.nju.cs.wsdl.lib;



import org.eclipse.wst.wsdl.PortType;
import org.eclipse.wst.wsdl.Operation;

public class Test {
	public static void main(String args[]) throws Exception{
		String url="resource/info.wso.wsdl";
	
		WsdlHelper helper=new WsdlHelper(url);
		System.out.println(helper.getBusinessDefinition());
		System.out.println(helper.getPortTypes().size());
		for(PortType portType: helper.getPortTypes()){
			System.out.println(portType);
			for(Operation operation: helper.getOperations(portType)){
				System.out.println(operation);
				System.out.println(helper.getInputMessage(operation));
			
			}
		}
		
		
	}

}
