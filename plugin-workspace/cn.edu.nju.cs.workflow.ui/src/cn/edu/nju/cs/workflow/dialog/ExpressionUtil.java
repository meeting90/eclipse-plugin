package cn.edu.nju.cs.workflow.dialog;


import org.eclipse.bpel.model.Assign;
import org.eclipse.bpel.model.Copy;
import org.eclipse.bpel.model.Variable;
import org.eclipse.bpel.model.Process;
import org.eclipse.bpel.model.util.BPELUtils;
import org.eclipse.bpel.ui.details.tree.ITreeNode;
import org.eclipse.emf.common.util.EList;

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
		//String prefix=addNameSpacePrefix(variable, namespace, "n_s");
		String expression="";
		for(int i=0;i<nodes.length;i++){
			ITreeNode treeNode = (ITreeNode)nodes[nodes.length-i-1];
			if(i==0)
				expression+="$";
			else if(i==1)
				expression+=".";
			else if(i>=2)
				expression+="/";
			expression+=treeNode.getLabel();
		}
		return expression;
	}
	public  String getOldExpression(Assign assign, Object element){
		Copy copy=getOldCopyExpression(assign, element);
		if(copy==null)
			return "";
		else 
			return (String) copy.getFrom().getExpression().getBody();
		
	}
	public Copy getOldCopyExpression(Assign assign ,Object element){
		String expression=element2XpathExpression(element);
		EList<Copy> copys=assign.getCopy();
		for(int i=copys.size()-1;i>=0;i--){
			Copy copy=copys.get(i);
			if(copy!=null && copy.getTo().getExpression()!=null){
				String body=(String) copy.getTo().getExpression().getBody();
				if(body.equals(expression))
					return copy;
			}
		}
		
		return null;
	}
	
	public  String addNameSpacePrefix ( Variable variable, String namespace ,String prefixRoot) {

		
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


}
