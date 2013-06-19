package cn.edu.nju.cs.workflow.dialog;


import java.util.ArrayList;
import java.util.List;


import org.eclipse.bpel.model.Assign;
import org.eclipse.bpel.model.Copy;
import org.eclipse.bpel.model.Variable;
import org.eclipse.bpel.ui.details.tree.BPELVariableTreeNode;
import org.eclipse.bpel.ui.details.tree.ITreeNode;

import org.eclipse.bpel.ui.details.tree.PartTreeNode;
import org.eclipse.bpel.ui.details.tree.XSDElementDeclarationTreeNode;
import org.eclipse.bpel.ui.details.tree.XSDSchemaTreeNode;
import org.eclipse.bpel.ui.details.tree.XSDTypeDefinitionTreeNode;
import org.eclipse.emf.common.util.EList;

import org.eclipse.xsd.XSDElementDeclaration;
import org.eclipse.xsd.XSDSchema;
import org.eclipse.xsd.XSDTypeDefinition;

import cn.edu.nju.cs.workflow.provider.VariableProvider;

public class ExpressionUtil {
	
	private  VariableProvider variableProvider;
	
	public ExpressionUtil(VariableProvider variableProvider){
		this.variableProvider=variableProvider;
		
	}
	/*public String getSimpleExpression(Object element){
		String complexExpr=element2XpathExpression(element);
		String[] array=complexExpr.split(":");
		String newExpr="";
		for(int i=0;i<array.length;i++){
			if(i%2==0)
				newExpr+=array[i].substring(0,1);
			else
				newExpr+=array[i];
		}
		return newExpr;
		
	}
	
	public void setExpression(String simpleExpression){
		
		
	}*/
	public  String element2XpathExpression(Object element){
		Object[] nodes=variableProvider.getPathToRoot(element);
		return nodes2XpathExpression(nodes);
	}
	@SuppressWarnings("unused")
	public String nodes2XpathExpression(Object[]nodes){
		String expression="";
		for(int i=0;i<nodes.length;i++){
			String namespace=null;
			ITreeNode treeNode = (ITreeNode)nodes[nodes.length-i-1];	
			Object modelObject=treeNode.getModelObject();
			if(treeNode instanceof  BPELVariableTreeNode){
				namespace =((Variable) modelObject).getMessageType().getQName().getNamespaceURI();
				expression+="$";//+namespace+":";
			}else if(treeNode instanceof PartTreeNode){
				expression+=".";
			}else if(treeNode instanceof XSDElementDeclarationTreeNode){
				XSDElementDeclaration element=((XSDElementDeclarationTreeNode)treeNode).getResolvedModelObject();
				namespace=element.getSchema().getTargetNamespace();
				expression+="/";//+namespace+":";
			}else if(treeNode instanceof XSDSchemaTreeNode){
				XSDSchema schema=(XSDSchema)modelObject;
				namespace+= schema.getTargetNamespace();
				expression+="/";//+namespace+":";
			}else  if(treeNode instanceof XSDTypeDefinitionTreeNode){
				XSDTypeDefinition xsdType=(XSDTypeDefinition)modelObject;
				namespace= xsdType.getSchema().getTargetNamespace();
				expression+="/";//+namespace+":";
			}
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
	public List<Copy> getRelatedCopyExpressions(Assign assign, Object element){
		List<Copy> result=new ArrayList<Copy>();
		String expression=element2XpathExpression(element);
		EList<Copy> copys=assign.getCopy();
		for(int i=copys.size()-1;i>=0;i--){
			Copy copy=copys.get(i);
			if(copy!=null && copy.getTo().getExpression()!=null){
				String body=(String) copy.getTo().getExpression().getBody();
				if(body.startsWith(expression)||expression.startsWith(body))
					result.add(copy);
			}
		}
		return result;
		
	}
	
	public int getCopyOrder(Assign assign, Object element){
		String expression=element2XpathExpression(element);
		EList<Copy> copys=assign.getCopy();
		for(int i=copys.size()-1;i>=0;i--){
			Copy copy=copys.get(i);
			if(copy!=null && copy.getTo().getExpression()!=null){
				String body=(String) copy.getTo().getExpression().getBody();
				if(body.equals(expression))
					return i;
			}
		}
		return -1;
	}
	
}
