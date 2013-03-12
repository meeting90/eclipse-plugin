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
 * A representation of the model object '<em><b>Input Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cn.edu.nju.workflow.model.InputPort#getEdges <em>Edges</em>}</li>
 *   <li>{@link cn.edu.nju.workflow.model.InputPort#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see cn.edu.nju.workflow.model.ModelPackage#getInputPort()
 * @model
 * @generated
 */
public interface InputPort extends Port {
	/**
	 * Returns the value of the '<em><b>Edges</b></em>' reference list.
	 * The list contents are of type {@link cn.edu.nju.workflow.model.Edge}.
	 * It is bidirectional and its opposite is '{@link cn.edu.nju.workflow.model.Edge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' reference list.
	 * @see cn.edu.nju.workflow.model.ModelPackage#getInputPort_Edges()
	 * @see cn.edu.nju.workflow.model.Edge#getTarget
	 * @model type="cn.edu.nju.workflow.model.Edge" opposite="target"
	 * @generated
	 */
	EList getEdges();

	/**
	 * Returns the value of the '<em><b>Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cn.edu.nju.workflow.model.WorkflowNode#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' container reference.
	 * @see #setNode(WorkflowNode)
	 * @see cn.edu.nju.workflow.model.ModelPackage#getInputPort_Node()
	 * @see cn.edu.nju.workflow.model.WorkflowNode#getInput
	 * @model opposite="input" required="true" transient="false"
	 * @generated
	 */
	WorkflowNode getNode();

	/**
	 * Sets the value of the '{@link cn.edu.nju.workflow.model.InputPort#getNode <em>Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' container reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(WorkflowNode value);

} // InputPort
