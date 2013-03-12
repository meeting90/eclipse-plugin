/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.nju.workflow.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Advice Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cn.edu.nju.workflow.model.AdviceTask#getJoinPoint <em>Join Point</em>}</li>
 *   <li>{@link cn.edu.nju.workflow.model.AdviceTask#getAdvicetype <em>Advicetype</em>}</li>
 * </ul>
 * </p>
 *
 * @see cn.edu.nju.workflow.model.ModelPackage#getAdviceTask()
 * @model
 * @generated
 */
public interface AdviceTask extends CompoundTask {
	/**
	 * Returns the value of the '<em><b>Join Point</b></em>' reference list.
	 * The list contents are of type {@link cn.edu.nju.workflow.model.WorkflowNode}.
	 * It is bidirectional and its opposite is '{@link cn.edu.nju.workflow.model.WorkflowNode#getPointCut <em>Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join Point</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Point</em>' reference list.
	 * @see cn.edu.nju.workflow.model.ModelPackage#getAdviceTask_JoinPoint()
	 * @see cn.edu.nju.workflow.model.WorkflowNode#getPointCut
	 * @model type="cn.edu.nju.workflow.model.WorkflowNode" opposite="pointCut" required="true"
	 * @generated
	 */
	EList getJoinPoint();

	/**
	 * Returns the value of the '<em><b>Advicetype</b></em>' attribute.
	 * The literals are from the enumeration {@link cn.edu.nju.workflow.model.AdviceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Advicetype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Advicetype</em>' attribute.
	 * @see cn.edu.nju.workflow.model.AdviceType
	 * @see #setAdvicetype(AdviceType)
	 * @see cn.edu.nju.workflow.model.ModelPackage#getAdviceTask_Advicetype()
	 * @model required="true"
	 * @generated
	 */
	AdviceType getAdvicetype();

	/**
	 * Sets the value of the '{@link cn.edu.nju.workflow.model.AdviceTask#getAdvicetype <em>Advicetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Advicetype</em>' attribute.
	 * @see cn.edu.nju.workflow.model.AdviceType
	 * @see #getAdvicetype()
	 * @generated
	 */
	void setAdvicetype(AdviceType value);

} // AdviceTask
