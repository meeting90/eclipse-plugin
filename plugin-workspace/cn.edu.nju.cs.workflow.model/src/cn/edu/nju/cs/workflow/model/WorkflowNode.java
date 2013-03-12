/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.nju.cs.workflow.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cn.edu.nju.cs.workflow.model.WorkflowNode#getWorkflow <em>Workflow</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.WorkflowNode#getInput <em>Input</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.WorkflowNode#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.WorkflowNode#getAdviceEdges <em>Advice Edges</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.WorkflowNode#isIsStartNode <em>Is Start Node</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.WorkflowNode#isIsFinishNode <em>Is Finish Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getWorkflowNode()
 * @model
 * @generated
 */
public interface WorkflowNode extends WorkflowElement {
	/**
	 * Returns the value of the '<em><b>Workflow</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cn.edu.nju.cs.workflow.model.Workflow#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workflow</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow</em>' container reference.
	 * @see #setWorkflow(Workflow)
	 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getWorkflowNode_Workflow()
	 * @see cn.edu.nju.cs.workflow.model.Workflow#getNodes
	 * @model opposite="nodes" required="true" transient="false"
	 * @generated
	 */
	Workflow getWorkflow();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.model.WorkflowNode#getWorkflow <em>Workflow</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workflow</em>' container reference.
	 * @see #getWorkflow()
	 * @generated
	 */
	void setWorkflow(Workflow value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference.
	 * @see #setInput(InputPort)
	 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getWorkflowNode_Input()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InputPort getInput();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.model.WorkflowNode#getInput <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' containment reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(InputPort value);

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link cn.edu.nju.cs.workflow.model.OutputPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getWorkflowNode_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputPort> getOutputs();

	/**
	 * Returns the value of the '<em><b>Advice Edges</b></em>' containment reference list.
	 * The list contents are of type {@link cn.edu.nju.cs.workflow.model.AdviceEdge}.
	 * It is bidirectional and its opposite is '{@link cn.edu.nju.cs.workflow.model.AdviceEdge#getJoinPoint <em>Join Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Advice Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Advice Edges</em>' containment reference list.
	 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getWorkflowNode_AdviceEdges()
	 * @see cn.edu.nju.cs.workflow.model.AdviceEdge#getJoinPoint
	 * @model opposite="joinPoint" containment="true"
	 * @generated
	 */
	EList<AdviceEdge> getAdviceEdges();

	/**
	 * Returns the value of the '<em><b>Is Start Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Start Node</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Start Node</em>' attribute.
	 * @see #setIsStartNode(boolean)
	 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getWorkflowNode_IsStartNode()
	 * @model
	 * @generated
	 */
	boolean isIsStartNode();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.model.WorkflowNode#isIsStartNode <em>Is Start Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Start Node</em>' attribute.
	 * @see #isIsStartNode()
	 * @generated
	 */
	void setIsStartNode(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Finish Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Finish Node</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Finish Node</em>' attribute.
	 * @see #setIsFinishNode(boolean)
	 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getWorkflowNode_IsFinishNode()
	 * @model
	 * @generated
	 */
	boolean isIsFinishNode();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.model.WorkflowNode#isIsFinishNode <em>Is Finish Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Finish Node</em>' attribute.
	 * @see #isIsFinishNode()
	 * @generated
	 */
	void setIsFinishNode(boolean value);

} // WorkflowNode
