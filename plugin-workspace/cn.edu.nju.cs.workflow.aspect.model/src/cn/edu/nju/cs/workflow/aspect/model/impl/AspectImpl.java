/**
 */
package cn.edu.nju.cs.workflow.aspect.model.impl;

import cn.edu.nju.cs.workflow.aspect.model.Advice;
import cn.edu.nju.cs.workflow.aspect.model.Aspect;
import cn.edu.nju.cs.workflow.aspect.model.AspectPackage;
import cn.edu.nju.cs.workflow.aspect.model.Transitions;

import org.eclipse.bpel.model.impl.BPELExtensibleElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aspect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cn.edu.nju.cs.workflow.aspect.model.impl.AspectImpl#getName <em>Name</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.aspect.model.impl.AspectImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.aspect.model.impl.AspectImpl#getJoinTransitions <em>Join Transitions</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.aspect.model.impl.AspectImpl#getAdvice <em>Advice</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AspectImpl extends BPELExtensibleElementImpl implements Aspect {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected Transitions transitions;

	/**
	 * The cached value of the '{@link #getJoinTransitions() <em>Join Transitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinTransitions()
	 * @generated
	 * @ordered
	 */
	protected Transitions joinTransitions;

	/**
	 * The cached value of the '{@link #getAdvice() <em>Advice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvice()
	 * @generated
	 * @ordered
	 */
	protected Advice advice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AspectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AspectPackage.Literals.ASPECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectPackage.ASPECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transitions getTransitions() {
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransitions(Transitions newTransitions, NotificationChain msgs) {
		Transitions oldTransitions = transitions;
		transitions = newTransitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AspectPackage.ASPECT__TRANSITIONS, oldTransitions, newTransitions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitions(Transitions newTransitions) {
		if (newTransitions != transitions) {
			NotificationChain msgs = null;
			if (transitions != null)
				msgs = ((InternalEObject)transitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AspectPackage.ASPECT__TRANSITIONS, null, msgs);
			if (newTransitions != null)
				msgs = ((InternalEObject)newTransitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AspectPackage.ASPECT__TRANSITIONS, null, msgs);
			msgs = basicSetTransitions(newTransitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectPackage.ASPECT__TRANSITIONS, newTransitions, newTransitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transitions getJoinTransitions() {
		return joinTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJoinTransitions(Transitions newJoinTransitions, NotificationChain msgs) {
		Transitions oldJoinTransitions = joinTransitions;
		joinTransitions = newJoinTransitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AspectPackage.ASPECT__JOIN_TRANSITIONS, oldJoinTransitions, newJoinTransitions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoinTransitions(Transitions newJoinTransitions) {
		if (newJoinTransitions != joinTransitions) {
			NotificationChain msgs = null;
			if (joinTransitions != null)
				msgs = ((InternalEObject)joinTransitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AspectPackage.ASPECT__JOIN_TRANSITIONS, null, msgs);
			if (newJoinTransitions != null)
				msgs = ((InternalEObject)newJoinTransitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AspectPackage.ASPECT__JOIN_TRANSITIONS, null, msgs);
			msgs = basicSetJoinTransitions(newJoinTransitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectPackage.ASPECT__JOIN_TRANSITIONS, newJoinTransitions, newJoinTransitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Advice getAdvice() {
		return advice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdvice(Advice newAdvice, NotificationChain msgs) {
		Advice oldAdvice = advice;
		advice = newAdvice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AspectPackage.ASPECT__ADVICE, oldAdvice, newAdvice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdvice(Advice newAdvice) {
		if (newAdvice != advice) {
			NotificationChain msgs = null;
			if (advice != null)
				msgs = ((InternalEObject)advice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AspectPackage.ASPECT__ADVICE, null, msgs);
			if (newAdvice != null)
				msgs = ((InternalEObject)newAdvice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AspectPackage.ASPECT__ADVICE, null, msgs);
			msgs = basicSetAdvice(newAdvice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectPackage.ASPECT__ADVICE, newAdvice, newAdvice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AspectPackage.ASPECT__TRANSITIONS:
				return basicSetTransitions(null, msgs);
			case AspectPackage.ASPECT__JOIN_TRANSITIONS:
				return basicSetJoinTransitions(null, msgs);
			case AspectPackage.ASPECT__ADVICE:
				return basicSetAdvice(null, msgs);
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
			case AspectPackage.ASPECT__NAME:
				return getName();
			case AspectPackage.ASPECT__TRANSITIONS:
				return getTransitions();
			case AspectPackage.ASPECT__JOIN_TRANSITIONS:
				return getJoinTransitions();
			case AspectPackage.ASPECT__ADVICE:
				return getAdvice();
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
			case AspectPackage.ASPECT__NAME:
				setName((String)newValue);
				return;
			case AspectPackage.ASPECT__TRANSITIONS:
				setTransitions((Transitions)newValue);
				return;
			case AspectPackage.ASPECT__JOIN_TRANSITIONS:
				setJoinTransitions((Transitions)newValue);
				return;
			case AspectPackage.ASPECT__ADVICE:
				setAdvice((Advice)newValue);
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
			case AspectPackage.ASPECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AspectPackage.ASPECT__TRANSITIONS:
				setTransitions((Transitions)null);
				return;
			case AspectPackage.ASPECT__JOIN_TRANSITIONS:
				setJoinTransitions((Transitions)null);
				return;
			case AspectPackage.ASPECT__ADVICE:
				setAdvice((Advice)null);
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
			case AspectPackage.ASPECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AspectPackage.ASPECT__TRANSITIONS:
				return transitions != null;
			case AspectPackage.ASPECT__JOIN_TRANSITIONS:
				return joinTransitions != null;
			case AspectPackage.ASPECT__ADVICE:
				return advice != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AspectImpl
