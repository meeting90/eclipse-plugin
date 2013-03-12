/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.nju.cs.workflow.model.util;

import cn.edu.nju.cs.workflow.model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see cn.edu.nju.cs.workflow.model.ModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelSwitch<Adapter> modelSwitch =
		new ModelSwitch<Adapter>() {
			@Override
			public Adapter caseWorkflowElement(WorkflowElement object) {
				return createWorkflowElementAdapter();
			}
			@Override
			public Adapter caseWorkflowProcess(WorkflowProcess object) {
				return createWorkflowProcessAdapter();
			}
			@Override
			public Adapter caseWorkflow(Workflow object) {
				return createWorkflowAdapter();
			}
			@Override
			public Adapter caseWorkflowNode(WorkflowNode object) {
				return createWorkflowNodeAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseSimpleTask(SimpleTask object) {
				return createSimpleTaskAdapter();
			}
			@Override
			public Adapter caseCompoundTask(CompoundTask object) {
				return createCompoundTaskAdapter();
			}
			@Override
			public Adapter caseLoopTask(LoopTask object) {
				return createLoopTaskAdapter();
			}
			@Override
			public Adapter caseChoice(Choice object) {
				return createChoiceAdapter();
			}
			@Override
			public Adapter caseEdge(Edge object) {
				return createEdgeAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter caseInputPort(InputPort object) {
				return createInputPortAdapter();
			}
			@Override
			public Adapter caseOutputPort(OutputPort object) {
				return createOutputPortAdapter();
			}
			@Override
			public Adapter caseFaultPort(FaultPort object) {
				return createFaultPortAdapter();
			}
			@Override
			public Adapter caseConditionalOutputPort(ConditionalOutputPort object) {
				return createConditionalOutputPortAdapter();
			}
			@Override
			public Adapter caseComment(Comment object) {
				return createCommentAdapter();
			}
			@Override
			public Adapter caseAdviceTask(AdviceTask object) {
				return createAdviceTaskAdapter();
			}
			@Override
			public Adapter caseAdviceEdge(AdviceEdge object) {
				return createAdviceEdgeAdapter();
			}
			@Override
			public Adapter caseWhileCondition(WhileCondition object) {
				return createWhileConditionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.nju.cs.workflow.model.WorkflowElement <em>Workflow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.nju.cs.workflow.model.WorkflowElement
	 * @generated
	 */
	public Adapter createWorkflowElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.nju.cs.workflow.model.WorkflowProcess <em>Workflow Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.nju.cs.workflow.model.WorkflowProcess
	 * @generated
	 */
	public Adapter createWorkflowProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.nju.cs.workflow.model.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.nju.cs.workflow.model.Workflow
	 * @generated
	 */
	public Adapter createWorkflowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.nju.cs.workflow.model.WorkflowNode <em>Workflow Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.nju.cs.workflow.model.WorkflowNode
	 * @generated
	 */
	public Adapter createWorkflowNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.nju.cs.workflow.model.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.nju.cs.workflow.model.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.nju.cs.workflow.model.SimpleTask <em>Simple Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.nju.cs.workflow.model.SimpleTask
	 * @generated
	 */
	public Adapter createSimpleTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.nju.cs.workflow.model.CompoundTask <em>Compound Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.nju.cs.workflow.model.CompoundTask
	 * @generated
	 */
	public Adapter createCompoundTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.nju.cs.workflow.model.LoopTask <em>Loop Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.nju.cs.workflow.model.LoopTask
	 * @generated
	 */
	public Adapter createLoopTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.nju.cs.workflow.model.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.nju.cs.workflow.model.Choice
	 * @generated
	 */
	public Adapter createChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.nju.cs.workflow.model.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.nju.cs.workflow.model.Edge
	 * @generated
	 */
	public Adapter createEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.nju.cs.workflow.model.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.nju.cs.workflow.model.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.nju.cs.workflow.model.InputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.nju.cs.workflow.model.InputPort
	 * @generated
	 */
	public Adapter createInputPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.nju.cs.workflow.model.OutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.nju.cs.workflow.model.OutputPort
	 * @generated
	 */
	public Adapter createOutputPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.nju.cs.workflow.model.FaultPort <em>Fault Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.nju.cs.workflow.model.FaultPort
	 * @generated
	 */
	public Adapter createFaultPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.nju.cs.workflow.model.ConditionalOutputPort <em>Conditional Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.nju.cs.workflow.model.ConditionalOutputPort
	 * @generated
	 */
	public Adapter createConditionalOutputPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.nju.cs.workflow.model.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.nju.cs.workflow.model.Comment
	 * @generated
	 */
	public Adapter createCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.nju.cs.workflow.model.AdviceTask <em>Advice Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.nju.cs.workflow.model.AdviceTask
	 * @generated
	 */
	public Adapter createAdviceTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.nju.cs.workflow.model.AdviceEdge <em>Advice Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.nju.cs.workflow.model.AdviceEdge
	 * @generated
	 */
	public Adapter createAdviceEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.nju.cs.workflow.model.WhileCondition <em>While Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.nju.cs.workflow.model.WhileCondition
	 * @generated
	 */
	public Adapter createWhileConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModelAdapterFactory
