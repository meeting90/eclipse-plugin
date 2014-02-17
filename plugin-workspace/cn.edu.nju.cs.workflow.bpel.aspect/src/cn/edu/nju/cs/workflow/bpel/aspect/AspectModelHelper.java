package cn.edu.nju.cs.workflow.bpel.aspect;


import org.eclipse.bpel.ui.BPELEditor;
import org.eclipse.bpel.ui.util.ModelHelper;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import cn.edu.nju.cs.workflow.bpel.aspect.editors.AspectEditor;

public class AspectModelHelper extends ModelHelper{

	public static AspectEditor getAspectEditor(Object modelObject){
		if (modelObject instanceof EObject) {
			Resource r = ((EObject)modelObject).eResource(); 
			if (r != null) {
				return AspectEditor.getAspectEditor(r.getResourceSet());
			}
			throw new IllegalArgumentException("EObject does not have an eResource()");
			
		} else if (modelObject instanceof Resource) {
			return AspectEditor.getAspectEditor(((Resource)modelObject).getResourceSet());
		} else if (modelObject instanceof ResourceSet) {
			return AspectEditor.getAspectEditor((ResourceSet)modelObject);
		}
		throw new IllegalArgumentException("Not an EObject/Resource/ResourceSet");
	}
	public static boolean isHorizontalLayout(Object modelObject) {
		AspectEditor aspectEditor = getAspectEditor(modelObject);
		if (aspectEditor != null) {
			return aspectEditor.isHorizontalLayout();
		} else {
			return false;
		}
	}

}
