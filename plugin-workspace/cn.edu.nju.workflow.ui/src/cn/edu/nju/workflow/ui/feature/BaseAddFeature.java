package cn.edu.nju.workflow.ui.feature;



import org.eclipse.emf.ecore.EClass;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.algorithms.Image;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;

import cn.edu.nju.workflow.model.WorkflowElement;
import cn.edu.nju.workflow.ui.diagram.WorkflowImageProvider;
import cn.edu.nju.workflow.ui.util.StyleUtil;

public class BaseAddFeature extends AbstractAddFeature {

	public BaseAddFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canAdd(IAddContext context) {
		// TODO Auto-generated method stub
		 if (context.getNewObject() instanceof WorkflowElement) {
	            // check if user wants to add to a diagram
	            if (context.getTargetContainer() instanceof Diagram) {
	                return true;
	            }
	        }
	        return false;
	}

	@Override
	public PictogramElement add(IAddContext context) {
		// TODO Auto-generated method stub
		final WorkflowElement element = (WorkflowElement) context.getNewObject();
		final Diagram targetDiagram = (Diagram) context.getTargetContainer();
		final IPeCreateService peCreateService = Graphiti.getPeCreateService();
		final ContainerShape containerShape = peCreateService.createContainerShape(targetDiagram, true);
		final int width = context.getWidth() <= 0 ? element.getWidth() : context.getWidth();
		final int height = context.getHeight() <= 0 ? element.getHeight() : context.getHeight();
		final IGaService gaService = Graphiti.getGaService();
		final Rectangle invisibleRectangle = gaService.createInvisibleRectangle(containerShape);
		gaService.setLocationAndSize(invisibleRectangle, context.getX(), context.getY(), width, height);
        if (element.eResource() == null) {
				getDiagram().eResource().getContents().add(element);
	    }
		link(containerShape, element);
		return containerShape;

	}

}
