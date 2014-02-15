package cn.edu.nju.cs.workflow.ui.diagram;


import java.util.Collection;


import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;

import org.eclipse.graphiti.features.context.impl.CreateContext;

import org.eclipse.graphiti.tb.IToolBehaviorProvider;

import org.eclipse.wst.wsdl.Operation;
import org.eclipse.wst.wsdl.PortType;

import cn.edu.nju.cs.workflow.ui.feature.create.EndTaskCreateFeature;
import cn.edu.nju.cs.workflow.ui.feature.create.StartTaskCreateFeature;


public class WorkflowDiagramTypeProvider extends AbstractDiagramTypeProvider
		implements IDiagramTypeProvider {
  
	public WorkflowDiagramTypeProvider() {
		// TODO Auto-generated constructor stub
		super();
		setFeatureProvider(new WorkflowFeatureProvider(this));
	}
	@Override
	public IToolBehaviorProvider getCurrentToolBehaviorProvider() {	
		// TODO Auto-generated method stub
		return new WorkflowBehaviorProvider(this);
	}
	@Override
	public void postInit() {
		//init diagram with start Node and end Node
		if(getDiagram().isActive()==false){
			
			WorkflowFeatureProvider provider=(WorkflowFeatureProvider) getFeatureProvider();
			Collection<PortType> porttypes=provider.getNewPortTypes();
			if(porttypes.size()==1){
				for(PortType porttype: porttypes){
					int i=0;
					
					for(Object ob : porttype.getOperations()){
						i++;
						Operation operation=(Operation)ob;
						StartTaskCreateFeature startFeature=new StartTaskCreateFeature(getFeatureProvider(),porttype,operation);
						EndTaskCreateFeature endFeature=new EndTaskCreateFeature(getFeatureProvider(),porttype,operation);
						
						CreateContext context=new CreateContext();
						context.setTargetContainer(getDiagram());
						context.setLocation(0, 200*i);
						
						getDiagramBehavior().executeFeature(startFeature, context);
						
						context.setLocation(500, 200*i);
						getDiagramBehavior().executeFeature(endFeature, context);
					
						context.setLocation(300, 200*i);
					
						getDiagramBehavior().refresh();
					}
			
					
				
				}
			}
		}	
	}
	@Override
	public boolean isAutoUpdateAtStartup() {
	// TODO Auto-generated method stub
		return  true;
	}
/*
private Anchor getAnchor(PictogramElement pe){
	
		Anchor ret = null;
		if (pe instanceof Anchor) {
			ret = (Anchor) pe;
		} else if (pe instanceof AnchorContainer) {
			ret = Graphiti.getPeService().getChopboxAnchor((AnchorContainer) pe);
		}
		return ret;
		
			
}
*/



}