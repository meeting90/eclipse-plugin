/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.nju.cs.workflow.model.impl;

import cn.edu.nju.cs.workflow.model.AdviceEdge;
import cn.edu.nju.cs.workflow.model.InputPort;
import cn.edu.nju.cs.workflow.model.ModelPackage;
import cn.edu.nju.cs.workflow.model.OutputPort;
import cn.edu.nju.cs.workflow.model.Workflow;
import cn.edu.nju.cs.workflow.model.WorkflowNode;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workflow Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cn.edu.nju.cs.workflow.model.impl.WorkflowNodeImpl#getWorkflow <em>Workflow</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.impl.WorkflowNodeImpl#getInput <em>Input</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.impl.WorkflowNodeImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.impl.WorkflowNodeImpl#getAdviceEdges <em>Advice Edges</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.impl.WorkflowNodeImpl#isIsStartNode <em>Is Start Node</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.impl.WorkflowNodeImpl#isIsFinishNode <em>Is Finish Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkflowNodeImpl extends WorkflowElementImpl implements WorkflowNode {
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
	protected EList<OutputPort> outputs;

	/**
	 * The cached value of the '{@link #getAdviceEdges() <em>Advice Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdviceEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<AdviceEdge> adviceEdges;

	/**
	 * The default value of the '{@link #isIsStartNode() <em>Is Start Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStartNode()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_START_NODE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsStartNode() <em>Is Start Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStartNode()
	 * @generated
	 * @ordered
	 */
	protected boolean isStartNode = IS_START_NODE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsFinishNode() <em>Is Finish Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFinishNode()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FINISH_NODE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFinishNode() <em>Is Finish Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFinishNode()
	 * @generated
	 * @ordered
	 */
	protected boolean isFinishNode = IS_FINISH_NODE_EDEFAULT;

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
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.WORKFLOW_NODE;
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
				msgs = ((InternalEObject)input).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.WORKFLOW_NODE__INPUT, null, msgs);
			if (newInput != null)
				msgs = ((InternalEObject)newInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.WORKFLOW_NODE__INPUT, null, msgs);
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
	public EList<OutputPort> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList<OutputPort>(OutputPort.class, this, ModelPackage.WORKFLOW_NODE__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdviceEdge> getAdviceEdges() {
		if (adviceEdges == null) {
			adviceEdges = new EObjectContainmentWithInverseEList<AdviceEdge>(AdviceEdge.class, this, ModelPackage.WORKFLOW_NODE__ADVICE_EDGES, ModelPackage.ADVICE_EDGE__JOIN_POINT);
		}
		return adviceEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsStartNode() {
		return isStartNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStartNode(boolean newIsStartNode) {
		boolean oldIsStartNode = isStartNode;
		isStartNode = newIsStartNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.WORKFLOW_NODE__IS_START_NODE, oldIsStartNode, isStartNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFinishNode() {
		return isFinishNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFinishNode(boolean newIsFinishNode) {
		boolean oldIsFinishNode = isFinishNode;
		isFinishNode = newIsFinishNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.WORKFLOW_NODE__IS_FINISH_NODE, oldIsFinishNode, isFinishNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.WORKFLOW_NODE__WORKFLOW:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetWorkflow((Workflow)otherEnd, msgs);
			case ModelPackage.WORKFLOW_NODE__ADVICE_EDGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAdviceEdges()).basicAdd(otherEnd, msgs);
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
			case ModelPackage.WORKFLOW_NODE__WORKFLOW:
				return basicSetWorkflow(null, msgs);
			case ModelPackage.WORKFLOW_NODE__INPUT:
				return basicSetInput(null, msgs);
			case ModelPackage.WORKFLOW_NODE__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
			case ModelPackage.WORKFLOW_NODE__ADVICE_EDGES:
				return ((InternalEList<?>)getAdviceEdges()).basicRemove(otherEnd, msgs);
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.WORKFLOW_NODE__WORKFLOW:
				return getWorkflow();
			case ModelPackage.WORKFLOW_NODE__INPUT:
				return getInput();
			case ModelPackage.WORKFLOW_NODE__OUTPUTS:
				return getOutputs();
			case ModelPackage.WORKFLOW_NODE__ADVICE_EDGES:
				return getAdviceEdges();
			case ModelPackage.WORKFLOW_NODE__IS_START_NODE:
				return isIsStartNode();
			case ModelPackage.WORKFLOW_NODE__IS_FINISH_NODE:
				return isIsFinishNode();
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
			case ModelPackage.WORKFLOW_NODE__WORKFLOW:
				setWorkflow((Workflow)newValue);
				return;
			case ModelPackage.WORKFLOW_NODE__INPUT:
				setInput((InputPort)newValue);
				return;
			case ModelPackage.WORKFLOW_NODE__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends OutputPort>)newValue);
				return;
			case ModelPackage.WORKFLOW_NODE__ADVICE_EDGES:
				getAdviceEdges().clear();
				getAdviceEdges().addAll((Collection<? extends AdviceEdge>)newValue);
				return;
			case ModelPackage.WORKFLOW_NODE__IS_START_NODE:
				setIsStartNode((Boolean)newValue);
				return;
			case ModelPackage.WORKFLOW_NODE__IS_FINISH_NODE:
				setIsFinishNode((Boolean)newValue);
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
			case ModelPackage.WORKFLOW_NODE__WORKFLOW:
				setWorkflow((Workflow)null);
				return;
			case ModelPackage.WORKFLOW_NODE__INPUT:
				setInput((InputPort)null);
				return;
			case ModelPackage.WORKFLOW_NODE__OUTPUTS:
				getOutputs().clear();
				return;
			case ModelPackage.WORKFLOW_NODE__ADVICE_EDGES:
				getAdviceEdges().clear();
				return;
			case ModelPackage.WORKFLOW_NODE__IS_START_NODE:
				setIsStartNode(IS_START_NODE_EDEFAULT);
				return;
			case ModelPackage.WORKFLOW_NODE__IS_FINISH_NODE:
				setIsFinishNode(IS_FINISH_NODE_EDEFAULT);
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
			case ModelPackage.WORKFLOW_NODE__WORKFLOW:
				return getWorkflow() != null;
			case ModelPackage.WORKFLOW_NODE__INPUT:
				return input != null;
			case ModelPackage.WORKFLOW_NODE__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
			case ModelPackage.WORKFLOW_NODE__ADVICE_EDGES:
				return adviceEdges != null && !adviceEdges.isEmpty();
			case ModelPackage.WORKFLOW_NODE__IS_START_NODE:
				return isStartNode != IS_START_NODE_EDEFAULT;
			case ModelPackage.WORKFLOW_NODE__IS_FINISH_NODE:
				return isFinishNode != IS_FINISH_NODE_EDEFAULT;
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
		result.append(" (isStartNode: ");
		result.append(isStartNode);
		result.append(", isFinishNode: ");
		result.append(isFinishNode);
		result.append(')');
		return result.toString();
	}

} //WorkflowNodeImpl
