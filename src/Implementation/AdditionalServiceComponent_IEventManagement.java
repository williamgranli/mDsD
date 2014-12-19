/**
 */
package Implementation;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additional Service Component IEvent Management</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Implementation.ImplementationPackage#getAdditionalServiceComponent_IEventManagement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AdditionalServiceComponent_IEventManagement extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getServices();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	EList<String> getEvents(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false" dateTimeRequired="true" dateTimeOrdered="false" locationDataType="org.eclipse.uml2.types.String" locationRequired="true" locationOrdered="false" guestsDataType="org.eclipse.uml2.types.Integer" guestsRequired="true" guestsOrdered="false"
	 * @generated
	 */
	boolean addGuestToEvent(String name, Date dateTime, String location, int guests);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false" dateTimeRequired="true" dateTimeOrdered="false" locationDataType="org.eclipse.uml2.types.String" locationRequired="true" locationOrdered="false" guestsDataType="org.eclipse.uml2.types.Integer" guestsRequired="true" guestsOrdered="false"
	 * @generated
	 */
	boolean removeGuestsFromEvent(String name, Date dateTime, String location, int guests);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false" dateTimeRequired="true" dateTimeOrdered="false" locationDataType="org.eclipse.uml2.types.String" locationRequired="true" locationOrdered="false"
	 * @generated
	 */
	int getEventPrice(String name, Date dateTime, String location);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false" dateTimeRequired="true" dateTimeOrdered="false" locationDataType="org.eclipse.uml2.types.String" locationRequired="true" locationOrdered="false"
	 * @generated
	 */
	int getEventMaxAttendants(String name, Date dateTime, String location);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false" dateTimeRequired="true" dateTimeOrdered="false" locationDataType="org.eclipse.uml2.types.String" locationRequired="true" locationOrdered="false"
	 * @generated
	 */
	int getEventCurrentAttendants(String name, Date dateTime, String location);

} // AdditionalServiceComponent_IEventManagement
