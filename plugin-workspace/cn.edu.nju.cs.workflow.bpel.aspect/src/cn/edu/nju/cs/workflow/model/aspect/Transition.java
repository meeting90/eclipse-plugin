/**
 */
package cn.edu.nju.cs.workflow.model.aspect;

import org.eclipse.bpel.model.BPELExtensibleElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cn.edu.nju.cs.workflow.model.aspect.Transition#getType <em>Type</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.aspect.Transition#getPointName <em>Point Name</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.aspect.Transition#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see cn.edu.nju.cs.workflow.model.aspect.AspectPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends BPELExtensibleElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see cn.edu.nju.cs.workflow.model.aspect.AspectPackage#getTransition_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.model.aspect.Transition#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Point Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Name</em>' attribute.
	 * @see #setPointName(String)
	 * @see cn.edu.nju.cs.workflow.model.aspect.AspectPackage#getTransition_PointName()
	 * @model
	 * @generated
	 */
	String getPointName();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.model.aspect.Transition#getPointName <em>Point Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Name</em>' attribute.
	 * @see #getPointName()
	 * @generated
	 */
	void setPointName(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cn.edu.nju.cs.workflow.model.aspect.AspectPackage#getTransition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.model.aspect.Transition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Transition
