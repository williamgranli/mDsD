/**
 */
package implementation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additional Service Component IAdditional Service Administration</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see implementation.ImplementationPackage#getAdditionalServiceComponent_IAdditionalServiceAdministration()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AdditionalServiceComponent_IAdditionalServiceAdministration extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false" priceDataType="org.eclipse.uml2.types.Integer" priceRequired="true" priceOrdered="false" maxAttendantsDataType="org.eclipse.uml2.types.Integer" maxAttendantsRequired="true" maxAttendantsOrdered="false"
	 * @generated
	 */
	void createAdditionalService(String name, int price, int maxAttendants);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model oldNameDataType="org.eclipse.uml2.types.String" oldNameRequired="true" oldNameOrdered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false" priceDataType="org.eclipse.uml2.types.Integer" priceRequired="true" priceOrdered="false" maxAttendantsDataType="org.eclipse.uml2.types.Integer" maxAttendantsRequired="true" maxAttendantsOrdered="false"
	 * @generated
	 */
	void editAdditionalService(String oldName, String name, int price, int maxAttendants);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	void removeAdditionalService(String name);

} // AdditionalServiceComponent_IAdditionalServiceAdministration
