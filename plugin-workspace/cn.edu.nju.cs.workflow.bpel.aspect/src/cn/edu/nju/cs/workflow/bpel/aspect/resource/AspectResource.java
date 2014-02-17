package cn.edu.nju.cs.workflow.bpel.aspect.resource;



import org.eclipse.emf.ecore.resource.Resource;

import cn.edu.nju.cs.workflow.model.aspect.Aspect;
import cn.edu.nju.cs.workflow.model.aspect.Aspects;



public interface AspectResource extends Resource{

	
	public Aspect getCurAspect();
	public Aspects getAspects();
	

}
