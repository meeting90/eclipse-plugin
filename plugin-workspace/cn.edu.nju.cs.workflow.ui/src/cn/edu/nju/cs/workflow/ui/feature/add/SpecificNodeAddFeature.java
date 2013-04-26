package cn.edu.nju.cs.workflow.ui.feature.add;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.pictograms.BoxRelativeAnchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;

import cn.edu.nju.cs.workflow.model.SimpleTask;
import cn.edu.nju.cs.workflow.ui.util.StyleUtil;
public class SpecificNodeAddFeature extends AbstractAddFeature {
	int messageWidth=40;
	

	public SpecificNodeAddFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canAdd(IAddContext context) {
		// TODO Auto-generated method stub
	return context.getTargetContainer() instanceof Diagram && context.getNewObject() instanceof SimpleTask;
	
            
        
	}

	@Override
	public PictogramElement add(IAddContext context) {
		// TODO Auto-generated method stub
		final SimpleTask element = (SimpleTask) context.getNewObject();
		
		final Diagram targetDiagram = (Diagram) context.getTargetContainer();
		final IPeCreateService peCreateService = Graphiti.getPeCreateService();
		final IGaService gaService = Graphiti.getGaService();
		final ContainerShape containerShape = peCreateService.createContainerShape(targetDiagram, true);
		RoundedRectangle messageRectangle=gaService.createPlainRoundedRectangle(containerShape, 0, 0);
		messageRectangle.setStyle(StyleUtil.getStyleForElement(getDiagram()));
		gaService.setLocationAndSize(messageRectangle,context.getX(),context.getY(),messageWidth,messageWidth);
		
    	Polyline polyline = Graphiti.getGaCreateService().createPlainPolyline(messageRectangle,
				new int[] { 0, 0,messageWidth/2,messageWidth/2, messageWidth, 0 });
		polyline.setStyle(StyleUtil.getStyleForMessage(getDiagram()));
		
		
		if(element.getInput()!=null)
			link(containerShape,element.getInput());
		else if(false==element.getOutputs().isEmpty())
			link(containerShape,element.getOutputs().get(0));
	
			
		
		peCreateService.createChopboxAnchor(containerShape);
		final BoxRelativeAnchor boxAnchor = peCreateService.createBoxRelativeAnchor(containerShape);
    	boxAnchor.setRelativeWidth(0.5);
		boxAnchor.setRelativeHeight(0.5); 
		boxAnchor.setReferencedGraphicsAlgorithm(messageRectangle);
		boxAnchor.setUseAnchorLocationAsConnectionEndpoint(true);
		Ellipse anchorEllipse = gaService.createEllipse(boxAnchor);
		gaService.setLocationAndSize(anchorEllipse, 0, 0, 0, 0);
		
		return containerShape;
		
	}

	
	
}
