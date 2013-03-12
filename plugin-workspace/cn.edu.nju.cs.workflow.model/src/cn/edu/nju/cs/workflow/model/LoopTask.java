/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.nju.cs.workflow.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cn.edu.nju.cs.workflow.model.LoopTask#getWhileCondition <em>While Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getLoopTask()
 * @model
 * @generated
 */
public interface LoopTask extends CompoundTask {
	/**
	 * Returns the value of the '<em><b>While Condition</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link cn.edu.nju.cs.workflow.model.WhileCondition#getLooptask <em>Looptask</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>While Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>While Condition</em>' containment reference.
	 * @see #setWhileCondition(WhileCondition)
	 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getLoopTask_WhileCondition()
	 * @see cn.edu.nju.cs.workflow.model.WhileCondition#getLooptask
	 * @model opposite="looptask" containment="true" required="true"
	 * @generated
	 */
	WhileCondition getWhileCondition();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.model.LoopTask#getWhileCondition <em>While Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>While Condition</em>' containment reference.
	 * @see #getWhileCondition()
	 * @generated
	 */
	void setWhileCondition(WhileCondition value);

} // LoopTask
