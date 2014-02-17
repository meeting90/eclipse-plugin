/**
 */
package cn.edu.nju.cs.workflow.aspect.model;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cn.edu.nju.cs.workflow.aspect.model.AspectFactory
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
	String eNAME = "model";

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
	AspectPackage eINSTANCE = cn.edu.nju.cs.workflow.aspect.model.impl.AspectPackageImpl.init();

	/**
	 * The meta object id for the '{@link cn.edu.nju.cs.workflow.aspect.model.impl.AspectsImpl <em>Aspects</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.nju.cs.workflow.aspect.model.impl.AspectsImpl
	 * @see cn.edu.nju.cs.workflow.aspect.model.impl.AspectPackageImpl#getAspects()
	 * @generated
	 */
	int ASPECTS = 0;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECTS__DOCUMENTATION_ELEMENT = BPELPackage.BPEL_EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECTS__ELEMENT = BPELPackage.BPEL_EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECTS__EEXTENSIBILITY_ELEMENTS = BPELPackage.BPEL_EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECTS__DOCUMENTATION = BPELPackage.BPEL_EXTENSIBLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECTS__NAME = BPELPackage.BPEL_EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Targetnamespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECTS__TARGETNAMESPACE = BPELPackage.BPEL_EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECTS__CHILDREN = BPELPackage.BPEL_EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Aspects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECTS_FEATURE_COUNT = BPELPackage.BPEL_EXTENSIBLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int ASPECTS___GET_ENCLOSING_DEFINITION = BPELPackage.BPEL_EXTENSIBLE_ELEMENT___GET_ENCLOSING_DEFINITION;

	/**
	 * The operation id for the '<em>Set Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int ASPECTS___SET_ENCLOSING_DEFINITION__DEFINITION = BPELPackage.BPEL_EXTENSIBLE_ELEMENT___SET_ENCLOSING_DEFINITION__DEFINITION;

	/**
	 * The operation id for the '<em>Get Extensibility Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int ASPECTS___GET_EXTENSIBILITY_ELEMENTS = BPELPackage.BPEL_EXTENSIBLE_ELEMENT___GET_EXTENSIBILITY_ELEMENTS;

	/**
	 * The operation id for the '<em>Add Extensibility Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int ASPECTS___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT = BPELPackage.BPEL_EXTENSIBLE_ELEMENT___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT;

	/**
	 * The operation id for the '<em>Get Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int ASPECTS___GET_EXTENSION_ATTRIBUTE__QNAME = BPELPackage.BPEL_EXTENSIBLE_ELEMENT___GET_EXTENSION_ATTRIBUTE__QNAME;

	/**
	 * The operation id for the '<em>Set Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int ASPECTS___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT = BPELPackage.BPEL_EXTENSIBLE_ELEMENT___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT;

	/**
	 * The operation id for the '<em>Get Extension Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int ASPECTS___GET_EXTENSION_ATTRIBUTES = BPELPackage.BPEL_EXTENSIBLE_ELEMENT___GET_EXTENSION_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get Native Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int ASPECTS___GET_NATIVE_ATTRIBUTE_NAMES = BPELPackage.BPEL_EXTENSIBLE_ELEMENT___GET_NATIVE_ATTRIBUTE_NAMES;

	/**
	 * The number of operations of the '<em>Aspects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int ASPECTS_OPERATION_COUNT = BPELPackage.BPEL_EXTENSIBLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cn.edu.nju.cs.workflow.aspect.model.impl.AspectImpl <em>Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.nju.cs.workflow.aspect.model.impl.AspectImpl
	 * @see cn.edu.nju.cs.workflow.aspect.model.impl.AspectPackageImpl#getAspect()
	 * @generated
	 */
	int ASPECT = 1;

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
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__TRANSITIONS = BPELPackage.BPEL_EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Join Transitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__JOIN_TRANSITIONS = BPELPackage.BPEL_EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Advice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__ADVICE = BPELPackage.BPEL_EXTENSIBLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_FEATURE_COUNT = BPELPackage.BPEL_EXTENSIBLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int ASPECT___GET_ENCLOSING_DEFINITION = BPELPackage.BPEL_EXTENSIBLE_ELEMENT___GET_ENCLOSING_DEFINITION;

	/**
	 * The operation id for the '<em>Set Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int ASPECT___SET_ENCLOSING_DEFINITION__DEFINITION = BPELPackage.BPEL_EXTENSIBLE_ELEMENT___SET_ENCLOSING_DEFINITION__DEFINITION;

	/**
	 * The operation id for the '<em>Get Extensibility Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int ASPECT___GET_EXTENSIBILITY_ELEMENTS = BPELPackage.BPEL_EXTENSIBLE_ELEMENT___GET_EXTENSIBILITY_ELEMENTS;

	/**
	 * The operation id for the '<em>Add Extensibility Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int ASPECT___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT = BPELPackage.BPEL_EXTENSIBLE_ELEMENT___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT;

	/**
	 * The operation id for the '<em>Get Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int ASPECT___GET_EXTENSION_ATTRIBUTE__QNAME = BPELPackage.BPEL_EXTENSIBLE_ELEMENT___GET_EXTENSION_ATTRIBUTE__QNAME;

	/**
	 * The operation id for the '<em>Set Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int ASPECT___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT = BPELPackage.BPEL_EXTENSIBLE_ELEMENT___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT;

	/**
	 * The operation id for the '<em>Get Extension Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int ASPECT___GET_EXTENSION_ATTRIBUTES = BPELPackage.BPEL_EXTENSIBLE_ELEMENT___GET_EXTENSION_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get Native Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int ASPECT___GET_NATIVE_ATTRIBUTE_NAMES = BPELPackage.BPEL_EXTENSIBLE_ELEMENT___GET_NATIVE_ATTRIBUTE_NAMES;

	/**
	 * The number of operations of the '<em>Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int ASPECT_OPERATION_COUNT = BPELPackage.BPEL_EXTENSIBLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cn.edu.nju.cs.workflow.aspect.model.impl.TransitionsImpl <em>Transitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.nju.cs.workflow.aspect.model.impl.TransitionsImpl
	 * @see cn.edu.nju.cs.workflow.aspect.model.impl.AspectPackageImpl#getTransitions()
	 * @generated
	 */
	int TRANSITIONS = 2;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITIONS__DOCUMENTATION_ELEMENT = BPELPackage.BPEL_EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITIONS__ELEMENT = BPELPackage.BPEL_EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITIONS__EEXTENSIBILITY_ELEMENTS = BPELPackage.BPEL_EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITIONS__DOCUMENTATION = BPELPackage.BPEL_EXTENSIBLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITIONS__CHILDREN = BPELPackage.BPEL_EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITIONS__NAME = BPELPackage.BPEL_EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITIONS_FEATURE_COUNT = BPELPackage.BPEL_EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int TRANSITIONS___GET_ENCLOSING_DEFINITION = BPELPackage.BPEL_EXTENSIBLE_ELEMENT___GET_ENCLOSING_DEFINITION;

	/**
	 * The operation id for the '<em>Set Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int TRANSITIONS___SET_ENCLOSING_DEFINITION__DEFINITION = BPELPackage.BPEL_EXTENSIBLE_ELEMENT___SET_ENCLOSING_DEFINITION__DEFINITION;

	/**
	 * The operation id for the '<em>Get Extensibility Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int TRANSITIONS___GET_EXTENSIBILITY_ELEMENTS = BPELPackage.BPEL_EXTENSIBLE_ELEMENT___GET_EXTENSIBILITY_ELEMENTS;

	/**
	 * The operation id for the '<em>Add Extensibility Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int TRANSITIONS___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT = BPELPackage.BPEL_EXTENSIBLE_ELEMENT___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT;

	/**
	 * The operation id for the '<em>Get Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int TRANSITIONS___GET_EXTENSION_ATTRIBUTE__QNAME = BPELPackage.BPEL_EXTENSIBLE_ELEMENT___GET_EXTENSION_ATTRIBUTE__QNAME;

	/**
	 * The operation id for the '<em>Set Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int TRANSITIONS___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT = BPELPackage.BPEL_EXTENSIBLE_ELEMENT___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT;

	/**
	 * The operation id for the '<em>Get Extension Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int TRANSITIONS___GET_EXTENSION_ATTRIBUTES = BPELPackage.BPEL_EXTENSIBLE_ELEMENT___GET_EXTENSION_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get Native Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int TRANSITIONS___GET_NATIVE_ATTRIBUTE_NAMES = BPELPackage.BPEL_EXTENSIBLE_ELEMENT___GET_NATIVE_ATTRIBUTE_NAMES;

	/**
	 * The number of operations of the '<em>Transitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int TRANSITIONS_OPERATION_COUNT = BPELPackage.BPEL_EXTENSIBLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cn.edu.nju.cs.workflow.aspect.model.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.nju.cs.workflow.aspect.model.impl.TransitionImpl
	 * @see cn.edu.nju.cs.workflow.aspect.model.impl.AspectPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 3;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__DOCUMENTATION_ELEMENT = BPELPackage.BPEL_EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ELEMENT = BPELPackage.BPEL_EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EEXTENSIBILITY_ELEMENTS = BPELPackage.BPEL_EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__DOCUMENTATION = BPELPackage.BPEL_EXTENSIBLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TYPE = BPELPackage.BPEL_EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Point Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__POINT_NAME = BPELPackage.BPEL_EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = BPELPackage.BPEL_EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = BPELPackage.BPEL_EXTENSIBLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int TRANSITION___GET_ENCLOSING_DEFINITION = BPELPackage.BPEL_EXTENSIBLE_ELEMENT___GET_ENCLOSING_DEFINITION;

	/**
	 * The operation id for the '<em>Set Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int TRANSITION___SET_ENCLOSING_DEFINITION__DEFINITION = BPELPackage.BPEL_EXTENSIBLE_ELEMENT___SET_ENCLOSING_DEFINITION__DEFINITION;

	/**
	 * The operation id for the '<em>Get Extensibility Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int TRANSITION___GET_EXTENSIBILITY_ELEMENTS = BPELPackage.BPEL_EXTENSIBLE_ELEMENT___GET_EXTENSIBILITY_ELEMENTS;

	/**
	 * The operation id for the '<em>Add Extensibility Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int TRANSITION___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT = BPELPackage.BPEL_EXTENSIBLE_ELEMENT___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT;

	/**
	 * The operation id for the '<em>Get Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int TRANSITION___GET_EXTENSION_ATTRIBUTE__QNAME = BPELPackage.BPEL_EXTENSIBLE_ELEMENT___GET_EXTENSION_ATTRIBUTE__QNAME;

	/**
	 * The operation id for the '<em>Set Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int TRANSITION___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT = BPELPackage.BPEL_EXTENSIBLE_ELEMENT___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT;

	/**
	 * The operation id for the '<em>Get Extension Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int TRANSITION___GET_EXTENSION_ATTRIBUTES = BPELPackage.BPEL_EXTENSIBLE_ELEMENT___GET_EXTENSION_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get Native Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int TRANSITION___GET_NATIVE_ATTRIBUTE_NAMES = BPELPackage.BPEL_EXTENSIBLE_ELEMENT___GET_NATIVE_ATTRIBUTE_NAMES;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int TRANSITION_OPERATION_COUNT = BPELPackage.BPEL_EXTENSIBLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cn.edu.nju.cs.workflow.aspect.model.impl.AdviceImpl <em>Advice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.nju.cs.workflow.aspect.model.impl.AdviceImpl
	 * @see cn.edu.nju.cs.workflow.aspect.model.impl.AspectPackageImpl#getAdvice()
	 * @generated
	 */
	int ADVICE = 4;

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
	 * The number of structural features of the '<em>Advice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_FEATURE_COUNT = BPELPackage.PROCESS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int ADVICE___GET_ENCLOSING_DEFINITION = BPELPackage.PROCESS___GET_ENCLOSING_DEFINITION;

	/**
	 * The operation id for the '<em>Set Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int ADVICE___SET_ENCLOSING_DEFINITION__DEFINITION = BPELPackage.PROCESS___SET_ENCLOSING_DEFINITION__DEFINITION;

	/**
	 * The operation id for the '<em>Get Extensibility Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int ADVICE___GET_EXTENSIBILITY_ELEMENTS = BPELPackage.PROCESS___GET_EXTENSIBILITY_ELEMENTS;

	/**
	 * The operation id for the '<em>Add Extensibility Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int ADVICE___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT = BPELPackage.PROCESS___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT;

	/**
	 * The operation id for the '<em>Get Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int ADVICE___GET_EXTENSION_ATTRIBUTE__QNAME = BPELPackage.PROCESS___GET_EXTENSION_ATTRIBUTE__QNAME;

	/**
	 * The operation id for the '<em>Set Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int ADVICE___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT = BPELPackage.PROCESS___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT;

	/**
	 * The operation id for the '<em>Get Extension Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int ADVICE___GET_EXTENSION_ATTRIBUTES = BPELPackage.PROCESS___GET_EXTENSION_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get Native Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int ADVICE___GET_NATIVE_ATTRIBUTE_NAMES = BPELPackage.PROCESS___GET_NATIVE_ATTRIBUTE_NAMES;

	/**
	 * The number of operations of the '<em>Advice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int ADVICE_OPERATION_COUNT = BPELPackage.PROCESS_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link cn.edu.nju.cs.workflow.aspect.model.Aspects <em>Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aspects</em>'.
	 * @see cn.edu.nju.cs.workflow.aspect.model.Aspects
	 * @generated
	 */
	EClass getAspects();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.nju.cs.workflow.aspect.model.Aspects#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cn.edu.nju.cs.workflow.aspect.model.Aspects#getName()
	 * @see #getAspects()
	 * @generated
	 */
	EAttribute getAspects_Name();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.nju.cs.workflow.aspect.model.Aspects#getTargetnamespace <em>Targetnamespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Targetnamespace</em>'.
	 * @see cn.edu.nju.cs.workflow.aspect.model.Aspects#getTargetnamespace()
	 * @see #getAspects()
	 * @generated
	 */
	EAttribute getAspects_Targetnamespace();

	/**
	 * Returns the meta object for the containment reference list '{@link cn.edu.nju.cs.workflow.aspect.model.Aspects#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see cn.edu.nju.cs.workflow.aspect.model.Aspects#getChildren()
	 * @see #getAspects()
	 * @generated
	 */
	EReference getAspects_Children();

	/**
	 * Returns the meta object for class '{@link cn.edu.nju.cs.workflow.aspect.model.Aspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aspect</em>'.
	 * @see cn.edu.nju.cs.workflow.aspect.model.Aspect
	 * @generated
	 */
	EClass getAspect();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.nju.cs.workflow.aspect.model.Aspect#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cn.edu.nju.cs.workflow.aspect.model.Aspect#getName()
	 * @see #getAspect()
	 * @generated
	 */
	EAttribute getAspect_Name();

	/**
	 * Returns the meta object for the containment reference '{@link cn.edu.nju.cs.workflow.aspect.model.Aspect#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transitions</em>'.
	 * @see cn.edu.nju.cs.workflow.aspect.model.Aspect#getTransitions()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_Transitions();

	/**
	 * Returns the meta object for the containment reference '{@link cn.edu.nju.cs.workflow.aspect.model.Aspect#getJoinTransitions <em>Join Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Join Transitions</em>'.
	 * @see cn.edu.nju.cs.workflow.aspect.model.Aspect#getJoinTransitions()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_JoinTransitions();

	/**
	 * Returns the meta object for the containment reference '{@link cn.edu.nju.cs.workflow.aspect.model.Aspect#getAdvice <em>Advice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Advice</em>'.
	 * @see cn.edu.nju.cs.workflow.aspect.model.Aspect#getAdvice()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_Advice();

	/**
	 * Returns the meta object for class '{@link cn.edu.nju.cs.workflow.aspect.model.Transitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transitions</em>'.
	 * @see cn.edu.nju.cs.workflow.aspect.model.Transitions
	 * @generated
	 */
	EClass getTransitions();

	/**
	 * Returns the meta object for the containment reference list '{@link cn.edu.nju.cs.workflow.aspect.model.Transitions#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see cn.edu.nju.cs.workflow.aspect.model.Transitions#getChildren()
	 * @see #getTransitions()
	 * @generated
	 */
	EReference getTransitions_Children();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.nju.cs.workflow.aspect.model.Transitions#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cn.edu.nju.cs.workflow.aspect.model.Transitions#getName()
	 * @see #getTransitions()
	 * @generated
	 */
	EAttribute getTransitions_Name();

	/**
	 * Returns the meta object for class '{@link cn.edu.nju.cs.workflow.aspect.model.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see cn.edu.nju.cs.workflow.aspect.model.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.nju.cs.workflow.aspect.model.Transition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see cn.edu.nju.cs.workflow.aspect.model.Transition#getType()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Type();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.nju.cs.workflow.aspect.model.Transition#getPointName <em>Point Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Point Name</em>'.
	 * @see cn.edu.nju.cs.workflow.aspect.model.Transition#getPointName()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_PointName();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.nju.cs.workflow.aspect.model.Transition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cn.edu.nju.cs.workflow.aspect.model.Transition#getName()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Name();

	/**
	 * Returns the meta object for class '{@link cn.edu.nju.cs.workflow.aspect.model.Advice <em>Advice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advice</em>'.
	 * @see cn.edu.nju.cs.workflow.aspect.model.Advice
	 * @generated
	 */
	EClass getAdvice();

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
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link cn.edu.nju.cs.workflow.aspect.model.impl.AspectsImpl <em>Aspects</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.nju.cs.workflow.aspect.model.impl.AspectsImpl
		 * @see cn.edu.nju.cs.workflow.aspect.model.impl.AspectPackageImpl#getAspects()
		 * @generated
		 */
		EClass ASPECTS = eINSTANCE.getAspects();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASPECTS__NAME = eINSTANCE.getAspects_Name();

		/**
		 * The meta object literal for the '<em><b>Targetnamespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASPECTS__TARGETNAMESPACE = eINSTANCE.getAspects_Targetnamespace();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECTS__CHILDREN = eINSTANCE.getAspects_Children();

		/**
		 * The meta object literal for the '{@link cn.edu.nju.cs.workflow.aspect.model.impl.AspectImpl <em>Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.nju.cs.workflow.aspect.model.impl.AspectImpl
		 * @see cn.edu.nju.cs.workflow.aspect.model.impl.AspectPackageImpl#getAspect()
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
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__TRANSITIONS = eINSTANCE.getAspect_Transitions();

		/**
		 * The meta object literal for the '<em><b>Join Transitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__JOIN_TRANSITIONS = eINSTANCE.getAspect_JoinTransitions();

		/**
		 * The meta object literal for the '<em><b>Advice</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__ADVICE = eINSTANCE.getAspect_Advice();

		/**
		 * The meta object literal for the '{@link cn.edu.nju.cs.workflow.aspect.model.impl.TransitionsImpl <em>Transitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.nju.cs.workflow.aspect.model.impl.TransitionsImpl
		 * @see cn.edu.nju.cs.workflow.aspect.model.impl.AspectPackageImpl#getTransitions()
		 * @generated
		 */
		EClass TRANSITIONS = eINSTANCE.getTransitions();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITIONS__CHILDREN = eINSTANCE.getTransitions_Children();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITIONS__NAME = eINSTANCE.getTransitions_Name();

		/**
		 * The meta object literal for the '{@link cn.edu.nju.cs.workflow.aspect.model.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.nju.cs.workflow.aspect.model.impl.TransitionImpl
		 * @see cn.edu.nju.cs.workflow.aspect.model.impl.AspectPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__TYPE = eINSTANCE.getTransition_Type();

		/**
		 * The meta object literal for the '<em><b>Point Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__POINT_NAME = eINSTANCE.getTransition_PointName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__NAME = eINSTANCE.getTransition_Name();

		/**
		 * The meta object literal for the '{@link cn.edu.nju.cs.workflow.aspect.model.impl.AdviceImpl <em>Advice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.nju.cs.workflow.aspect.model.impl.AdviceImpl
		 * @see cn.edu.nju.cs.workflow.aspect.model.impl.AspectPackageImpl#getAdvice()
		 * @generated
		 */
		EClass ADVICE = eINSTANCE.getAdvice();

	}

} //AspectPackage
