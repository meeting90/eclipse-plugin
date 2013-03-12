package cn.edu.nju.workflow.ui.diagram;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICopyFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IPasteFeature;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ICopyContext;
import org.eclipse.graphiti.features.context.IPasteContext;
import org.eclipse.graphiti.features.impl.AbstractFeatureProvider;

import cn.edu.nju.workflow.model.WorkflowElement;
import cn.edu.nju.workflow.ui.feature.BaseAddFeature;
import cn.edu.nju.workflow.ui.feature.BaseCreateFeature;

public class WorkflowFeatureProvider extends AbstractFeatureProvider implements IFeatureProvider{

	public WorkflowFeatureProvider(IDiagramTypeProvider diagramTypeProvider) {
		super(diagramTypeProvider);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ICopyFeature getCopyFeature(ICopyContext context) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPasteFeature getPasteFeature(IPasteContext context) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public IAddFeature getAddFeature(IAddContext context) {
		// TODO Auto-generated method stub
		if(context.getNewObject() instanceof WorkflowElement)
			return new BaseAddFeature(this);
		return super.getAddFeature(context);
	}
	@Override
	public ICreateFeature[] getCreateFeatures() {
		// TODO Auto-generated method stub
		return new ICreateFeature[] { new BaseCreateFeature(this,"workflowelement","crate new workflow element")};
		 
	}

}
