/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.nju.workflow.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cn.edu.nju.workflow.model.LoopTask#getWhileCondition <em>While Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see cn.edu.nju.workflow.model.ModelPackage#getLoopTask()
 * @model
 * @generated
 */
public interface LoopTask extends CompoundTask {
	/**
	 * Returns the value of the '<em><b>While Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>While Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>While Condition</em>' attribute.
	 * @see #setWhileCondition(String)
	 * @see cn.edu.nju.workflow.model.ModelPackage#getLoopTask_WhileCondition()
	 * @model required="true"
	 * @generated
	 */
	String getWhileCondition();

	/**
	 * Sets the value of the '{@link cn.edu.nju.workflow.model.LoopTask#getWhileCondition <em>While Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>While Condition</em>' attribute.
	 * @see #getWhileCondition()
	 * @generated
	 */
	void setWhileCondition(String value);

} // LoopTask
