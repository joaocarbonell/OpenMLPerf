/**
 */
package canopus.canopusPerformanceMonitoring.canopusPerformanceMetric;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>COUNTER MEMORY</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.CanopusPerformanceMetricPackage#getCOUNTER_MEMORY()
 * @model
 * @generated
 */
public enum COUNTER_MEMORY implements Enumerator {
	/**
	 * The '<em><b>AVALIABLE MBYTES COUNTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVALIABLE_MBYTES_COUNTER_VALUE
	 * @generated
	 * @ordered
	 */
	AVALIABLE_MBYTES_COUNTER(0, "AVALIABLE_MBYTES_COUNTER", "AVALIABLE MBYTES COUNTER"),

	/**
	 * The '<em><b>PAGES SEC COUNTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAGES_SEC_COUNTER_VALUE
	 * @generated
	 * @ordered
	 */
	PAGES_SEC_COUNTER(1, "PAGES_SEC_COUNTER", "PAGES SEC COUNTER"),

	/**
	 * The '<em><b>PAGE READS SEC COUNTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAGE_READS_SEC_COUNTER_VALUE
	 * @generated
	 * @ordered
	 */
	PAGE_READS_SEC_COUNTER(2, "PAGE_READS_SEC_COUNTER", "PAGE READS SEC COUNTER"),

	/**
	 * The '<em><b>WORKING SET COUNTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKING_SET_COUNTER_VALUE
	 * @generated
	 * @ordered
	 */
	WORKING_SET_COUNTER(3, "WORKING_SET_COUNTER", "WORKING SET COUNTER"),

	/**
	 * The '<em><b>POOL NONPAGE BYTES COUNTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POOL_NONPAGE_BYTES_COUNTER_VALUE
	 * @generated
	 * @ordered
	 */
	POOL_NONPAGE_BYTES_COUNTER(4, "POOL_NONPAGE_BYTES_COUNTER", "POOL NONPAGE BYTES COUNTER"),

	/**
	 * The '<em><b>PAGED POOL BYTES COUNTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAGED_POOL_BYTES_COUNTER_VALUE
	 * @generated
	 * @ordered
	 */
	PAGED_POOL_BYTES_COUNTER(5, "PAGED_POOL_BYTES_COUNTER", "PAGED POOL BYTES COUNTER"),

	/**
	 * The '<em><b>PAGED POOL FAILURES COUNTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAGED_POOL_FAILURES_COUNTER_VALUE
	 * @generated
	 * @ordered
	 */
	PAGED_POOL_FAILURES_COUNTER(6, "PAGED_POOL_FAILURES_COUNTER", "PAGED POOL FAILURES COUNTER"),

	/**
	 * The '<em><b>CACHE BYTES COUNTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CACHE_BYTES_COUNTER_VALUE
	 * @generated
	 * @ordered
	 */
	CACHE_BYTES_COUNTER(7, "CACHE_BYTES_COUNTER", "CACHE BYTES COUNTER");

	/**
	 * The '<em><b>AVALIABLE MBYTES COUNTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AVALIABLE MBYTES COUNTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AVALIABLE_MBYTES_COUNTER
	 * @model literal="AVALIABLE MBYTES COUNTER"
	 * @generated
	 * @ordered
	 */
	public static final int AVALIABLE_MBYTES_COUNTER_VALUE = 0;

	/**
	 * The '<em><b>PAGES SEC COUNTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PAGES SEC COUNTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAGES_SEC_COUNTER
	 * @model literal="PAGES SEC COUNTER"
	 * @generated
	 * @ordered
	 */
	public static final int PAGES_SEC_COUNTER_VALUE = 1;

	/**
	 * The '<em><b>PAGE READS SEC COUNTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PAGE READS SEC COUNTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAGE_READS_SEC_COUNTER
	 * @model literal="PAGE READS SEC COUNTER"
	 * @generated
	 * @ordered
	 */
	public static final int PAGE_READS_SEC_COUNTER_VALUE = 2;

	/**
	 * The '<em><b>WORKING SET COUNTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WORKING SET COUNTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WORKING_SET_COUNTER
	 * @model literal="WORKING SET COUNTER"
	 * @generated
	 * @ordered
	 */
	public static final int WORKING_SET_COUNTER_VALUE = 3;

	/**
	 * The '<em><b>POOL NONPAGE BYTES COUNTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POOL NONPAGE BYTES COUNTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POOL_NONPAGE_BYTES_COUNTER
	 * @model literal="POOL NONPAGE BYTES COUNTER"
	 * @generated
	 * @ordered
	 */
	public static final int POOL_NONPAGE_BYTES_COUNTER_VALUE = 4;

	/**
	 * The '<em><b>PAGED POOL BYTES COUNTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PAGED POOL BYTES COUNTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAGED_POOL_BYTES_COUNTER
	 * @model literal="PAGED POOL BYTES COUNTER"
	 * @generated
	 * @ordered
	 */
	public static final int PAGED_POOL_BYTES_COUNTER_VALUE = 5;

	/**
	 * The '<em><b>PAGED POOL FAILURES COUNTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PAGED POOL FAILURES COUNTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAGED_POOL_FAILURES_COUNTER
	 * @model literal="PAGED POOL FAILURES COUNTER"
	 * @generated
	 * @ordered
	 */
	public static final int PAGED_POOL_FAILURES_COUNTER_VALUE = 6;

	/**
	 * The '<em><b>CACHE BYTES COUNTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CACHE BYTES COUNTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CACHE_BYTES_COUNTER
	 * @model literal="CACHE BYTES COUNTER"
	 * @generated
	 * @ordered
	 */
	public static final int CACHE_BYTES_COUNTER_VALUE = 7;

	/**
	 * An array of all the '<em><b>COUNTER MEMORY</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final COUNTER_MEMORY[] VALUES_ARRAY =
		new COUNTER_MEMORY[] {
			AVALIABLE_MBYTES_COUNTER,
			PAGES_SEC_COUNTER,
			PAGE_READS_SEC_COUNTER,
			WORKING_SET_COUNTER,
			POOL_NONPAGE_BYTES_COUNTER,
			PAGED_POOL_BYTES_COUNTER,
			PAGED_POOL_FAILURES_COUNTER,
			CACHE_BYTES_COUNTER,
		};

	/**
	 * A public read-only list of all the '<em><b>COUNTER MEMORY</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<COUNTER_MEMORY> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>COUNTER MEMORY</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static COUNTER_MEMORY get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			COUNTER_MEMORY result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>COUNTER MEMORY</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static COUNTER_MEMORY getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			COUNTER_MEMORY result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>COUNTER MEMORY</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static COUNTER_MEMORY get(int value) {
		switch (value) {
			case AVALIABLE_MBYTES_COUNTER_VALUE: return AVALIABLE_MBYTES_COUNTER;
			case PAGES_SEC_COUNTER_VALUE: return PAGES_SEC_COUNTER;
			case PAGE_READS_SEC_COUNTER_VALUE: return PAGE_READS_SEC_COUNTER;
			case WORKING_SET_COUNTER_VALUE: return WORKING_SET_COUNTER;
			case POOL_NONPAGE_BYTES_COUNTER_VALUE: return POOL_NONPAGE_BYTES_COUNTER;
			case PAGED_POOL_BYTES_COUNTER_VALUE: return PAGED_POOL_BYTES_COUNTER;
			case PAGED_POOL_FAILURES_COUNTER_VALUE: return PAGED_POOL_FAILURES_COUNTER;
			case CACHE_BYTES_COUNTER_VALUE: return CACHE_BYTES_COUNTER;
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
	private COUNTER_MEMORY(int value, String name, String literal) {
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
	
} //COUNTER_MEMORY
