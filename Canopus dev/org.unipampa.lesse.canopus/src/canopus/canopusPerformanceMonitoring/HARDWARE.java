/**
 */
package canopus.canopusPerformanceMonitoring;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>HARDWARE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringPackage#getHARDWARE()
 * @model
 * @generated
 */
public enum HARDWARE implements Enumerator {
	/**
	 * The '<em><b>PHYSICAL MACHINE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHYSICAL_MACHINE_VALUE
	 * @generated
	 * @ordered
	 */
	PHYSICAL_MACHINE(0, "PHYSICAL_MACHINE", "Physical Machine (PM)"),

	/**
	 * The '<em><b>VIRTUAL MACHINE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIRTUAL_MACHINE_VALUE
	 * @generated
	 * @ordered
	 */
	VIRTUAL_MACHINE(1, "VIRTUAL_MACHINE", "Virtual Machine(VM)"),

	/**
	 * The '<em><b>CLOUD SERVICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOUD_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	CLOUD_SERVICE(2, "CLOUD_SERVICE", "Cloud Service(CS)");

	/**
	 * The '<em><b>PHYSICAL MACHINE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PHYSICAL MACHINE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHYSICAL_MACHINE
	 * @model literal="Physical Machine (PM)"
	 * @generated
	 * @ordered
	 */
	public static final int PHYSICAL_MACHINE_VALUE = 0;

	/**
	 * The '<em><b>VIRTUAL MACHINE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VIRTUAL MACHINE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VIRTUAL_MACHINE
	 * @model literal="Virtual Machine(VM)"
	 * @generated
	 * @ordered
	 */
	public static final int VIRTUAL_MACHINE_VALUE = 1;

	/**
	 * The '<em><b>CLOUD SERVICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLOUD SERVICE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLOUD_SERVICE
	 * @model literal="Cloud Service(CS)"
	 * @generated
	 * @ordered
	 */
	public static final int CLOUD_SERVICE_VALUE = 2;

	/**
	 * An array of all the '<em><b>HARDWARE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HARDWARE[] VALUES_ARRAY =
		new HARDWARE[] {
			PHYSICAL_MACHINE,
			VIRTUAL_MACHINE,
			CLOUD_SERVICE,
		};

	/**
	 * A public read-only list of all the '<em><b>HARDWARE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HARDWARE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>HARDWARE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HARDWARE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HARDWARE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>HARDWARE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HARDWARE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HARDWARE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>HARDWARE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HARDWARE get(int value) {
		switch (value) {
			case PHYSICAL_MACHINE_VALUE: return PHYSICAL_MACHINE;
			case VIRTUAL_MACHINE_VALUE: return VIRTUAL_MACHINE;
			case CLOUD_SERVICE_VALUE: return CLOUD_SERVICE;
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
	private HARDWARE(int value, String name, String literal) {
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
	
} //HARDWARE
