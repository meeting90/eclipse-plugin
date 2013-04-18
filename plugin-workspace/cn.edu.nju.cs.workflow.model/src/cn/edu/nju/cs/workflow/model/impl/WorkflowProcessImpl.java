/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.nju.cs.workflow.model.impl;

import cn.edu.nju.cs.workflow.model.ModelPackage;
import cn.edu.nju.cs.workflow.model.Workflow;
import cn.edu.nju.cs.workflow.model.WorkflowProcess;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.wst.wsdl.PortType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workflow Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cn.edu.nju.cs.workflow.model.impl.WorkflowProcessImpl#getRootWorkflow <em>Root Workflow</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.impl.WorkflowProcessImpl#getBpelProcess <em>Bpel Process</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.impl.WorkflowProcessImpl#getImplPortTypes <em>Impl Port Types</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.impl.WorkflowProcessImpl#getToImplPortTypes <em>To Impl Port Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkflowProcessImpl extends EObjectImpl implements WorkflowProcess {
	/**
	 * The cached value of the '{@link #getRootWorkflow() <em>Root Workflow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootWorkflow()
	 * @generated
	 * @ordered
	 */
	protected Workflow rootWorkflow;

	/**
	 * The cached value of the '{@link #getBpelProcess() <em>Bpel Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBpelProcess()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.bpel.model.Process bpelProcess;

	/**
	 * The cached value of the '{@link #getImplPortTypes() <em>Impl Port Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplPortTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<PortType> implPortTypes;

	/**
	 * The cached value of the '{@link #getToImplPortTypes() <em>To Impl Port Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToImplPortTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<PortType> toImplPortTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.WORKFLOW_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workflow getRootWorkflow() {
		return rootWorkflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRootWorkflow(Workflow newRootWorkflow, NotificationChain msgs) {
		Workflow oldRootWorkflow = rootWorkflow;
		rootWorkflow = newRootWorkflow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.WORKFLOW_PROCESS__ROOT_WORKFLOW, oldRootWorkflow, newRootWorkflow);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootWorkflow(Workflow newRootWorkflow) {
		if (newRootWorkflow != rootWorkflow) {
			NotificationChain msgs = null;
			if (rootWorkflow != null)
				msgs = ((InternalEObject)rootWorkflow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.WORKFLOW_PROCESS__ROOT_WORKFLOW, null, msgs);
			if (newRootWorkflow != null)
				msgs = ((InternalEObject)newRootWorkflow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.WORKFLOW_PROCESS__ROOT_WORKFLOW, null, msgs);
			msgs = basicSetRootWorkflow(newRootWorkflow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.WORKFLOW_PROCESS__ROOT_WORKFLOW, newRootWorkflow, newRootWorkflow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.bpel.model.Process getBpelProcess() {
		if (bpelProcess != null && bpelProcess.eIsProxy()) {
			InternalEObject oldBpelProcess = (InternalEObject)bpelProcess;
			bpelProcess = (org.eclipse.bpel.model.Process)eResolveProxy(oldBpelProcess);
			if (bpelProcess != oldBpelProcess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.WORKFLOW_PROCESS__BPEL_PROCESS, oldBpelProcess, bpelProcess));
			}
		}
		return bpelProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.bpel.model.Process basicGetBpelProcess() {
		return bpelProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBpelProcess(org.eclipse.bpel.model.Process newBpelProcess) {
		org.eclipse.bpel.model.Process oldBpelProcess = bpelProcess;
		bpelProcess = newBpelProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.WORKFLOW_PROCESS__BPEL_PROCESS, oldBpelProcess, bpelProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortType> getImplPortTypes() {
		if (implPortTypes == null) {
			implPortTypes = new EObjectContainmentEList<PortType>(PortType.class, this, ModelPackage.WORKFLOW_PROCESS__IMPL_PORT_TYPES);
		}
		return implPortTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortType> getToImplPortTypes() {
		if (toImplPortTypes == null) {
			toImplPortTypes = new EObjectResolvingEList<PortType>(PortType.class, this, ModelPackage.WORKFLOW_PROCESS__TO_IMPL_PORT_TYPES);
		}
		return toImplPortTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.WORKFLOW_PROCESS__ROOT_WORKFLOW:
				return basicSetRootWorkflow(null, msgs);
			case ModelPackage.WORKFLOW_PROCESS__IMPL_PORT_TYPES:
				return ((InternalEList<?>)getImplPortTypes()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.WORKFLOW_PROCESS__ROOT_WORKFLOW:
				return getRootWorkflow();
			case ModelPackage.WORKFLOW_PROCESS__BPEL_PROCESS:
				if (resolve) return getBpelProcess();
				return basicGetBpelProcess();
			case ModelPackage.WORKFLOW_PROCESS__IMPL_PORT_TYPES:
				return getImplPortTypes();
			case ModelPackage.WORKFLOW_PROCESS__TO_IMPL_PORT_TYPES:
				return getToImplPortTypes();
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
			case ModelPackage.WORKFLOW_PROCESS__ROOT_WORKFLOW:
				setRootWorkflow((Workflow)newValue);
				return;
			case ModelPackage.WORKFLOW_PROCESS__BPEL_PROCESS:
				setBpelProcess((org.eclipse.bpel.model.Process)newValue);
				return;
			case ModelPackage.WORKFLOW_PROCESS__IMPL_PORT_TYPES:
				getImplPortTypes().clear();
				getImplPortTypes().addAll((Collection<? extends PortType>)newValue);
				return;
			case ModelPackage.WORKFLOW_PROCESS__TO_IMPL_PORT_TYPES:
				getToImplPortTypes().clear();
				getToImplPortTypes().addAll((Collection<? extends PortType>)newValue);
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
			case ModelPackage.WORKFLOW_PROCESS__ROOT_WORKFLOW:
				setRootWorkflow((Workflow)null);
				return;
			case ModelPackage.WORKFLOW_PROCESS__BPEL_PROCESS:
				setBpelProcess((org.eclipse.bpel.model.Process)null);
				return;
			case ModelPackage.WORKFLOW_PROCESS__IMPL_PORT_TYPES:
				getImplPortTypes().clear();
				return;
			case ModelPackage.WORKFLOW_PROCESS__TO_IMPL_PORT_TYPES:
				getToImplPortTypes().clear();
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
			case ModelPackage.WORKFLOW_PROCESS__ROOT_WORKFLOW:
				return rootWorkflow != null;
			case ModelPackage.WORKFLOW_PROCESS__BPEL_PROCESS:
				return bpelProcess != null;
			case ModelPackage.WORKFLOW_PROCESS__IMPL_PORT_TYPES:
				return implPortTypes != null && !implPortTypes.isEmpty();
			case ModelPackage.WORKFLOW_PROCESS__TO_IMPL_PORT_TYPES:
				return toImplPortTypes != null && !toImplPortTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WorkflowProcessImpl
