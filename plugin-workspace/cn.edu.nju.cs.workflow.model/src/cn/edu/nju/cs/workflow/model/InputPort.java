/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.nju.cs.workflow.model;

import org.eclipse.bpel.model.Assign;
import org.eclipse.bpel.model.Variable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cn.edu.nju.cs.workflow.model.InputPort#getNode <em>Node</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.InputPort#getEdges <em>Edges</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.InputPort#getInputValue <em>Input Value</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.InputPort#getAssign <em>Assign</em>}</li>
 * </ul>
 * </p>
 *
 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getInputPort()
 * @model
 * @generated
 */
public interface InputPort extends Port {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' reference.
	 * @see #setNode(WorkflowNode)
	 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getInputPort_Node()
	 * @model
	 * @generated
	 */
	WorkflowNode getNode();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.model.InputPort#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(WorkflowNode value);

	/**
	 * Returns the value of the '<em><b>Edges</b></em>' reference list.
	 * The list contents are of type {@link cn.edu.nju.cs.workflow.model.Edge}.
	 * It is bidirectional and its opposite is '{@link cn.edu.nju.cs.workflow.model.Edge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' reference list.
	 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getInputPort_Edges()
	 * @see cn.edu.nju.cs.workflow.model.Edge#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Edge> getEdges();

	/**
	 * Returns the value of the '<em><b>Input Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Value</em>' reference.
	 * @see #setInputValue(Variable)
	 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getInputPort_InputValue()
	 * @model
	 * @generated
	 */
	Variable getInputValue();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.model.InputPort#getInputValue <em>Input Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Value</em>' reference.
	 * @see #getInputValue()
	 * @generated
	 */
	void setInputValue(Variable value);

	/**
	 * Returns the value of the '<em><b>Assign</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assign</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assign</em>' reference.
	 * @see #setAssign(Assign)
	 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getInputPort_Assign()
	 * @model
	 * @generated
	 */
	Assign getAssign();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.model.InputPort#getAssign <em>Assign</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assign</em>' reference.
	 * @see #getAssign()
	 * @generated
	 */
	void setAssign(Assign value);

} // InputPort
