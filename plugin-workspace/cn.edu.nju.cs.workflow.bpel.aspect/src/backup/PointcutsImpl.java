/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package backup;

import cn.edu.nju.cs.workflow.model.aspect.AspectPackage;
import cn.edu.nju.cs.workflow.model.aspect.Pointcut;
import cn.edu.nju.cs.workflow.model.aspect.Pointcuts;
import cn.edu.nju.cs.workflow.model.aspect.util.AspectConstants;
import cn.edu.nju.cs.workflow.model.aspect.util.AspectReconciliationHelper;


import java.util.Collection;

import org.eclipse.bpel.model.MessageExchange;
import org.eclipse.bpel.model.impl.BPELExtensibleElementImpl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pointcuts</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cn.edu.nju.cs.workflow.model.aspect.impl.PointcutsImpl#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PointcutsImpl extends BPELExtensibleElementImpl implements Pointcuts {
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Pointcut> children;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointcutsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AspectPackage.Literals.POINTCUTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pointcut> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<Pointcut>(Pointcut.class, this, AspectPackage.POINTCUTS__CHILDREN);
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
			case AspectPackage.POINTCUTS__CHILDREN:
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
			case AspectPackage.POINTCUTS__CHILDREN:
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
			case AspectPackage.POINTCUTS__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Pointcut>)newValue);
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
			case AspectPackage.POINTCUTS__CHILDREN:
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
			case AspectPackage.POINTCUTS__CHILDREN:
				return children != null && !children.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	@SuppressWarnings("restriction")
	@Override
	protected void adoptContent(EReference reference, Object object) {
		// TODO Auto-generated method stub
		if (object instanceof MessageExchange) {
			if (getElement() == null) {
				AspectReconciliationHelper.getInstance().patchParentElement(
						(Pointcut) object, this, null,
						AspectConstants.ND_POINTCUTS,
						AspectConstants.ND_POINTCUT);
			}
			AspectReconciliationHelper
					.adoptChild(this, children, (Pointcut) object,
							AspectConstants.ND_POINTCUT);
		}
		super.adoptContent(reference, object);
	}
	@SuppressWarnings("restriction")
	@Override
	protected void orphanContent(EReference reference, Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof MessageExchange) {
			AspectReconciliationHelper.orphanChild(this, (Pointcut) obj);
		}
		super.orphanContent(reference, obj);
	}

} //PointcutsImpl
