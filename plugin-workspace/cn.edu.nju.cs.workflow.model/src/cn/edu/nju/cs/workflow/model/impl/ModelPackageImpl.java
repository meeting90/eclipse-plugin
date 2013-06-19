/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.nju.cs.workflow.model.impl;

import cn.edu.nju.cs.workflow.model.AdviceEdge;
import cn.edu.nju.cs.workflow.model.AdviceTask;
import cn.edu.nju.cs.workflow.model.AdviceType;
import cn.edu.nju.cs.workflow.model.Choice;
import cn.edu.nju.cs.workflow.model.Comment;
import cn.edu.nju.cs.workflow.model.CompoundTask;
import cn.edu.nju.cs.workflow.model.ConditionalOutputPort;
import cn.edu.nju.cs.workflow.model.Edge;
import cn.edu.nju.cs.workflow.model.FaultPort;
import cn.edu.nju.cs.workflow.model.InputPort;
import cn.edu.nju.cs.workflow.model.LoopTask;
import cn.edu.nju.cs.workflow.model.ModelFactory;
import cn.edu.nju.cs.workflow.model.ModelPackage;
import cn.edu.nju.cs.workflow.model.OutputPort;
import cn.edu.nju.cs.workflow.model.Port;
import cn.edu.nju.cs.workflow.model.SimpleTask;
import cn.edu.nju.cs.workflow.model.Task;
import cn.edu.nju.cs.workflow.model.WhileCondition;
import cn.edu.nju.cs.workflow.model.Workflow;
import cn.edu.nju.cs.workflow.model.WorkflowElement;
import cn.edu.nju.cs.workflow.model.WorkflowNode;
import cn.edu.nju.cs.workflow.model.WorkflowProcess;

import org.eclipse.bpel.model.BPELPackage;

import org.eclipse.bpel.model.messageproperties.MessagepropertiesPackage;

import org.eclipse.bpel.model.partnerlinktype.PartnerlinktypePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.wst.wsdl.WSDLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compoundTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass faultPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalOutputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adviceTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adviceEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum adviceTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see cn.edu.nju.cs.workflow.model.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BPELPackage.eINSTANCE.eClass();
		PartnerlinktypePackage.eINSTANCE.eClass();
		MessagepropertiesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theModelPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowElement() {
		return workflowElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflowElement_Id() {
		return (EAttribute)workflowElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflowElement_Name() {
		return (EAttribute)workflowElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflowElement_Comment() {
		return (EAttribute)workflowElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflowElement_Width() {
		return (EAttribute)workflowElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflowElement_Height() {
		return (EAttribute)workflowElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflowElement_X() {
		return (EAttribute)workflowElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflowElement_Y() {
		return (EAttribute)workflowElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowProcess() {
		return workflowProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowProcess_RootWorkflow() {
		return (EReference)workflowProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowProcess_BpelProcess() {
		return (EReference)workflowProcessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowProcess_ImplPortTypes() {
		return (EReference)workflowProcessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowProcess_ToImplPortTypes() {
		return (EReference)workflowProcessEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflow() {
		return workflowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_Nodes() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_Edges() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_Comments() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_Activity() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_RootActivity() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowNode() {
		return workflowNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowNode_Workflow() {
		return (EReference)workflowNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowNode_Input() {
		return (EReference)workflowNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowNode_Outputs() {
		return (EReference)workflowNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowNode_AdviceEdges() {
		return (EReference)workflowNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflowNode_IsStartNode() {
		return (EAttribute)workflowNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflowNode_IsFinishNode() {
		return (EAttribute)workflowNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleTask() {
		return simpleTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleTask_Porttype() {
		return (EReference)simpleTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleTask_Operation() {
		return (EReference)simpleTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleTask_PartnerActivity() {
		return (EReference)simpleTaskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleTask_PartnerLink() {
		return (EReference)simpleTaskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompoundTask() {
		return compoundTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundTask_Subworkflow() {
		return (EReference)compoundTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoopTask() {
		return loopTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopTask_WhileCondition() {
		return (EReference)loopTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChoice() {
		return choiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdge() {
		return edgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdge_Workflow() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdge_Source() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdge_Target() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputPort() {
		return inputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputPort_Node() {
		return (EReference)inputPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputPort_Edges() {
		return (EReference)inputPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputPort_InputValue() {
		return (EReference)inputPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputPort_Assign() {
		return (EReference)inputPortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputPort() {
		return outputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputPort_Node() {
		return (EReference)outputPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputPort_Edges() {
		return (EReference)outputPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputPort_OutputValue() {
		return (EReference)outputPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFaultPort() {
		return faultPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalOutputPort() {
		return conditionalOutputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionalOutputPort_Condition() {
		return (EAttribute)conditionalOutputPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComment() {
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdviceTask() {
		return adviceTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdviceTask_Edges() {
		return (EReference)adviceTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdviceEdge() {
		return adviceEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdviceEdge_AdviceTask() {
		return (EReference)adviceEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdviceEdge_JoinPoint() {
		return (EReference)adviceEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdviceEdge_Advicetype() {
		return (EAttribute)adviceEdgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhileCondition() {
		return whileConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhileCondition_Looptask() {
		return (EReference)whileConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhileCondition_Condition() {
		return (EAttribute)whileConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAdviceType() {
		return adviceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return (ModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		workflowElementEClass = createEClass(WORKFLOW_ELEMENT);
		createEAttribute(workflowElementEClass, WORKFLOW_ELEMENT__ID);
		createEAttribute(workflowElementEClass, WORKFLOW_ELEMENT__NAME);
		createEAttribute(workflowElementEClass, WORKFLOW_ELEMENT__COMMENT);
		createEAttribute(workflowElementEClass, WORKFLOW_ELEMENT__WIDTH);
		createEAttribute(workflowElementEClass, WORKFLOW_ELEMENT__HEIGHT);
		createEAttribute(workflowElementEClass, WORKFLOW_ELEMENT__X);
		createEAttribute(workflowElementEClass, WORKFLOW_ELEMENT__Y);

		workflowProcessEClass = createEClass(WORKFLOW_PROCESS);
		createEReference(workflowProcessEClass, WORKFLOW_PROCESS__ROOT_WORKFLOW);
		createEReference(workflowProcessEClass, WORKFLOW_PROCESS__BPEL_PROCESS);
		createEReference(workflowProcessEClass, WORKFLOW_PROCESS__IMPL_PORT_TYPES);
		createEReference(workflowProcessEClass, WORKFLOW_PROCESS__TO_IMPL_PORT_TYPES);

		workflowEClass = createEClass(WORKFLOW);
		createEReference(workflowEClass, WORKFLOW__NODES);
		createEReference(workflowEClass, WORKFLOW__EDGES);
		createEReference(workflowEClass, WORKFLOW__COMMENTS);
		createEReference(workflowEClass, WORKFLOW__ACTIVITY);
		createEReference(workflowEClass, WORKFLOW__ROOT_ACTIVITY);

		workflowNodeEClass = createEClass(WORKFLOW_NODE);
		createEReference(workflowNodeEClass, WORKFLOW_NODE__WORKFLOW);
		createEReference(workflowNodeEClass, WORKFLOW_NODE__INPUT);
		createEReference(workflowNodeEClass, WORKFLOW_NODE__OUTPUTS);
		createEReference(workflowNodeEClass, WORKFLOW_NODE__ADVICE_EDGES);
		createEAttribute(workflowNodeEClass, WORKFLOW_NODE__IS_START_NODE);
		createEAttribute(workflowNodeEClass, WORKFLOW_NODE__IS_FINISH_NODE);

		taskEClass = createEClass(TASK);

		simpleTaskEClass = createEClass(SIMPLE_TASK);
		createEReference(simpleTaskEClass, SIMPLE_TASK__PORTTYPE);
		createEReference(simpleTaskEClass, SIMPLE_TASK__OPERATION);
		createEReference(simpleTaskEClass, SIMPLE_TASK__PARTNER_ACTIVITY);
		createEReference(simpleTaskEClass, SIMPLE_TASK__PARTNER_LINK);

		compoundTaskEClass = createEClass(COMPOUND_TASK);
		createEReference(compoundTaskEClass, COMPOUND_TASK__SUBWORKFLOW);

		loopTaskEClass = createEClass(LOOP_TASK);
		createEReference(loopTaskEClass, LOOP_TASK__WHILE_CONDITION);

		choiceEClass = createEClass(CHOICE);

		edgeEClass = createEClass(EDGE);
		createEReference(edgeEClass, EDGE__WORKFLOW);
		createEReference(edgeEClass, EDGE__SOURCE);
		createEReference(edgeEClass, EDGE__TARGET);

		portEClass = createEClass(PORT);

		inputPortEClass = createEClass(INPUT_PORT);
		createEReference(inputPortEClass, INPUT_PORT__NODE);
		createEReference(inputPortEClass, INPUT_PORT__EDGES);
		createEReference(inputPortEClass, INPUT_PORT__INPUT_VALUE);
		createEReference(inputPortEClass, INPUT_PORT__ASSIGN);

		outputPortEClass = createEClass(OUTPUT_PORT);
		createEReference(outputPortEClass, OUTPUT_PORT__NODE);
		createEReference(outputPortEClass, OUTPUT_PORT__EDGES);
		createEReference(outputPortEClass, OUTPUT_PORT__OUTPUT_VALUE);

		faultPortEClass = createEClass(FAULT_PORT);

		conditionalOutputPortEClass = createEClass(CONDITIONAL_OUTPUT_PORT);
		createEAttribute(conditionalOutputPortEClass, CONDITIONAL_OUTPUT_PORT__CONDITION);

		commentEClass = createEClass(COMMENT);

		adviceTaskEClass = createEClass(ADVICE_TASK);
		createEReference(adviceTaskEClass, ADVICE_TASK__EDGES);

		adviceEdgeEClass = createEClass(ADVICE_EDGE);
		createEReference(adviceEdgeEClass, ADVICE_EDGE__ADVICE_TASK);
		createEReference(adviceEdgeEClass, ADVICE_EDGE__JOIN_POINT);
		createEAttribute(adviceEdgeEClass, ADVICE_EDGE__ADVICETYPE);

		whileConditionEClass = createEClass(WHILE_CONDITION);
		createEReference(whileConditionEClass, WHILE_CONDITION__LOOPTASK);
		createEAttribute(whileConditionEClass, WHILE_CONDITION__CONDITION);

		// Create enums
		adviceTypeEEnum = createEEnum(ADVICE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BPELPackage theBPELPackage = (BPELPackage)EPackage.Registry.INSTANCE.getEPackage(BPELPackage.eNS_URI);
		WSDLPackage theWSDLPackage = (WSDLPackage)EPackage.Registry.INSTANCE.getEPackage(WSDLPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		workflowEClass.getESuperTypes().add(this.getWorkflowElement());
		workflowNodeEClass.getESuperTypes().add(this.getWorkflowElement());
		taskEClass.getESuperTypes().add(this.getWorkflowNode());
		simpleTaskEClass.getESuperTypes().add(this.getTask());
		compoundTaskEClass.getESuperTypes().add(this.getTask());
		loopTaskEClass.getESuperTypes().add(this.getCompoundTask());
		choiceEClass.getESuperTypes().add(this.getWorkflowNode());
		edgeEClass.getESuperTypes().add(this.getWorkflowElement());
		portEClass.getESuperTypes().add(this.getWorkflowElement());
		inputPortEClass.getESuperTypes().add(this.getPort());
		outputPortEClass.getESuperTypes().add(this.getPort());
		faultPortEClass.getESuperTypes().add(this.getOutputPort());
		conditionalOutputPortEClass.getESuperTypes().add(this.getOutputPort());
		adviceTaskEClass.getESuperTypes().add(this.getCompoundTask());
		adviceEdgeEClass.getESuperTypes().add(this.getWorkflowElement());
		whileConditionEClass.getESuperTypes().add(this.getWorkflowElement());

		// Initialize classes and features; add operations and parameters
		initEClass(workflowElementEClass, WorkflowElement.class, "WorkflowElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkflowElement_Id(), ecorePackage.getEString(), "id", null, 1, 1, WorkflowElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflowElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, WorkflowElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflowElement_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, WorkflowElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflowElement_Width(), ecorePackage.getEInt(), "width", null, 0, 1, WorkflowElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflowElement_Height(), ecorePackage.getEInt(), "height", null, 0, 1, WorkflowElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflowElement_X(), ecorePackage.getEInt(), "x", null, 0, 1, WorkflowElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflowElement_Y(), ecorePackage.getEInt(), "y", null, 0, 1, WorkflowElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workflowProcessEClass, WorkflowProcess.class, "WorkflowProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflowProcess_RootWorkflow(), this.getWorkflow(), null, "rootWorkflow", null, 0, 1, WorkflowProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowProcess_BpelProcess(), theBPELPackage.getProcess(), null, "bpelProcess", null, 1, 1, WorkflowProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowProcess_ImplPortTypes(), theWSDLPackage.getPortType(), null, "implPortTypes", null, 0, -1, WorkflowProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowProcess_ToImplPortTypes(), theWSDLPackage.getPortType(), null, "toImplPortTypes", null, 0, -1, WorkflowProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workflowEClass, Workflow.class, "Workflow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflow_Nodes(), this.getWorkflowNode(), this.getWorkflowNode_Workflow(), "nodes", null, 0, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_Edges(), this.getEdge(), this.getEdge_Workflow(), "edges", null, 0, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_Comments(), this.getComment(), null, "comments", null, 0, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_Activity(), theBPELPackage.getActivity(), null, "activity", null, 1, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_RootActivity(), theBPELPackage.getActivity(), null, "rootActivity", null, 0, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workflowNodeEClass, WorkflowNode.class, "WorkflowNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflowNode_Workflow(), this.getWorkflow(), this.getWorkflow_Nodes(), "workflow", null, 1, 1, WorkflowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowNode_Input(), this.getInputPort(), null, "input", null, 1, 1, WorkflowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowNode_Outputs(), this.getOutputPort(), null, "outputs", null, 0, -1, WorkflowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowNode_AdviceEdges(), this.getAdviceEdge(), this.getAdviceEdge_JoinPoint(), "adviceEdges", null, 0, -1, WorkflowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflowNode_IsStartNode(), theEcorePackage.getEBoolean(), "isStartNode", null, 0, 1, WorkflowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflowNode_IsFinishNode(), theEcorePackage.getEBoolean(), "isFinishNode", null, 0, 1, WorkflowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleTaskEClass, SimpleTask.class, "SimpleTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleTask_Porttype(), theWSDLPackage.getPortType(), null, "porttype", null, 0, 1, SimpleTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleTask_Operation(), theWSDLPackage.getOperation(), null, "operation", null, 0, 1, SimpleTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleTask_PartnerActivity(), theBPELPackage.getBPELExtensibleElement(), null, "partnerActivity", null, 0, 1, SimpleTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleTask_PartnerLink(), theBPELPackage.getPartnerLink(), null, "partnerLink", null, 0, 1, SimpleTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compoundTaskEClass, CompoundTask.class, "CompoundTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompoundTask_Subworkflow(), this.getWorkflow(), null, "subworkflow", null, 1, 1, CompoundTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loopTaskEClass, LoopTask.class, "LoopTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoopTask_WhileCondition(), this.getWhileCondition(), this.getWhileCondition_Looptask(), "whileCondition", null, 1, 1, LoopTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(choiceEClass, Choice.class, "Choice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(edgeEClass, Edge.class, "Edge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEdge_Workflow(), this.getWorkflow(), this.getWorkflow_Edges(), "workflow", null, 1, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdge_Source(), this.getOutputPort(), this.getOutputPort_Edges(), "source", null, 1, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdge_Target(), this.getInputPort(), this.getInputPort_Edges(), "target", null, 1, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputPortEClass, InputPort.class, "InputPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputPort_Node(), this.getWorkflowNode(), null, "node", null, 0, 1, InputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputPort_Edges(), this.getEdge(), this.getEdge_Target(), "edges", null, 0, -1, InputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputPort_InputValue(), theBPELPackage.getVariable(), null, "inputValue", null, 0, 1, InputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputPort_Assign(), theBPELPackage.getAssign(), null, "assign", null, 0, 1, InputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputPortEClass, OutputPort.class, "OutputPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputPort_Node(), this.getWorkflowNode(), null, "node", null, 0, 1, OutputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputPort_Edges(), this.getEdge(), this.getEdge_Source(), "edges", null, 0, -1, OutputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputPort_OutputValue(), theBPELPackage.getVariable(), null, "outputValue", null, 0, 1, OutputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(faultPortEClass, FaultPort.class, "FaultPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionalOutputPortEClass, ConditionalOutputPort.class, "ConditionalOutputPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConditionalOutputPort_Condition(), ecorePackage.getEString(), "condition", null, 1, 1, ConditionalOutputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(adviceTaskEClass, AdviceTask.class, "AdviceTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdviceTask_Edges(), this.getAdviceEdge(), this.getAdviceEdge_AdviceTask(), "edges", null, 0, -1, AdviceTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adviceEdgeEClass, AdviceEdge.class, "AdviceEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdviceEdge_AdviceTask(), this.getAdviceTask(), this.getAdviceTask_Edges(), "adviceTask", null, 0, 1, AdviceEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdviceEdge_JoinPoint(), this.getWorkflowNode(), this.getWorkflowNode_AdviceEdges(), "joinPoint", null, 0, 1, AdviceEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdviceEdge_Advicetype(), this.getAdviceType(), "advicetype", null, 1, 1, AdviceEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whileConditionEClass, WhileCondition.class, "WhileCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWhileCondition_Looptask(), this.getLoopTask(), this.getLoopTask_WhileCondition(), "looptask", null, 1, 1, WhileCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWhileCondition_Condition(), ecorePackage.getEString(), "condition", null, 1, 1, WhileCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(adviceTypeEEnum, AdviceType.class, "AdviceType");
		addEEnumLiteral(adviceTypeEEnum, AdviceType.BEFORE);
		addEEnumLiteral(adviceTypeEEnum, AdviceType.AROUND_SOAPMESSAGEIN);
		addEEnumLiteral(adviceTypeEEnum, AdviceType.AFTER_SOAPMESSAGEIN);
		addEEnumLiteral(adviceTypeEEnum, AdviceType.AROUND);
		addEEnumLiteral(adviceTypeEEnum, AdviceType.BEFORE_SOAPMESSAGEOUT);
		addEEnumLiteral(adviceTypeEEnum, AdviceType.AROUND_SOAPMESSAGEOUT);
		addEEnumLiteral(adviceTypeEEnum, AdviceType.AFTER);

		// Create resource
		createResource(eNS_URI);
	}

} //ModelPackageImpl
