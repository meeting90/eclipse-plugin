package cn.edu.nju.cs.workflow.bpel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.bpel.model.Variable;
import org.eclipse.bpel.ui.details.tree.ITreeNode;

import cn.edu.nju.cs.workflow.dialog.ExpressionUtil;
import cn.edu.nju.cs.workflow.model.Edge;
import cn.edu.nju.cs.workflow.model.WorkflowNode;
import cn.edu.nju.cs.workflow.provider.VariableProvider;

public class VariableTypeResolver {
	Variable currentVariable;
	WorkflowNode currentNode;
	VariableProvider currentProvider;
	VariableProvider candidateProvider;
	
	ExpressionUtil currentUtil;
	ExpressionUtil candidateUtil;
	Map<String,ArrayList<String>> consistentExpr=new HashMap<String,ArrayList<String>>();
	public VariableTypeResolver(Variable var,WorkflowNode wfnode ){
		this.currentVariable=var;
		this.currentNode=wfnode;
		
	}
	public Map<String,ArrayList<String>> getExprMap(){
		return consistentExpr;
	}
	public void execute(){
		Set<Variable> usedVariables=getUsedVariables();
		int size=usedVariables.size();
		currentProvider=new VariableProvider(true, new Variable[]{currentVariable});
		candidateProvider=new VariableProvider(true, usedVariables.toArray(new Variable[size]));
		currentUtil=new ExpressionUtil(currentProvider);
		candidateUtil=new ExpressionUtil(candidateProvider);
		
		ITreeNode varNode=(ITreeNode) currentProvider.getElements(null)[0];
		for(Object node: candidateProvider.getElements(null)){
			
			buildNodeMap(varNode,node);
		}
		
	}
	private void buildNodeMap(Object root1,Object root2){
		ArrayList<String> list=matchNode(root1, root2);
		String key=currentUtil.element2XpathExpression(root1);
		if(consistentExpr.containsKey(key))
			consistentExpr.get(key).addAll(list);
		else
			consistentExpr.put(key, list);
		if(currentProvider.hasChildren(root1)){
			for(Object child: currentProvider.getChildren(root1)){
				buildNodeMap(child,root2);
			}
		}
	}
	private ArrayList<String> matchNode(Object node1, Object node2){
		String type=((ITreeNode)node1).getLabelSuffix();
		ArrayList<String>  list=new ArrayList<String>();
		if(type.equals(((ITreeNode)node2).getLabelSuffix()))
			list.add(candidateUtil.element2XpathExpression(node2));
		if(candidateProvider.hasChildren(node2)){
			for(Object child: candidateProvider.getChildren(node2)){
				list.addAll(matchNode(node1,child));
			}
		}
		return list;
	}
	
	private Set<Variable> getUsedVariables(){
		Set<Variable> variables=new HashSet<Variable>();
		Set<WorkflowNode> nodes=getBeforeNode(currentNode);
		for(WorkflowNode node: nodes){
			if(node.getInput()!=null) 
				variables.add(node.getInput().getInputValue());
			if(node.getOutputs()!=null&&node.getOutputs().get(0).getOutputValue()!=null)
				variables.add(node.getOutputs().get(0).getOutputValue());
		}
		return variables;
	}
	private  Set<WorkflowNode>  getBeforeNode(WorkflowNode node){
		Set<WorkflowNode> nodes=new HashSet<WorkflowNode>();
		if(node.getInput()!=null){
			for(Edge edge:node.getInput().getEdges()){
				WorkflowNode source=edge.getSource().getNode();
				nodes.add(source);
				nodes.addAll(getBeforeNode(source));
			}
		}
		return nodes;
	}
	
	
}
