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
 * A representation of the model object '<em><b>Workflow Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cn.edu.nju.workflow.model.WorkflowNode#isIsStart <em>Is Start</em>}</li>
 *   <li>{@link cn.edu.nju.workflow.model.WorkflowNode#isIsFinish <em>Is Finish</em>}</li>
 *   <li>{@link cn.edu.nju.workflow.model.WorkflowNode#getWorkflow <em>Workflow</em>}</li>
 *   <li>{@link cn.edu.nju.workflow.model.WorkflowNode#getInput <em>Input</em>}</li>
 *   <li>{@link cn.edu.nju.workflow.model.WorkflowNode#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link cn.edu.nju.workflow.model.WorkflowNode#getPointCut <em>Point Cut</em>}</li>
 * </ul>
 * </p>
 *
 * @see cn.edu.nju.workflow.model.ModelPackage#getWorkflowNode()
 * @model
 * @generated
 */
public interface WorkflowNode extends WorkflowElement {
	/**
	 * Returns the value of the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Start</em>' attribute.
	 * @see #setIsStart(boolean)
	 * @see cn.edu.nju.workflow.model.ModelPackage#getWorkflowNode_IsStart()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsStart();

	/**
	 * Sets the value of the '{@link cn.edu.nju.workflow.model.WorkflowNode#isIsStart <em>Is Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Start</em>' attribute.
	 * @see #isIsStart()
	 * @generated
	 */
	void setIsStart(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Finish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Finish</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Finish</em>' attribute.
	 * @see #setIsFinish(boolean)
	 * @see cn.edu.nju.workflow.model.ModelPackage#getWorkflowNode_IsFinish()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsFinish();

	/**
	 * Sets the value of the '{@link cn.edu.nju.workflow.model.WorkflowNode#isIsFinish <em>Is Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Finish</em>' attribute.
	 * @see #isIsFinish()
	 * @generated
	 */
	void setIsFinish(boolean value);

	/**
	 * Returns the value of the '<em><b>Workflow</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cn.edu.nju.workflow.model.Workflow#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workflow</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow</em>' container reference.
	 * @see #setWorkflow(Workflow)
	 * @see cn.edu.nju.workflow.model.ModelPackage#getWorkflowNode_Workflow()
	 * @see cn.edu.nju.workflow.model.Workflow#getNodes
	 * @model opposite="nodes" required="true" transient="false"
	 * @generated
	 */
	Workflow getWorkflow();

	/**
	 * Sets the value of the '{@link cn.edu.nju.workflow.model.WorkflowNode#getWorkflow <em>Workflow</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workflow</em>' container reference.
	 * @see #getWorkflow()
	 * @generated
	 */
	void setWorkflow(Workflow value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link cn.edu.nju.workflow.model.InputPort#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference.
	 * @see #setInput(InputPort)
	 * @see cn.edu.nju.workflow.model.ModelPackage#getWorkflowNode_Input()
	 * @see cn.edu.nju.workflow.model.InputPort#getNode
	 * @model opposite="node" containment="true" required="true"
	 * @generated
	 */
	InputPort getInput();

	/**
	 * Sets the value of the '{@link cn.edu.nju.workflow.model.WorkflowNode#getInput <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' containment reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(InputPort value);

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link cn.edu.nju.workflow.model.OutputPort}.
	 * It is bidirectional and its opposite is '{@link cn.edu.nju.workflow.model.OutputPort#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see cn.edu.nju.workflow.model.ModelPackage#getWorkflowNode_Outputs()
	 * @see cn.edu.nju.workflow.model.OutputPort#getNode
	 * @model type="cn.edu.nju.workflow.model.OutputPort" opposite="node" containment="true"
	 * @generated
	 */
	EList getOutputs();

	/**
	 * Returns the value of the '<em><b>Point Cut</b></em>' reference list.
	 * The list contents are of type {@link cn.edu.nju.workflow.model.AdviceTask}.
	 * It is bidirectional and its opposite is '{@link cn.edu.nju.workflow.model.AdviceTask#getJoinPoint <em>Join Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Cut</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Cut</em>' reference list.
	 * @see cn.edu.nju.workflow.model.ModelPackage#getWorkflowNode_PointCut()
	 * @see cn.edu.nju.workflow.model.AdviceTask#getJoinPoint
	 * @model type="cn.edu.nju.workflow.model.AdviceTask" opposite="joinPoint"
	 * @generated
	 */
	EList getPointCut();

} // WorkflowNode
