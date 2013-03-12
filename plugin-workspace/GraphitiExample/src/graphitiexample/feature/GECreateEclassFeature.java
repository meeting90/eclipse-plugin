package graphitiexample.feature;

import graphitiexample.ExampleUtil;
import graphitiexample.diagram.GEImageProvider;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

public class GECreateEclassFeature extends AbstractCreateFeature {
	private static final String TITLE = "Create class";
	  
	private static final String USER_QUESTION = "Enter new class name";
	public GECreateEclassFeature(IFeatureProvider fp) {
		super(fp, "EClass", "Create EClass");
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
		 String newClassName = ExampleUtil.askString(TITLE, USER_QUESTION,  "");
	        if (newClassName == null || newClassName.trim().length() == 0) {
	            return EMPTY;
	        }
	 
	        // create EClass
	        EClass newClass = EcoreFactory.eINSTANCE.createEClass();
	        getDiagram().eResource().getContents().add(newClass);
	        newClass.setName(newClassName);
	         
	        addGraphicalRepresentation(context, newClass);
	        getFeatureProvider().getDirectEditingInfo().setActive(true);
	
	        return new Object[] { newClass };
	}
	public String getCreateImageId() {
		return GEImageProvider.IMG_ECLASS;
	}

}
