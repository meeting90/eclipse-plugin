package graphitiexample.diagram;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.tb.IToolBehaviorProvider;

public class GEDiagramTypeProvider extends AbstractDiagramTypeProvider
		implements IDiagramTypeProvider {
	private IToolBehaviorProvider[] toolBehaviorProviders;
	public GEDiagramTypeProvider() {
		// TODO Auto-generated constructor stub
		super();
		setFeatureProvider(new GEFeatureProvider(this));
	}
	 @Override
	 public IToolBehaviorProvider[] getAvailableToolBehaviorProviders() {
	        if (toolBehaviorProviders == null) {
	            toolBehaviorProviders =
	                new IToolBehaviorProvider[] { new GEToolBehaviorProvider(this) };
	        }
	        return toolBehaviorProviders;
	  }

}
