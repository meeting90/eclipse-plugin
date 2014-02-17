package cn.edu.nju.cs.workflow.bpel.aspect;



import org.eclipse.bpel.ui.util.BPELUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

import cn.edu.nju.cs.workflow.model.aspect.Aspect;



public class AspectEditPartFactory implements EditPartFactory{
	
	public EditPart createEditPart(EditPart context, Object model) {
		EditPartFactory adapter=null;
		if(model instanceof Aspect){
			EditPart result=new AspectEditPart();
			result.setModel(model);		
			return result;
		}else{
			adapter=BPELUtil.adapt(model, EditPartFactory.class);
			if(adapter!=null) return ((EditPartFactory)adapter).createEditPart(context, model);
		}
		return null;
	  
		
		

	}

}
