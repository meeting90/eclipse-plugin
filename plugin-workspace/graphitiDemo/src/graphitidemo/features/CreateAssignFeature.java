package graphitidemo.features;


import graphitidemo.diagram.GImageProvider;

import org.eclipse.bpel.model.Assign;
import org.eclipse.bpel.model.BPELFactory;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

public class CreateAssignFeature extends AbstractCreateFeature implements
		ICreateFeature {

	
	public CreateAssignFeature(IFeatureProvider fp) {
		super(fp, "Assign", "Creates Assign Activity");
	}

	@Override
	public boolean canCreate(ICreateContext context) {
		return context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public Object[] create(ICreateContext context) {
		

		// Create a new chess board and add it to an EMF resource
		Assign assign = BPELFactory.eINSTANCE.createAssign();
	    assign.setName("Assign");
	
		
	
		// TODO: in case of an EMF object add the new object to a suitable resource
		getDiagram().eResource().getContents().add(assign);

		addGraphicalRepresentation(context, assign);
		return new Object[] { assign };
	}
	@Override
	public String getCreateImageId() {
		return GImageProvider.IMG_ASSIGN;
	}
}
