/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.nju.cs.workflow.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Advice Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cn.edu.nju.cs.workflow.model.AdviceEdge#getAdviceTask <em>Advice Task</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.AdviceEdge#getJoinPoint <em>Join Point</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.AdviceEdge#getAdvicetype <em>Advicetype</em>}</li>
 * </ul>
 * </p>
 *
 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getAdviceEdge()
 * @model
 * @generated
 */
public interface AdviceEdge extends WorkflowElement {
	/**
	 * Returns the value of the '<em><b>Advice Task</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cn.edu.nju.cs.workflow.model.AdviceTask#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Advice Task</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Advice Task</em>' container reference.
	 * @see #setAdviceTask(AdviceTask)
	 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getAdviceEdge_AdviceTask()
	 * @see cn.edu.nju.cs.workflow.model.AdviceTask#getEdges
	 * @model opposite="edges" transient="false"
	 * @generated
	 */
	AdviceTask getAdviceTask();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.model.AdviceEdge#getAdviceTask <em>Advice Task</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Advice Task</em>' container reference.
	 * @see #getAdviceTask()
	 * @generated
	 */
	void setAdviceTask(AdviceTask value);

	/**
	 * Returns the value of the '<em><b>Join Point</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cn.edu.nju.cs.workflow.model.WorkflowNode#getAdviceEdges <em>Advice Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join Point</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Point</em>' container reference.
	 * @see #setJoinPoint(WorkflowNode)
	 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getAdviceEdge_JoinPoint()
	 * @see cn.edu.nju.cs.workflow.model.WorkflowNode#getAdviceEdges
	 * @model opposite="adviceEdges" transient="false"
	 * @generated
	 */
	WorkflowNode getJoinPoint();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.model.AdviceEdge#getJoinPoint <em>Join Point</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join Point</em>' container reference.
	 * @see #getJoinPoint()
	 * @generated
	 */
	void setJoinPoint(WorkflowNode value);

	/**
	 * Returns the value of the '<em><b>Advicetype</b></em>' attribute.
	 * The literals are from the enumeration {@link cn.edu.nju.cs.workflow.model.AdviceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Advicetype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Advicetype</em>' attribute.
	 * @see cn.edu.nju.cs.workflow.model.AdviceType
	 * @see #setAdvicetype(AdviceType)
	 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getAdviceEdge_Advicetype()
	 * @model required="true"
	 * @generated
	 */
	AdviceType getAdvicetype();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.model.AdviceEdge#getAdvicetype <em>Advicetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Advicetype</em>' attribute.
	 * @see cn.edu.nju.cs.workflow.model.AdviceType
	 * @see #getAdvicetype()
	 * @generated
	 */
	void setAdvicetype(AdviceType value);

} // AdviceEdge
