/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.nju.cs.workflow.model.aspect;

import org.eclipse.bpel.model.BPELPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see cn.edu.nju.cs.workflow.model.aspect.AspectFactory
 * @model kind="package"
 * @generated
 */
public interface AspectPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "aspect";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://workflow.cs.nju.edu.cn/aspect/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ao4bpel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AspectPackage eINSTANCE = cn.edu.nju.cs.workflow.model.aspect.impl.AspectPackageImpl.init();

	/**
	 * The meta object id for the '{@link cn.edu.nju.cs.workflow.model.aspect.impl.AspectImpl <em>Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.nju.cs.workflow.model.aspect.impl.AspectImpl
	 * @see cn.edu.nju.cs.workflow.model.aspect.impl.AspectPackageImpl#getAspect()
	 * @generated
	 */
	int ASPECT = 0;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__DOCUMENTATION_ELEMENT = BPELPackage.BPEL_EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__ELEMENT = BPELPackage.BPEL_EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__EEXTENSIBILITY_ELEMENTS = BPELPackage.BPEL_EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__DOCUMENTATION = BPELPackage.BPEL_EXTENSIBLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__NAME = BPELPackage.BPEL_EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Targetnamespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__TARGETNAMESPACE = BPELPackage.BPEL_EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__EXPRESSION_LANGUAGE = BPELPackage.BPEL_EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pointcuts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__POINTCUTS = BPELPackage.BPEL_EXTENSIBLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Advice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__ADVICE = BPELPackage.BPEL_EXTENSIBLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_FEATURE_COUNT = BPELPackage.BPEL_EXTENSIBLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link cn.edu.nju.cs.workflow.model.aspect.impl.PointcutsImpl <em>Pointcuts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.nju.cs.workflow.model.aspect.impl.PointcutsImpl
	 * @see cn.edu.nju.cs.workflow.model.aspect.impl.AspectPackageImpl#getPointcuts()
	 * @generated
	 */
	int POINTCUTS = 1;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUTS__DOCUMENTATION_ELEMENT = BPELPackage.BPEL_EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUTS__ELEMENT = BPELPackage.BPEL_EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUTS__EEXTENSIBILITY_ELEMENTS = BPELPackage.BPEL_EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUTS__DOCUMENTATION = BPELPackage.BPEL_EXTENSIBLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUTS__CHILDREN = BPELPackage.BPEL_EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pointcuts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUTS_FEATURE_COUNT = BPELPackage.BPEL_EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link cn.edu.nju.cs.workflow.model.aspect.impl.PointcutImpl <em>Pointcut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.nju.cs.workflow.model.aspect.impl.PointcutImpl
	 * @see cn.edu.nju.cs.workflow.model.aspect.impl.AspectPackageImpl#getPointcut()
	 * @generated
	 */
	int POINTCUT = 2;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT__DOCUMENTATION_ELEMENT = BPELPackage.BPEL_EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT__ELEMENT = BPELPackage.BPEL_EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT__EEXTENSIBILITY_ELEMENTS = BPELPackage.BPEL_EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT__DOCUMENTATION = BPELPackage.BPEL_EXTENSIBLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT__NAME = BPELPackage.BPEL_EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT__LANGUAGE = BPELPackage.BPEL_EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Startpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT__STARTPOINT = BPELPackage.BPEL_EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT__ENDPOINT = BPELPackage.BPEL_EXTENSIBLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT__POINT = BPELPackage.BPEL_EXTENSIBLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Pointcut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT_FEATURE_COUNT = BPELPackage.BPEL_EXTENSIBLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link cn.edu.nju.cs.workflow.model.aspect.impl.AdviceImpl <em>Advice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.nju.cs.workflow.model.aspect.impl.AdviceImpl
	 * @see cn.edu.nju.cs.workflow.model.aspect.impl.AspectPackageImpl#getAdvice()
	 * @generated
	 */
	int ADVICE = 3;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__DOCUMENTATION_ELEMENT = BPELPackage.PROCESS__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__ELEMENT = BPELPackage.PROCESS__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__EEXTENSIBILITY_ELEMENTS = BPELPackage.PROCESS__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__DOCUMENTATION = BPELPackage.PROCESS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__NAME = BPELPackage.PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__TARGET_NAMESPACE = BPELPackage.PROCESS__TARGET_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Query Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__QUERY_LANGUAGE = BPELPackage.PROCESS__QUERY_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__EXPRESSION_LANGUAGE = BPELPackage.PROCESS__EXPRESSION_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__SUPPRESS_JOIN_FAILURE = BPELPackage.PROCESS__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Variable Access Serializable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__VARIABLE_ACCESS_SERIALIZABLE = BPELPackage.PROCESS__VARIABLE_ACCESS_SERIALIZABLE;

	/**
	 * The feature id for the '<em><b>Partner Links</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__PARTNER_LINKS = BPELPackage.PROCESS__PARTNER_LINKS;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__VARIABLES = BPELPackage.PROCESS__VARIABLES;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__ACTIVITY = BPELPackage.PROCESS__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Fault Handlers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__FAULT_HANDLERS = BPELPackage.PROCESS__FAULT_HANDLERS;

	/**
	 * The feature id for the '<em><b>Event Handlers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__EVENT_HANDLERS = BPELPackage.PROCESS__EVENT_HANDLERS;

	/**
	 * The feature id for the '<em><b>Correlation Sets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__CORRELATION_SETS = BPELPackage.PROCESS__CORRELATION_SETS;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__IMPORTS = BPELPackage.PROCESS__IMPORTS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__EXTENSIONS = BPELPackage.PROCESS__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Exit On Standard Fault</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__EXIT_ON_STANDARD_FAULT = BPELPackage.PROCESS__EXIT_ON_STANDARD_FAULT;

	/**
	 * The feature id for the '<em><b>Message Exchanges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__MESSAGE_EXCHANGES = BPELPackage.PROCESS__MESSAGE_EXCHANGES;

	/**
	 * The feature id for the '<em><b>Abstract Process Profile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__ABSTRACT_PROCESS_PROFILE = BPELPackage.PROCESS__ABSTRACT_PROCESS_PROFILE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__TYPE = BPELPackage.PROCESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__CONDITION = BPELPackage.PROCESS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Advice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_FEATURE_COUNT = BPELPackage.PROCESS_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link cn.edu.nju.cs.workflow.model.aspect.Aspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aspect</em>'.
	 * @see cn.edu.nju.cs.workflow.model.aspect.Aspect
	 * @generated
	 */
	EClass getAspect();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.nju.cs.workflow.model.aspect.Aspect#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cn.edu.nju.cs.workflow.model.aspect.Aspect#getName()
	 * @see #getAspect()
	 * @generated
	 */
	EAttribute getAspect_Name();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.nju.cs.workflow.model.aspect.Aspect#getTargetnamespace <em>Targetnamespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Targetnamespace</em>'.
	 * @see cn.edu.nju.cs.workflow.model.aspect.Aspect#getTargetnamespace()
	 * @see #getAspect()
	 * @generated
	 */
	EAttribute getAspect_Targetnamespace();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.nju.cs.workflow.model.aspect.Aspect#getExpressionLanguage <em>Expression Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression Language</em>'.
	 * @see cn.edu.nju.cs.workflow.model.aspect.Aspect#getExpressionLanguage()
	 * @see #getAspect()
	 * @generated
	 */
	EAttribute getAspect_ExpressionLanguage();

	/**
	 * Returns the meta object for the containment reference '{@link cn.edu.nju.cs.workflow.model.aspect.Aspect#getPointcuts <em>Pointcuts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pointcuts</em>'.
	 * @see cn.edu.nju.cs.workflow.model.aspect.Aspect#getPointcuts()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_Pointcuts();

	/**
	 * Returns the meta object for the containment reference '{@link cn.edu.nju.cs.workflow.model.aspect.Aspect#getAdvice <em>Advice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Advice</em>'.
	 * @see cn.edu.nju.cs.workflow.model.aspect.Aspect#getAdvice()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_Advice();

	/**
	 * Returns the meta object for class '{@link cn.edu.nju.cs.workflow.model.aspect.Pointcuts <em>Pointcuts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pointcuts</em>'.
	 * @see cn.edu.nju.cs.workflow.model.aspect.Pointcuts
	 * @generated
	 */
	EClass getPointcuts();

	/**
	 * Returns the meta object for the containment reference list '{@link cn.edu.nju.cs.workflow.model.aspect.Pointcuts#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see cn.edu.nju.cs.workflow.model.aspect.Pointcuts#getChildren()
	 * @see #getPointcuts()
	 * @generated
	 */
	EReference getPointcuts_Children();

	/**
	 * Returns the meta object for class '{@link cn.edu.nju.cs.workflow.model.aspect.Pointcut <em>Pointcut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pointcut</em>'.
	 * @see cn.edu.nju.cs.workflow.model.aspect.Pointcut
	 * @generated
	 */
	EClass getPointcut();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.nju.cs.workflow.model.aspect.Pointcut#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cn.edu.nju.cs.workflow.model.aspect.Pointcut#getName()
	 * @see #getPointcut()
	 * @generated
	 */
	EAttribute getPointcut_Name();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.nju.cs.workflow.model.aspect.Pointcut#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see cn.edu.nju.cs.workflow.model.aspect.Pointcut#getLanguage()
	 * @see #getPointcut()
	 * @generated
	 */
	EAttribute getPointcut_Language();

	/**
	 * Returns the meta object for the containment reference '{@link cn.edu.nju.cs.workflow.model.aspect.Pointcut#getStartpoint <em>Startpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Startpoint</em>'.
	 * @see cn.edu.nju.cs.workflow.model.aspect.Pointcut#getStartpoint()
	 * @see #getPointcut()
	 * @generated
	 */
	EReference getPointcut_Startpoint();

	/**
	 * Returns the meta object for the containment reference '{@link cn.edu.nju.cs.workflow.model.aspect.Pointcut#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Endpoint</em>'.
	 * @see cn.edu.nju.cs.workflow.model.aspect.Pointcut#getEndpoint()
	 * @see #getPointcut()
	 * @generated
	 */
	EReference getPointcut_Endpoint();

	/**
	 * Returns the meta object for the containment reference '{@link cn.edu.nju.cs.workflow.model.aspect.Pointcut#getPoint <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Point</em>'.
	 * @see cn.edu.nju.cs.workflow.model.aspect.Pointcut#getPoint()
	 * @see #getPointcut()
	 * @generated
	 */
	EReference getPointcut_Point();

	/**
	 * Returns the meta object for class '{@link cn.edu.nju.cs.workflow.model.aspect.Advice <em>Advice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advice</em>'.
	 * @see cn.edu.nju.cs.workflow.model.aspect.Advice
	 * @generated
	 */
	EClass getAdvice();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.nju.cs.workflow.model.aspect.Advice#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see cn.edu.nju.cs.workflow.model.aspect.Advice#getType()
	 * @see #getAdvice()
	 * @generated
	 */
	EAttribute getAdvice_Type();

	/**
	 * Returns the meta object for the containment reference '{@link cn.edu.nju.cs.workflow.model.aspect.Advice#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see cn.edu.nju.cs.workflow.model.aspect.Advice#getCondition()
	 * @see #getAdvice()
	 * @generated
	 */
	EReference getAdvice_Condition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AspectFactory getAspectFactory();

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
		 * The meta object literal for the '{@link cn.edu.nju.cs.workflow.model.aspect.impl.AspectImpl <em>Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.nju.cs.workflow.model.aspect.impl.AspectImpl
		 * @see cn.edu.nju.cs.workflow.model.aspect.impl.AspectPackageImpl#getAspect()
		 * @generated
		 */
		EClass ASPECT = eINSTANCE.getAspect();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASPECT__NAME = eINSTANCE.getAspect_Name();

		/**
		 * The meta object literal for the '<em><b>Targetnamespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASPECT__TARGETNAMESPACE = eINSTANCE.getAspect_Targetnamespace();

		/**
		 * The meta object literal for the '<em><b>Expression Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASPECT__EXPRESSION_LANGUAGE = eINSTANCE.getAspect_ExpressionLanguage();

		/**
		 * The meta object literal for the '<em><b>Pointcuts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__POINTCUTS = eINSTANCE.getAspect_Pointcuts();

		/**
		 * The meta object literal for the '<em><b>Advice</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__ADVICE = eINSTANCE.getAspect_Advice();

		/**
		 * The meta object literal for the '{@link cn.edu.nju.cs.workflow.model.aspect.impl.PointcutsImpl <em>Pointcuts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.nju.cs.workflow.model.aspect.impl.PointcutsImpl
		 * @see cn.edu.nju.cs.workflow.model.aspect.impl.AspectPackageImpl#getPointcuts()
		 * @generated
		 */
		EClass POINTCUTS = eINSTANCE.getPointcuts();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINTCUTS__CHILDREN = eINSTANCE.getPointcuts_Children();

		/**
		 * The meta object literal for the '{@link cn.edu.nju.cs.workflow.model.aspect.impl.PointcutImpl <em>Pointcut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.nju.cs.workflow.model.aspect.impl.PointcutImpl
		 * @see cn.edu.nju.cs.workflow.model.aspect.impl.AspectPackageImpl#getPointcut()
		 * @generated
		 */
		EClass POINTCUT = eINSTANCE.getPointcut();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINTCUT__NAME = eINSTANCE.getPointcut_Name();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINTCUT__LANGUAGE = eINSTANCE.getPointcut_Language();

		/**
		 * The meta object literal for the '<em><b>Startpoint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINTCUT__STARTPOINT = eINSTANCE.getPointcut_Startpoint();

		/**
		 * The meta object literal for the '<em><b>Endpoint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINTCUT__ENDPOINT = eINSTANCE.getPointcut_Endpoint();

		/**
		 * The meta object literal for the '<em><b>Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINTCUT__POINT = eINSTANCE.getPointcut_Point();

		/**
		 * The meta object literal for the '{@link cn.edu.nju.cs.workflow.model.aspect.impl.AdviceImpl <em>Advice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.nju.cs.workflow.model.aspect.impl.AdviceImpl
		 * @see cn.edu.nju.cs.workflow.model.aspect.impl.AspectPackageImpl#getAdvice()
		 * @generated
		 */
		EClass ADVICE = eINSTANCE.getAdvice();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADVICE__TYPE = eINSTANCE.getAdvice_Type();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADVICE__CONDITION = eINSTANCE.getAdvice_Condition();

	}

} //AspectPackage
