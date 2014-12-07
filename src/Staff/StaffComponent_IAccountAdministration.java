/**
 */
package Staff;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component IAccount Administration</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Staff.StaffPackage#getStaffComponent_IAccountAdministration()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface StaffComponent_IAccountAdministration extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false" ssnDataType="org.eclipse.uml2.types.String" ssnRequired="true" ssnOrdered="false" emailDataType="org.eclipse.uml2.types.String" emailRequired="true" emailOrdered="false" phoneDataType="org.eclipse.uml2.types.String" phoneRequired="true" phoneOrdered="false" passwordDataType="org.eclipse.uml2.types.String" passwordRequired="true" passwordOrdered="false"
	 * @generated
	 */
	int createAccount(String name, String ssn, String email, String phone, String password);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" ssnDataType="org.eclipse.uml2.types.String" ssnRequired="true" ssnOrdered="false"
	 * @generated
	 */
	String editAccountDetails(String ssn);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ssnDataType="org.eclipse.uml2.types.String" ssnRequired="true" ssnOrdered="false"
	 * @generated
	 */
	void removeAccount(String ssn);

} // StaffComponent_IAccountAdministration
