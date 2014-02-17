/**
 */
package cn.edu.nju.cs.workflow.aspect.model;

import org.eclipse.bpel.model.BPELExtensibleElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cn.edu.nju.cs.workflow.aspect.model.Transitions#getChildren <em>Children</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.aspect.model.Transitions#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see cn.edu.nju.cs.workflow.aspect.model.AspectPackage#getTransitions()
 * @model
 * @generated
 */
public interface Transitions extends BPELExtensibleElement {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link cn.edu.nju.cs.workflow.aspect.model.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see cn.edu.nju.cs.workflow.aspect.model.AspectPackage#getTransitions_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getChildren();

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
	 * @see cn.edu.nju.cs.workflow.aspect.model.AspectPackage#getTransitions_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.aspect.model.Transitions#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Transitions
