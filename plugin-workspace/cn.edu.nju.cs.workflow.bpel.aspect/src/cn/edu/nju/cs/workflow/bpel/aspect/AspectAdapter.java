package cn.edu.nju.cs.workflow.bpel.aspect;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

public class AspectAdapter implements EditPartFactory{

	@Override
	public EditPart createEditPart(EditPart editPart, Object model) {
		
		EditPart result=new AspectEditPart();
		result.setModel(model);		
		return result;
	}

}
