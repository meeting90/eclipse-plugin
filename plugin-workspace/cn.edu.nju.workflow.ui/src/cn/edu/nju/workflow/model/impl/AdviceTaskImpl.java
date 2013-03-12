/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.nju.workflow.model.impl;

import cn.edu.nju.workflow.model.AdviceTask;
import cn.edu.nju.workflow.model.AdviceType;
import cn.edu.nju.workflow.model.ModelPackage;
import cn.edu.nju.workflow.model.WorkflowNode;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Advice Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cn.edu.nju.workflow.model.impl.AdviceTaskImpl#getJoinPoint <em>Join Point</em>}</li>
 *   <li>{@link cn.edu.nju.workflow.model.impl.AdviceTaskImpl#getAdvicetype <em>Advicetype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdviceTaskImpl extends CompoundTaskImpl implements AdviceTask {
	/**
	 * The cached value of the '{@link #getJoinPoint() <em>Join Point</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinPoint()
	 * @generated
	 * @ordered
	 */
	protected EList joinPoint;

	/**
	 * The default value of the '{@link #getAdvicetype() <em>Advicetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvicetype()
	 * @generated
	 * @ordered
	 */
	protected static final AdviceType ADVICETYPE_EDEFAULT = AdviceType.BEFORE_LITERAL;

	/**
	 * The cached value of the '{@link #getAdvicetype() <em>Advicetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvicetype()
	 * @generated
	 * @ordered
	 */
	protected AdviceType advicetype = ADVICETYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdviceTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ADVICE_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getJoinPoint() {
		if (joinPoint == null) {
			joinPoint = new EObjectWithInverseResolvingEList.ManyInverse(WorkflowNode.class, this, ModelPackage.ADVICE_TASK__JOIN_POINT, ModelPackage.WORKFLOW_NODE__POINT_CUT);
		}
		return joinPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdviceType getAdvicetype() {
		return advicetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdvicetype(AdviceType newAdvicetype) {
		AdviceType oldAdvicetype = advicetype;
		advicetype = newAdvicetype == null ? ADVICETYPE_EDEFAULT : newAdvicetype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ADVICE_TASK__ADVICETYPE, oldAdvicetype, advicetype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ADVICE_TASK__JOIN_POINT:
				return ((InternalEList)getJoinPoint()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ADVICE_TASK__JOIN_POINT:
				return ((InternalEList)getJoinPoint()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ADVICE_TASK__JOIN_POINT:
				return getJoinPoint();
			case ModelPackage.ADVICE_TASK__ADVICETYPE:
				return getAdvicetype();
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
			case ModelPackage.ADVICE_TASK__JOIN_POINT:
				getJoinPoint().clear();
				getJoinPoint().addAll((Collection)newValue);
				return;
			case ModelPackage.ADVICE_TASK__ADVICETYPE:
				setAdvicetype((AdviceType)newValue);
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
			case ModelPackage.ADVICE_TASK__JOIN_POINT:
				getJoinPoint().clear();
				return;
			case ModelPackage.ADVICE_TASK__ADVICETYPE:
				setAdvicetype(ADVICETYPE_EDEFAULT);
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
			case ModelPackage.ADVICE_TASK__JOIN_POINT:
				return joinPoint != null && !joinPoint.isEmpty();
			case ModelPackage.ADVICE_TASK__ADVICETYPE:
				return advicetype != ADVICETYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (advicetype: ");
		result.append(advicetype);
		result.append(')');
		return result.toString();
	}

} //AdviceTaskImpl
