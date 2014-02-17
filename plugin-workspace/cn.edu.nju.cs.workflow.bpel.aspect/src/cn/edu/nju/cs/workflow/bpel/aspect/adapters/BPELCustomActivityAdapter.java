package cn.edu.nju.cs.workflow.bpel.aspect.adapters;

import org.eclipse.bpel.model.Invoke;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;


public class BPELCustomActivityAdapter extends BPELActivityAdapter {
	/* INamedElement */

	@Override
	public String getName(Object object) {
		if (!(object instanceof Invoke) && object instanceof EObject) {
			object = ((EObject)object).eContainer();
		}
		return super.getName(object);
	}

	@Override
	public void setName(Object object, String name) {
		if (!(object instanceof Invoke) && object instanceof EObject) {
			object = ((EObject)object).eContainer();
		}
		super.setName(object, name);
	}

	@Override
	public boolean isNameAffected(Object object, Notification n) {
		if (!(object instanceof Invoke) && object instanceof EObject) {
			object = ((EObject)object).eContainer();
		}
		return super.isNameAffected(object, n);
	}

}
