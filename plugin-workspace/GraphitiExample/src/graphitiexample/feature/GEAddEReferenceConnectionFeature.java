package graphitiexample.feature;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddConnectionContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;

public class GEAddEReferenceConnectionFeature extends AbstractAddFeature {

	private static final IColorConstant E_REFERENCE_FOREGROUND =  IColorConstant.BLUE;;

	public GEAddEReferenceConnectionFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canAdd(IAddContext context) {
		// TODO Auto-generated method stub
		if (context instanceof IAddConnectionContext && context.getNewObject() instanceof EReference) {
			return true;
		}
		return false;
	}

	@Override
	public PictogramElement add(IAddContext context) {
		// TODO Auto-generated method stub
		IAddConnectionContext addConContext = (IAddConnectionContext) context;
		EReference addedEReference = (EReference) context.getNewObject();
		IPeCreateService peCreateService = Graphiti.getPeCreateService();

		// CONNECTION WITH POLYLINE
		Connection connection = peCreateService.createFreeFormConnection(getDiagram());
		connection.setStart(addConContext.getSourceAnchor());
		connection.setEnd(addConContext.getTargetAnchor());

		IGaService gaService = Graphiti.getGaService();
		Polyline polyline = gaService.createPlainPolyline(connection);
		polyline.setForeground(manageColor(E_REFERENCE_FOREGROUND));
		polyline.setLineWidth(2);

		// create link and wire it
		link(connection, addedEReference);

		// add dynamic text decorator for the reference name
		ConnectionDecorator textDecorator = peCreateService.createConnectionDecorator(connection, true, 0.5, true);
		Text text = gaService.createPlainText(textDecorator);
		text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER ); 
        text.setFont(gaService.manageDefaultFont(getDiagram(), false, true));
        text.setBackground(manageColor(IColorConstant.WHITE));
        text.setForeground(manageColor(IColorConstant.BLACK));
		gaService.setLocation(text, 10, 0);

		// set reference name in the text decorator
		EReference eReference = (EReference) context.getNewObject();
		text.setValue(eReference.getName());

		// add static graphical decorators (composition and navigable)
		ConnectionDecorator cd;
		cd = peCreateService.createConnectionDecorator(connection, false, 1.0, true);
		createArrow(cd);
		return connection;
	}
	private Polyline createArrow(GraphicsAlgorithmContainer gaContainer) {
		Polyline polyline = Graphiti.getGaCreateService().createPlainPolyline(gaContainer,
				new int[] { -15, 10, 0, 0, -15, -10 });
		polyline.setForeground(manageColor(E_REFERENCE_FOREGROUND));
		polyline.setLineWidth(2);
		return polyline;
	}
}
