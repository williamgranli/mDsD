/**
 */
package Room;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Room.RoomFactory
 * @model kind="package"
 * @generated
 */
public interface RoomPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Room";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///Room.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Room";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RoomPackage eINSTANCE = Room.impl.RoomPackageImpl.init();

	/**
	 * The meta object id for the '{@link Room.impl.RoomComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Room.impl.RoomComponentImpl
	 * @see Room.impl.RoomPackageImpl#getRoomComponent()
	 * @generated
	 */
	int ROOM_COMPONENT = 0;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Room.impl.RoomComponent_RoomImpl <em>Component Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Room.impl.RoomComponent_RoomImpl
	 * @see Room.impl.RoomPackageImpl#getRoomComponent_Room()
	 * @generated
	 */
	int ROOM_COMPONENT_ROOM = 1;

	/**
	 * The feature id for the '<em><b>Room Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_ROOM__ROOM_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Usable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_ROOM__USABLE = 1;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_ROOM__PRICE = 2;

	/**
	 * The feature id for the '<em><b>Room Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_ROOM__ROOM_TYPE_NAME = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_ROOM__DESCRIPTION = 4;

	/**
	 * The number of structural features of the '<em>Component Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_ROOM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Component Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_ROOM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Room.impl.RoomComponent_BedroomImpl <em>Component Bedroom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Room.impl.RoomComponent_BedroomImpl
	 * @see Room.impl.RoomPackageImpl#getRoomComponent_Bedroom()
	 * @generated
	 */
	int ROOM_COMPONENT_BEDROOM = 2;

	/**
	 * The feature id for the '<em><b>Room Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_BEDROOM__ROOM_NUMBER = ROOM_COMPONENT_ROOM__ROOM_NUMBER;

	/**
	 * The feature id for the '<em><b>Usable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_BEDROOM__USABLE = ROOM_COMPONENT_ROOM__USABLE;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_BEDROOM__PRICE = ROOM_COMPONENT_ROOM__PRICE;

	/**
	 * The feature id for the '<em><b>Room Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_BEDROOM__ROOM_TYPE_NAME = ROOM_COMPONENT_ROOM__ROOM_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_BEDROOM__DESCRIPTION = ROOM_COMPONENT_ROOM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Bed Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_BEDROOM__BED_COUNT = ROOM_COMPONENT_ROOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Bedroom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_BEDROOM_FEATURE_COUNT = ROOM_COMPONENT_ROOM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Bedroom</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_BEDROOM___CREATE_BEDROOM__INT_BOOLEAN_INT_STRING_STRING_INT = ROOM_COMPONENT_ROOM_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Edit Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_BEDROOM___EDIT_ROOM__INT_BOOLEAN_INT_STRING_STRING_INT = ROOM_COMPONENT_ROOM_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Component Bedroom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_BEDROOM_OPERATION_COUNT = ROOM_COMPONENT_ROOM_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link Room.impl.RoomComponent_ConferenceRoomImpl <em>Component Conference Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Room.impl.RoomComponent_ConferenceRoomImpl
	 * @see Room.impl.RoomPackageImpl#getRoomComponent_ConferenceRoom()
	 * @generated
	 */
	int ROOM_COMPONENT_CONFERENCE_ROOM = 3;

	/**
	 * The feature id for the '<em><b>Room Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_CONFERENCE_ROOM__ROOM_NUMBER = ROOM_COMPONENT_ROOM__ROOM_NUMBER;

	/**
	 * The feature id for the '<em><b>Usable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_CONFERENCE_ROOM__USABLE = ROOM_COMPONENT_ROOM__USABLE;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_CONFERENCE_ROOM__PRICE = ROOM_COMPONENT_ROOM__PRICE;

	/**
	 * The feature id for the '<em><b>Room Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_CONFERENCE_ROOM__ROOM_TYPE_NAME = ROOM_COMPONENT_ROOM__ROOM_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_CONFERENCE_ROOM__DESCRIPTION = ROOM_COMPONENT_ROOM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Number Of Seats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_CONFERENCE_ROOM__NUMBER_OF_SEATS = ROOM_COMPONENT_ROOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Projector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_CONFERENCE_ROOM__PROJECTOR = ROOM_COMPONENT_ROOM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Conference Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_CONFERENCE_ROOM__CONFERENCE_PHONE = ROOM_COMPONENT_ROOM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Component Conference Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_CONFERENCE_ROOM_FEATURE_COUNT = ROOM_COMPONENT_ROOM_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Create Conference Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_CONFERENCE_ROOM___CREATE_CONFERENCE_ROOM__INT_BOOLEAN_INT_STRING_STRING_INT_BOOLEAN_BOOLEAN = ROOM_COMPONENT_ROOM_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Edit Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_CONFERENCE_ROOM___EDIT_ROOM__INT_BOOLEAN_INT_STRING_STRING_INT_BOOLEAN_BOOLEAN = ROOM_COMPONENT_ROOM_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Component Conference Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_CONFERENCE_ROOM_OPERATION_COUNT = ROOM_COMPONENT_ROOM_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link Room.RoomComponent_IRoomAdministration <em>Component IRoom Administration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Room.RoomComponent_IRoomAdministration
	 * @see Room.impl.RoomPackageImpl#getRoomComponent_IRoomAdministration()
	 * @generated
	 */
	int ROOM_COMPONENT_IROOM_ADMINISTRATION = 4;

	/**
	 * The number of structural features of the '<em>Component IRoom Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_IROOM_ADMINISTRATION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_IROOM_ADMINISTRATION___CREATE_ROOM__INT_BOOLEAN_INT_STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Edit Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_IROOM_ADMINISTRATION___EDIT_ROOM__INT_BOOLEAN_INT_STRING_STRING = 1;

	/**
	 * The operation id for the '<em>Remove</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_IROOM_ADMINISTRATION___REMOVE__INT = 2;

	/**
	 * The number of operations of the '<em>Component IRoom Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_IROOM_ADMINISTRATION_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link Room.RoomComponent_IRoomInformation <em>Component IRoom Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Room.RoomComponent_IRoomInformation
	 * @see Room.impl.RoomPackageImpl#getRoomComponent_IRoomInformation()
	 * @generated
	 */
	int ROOM_COMPONENT_IROOM_INFORMATION = 5;

	/**
	 * The number of structural features of the '<em>Component IRoom Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_IROOM_INFORMATION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Room Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_IROOM_INFORMATION___GET_ROOM_INFO__INT = 0;

	/**
	 * The operation id for the '<em>Search Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_IROOM_INFORMATION___SEARCH_ROOM__STRING = 1;

	/**
	 * The operation id for the '<em>Get Room Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_IROOM_INFORMATION___GET_ROOM_TYPES = 2;

	/**
	 * The operation id for the '<em>Get All Room Numbers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_IROOM_INFORMATION___GET_ALL_ROOM_NUMBERS = 3;

	/**
	 * The operation id for the '<em>Count Number Of Total Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_IROOM_INFORMATION___COUNT_NUMBER_OF_TOTAL_ROOMS = 4;

	/**
	 * The number of operations of the '<em>Component IRoom Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_IROOM_INFORMATION_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link Room.impl.RoomComponent_RoomHandlerImpl <em>Component Room Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Room.impl.RoomComponent_RoomHandlerImpl
	 * @see Room.impl.RoomPackageImpl#getRoomComponent_RoomHandler()
	 * @generated
	 */
	int ROOM_COMPONENT_ROOM_HANDLER = 6;

	/**
	 * The number of structural features of the '<em>Component Room Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_ROOM_HANDLER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Component Room Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_ROOM_HANDLER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link Room.RoomComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see Room.RoomComponent
	 * @generated
	 */
	EClass getRoomComponent();

	/**
	 * Returns the meta object for class '{@link Room.RoomComponent_Room <em>Component Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Room</em>'.
	 * @see Room.RoomComponent_Room
	 * @generated
	 */
	EClass getRoomComponent_Room();

	/**
	 * Returns the meta object for the attribute '{@link Room.RoomComponent_Room#getRoomNumber <em>Room Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Number</em>'.
	 * @see Room.RoomComponent_Room#getRoomNumber()
	 * @see #getRoomComponent_Room()
	 * @generated
	 */
	EAttribute getRoomComponent_Room_RoomNumber();

	/**
	 * Returns the meta object for the attribute '{@link Room.RoomComponent_Room#isUsable <em>Usable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usable</em>'.
	 * @see Room.RoomComponent_Room#isUsable()
	 * @see #getRoomComponent_Room()
	 * @generated
	 */
	EAttribute getRoomComponent_Room_Usable();

	/**
	 * Returns the meta object for the attribute '{@link Room.RoomComponent_Room#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see Room.RoomComponent_Room#getPrice()
	 * @see #getRoomComponent_Room()
	 * @generated
	 */
	EAttribute getRoomComponent_Room_Price();

	/**
	 * Returns the meta object for the attribute '{@link Room.RoomComponent_Room#getRoomTypeName <em>Room Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Type Name</em>'.
	 * @see Room.RoomComponent_Room#getRoomTypeName()
	 * @see #getRoomComponent_Room()
	 * @generated
	 */
	EAttribute getRoomComponent_Room_RoomTypeName();

	/**
	 * Returns the meta object for the attribute '{@link Room.RoomComponent_Room#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Room.RoomComponent_Room#getDescription()
	 * @see #getRoomComponent_Room()
	 * @generated
	 */
	EAttribute getRoomComponent_Room_Description();

	/**
	 * Returns the meta object for class '{@link Room.RoomComponent_Bedroom <em>Component Bedroom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Bedroom</em>'.
	 * @see Room.RoomComponent_Bedroom
	 * @generated
	 */
	EClass getRoomComponent_Bedroom();

	/**
	 * Returns the meta object for the attribute '{@link Room.RoomComponent_Bedroom#getBedCount <em>Bed Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bed Count</em>'.
	 * @see Room.RoomComponent_Bedroom#getBedCount()
	 * @see #getRoomComponent_Bedroom()
	 * @generated
	 */
	EAttribute getRoomComponent_Bedroom_BedCount();

	/**
	 * Returns the meta object for the '{@link Room.RoomComponent_Bedroom#createBedroom(int, boolean, int, java.lang.String, java.lang.String, int) <em>Create Bedroom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Bedroom</em>' operation.
	 * @see Room.RoomComponent_Bedroom#createBedroom(int, boolean, int, java.lang.String, java.lang.String, int)
	 * @generated
	 */
	EOperation getRoomComponent_Bedroom__CreateBedroom__int_boolean_int_String_String_int();

	/**
	 * Returns the meta object for the '{@link Room.RoomComponent_Bedroom#editRoom(int, boolean, int, java.lang.String, java.lang.String, int) <em>Edit Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Room</em>' operation.
	 * @see Room.RoomComponent_Bedroom#editRoom(int, boolean, int, java.lang.String, java.lang.String, int)
	 * @generated
	 */
	EOperation getRoomComponent_Bedroom__EditRoom__int_boolean_int_String_String_int();

	/**
	 * Returns the meta object for class '{@link Room.RoomComponent_ConferenceRoom <em>Component Conference Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Conference Room</em>'.
	 * @see Room.RoomComponent_ConferenceRoom
	 * @generated
	 */
	EClass getRoomComponent_ConferenceRoom();

	/**
	 * Returns the meta object for the attribute '{@link Room.RoomComponent_ConferenceRoom#getNumberOfSeats <em>Number Of Seats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Seats</em>'.
	 * @see Room.RoomComponent_ConferenceRoom#getNumberOfSeats()
	 * @see #getRoomComponent_ConferenceRoom()
	 * @generated
	 */
	EAttribute getRoomComponent_ConferenceRoom_NumberOfSeats();

	/**
	 * Returns the meta object for the attribute '{@link Room.RoomComponent_ConferenceRoom#isProjector <em>Projector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Projector</em>'.
	 * @see Room.RoomComponent_ConferenceRoom#isProjector()
	 * @see #getRoomComponent_ConferenceRoom()
	 * @generated
	 */
	EAttribute getRoomComponent_ConferenceRoom_Projector();

	/**
	 * Returns the meta object for the attribute '{@link Room.RoomComponent_ConferenceRoom#isConferencePhone <em>Conference Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conference Phone</em>'.
	 * @see Room.RoomComponent_ConferenceRoom#isConferencePhone()
	 * @see #getRoomComponent_ConferenceRoom()
	 * @generated
	 */
	EAttribute getRoomComponent_ConferenceRoom_ConferencePhone();

	/**
	 * Returns the meta object for the '{@link Room.RoomComponent_ConferenceRoom#createConferenceRoom(int, boolean, int, java.lang.String, java.lang.String, int, boolean, boolean) <em>Create Conference Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Conference Room</em>' operation.
	 * @see Room.RoomComponent_ConferenceRoom#createConferenceRoom(int, boolean, int, java.lang.String, java.lang.String, int, boolean, boolean)
	 * @generated
	 */
	EOperation getRoomComponent_ConferenceRoom__CreateConferenceRoom__int_boolean_int_String_String_int_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link Room.RoomComponent_ConferenceRoom#editRoom(int, boolean, int, java.lang.String, java.lang.String, int, boolean, boolean) <em>Edit Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Room</em>' operation.
	 * @see Room.RoomComponent_ConferenceRoom#editRoom(int, boolean, int, java.lang.String, java.lang.String, int, boolean, boolean)
	 * @generated
	 */
	EOperation getRoomComponent_ConferenceRoom__EditRoom__int_boolean_int_String_String_int_boolean_boolean();

	/**
	 * Returns the meta object for class '{@link Room.RoomComponent_IRoomAdministration <em>Component IRoom Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component IRoom Administration</em>'.
	 * @see Room.RoomComponent_IRoomAdministration
	 * @generated
	 */
	EClass getRoomComponent_IRoomAdministration();

	/**
	 * Returns the meta object for the '{@link Room.RoomComponent_IRoomAdministration#createRoom(int, boolean, int, java.lang.String, java.lang.String) <em>Create Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Room</em>' operation.
	 * @see Room.RoomComponent_IRoomAdministration#createRoom(int, boolean, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getRoomComponent_IRoomAdministration__CreateRoom__int_boolean_int_String_String();

	/**
	 * Returns the meta object for the '{@link Room.RoomComponent_IRoomAdministration#editRoom(int, boolean, int, java.lang.String, java.lang.String) <em>Edit Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Room</em>' operation.
	 * @see Room.RoomComponent_IRoomAdministration#editRoom(int, boolean, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getRoomComponent_IRoomAdministration__EditRoom__int_boolean_int_String_String();

	/**
	 * Returns the meta object for the '{@link Room.RoomComponent_IRoomAdministration#remove(int) <em>Remove</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove</em>' operation.
	 * @see Room.RoomComponent_IRoomAdministration#remove(int)
	 * @generated
	 */
	EOperation getRoomComponent_IRoomAdministration__Remove__int();

	/**
	 * Returns the meta object for class '{@link Room.RoomComponent_IRoomInformation <em>Component IRoom Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component IRoom Information</em>'.
	 * @see Room.RoomComponent_IRoomInformation
	 * @generated
	 */
	EClass getRoomComponent_IRoomInformation();

	/**
	 * Returns the meta object for the '{@link Room.RoomComponent_IRoomInformation#getRoomInfo(int) <em>Get Room Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Info</em>' operation.
	 * @see Room.RoomComponent_IRoomInformation#getRoomInfo(int)
	 * @generated
	 */
	EOperation getRoomComponent_IRoomInformation__GetRoomInfo__int();

	/**
	 * Returns the meta object for the '{@link Room.RoomComponent_IRoomInformation#searchRoom(java.lang.String) <em>Search Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Room</em>' operation.
	 * @see Room.RoomComponent_IRoomInformation#searchRoom(java.lang.String)
	 * @generated
	 */
	EOperation getRoomComponent_IRoomInformation__SearchRoom__String();

	/**
	 * Returns the meta object for the '{@link Room.RoomComponent_IRoomInformation#getRoomTypes() <em>Get Room Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Types</em>' operation.
	 * @see Room.RoomComponent_IRoomInformation#getRoomTypes()
	 * @generated
	 */
	EOperation getRoomComponent_IRoomInformation__GetRoomTypes();

	/**
	 * Returns the meta object for the '{@link Room.RoomComponent_IRoomInformation#getAllRoomNumbers() <em>Get All Room Numbers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Room Numbers</em>' operation.
	 * @see Room.RoomComponent_IRoomInformation#getAllRoomNumbers()
	 * @generated
	 */
	EOperation getRoomComponent_IRoomInformation__GetAllRoomNumbers();

	/**
	 * Returns the meta object for the '{@link Room.RoomComponent_IRoomInformation#countNumberOfTotalRooms() <em>Count Number Of Total Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Count Number Of Total Rooms</em>' operation.
	 * @see Room.RoomComponent_IRoomInformation#countNumberOfTotalRooms()
	 * @generated
	 */
	EOperation getRoomComponent_IRoomInformation__CountNumberOfTotalRooms();

	/**
	 * Returns the meta object for class '{@link Room.RoomComponent_RoomHandler <em>Component Room Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Room Handler</em>'.
	 * @see Room.RoomComponent_RoomHandler
	 * @generated
	 */
	EClass getRoomComponent_RoomHandler();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RoomFactory getRoomFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Room.impl.RoomComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Room.impl.RoomComponentImpl
		 * @see Room.impl.RoomPackageImpl#getRoomComponent()
		 * @generated
		 */
		EClass ROOM_COMPONENT = eINSTANCE.getRoomComponent();

		/**
		 * The meta object literal for the '{@link Room.impl.RoomComponent_RoomImpl <em>Component Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Room.impl.RoomComponent_RoomImpl
		 * @see Room.impl.RoomPackageImpl#getRoomComponent_Room()
		 * @generated
		 */
		EClass ROOM_COMPONENT_ROOM = eINSTANCE.getRoomComponent_Room();

		/**
		 * The meta object literal for the '<em><b>Room Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_COMPONENT_ROOM__ROOM_NUMBER = eINSTANCE.getRoomComponent_Room_RoomNumber();

		/**
		 * The meta object literal for the '<em><b>Usable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_COMPONENT_ROOM__USABLE = eINSTANCE.getRoomComponent_Room_Usable();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_COMPONENT_ROOM__PRICE = eINSTANCE.getRoomComponent_Room_Price();

		/**
		 * The meta object literal for the '<em><b>Room Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_COMPONENT_ROOM__ROOM_TYPE_NAME = eINSTANCE.getRoomComponent_Room_RoomTypeName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_COMPONENT_ROOM__DESCRIPTION = eINSTANCE.getRoomComponent_Room_Description();

		/**
		 * The meta object literal for the '{@link Room.impl.RoomComponent_BedroomImpl <em>Component Bedroom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Room.impl.RoomComponent_BedroomImpl
		 * @see Room.impl.RoomPackageImpl#getRoomComponent_Bedroom()
		 * @generated
		 */
		EClass ROOM_COMPONENT_BEDROOM = eINSTANCE.getRoomComponent_Bedroom();

		/**
		 * The meta object literal for the '<em><b>Bed Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_COMPONENT_BEDROOM__BED_COUNT = eINSTANCE.getRoomComponent_Bedroom_BedCount();

		/**
		 * The meta object literal for the '<em><b>Create Bedroom</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_COMPONENT_BEDROOM___CREATE_BEDROOM__INT_BOOLEAN_INT_STRING_STRING_INT = eINSTANCE.getRoomComponent_Bedroom__CreateBedroom__int_boolean_int_String_String_int();

		/**
		 * The meta object literal for the '<em><b>Edit Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_COMPONENT_BEDROOM___EDIT_ROOM__INT_BOOLEAN_INT_STRING_STRING_INT = eINSTANCE.getRoomComponent_Bedroom__EditRoom__int_boolean_int_String_String_int();

		/**
		 * The meta object literal for the '{@link Room.impl.RoomComponent_ConferenceRoomImpl <em>Component Conference Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Room.impl.RoomComponent_ConferenceRoomImpl
		 * @see Room.impl.RoomPackageImpl#getRoomComponent_ConferenceRoom()
		 * @generated
		 */
		EClass ROOM_COMPONENT_CONFERENCE_ROOM = eINSTANCE.getRoomComponent_ConferenceRoom();

		/**
		 * The meta object literal for the '<em><b>Number Of Seats</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_COMPONENT_CONFERENCE_ROOM__NUMBER_OF_SEATS = eINSTANCE.getRoomComponent_ConferenceRoom_NumberOfSeats();

		/**
		 * The meta object literal for the '<em><b>Projector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_COMPONENT_CONFERENCE_ROOM__PROJECTOR = eINSTANCE.getRoomComponent_ConferenceRoom_Projector();

		/**
		 * The meta object literal for the '<em><b>Conference Phone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_COMPONENT_CONFERENCE_ROOM__CONFERENCE_PHONE = eINSTANCE.getRoomComponent_ConferenceRoom_ConferencePhone();

		/**
		 * The meta object literal for the '<em><b>Create Conference Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_COMPONENT_CONFERENCE_ROOM___CREATE_CONFERENCE_ROOM__INT_BOOLEAN_INT_STRING_STRING_INT_BOOLEAN_BOOLEAN = eINSTANCE.getRoomComponent_ConferenceRoom__CreateConferenceRoom__int_boolean_int_String_String_int_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Edit Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_COMPONENT_CONFERENCE_ROOM___EDIT_ROOM__INT_BOOLEAN_INT_STRING_STRING_INT_BOOLEAN_BOOLEAN = eINSTANCE.getRoomComponent_ConferenceRoom__EditRoom__int_boolean_int_String_String_int_boolean_boolean();

		/**
		 * The meta object literal for the '{@link Room.RoomComponent_IRoomAdministration <em>Component IRoom Administration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Room.RoomComponent_IRoomAdministration
		 * @see Room.impl.RoomPackageImpl#getRoomComponent_IRoomAdministration()
		 * @generated
		 */
		EClass ROOM_COMPONENT_IROOM_ADMINISTRATION = eINSTANCE.getRoomComponent_IRoomAdministration();

		/**
		 * The meta object literal for the '<em><b>Create Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_COMPONENT_IROOM_ADMINISTRATION___CREATE_ROOM__INT_BOOLEAN_INT_STRING_STRING = eINSTANCE.getRoomComponent_IRoomAdministration__CreateRoom__int_boolean_int_String_String();

		/**
		 * The meta object literal for the '<em><b>Edit Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_COMPONENT_IROOM_ADMINISTRATION___EDIT_ROOM__INT_BOOLEAN_INT_STRING_STRING = eINSTANCE.getRoomComponent_IRoomAdministration__EditRoom__int_boolean_int_String_String();

		/**
		 * The meta object literal for the '<em><b>Remove</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_COMPONENT_IROOM_ADMINISTRATION___REMOVE__INT = eINSTANCE.getRoomComponent_IRoomAdministration__Remove__int();

		/**
		 * The meta object literal for the '{@link Room.RoomComponent_IRoomInformation <em>Component IRoom Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Room.RoomComponent_IRoomInformation
		 * @see Room.impl.RoomPackageImpl#getRoomComponent_IRoomInformation()
		 * @generated
		 */
		EClass ROOM_COMPONENT_IROOM_INFORMATION = eINSTANCE.getRoomComponent_IRoomInformation();

		/**
		 * The meta object literal for the '<em><b>Get Room Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_COMPONENT_IROOM_INFORMATION___GET_ROOM_INFO__INT = eINSTANCE.getRoomComponent_IRoomInformation__GetRoomInfo__int();

		/**
		 * The meta object literal for the '<em><b>Search Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_COMPONENT_IROOM_INFORMATION___SEARCH_ROOM__STRING = eINSTANCE.getRoomComponent_IRoomInformation__SearchRoom__String();

		/**
		 * The meta object literal for the '<em><b>Get Room Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_COMPONENT_IROOM_INFORMATION___GET_ROOM_TYPES = eINSTANCE.getRoomComponent_IRoomInformation__GetRoomTypes();

		/**
		 * The meta object literal for the '<em><b>Get All Room Numbers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_COMPONENT_IROOM_INFORMATION___GET_ALL_ROOM_NUMBERS = eINSTANCE.getRoomComponent_IRoomInformation__GetAllRoomNumbers();

		/**
		 * The meta object literal for the '<em><b>Count Number Of Total Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_COMPONENT_IROOM_INFORMATION___COUNT_NUMBER_OF_TOTAL_ROOMS = eINSTANCE.getRoomComponent_IRoomInformation__CountNumberOfTotalRooms();

		/**
		 * The meta object literal for the '{@link Room.impl.RoomComponent_RoomHandlerImpl <em>Component Room Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Room.impl.RoomComponent_RoomHandlerImpl
		 * @see Room.impl.RoomPackageImpl#getRoomComponent_RoomHandler()
		 * @generated
		 */
		EClass ROOM_COMPONENT_ROOM_HANDLER = eINSTANCE.getRoomComponent_RoomHandler();

	}

} //RoomPackage
