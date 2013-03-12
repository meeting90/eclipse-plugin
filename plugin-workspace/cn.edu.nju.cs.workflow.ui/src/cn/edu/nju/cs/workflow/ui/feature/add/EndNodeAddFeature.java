package cn.edu.nju.cs.workflow.ui.feature.add;

import java.util.Collection;

import org.eclipse.bpel.model.BPELFactory;
import org.eclipse.bpel.model.PartnerLink;
import org.eclipse.bpel.model.PartnerLinks;
import org.eclipse.bpel.model.Reply;
import org.eclipse.bpel.model.Sequence;
import org.eclipse.bpel.model.Variable;
import org.eclipse.bpel.model.Variables;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.pictograms.BoxRelativeAnchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.wst.wsdl.Operation;
import org.eclipse.wst.wsdl.PortType;

import cn.edu.nju.cs.workflow.model.ModelFactory;
import cn.edu.nju.cs.workflow.model.InputPort;
import cn.edu.nju.cs.workflow.model.SimpleTask;
import cn.edu.nju.cs.workflow.ui.diagram.WorkflowFeatureProvider;
import cn.edu.nju.cs.workflow.ui.util.ConfigureUtil;
import cn.edu.nju.cs.workflow.ui.util.StyleUtil;

public class EndNodeAddFeature extends SimpleTaskAddFeature{
	private int totalWidth=40;
	private int totalHeight=40;
	public EndNodeAddFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
		setTotalWidth(totalWidth);
		setTotalHeight(totalHeight);
	}
	public boolean canAdd(IAddContext context) {
		// TODO Auto-generated method stub
		return true;
        
	}
	public PictogramElement add(IAddContext context) {
		final Diagram targetDiagram = (Diagram) context.getTargetContainer();
		final IPeCreateService peCreateService = Graphiti.getPeCreateService();
		final IGaService gaService = Graphiti.getGaService();
		ContainerShape containerShape = peCreateService.createContainerShape(targetDiagram, true);
		
		RoundedRectangle portRectangle=gaService.createPlainRoundedRectangle(containerShape, 0, 0);
		portRectangle.setStyle(StyleUtil.getStyleForPort(getDiagram()));
		gaService.setLocationAndSize(portRectangle,context.getX() ,context.getY()  ,getTotalWidth(), getTotalHeight());
	
		int[] xy={0,0,0,getTotalWidth(),getTotalHeight(),getTotalWidth()/2};
		Polygon polygon=gaService.createPlainPolygon(portRectangle, xy);
		polygon.setStyle(StyleUtil.getStyleForInputAngle(getDiagram()));
	
	
		
		peCreateService.createChopboxAnchor(containerShape);
	
		final BoxRelativeAnchor boxAnchor = peCreateService.createBoxRelativeAnchor(containerShape);
		boxAnchor.setRelativeWidth(0.0);
		boxAnchor.setRelativeHeight(0.5); 
		boxAnchor.setReferencedGraphicsAlgorithm(portRectangle);
		boxAnchor.setUseAnchorLocationAsConnectionEndpoint(true);
	
		Ellipse anchorEllipse = gaService.createEllipse(boxAnchor);
		gaService.setLocationAndSize(anchorEllipse, 0, 0, 0, 0);	
		initSimpleTask(containerShape);
		return containerShape;
	}
	private void initSimpleTask(ContainerShape shape){
		SimpleTask task=ModelFactory.eINSTANCE.createSimpleTask();
		task.setIsFinishNode(true);
		InputPort inPort=ModelFactory.eINSTANCE.createInputPort();
		inPort.setId(ConfigureUtil.getId());
		task.setInput(inPort);
		inPort.setNode(task);
		
		
		WorkflowFeatureProvider provider=(WorkflowFeatureProvider) getFeatureProvider();
		
		provider.getWorkflow().getNodes().add(task);
		link(shape,inPort);
		Variables variables=provider.getWorkflowProcess().getBpelProcess().getVariables();
		PartnerLinks partnerLinks=provider.getWorkflowProcess().getBpelProcess().getPartnerLinks();
		PartnerLink partnerLink=BPELFactory.eINSTANCE.createPartnerLink();
		partnerLink.setName("client");
		partnerLink.setInitializePartnerRole(true);
		partnerLinks.getChildren().add(partnerLink);
		
		Collection<PortType> porttypes=provider.getNewPortTypes();
		for(PortType porttype: porttypes){
			Operation operation=(Operation) porttype.getOperations().get(0);		
			
			
			Variable output=BPELFactory.eINSTANCE.createVariable();
			output.setName(operation.getName()+"output");
			output.setMessageType(operation.getEOutput().getEMessage());
			variables.getChildren().add(output);
			
			Reply reply=BPELFactory.eINSTANCE.createReply();
			reply.setName("reply");
			reply.setPartnerLink(partnerLink);
			reply.setOperation(operation);
			reply.setPortType(porttype);
			reply.setVariable(output);
			
			inPort.setInputValue(output);
			
			task.setPartnerActivity(reply);
			
			task.setPartnerLink(partnerLink);
			((Sequence)provider.getWorkflowProcess().getBpelProcess().getActivity()).getActivities().add(reply);

		}
		
		
		
		
	}

	


}
