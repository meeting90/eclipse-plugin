package graphitiexample.property;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.AbstractPropertySectionFilter;

public class GEEclassFilter extends AbstractPropertySectionFilter{

	@Override
	protected boolean accept(PictogramElement pe) {
		// TODO Auto-generated method stub
		EObject eObject =
	            Graphiti.getLinkService()
	            .getBusinessObjectForLinkedPictogramElement(pe);
	        if (eObject instanceof EClass) {
	            return true;
	        }
	        return false;
	}

}
