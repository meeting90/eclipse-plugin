/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.nju.cs.workflow.model.aspect;

import org.eclipse.bpel.model.BPELExtensibleElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pointcuts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cn.edu.nju.cs.workflow.model.aspect.Pointcuts#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see cn.edu.nju.cs.workflow.model.aspect.AspectPackage#getPointcuts()
 * @model
 * @generated
 */
public interface Pointcuts extends BPELExtensibleElement {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link cn.edu.nju.cs.workflow.model.aspect.Pointcut}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see cn.edu.nju.cs.workflow.model.aspect.AspectPackage#getPointcuts_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pointcut> getChildren();

} // Pointcuts
