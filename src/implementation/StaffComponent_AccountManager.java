/**
 */
package implementation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Staff Component Account Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see implementation.ImplementationPackage#getStaffComponent_AccountManager()
 * @model
 * @generated
 */
public interface StaffComponent_AccountManager extends StaffComponent_IAuthentication, StaffComponent_IAccountAdministration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" ssnDataType="org.eclipse.uml2.types.String" ssnRequired="true" ssnOrdered="false"
	 * @generated
	 */
	StaffComponent_Employee findAccount(String ssn);

} // StaffComponent_AccountManager
