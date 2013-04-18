package cn.edu.nju.cs.workflow.dialog;

import java.util.List;

import org.eclipse.bpel.model.Assign;
import org.eclipse.bpel.model.Copy;
import org.eclipse.bpel.model.Expression;
import org.eclipse.bpel.model.Variable;
import org.eclipse.bpel.model.adapters.INamespaceMap;
import org.eclipse.bpel.model.util.BPELUtils;
import org.eclipse.bpel.ui.details.tree.ITreeNode;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import cn.edu.nju.cs.workflow.provider.VariableProvider;

public class ExpressionUtil {
	
	private  VariableProvider variableProvider;
	
	public ExpressionUtil(VariableProvider variableProvider){
		this.variableProvider=variableProvider;
		
	}
	public  String element2XpathExpression(Object element){
		Object[] nodes=variableProvider.getPathToRoot(element);
		Variable variable = variableProvider.getVaraible();
		
		String namespace=variable.getMessageType().getQName().getNamespaceURI();
		String prefix=addNameSpacePrefix(variable, namespace, "ns");
		String expression="";
		for(int i=0;i<nodes.length;i++){
			ITreeNode treeNode = (ITreeNode)nodes[nodes.length-i-1];
			if(i==0)
				expression+="$";
			else if(i==1)
				expression+=".";
			else if(i==2)
				expression+="/"+prefix+":";
			expression+=treeNode.getLabel();
		}
		return expression;
	}
	public  String getOldExpression(Assign assign, Object element){
		String expression=element2XpathExpression(element);
		EList<Copy> copys=assign.getCopy();
		for(Copy copy: copys){
			String body=(String) copy.getTo().getExpression().getBody();
			if(body.equals(expression))
				return (String) copy.getFrom().getExpression().getBody();
		}
		
		return "";
	}
	
	public  String addNameSpacePrefix ( Variable variable, String namespace ,String prefixRoot) {

		
		String nsPrefix = BPELUtils.getNamespacePrefix(variable.eContainer().eContainer(), namespace);
		if (nsPrefix != null && nsPrefix.length() > 0) {
			return nsPrefix;
		}

	
		// Find a suitable prefix
		
		int idx = 0;
		nsPrefix = prefixRoot+idx;
		do {
			if (BPELUtils.getNamespace(variable.eContainer().eContainer(), nsPrefix) == null) {
				BPELUtils.setNamespacePrefix(variable.eContainer().eContainer(), namespace, nsPrefix);
				return nsPrefix;
			}
			nsPrefix = prefixRoot + idx;
			idx += 1;
		} while (true);
	}


}
