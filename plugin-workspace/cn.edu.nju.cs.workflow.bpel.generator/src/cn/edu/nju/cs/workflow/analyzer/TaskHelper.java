package cn.edu.nju.cs.workflow.analyzer;


import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

import org.eclipse.bpel.model.Activity;
import org.eclipse.bpel.model.Assign;
import org.eclipse.bpel.model.BPELFactory;
import org.eclipse.bpel.model.Flow;
import org.eclipse.bpel.model.Sequence;
import org.eclipse.bpel.model.Scope;
import org.eclipse.emf.common.util.EList;

import cn.edu.nju.cs.workflow.model.Edge;
import cn.edu.nju.cs.workflow.model.SimpleTask;
import cn.edu.nju.cs.workflow.model.WorkflowNode;
import cn.edu.nju.cs.workflow.model.WorkflowProcess;

public class TaskHelper {
	WorkflowProcess workflowProcess;
	Sequence orginalSequence;
	public TaskHelper(WorkflowProcess wp){
		this.workflowProcess=wp;
		this.orginalSequence=(Sequence)((Scope)wp.getRootWorkflow().getActivity()).getActivity();
	}
	public void orderActivities() throws Exception{
		Sequence sequence=BPELFactory.eINSTANCE.createSequence();
		Sequence root=sequence;
		LinkedList<Sequence> prev=new LinkedList<Sequence>();
		LinkedList<Object> taskOrder=generateTaskSequence();
		for(Object node: taskOrder){
			if(node instanceof SimpleTask){
				System.out.println(((SimpleTask)node).getName());
				if(((SimpleTask)node).getInput()!=null){
					Assign assign=((SimpleTask)node).getInput().getAssign();
					if(assign!=null){
						orginalSequence.getActivities().remove(assign);
						assign.setName(((SimpleTask)node).getName());
						sequence.getActivities().add(assign);
					}
				}if(((SimpleTask)node).getPartnerActivity() instanceof Activity){
					Activity activity=(Activity) ((SimpleTask)node).getPartnerActivity();
					orginalSequence.getActivities().remove(activity);
					sequence.getActivities().add(activity);
				}
			}else if(node instanceof String){
				System.out.println(node);
				if(node.equals("(")){
					prev.push(sequence);
					Flow flow=BPELFactory.eINSTANCE.createFlow();
					sequence.getActivities().add(flow);
					
					sequence=BPELFactory.eINSTANCE.createSequence();
					flow.getActivities().add(sequence);
					
				}else if(node.equals(")")){
					sequence=prev.pop();
					
				}else if(node.equals(",")){
					Flow flow=(Flow) sequence.getContainer();
					sequence=BPELFactory.eINSTANCE.createSequence();
					flow.getActivities().add(sequence);
					
				}
			}
		}
		orginalSequence.getActivities().addAll(root.getActivities());
	}
	public LinkedList<Object> generateTaskSequence() throws Exception{
		WorkflowNode startNode=findStartNode();
		EList<WorkflowNode> allNodes=this.workflowProcess.getRootWorkflow().getNodes();
		for(WorkflowNode node: allNodes){
			encodeWorkflowNode(node);
			System.out.println(node.getName()+":"+node.getComment());
		}		
		Set<WorkflowNode> startSet=new HashSet<WorkflowNode>();
		Set<WorkflowNode> nodes=new HashSet<WorkflowNode>();
		nodes.addAll(allNodes);
		startSet.add(startNode);
		LinkedList<Object> result=new LinkedList<Object>();
		serializeNode(nodes, startSet,result);
		return result;
		
	}
	public void serializeNode(Set<WorkflowNode> nodes,Set<WorkflowNode> startNodes,LinkedList<Object> result) throws Exception{
		
	
		if(nodes.size()==0)
			return;
		if(nodes.size()==1)
			result.add(nodes.iterator().next());
		else{
			boolean serialized=true;
			WorkflowNode joinNode=findJoinNode(startNodes);
			if(nodes.contains(joinNode)){
				serialized=false;
				nodes.remove(joinNode);
			}
			Map<Set<WorkflowNode> ,Set<WorkflowNode>> nodesMap=partitionWorkflowNodes(nodes, startNodes,joinNode);
			if(nodesMap!=null&&nodesMap.size()==1){
				for(Set<WorkflowNode> key: nodesMap.keySet()){
					serializeNode(nodesMap.get(key), key,result);
					//nodes.removeAll(nodesMap.get(key));
				}
			}
			else if(nodesMap!=null&&nodesMap.size()>1){
				result.add("(");
				for(Set<WorkflowNode> key: nodesMap.keySet()){
					serializeNode(nodesMap.get(key), key,result);
					result.add(",");
				}
				result.removeLast();
				result.add(")");
			}
			if(serialized==false)
				result.add(joinNode);
			Set<WorkflowNode> start=new HashSet<WorkflowNode>();
			if(!joinNode.isIsFinishNode()){
				start.addAll(nextNodes(joinNode));
				serializeNode(nodes,start,result);
			}
			
		}	
	}
	
	private void encodeWorkflowNode(WorkflowNode node){
		if(node.getComment()!=null)
			return;
		if(node.isIsFinishNode()){
			node.setComment("1");
		}
		else{
			Set<WorkflowNode> nextNodes=nextNodes(node);
			for(WorkflowNode nextNode :nextNodes){
				if(nextNode.getComment()!=null){
					Set<WorkflowNode> prevNodes=prevNodes(nextNode);
					int i=0;
					for(WorkflowNode prevNode: prevNodes){
						if(prevNode.getComment()==null){
							prevNode.setComment(nextNode.getComment()+"-"+i);
						}
						i++;
					}
				}else{
					encodeWorkflowNode(nextNode);
					encodeWorkflowNode(node);
				}
					
			}
			
			
			
			
		}
	}

	private WorkflowNode findStartNode() throws Exception{
		EList<WorkflowNode> allNodes=this.workflowProcess.getRootWorkflow().getNodes();
		for(WorkflowNode node: allNodes){
				if(node.isIsStartNode())
					return node;
		}
		throw new Exception("Start Node not found");
		
	}
	private Set<WorkflowNode> nextNodes(WorkflowNode node){
	
			Set<WorkflowNode> nextNodes=new HashSet<WorkflowNode>();
			for(Edge edge:node.getOutputs().get(0).getEdges()){
				nextNodes.add(edge.getTarget().getNode());
			}
			return nextNodes;
			
		
	}
	private Set<WorkflowNode> prevNodes(WorkflowNode node){
		
			Set<WorkflowNode> prevNodes=new HashSet<WorkflowNode>();
			for(Edge edge:node.getInput().getEdges()){
				prevNodes.add(edge.getSource().getNode());
			}
			return prevNodes;
			
		
	}
	private Map<Set<WorkflowNode> ,Set<WorkflowNode>> partitionWorkflowNodes(Set<WorkflowNode> nodes,Set<WorkflowNode> startNodes,WorkflowNode joinNode) throws Exception{
		 Map<Set<WorkflowNode>,Set<WorkflowNode>> mapNode=new HashMap<Set<WorkflowNode>,Set<WorkflowNode>>();
		for(WorkflowNode startNode: startNodes){
			if(startNode==joinNode)
				return null;
			if(nodes.contains(startNode)){
				Set<WorkflowNode> set=dfsWorkflowNodes(nodes, startNode);
				Set<WorkflowNode> starts=new HashSet<WorkflowNode>();
				for(WorkflowNode node: startNodes){
					if(set.contains(node)){
						starts.add(node);
					}
				}
				mapNode.put(starts, set);
			}
		}
	
		return mapNode;
		
		
		
	}
	private Set<WorkflowNode> dfsWorkflowNodes(Set<WorkflowNode> nodes, WorkflowNode startNode){
		Set<WorkflowNode> dfsNode=new HashSet<WorkflowNode>();
		dfsNode.add(startNode);
		nodes.remove(startNode);
		for(WorkflowNode childNode : nextNodes(startNode)){
			if(nodes.contains(childNode)){
				dfsNode.addAll(dfsWorkflowNodes(nodes, childNode));
			}
		}
		for(WorkflowNode childNode: prevNodes(startNode)){
			if(nodes.contains(childNode)){
				dfsNode.addAll(dfsWorkflowNodes(nodes, childNode));
			}
		}
		return dfsNode;
	}
	
	private WorkflowNode findJoinNode(Set<WorkflowNode> nodes) throws Exception{
		if(nodes.size()==1)
			return nodes.iterator().next();
		if(nodes.isEmpty())
			throw new Exception("Next Node not found");
		String []commonCode=nodes.iterator().next().getComment().split("-");
		int commonLength=commonCode.length;
		for(WorkflowNode node:nodes){
			String []nodeCode=node.getComment().split("-");
			commonLength=commonLength>nodeCode.length?nodeCode.length:commonLength;
			int i=0;
			for(i=0;i<commonLength;i++){
				if(!commonCode[i].equals(nodeCode[i]))
					break;
			}
			commonLength=i;
		}
		String comment="";
		for(int i=0;i<commonLength;i++){
			if(i==0){
				comment+=commonCode[i];
			}else
				comment+="-"+commonCode[i];
		}
		//System.out.println(comment);
		return findWorkflowNode(comment);
	}
	private WorkflowNode findWorkflowNode(String comment) throws Exception{
		EList<WorkflowNode> allNodes=this.workflowProcess.getRootWorkflow().getNodes();
		for(WorkflowNode node: allNodes){
				if(node.getComment().equals(comment))
					return node;
		}
		throw new Exception("Join Node not found");
	}
	

}
