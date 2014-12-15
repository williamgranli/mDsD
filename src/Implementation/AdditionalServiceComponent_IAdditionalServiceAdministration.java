/**
 */
package Implementation;

import java.util.Date;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additional Service Component IAdditional Service Administration</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Implementation.ImplementationPackage#getAdditionalServiceComponent_IAdditionalServiceAdministration()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AdditionalServiceComponent_IAdditionalServiceAdministration extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false" usableDataType="org.eclipse.uml2.types.Boolean" usableRequired="true" usableOrdered="false" priceDataType="org.eclipse.uml2.types.Integer" priceRequired="true" priceOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false"
	 * @generated
	 */
	void createAdditionalService(String name, boolean usable, int price, String description);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model oldNameDataType="org.eclipse.uml2.types.String" oldNameRequired="true" oldNameOrdered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false" usableDataType="org.eclipse.uml2.types.Boolean" usableRequired="true" usableOrdered="false" priceDataType="org.eclipse.uml2.types.Integer" priceRequired="true" priceOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false"
	 * @generated
	 */
	void editAdditionalService(String oldName, String name, boolean usable, int price, String description);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	void removeAdditionalService(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false" dateTimeRequired="true" dateTimeOrdered="false" locationDataType="org.eclipse.uml2.types.String" locationRequired="true" locationOrdered="false" maxAttendantsDataType="org.eclipse.uml2.types.Integer" maxAttendantsRequired="true" maxAttendantsOrdered="false" currentAttendantsDataType="org.eclipse.uml2.types.Integer" currentAttendantsRequired="true" currentAttendantsOrdered="false"
	 * @generated
	 */
	void createEvent(String name, Date dateTime, String location, int maxAttendants, int currentAttendants);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false" dateTimeRequired="true" dateTimeOrdered="false" locationDataType="org.eclipse.uml2.types.String" locationRequired="true" locationOrdered="false" maxAttendantsDataType="org.eclipse.uml2.types.Integer" maxAttendantsRequired="true" maxAttendantsOrdered="false" currentAttendantsDataType="org.eclipse.uml2.types.Integer" currentAttendantsRequired="true" currentAttendantsOrdered="false"
	 * @generated
	 */
	void editEvent(String name, Date dateTime, String location, int maxAttendants, int currentAttendants);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false" dateRequired="true" dateOrdered="false" locationDataType="org.eclipse.uml2.types.String" locationRequired="true" locationOrdered="false"
	 * @generated
	 */
	void removeEvent(String name, Date date, String location);

} // AdditionalServiceComponent_IAdditionalServiceAdministration
