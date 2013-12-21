package cn.edu.nju.cs.workflow.bpel.aspect.factories;

import org.eclipse.bpel.model.BPELPackage;
import org.eclipse.bpel.ui.factories.AbstractUIObjectFactory;
import org.eclipse.bpel.ui.factories.BPELUIObjectFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import cn.edu.nju.cs.workflow.model.aspect.AspectPackage;

public class AspectUIObjectFactory extends AbstractUIObjectFactory{
	private EClass modelType;
	public AspectUIObjectFactory(EClass aModelType) {
		super();
		this.modelType=modelType;
	}
	public static EClass[] classArray ={
			AspectPackage.eINSTANCE.getAdvice(),
			AspectPackage.eINSTANCE.getAspect(),
			AspectPackage.eINSTANCE.getPointcut(),
			AspectPackage.eINSTANCE.getPointcuts(),
			
	};
	@Override
	public EClass getModelType() {
		// TODO Auto-generated method stub
		return this.modelType;
	}
	@Override
	public ImageDescriptor getSmallImageDescriptor() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ImageDescriptor getLargeImageDescriptor() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Image getSmallImage() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Image getLargeImage() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getTypeLabel() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
