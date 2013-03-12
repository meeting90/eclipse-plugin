/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.nju.workflow.model.impl;

import cn.edu.nju.workflow.model.AdviceTask;
import cn.edu.nju.workflow.model.InputPort;
import cn.edu.nju.workflow.model.ModelPackage;
import cn.edu.nju.workflow.model.OutputPort;
import cn.edu.nju.workflow.model.Workflow;
import cn.edu.nju.workflow.model.WorkflowNode;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workflow Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cn.edu.nju.workflow.model.impl.WorkflowNodeImpl#isIsStart <em>Is Start</em>}</li>
 *   <li>{@link cn.edu.nju.workflow.model.impl.WorkflowNodeImpl#isIsFinish <em>Is Finish</em>}</li>
 *   <li>{@link cn.edu.nju.workflow.model.impl.WorkflowNodeImpl#getWorkflow <em>Workflow</em>}</li>
 *   <li>{@link cn.edu.nju.workflow.model.impl.WorkflowNodeImpl#getInput <em>Input</em>}</li>
 *   <li>{@link cn.edu.nju.workflow.model.impl.WorkflowNodeImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link cn.edu.nju.workflow.model.impl.WorkflowNodeImpl#getPointCut <em>Point Cut</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkflowNodeImpl extends WorkflowElementImpl implements WorkflowNode {
	/**
	 * The default value of the '{@link #isIsStart() <em>Is Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStart()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_START_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsStart() <em>Is Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStart()
	 * @generated
	 * @ordered
	 */
	protected boolean isStart = IS_START_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsFinish() <em>Is Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFinish()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FINISH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFinish() <em>Is Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFinish()
	 * @generated
	 * @ordered
	 */
	protected boolean isFinish = IS_FINISH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected InputPort input;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList outputs;

	/**
	 * The cached value of the '{@link #getPointCut() <em>Point Cut</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointCut()
	 * @generated
	 * @ordered
	 */
	protected EList pointCut;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.WORKFLOW_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsStart() {
		return isStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStart(boolean newIsStart) {
		boolean oldIsStart = isStart;
		isStart = newIsStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.WORKFLOW_NODE__IS_START, oldIsStart, isStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFinish() {
		return isFinish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFinish(boolean newIsFinish) {
		boolean oldIsFinish = isFinish;
		isFinish = newIsFinish;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.WORKFLOW_NODE__IS_FINISH, oldIsFinish, isFinish));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workflow getWorkflow() {
		if (eContainerFeatureID() != ModelPackage.WORKFLOW_NODE__WORKFLOW) return null;
		return (Workflow)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkflow(Workflow newWorkflow, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newWorkflow, ModelPackage.WORKFLOW_NODE__WORKFLOW, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkflow(Workflow newWorkflow) {
		if (newWorkflow != eInternalContainer() || (eContainerFeatureID() != ModelPackage.WORKFLOW_NODE__WORKFLOW && newWorkflow != null)) {
			if (EcoreUtil.isAncestor(this, newWorkflow))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newWorkflow != null)
				msgs = ((InternalEObject)newWorkflow).eInverseAdd(this, ModelPackage.WORKFLOW__NODES, Workflow.class, msgs);
			msgs = basicSetWorkflow(newWorkflow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.WORKFLOW_NODE__WORKFLOW, newWorkflow, newWorkflow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPort getInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInput(InputPort newInput, NotificationChain msgs) {
		InputPort oldInput = input;
		input = newInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.WORKFLOW_NODE__INPUT, oldInput, newInput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(InputPort newInput) {
		if (newInput != input) {
			NotificationChain msgs = null;
			if (input != null)
				msgs = ((InternalEObject)input).eInverseRemove(this, ModelPackage.INPUT_PORT__NODE, InputPort.class, msgs);
			if (newInput != null)
				msgs = ((InternalEObject)newInput).eInverseAdd(this, ModelPackage.INPUT_PORT__NODE, InputPort.class, msgs);
			msgs = basicSetInput(newInput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.WORKFLOW_NODE__INPUT, newInput, newInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentWithInverseEList(OutputPort.class, this, ModelPackage.WORKFLOW_NODE__OUTPUTS, ModelPackage.OUTPUT_PORT__NODE);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPointCut() {
		if (pointCut == null) {
			pointCut = new EObjectWithInverseResolvingEList.ManyInverse(AdviceTask.class, this, ModelPackage.WORKFLOW_NODE__POINT_CUT, ModelPackage.ADVICE_TASK__JOIN_POINT);
		}
		return pointCut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.WORKFLOW_NODE__WORKFLOW:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetWorkflow((Workflow)otherEnd, msgs);
			case ModelPackage.WORKFLOW_NODE__INPUT:
				if (input != null)
					msgs = ((InternalEObject)input).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.WORKFLOW_NODE__INPUT, null, msgs);
				return basicSetInput((InputPort)otherEnd, msgs);
			case ModelPackage.WORKFLOW_NODE__OUTPUTS:
				return ((InternalEList)getOutputs()).basicAdd(otherEnd, msgs);
			case ModelPackage.WORKFLOW_NODE__POINT_CUT:
				return ((InternalEList)getPointCut()).basicAdd(otherEnd, msgs);
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
			case ModelPackage.WORKFLOW_NODE__WORKFLOW:
				return basicSetWorkflow(null, msgs);
			case ModelPackage.WORKFLOW_NODE__INPUT:
				return basicSetInput(null, msgs);
			case ModelPackage.WORKFLOW_NODE__OUTPUTS:
				return ((InternalEList)getOutputs()).basicRemove(otherEnd, msgs);
			case ModelPackage.WORKFLOW_NODE__POINT_CUT:
				return ((InternalEList)getPointCut()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ModelPackage.WORKFLOW_NODE__WORKFLOW:
				return eInternalContainer().eInverseRemove(this, ModelPackage.WORKFLOW__NODES, Workflow.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.WORKFLOW_NODE__IS_START:
				return isIsStart() ? Boolean.TRUE : Boolean.FALSE;
			case ModelPackage.WORKFLOW_NODE__IS_FINISH:
				return isIsFinish() ? Boolean.TRUE : Boolean.FALSE;
			case ModelPackage.WORKFLOW_NODE__WORKFLOW:
				return getWorkflow();
			case ModelPackage.WORKFLOW_NODE__INPUT:
				return getInput();
			case ModelPackage.WORKFLOW_NODE__OUTPUTS:
				return getOutputs();
			case ModelPackage.WORKFLOW_NODE__POINT_CUT:
				return getPointCut();
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
			case ModelPackage.WORKFLOW_NODE__IS_START:
				setIsStart(((Boolean)newValue).booleanValue());
				return;
			case ModelPackage.WORKFLOW_NODE__IS_FINISH:
				setIsFinish(((Boolean)newValue).booleanValue());
				return;
			case ModelPackage.WORKFLOW_NODE__WORKFLOW:
				setWorkflow((Workflow)newValue);
				return;
			case ModelPackage.WORKFLOW_NODE__INPUT:
				setInput((InputPort)newValue);
				return;
			case ModelPackage.WORKFLOW_NODE__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection)newValue);
				return;
			case ModelPackage.WORKFLOW_NODE__POINT_CUT:
				getPointCut().clear();
				getPointCut().addAll((Collection)newValue);
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
			case ModelPackage.WORKFLOW_NODE__IS_START:
				setIsStart(IS_START_EDEFAULT);
				return;
			case ModelPackage.WORKFLOW_NODE__IS_FINISH:
				setIsFinish(IS_FINISH_EDEFAULT);
				return;
			case ModelPackage.WORKFLOW_NODE__WORKFLOW:
				setWorkflow((Workflow)null);
				return;
			case ModelPackage.WORKFLOW_NODE__INPUT:
				setInput((InputPort)null);
				return;
			case ModelPackage.WORKFLOW_NODE__OUTPUTS:
				getOutputs().clear();
				return;
			case ModelPackage.WORKFLOW_NODE__POINT_CUT:
				getPointCut().clear();
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
			case ModelPackage.WORKFLOW_NODE__IS_START:
				return isStart != IS_START_EDEFAULT;
			case ModelPackage.WORKFLOW_NODE__IS_FINISH:
				return isFinish != IS_FINISH_EDEFAULT;
			case ModelPackage.WORKFLOW_NODE__WORKFLOW:
				return getWorkflow() != null;
			case ModelPackage.WORKFLOW_NODE__INPUT:
				return input != null;
			case ModelPackage.WORKFLOW_NODE__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
			case ModelPackage.WORKFLOW_NODE__POINT_CUT:
				return pointCut != null && !pointCut.isEmpty();
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
		result.append(" (isStart: ");
		result.append(isStart);
		result.append(", isFinish: ");
		result.append(isFinish);
		result.append(')');
		return result.toString();
	}

} //WorkflowNodeImpl
