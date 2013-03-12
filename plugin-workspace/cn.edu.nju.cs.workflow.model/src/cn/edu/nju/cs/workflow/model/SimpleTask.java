/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.nju.cs.workflow.model;

import org.eclipse.bpel.model.PartnerActivity;
import org.eclipse.bpel.model.PartnerLink;

import org.eclipse.wst.wsdl.Operation;
import org.eclipse.wst.wsdl.PortType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cn.edu.nju.cs.workflow.model.SimpleTask#getPorttype <em>Porttype</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.SimpleTask#getOperation <em>Operation</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.SimpleTask#getPartnerActivity <em>Partner Activity</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.SimpleTask#getPartnerLink <em>Partner Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getSimpleTask()
 * @model
 * @generated
 */
public interface SimpleTask extends Task {
	/**
	 * Returns the value of the '<em><b>Porttype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Porttype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Porttype</em>' reference.
	 * @see #setPorttype(PortType)
	 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getSimpleTask_Porttype()
	 * @model
	 * @generated
	 */
	PortType getPorttype();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.model.SimpleTask#getPorttype <em>Porttype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Porttype</em>' reference.
	 * @see #getPorttype()
	 * @generated
	 */
	void setPorttype(PortType value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(Operation)
	 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getSimpleTask_Operation()
	 * @model
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.model.SimpleTask#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

	/**
	 * Returns the value of the '<em><b>Partner Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partner Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partner Activity</em>' reference.
	 * @see #setPartnerActivity(PartnerActivity)
	 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getSimpleTask_PartnerActivity()
	 * @model
	 * @generated
	 */
	PartnerActivity getPartnerActivity();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.model.SimpleTask#getPartnerActivity <em>Partner Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partner Activity</em>' reference.
	 * @see #getPartnerActivity()
	 * @generated
	 */
	void setPartnerActivity(PartnerActivity value);

	/**
	 * Returns the value of the '<em><b>Partner Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partner Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partner Link</em>' reference.
	 * @see #setPartnerLink(PartnerLink)
	 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getSimpleTask_PartnerLink()
	 * @model
	 * @generated
	 */
	PartnerLink getPartnerLink();

	/**
	 * Sets the value of the '{@link cn.edu.nju.cs.workflow.model.SimpleTask#getPartnerLink <em>Partner Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partner Link</em>' reference.
	 * @see #getPartnerLink()
	 * @generated
	 */
	void setPartnerLink(PartnerLink value);

} // SimpleTask
