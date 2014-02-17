/**
 */
package cn.edu.nju.cs.workflow.aspect.model.impl;

import cn.edu.nju.cs.workflow.aspect.model.Advice;
import cn.edu.nju.cs.workflow.aspect.model.AspectPackage;

import org.eclipse.bpel.model.impl.ProcessImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Advice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AdviceImpl extends ProcessImpl implements Advice {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AspectPackage.Literals.ADVICE;
	}

} //AdviceImpl
