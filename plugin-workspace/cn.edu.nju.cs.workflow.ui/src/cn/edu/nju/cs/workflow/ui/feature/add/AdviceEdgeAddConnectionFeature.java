package cn.edu.nju.cs.workflow.ui.feature.add;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddConnectionContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;

import cn.edu.nju.cs.workflow.model.AdviceEdge;
import cn.edu.nju.cs.workflow.ui.util.StyleUtil;


public class AdviceEdgeAddConnectionFeature extends BaseAddFeature{

	public AdviceEdgeAddConnectionFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canAdd(IAddContext context) {
		// TODO Auto-generated method stub
		if (context instanceof IAddConnectionContext && context.getNewObject() instanceof AdviceEdge) {
			return true;
		}
		return false;
	}

	@Override
	public PictogramElement add(IAddContext context) {
		// TODO Auto-generated method stub
		IAddConnectionContext addConContext = (IAddConnectionContext) context;
		AdviceEdge edge = (AdviceEdge) context.getNewObject();
		IPeCreateService peCreateService = Graphiti.getPeCreateService();

		Connection connection = peCreateService.createFreeFormConnection(getDiagram());
		connection.setStart(addConContext.getSourceAnchor());
		connection.setEnd(addConContext.getTargetAnchor());

		IGaService gaService = Graphiti.getGaService();
		Polyline polyline = gaService.createPlainPolyline(connection);
		polyline.setStyle(StyleUtil.getStyleForElement(getDiagram()));
	    polyline.setLineStyle(LineStyle.DOT);
		
		
		link(connection, edge);

		// add dynamic text decorator for the reference name
		ConnectionDecorator textDecorator = peCreateService.createConnectionDecorator(connection, true, 0.5, true);
		Text text = gaService.createPlainText(textDecorator);
		text.setStyle(StyleUtil.getStyleForTextDecorator((getDiagram())));
		gaService.setLocation(text, 10, 0);

		text.setValue(edge.getAdvicetype().toString());

	    
		ConnectionDecorator cd;
		cd = peCreateService.createConnectionDecorator(connection, false, 1.0, true);
		int[] xy={getPointCutR()*2,0,0,-getPointCutR()*2,0,0,0,getPointCutR()*2};
		Polygon polygon=Graphiti.getGaCreateService().createPolygon(cd, xy);
		polygon.setStyle(StyleUtil.getStyleForElement(getDiagram()));
		polygon.setLineStyle(LineStyle.DOT);
		
	
		return connection;
	}

}
