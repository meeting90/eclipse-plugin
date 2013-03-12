/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.nju.workflow.model.impl;

import cn.edu.nju.workflow.model.Edge;
import cn.edu.nju.workflow.model.ModelPackage;
import cn.edu.nju.workflow.model.OutputPort;
import cn.edu.nju.workflow.model.WorkflowNode;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cn.edu.nju.workflow.model.impl.OutputPortImpl#getNode <em>Node</em>}</li>
 *   <li>{@link cn.edu.nju.workflow.model.impl.OutputPortImpl#getEdges <em>Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputPortImpl extends PortImpl implements OutputPort {
	/**
	 * The cached value of the '{@link #getEdges() <em>Edges</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdges()
	 * @generated
	 * @ordered
	 */
	protected Edge edges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.OUTPUT_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowNode getNode() {
		if (eContainerFeatureID() != ModelPackage.OUTPUT_PORT__NODE) return null;
		return (WorkflowNode)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNode(WorkflowNode newNode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNode, ModelPackage.OUTPUT_PORT__NODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(WorkflowNode newNode) {
		if (newNode != eInternalContainer() || (eContainerFeatureID() != ModelPackage.OUTPUT_PORT__NODE && newNode != null)) {
			if (EcoreUtil.isAncestor(this, newNode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNode != null)
				msgs = ((InternalEObject)newNode).eInverseAdd(this, ModelPackage.WORKFLOW_NODE__OUTPUTS, WorkflowNode.class, msgs);
			msgs = basicSetNode(newNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.OUTPUT_PORT__NODE, newNode, newNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge getEdges() {
		if (edges != null && edges.eIsProxy()) {
			InternalEObject oldEdges = (InternalEObject)edges;
			edges = (Edge)eResolveProxy(oldEdges);
			if (edges != oldEdges) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.OUTPUT_PORT__EDGES, oldEdges, edges));
			}
		}
		return edges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge basicGetEdges() {
		return edges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEdges(Edge newEdges, NotificationChain msgs) {
		Edge oldEdges = edges;
		edges = newEdges;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.OUTPUT_PORT__EDGES, oldEdges, newEdges);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdges(Edge newEdges) {
		if (newEdges != edges) {
			NotificationChain msgs = null;
			if (edges != null)
				msgs = ((InternalEObject)edges).eInverseRemove(this, ModelPackage.EDGE__SOURCE, Edge.class, msgs);
			if (newEdges != null)
				msgs = ((InternalEObject)newEdges).eInverseAdd(this, ModelPackage.EDGE__SOURCE, Edge.class, msgs);
			msgs = basicSetEdges(newEdges, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.OUTPUT_PORT__EDGES, newEdges, newEdges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.OUTPUT_PORT__NODE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNode((WorkflowNode)otherEnd, msgs);
			case ModelPackage.OUTPUT_PORT__EDGES:
				if (edges != null)
					msgs = ((InternalEObject)edges).eInverseRemove(this, ModelPackage.EDGE__SOURCE, Edge.class, msgs);
				return basicSetEdges((Edge)otherEnd, msgs);
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
			case ModelPackage.OUTPUT_PORT__NODE:
				return basicSetNode(null, msgs);
			case ModelPackage.OUTPUT_PORT__EDGES:
				return basicSetEdges(null, msgs);
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
			case ModelPackage.OUTPUT_PORT__NODE:
				return eInternalContainer().eInverseRemove(this, ModelPackage.WORKFLOW_NODE__OUTPUTS, WorkflowNode.class, msgs);
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
			case ModelPackage.OUTPUT_PORT__NODE:
				return getNode();
			case ModelPackage.OUTPUT_PORT__EDGES:
				if (resolve) return getEdges();
				return basicGetEdges();
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
			case ModelPackage.OUTPUT_PORT__NODE:
				setNode((WorkflowNode)newValue);
				return;
			case ModelPackage.OUTPUT_PORT__EDGES:
				setEdges((Edge)newValue);
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
			case ModelPackage.OUTPUT_PORT__NODE:
				setNode((WorkflowNode)null);
				return;
			case ModelPackage.OUTPUT_PORT__EDGES:
				setEdges((Edge)null);
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
			case ModelPackage.OUTPUT_PORT__NODE:
				return getNode() != null;
			case ModelPackage.OUTPUT_PORT__EDGES:
				return edges != null;
		}
		return super.eIsSet(featureID);
	}

} //OutputPortImpl
