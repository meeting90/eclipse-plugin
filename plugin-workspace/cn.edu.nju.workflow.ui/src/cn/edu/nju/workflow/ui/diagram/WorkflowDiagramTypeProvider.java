package cn.edu.nju.workflow.ui.diagram;



import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;

public class WorkflowDiagramTypeProvider extends AbstractDiagramTypeProvider
		implements IDiagramTypeProvider {

	public WorkflowDiagramTypeProvider() {
		// TODO Auto-generated constructor stub
		super();
		setFeatureProvider(new WorkflowFeatureProvider(this));
	}

}
