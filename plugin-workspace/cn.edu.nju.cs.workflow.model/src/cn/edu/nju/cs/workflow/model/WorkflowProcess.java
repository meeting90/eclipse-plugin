/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.nju.cs.workflow.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cn.edu.nju.cs.workflow.model.WorkflowProcess#getRootWorkflow <em>Root Workflow</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.WorkflowProcess#getBpelProcess <em>Bpel Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getWorkflowProcess()
 * @model
 * @generated
 */
public interface WorkflowProcess extends EObject {
	/**
	 * Returns the value of the '<em><b>Root Workflow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Workflow</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Workflow</em>' containment reference.
	 * @see #setRootWorkflow(Workflow)
	 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getWorkflowProcess_RootWorkflow()
	 * @model containment="true"
	 * @generated
	 */
	Workflow getRootWorkflow();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.model.WorkflowProcess#getRootWorkflow <em>Root Workflow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Workflow</em>' containment reference.
	 * @see #getRootWorkflow()
	 * @generated
	 */
	void setRootWorkflow(Workflow value);

	/**
	 * Returns the value of the '<em><b>Bpel Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bpel Process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bpel Process</em>' reference.
	 * @see #setBpelProcess(org.eclipse.bpel.model.Process)
	 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getWorkflowProcess_BpelProcess()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.bpel.model.Process getBpelProcess();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.model.WorkflowProcess#getBpelProcess <em>Bpel Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bpel Process</em>' reference.
	 * @see #getBpelProcess()
	 * @generated
	 */
	void setBpelProcess(org.eclipse.bpel.model.Process value);

} // WorkflowProcess
