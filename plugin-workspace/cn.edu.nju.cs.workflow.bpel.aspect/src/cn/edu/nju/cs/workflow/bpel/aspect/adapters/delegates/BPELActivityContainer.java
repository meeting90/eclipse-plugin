package cn.edu.nju.cs.workflow.bpel.aspect.adapters.delegates;

import org.eclipse.bpel.model.Activity;
import org.eclipse.bpel.model.BPELFactory;
import org.eclipse.bpel.model.Sequence;
import org.eclipse.bpel.model.util.ElementFactory;
import org.eclipse.bpel.ui.adapters.delegates.ActivityContainer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.w3c.dom.Element;

public class BPELActivityContainer extends ActivityContainer {

	public BPELActivityContainer(EReference aFeature) {
		super(aFeature);
	}
	@Override
	public boolean addChild (EObject object, EObject newChild, EObject insertBefore) {
		
		Object currentChild = getSingleChild (object);		

		/** No activity, just set the current activity as the new child */
		if (currentChild == null) {
			// adding first child.
			// For a single child container, insertBefore can't be valid
			setSingleChild(object, newChild);
			return true;
		}
		
		if (currentChild instanceof Sequence) {
			
			Sequence sequence = (Sequence) currentChild;
			if (insertBefore == null) {
				sequence.getActivities().add( (Activity) newChild );
			} else {
				sequence.getActivities().add(0, (Activity)newChild);
			}						
		} else {				
			// already have one child, adding a 2nd one.  poof up a sequence.
			//AspectEditor aspectEditor = AspectModelHelper.getAspectEditor(object);
			
			Sequence sequence = BPELFactory.eINSTANCE.createSequence();
			Element childElement = ElementFactory.getInstance().createElement(sequence, object);
			sequence.setElement(childElement);
			
			//sequence.setName(BPELUtil.getUniqueModelName(aspectEditor.getProcess(), 
			//		Messages.BPELUtil_Sequence_1, Collections.singletonList(sequence)));			
			
				
			
			setSingleChild(object, sequence);
			
			if (insertBefore==currentChild) {
				sequence.getActivities().add( (Activity) newChild);
			}			
			sequence.getActivities().add( (Activity)currentChild);
			if (insertBefore != currentChild) {
				sequence.getActivities().add((Activity) newChild);
			}
			
		}
		
		
		return true;
	}

}
