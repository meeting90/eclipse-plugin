/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.nju.cs.workflow.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Advice Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cn.edu.nju.cs.workflow.model.AdviceTask#getEdges <em>Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getAdviceTask()
 * @model
 * @generated
 */
public interface AdviceTask extends CompoundTask {
	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
	 * The list contents are of type {@link cn.edu.nju.cs.workflow.model.AdviceEdge}.
	 * It is bidirectional and its opposite is '{@link cn.edu.nju.cs.workflow.model.AdviceEdge#getAdviceTask <em>Advice Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference list.
	 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getAdviceTask_Edges()
	 * @see cn.edu.nju.cs.workflow.model.AdviceEdge#getAdviceTask
	 * @model opposite="adviceTask" containment="true"
	 * @generated
	 */
	EList<AdviceEdge> getEdges();

} // AdviceTask
