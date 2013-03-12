package cn.edu.nju.cs.workflow.ui.feature.create;


import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

import cn.edu.nju.cs.workflow.model.Edge;
import cn.edu.nju.cs.workflow.model.InputPort;
import cn.edu.nju.cs.workflow.model.ModelFactory;
import cn.edu.nju.cs.workflow.model.OutputPort;
import cn.edu.nju.cs.workflow.model.Port;
import cn.edu.nju.cs.workflow.ui.diagram.WorkflowFeatureProvider;
import cn.edu.nju.cs.workflow.ui.util.ConfigureUtil;

public class EdgeCreateConnectionFeature extends AbstractCreateConnectionFeature
		implements ICreateConnectionFeature {

	public EdgeCreateConnectionFeature(IFeatureProvider fp) {
		super(fp, " Edge", "Creates a Workflow Control Edge");
	}

	public boolean canCreate(ICreateConnectionContext context) {
		// return true if both anchors belong to a EClass
		// and those EClasses are not identical
		//context.getSourceAnchor().getParent()
		Port source = getPort(context.getSourceAnchor());
		Port target = getPort(context.getTargetAnchor());
		if (source != null && target != null && source instanceof OutputPort && target instanceof InputPort) {
			if(((OutputPort)source).getNode()==((InputPort)target).getNode())
				return false;
			OutputPort outPort=(OutputPort)source;
			EList<Edge> edges=outPort.getEdges();
			for(Edge edge : edges){
				if (edge.getTarget()==target)
					return false;
			}
			return true;
		}
		return false;
	}

	public boolean canStartConnection(ICreateConnectionContext context) {
		// return true if start anchor belongs to a EClass
		Port port=getPort(context.getSourceAnchor());
		if (port!=null && port instanceof OutputPort) {
			return true;
		}
		return false;
	}

	public Connection create(ICreateConnectionContext context) {
		Connection newConnection = null;

		// get EClasses which should be connected
		OutputPort source = (OutputPort)getPort(context.getSourceAnchor());
		InputPort target = (InputPort)getPort(context.getTargetAnchor());

		if (source != null && target != null) {
			// create new business object
			Edge edge = createEdge(source, target);
			
			//getDiagram().eResource().getContents().add(edge);
			// add connection for business object
			AddConnectionContext addContext = new AddConnectionContext(context.getSourceAnchor(), context.getTargetAnchor());
			addContext.setNewObject(edge);
			newConnection = (Connection) getFeatureProvider().addIfPossible(addContext);
			PictogramElement pe = context.getSourcePictogramElement();
				updatePictogramElement(((Shape) pe).getContainer());
			pe=context.getTargetPictogramElement();
				updatePictogramElement(((Shape) pe).getContainer());
			
		}

		return newConnection;
	}

	private Port getPort(Anchor anchor) {
		if (anchor != null) {
			Object obj = getBusinessObjectForPictogramElement(anchor.getParent());
			if (obj instanceof Port) {
				return (Port) obj;
			}
		}
		return null;
	}
	

	
	private Edge createEdge(Port source, Port target) {
		Edge edge=ModelFactory.eINSTANCE.createEdge();
		edge.setId(ConfigureUtil.getId());
		edge.setName(ConfigureUtil.getEdgeName());
		edge.setSource((OutputPort)source);
		edge.setTarget((InputPort)target);
		
		((OutputPort)source).getNode().setIsFinishNode(false);
		((InputPort)target).getNode().setIsStartNode(false);
		
		WorkflowFeatureProvider provider=(WorkflowFeatureProvider) getFeatureProvider();
		provider.getWorkflow().getEdges().add(edge);
	
		
		return edge;
	}
}
