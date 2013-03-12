/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.nju.cs.workflow.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Output Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cn.edu.nju.cs.workflow.model.ConditionalOutputPort#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getConditionalOutputPort()
 * @model
 * @generated
 */
public interface ConditionalOutputPort extends OutputPort {
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
	 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getConditionalOutputPort_Condition()
	 * @model required="true"
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.model.ConditionalOutputPort#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

} // ConditionalOutputPort
