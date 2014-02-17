/**
 */
package cn.edu.nju.cs.workflow.aspect.model;

import org.eclipse.bpel.model.BPELExtensibleElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cn.edu.nju.cs.workflow.aspect.model.Aspect#getName <em>Name</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.aspect.model.Aspect#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.aspect.model.Aspect#getJoinTransitions <em>Join Transitions</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.aspect.model.Aspect#getAdvice <em>Advice</em>}</li>
 * </ul>
 * </p>
 *
 * @see cn.edu.nju.cs.workflow.aspect.model.AspectPackage#getAspect()
 * @model
 * @generated
 */
public interface Aspect extends BPELExtensibleElement {
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
	 * @see cn.edu.nju.cs.workflow.aspect.model.AspectPackage#getAspect_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.aspect.model.Aspect#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference.
	 * @see #setTransitions(Transitions)
	 * @see cn.edu.nju.cs.workflow.aspect.model.AspectPackage#getAspect_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	Transitions getTransitions();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.aspect.model.Aspect#getTransitions <em>Transitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transitions</em>' containment reference.
	 * @see #getTransitions()
	 * @generated
	 */
	void setTransitions(Transitions value);

	/**
	 * Returns the value of the '<em><b>Join Transitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join Transitions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Transitions</em>' containment reference.
	 * @see #setJoinTransitions(Transitions)
	 * @see cn.edu.nju.cs.workflow.aspect.model.AspectPackage#getAspect_JoinTransitions()
	 * @model containment="true"
	 * @generated
	 */
	Transitions getJoinTransitions();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.aspect.model.Aspect#getJoinTransitions <em>Join Transitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join Transitions</em>' containment reference.
	 * @see #getJoinTransitions()
	 * @generated
	 */
	void setJoinTransitions(Transitions value);

	/**
	 * Returns the value of the '<em><b>Advice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Advice</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Advice</em>' containment reference.
	 * @see #setAdvice(Advice)
	 * @see cn.edu.nju.cs.workflow.aspect.model.AspectPackage#getAspect_Advice()
	 * @model containment="true"
	 * @generated
	 */
	Advice getAdvice();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.aspect.model.Aspect#getAdvice <em>Advice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Advice</em>' containment reference.
	 * @see #getAdvice()
	 * @generated
	 */
	void setAdvice(Advice value);

} // Aspect
