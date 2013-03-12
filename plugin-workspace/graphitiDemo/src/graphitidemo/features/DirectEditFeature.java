package graphitidemo.features;

import org.eclipse.bpel.model.Activity;
import org.eclipse.bpel.model.Assign;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.impl.AbstractDirectEditingFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

public class DirectEditFeature extends AbstractDirectEditingFeature{

	public DirectEditFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getEditingType() {
		// TODO Auto-generated method stub
		return TYPE_TEXT;
	}
    @Override
    public boolean canDirectEdit(IDirectEditingContext context) {
		return true;
	}
	@Override
	public String getInitialValue(IDirectEditingContext context) {
		// TODO Auto-generated method stub
		PictogramElement pe = context.getPictogramElement();
		Assign assign = (Assign) getBusinessObjectForPictogramElement(pe);
		return assign.getName();
	}
	public void setValue(String value, IDirectEditingContext context) {
		PictogramElement pe = context.getPictogramElement();
		Assign assign = (Assign) getBusinessObjectForPictogramElement(pe);
		assign.setName(value);
		updatePictogramElement(((Shape) pe).getContainer());
		
	}
	
}




