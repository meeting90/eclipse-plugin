/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.nju.cs.workflow.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cn.edu.nju.cs.workflow.model.Edge#getWorkflow <em>Workflow</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.Edge#getSource <em>Source</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.Edge#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getEdge()
 * @model
 * @generated
 */
public interface Edge extends WorkflowElement {
	/**
	 * Returns the value of the '<em><b>Workflow</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cn.edu.nju.cs.workflow.model.Workflow#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workflow</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow</em>' container reference.
	 * @see #setWorkflow(Workflow)
	 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getEdge_Workflow()
	 * @see cn.edu.nju.cs.workflow.model.Workflow#getEdges
	 * @model opposite="edges" required="true" transient="false"
	 * @generated
	 */
	Workflow getWorkflow();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.model.Edge#getWorkflow <em>Workflow</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workflow</em>' container reference.
	 * @see #getWorkflow()
	 * @generated
	 */
	void setWorkflow(Workflow value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cn.edu.nju.cs.workflow.model.OutputPort#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(OutputPort)
	 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getEdge_Source()
	 * @see cn.edu.nju.cs.workflow.model.OutputPort#getEdges
	 * @model opposite="edges" required="true"
	 * @generated
	 */
	OutputPort getSource();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.model.Edge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(OutputPort value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cn.edu.nju.cs.workflow.model.InputPort#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(InputPort)
	 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getEdge_Target()
	 * @see cn.edu.nju.cs.workflow.model.InputPort#getEdges
	 * @model opposite="edges" required="true"
	 * @generated
	 */
	InputPort getTarget();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.model.Edge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(InputPort value);

} // Edge
