package graphitidemo.features;

import org.eclipse.bpel.model.BPELFactory;
import org.eclipse.bpel.model.Receive;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

public class CreateReceiveFeature  extends AbstractCreateFeature implements
ICreateFeature {
public CreateReceiveFeature(IFeatureProvider fp) {
		super(fp, "Receive", "Add Receive Activity");
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
	// TODO: create the domain object here
	Receive receive=BPELFactory.eINSTANCE.createReceive();
	
	// TODO: in case of an EMF object add the new object to a suitable resource
	 getDiagram().eResource().getContents().add(receive);

	addGraphicalRepresentation(context, receive);
	return new Object[] { receive };
}

}