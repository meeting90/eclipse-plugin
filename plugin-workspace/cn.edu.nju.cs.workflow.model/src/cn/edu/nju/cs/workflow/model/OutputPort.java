/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.nju.cs.workflow.model;

import org.eclipse.bpel.model.Variable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cn.edu.nju.cs.workflow.model.OutputPort#getNode <em>Node</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.OutputPort#getEdges <em>Edges</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.OutputPort#getOutputValue <em>Output Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getOutputPort()
 * @model
 * @generated
 */
public interface OutputPort extends Port {
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
	 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getOutputPort_Node()
	 * @model
	 * @generated
	 */
	WorkflowNode getNode();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.model.OutputPort#getNode <em>Node</em>}' reference.
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
	 * It is bidirectional and its opposite is '{@link cn.edu.nju.cs.workflow.model.Edge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' reference list.
	 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getOutputPort_Edges()
	 * @see cn.edu.nju.cs.workflow.model.Edge#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Edge> getEdges();

	/**
	 * Returns the value of the '<em><b>Output Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Value</em>' reference.
	 * @see #setOutputValue(Variable)
	 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getOutputPort_OutputValue()
	 * @model
	 * @generated
	 */
	Variable getOutputValue();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.model.OutputPort#getOutputValue <em>Output Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Value</em>' reference.
	 * @see #getOutputValue()
	 * @generated
	 */
	void setOutputValue(Variable value);

} // OutputPort
