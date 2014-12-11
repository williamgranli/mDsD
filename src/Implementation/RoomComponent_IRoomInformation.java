/**
 */
package Implementation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Component IRoom Information</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Implementation.ImplementationPackage#getRoomComponent_IRoomInformation()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface RoomComponent_IRoomInformation extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomNumberDataType="org.eclipse.uml2.types.Integer" roomNumberRequired="true" roomNumberOrdered="false"
	 * @generated
	 */
	void getRoomInfo(int roomNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomTypeNameDataType="org.eclipse.uml2.types.String" roomTypeNameRequired="true" roomTypeNameOrdered="false"
	 * @generated
	 */
	void searchRoom(String roomTypeName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getRoomTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getAllRoomNumbers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void countNumberOfTotalRooms();

} // RoomComponent_IRoomInformation
