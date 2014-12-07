/**
 */
package Staff;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component IAuthentication</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Staff.StaffPackage#getStaffComponent_IAuthentication()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface StaffComponent_IAuthentication extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ssnDataType="org.eclipse.uml2.types.String" ssnRequired="true" ssnOrdered="false" passwordDataType="org.eclipse.uml2.types.String" passwordRequired="true" passwordOrdered="false"
	 * @generated
	 */
	void logIn(String ssn, String password);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ssnDataType="org.eclipse.uml2.types.String" ssnRequired="true" ssnOrdered="false"
	 * @generated
	 */
	void logOut(String ssn);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ssnDataType="org.eclipse.uml2.types.String" ssnRequired="true" ssnOrdered="false"
	 * @generated
	 */
	void isLoggedIn(String ssn);

} // StaffComponent_IAuthentication
