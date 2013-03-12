package cn.edu.nju.cs.workflow.ui.diagram;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.tb.IToolBehaviorProvider;


public class WorkflowDiagramTypeProvider extends AbstractDiagramTypeProvider
		implements IDiagramTypeProvider {
  
    private IToolBehaviorProvider[] toolBehaviorProviders;
	public WorkflowDiagramTypeProvider() {
		// TODO Auto-generated constructor stub
		super();
		setFeatureProvider(new WorkflowFeatureProvider(this));
		
		
	}

	@Override
	 public IToolBehaviorProvider[] getAvailableToolBehaviorProviders() {
	        if (toolBehaviorProviders == null) {
	            toolBehaviorProviders =
	                new IToolBehaviorProvider[] { new WorkflowBehaviorProvider(this) };
	        }
	        return toolBehaviorProviders;
	  }
	@Override
	public void postInit() {
		// TODO Auto-generated method stub
		//((WorkflowFeatureProvider)getFeatureProvider()).initWorkflowProcess();
		//((WorkflowFeatureProvider)getFeatureProvider()).initDiagram();
		//((WorkflowFeatureProvider)getFeatureProvider()).initDiagram();
	}

	
	




}