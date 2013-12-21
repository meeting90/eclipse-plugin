/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.nju.cs.workflow.model.aspect.impl;

import cn.edu.nju.cs.workflow.model.aspect.Advice;
import cn.edu.nju.cs.workflow.model.aspect.Aspect;
import cn.edu.nju.cs.workflow.model.aspect.AspectPackage;
import cn.edu.nju.cs.workflow.model.aspect.Pointcuts;

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
 *   <li>{@link cn.edu.nju.cs.workflow.model.aspect.impl.AspectImpl#getName <em>Name</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.aspect.impl.AspectImpl#getTargetnamespace <em>Targetnamespace</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.aspect.impl.AspectImpl#getExpressionLanguage <em>Expression Language</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.aspect.impl.AspectImpl#getPointcuts <em>Pointcuts</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.aspect.impl.AspectImpl#getAdvice <em>Advice</em>}</li>
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
	 * The default value of the '{@link #getTargetnamespace() <em>Targetnamespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetnamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGETNAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetnamespace() <em>Targetnamespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetnamespace()
	 * @generated
	 * @ordered
	 */
	protected String targetnamespace = TARGETNAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpressionLanguage() <em>Expression Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpressionLanguage() <em>Expression Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionLanguage()
	 * @generated
	 * @ordered
	 */
	protected String expressionLanguage = EXPRESSION_LANGUAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPointcuts() <em>Pointcuts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointcuts()
	 * @generated
	 * @ordered
	 */
	protected Pointcuts pointcuts;

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
	public String getTargetnamespace() {
		return targetnamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetnamespace(String newTargetnamespace) {
		String oldTargetnamespace = targetnamespace;
		targetnamespace = newTargetnamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectPackage.ASPECT__TARGETNAMESPACE, oldTargetnamespace, targetnamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpressionLanguage() {
		return expressionLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpressionLanguage(String newExpressionLanguage) {
		String oldExpressionLanguage = expressionLanguage;
		expressionLanguage = newExpressionLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectPackage.ASPECT__EXPRESSION_LANGUAGE, oldExpressionLanguage, expressionLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pointcuts getPointcuts() {
		return pointcuts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointcuts(Pointcuts newPointcuts, NotificationChain msgs) {
		Pointcuts oldPointcuts = pointcuts;
		pointcuts = newPointcuts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AspectPackage.ASPECT__POINTCUTS, oldPointcuts, newPointcuts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointcuts(Pointcuts newPointcuts) {
		if (newPointcuts != pointcuts) {
			NotificationChain msgs = null;
			if (pointcuts != null)
				msgs = ((InternalEObject)pointcuts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AspectPackage.ASPECT__POINTCUTS, null, msgs);
			if (newPointcuts != null)
				msgs = ((InternalEObject)newPointcuts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AspectPackage.ASPECT__POINTCUTS, null, msgs);
			msgs = basicSetPointcuts(newPointcuts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectPackage.ASPECT__POINTCUTS, newPointcuts, newPointcuts));
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
			case AspectPackage.ASPECT__POINTCUTS:
				return basicSetPointcuts(null, msgs);
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
			case AspectPackage.ASPECT__TARGETNAMESPACE:
				return getTargetnamespace();
			case AspectPackage.ASPECT__EXPRESSION_LANGUAGE:
				return getExpressionLanguage();
			case AspectPackage.ASPECT__POINTCUTS:
				return getPointcuts();
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
			case AspectPackage.ASPECT__TARGETNAMESPACE:
				setTargetnamespace((String)newValue);
				return;
			case AspectPackage.ASPECT__EXPRESSION_LANGUAGE:
				setExpressionLanguage((String)newValue);
				return;
			case AspectPackage.ASPECT__POINTCUTS:
				setPointcuts((Pointcuts)newValue);
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
			case AspectPackage.ASPECT__TARGETNAMESPACE:
				setTargetnamespace(TARGETNAMESPACE_EDEFAULT);
				return;
			case AspectPackage.ASPECT__EXPRESSION_LANGUAGE:
				setExpressionLanguage(EXPRESSION_LANGUAGE_EDEFAULT);
				return;
			case AspectPackage.ASPECT__POINTCUTS:
				setPointcuts((Pointcuts)null);
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
			case AspectPackage.ASPECT__TARGETNAMESPACE:
				return TARGETNAMESPACE_EDEFAULT == null ? targetnamespace != null : !TARGETNAMESPACE_EDEFAULT.equals(targetnamespace);
			case AspectPackage.ASPECT__EXPRESSION_LANGUAGE:
				return EXPRESSION_LANGUAGE_EDEFAULT == null ? expressionLanguage != null : !EXPRESSION_LANGUAGE_EDEFAULT.equals(expressionLanguage);
			case AspectPackage.ASPECT__POINTCUTS:
				return pointcuts != null;
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
		result.append(", targetnamespace: ");
		result.append(targetnamespace);
		result.append(", expressionLanguage: ");
		result.append(expressionLanguage);
		result.append(')');
		return result.toString();
	}

} //AspectImpl
