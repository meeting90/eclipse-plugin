/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.nju.workflow.model.impl;

import cn.edu.nju.workflow.model.CompoundTask;
import cn.edu.nju.workflow.model.ModelPackage;
import cn.edu.nju.workflow.model.Workflow;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compound Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cn.edu.nju.workflow.model.impl.CompoundTaskImpl#getSubworkflow <em>Subworkflow</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompoundTaskImpl extends TaskImpl implements CompoundTask {
	/**
	 * The cached value of the '{@link #getSubworkflow() <em>Subworkflow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubworkflow()
	 * @generated
	 * @ordered
	 */
	protected Workflow subworkflow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompoundTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.COMPOUND_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workflow getSubworkflow() {
		if (subworkflow != null && subworkflow.eIsProxy()) {
			InternalEObject oldSubworkflow = (InternalEObject)subworkflow;
			subworkflow = (Workflow)eResolveProxy(oldSubworkflow);
			if (subworkflow != oldSubworkflow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.COMPOUND_TASK__SUBWORKFLOW, oldSubworkflow, subworkflow));
			}
		}
		return subworkflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workflow basicGetSubworkflow() {
		return subworkflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubworkflow(Workflow newSubworkflow) {
		Workflow oldSubworkflow = subworkflow;
		subworkflow = newSubworkflow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.COMPOUND_TASK__SUBWORKFLOW, oldSubworkflow, subworkflow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.COMPOUND_TASK__SUBWORKFLOW:
				if (resolve) return getSubworkflow();
				return basicGetSubworkflow();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.COMPOUND_TASK__SUBWORKFLOW:
				setSubworkflow((Workflow)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.COMPOUND_TASK__SUBWORKFLOW:
				setSubworkflow((Workflow)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.COMPOUND_TASK__SUBWORKFLOW:
				return subworkflow != null;
		}
		return super.eIsSet(featureID);
	}

} //CompoundTaskImpl
