/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.nju.cs.workflow.model.impl;

import cn.edu.nju.cs.workflow.model.ModelPackage;
import cn.edu.nju.cs.workflow.model.SimpleTask;

import org.eclipse.bpel.model.PartnerActivity;
import org.eclipse.bpel.model.PartnerLink;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.wst.wsdl.Operation;
import org.eclipse.wst.wsdl.PortType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cn.edu.nju.cs.workflow.model.impl.SimpleTaskImpl#getPorttype <em>Porttype</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.impl.SimpleTaskImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.impl.SimpleTaskImpl#getPartnerActivity <em>Partner Activity</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.impl.SimpleTaskImpl#getPartnerLink <em>Partner Link</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleTaskImpl extends TaskImpl implements SimpleTask {
	/**
	 * The cached value of the '{@link #getPorttype() <em>Porttype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorttype()
	 * @generated
	 * @ordered
	 */
	protected PortType porttype;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected Operation operation;

	/**
	 * The cached value of the '{@link #getPartnerActivity() <em>Partner Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartnerActivity()
	 * @generated
	 * @ordered
	 */
	protected PartnerActivity partnerActivity;

	/**
	 * The cached value of the '{@link #getPartnerLink() <em>Partner Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartnerLink()
	 * @generated
	 * @ordered
	 */
	protected PartnerLink partnerLink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.SIMPLE_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType getPorttype() {
		if (porttype != null && porttype.eIsProxy()) {
			InternalEObject oldPorttype = (InternalEObject)porttype;
			porttype = (PortType)eResolveProxy(oldPorttype);
			if (porttype != oldPorttype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.SIMPLE_TASK__PORTTYPE, oldPorttype, porttype));
			}
		}
		return porttype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType basicGetPorttype() {
		return porttype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPorttype(PortType newPorttype) {
		PortType oldPorttype = porttype;
		porttype = newPorttype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SIMPLE_TASK__PORTTYPE, oldPorttype, porttype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOperation() {
		if (operation != null && operation.eIsProxy()) {
			InternalEObject oldOperation = (InternalEObject)operation;
			operation = (Operation)eResolveProxy(oldOperation);
			if (operation != oldOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.SIMPLE_TASK__OPERATION, oldOperation, operation));
			}
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(Operation newOperation) {
		Operation oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SIMPLE_TASK__OPERATION, oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartnerActivity getPartnerActivity() {
		if (partnerActivity != null && partnerActivity.eIsProxy()) {
			InternalEObject oldPartnerActivity = (InternalEObject)partnerActivity;
			partnerActivity = (PartnerActivity)eResolveProxy(oldPartnerActivity);
			if (partnerActivity != oldPartnerActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.SIMPLE_TASK__PARTNER_ACTIVITY, oldPartnerActivity, partnerActivity));
			}
		}
		return partnerActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartnerActivity basicGetPartnerActivity() {
		return partnerActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartnerActivity(PartnerActivity newPartnerActivity) {
		PartnerActivity oldPartnerActivity = partnerActivity;
		partnerActivity = newPartnerActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SIMPLE_TASK__PARTNER_ACTIVITY, oldPartnerActivity, partnerActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartnerLink getPartnerLink() {
		if (partnerLink != null && partnerLink.eIsProxy()) {
			InternalEObject oldPartnerLink = (InternalEObject)partnerLink;
			partnerLink = (PartnerLink)eResolveProxy(oldPartnerLink);
			if (partnerLink != oldPartnerLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.SIMPLE_TASK__PARTNER_LINK, oldPartnerLink, partnerLink));
			}
		}
		return partnerLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartnerLink basicGetPartnerLink() {
		return partnerLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartnerLink(PartnerLink newPartnerLink) {
		PartnerLink oldPartnerLink = partnerLink;
		partnerLink = newPartnerLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SIMPLE_TASK__PARTNER_LINK, oldPartnerLink, partnerLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.SIMPLE_TASK__PORTTYPE:
				if (resolve) return getPorttype();
				return basicGetPorttype();
			case ModelPackage.SIMPLE_TASK__OPERATION:
				if (resolve) return getOperation();
				return basicGetOperation();
			case ModelPackage.SIMPLE_TASK__PARTNER_ACTIVITY:
				if (resolve) return getPartnerActivity();
				return basicGetPartnerActivity();
			case ModelPackage.SIMPLE_TASK__PARTNER_LINK:
				if (resolve) return getPartnerLink();
				return basicGetPartnerLink();
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
			case ModelPackage.SIMPLE_TASK__PORTTYPE:
				setPorttype((PortType)newValue);
				return;
			case ModelPackage.SIMPLE_TASK__OPERATION:
				setOperation((Operation)newValue);
				return;
			case ModelPackage.SIMPLE_TASK__PARTNER_ACTIVITY:
				setPartnerActivity((PartnerActivity)newValue);
				return;
			case ModelPackage.SIMPLE_TASK__PARTNER_LINK:
				setPartnerLink((PartnerLink)newValue);
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
			case ModelPackage.SIMPLE_TASK__PORTTYPE:
				setPorttype((PortType)null);
				return;
			case ModelPackage.SIMPLE_TASK__OPERATION:
				setOperation((Operation)null);
				return;
			case ModelPackage.SIMPLE_TASK__PARTNER_ACTIVITY:
				setPartnerActivity((PartnerActivity)null);
				return;
			case ModelPackage.SIMPLE_TASK__PARTNER_LINK:
				setPartnerLink((PartnerLink)null);
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
			case ModelPackage.SIMPLE_TASK__PORTTYPE:
				return porttype != null;
			case ModelPackage.SIMPLE_TASK__OPERATION:
				return operation != null;
			case ModelPackage.SIMPLE_TASK__PARTNER_ACTIVITY:
				return partnerActivity != null;
			case ModelPackage.SIMPLE_TASK__PARTNER_LINK:
				return partnerLink != null;
		}
		return super.eIsSet(featureID);
	}

} //SimpleTaskImpl
