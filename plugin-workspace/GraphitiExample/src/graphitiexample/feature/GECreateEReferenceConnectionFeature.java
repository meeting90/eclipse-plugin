package graphitiexample.feature;

import graphitiexample.diagram.GEImageProvider;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;

public class GECreateEReferenceConnectionFeature extends AbstractCreateConnectionFeature{

	public GECreateEReferenceConnectionFeature(IFeatureProvider fp) {
		super(fp, "EReference", "Create a EReference");
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canCreate(ICreateConnectionContext context) {
		// TODO Auto-generated method stub
		EClass source = getEClass(context.getSourceAnchor());
	     EClass target = getEClass(context.getTargetAnchor());
	     if (source != null && target != null && source != target) {
	            return true;
	      }
	        return false;
	       
		
	}

	@Override
	public Connection create(ICreateConnectionContext context) {
		// TODO Auto-generated method stub
		 Connection newConnection = null;
		 EClass source = getEClass(context.getSourceAnchor());
	     EClass target = getEClass(context.getTargetAnchor());
	     if (source != null && target != null) {
	            // create new business object 
	            EReference eReference = createEReference(source, target);
	            // add connection for business object
	            AddConnectionContext addContext =
	                new AddConnectionContext(context.getSourceAnchor(), context
	                    .getTargetAnchor());
	            addContext.setNewObject(eReference);
	            newConnection =
	                (Connection) getFeatureProvider().addIfPossible(addContext);
	        }
	        
	        return newConnection;
	}

	@Override
	public boolean canStartConnection(ICreateConnectionContext context) {
		// TODO Auto-generated method stub
		if (getEClass(context.getSourceAnchor()) != null) {
            return true;
        }
        return false;
	}
	private EClass getEClass(Anchor anchor) {
        if (anchor != null) {
            Object object =
                getBusinessObjectForPictogramElement(anchor.getParent());
            if (object instanceof EClass) {
                return (EClass) object;
            }
        }
        return null;
    }
 
    /**
    * Creates a EReference between two EClasses.
    */
    private EReference createEReference(EClass source, EClass target) {
        EReference eReference = EcoreFactory.eINSTANCE.createEReference();
        eReference.setName("new EReference");
        eReference.setEType(target);
        eReference.setLowerBound(0);
        eReference.setUpperBound(1);
        source.getEStructuralFeatures().add(eReference);
        return eReference;
   }
    public String getCreateImageId() {
		return GEImageProvider.IMG_EREFERENCE;
	}

}
