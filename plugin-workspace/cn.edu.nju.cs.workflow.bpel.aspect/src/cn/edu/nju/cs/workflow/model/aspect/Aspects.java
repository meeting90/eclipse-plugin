/**
 */
package cn.edu.nju.cs.workflow.model.aspect;

import org.eclipse.bpel.model.BPELExtensibleElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aspects</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cn.edu.nju.cs.workflow.model.aspect.Aspects#getName <em>Name</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.aspect.Aspects#getTargetnamespace <em>Targetnamespace</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.aspect.Aspects#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see cn.edu.nju.cs.workflow.model.aspect.AspectPackage#getAspects()
 * @model
 * @generated
 */
public interface Aspects extends BPELExtensibleElement {
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
	 * @see cn.edu.nju.cs.workflow.model.aspect.AspectPackage#getAspects_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.model.aspect.Aspects#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Targetnamespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targetnamespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targetnamespace</em>' attribute.
	 * @see #setTargetnamespace(String)
	 * @see cn.edu.nju.cs.workflow.model.aspect.AspectPackage#getAspects_Targetnamespace()
	 * @model
	 * @generated
	 */
	String getTargetnamespace();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.model.aspect.Aspects#getTargetnamespace <em>Targetnamespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Targetnamespace</em>' attribute.
	 * @see #getTargetnamespace()
	 * @generated
	 */
	void setTargetnamespace(String value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link cn.edu.nju.cs.workflow.model.aspect.Aspect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see cn.edu.nju.cs.workflow.model.aspect.AspectPackage#getAspects_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Aspect> getChildren();

} // Aspects
