package graphitidemo.diagram;

import org.eclipse.bpel.model.Assign;
import org.eclipse.bpel.model.Receive;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;

import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IDirectEditingFeature;
import org.eclipse.graphiti.features.ILayoutFeature;
import org.eclipse.graphiti.features.context.IAddConnectionContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;

import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;

import graphitidemo.features.AddConnectionFeature;
import graphitidemo.features.AddAssignFeature;
import graphitidemo.features.AddReceiveFeature;
import graphitidemo.features.CreateConnectionFeature;
import graphitidemo.features.CreateAssignFeature;
import graphitidemo.features.CreateReceiveFeature;
import graphitidemo.features.DirectEditFeature;
import graphitidemo.features.LayoutDomainObjectFeature;


public class GFeatureProvider extends DefaultFeatureProvider {

	public GFeatureProvider(IDiagramTypeProvider dtp) {
		super(dtp);
	}

	@Override
	public ICreateFeature[] getCreateFeatures() {
		return new ICreateFeature[] {new CreateAssignFeature(this),new CreateReceiveFeature(this)};
	}
	
	@Override
	public ICreateConnectionFeature[] getCreateConnectionFeatures() {
		return new ICreateConnectionFeature[] {new CreateConnectionFeature(this)};
	}
	
	@Override
	public IAddFeature getAddFeature(IAddContext context) {
		// TODO: check for right domain object instances below
		if (context instanceof IAddConnectionContext /* && context.getNewObject() instanceof <DomainObject> */) {
			return new AddConnectionFeature(this);
		} else if (context instanceof IAddContext && context.getNewObject() instanceof Assign ) {
			return new AddAssignFeature(this);
		}else if(context instanceof IAddContext && context.getNewObject() instanceof Receive){
			return new AddReceiveFeature(this);
		}
		return super.getAddFeature(context);
	}
	@Override
	public IDirectEditingFeature getDirectEditingFeature(IDirectEditingContext context) {
		return new DirectEditFeature(this);
	}
	@Override
	public ILayoutFeature getLayoutFeature(ILayoutContext context) {
		// TODO: check for right domain object instances below
		if (context.getPictogramElement() instanceof ContainerShape /* && getBusinessObjectForPictogramElement(context.getPictogramElement()) instanceof <DomainObject> */) {
			return  new LayoutDomainObjectFeature(this);
		}
	
		return super.getLayoutFeature(context);
	}
}
