package graphitiexample.diagram;

import graphitiexample.feature.DirectEditFeature;
import graphitiexample.feature.GEAddEReferenceConnectionFeature;
import graphitiexample.feature.GEAddEclassFeature;
import graphitiexample.feature.GECreateEReferenceConnectionFeature;
import graphitiexample.feature.GECreateEclassFeature;
import graphitiexample.feature.GECustomEclassFeature;
import graphitiexample.feature.GEEclassCopyFeature;
import graphitiexample.feature.GEEclassPasteFeature;
import graphitiexample.feature.GELayoutEclassFeature;
import graphitiexample.feature.GEUpdateEclassFeature;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICopyFeature;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IDirectEditingFeature;
import org.eclipse.graphiti.features.IFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.ILayoutFeature;
import org.eclipse.graphiti.features.IPasteFeature;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ICopyContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.context.IPasteContext;
import org.eclipse.graphiti.features.context.IPictogramElementContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;

public class GEFeatureProvider extends DefaultFeatureProvider implements IFeatureProvider {

	public GEFeatureProvider(IDiagramTypeProvider dtp) {
		super(dtp);
		// TODO Auto-generated constructor stub
	}
    @Override
    public  IAddFeature getAddFeature(IAddContext context) {
          // is object for add request a EClass?
         if (context.getNewObject() instanceof EClass) {
         return new GEAddEclassFeature(this);
      }else if(context.getNewObject() instanceof EReference)
    	  return new GEAddEReferenceConnectionFeature(this);
      return  super.getAddFeature(context);
   }
    @Override
    public ICreateFeature[] getCreateFeatures() {
       return new ICreateFeature[] { new GECreateEclassFeature(this) };
    }
    @Override
    public IUpdateFeature getUpdateFeature(IUpdateContext context) {
       PictogramElement pictogramElement = context.getPictogramElement();
       if (pictogramElement  instanceof ContainerShape) {
           Object bo = getBusinessObjectForPictogramElement(pictogramElement);
           if (bo instanceof EClass) {
               return new GEUpdateEclassFeature(this);
           }
       }
       return super.getUpdateFeature(context);
     }
    @Override
    public ILayoutFeature getLayoutFeature(ILayoutContext context) {
        PictogramElement pictogramElement = context.getPictogramElement();
        Object bo = getBusinessObjectForPictogramElement(pictogramElement);
        if (bo instanceof EClass) {
            return new GELayoutEclassFeature(this);
        }
        return super.getLayoutFeature(context);
     }
    @Override
    public ICustomFeature[] getCustomFeatures(ICustomContext context) {
        return new ICustomFeature[] { new GECustomEclassFeature(this) };
    }
    @Override
    public ICreateConnectionFeature[] getCreateConnectionFeatures() {
       return new ICreateConnectionFeature[] { 
           new GECreateEReferenceConnectionFeature (this) };
    }
    @Override
    public IFeature[] getDragAndDropFeatures(IPictogramElementContext context) {
        // simply return all create connection features
        return getCreateConnectionFeatures();
    }
    @Override
	public IDirectEditingFeature getDirectEditingFeature(IDirectEditingContext context) {
		PictogramElement pe = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pe);
		if (bo instanceof EClass) {
			return new DirectEditFeature(this);
		}
		return super.getDirectEditingFeature(context);
	}
    @Override
    public ICopyFeature getCopyFeature(ICopyContext context) {
        return new GEEclassCopyFeature(this);
    }
    @Override
    public IPasteFeature getPasteFeature(IPasteContext context) {
        return new GEEclassPasteFeature(this);
     }

}
