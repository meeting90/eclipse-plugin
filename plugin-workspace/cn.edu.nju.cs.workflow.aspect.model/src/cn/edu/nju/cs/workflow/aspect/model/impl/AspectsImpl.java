/**
 */
package cn.edu.nju.cs.workflow.aspect.model.impl;

import cn.edu.nju.cs.workflow.aspect.model.Aspect;
import cn.edu.nju.cs.workflow.aspect.model.AspectPackage;
import cn.edu.nju.cs.workflow.aspect.model.Aspects;

import java.util.Collection;

import org.eclipse.bpel.model.impl.BPELExtensibleElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aspects</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cn.edu.nju.cs.workflow.aspect.model.impl.AspectsImpl#getName <em>Name</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.aspect.model.impl.AspectsImpl#getTargetnamespace <em>Targetnamespace</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.aspect.model.impl.AspectsImpl#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AspectsImpl extends BPELExtensibleElementImpl implements Aspects {
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
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Aspect> children;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AspectsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AspectPackage.Literals.ASPECTS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AspectPackage.ASPECTS__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AspectPackage.ASPECTS__TARGETNAMESPACE, oldTargetnamespace, targetnamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Aspect> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<Aspect>(Aspect.class, this, AspectPackage.ASPECTS__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AspectPackage.ASPECTS__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
			case AspectPackage.ASPECTS__NAME:
				return getName();
			case AspectPackage.ASPECTS__TARGETNAMESPACE:
				return getTargetnamespace();
			case AspectPackage.ASPECTS__CHILDREN:
				return getChildren();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AspectPackage.ASPECTS__NAME:
				setName((String)newValue);
				return;
			case AspectPackage.ASPECTS__TARGETNAMESPACE:
				setTargetnamespace((String)newValue);
				return;
			case AspectPackage.ASPECTS__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Aspect>)newValue);
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
			case AspectPackage.ASPECTS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AspectPackage.ASPECTS__TARGETNAMESPACE:
				setTargetnamespace(TARGETNAMESPACE_EDEFAULT);
				return;
			case AspectPackage.ASPECTS__CHILDREN:
				getChildren().clear();
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
			case AspectPackage.ASPECTS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AspectPackage.ASPECTS__TARGETNAMESPACE:
				return TARGETNAMESPACE_EDEFAULT == null ? targetnamespace != null : !TARGETNAMESPACE_EDEFAULT.equals(targetnamespace);
			case AspectPackage.ASPECTS__CHILDREN:
				return children != null && !children.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //AspectsImpl
