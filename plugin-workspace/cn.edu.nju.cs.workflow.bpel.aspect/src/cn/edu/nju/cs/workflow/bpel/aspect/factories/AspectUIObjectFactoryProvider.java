package cn.edu.nju.cs.workflow.bpel.aspect.factories;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.bpel.ui.Policy;

import org.eclipse.bpel.ui.factories.AbstractUIObjectFactory;

import org.eclipse.bpel.ui.factories.UIObjectFactoryProvider;
import org.eclipse.core.runtime.Assert;

import org.eclipse.emf.ecore.EClass;

public class AspectUIObjectFactoryProvider {
	private static AspectUIObjectFactoryProvider instance;
	protected Map<EClass,AbstractUIObjectFactory> eClass2factory = new HashMap<EClass,AbstractUIObjectFactory>();
	public static AspectUIObjectFactoryProvider getInstance() {
	    if (instance == null) {
		    instance = new AspectUIObjectFactoryProvider();
		    createUIObjectFactories(instance);
	    }
	    return instance;
	}
	
	
	protected static void createUIObjectFactories (AspectUIObjectFactoryProvider provider) {
		for (EClass modelType : AspectUIObjectFactory.classArray) {
			provider.register(modelType, new AspectUIObjectFactory(modelType));
		}
	}
	
	/**
	 * 
	 * @param modelType
	 * @return the UI Object factory for the given model type.
	 */
	
	public AbstractUIObjectFactory getFactoryFor (EClass modelType) {
		return  eClass2factory.get(modelType);
	}
	
	/**
	 * @param modelType
	 * @param factory
	 */
	
	public void register (EClass modelType, AbstractUIObjectFactory factory) {
		Assert.isTrue(factory.getModelType() == modelType);
		
		eClass2factory.put(modelType, factory);
		if (Policy.DEBUG) {
			System.out.println("BPELUIObjectFactoryProvider registering EClass: "+modelType.getInstanceClassName()); //$NON-NLS-1$
		}
	}
}
