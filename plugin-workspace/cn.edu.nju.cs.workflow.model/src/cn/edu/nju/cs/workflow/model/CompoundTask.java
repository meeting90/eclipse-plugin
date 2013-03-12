/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.nju.cs.workflow.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compound Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cn.edu.nju.cs.workflow.model.CompoundTask#getSubworkflow <em>Subworkflow</em>}</li>
 * </ul>
 * </p>
 *
 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getCompoundTask()
 * @model
 * @generated
 */
public interface CompoundTask extends Task {
	/**
	 * Returns the value of the '<em><b>Subworkflow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subworkflow</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subworkflow</em>' containment reference.
	 * @see #setSubworkflow(Workflow)
	 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getCompoundTask_Subworkflow()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Workflow getSubworkflow();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.model.CompoundTask#getSubworkflow <em>Subworkflow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subworkflow</em>' containment reference.
	 * @see #getSubworkflow()
	 * @generated
	 */
	void setSubworkflow(Workflow value);

} // CompoundTask
