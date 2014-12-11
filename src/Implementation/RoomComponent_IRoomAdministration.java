/**
 */
package Implementation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Component IRoom Administration</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Implementation.ImplementationPackage#getRoomComponent_IRoomAdministration()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface RoomComponent_IRoomAdministration extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomNumberDataType="org.eclipse.uml2.types.Integer" roomNumberRequired="true" roomNumberOrdered="false" usableDataType="org.eclipse.uml2.types.Boolean" usableRequired="true" usableOrdered="false" priceDataType="org.eclipse.uml2.types.Integer" priceRequired="true" priceOrdered="false" roomTypeNameDataType="org.eclipse.uml2.types.String" roomTypeNameRequired="true" roomTypeNameOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false"
	 * @generated
	 */
	void createRoom(int roomNumber, boolean usable, int price, String roomTypeName, String description);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomNumberDataType="org.eclipse.uml2.types.Integer" roomNumberRequired="true" roomNumberOrdered="false" usableDataType="org.eclipse.uml2.types.Boolean" usableRequired="true" usableOrdered="false" priceDataType="org.eclipse.uml2.types.Integer" priceRequired="true" priceOrdered="false" roomTypeNameRequired="true" roomTypeNameOrdered="false" descriptionRequired="true" descriptionOrdered="false"
	 * @generated
	 */
	void editRoom(int roomNumber, boolean usable, int price, String roomTypeName, String description);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomNumberDataType="org.eclipse.uml2.types.Integer" roomNumberRequired="true" roomNumberOrdered="false"
	 * @generated
	 */
	void remove(int roomNumber);

} // RoomComponent_IRoomAdministration
