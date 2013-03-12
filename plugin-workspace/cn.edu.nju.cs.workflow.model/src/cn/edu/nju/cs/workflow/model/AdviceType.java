/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.nju.cs.workflow.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Advice Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cn.edu.nju.cs.workflow.model.ModelPackage#getAdviceType()
 * @model
 * @generated
 */
public enum AdviceType implements Enumerator {
	/**
	 * The '<em><b>Before</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEFORE_VALUE
	 * @generated
	 * @ordered
	 */
	BEFORE(0, "before", "before"),

	/**
	 * The '<em><b>Around soapmessagein</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AROUND_SOAPMESSAGEIN_VALUE
	 * @generated
	 * @ordered
	 */
	AROUND_SOAPMESSAGEIN(1, "around_soapmessagein", "around_soapmessagein"),

	/**
	 * The '<em><b>After soapmessagein</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFTER_SOAPMESSAGEIN_VALUE
	 * @generated
	 * @ordered
	 */
	AFTER_SOAPMESSAGEIN(2, "after_soapmessagein", "after_soapmessagein"),

	/**
	 * The '<em><b>Around</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AROUND_VALUE
	 * @generated
	 * @ordered
	 */
	AROUND(3, "around", "around"),

	/**
	 * The '<em><b>Before soapmessageout</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEFORE_SOAPMESSAGEOUT_VALUE
	 * @generated
	 * @ordered
	 */
	BEFORE_SOAPMESSAGEOUT(4, "before_soapmessageout", "before_soapmessageout"),

	/**
	 * The '<em><b>Around soapmessageout</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AROUND_SOAPMESSAGEOUT_VALUE
	 * @generated
	 * @ordered
	 */
	AROUND_SOAPMESSAGEOUT(5, "around_soapmessageout", "around_soapmessageout"),

	/**
	 * The '<em><b>After</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFTER_VALUE
	 * @generated
	 * @ordered
	 */
	AFTER(6, "after", "after");

	/**
	 * The '<em><b>Before</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Before</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEFORE
	 * @model name="before"
	 * @generated
	 * @ordered
	 */
	public static final int BEFORE_VALUE = 0;

	/**
	 * The '<em><b>Around soapmessagein</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Around soapmessagein</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AROUND_SOAPMESSAGEIN
	 * @model name="around_soapmessagein"
	 * @generated
	 * @ordered
	 */
	public static final int AROUND_SOAPMESSAGEIN_VALUE = 1;

	/**
	 * The '<em><b>After soapmessagein</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>After soapmessagein</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AFTER_SOAPMESSAGEIN
	 * @model name="after_soapmessagein"
	 * @generated
	 * @ordered
	 */
	public static final int AFTER_SOAPMESSAGEIN_VALUE = 2;

	/**
	 * The '<em><b>Around</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Around</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AROUND
	 * @model name="around"
	 * @generated
	 * @ordered
	 */
	public static final int AROUND_VALUE = 3;

	/**
	 * The '<em><b>Before soapmessageout</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Before soapmessageout</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEFORE_SOAPMESSAGEOUT
	 * @model name="before_soapmessageout"
	 * @generated
	 * @ordered
	 */
	public static final int BEFORE_SOAPMESSAGEOUT_VALUE = 4;

	/**
	 * The '<em><b>Around soapmessageout</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Around soapmessageout</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AROUND_SOAPMESSAGEOUT
	 * @model name="around_soapmessageout"
	 * @generated
	 * @ordered
	 */
	public static final int AROUND_SOAPMESSAGEOUT_VALUE = 5;

	/**
	 * The '<em><b>After</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>After</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AFTER
	 * @model name="after"
	 * @generated
	 * @ordered
	 */
	public static final int AFTER_VALUE = 6;

	/**
	 * An array of all the '<em><b>Advice Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AdviceType[] VALUES_ARRAY =
		new AdviceType[] {
			BEFORE,
			AROUND_SOAPMESSAGEIN,
			AFTER_SOAPMESSAGEIN,
			AROUND,
			BEFORE_SOAPMESSAGEOUT,
			AROUND_SOAPMESSAGEOUT,
			AFTER,
		};

	/**
	 * A public read-only list of all the '<em><b>Advice Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AdviceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Advice Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AdviceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AdviceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Advice Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AdviceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AdviceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Advice Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AdviceType get(int value) {
		switch (value) {
			case BEFORE_VALUE: return BEFORE;
			case AROUND_SOAPMESSAGEIN_VALUE: return AROUND_SOAPMESSAGEIN;
			case AFTER_SOAPMESSAGEIN_VALUE: return AFTER_SOAPMESSAGEIN;
			case AROUND_VALUE: return AROUND;
			case BEFORE_SOAPMESSAGEOUT_VALUE: return BEFORE_SOAPMESSAGEOUT;
			case AROUND_SOAPMESSAGEOUT_VALUE: return AROUND_SOAPMESSAGEOUT;
			case AFTER_VALUE: return AFTER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AdviceType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //AdviceType
