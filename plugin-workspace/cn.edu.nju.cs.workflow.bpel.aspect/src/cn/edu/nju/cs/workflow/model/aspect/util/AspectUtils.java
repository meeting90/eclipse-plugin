package cn.edu.nju.cs.workflow.model.aspect.util;

import org.eclipse.bpel.model.BPELPackage;
import org.eclipse.bpel.model.Process;
import org.eclipse.bpel.model.util.BPELUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.wst.wsdl.WSDLElement;
import org.w3c.dom.Node;

import cn.edu.nju.cs.workflow.model.aspect.Aspect;
import cn.edu.nju.cs.workflow.model.aspect.AspectFactory;
import cn.edu.nju.cs.workflow.model.aspect.AspectPackage;

public class AspectUtils extends BPELUtils{

	public static boolean isAspectElement(Node node) {
		// TODO Auto-generated method stub
		return true;
	}

	public static Aspect getAspect(Object object) {
		// TODO Auto-generated method stub
		if (object instanceof EObject) {
			// check if *this* is already the process object
			if (object instanceof Aspect)
				return (Aspect)object;
			EObject cont = ((EObject)object).eContainer();
			while (cont != null) {
				if (cont.eClass() == AspectPackage.eINSTANCE.getAspect())
					return (Aspect)cont;
				cont = cont.eContainer();
			}
		}
		return null;
	}
}

