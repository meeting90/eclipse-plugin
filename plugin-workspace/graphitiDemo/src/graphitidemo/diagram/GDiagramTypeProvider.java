package graphitidemo.diagram;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;

public class GDiagramTypeProvider extends AbstractDiagramTypeProvider {

	public GDiagramTypeProvider() {
		super();
		setFeatureProvider(new GFeatureProvider(this));
	}
}
