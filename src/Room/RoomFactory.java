/**
 */
package Room;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Room.RoomPackage
 * @generated
 */
public interface RoomFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RoomFactory eINSTANCE = Room.impl.RoomFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	RoomComponent createRoomComponent();

	/**
	 * Returns a new object of class '<em>Component Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Room</em>'.
	 * @generated
	 */
	RoomComponent_Room createRoomComponent_Room();

	/**
	 * Returns a new object of class '<em>Component Bedroom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Bedroom</em>'.
	 * @generated
	 */
	RoomComponent_Bedroom createRoomComponent_Bedroom();

	/**
	 * Returns a new object of class '<em>Component Conference Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Conference Room</em>'.
	 * @generated
	 */
	RoomComponent_ConferenceRoom createRoomComponent_ConferenceRoom();

	/**
	 * Returns a new object of class '<em>Component Room Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Room Handler</em>'.
	 * @generated
	 */
	RoomComponent_RoomHandler createRoomComponent_RoomHandler();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RoomPackage getRoomPackage();

} //RoomFactory
