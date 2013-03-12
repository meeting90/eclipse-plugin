/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.nju.cs.workflow.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cn.edu.nju.cs.workflow.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "cs.nju.edu.cn";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cn.edu.nju.cs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = cn.edu.nju.cs.workflow.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link cn.edu.nju.cs.workflow.model.impl.WorkflowElementImpl <em>Workflow Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.nju.cs.workflow.model.impl.WorkflowElementImpl
	 * @see cn.edu.nju.cs.workflow.model.impl.ModelPackageImpl#getWorkflowElement()
	 * @generated
	 */
	int WORKFLOW_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_ELEMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_ELEMENT__COMMENT = 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_ELEMENT__WIDTH = 3;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_ELEMENT__HEIGHT = 4;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_ELEMENT__X = 5;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_ELEMENT__Y = 6;

	/**
	 * The number of structural features of the '<em>Workflow Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_ELEMENT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link cn.edu.nju.cs.workflow.model.impl.WorkflowProcessImpl <em>Workflow Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.nju.cs.workflow.model.impl.WorkflowProcessImpl
	 * @see cn.edu.nju.cs.workflow.model.impl.ModelPackageImpl#getWorkflowProcess()
	 * @generated
	 */
	int WORKFLOW_PROCESS = 1;

	/**
	 * The feature id for the '<em><b>Root Workflow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_PROCESS__ROOT_WORKFLOW = 0;

	/**
	 * The feature id for the '<em><b>Bpel Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_PROCESS__BPEL_PROCESS = 1;

	/**
	 * The number of structural features of the '<em>Workflow Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_PROCESS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link cn.edu.nju.cs.workflow.model.impl.WorkflowImpl <em>Workflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.nju.cs.workflow.model.impl.WorkflowImpl
	 * @see cn.edu.nju.cs.workflow.model.impl.ModelPackageImpl#getWorkflow()
	 * @generated
	 */
	int WORKFLOW = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__ID = WORKFLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__NAME = WORKFLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__COMMENT = WORKFLOW_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__WIDTH = WORKFLOW_ELEMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__HEIGHT = WORKFLOW_ELEMENT__HEIGHT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__X = WORKFLOW_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__Y = WORKFLOW_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__NODES = WORKFLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__EDGES = WORKFLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__COMMENTS = WORKFLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Port Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__PORT_TYPES = WORKFLOW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_FEATURE_COUNT = WORKFLOW_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link cn.edu.nju.cs.workflow.model.impl.WorkflowNodeImpl <em>Workflow Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.nju.cs.workflow.model.impl.WorkflowNodeImpl
	 * @see cn.edu.nju.cs.workflow.model.impl.ModelPackageImpl#getWorkflowNode()
	 * @generated
	 */
	int WORKFLOW_NODE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_NODE__ID = WORKFLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_NODE__NAME = WORKFLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_NODE__COMMENT = WORKFLOW_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_NODE__WIDTH = WORKFLOW_ELEMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_NODE__HEIGHT = WORKFLOW_ELEMENT__HEIGHT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_NODE__X = WORKFLOW_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_NODE__Y = WORKFLOW_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_NODE__WORKFLOW = WORKFLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_NODE__INPUT = WORKFLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_NODE__OUTPUTS = WORKFLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Advice Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_NODE__ADVICE_EDGES = WORKFLOW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Start Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_NODE__IS_START_NODE = WORKFLOW_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Finish Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_NODE__IS_FINISH_NODE = WORKFLOW_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Workflow Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_NODE_FEATURE_COUNT = WORKFLOW_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link cn.edu.nju.cs.workflow.model.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.nju.cs.workflow.model.impl.TaskImpl
	 * @see cn.edu.nju.cs.workflow.model.impl.ModelPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ID = WORKFLOW_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = WORKFLOW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__COMMENT = WORKFLOW_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__WIDTH = WORKFLOW_NODE__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__HEIGHT = WORKFLOW_NODE__HEIGHT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__X = WORKFLOW_NODE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__Y = WORKFLOW_NODE__Y;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__WORKFLOW = WORKFLOW_NODE__WORKFLOW;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__INPUT = WORKFLOW_NODE__INPUT;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OUTPUTS = WORKFLOW_NODE__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Advice Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ADVICE_EDGES = WORKFLOW_NODE__ADVICE_EDGES;

	/**
	 * The feature id for the '<em><b>Is Start Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IS_START_NODE = WORKFLOW_NODE__IS_START_NODE;

	/**
	 * The feature id for the '<em><b>Is Finish Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IS_FINISH_NODE = WORKFLOW_NODE__IS_FINISH_NODE;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = WORKFLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link cn.edu.nju.cs.workflow.model.impl.SimpleTaskImpl <em>Simple Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.nju.cs.workflow.model.impl.SimpleTaskImpl
	 * @see cn.edu.nju.cs.workflow.model.impl.ModelPackageImpl#getSimpleTask()
	 * @generated
	 */
	int SIMPLE_TASK = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TASK__ID = TASK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TASK__COMMENT = TASK__COMMENT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TASK__WIDTH = TASK__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TASK__HEIGHT = TASK__HEIGHT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TASK__X = TASK__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TASK__Y = TASK__Y;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TASK__WORKFLOW = TASK__WORKFLOW;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TASK__INPUT = TASK__INPUT;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TASK__OUTPUTS = TASK__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Advice Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TASK__ADVICE_EDGES = TASK__ADVICE_EDGES;

	/**
	 * The feature id for the '<em><b>Is Start Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TASK__IS_START_NODE = TASK__IS_START_NODE;

	/**
	 * The feature id for the '<em><b>Is Finish Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TASK__IS_FINISH_NODE = TASK__IS_FINISH_NODE;

	/**
	 * The feature id for the '<em><b>Porttype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TASK__PORTTYPE = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TASK__OPERATION = TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Partner Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TASK__PARTNER_ACTIVITY = TASK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Partner Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TASK__PARTNER_LINK = TASK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Simple Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link cn.edu.nju.cs.workflow.model.impl.CompoundTaskImpl <em>Compound Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.nju.cs.workflow.model.impl.CompoundTaskImpl
	 * @see cn.edu.nju.cs.workflow.model.impl.ModelPackageImpl#getCompoundTask()
	 * @generated
	 */
	int COMPOUND_TASK = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TASK__ID = TASK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TASK__COMMENT = TASK__COMMENT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TASK__WIDTH = TASK__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TASK__HEIGHT = TASK__HEIGHT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TASK__X = TASK__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TASK__Y = TASK__Y;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TASK__WORKFLOW = TASK__WORKFLOW;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TASK__INPUT = TASK__INPUT;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TASK__OUTPUTS = TASK__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Advice Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TASK__ADVICE_EDGES = TASK__ADVICE_EDGES;

	/**
	 * The feature id for the '<em><b>Is Start Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TASK__IS_START_NODE = TASK__IS_START_NODE;

	/**
	 * The feature id for the '<em><b>Is Finish Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TASK__IS_FINISH_NODE = TASK__IS_FINISH_NODE;

	/**
	 * The feature id for the '<em><b>Subworkflow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TASK__SUBWORKFLOW = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Compound Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link cn.edu.nju.cs.workflow.model.impl.LoopTaskImpl <em>Loop Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.nju.cs.workflow.model.impl.LoopTaskImpl
	 * @see cn.edu.nju.cs.workflow.model.impl.ModelPackageImpl#getLoopTask()
	 * @generated
	 */
	int LOOP_TASK = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_TASK__ID = COMPOUND_TASK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_TASK__NAME = COMPOUND_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_TASK__COMMENT = COMPOUND_TASK__COMMENT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_TASK__WIDTH = COMPOUND_TASK__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_TASK__HEIGHT = COMPOUND_TASK__HEIGHT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_TASK__X = COMPOUND_TASK__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_TASK__Y = COMPOUND_TASK__Y;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_TASK__WORKFLOW = COMPOUND_TASK__WORKFLOW;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_TASK__INPUT = COMPOUND_TASK__INPUT;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_TASK__OUTPUTS = COMPOUND_TASK__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Advice Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_TASK__ADVICE_EDGES = COMPOUND_TASK__ADVICE_EDGES;

	/**
	 * The feature id for the '<em><b>Is Start Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_TASK__IS_START_NODE = COMPOUND_TASK__IS_START_NODE;

	/**
	 * The feature id for the '<em><b>Is Finish Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_TASK__IS_FINISH_NODE = COMPOUND_TASK__IS_FINISH_NODE;

	/**
	 * The feature id for the '<em><b>Subworkflow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_TASK__SUBWORKFLOW = COMPOUND_TASK__SUBWORKFLOW;

	/**
	 * The feature id for the '<em><b>While Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_TASK__WHILE_CONDITION = COMPOUND_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Loop Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_TASK_FEATURE_COUNT = COMPOUND_TASK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link cn.edu.nju.cs.workflow.model.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.nju.cs.workflow.model.impl.ChoiceImpl
	 * @see cn.edu.nju.cs.workflow.model.impl.ModelPackageImpl#getChoice()
	 * @generated
	 */
	int CHOICE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__ID = WORKFLOW_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__NAME = WORKFLOW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__COMMENT = WORKFLOW_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__WIDTH = WORKFLOW_NODE__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__HEIGHT = WORKFLOW_NODE__HEIGHT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__X = WORKFLOW_NODE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__Y = WORKFLOW_NODE__Y;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__WORKFLOW = WORKFLOW_NODE__WORKFLOW;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__INPUT = WORKFLOW_NODE__INPUT;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__OUTPUTS = WORKFLOW_NODE__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Advice Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__ADVICE_EDGES = WORKFLOW_NODE__ADVICE_EDGES;

	/**
	 * The feature id for the '<em><b>Is Start Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__IS_START_NODE = WORKFLOW_NODE__IS_START_NODE;

	/**
	 * The feature id for the '<em><b>Is Finish Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__IS_FINISH_NODE = WORKFLOW_NODE__IS_FINISH_NODE;

	/**
	 * The number of structural features of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FEATURE_COUNT = WORKFLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link cn.edu.nju.cs.workflow.model.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.nju.cs.workflow.model.impl.EdgeImpl
	 * @see cn.edu.nju.cs.workflow.model.impl.ModelPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__ID = WORKFLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__NAME = WORKFLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__COMMENT = WORKFLOW_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__WIDTH = WORKFLOW_ELEMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__HEIGHT = WORKFLOW_ELEMENT__HEIGHT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__X = WORKFLOW_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__Y = WORKFLOW_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__WORKFLOW = WORKFLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__SOURCE = WORKFLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TARGET = WORKFLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = WORKFLOW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link cn.edu.nju.cs.workflow.model.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.nju.cs.workflow.model.impl.PortImpl
	 * @see cn.edu.nju.cs.workflow.model.impl.ModelPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__ID = WORKFLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = WORKFLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__COMMENT = WORKFLOW_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__WIDTH = WORKFLOW_ELEMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__HEIGHT = WORKFLOW_ELEMENT__HEIGHT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__X = WORKFLOW_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__Y = WORKFLOW_ELEMENT__Y;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = WORKFLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link cn.edu.nju.cs.workflow.model.impl.InputPortImpl <em>Input Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.nju.cs.workflow.model.impl.InputPortImpl
	 * @see cn.edu.nju.cs.workflow.model.impl.ModelPackageImpl#getInputPort()
	 * @generated
	 */
	int INPUT_PORT = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__ID = PORT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__COMMENT = PORT__COMMENT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__WIDTH = PORT__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__HEIGHT = PORT__HEIGHT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__X = PORT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__Y = PORT__Y;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__NODE = PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__EDGES = PORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__INPUT_VALUE = PORT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__ASSIGN = PORT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link cn.edu.nju.cs.workflow.model.impl.OutputPortImpl <em>Output Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.nju.cs.workflow.model.impl.OutputPortImpl
	 * @see cn.edu.nju.cs.workflow.model.impl.ModelPackageImpl#getOutputPort()
	 * @generated
	 */
	int OUTPUT_PORT = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__ID = PORT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__COMMENT = PORT__COMMENT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__WIDTH = PORT__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__HEIGHT = PORT__HEIGHT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__X = PORT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__Y = PORT__Y;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__NODE = PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__EDGES = PORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__OUTPUT_VALUE = PORT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link cn.edu.nju.cs.workflow.model.impl.FaultPortImpl <em>Fault Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.nju.cs.workflow.model.impl.FaultPortImpl
	 * @see cn.edu.nju.cs.workflow.model.impl.ModelPackageImpl#getFaultPort()
	 * @generated
	 */
	int FAULT_PORT = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_PORT__ID = OUTPUT_PORT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_PORT__NAME = OUTPUT_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_PORT__COMMENT = OUTPUT_PORT__COMMENT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_PORT__WIDTH = OUTPUT_PORT__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_PORT__HEIGHT = OUTPUT_PORT__HEIGHT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_PORT__X = OUTPUT_PORT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_PORT__Y = OUTPUT_PORT__Y;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_PORT__NODE = OUTPUT_PORT__NODE;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_PORT__EDGES = OUTPUT_PORT__EDGES;

	/**
	 * The feature id for the '<em><b>Output Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_PORT__OUTPUT_VALUE = OUTPUT_PORT__OUTPUT_VALUE;

	/**
	 * The number of structural features of the '<em>Fault Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_PORT_FEATURE_COUNT = OUTPUT_PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link cn.edu.nju.cs.workflow.model.impl.ConditionalOutputPortImpl <em>Conditional Output Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.nju.cs.workflow.model.impl.ConditionalOutputPortImpl
	 * @see cn.edu.nju.cs.workflow.model.impl.ModelPackageImpl#getConditionalOutputPort()
	 * @generated
	 */
	int CONDITIONAL_OUTPUT_PORT = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OUTPUT_PORT__ID = OUTPUT_PORT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OUTPUT_PORT__NAME = OUTPUT_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OUTPUT_PORT__COMMENT = OUTPUT_PORT__COMMENT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OUTPUT_PORT__WIDTH = OUTPUT_PORT__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OUTPUT_PORT__HEIGHT = OUTPUT_PORT__HEIGHT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OUTPUT_PORT__X = OUTPUT_PORT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OUTPUT_PORT__Y = OUTPUT_PORT__Y;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OUTPUT_PORT__NODE = OUTPUT_PORT__NODE;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OUTPUT_PORT__EDGES = OUTPUT_PORT__EDGES;

	/**
	 * The feature id for the '<em><b>Output Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OUTPUT_PORT__OUTPUT_VALUE = OUTPUT_PORT__OUTPUT_VALUE;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OUTPUT_PORT__CONDITION = OUTPUT_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conditional Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OUTPUT_PORT_FEATURE_COUNT = OUTPUT_PORT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link cn.edu.nju.cs.workflow.model.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.nju.cs.workflow.model.impl.CommentImpl
	 * @see cn.edu.nju.cs.workflow.model.impl.ModelPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 15;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link cn.edu.nju.cs.workflow.model.impl.AdviceTaskImpl <em>Advice Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.nju.cs.workflow.model.impl.AdviceTaskImpl
	 * @see cn.edu.nju.cs.workflow.model.impl.ModelPackageImpl#getAdviceTask()
	 * @generated
	 */
	int ADVICE_TASK = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_TASK__ID = COMPOUND_TASK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_TASK__NAME = COMPOUND_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_TASK__COMMENT = COMPOUND_TASK__COMMENT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_TASK__WIDTH = COMPOUND_TASK__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_TASK__HEIGHT = COMPOUND_TASK__HEIGHT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_TASK__X = COMPOUND_TASK__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_TASK__Y = COMPOUND_TASK__Y;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_TASK__WORKFLOW = COMPOUND_TASK__WORKFLOW;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_TASK__INPUT = COMPOUND_TASK__INPUT;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_TASK__OUTPUTS = COMPOUND_TASK__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Advice Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_TASK__ADVICE_EDGES = COMPOUND_TASK__ADVICE_EDGES;

	/**
	 * The feature id for the '<em><b>Is Start Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_TASK__IS_START_NODE = COMPOUND_TASK__IS_START_NODE;

	/**
	 * The feature id for the '<em><b>Is Finish Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_TASK__IS_FINISH_NODE = COMPOUND_TASK__IS_FINISH_NODE;

	/**
	 * The feature id for the '<em><b>Subworkflow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_TASK__SUBWORKFLOW = COMPOUND_TASK__SUBWORKFLOW;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_TASK__EDGES = COMPOUND_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Advice Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_TASK_FEATURE_COUNT = COMPOUND_TASK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link cn.edu.nju.cs.workflow.model.impl.AdviceEdgeImpl <em>Advice Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.nju.cs.workflow.model.impl.AdviceEdgeImpl
	 * @see cn.edu.nju.cs.workflow.model.impl.ModelPackageImpl#getAdviceEdge()
	 * @generated
	 */
	int ADVICE_EDGE = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_EDGE__ID = WORKFLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_EDGE__NAME = WORKFLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_EDGE__COMMENT = WORKFLOW_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_EDGE__WIDTH = WORKFLOW_ELEMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_EDGE__HEIGHT = WORKFLOW_ELEMENT__HEIGHT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_EDGE__X = WORKFLOW_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_EDGE__Y = WORKFLOW_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Advice Task</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_EDGE__ADVICE_TASK = WORKFLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Join Point</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_EDGE__JOIN_POINT = WORKFLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Advicetype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_EDGE__ADVICETYPE = WORKFLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Advice Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_EDGE_FEATURE_COUNT = WORKFLOW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link cn.edu.nju.cs.workflow.model.impl.WhileConditionImpl <em>While Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.nju.cs.workflow.model.impl.WhileConditionImpl
	 * @see cn.edu.nju.cs.workflow.model.impl.ModelPackageImpl#getWhileCondition()
	 * @generated
	 */
	int WHILE_CONDITION = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_CONDITION__ID = WORKFLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_CONDITION__NAME = WORKFLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_CONDITION__COMMENT = WORKFLOW_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_CONDITION__WIDTH = WORKFLOW_ELEMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_CONDITION__HEIGHT = WORKFLOW_ELEMENT__HEIGHT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_CONDITION__X = WORKFLOW_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_CONDITION__Y = WORKFLOW_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Looptask</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_CONDITION__LOOPTASK = WORKFLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_CONDITION__CONDITION = WORKFLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>While Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_CONDITION_FEATURE_COUNT = WORKFLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link cn.edu.nju.cs.workflow.model.AdviceType <em>Advice Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.nju.cs.workflow.model.AdviceType
	 * @see cn.edu.nju.cs.workflow.model.impl.ModelPackageImpl#getAdviceType()
	 * @generated
	 */
	int ADVICE_TYPE = 19;


	/**
	 * Returns the meta object for class '{@link cn.edu.nju.cs.workflow.model.WorkflowElement <em>Workflow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Element</em>'.
	 * @see cn.edu.nju.cs.workflow.model.WorkflowElement
	 * @generated
	 */
	EClass getWorkflowElement();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.nju.cs.workflow.model.WorkflowElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see cn.edu.nju.cs.workflow.model.WorkflowElement#getId()
	 * @see #getWorkflowElement()
	 * @generated
	 */
	EAttribute getWorkflowElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.nju.cs.workflow.model.WorkflowElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cn.edu.nju.cs.workflow.model.WorkflowElement#getName()
	 * @see #getWorkflowElement()
	 * @generated
	 */
	EAttribute getWorkflowElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.nju.cs.workflow.model.WorkflowElement#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see cn.edu.nju.cs.workflow.model.WorkflowElement#getComment()
	 * @see #getWorkflowElement()
	 * @generated
	 */
	EAttribute getWorkflowElement_Comment();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.nju.cs.workflow.model.WorkflowElement#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see cn.edu.nju.cs.workflow.model.WorkflowElement#getWidth()
	 * @see #getWorkflowElement()
	 * @generated
	 */
	EAttribute getWorkflowElement_Width();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.nju.cs.workflow.model.WorkflowElement#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see cn.edu.nju.cs.workflow.model.WorkflowElement#getHeight()
	 * @see #getWorkflowElement()
	 * @generated
	 */
	EAttribute getWorkflowElement_Height();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.nju.cs.workflow.model.WorkflowElement#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see cn.edu.nju.cs.workflow.model.WorkflowElement#getX()
	 * @see #getWorkflowElement()
	 * @generated
	 */
	EAttribute getWorkflowElement_X();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.nju.cs.workflow.model.WorkflowElement#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see cn.edu.nju.cs.workflow.model.WorkflowElement#getY()
	 * @see #getWorkflowElement()
	 * @generated
	 */
	EAttribute getWorkflowElement_Y();

	/**
	 * Returns the meta object for class '{@link cn.edu.nju.cs.workflow.model.WorkflowProcess <em>Workflow Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Process</em>'.
	 * @see cn.edu.nju.cs.workflow.model.WorkflowProcess
	 * @generated
	 */
	EClass getWorkflowProcess();

	/**
	 * Returns the meta object for the containment reference '{@link cn.edu.nju.cs.workflow.model.WorkflowProcess#getRootWorkflow <em>Root Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root Workflow</em>'.
	 * @see cn.edu.nju.cs.workflow.model.WorkflowProcess#getRootWorkflow()
	 * @see #getWorkflowProcess()
	 * @generated
	 */
	EReference getWorkflowProcess_RootWorkflow();

	/**
	 * Returns the meta object for the reference '{@link cn.edu.nju.cs.workflow.model.WorkflowProcess#getBpelProcess <em>Bpel Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bpel Process</em>'.
	 * @see cn.edu.nju.cs.workflow.model.WorkflowProcess#getBpelProcess()
	 * @see #getWorkflowProcess()
	 * @generated
	 */
	EReference getWorkflowProcess_BpelProcess();

	/**
	 * Returns the meta object for class '{@link cn.edu.nju.cs.workflow.model.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow</em>'.
	 * @see cn.edu.nju.cs.workflow.model.Workflow
	 * @generated
	 */
	EClass getWorkflow();

	/**
	 * Returns the meta object for the containment reference list '{@link cn.edu.nju.cs.workflow.model.Workflow#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see cn.edu.nju.cs.workflow.model.Workflow#getNodes()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link cn.edu.nju.cs.workflow.model.Workflow#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edges</em>'.
	 * @see cn.edu.nju.cs.workflow.model.Workflow#getEdges()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Edges();

	/**
	 * Returns the meta object for the reference list '{@link cn.edu.nju.cs.workflow.model.Workflow#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Comments</em>'.
	 * @see cn.edu.nju.cs.workflow.model.Workflow#getComments()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Comments();

	/**
	 * Returns the meta object for the containment reference list '{@link cn.edu.nju.cs.workflow.model.Workflow#getPortTypes <em>Port Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Types</em>'.
	 * @see cn.edu.nju.cs.workflow.model.Workflow#getPortTypes()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_PortTypes();

	/**
	 * Returns the meta object for class '{@link cn.edu.nju.cs.workflow.model.WorkflowNode <em>Workflow Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Node</em>'.
	 * @see cn.edu.nju.cs.workflow.model.WorkflowNode
	 * @generated
	 */
	EClass getWorkflowNode();

	/**
	 * Returns the meta object for the container reference '{@link cn.edu.nju.cs.workflow.model.WorkflowNode#getWorkflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Workflow</em>'.
	 * @see cn.edu.nju.cs.workflow.model.WorkflowNode#getWorkflow()
	 * @see #getWorkflowNode()
	 * @generated
	 */
	EReference getWorkflowNode_Workflow();

	/**
	 * Returns the meta object for the containment reference '{@link cn.edu.nju.cs.workflow.model.WorkflowNode#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input</em>'.
	 * @see cn.edu.nju.cs.workflow.model.WorkflowNode#getInput()
	 * @see #getWorkflowNode()
	 * @generated
	 */
	EReference getWorkflowNode_Input();

	/**
	 * Returns the meta object for the containment reference list '{@link cn.edu.nju.cs.workflow.model.WorkflowNode#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see cn.edu.nju.cs.workflow.model.WorkflowNode#getOutputs()
	 * @see #getWorkflowNode()
	 * @generated
	 */
	EReference getWorkflowNode_Outputs();

	/**
	 * Returns the meta object for the containment reference list '{@link cn.edu.nju.cs.workflow.model.WorkflowNode#getAdviceEdges <em>Advice Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Advice Edges</em>'.
	 * @see cn.edu.nju.cs.workflow.model.WorkflowNode#getAdviceEdges()
	 * @see #getWorkflowNode()
	 * @generated
	 */
	EReference getWorkflowNode_AdviceEdges();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.nju.cs.workflow.model.WorkflowNode#isIsStartNode <em>Is Start Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Start Node</em>'.
	 * @see cn.edu.nju.cs.workflow.model.WorkflowNode#isIsStartNode()
	 * @see #getWorkflowNode()
	 * @generated
	 */
	EAttribute getWorkflowNode_IsStartNode();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.nju.cs.workflow.model.WorkflowNode#isIsFinishNode <em>Is Finish Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Finish Node</em>'.
	 * @see cn.edu.nju.cs.workflow.model.WorkflowNode#isIsFinishNode()
	 * @see #getWorkflowNode()
	 * @generated
	 */
	EAttribute getWorkflowNode_IsFinishNode();

	/**
	 * Returns the meta object for class '{@link cn.edu.nju.cs.workflow.model.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see cn.edu.nju.cs.workflow.model.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for class '{@link cn.edu.nju.cs.workflow.model.SimpleTask <em>Simple Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Task</em>'.
	 * @see cn.edu.nju.cs.workflow.model.SimpleTask
	 * @generated
	 */
	EClass getSimpleTask();

	/**
	 * Returns the meta object for the reference '{@link cn.edu.nju.cs.workflow.model.SimpleTask#getPorttype <em>Porttype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Porttype</em>'.
	 * @see cn.edu.nju.cs.workflow.model.SimpleTask#getPorttype()
	 * @see #getSimpleTask()
	 * @generated
	 */
	EReference getSimpleTask_Porttype();

	/**
	 * Returns the meta object for the reference '{@link cn.edu.nju.cs.workflow.model.SimpleTask#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see cn.edu.nju.cs.workflow.model.SimpleTask#getOperation()
	 * @see #getSimpleTask()
	 * @generated
	 */
	EReference getSimpleTask_Operation();

	/**
	 * Returns the meta object for the reference '{@link cn.edu.nju.cs.workflow.model.SimpleTask#getPartnerActivity <em>Partner Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Partner Activity</em>'.
	 * @see cn.edu.nju.cs.workflow.model.SimpleTask#getPartnerActivity()
	 * @see #getSimpleTask()
	 * @generated
	 */
	EReference getSimpleTask_PartnerActivity();

	/**
	 * Returns the meta object for the reference '{@link cn.edu.nju.cs.workflow.model.SimpleTask#getPartnerLink <em>Partner Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Partner Link</em>'.
	 * @see cn.edu.nju.cs.workflow.model.SimpleTask#getPartnerLink()
	 * @see #getSimpleTask()
	 * @generated
	 */
	EReference getSimpleTask_PartnerLink();

	/**
	 * Returns the meta object for class '{@link cn.edu.nju.cs.workflow.model.CompoundTask <em>Compound Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound Task</em>'.
	 * @see cn.edu.nju.cs.workflow.model.CompoundTask
	 * @generated
	 */
	EClass getCompoundTask();

	/**
	 * Returns the meta object for the containment reference '{@link cn.edu.nju.cs.workflow.model.CompoundTask#getSubworkflow <em>Subworkflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subworkflow</em>'.
	 * @see cn.edu.nju.cs.workflow.model.CompoundTask#getSubworkflow()
	 * @see #getCompoundTask()
	 * @generated
	 */
	EReference getCompoundTask_Subworkflow();

	/**
	 * Returns the meta object for class '{@link cn.edu.nju.cs.workflow.model.LoopTask <em>Loop Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Task</em>'.
	 * @see cn.edu.nju.cs.workflow.model.LoopTask
	 * @generated
	 */
	EClass getLoopTask();

	/**
	 * Returns the meta object for the containment reference '{@link cn.edu.nju.cs.workflow.model.LoopTask#getWhileCondition <em>While Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>While Condition</em>'.
	 * @see cn.edu.nju.cs.workflow.model.LoopTask#getWhileCondition()
	 * @see #getLoopTask()
	 * @generated
	 */
	EReference getLoopTask_WhileCondition();

	/**
	 * Returns the meta object for class '{@link cn.edu.nju.cs.workflow.model.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see cn.edu.nju.cs.workflow.model.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for class '{@link cn.edu.nju.cs.workflow.model.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see cn.edu.nju.cs.workflow.model.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the container reference '{@link cn.edu.nju.cs.workflow.model.Edge#getWorkflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Workflow</em>'.
	 * @see cn.edu.nju.cs.workflow.model.Edge#getWorkflow()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Workflow();

	/**
	 * Returns the meta object for the reference '{@link cn.edu.nju.cs.workflow.model.Edge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see cn.edu.nju.cs.workflow.model.Edge#getSource()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Source();

	/**
	 * Returns the meta object for the reference '{@link cn.edu.nju.cs.workflow.model.Edge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see cn.edu.nju.cs.workflow.model.Edge#getTarget()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Target();

	/**
	 * Returns the meta object for class '{@link cn.edu.nju.cs.workflow.model.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see cn.edu.nju.cs.workflow.model.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for class '{@link cn.edu.nju.cs.workflow.model.InputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Port</em>'.
	 * @see cn.edu.nju.cs.workflow.model.InputPort
	 * @generated
	 */
	EClass getInputPort();

	/**
	 * Returns the meta object for the reference '{@link cn.edu.nju.cs.workflow.model.InputPort#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see cn.edu.nju.cs.workflow.model.InputPort#getNode()
	 * @see #getInputPort()
	 * @generated
	 */
	EReference getInputPort_Node();

	/**
	 * Returns the meta object for the reference list '{@link cn.edu.nju.cs.workflow.model.InputPort#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Edges</em>'.
	 * @see cn.edu.nju.cs.workflow.model.InputPort#getEdges()
	 * @see #getInputPort()
	 * @generated
	 */
	EReference getInputPort_Edges();

	/**
	 * Returns the meta object for the reference '{@link cn.edu.nju.cs.workflow.model.InputPort#getInputValue <em>Input Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Value</em>'.
	 * @see cn.edu.nju.cs.workflow.model.InputPort#getInputValue()
	 * @see #getInputPort()
	 * @generated
	 */
	EReference getInputPort_InputValue();

	/**
	 * Returns the meta object for the reference '{@link cn.edu.nju.cs.workflow.model.InputPort#getAssign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assign</em>'.
	 * @see cn.edu.nju.cs.workflow.model.InputPort#getAssign()
	 * @see #getInputPort()
	 * @generated
	 */
	EReference getInputPort_Assign();

	/**
	 * Returns the meta object for class '{@link cn.edu.nju.cs.workflow.model.OutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Port</em>'.
	 * @see cn.edu.nju.cs.workflow.model.OutputPort
	 * @generated
	 */
	EClass getOutputPort();

	/**
	 * Returns the meta object for the reference '{@link cn.edu.nju.cs.workflow.model.OutputPort#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see cn.edu.nju.cs.workflow.model.OutputPort#getNode()
	 * @see #getOutputPort()
	 * @generated
	 */
	EReference getOutputPort_Node();

	/**
	 * Returns the meta object for the reference list '{@link cn.edu.nju.cs.workflow.model.OutputPort#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Edges</em>'.
	 * @see cn.edu.nju.cs.workflow.model.OutputPort#getEdges()
	 * @see #getOutputPort()
	 * @generated
	 */
	EReference getOutputPort_Edges();

	/**
	 * Returns the meta object for the reference '{@link cn.edu.nju.cs.workflow.model.OutputPort#getOutputValue <em>Output Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Value</em>'.
	 * @see cn.edu.nju.cs.workflow.model.OutputPort#getOutputValue()
	 * @see #getOutputPort()
	 * @generated
	 */
	EReference getOutputPort_OutputValue();

	/**
	 * Returns the meta object for class '{@link cn.edu.nju.cs.workflow.model.FaultPort <em>Fault Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fault Port</em>'.
	 * @see cn.edu.nju.cs.workflow.model.FaultPort
	 * @generated
	 */
	EClass getFaultPort();

	/**
	 * Returns the meta object for class '{@link cn.edu.nju.cs.workflow.model.ConditionalOutputPort <em>Conditional Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Output Port</em>'.
	 * @see cn.edu.nju.cs.workflow.model.ConditionalOutputPort
	 * @generated
	 */
	EClass getConditionalOutputPort();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.nju.cs.workflow.model.ConditionalOutputPort#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see cn.edu.nju.cs.workflow.model.ConditionalOutputPort#getCondition()
	 * @see #getConditionalOutputPort()
	 * @generated
	 */
	EAttribute getConditionalOutputPort_Condition();

	/**
	 * Returns the meta object for class '{@link cn.edu.nju.cs.workflow.model.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see cn.edu.nju.cs.workflow.model.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for class '{@link cn.edu.nju.cs.workflow.model.AdviceTask <em>Advice Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advice Task</em>'.
	 * @see cn.edu.nju.cs.workflow.model.AdviceTask
	 * @generated
	 */
	EClass getAdviceTask();

	/**
	 * Returns the meta object for the containment reference list '{@link cn.edu.nju.cs.workflow.model.AdviceTask#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edges</em>'.
	 * @see cn.edu.nju.cs.workflow.model.AdviceTask#getEdges()
	 * @see #getAdviceTask()
	 * @generated
	 */
	EReference getAdviceTask_Edges();

	/**
	 * Returns the meta object for class '{@link cn.edu.nju.cs.workflow.model.AdviceEdge <em>Advice Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advice Edge</em>'.
	 * @see cn.edu.nju.cs.workflow.model.AdviceEdge
	 * @generated
	 */
	EClass getAdviceEdge();

	/**
	 * Returns the meta object for the container reference '{@link cn.edu.nju.cs.workflow.model.AdviceEdge#getAdviceTask <em>Advice Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Advice Task</em>'.
	 * @see cn.edu.nju.cs.workflow.model.AdviceEdge#getAdviceTask()
	 * @see #getAdviceEdge()
	 * @generated
	 */
	EReference getAdviceEdge_AdviceTask();

	/**
	 * Returns the meta object for the container reference '{@link cn.edu.nju.cs.workflow.model.AdviceEdge#getJoinPoint <em>Join Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Join Point</em>'.
	 * @see cn.edu.nju.cs.workflow.model.AdviceEdge#getJoinPoint()
	 * @see #getAdviceEdge()
	 * @generated
	 */
	EReference getAdviceEdge_JoinPoint();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.nju.cs.workflow.model.AdviceEdge#getAdvicetype <em>Advicetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Advicetype</em>'.
	 * @see cn.edu.nju.cs.workflow.model.AdviceEdge#getAdvicetype()
	 * @see #getAdviceEdge()
	 * @generated
	 */
	EAttribute getAdviceEdge_Advicetype();

	/**
	 * Returns the meta object for class '{@link cn.edu.nju.cs.workflow.model.WhileCondition <em>While Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While Condition</em>'.
	 * @see cn.edu.nju.cs.workflow.model.WhileCondition
	 * @generated
	 */
	EClass getWhileCondition();

	/**
	 * Returns the meta object for the container reference '{@link cn.edu.nju.cs.workflow.model.WhileCondition#getLooptask <em>Looptask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Looptask</em>'.
	 * @see cn.edu.nju.cs.workflow.model.WhileCondition#getLooptask()
	 * @see #getWhileCondition()
	 * @generated
	 */
	EReference getWhileCondition_Looptask();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.nju.cs.workflow.model.WhileCondition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see cn.edu.nju.cs.workflow.model.WhileCondition#getCondition()
	 * @see #getWhileCondition()
	 * @generated
	 */
	EAttribute getWhileCondition_Condition();

	/**
	 * Returns the meta object for enum '{@link cn.edu.nju.cs.workflow.model.AdviceType <em>Advice Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Advice Type</em>'.
	 * @see cn.edu.nju.cs.workflow.model.AdviceType
	 * @generated
	 */
	EEnum getAdviceType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link cn.edu.nju.cs.workflow.model.impl.WorkflowElementImpl <em>Workflow Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.nju.cs.workflow.model.impl.WorkflowElementImpl
		 * @see cn.edu.nju.cs.workflow.model.impl.ModelPackageImpl#getWorkflowElement()
		 * @generated
		 */
		EClass WORKFLOW_ELEMENT = eINSTANCE.getWorkflowElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW_ELEMENT__ID = eINSTANCE.getWorkflowElement_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW_ELEMENT__NAME = eINSTANCE.getWorkflowElement_Name();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW_ELEMENT__COMMENT = eINSTANCE.getWorkflowElement_Comment();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW_ELEMENT__WIDTH = eINSTANCE.getWorkflowElement_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW_ELEMENT__HEIGHT = eINSTANCE.getWorkflowElement_Height();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW_ELEMENT__X = eINSTANCE.getWorkflowElement_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW_ELEMENT__Y = eINSTANCE.getWorkflowElement_Y();

		/**
		 * The meta object literal for the '{@link cn.edu.nju.cs.workflow.model.impl.WorkflowProcessImpl <em>Workflow Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.nju.cs.workflow.model.impl.WorkflowProcessImpl
		 * @see cn.edu.nju.cs.workflow.model.impl.ModelPackageImpl#getWorkflowProcess()
		 * @generated
		 */
		EClass WORKFLOW_PROCESS = eINSTANCE.getWorkflowProcess();

		/**
		 * The meta object literal for the '<em><b>Root Workflow</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_PROCESS__ROOT_WORKFLOW = eINSTANCE.getWorkflowProcess_RootWorkflow();

		/**
		 * The meta object literal for the '<em><b>Bpel Process</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_PROCESS__BPEL_PROCESS = eINSTANCE.getWorkflowProcess_BpelProcess();

		/**
		 * The meta object literal for the '{@link cn.edu.nju.cs.workflow.model.impl.WorkflowImpl <em>Workflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.nju.cs.workflow.model.impl.WorkflowImpl
		 * @see cn.edu.nju.cs.workflow.model.impl.ModelPackageImpl#getWorkflow()
		 * @generated
		 */
		EClass WORKFLOW = eINSTANCE.getWorkflow();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__NODES = eINSTANCE.getWorkflow_Nodes();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__EDGES = eINSTANCE.getWorkflow_Edges();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__COMMENTS = eINSTANCE.getWorkflow_Comments();

		/**
		 * The meta object literal for the '<em><b>Port Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__PORT_TYPES = eINSTANCE.getWorkflow_PortTypes();

		/**
		 * The meta object literal for the '{@link cn.edu.nju.cs.workflow.model.impl.WorkflowNodeImpl <em>Workflow Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.nju.cs.workflow.model.impl.WorkflowNodeImpl
		 * @see cn.edu.nju.cs.workflow.model.impl.ModelPackageImpl#getWorkflowNode()
		 * @generated
		 */
		EClass WORKFLOW_NODE = eINSTANCE.getWorkflowNode();

		/**
		 * The meta object literal for the '<em><b>Workflow</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_NODE__WORKFLOW = eINSTANCE.getWorkflowNode_Workflow();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_NODE__INPUT = eINSTANCE.getWorkflowNode_Input();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_NODE__OUTPUTS = eINSTANCE.getWorkflowNode_Outputs();

		/**
		 * The meta object literal for the '<em><b>Advice Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_NODE__ADVICE_EDGES = eINSTANCE.getWorkflowNode_AdviceEdges();

		/**
		 * The meta object literal for the '<em><b>Is Start Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW_NODE__IS_START_NODE = eINSTANCE.getWorkflowNode_IsStartNode();

		/**
		 * The meta object literal for the '<em><b>Is Finish Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW_NODE__IS_FINISH_NODE = eINSTANCE.getWorkflowNode_IsFinishNode();

		/**
		 * The meta object literal for the '{@link cn.edu.nju.cs.workflow.model.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.nju.cs.workflow.model.impl.TaskImpl
		 * @see cn.edu.nju.cs.workflow.model.impl.ModelPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '{@link cn.edu.nju.cs.workflow.model.impl.SimpleTaskImpl <em>Simple Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.nju.cs.workflow.model.impl.SimpleTaskImpl
		 * @see cn.edu.nju.cs.workflow.model.impl.ModelPackageImpl#getSimpleTask()
		 * @generated
		 */
		EClass SIMPLE_TASK = eINSTANCE.getSimpleTask();

		/**
		 * The meta object literal for the '<em><b>Porttype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_TASK__PORTTYPE = eINSTANCE.getSimpleTask_Porttype();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_TASK__OPERATION = eINSTANCE.getSimpleTask_Operation();

		/**
		 * The meta object literal for the '<em><b>Partner Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_TASK__PARTNER_ACTIVITY = eINSTANCE.getSimpleTask_PartnerActivity();

		/**
		 * The meta object literal for the '<em><b>Partner Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_TASK__PARTNER_LINK = eINSTANCE.getSimpleTask_PartnerLink();

		/**
		 * The meta object literal for the '{@link cn.edu.nju.cs.workflow.model.impl.CompoundTaskImpl <em>Compound Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.nju.cs.workflow.model.impl.CompoundTaskImpl
		 * @see cn.edu.nju.cs.workflow.model.impl.ModelPackageImpl#getCompoundTask()
		 * @generated
		 */
		EClass COMPOUND_TASK = eINSTANCE.getCompoundTask();

		/**
		 * The meta object literal for the '<em><b>Subworkflow</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_TASK__SUBWORKFLOW = eINSTANCE.getCompoundTask_Subworkflow();

		/**
		 * The meta object literal for the '{@link cn.edu.nju.cs.workflow.model.impl.LoopTaskImpl <em>Loop Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.nju.cs.workflow.model.impl.LoopTaskImpl
		 * @see cn.edu.nju.cs.workflow.model.impl.ModelPackageImpl#getLoopTask()
		 * @generated
		 */
		EClass LOOP_TASK = eINSTANCE.getLoopTask();

		/**
		 * The meta object literal for the '<em><b>While Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_TASK__WHILE_CONDITION = eINSTANCE.getLoopTask_WhileCondition();

		/**
		 * The meta object literal for the '{@link cn.edu.nju.cs.workflow.model.impl.ChoiceImpl <em>Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.nju.cs.workflow.model.impl.ChoiceImpl
		 * @see cn.edu.nju.cs.workflow.model.impl.ModelPackageImpl#getChoice()
		 * @generated
		 */
		EClass CHOICE = eINSTANCE.getChoice();

		/**
		 * The meta object literal for the '{@link cn.edu.nju.cs.workflow.model.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.nju.cs.workflow.model.impl.EdgeImpl
		 * @see cn.edu.nju.cs.workflow.model.impl.ModelPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Workflow</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__WORKFLOW = eINSTANCE.getEdge_Workflow();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__SOURCE = eINSTANCE.getEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__TARGET = eINSTANCE.getEdge_Target();

		/**
		 * The meta object literal for the '{@link cn.edu.nju.cs.workflow.model.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.nju.cs.workflow.model.impl.PortImpl
		 * @see cn.edu.nju.cs.workflow.model.impl.ModelPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '{@link cn.edu.nju.cs.workflow.model.impl.InputPortImpl <em>Input Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.nju.cs.workflow.model.impl.InputPortImpl
		 * @see cn.edu.nju.cs.workflow.model.impl.ModelPackageImpl#getInputPort()
		 * @generated
		 */
		EClass INPUT_PORT = eINSTANCE.getInputPort();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PORT__NODE = eINSTANCE.getInputPort_Node();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PORT__EDGES = eINSTANCE.getInputPort_Edges();

		/**
		 * The meta object literal for the '<em><b>Input Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PORT__INPUT_VALUE = eINSTANCE.getInputPort_InputValue();

		/**
		 * The meta object literal for the '<em><b>Assign</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PORT__ASSIGN = eINSTANCE.getInputPort_Assign();

		/**
		 * The meta object literal for the '{@link cn.edu.nju.cs.workflow.model.impl.OutputPortImpl <em>Output Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.nju.cs.workflow.model.impl.OutputPortImpl
		 * @see cn.edu.nju.cs.workflow.model.impl.ModelPackageImpl#getOutputPort()
		 * @generated
		 */
		EClass OUTPUT_PORT = eINSTANCE.getOutputPort();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PORT__NODE = eINSTANCE.getOutputPort_Node();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PORT__EDGES = eINSTANCE.getOutputPort_Edges();

		/**
		 * The meta object literal for the '<em><b>Output Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PORT__OUTPUT_VALUE = eINSTANCE.getOutputPort_OutputValue();

		/**
		 * The meta object literal for the '{@link cn.edu.nju.cs.workflow.model.impl.FaultPortImpl <em>Fault Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.nju.cs.workflow.model.impl.FaultPortImpl
		 * @see cn.edu.nju.cs.workflow.model.impl.ModelPackageImpl#getFaultPort()
		 * @generated
		 */
		EClass FAULT_PORT = eINSTANCE.getFaultPort();

		/**
		 * The meta object literal for the '{@link cn.edu.nju.cs.workflow.model.impl.ConditionalOutputPortImpl <em>Conditional Output Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.nju.cs.workflow.model.impl.ConditionalOutputPortImpl
		 * @see cn.edu.nju.cs.workflow.model.impl.ModelPackageImpl#getConditionalOutputPort()
		 * @generated
		 */
		EClass CONDITIONAL_OUTPUT_PORT = eINSTANCE.getConditionalOutputPort();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITIONAL_OUTPUT_PORT__CONDITION = eINSTANCE.getConditionalOutputPort_Condition();

		/**
		 * The meta object literal for the '{@link cn.edu.nju.cs.workflow.model.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.nju.cs.workflow.model.impl.CommentImpl
		 * @see cn.edu.nju.cs.workflow.model.impl.ModelPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '{@link cn.edu.nju.cs.workflow.model.impl.AdviceTaskImpl <em>Advice Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.nju.cs.workflow.model.impl.AdviceTaskImpl
		 * @see cn.edu.nju.cs.workflow.model.impl.ModelPackageImpl#getAdviceTask()
		 * @generated
		 */
		EClass ADVICE_TASK = eINSTANCE.getAdviceTask();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADVICE_TASK__EDGES = eINSTANCE.getAdviceTask_Edges();

		/**
		 * The meta object literal for the '{@link cn.edu.nju.cs.workflow.model.impl.AdviceEdgeImpl <em>Advice Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.nju.cs.workflow.model.impl.AdviceEdgeImpl
		 * @see cn.edu.nju.cs.workflow.model.impl.ModelPackageImpl#getAdviceEdge()
		 * @generated
		 */
		EClass ADVICE_EDGE = eINSTANCE.getAdviceEdge();

		/**
		 * The meta object literal for the '<em><b>Advice Task</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADVICE_EDGE__ADVICE_TASK = eINSTANCE.getAdviceEdge_AdviceTask();

		/**
		 * The meta object literal for the '<em><b>Join Point</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADVICE_EDGE__JOIN_POINT = eINSTANCE.getAdviceEdge_JoinPoint();

		/**
		 * The meta object literal for the '<em><b>Advicetype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADVICE_EDGE__ADVICETYPE = eINSTANCE.getAdviceEdge_Advicetype();

		/**
		 * The meta object literal for the '{@link cn.edu.nju.cs.workflow.model.impl.WhileConditionImpl <em>While Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.nju.cs.workflow.model.impl.WhileConditionImpl
		 * @see cn.edu.nju.cs.workflow.model.impl.ModelPackageImpl#getWhileCondition()
		 * @generated
		 */
		EClass WHILE_CONDITION = eINSTANCE.getWhileCondition();

		/**
		 * The meta object literal for the '<em><b>Looptask</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_CONDITION__LOOPTASK = eINSTANCE.getWhileCondition_Looptask();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHILE_CONDITION__CONDITION = eINSTANCE.getWhileCondition_Condition();

		/**
		 * The meta object literal for the '{@link cn.edu.nju.cs.workflow.model.AdviceType <em>Advice Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.nju.cs.workflow.model.AdviceType
		 * @see cn.edu.nju.cs.workflow.model.impl.ModelPackageImpl#getAdviceType()
		 * @generated
		 */
		EEnum ADVICE_TYPE = eINSTANCE.getAdviceType();

	}

} //ModelPackage
