/**
 */
package canopus.canopusPerformanceMonitoring.canopusPerformanceMetric;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>COUNTER TRANSACTION</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.CanopusPerformanceMetricPackage#getCOUNTER_TRANSACTION()
 * @model
 * @generated
 */
public enum COUNTER_TRANSACTION implements Enumerator {
	/**
	 * The '<em><b>TRANSACTION RESPONSE TIME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSACTION_RESPONSE_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSACTION_RESPONSE_TIME(0, "TRANSACTION_RESPONSE_TIME", "TRANSACTION RESPONSE TIME"),

	/**
	 * The '<em><b>TRANSACTION PER SECOND TPS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSACTION_PER_SECOND_TPS_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSACTION_PER_SECOND_TPS(1, "TRANSACTION_PER_SECOND_TPS", "TRANSACTION PER SECOND (TPS)"),

	/**
	 * The '<em><b>TRANSACTION SUCCESS RATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSACTION_SUCCESS_RATE_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSACTION_SUCCESS_RATE(2, "TRANSACTION_SUCCESS_RATE", "TRANSACTION SUCCESS RATE");

	/**
	 * The '<em><b>TRANSACTION RESPONSE TIME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRANSACTION RESPONSE TIME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSACTION_RESPONSE_TIME
	 * @model literal="TRANSACTION RESPONSE TIME"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION_RESPONSE_TIME_VALUE = 0;

	/**
	 * The '<em><b>TRANSACTION PER SECOND TPS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRANSACTION PER SECOND TPS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSACTION_PER_SECOND_TPS
	 * @model literal="TRANSACTION PER SECOND (TPS)"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION_PER_SECOND_TPS_VALUE = 1;

	/**
	 * The '<em><b>TRANSACTION SUCCESS RATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRANSACTION SUCCESS RATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSACTION_SUCCESS_RATE
	 * @model literal="TRANSACTION SUCCESS RATE"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION_SUCCESS_RATE_VALUE = 2;

	/**
	 * An array of all the '<em><b>COUNTER TRANSACTION</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final COUNTER_TRANSACTION[] VALUES_ARRAY =
		new COUNTER_TRANSACTION[] {
			TRANSACTION_RESPONSE_TIME,
			TRANSACTION_PER_SECOND_TPS,
			TRANSACTION_SUCCESS_RATE,
		};

	/**
	 * A public read-only list of all the '<em><b>COUNTER TRANSACTION</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<COUNTER_TRANSACTION> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>COUNTER TRANSACTION</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static COUNTER_TRANSACTION get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			COUNTER_TRANSACTION result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>COUNTER TRANSACTION</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static COUNTER_TRANSACTION getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			COUNTER_TRANSACTION result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>COUNTER TRANSACTION</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static COUNTER_TRANSACTION get(int value) {
		switch (value) {
			case TRANSACTION_RESPONSE_TIME_VALUE: return TRANSACTION_RESPONSE_TIME;
			case TRANSACTION_PER_SECOND_TPS_VALUE: return TRANSACTION_PER_SECOND_TPS;
			case TRANSACTION_SUCCESS_RATE_VALUE: return TRANSACTION_SUCCESS_RATE;
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
	private COUNTER_TRANSACTION(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //COUNTER_TRANSACTION
