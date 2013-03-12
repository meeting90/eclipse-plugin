/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.nju.workflow.model.impl;

import cn.edu.nju.workflow.model.Comment;
import cn.edu.nju.workflow.model.Edge;
import cn.edu.nju.workflow.model.ModelPackage;
import cn.edu.nju.workflow.model.Workflow;
import cn.edu.nju.workflow.model.WorkflowNode;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cn.edu.nju.workflow.model.impl.WorkflowImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link cn.edu.nju.workflow.model.impl.WorkflowImpl#getEdges <em>Edges</em>}</li>
 *   <li>{@link cn.edu.nju.workflow.model.impl.WorkflowImpl#getComments <em>Comments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkflowImpl extends WorkflowElementImpl implements Workflow {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList nodes;

	/**
	 * The cached value of the '{@link #getEdges() <em>Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdges()
	 * @generated
	 * @ordered
	 */
	protected EList edges;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected EList comments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.WORKFLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentWithInverseEList(WorkflowNode.class, this, ModelPackage.WORKFLOW__NODES, ModelPackage.WORKFLOW_NODE__WORKFLOW);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEdges() {
		if (edges == null) {
			edges = new EObjectContainmentWithInverseEList(Edge.class, this, ModelPackage.WORKFLOW__EDGES, ModelPackage.EDGE__WORKFLOW);
		}
		return edges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getComments() {
		if (comments == null) {
			comments = new EObjectResolvingEList(Comment.class, this, ModelPackage.WORKFLOW__COMMENTS);
		}
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.WORKFLOW__NODES:
				return ((InternalEList)getNodes()).basicAdd(otherEnd, msgs);
			case ModelPackage.WORKFLOW__EDGES:
				return ((InternalEList)getEdges()).basicAdd(otherEnd, msgs);
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
			case ModelPackage.WORKFLOW__NODES:
				return ((InternalEList)getNodes()).basicRemove(otherEnd, msgs);
			case ModelPackage.WORKFLOW__EDGES:
				return ((InternalEList)getEdges()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.WORKFLOW__NODES:
				return getNodes();
			case ModelPackage.WORKFLOW__EDGES:
				return getEdges();
			case ModelPackage.WORKFLOW__COMMENTS:
				return getComments();
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
			case ModelPackage.WORKFLOW__NODES:
				getNodes().clear();
				getNodes().addAll((Collection)newValue);
				return;
			case ModelPackage.WORKFLOW__EDGES:
				getEdges().clear();
				getEdges().addAll((Collection)newValue);
				return;
			case ModelPackage.WORKFLOW__COMMENTS:
				getComments().clear();
				getComments().addAll((Collection)newValue);
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
			case ModelPackage.WORKFLOW__NODES:
				getNodes().clear();
				return;
			case ModelPackage.WORKFLOW__EDGES:
				getEdges().clear();
				return;
			case ModelPackage.WORKFLOW__COMMENTS:
				getComments().clear();
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
			case ModelPackage.WORKFLOW__NODES:
				return nodes != null && !nodes.isEmpty();
			case ModelPackage.WORKFLOW__EDGES:
				return edges != null && !edges.isEmpty();
			case ModelPackage.WORKFLOW__COMMENTS:
				return comments != null && !comments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WorkflowImpl
