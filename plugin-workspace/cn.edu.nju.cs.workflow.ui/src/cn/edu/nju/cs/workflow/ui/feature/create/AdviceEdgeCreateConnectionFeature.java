package cn.edu.nju.cs.workflow.ui.feature.create;

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;


import cn.edu.nju.cs.workflow.model.AdviceEdge;
import cn.edu.nju.cs.workflow.model.AdviceTask;
import cn.edu.nju.cs.workflow.model.AdviceType;
import cn.edu.nju.cs.workflow.model.ModelFactory;
import cn.edu.nju.cs.workflow.model.WorkflowElement;
import cn.edu.nju.cs.workflow.model.WorkflowNode;
import cn.edu.nju.cs.workflow.ui.util.ConfigureUtil;


public class AdviceEdgeCreateConnectionFeature extends AbstractCreateConnectionFeature
implements ICreateConnectionFeature {

	public AdviceEdgeCreateConnectionFeature(IFeatureProvider fp) {
		super(fp, "AdviceEdge", "create Advice Edge");
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public boolean canCreate(ICreateConnectionContext context) {
		// TODO Auto-generated method stub
		WorkflowElement source = getElement(context.getSourceAnchor());
		WorkflowElement target = getElement(context.getTargetAnchor());
		if (source != null && target != null && source instanceof AdviceTask ) {
			if(target instanceof WorkflowNode){
				EList<AdviceEdge> edges=((WorkflowNode) target).getAdviceEdges();
				for(AdviceEdge edge: edges){
					if(edge.getAdviceTask()==(AdviceTask)source)
						return false;
		
				}
			}else if(target instanceof AdviceEdge){
				if(((AdviceEdge)target).getAdviceTask()==(AdviceTask)source)
				   return false;
			
			}
			return true;
			
		}
		return false;
	}

	@Override
	public Connection create(ICreateConnectionContext context) {
	
		Connection newConnection = null;		
		AdviceTask source =(AdviceTask)getElement(context.getSourceAnchor());
		WorkflowElement target =getElement(context.getTargetAnchor());

		if (source != null && target != null) {
			
		    AdviceEdge edge=null;
		    edge=ModelFactory.eINSTANCE.createAdviceEdge();
			edge.setId(ConfigureUtil.getId());
			if(target instanceof WorkflowNode){
				
				edge.setAdvicetype(AdviceType.AROUND);
				edge.setJoinPoint((WorkflowNode)target);
				edge.setAdviceTask(source);
				source.getAdviceEdges().add(edge);
				
				
			}else if(target instanceof AdviceEdge){
				
				edge.setAdvicetype(((AdviceEdge)target).getAdvicetype());
				edge.setJoinPoint(((AdviceEdge)target).getJoinPoint());
				edge.setAdviceTask(source);
				source.getAdviceEdges().add(edge);
			}
			
			 //getDiagram().eResource().getContents().add(edge);
			
//			assert(edge!=null);
			
//			EList<Anchor> anchors=context.getTargetAnchor().getParent().getAnchors();
//			Anchor targetAnchor=null;
//			for(Anchor anchor: anchors){
//				WorkflowElement element =getElement(anchor);
//				if (element instanceof AdviceEdge){
//					if(((AdviceEdge)element).getAdvicetype()==edge.getAdvicetype())
//						targetAnchor=anchor;
//					    break;
//						
//				}
//			}
//			assert(targetAnchor!=null);
		
			AddConnectionContext addContext = new AddConnectionContext(context.getSourceAnchor(),context.getTargetAnchor());
			
			addContext.setNewObject(edge);
			newConnection = (Connection) getFeatureProvider().addIfPossible(addContext);
		}

		return newConnection;
	}

	@Override
	public boolean canStartConnection(ICreateConnectionContext context) {
		// TODO Auto-generated method stub
		WorkflowElement source = getElement(context.getSourceAnchor());
		if (source!=null && source instanceof AdviceTask)
			return true;
		return false;
	}
	private WorkflowElement getElement(Anchor anchor) {
		if (anchor != null) {
			Object obj = getBusinessObjectForPictogramElement(anchor.getParent());
			if (obj instanceof WorkflowElement) {
				return (WorkflowElement) obj;
			}
		}
		return null;
	}

}
