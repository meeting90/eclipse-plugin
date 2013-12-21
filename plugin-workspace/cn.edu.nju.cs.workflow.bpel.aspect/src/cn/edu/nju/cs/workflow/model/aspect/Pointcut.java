/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.nju.cs.workflow.model.aspect;

import org.eclipse.bpel.model.BPELExtensibleElement;
import org.eclipse.bpel.model.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pointcut</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cn.edu.nju.cs.workflow.model.aspect.Pointcut#getName <em>Name</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.aspect.Pointcut#getLanguage <em>Language</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.aspect.Pointcut#getStartpoint <em>Startpoint</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.aspect.Pointcut#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.aspect.Pointcut#getPoint <em>Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see cn.edu.nju.cs.workflow.model.aspect.AspectPackage#getPointcut()
 * @model
 * @generated
 */
public interface Pointcut extends BPELExtensibleElement {
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
	 * @see cn.edu.nju.cs.workflow.model.aspect.AspectPackage#getPointcut_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.model.aspect.Pointcut#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see cn.edu.nju.cs.workflow.model.aspect.AspectPackage#getPointcut_Language()
	 * @model
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.model.aspect.Pointcut#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Startpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Startpoint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startpoint</em>' containment reference.
	 * @see #setStartpoint(Expression)
	 * @see cn.edu.nju.cs.workflow.model.aspect.AspectPackage#getPointcut_Startpoint()
	 * @model containment="true"
	 * @generated
	 */
	Expression getStartpoint();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.model.aspect.Pointcut#getStartpoint <em>Startpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startpoint</em>' containment reference.
	 * @see #getStartpoint()
	 * @generated
	 */
	void setStartpoint(Expression value);

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint</em>' containment reference.
	 * @see #setEndpoint(Expression)
	 * @see cn.edu.nju.cs.workflow.model.aspect.AspectPackage#getPointcut_Endpoint()
	 * @model containment="true"
	 * @generated
	 */
	Expression getEndpoint();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.model.aspect.Pointcut#getEndpoint <em>Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint</em>' containment reference.
	 * @see #getEndpoint()
	 * @generated
	 */
	void setEndpoint(Expression value);

	/**
	 * Returns the value of the '<em><b>Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point</em>' containment reference.
	 * @see #setPoint(Expression)
	 * @see cn.edu.nju.cs.workflow.model.aspect.AspectPackage#getPointcut_Point()
	 * @model containment="true"
	 * @generated
	 */
	Expression getPoint();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.model.aspect.Pointcut#getPoint <em>Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point</em>' containment reference.
	 * @see #getPoint()
	 * @generated
	 */
	void setPoint(Expression value);

} // Pointcut
