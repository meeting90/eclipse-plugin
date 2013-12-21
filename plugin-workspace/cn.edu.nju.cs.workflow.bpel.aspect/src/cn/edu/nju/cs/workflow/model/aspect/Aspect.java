/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.nju.cs.workflow.model.aspect;

import org.eclipse.bpel.model.BPELExtensibleElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cn.edu.nju.cs.workflow.model.aspect.Aspect#getName <em>Name</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.aspect.Aspect#getTargetnamespace <em>Targetnamespace</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.aspect.Aspect#getExpressionLanguage <em>Expression Language</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.aspect.Aspect#getPointcuts <em>Pointcuts</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.aspect.Aspect#getAdvice <em>Advice</em>}</li>
 * </ul>
 * </p>
 *
 * @see cn.edu.nju.cs.workflow.model.aspect.AspectPackage#getAspect()
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
	 * @see cn.edu.nju.cs.workflow.model.aspect.AspectPackage#getAspect_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.model.aspect.Aspect#getName <em>Name</em>}' attribute.
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
	 * @see cn.edu.nju.cs.workflow.model.aspect.AspectPackage#getAspect_Targetnamespace()
	 * @model
	 * @generated
	 */
	String getTargetnamespace();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.model.aspect.Aspect#getTargetnamespace <em>Targetnamespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Targetnamespace</em>' attribute.
	 * @see #getTargetnamespace()
	 * @generated
	 */
	void setTargetnamespace(String value);

	/**
	 * Returns the value of the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Language</em>' attribute.
	 * @see #setExpressionLanguage(String)
	 * @see cn.edu.nju.cs.workflow.model.aspect.AspectPackage#getAspect_ExpressionLanguage()
	 * @model
	 * @generated
	 */
	String getExpressionLanguage();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.model.aspect.Aspect#getExpressionLanguage <em>Expression Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression Language</em>' attribute.
	 * @see #getExpressionLanguage()
	 * @generated
	 */
	void setExpressionLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Pointcuts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pointcuts</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pointcuts</em>' containment reference.
	 * @see #setPointcuts(Pointcuts)
	 * @see cn.edu.nju.cs.workflow.model.aspect.AspectPackage#getAspect_Pointcuts()
	 * @model containment="true"
	 * @generated
	 */
	Pointcuts getPointcuts();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.model.aspect.Aspect#getPointcuts <em>Pointcuts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pointcuts</em>' containment reference.
	 * @see #getPointcuts()
	 * @generated
	 */
	void setPointcuts(Pointcuts value);

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
	 * @see cn.edu.nju.cs.workflow.model.aspect.AspectPackage#getAspect_Advice()
	 * @model containment="true"
	 * @generated
	 */
	Advice getAdvice();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.model.aspect.Aspect#getAdvice <em>Advice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Advice</em>' containment reference.
	 * @see #getAdvice()
	 * @generated
	 */
	void setAdvice(Advice value);

} // Aspect
