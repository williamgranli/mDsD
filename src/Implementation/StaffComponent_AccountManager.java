/**
 */
package Implementation;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Staff Component Account Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Implementation.StaffComponent_AccountManager#getIAuthentication <em>IAuthentication</em>}</li>
 *   <li>{@link Implementation.StaffComponent_AccountManager#getLoggedIn <em>Logged In</em>}</li>
 *   <li>{@link Implementation.StaffComponent_AccountManager#getEmployees <em>Employees</em>}</li>
 * </ul>
 * </p>
 *
 * @see Implementation.ImplementationPackage#getStaffComponent_AccountManager()
 * @model
 * @generated
 */
public interface StaffComponent_AccountManager extends StaffComponent_IAuthentication, StaffComponent_IAccountAdministration {
	/**
	 * Returns the value of the '<em><b>IAuthentication</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IAuthentication</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IAuthentication</em>' reference.
	 * @see #setIAuthentication(StaffComponent_IAuthentication)
	 * @see Implementation.ImplementationPackage#getStaffComponent_AccountManager_IAuthentication()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StaffComponent_IAuthentication getIAuthentication();

	/**
	 * Sets the value of the '{@link Implementation.StaffComponent_AccountManager#getIAuthentication <em>IAuthentication</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IAuthentication</em>' reference.
	 * @see #getIAuthentication()
	 * @generated
	 */
	void setIAuthentication(StaffComponent_IAuthentication value);

	/**
	 * Returns the value of the '<em><b>Logged In</b></em>' reference list.
	 * The list contents are of type {@link Implementation.StaffComponent_Employee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logged In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logged In</em>' reference list.
	 * @see Implementation.ImplementationPackage#getStaffComponent_AccountManager_LoggedIn()
	 * @model ordered="false"
	 * @generated
	 */
	EList<StaffComponent_Employee> getLoggedIn();

	/**
	 * Returns the value of the '<em><b>Employees</b></em>' reference list.
	 * The list contents are of type {@link Implementation.StaffComponent_Employee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employees</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employees</em>' reference list.
	 * @see Implementation.ImplementationPackage#getStaffComponent_AccountManager_Employees()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<StaffComponent_Employee> getEmployees();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" ssnDataType="org.eclipse.uml2.types.String" ssnRequired="true" ssnOrdered="false"
	 * @generated
	 */
	StaffComponent_Employee findAccount(String ssn);

} // StaffComponent_AccountManager
