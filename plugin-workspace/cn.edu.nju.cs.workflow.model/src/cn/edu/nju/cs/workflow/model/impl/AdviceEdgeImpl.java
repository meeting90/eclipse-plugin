/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.nju.cs.workflow.model.impl;

import cn.edu.nju.cs.workflow.model.AdviceEdge;
import cn.edu.nju.cs.workflow.model.AdviceTask;
import cn.edu.nju.cs.workflow.model.AdviceType;
import cn.edu.nju.cs.workflow.model.ModelPackage;
import cn.edu.nju.cs.workflow.model.WorkflowNode;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Advice Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cn.edu.nju.cs.workflow.model.impl.AdviceEdgeImpl#getAdviceTask <em>Advice Task</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.impl.AdviceEdgeImpl#getJoinPoint <em>Join Point</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.impl.AdviceEdgeImpl#getAdvicetype <em>Advicetype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdviceEdgeImpl extends WorkflowElementImpl implements AdviceEdge {
	/**
	 * The default value of the '{@link #getAdvicetype() <em>Advicetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvicetype()
	 * @generated
	 * @ordered
	 */
	protected static final AdviceType ADVICETYPE_EDEFAULT = AdviceType.BEFORE;

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
	protected AdviceEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ADVICE_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdviceTask getAdviceTask() {
		if (eContainerFeatureID() != ModelPackage.ADVICE_EDGE__ADVICE_TASK) return null;
		return (AdviceTask)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdviceTask(AdviceTask newAdviceTask, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAdviceTask, ModelPackage.ADVICE_EDGE__ADVICE_TASK, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdviceTask(AdviceTask newAdviceTask) {
		if (newAdviceTask != eInternalContainer() || (eContainerFeatureID() != ModelPackage.ADVICE_EDGE__ADVICE_TASK && newAdviceTask != null)) {
			if (EcoreUtil.isAncestor(this, newAdviceTask))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAdviceTask != null)
				msgs = ((InternalEObject)newAdviceTask).eInverseAdd(this, ModelPackage.ADVICE_TASK__EDGES, AdviceTask.class, msgs);
			msgs = basicSetAdviceTask(newAdviceTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ADVICE_EDGE__ADVICE_TASK, newAdviceTask, newAdviceTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowNode getJoinPoint() {
		if (eContainerFeatureID() != ModelPackage.ADVICE_EDGE__JOIN_POINT) return null;
		return (WorkflowNode)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJoinPoint(WorkflowNode newJoinPoint, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newJoinPoint, ModelPackage.ADVICE_EDGE__JOIN_POINT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoinPoint(WorkflowNode newJoinPoint) {
		if (newJoinPoint != eInternalContainer() || (eContainerFeatureID() != ModelPackage.ADVICE_EDGE__JOIN_POINT && newJoinPoint != null)) {
			if (EcoreUtil.isAncestor(this, newJoinPoint))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newJoinPoint != null)
				msgs = ((InternalEObject)newJoinPoint).eInverseAdd(this, ModelPackage.WORKFLOW_NODE__ADVICE_EDGES, WorkflowNode.class, msgs);
			msgs = basicSetJoinPoint(newJoinPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ADVICE_EDGE__JOIN_POINT, newJoinPoint, newJoinPoint));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ADVICE_EDGE__ADVICETYPE, oldAdvicetype, advicetype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ADVICE_EDGE__ADVICE_TASK:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAdviceTask((AdviceTask)otherEnd, msgs);
			case ModelPackage.ADVICE_EDGE__JOIN_POINT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetJoinPoint((WorkflowNode)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ADVICE_EDGE__ADVICE_TASK:
				return basicSetAdviceTask(null, msgs);
			case ModelPackage.ADVICE_EDGE__JOIN_POINT:
				return basicSetJoinPoint(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ModelPackage.ADVICE_EDGE__ADVICE_TASK:
				return eInternalContainer().eInverseRemove(this, ModelPackage.ADVICE_TASK__EDGES, AdviceTask.class, msgs);
			case ModelPackage.ADVICE_EDGE__JOIN_POINT:
				return eInternalContainer().eInverseRemove(this, ModelPackage.WORKFLOW_NODE__ADVICE_EDGES, WorkflowNode.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ADVICE_EDGE__ADVICE_TASK:
				return getAdviceTask();
			case ModelPackage.ADVICE_EDGE__JOIN_POINT:
				return getJoinPoint();
			case ModelPackage.ADVICE_EDGE__ADVICETYPE:
				return getAdvicetype();
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
			case ModelPackage.ADVICE_EDGE__ADVICE_TASK:
				setAdviceTask((AdviceTask)newValue);
				return;
			case ModelPackage.ADVICE_EDGE__JOIN_POINT:
				setJoinPoint((WorkflowNode)newValue);
				return;
			case ModelPackage.ADVICE_EDGE__ADVICETYPE:
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
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.ADVICE_EDGE__ADVICE_TASK:
				setAdviceTask((AdviceTask)null);
				return;
			case ModelPackage.ADVICE_EDGE__JOIN_POINT:
				setJoinPoint((WorkflowNode)null);
				return;
			case ModelPackage.ADVICE_EDGE__ADVICETYPE:
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
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.ADVICE_EDGE__ADVICE_TASK:
				return getAdviceTask() != null;
			case ModelPackage.ADVICE_EDGE__JOIN_POINT:
				return getJoinPoint() != null;
			case ModelPackage.ADVICE_EDGE__ADVICETYPE:
				return advicetype != ADVICETYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (advicetype: ");
		result.append(advicetype);
		result.append(')');
		return result.toString();
	}

} //AdviceEdgeImpl
