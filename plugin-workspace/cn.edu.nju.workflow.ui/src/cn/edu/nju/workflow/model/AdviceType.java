/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.nju.workflow.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Advice Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cn.edu.nju.workflow.model.ModelPackage#getAdviceType()
 * @model
 * @generated
 */
public final class AdviceType extends AbstractEnumerator {
	/**
	 * The '<em><b>Before</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Before</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEFORE_LITERAL
	 * @model name="before"
	 * @generated
	 * @ordered
	 */
	public static final int BEFORE = 0;

	/**
	 * The '<em><b>Around soapmessagein</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Around soapmessagein</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AROUND_SOAPMESSAGEIN_LITERAL
	 * @model name="around_soapmessagein"
	 * @generated
	 * @ordered
	 */
	public static final int AROUND_SOAPMESSAGEIN = 1;

	/**
	 * The '<em><b>After soapmessagein</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>After soapmessagein</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AFTER_SOAPMESSAGEIN_LITERAL
	 * @model name="after_soapmessagein"
	 * @generated
	 * @ordered
	 */
	public static final int AFTER_SOAPMESSAGEIN = 2;

	/**
	 * The '<em><b>Around</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Around</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AROUND_LITERAL
	 * @model name="around"
	 * @generated
	 * @ordered
	 */
	public static final int AROUND = 3;

	/**
	 * The '<em><b>Before soapmessageout</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Before soapmessageout</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEFORE_SOAPMESSAGEOUT_LITERAL
	 * @model name="before_soapmessageout"
	 * @generated
	 * @ordered
	 */
	public static final int BEFORE_SOAPMESSAGEOUT = 4;

	/**
	 * The '<em><b>Around soapmessageout</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Around soapmessageout</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AROUND_SOAPMESSAGEOUT_LITERAL
	 * @model name="around_soapmessageout"
	 * @generated
	 * @ordered
	 */
	public static final int AROUND_SOAPMESSAGEOUT = 5;

	/**
	 * The '<em><b>After</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>After</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AFTER_LITERAL
	 * @model name="after"
	 * @generated
	 * @ordered
	 */
	public static final int AFTER = 6;

	/**
	 * The '<em><b>Before</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEFORE
	 * @generated
	 * @ordered
	 */
	public static final AdviceType BEFORE_LITERAL = new AdviceType(BEFORE, "before", "before");

	/**
	 * The '<em><b>Around soapmessagein</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AROUND_SOAPMESSAGEIN
	 * @generated
	 * @ordered
	 */
	public static final AdviceType AROUND_SOAPMESSAGEIN_LITERAL = new AdviceType(AROUND_SOAPMESSAGEIN, "around_soapmessagein", "around_soapmessagein");

	/**
	 * The '<em><b>After soapmessagein</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFTER_SOAPMESSAGEIN
	 * @generated
	 * @ordered
	 */
	public static final AdviceType AFTER_SOAPMESSAGEIN_LITERAL = new AdviceType(AFTER_SOAPMESSAGEIN, "after_soapmessagein", "after_soapmessagein");

	/**
	 * The '<em><b>Around</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AROUND
	 * @generated
	 * @ordered
	 */
	public static final AdviceType AROUND_LITERAL = new AdviceType(AROUND, "around", "around");

	/**
	 * The '<em><b>Before soapmessageout</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEFORE_SOAPMESSAGEOUT
	 * @generated
	 * @ordered
	 */
	public static final AdviceType BEFORE_SOAPMESSAGEOUT_LITERAL = new AdviceType(BEFORE_SOAPMESSAGEOUT, "before_soapmessageout", "before_soapmessageout");

	/**
	 * The '<em><b>Around soapmessageout</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AROUND_SOAPMESSAGEOUT
	 * @generated
	 * @ordered
	 */
	public static final AdviceType AROUND_SOAPMESSAGEOUT_LITERAL = new AdviceType(AROUND_SOAPMESSAGEOUT, "around_soapmessageout", "around_soapmessageout");

	/**
	 * The '<em><b>After</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFTER
	 * @generated
	 * @ordered
	 */
	public static final AdviceType AFTER_LITERAL = new AdviceType(AFTER, "after", "after");

	/**
	 * An array of all the '<em><b>Advice Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AdviceType[] VALUES_ARRAY =
		new AdviceType[] {
			BEFORE_LITERAL,
			AROUND_SOAPMESSAGEIN_LITERAL,
			AFTER_SOAPMESSAGEIN_LITERAL,
			AROUND_LITERAL,
			BEFORE_SOAPMESSAGEOUT_LITERAL,
			AROUND_SOAPMESSAGEOUT_LITERAL,
			AFTER_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Advice Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

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
			case BEFORE: return BEFORE_LITERAL;
			case AROUND_SOAPMESSAGEIN: return AROUND_SOAPMESSAGEIN_LITERAL;
			case AFTER_SOAPMESSAGEIN: return AFTER_SOAPMESSAGEIN_LITERAL;
			case AROUND: return AROUND_LITERAL;
			case BEFORE_SOAPMESSAGEOUT: return BEFORE_SOAPMESSAGEOUT_LITERAL;
			case AROUND_SOAPMESSAGEOUT: return AROUND_SOAPMESSAGEOUT_LITERAL;
			case AFTER: return AFTER_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AdviceType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //AdviceType
