package cn.edu.nju.cs.workflow.ui.feature.create;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.wst.wsdl.Message;
import org.eclipse.wst.wsdl.WSDLFactory;

public class MessageCreateFeature extends AbstractCreateFeature {

	public MessageCreateFeature(IFeatureProvider fp, String name,
			String description) {
		super(fp, "Message","create Message");
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
		Message message=WSDLFactory.eINSTANCE.createMessage();
		
		return new Object[]{message};
//		/
//	    return new Object[] { // };
		
	}

}
