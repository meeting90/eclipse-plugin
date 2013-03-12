package cn.edu.nju.workflow.ui.feature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import cn.edu.nju.workflow.model.ModelFactory;
import cn.edu.nju.workflow.model.WorkflowElement;

public class BaseCreateFeature extends  AbstractCreateFeature{

	public BaseCreateFeature(IFeatureProvider fp, String name,
			String description) {
		super(fp, name, description);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canCreate(ICreateContext context) {
		// TODO Auto-generated method stub
		return context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public Object[] create(ICreateContext context) {
		// TODO Auto-generated method stub
		
		WorkflowElement welement=ModelFactory.eINSTANCE.createWorkflowElement();
	    getDiagram().eResource().getContents().add(welement);
	    welement.setName(welement.getClass().toString());
	    welement.setWidth(200);
	    welement.setHeight(132);
	    System.out.println("element:ID:"+welement.getId());
	    addGraphicalRepresentation(context, welement);
		getFeatureProvider().getDirectEditingInfo().setActive(true);
	    return new Object[] { welement };
	}

}
