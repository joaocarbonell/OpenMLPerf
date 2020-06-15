/**
 */
package canopus.canopusPerformanceScenario.tests;

import canopus.canopusPerformanceScenario.CanopusPerformanceScenarioFactory;
import canopus.canopusPerformanceScenario.Workload;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Workload</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkloadTest extends TestCase {

	/**
	 * The fixture for this Workload test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Workload fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WorkloadTest.class);
	}

	/**
	 * Constructs a new Workload test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkloadTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Workload test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Workload fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Workload test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Workload getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CanopusPerformanceScenarioFactory.eINSTANCE.createWorkload());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //WorkloadTest
