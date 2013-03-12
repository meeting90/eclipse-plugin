/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.nju.cs.workflow.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cn.edu.nju.cs.workflow.model.WhileCondition#getLooptask <em>Looptask</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.WhileCondition#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getWhileCondition()
 * @model
 * @generated
 */
public interface WhileCondition extends WorkflowElement {
	/**
	 * Returns the value of the '<em><b>Looptask</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cn.edu.nju.cs.workflow.model.LoopTask#getWhileCondition <em>While Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Looptask</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Looptask</em>' container reference.
	 * @see #setLooptask(LoopTask)
	 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getWhileCondition_Looptask()
	 * @see cn.edu.nju.cs.workflow.model.LoopTask#getWhileCondition
	 * @model opposite="whileCondition" required="true" transient="false"
	 * @generated
	 */
	LoopTask getLooptask();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.model.WhileCondition#getLooptask <em>Looptask</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Looptask</em>' container reference.
	 * @see #getLooptask()
	 * @generated
	 */
	void setLooptask(LoopTask value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getWhileCondition_Condition()
	 * @model required="true"
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.model.WhileCondition#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

} // WhileCondition
