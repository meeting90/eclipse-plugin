package graphitidemo.features;

import graphitidemo.util.StyleUtil;

import org.eclipse.bpel.model.Assign;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IDirectEditingInfo;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.BoxRelativeAnchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;


public class AddAssignFeature extends AbstractAddFeature implements
		IAddFeature {

	private static String NAME="Assign";
	public static final int INVISIBLE_RECT_RIGHT = 6;
	public AddAssignFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canAdd(IAddContext context) {
		// TODO: check for right domain object instance below
		return  context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public PictogramElement add(IAddContext context) {
		final Diagram targetDiagram = (Diagram) context.getTargetContainer();

		// CONTAINER SHAPE WITH ROUNDED RECTANGLE
		final IPeCreateService peCreateService = Graphiti.getPeCreateService();
		final ContainerShape containerShape = peCreateService.createContainerShape(targetDiagram, true);
		final int width = context.getWidth() <= 0 ? 100 : context.getWidth();
		final int height = context.getHeight() <= 0 ? 50 : context.getHeight();

		final IGaService gaService = Graphiti.getGaService();
		RoundedRectangle roundedRectangle; // need to access it later
		
			// create invisible outer rectangle expanded by
			// the width needed for the anchor
			final Assign addedAssign = (Assign) context.getNewObject();
			final Rectangle invisibleRectangle = gaService.createInvisibleRectangle(containerShape);
			gaService.setLocationAndSize(invisibleRectangle, context.getX(), context.getY(), width + 2*INVISIBLE_RECT_RIGHT, height);
			// create and set visible rectangle inside invisible rectangle
			roundedRectangle = gaService.createPlainRoundedRectangle(invisibleRectangle, 5, 5);
			roundedRectangle.setStyle(StyleUtil.getStyleForEClass(getDiagram()));
			gaService.setLocationAndSize(roundedRectangle, INVISIBLE_RECT_RIGHT, 0, width, height);
			if (addedAssign.eResource() == null) {
				getDiagram().eResource().getContents().add(addedAssign);
			}

			// create link and wire it
			link(containerShape, addedAssign);
		
		// SHAPE WITH TEXT
		
			// create shape for text
			final Shape shape = peCreateService.createShape(containerShape, false);
			Text text = gaService.createPlainText(shape, addedAssign.getName());
			text.setStyle(StyleUtil.getStyleForEClassText(getDiagram()));
			gaService.setLocationAndSize(text, 0, 0, width, 20);
			link(shape, addedAssign);
			
			final IDirectEditingInfo directEditingInfo = getFeatureProvider().getDirectEditingInfo();
			directEditingInfo.setMainPictogramElement(containerShape);
			directEditingInfo.setPictogramElement(shape);
			directEditingInfo.setGraphicsAlgorithm(text);
		

		// add a chopbox anchor to the shape
		peCreateService.createChopboxAnchor(containerShape);

		// create an additional box relative anchor at middle-right
		final BoxRelativeAnchor boxAnchor = peCreateService.createBoxRelativeAnchor(containerShape);
		boxAnchor.setRelativeWidth(1.0);
		boxAnchor.setRelativeHeight(0.38); // Use golden section
		boxAnchor.setReferencedGraphicsAlgorithm(roundedRectangle);
		final Ellipse ellipse = gaService.createPlainEllipse(boxAnchor);
		final int w = INVISIBLE_RECT_RIGHT;
		gaService.setLocationAndSize(ellipse, -w, -w, 2 * w, 2 * w);
		ellipse.setStyle(StyleUtil.getStyleForEClass(getDiagram()));
		
		final BoxRelativeAnchor leftboxAnchor = peCreateService.createBoxRelativeAnchor(containerShape);
		leftboxAnchor.setRelativeWidth(0.0);
		leftboxAnchor.setRelativeHeight(0.38); // Use golden section
		leftboxAnchor.setReferencedGraphicsAlgorithm(roundedRectangle);
        final Ellipse leftellipse=gaService.createPlainEllipse(leftboxAnchor);
        gaService.setLocationAndSize(leftellipse, -w, -w, 2*w, 2*w);
        leftellipse.setStyle(StyleUtil.getStyleForEClass(getDiagram()));
		// call the layout feature
		layoutPictogramElement(containerShape);

		return containerShape;
		
	}
}
