package cn.edu.nju.cs.workflow.aspect.model.resource;



import org.eclipse.bpel.model.resource.BPELResource;

import cn.edu.nju.cs.workflow.aspect.model.Aspect;
import cn.edu.nju.cs.workflow.aspect.model.Aspects;




public interface AspectResource extends BPELResource{

	public Aspects getAspects();
	public Aspect getCurAspect();

	

}
