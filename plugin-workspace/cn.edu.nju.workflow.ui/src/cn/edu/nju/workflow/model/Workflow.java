/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.nju.workflow.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cn.edu.nju.workflow.model.Workflow#getNodes <em>Nodes</em>}</li>
 *   <li>{@link cn.edu.nju.workflow.model.Workflow#getEdges <em>Edges</em>}</li>
 *   <li>{@link cn.edu.nju.workflow.model.Workflow#getComments <em>Comments</em>}</li>
 * </ul>
 * </p>
 *
 * @see cn.edu.nju.workflow.model.ModelPackage#getWorkflow()
 * @model
 * @generated
 */
public interface Workflow extends WorkflowElement {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link cn.edu.nju.workflow.model.WorkflowNode}.
	 * It is bidirectional and its opposite is '{@link cn.edu.nju.workflow.model.WorkflowNode#getWorkflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see cn.edu.nju.workflow.model.ModelPackage#getWorkflow_Nodes()
	 * @see cn.edu.nju.workflow.model.WorkflowNode#getWorkflow
	 * @model type="cn.edu.nju.workflow.model.WorkflowNode" opposite="workflow" containment="true"
	 * @generated
	 */
	EList getNodes();

	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
	 * The list contents are of type {@link cn.edu.nju.workflow.model.Edge}.
	 * It is bidirectional and its opposite is '{@link cn.edu.nju.workflow.model.Edge#getWorkflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference list.
	 * @see cn.edu.nju.workflow.model.ModelPackage#getWorkflow_Edges()
	 * @see cn.edu.nju.workflow.model.Edge#getWorkflow
	 * @model type="cn.edu.nju.workflow.model.Edge" opposite="workflow" containment="true"
	 * @generated
	 */
	EList getEdges();

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' reference list.
	 * The list contents are of type {@link cn.edu.nju.workflow.model.Comment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' reference list.
	 * @see cn.edu.nju.workflow.model.ModelPackage#getWorkflow_Comments()
	 * @model type="cn.edu.nju.workflow.model.Comment"
	 * @generated
	 */
	EList getComments();

} // Workflow
