/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.nju.cs.workflow.model.impl;

import cn.edu.nju.cs.workflow.model.CompoundTask;
import cn.edu.nju.cs.workflow.model.ModelPackage;
import cn.edu.nju.cs.workflow.model.Workflow;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

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
 *   <li>{@link cn.edu.nju.cs.workflow.model.impl.CompoundTaskImpl#getSubworkflow <em>Subworkflow</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompoundTaskImpl extends TaskImpl implements CompoundTask {
	/**
	 * The cached value of the '{@link #getSubworkflow() <em>Subworkflow</em>}' containment reference.
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
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.COMPOUND_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workflow getSubworkflow() {
		return subworkflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubworkflow(Workflow newSubworkflow, NotificationChain msgs) {
		Workflow oldSubworkflow = subworkflow;
		subworkflow = newSubworkflow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.COMPOUND_TASK__SUBWORKFLOW, oldSubworkflow, newSubworkflow);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubworkflow(Workflow newSubworkflow) {
		if (newSubworkflow != subworkflow) {
			NotificationChain msgs = null;
			if (subworkflow != null)
				msgs = ((InternalEObject)subworkflow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.COMPOUND_TASK__SUBWORKFLOW, null, msgs);
			if (newSubworkflow != null)
				msgs = ((InternalEObject)newSubworkflow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.COMPOUND_TASK__SUBWORKFLOW, null, msgs);
			msgs = basicSetSubworkflow(newSubworkflow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.COMPOUND_TASK__SUBWORKFLOW, newSubworkflow, newSubworkflow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.COMPOUND_TASK__SUBWORKFLOW:
				return basicSetSubworkflow(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.COMPOUND_TASK__SUBWORKFLOW:
				return getSubworkflow();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
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
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.COMPOUND_TASK__SUBWORKFLOW:
				return subworkflow != null;
		}
		return super.eIsSet(featureID);
	}

} //CompoundTaskImpl
