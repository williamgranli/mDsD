/**
 */
package Staff;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Staff.StaffPackage
 * @generated
 */
public interface StaffFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StaffFactory eINSTANCE = Staff.impl.StaffFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	StaffComponent createStaffComponent();

	/**
	 * Returns a new object of class '<em>Component Account Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Account Manager</em>'.
	 * @generated
	 */
	StaffComponent_AccountManager createStaffComponent_AccountManager();

	/**
	 * Returns a new object of class '<em>Component Employee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Employee</em>'.
	 * @generated
	 */
	StaffComponent_Employee createStaffComponent_Employee();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StaffPackage getStaffPackage();

} //StaffFactory
