package cn.edu.nju.cs.workflow.bpel.aspect.resource;


import org.eclipse.bpel.model.resource.BPELResource;

import cn.edu.nju.cs.workflow.model.aspect.Aspect;

public interface AspectResource extends BPELResource{

	
	public Aspect getAspect();
	

}
