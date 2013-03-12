/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.nju.workflow.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cn.edu.nju.workflow.model.OutputPort#getNode <em>Node</em>}</li>
 *   <li>{@link cn.edu.nju.workflow.model.OutputPort#getEdges <em>Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @see cn.edu.nju.workflow.model.ModelPackage#getOutputPort()
 * @model
 * @generated
 */
public interface OutputPort extends Port {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cn.edu.nju.workflow.model.WorkflowNode#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' container reference.
	 * @see #setNode(WorkflowNode)
	 * @see cn.edu.nju.workflow.model.ModelPackage#getOutputPort_Node()
	 * @see cn.edu.nju.workflow.model.WorkflowNode#getOutputs
	 * @model opposite="outputs" required="true" transient="false"
	 * @generated
	 */
	WorkflowNode getNode();

	/**
	 * Sets the value of the '{@link cn.edu.nju.workflow.model.OutputPort#getNode <em>Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' container reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(WorkflowNode value);

	/**
	 * Returns the value of the '<em><b>Edges</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cn.edu.nju.workflow.model.Edge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' reference.
	 * @see #setEdges(Edge)
	 * @see cn.edu.nju.workflow.model.ModelPackage#getOutputPort_Edges()
	 * @see cn.edu.nju.workflow.model.Edge#getSource
	 * @model opposite="source"
	 * @generated
	 */
	Edge getEdges();

	/**
	 * Sets the value of the '{@link cn.edu.nju.workflow.model.OutputPort#getEdges <em>Edges</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edges</em>' reference.
	 * @see #getEdges()
	 * @generated
	 */
	void setEdges(Edge value);

} // OutputPort
