/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.nju.cs.workflow.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.wst.wsdl.PortType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cn.edu.nju.cs.workflow.model.Workflow#getNodes <em>Nodes</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.Workflow#getEdges <em>Edges</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.Workflow#getComments <em>Comments</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.Workflow#getPortTypes <em>Port Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getWorkflow()
 * @model
 * @generated
 */
public interface Workflow extends WorkflowElement {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link cn.edu.nju.cs.workflow.model.WorkflowNode}.
	 * It is bidirectional and its opposite is '{@link cn.edu.nju.cs.workflow.model.WorkflowNode#getWorkflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getWorkflow_Nodes()
	 * @see cn.edu.nju.cs.workflow.model.WorkflowNode#getWorkflow
	 * @model opposite="workflow" containment="true"
	 * @generated
	 */
	EList<WorkflowNode> getNodes();

	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
	 * The list contents are of type {@link cn.edu.nju.cs.workflow.model.Edge}.
	 * It is bidirectional and its opposite is '{@link cn.edu.nju.cs.workflow.model.Edge#getWorkflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference list.
	 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getWorkflow_Edges()
	 * @see cn.edu.nju.cs.workflow.model.Edge#getWorkflow
	 * @model opposite="workflow" containment="true"
	 * @generated
	 */
	EList<Edge> getEdges();

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' reference list.
	 * The list contents are of type {@link cn.edu.nju.cs.workflow.model.Comment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' reference list.
	 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getWorkflow_Comments()
	 * @model
	 * @generated
	 */
	EList<Comment> getComments();

	/**
	 * Returns the value of the '<em><b>Port Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.wst.wsdl.PortType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Types</em>' containment reference list.
	 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getWorkflow_PortTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortType> getPortTypes();

} // Workflow
