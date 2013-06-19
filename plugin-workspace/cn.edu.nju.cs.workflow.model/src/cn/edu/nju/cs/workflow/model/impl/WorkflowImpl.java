/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.nju.cs.workflow.model.impl;

import cn.edu.nju.cs.workflow.model.Comment;
import cn.edu.nju.cs.workflow.model.Edge;
import cn.edu.nju.cs.workflow.model.ModelPackage;
import cn.edu.nju.cs.workflow.model.Workflow;
import cn.edu.nju.cs.workflow.model.WorkflowNode;

import java.util.Collection;

import org.eclipse.bpel.model.Activity;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
 *   <li>{@link cn.edu.nju.cs.workflow.model.impl.WorkflowImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.impl.WorkflowImpl#getEdges <em>Edges</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.impl.WorkflowImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.impl.WorkflowImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.impl.WorkflowImpl#getRootActivity <em>Root Activity</em>}</li>
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
	protected EList<WorkflowNode> nodes;

	/**
	 * The cached value of the '{@link #getEdges() <em>Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> edges;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> comments;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity activity;

	/**
	 * The cached value of the '{@link #getRootActivity() <em>Root Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity rootActivity;

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
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.WORKFLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkflowNode> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentWithInverseEList<WorkflowNode>(WorkflowNode.class, this, ModelPackage.WORKFLOW__NODES, ModelPackage.WORKFLOW_NODE__WORKFLOW);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edge> getEdges() {
		if (edges == null) {
			edges = new EObjectContainmentWithInverseEList<Edge>(Edge.class, this, ModelPackage.WORKFLOW__EDGES, ModelPackage.EDGE__WORKFLOW);
		}
		return edges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getComments() {
		if (comments == null) {
			comments = new EObjectResolvingEList<Comment>(Comment.class, this, ModelPackage.WORKFLOW__COMMENTS);
		}
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getActivity() {
		if (activity != null && activity.eIsProxy()) {
			InternalEObject oldActivity = (InternalEObject)activity;
			activity = (Activity)eResolveProxy(oldActivity);
			if (activity != oldActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.WORKFLOW__ACTIVITY, oldActivity, activity));
			}
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetActivity() {
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivity(Activity newActivity) {
		Activity oldActivity = activity;
		activity = newActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.WORKFLOW__ACTIVITY, oldActivity, activity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getRootActivity() {
		if (rootActivity != null && rootActivity.eIsProxy()) {
			InternalEObject oldRootActivity = (InternalEObject)rootActivity;
			rootActivity = (Activity)eResolveProxy(oldRootActivity);
			if (rootActivity != oldRootActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.WORKFLOW__ROOT_ACTIVITY, oldRootActivity, rootActivity));
			}
		}
		return rootActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetRootActivity() {
		return rootActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootActivity(Activity newRootActivity) {
		Activity oldRootActivity = rootActivity;
		rootActivity = newRootActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.WORKFLOW__ROOT_ACTIVITY, oldRootActivity, rootActivity));
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
			case ModelPackage.WORKFLOW__NODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNodes()).basicAdd(otherEnd, msgs);
			case ModelPackage.WORKFLOW__EDGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEdges()).basicAdd(otherEnd, msgs);
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
			case ModelPackage.WORKFLOW__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case ModelPackage.WORKFLOW__EDGES:
				return ((InternalEList<?>)getEdges()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.WORKFLOW__NODES:
				return getNodes();
			case ModelPackage.WORKFLOW__EDGES:
				return getEdges();
			case ModelPackage.WORKFLOW__COMMENTS:
				return getComments();
			case ModelPackage.WORKFLOW__ACTIVITY:
				if (resolve) return getActivity();
				return basicGetActivity();
			case ModelPackage.WORKFLOW__ROOT_ACTIVITY:
				if (resolve) return getRootActivity();
				return basicGetRootActivity();
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
			case ModelPackage.WORKFLOW__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends WorkflowNode>)newValue);
				return;
			case ModelPackage.WORKFLOW__EDGES:
				getEdges().clear();
				getEdges().addAll((Collection<? extends Edge>)newValue);
				return;
			case ModelPackage.WORKFLOW__COMMENTS:
				getComments().clear();
				getComments().addAll((Collection<? extends Comment>)newValue);
				return;
			case ModelPackage.WORKFLOW__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case ModelPackage.WORKFLOW__ROOT_ACTIVITY:
				setRootActivity((Activity)newValue);
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
			case ModelPackage.WORKFLOW__NODES:
				getNodes().clear();
				return;
			case ModelPackage.WORKFLOW__EDGES:
				getEdges().clear();
				return;
			case ModelPackage.WORKFLOW__COMMENTS:
				getComments().clear();
				return;
			case ModelPackage.WORKFLOW__ACTIVITY:
				setActivity((Activity)null);
				return;
			case ModelPackage.WORKFLOW__ROOT_ACTIVITY:
				setRootActivity((Activity)null);
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
			case ModelPackage.WORKFLOW__NODES:
				return nodes != null && !nodes.isEmpty();
			case ModelPackage.WORKFLOW__EDGES:
				return edges != null && !edges.isEmpty();
			case ModelPackage.WORKFLOW__COMMENTS:
				return comments != null && !comments.isEmpty();
			case ModelPackage.WORKFLOW__ACTIVITY:
				return activity != null;
			case ModelPackage.WORKFLOW__ROOT_ACTIVITY:
				return rootActivity != null;
		}
		return super.eIsSet(featureID);
	}

} //WorkflowImpl
