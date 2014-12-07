/**
 */
package Occupancy;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see Occupancy.OccupancyFactory
 * @model kind="package"
 * @generated
 */
public interface OccupancyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Occupancy";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///Occupancy.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Occupancy";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OccupancyPackage eINSTANCE = Occupancy.impl.OccupancyPackageImpl.init();

	/**
	 * The meta object id for the '{@link Occupancy.impl.OccupancyComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Occupancy.impl.OccupancyComponentImpl
	 * @see Occupancy.impl.OccupancyPackageImpl#getOccupancyComponent()
	 * @generated
	 */
	int OCCUPANCY_COMPONENT = 0;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Occupancy.impl.OccupancyComponent_OccupancyImpl <em>Component Occupancy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Occupancy.impl.OccupancyComponent_OccupancyImpl
	 * @see Occupancy.impl.OccupancyPackageImpl#getOccupancyComponent_Occupancy()
	 * @generated
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY = 1;

	/**
	 * The feature id for the '<em><b>Room Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY__ROOM_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Check In Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY__CHECK_IN_DATE_TIME = 1;

	/**
	 * The feature id for the '<em><b>Check Out Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY__CHECK_OUT_DATE_TIME = 2;

	/**
	 * The feature id for the '<em><b>Guest</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY__GUEST = 3;

	/**
	 * The feature id for the '<em><b>Booking Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY__BOOKING_REFERENCE = 4;

	/**
	 * The number of structural features of the '<em>Component Occupancy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Occupancy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY___OCCUPANCY__INT_INT_OCCUPANCYCOMPONENT_GUEST_STRING = 0;

	/**
	 * The number of operations of the '<em>Component Occupancy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Occupancy.impl.OccupancyComponent_GuestImpl <em>Component Guest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Occupancy.impl.OccupancyComponent_GuestImpl
	 * @see Occupancy.impl.OccupancyPackageImpl#getOccupancyComponent_Guest()
	 * @generated
	 */
	int OCCUPANCY_COMPONENT_GUEST = 2;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_GUEST__FIRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_GUEST__LAST_NAME = 1;

	/**
	 * The number of structural features of the '<em>Component Guest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_GUEST_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Guest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_GUEST___GUEST__STRING_STRING = 0;

	/**
	 * The number of operations of the '<em>Component Guest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_GUEST_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Occupancy.OccupancyComponent_IOccupancy <em>Component IOccupancy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Occupancy.OccupancyComponent_IOccupancy
	 * @see Occupancy.impl.OccupancyPackageImpl#getOccupancyComponent_IOccupancy()
	 * @generated
	 */
	int OCCUPANCY_COMPONENT_IOCCUPANCY = 3;

	/**
	 * The number of structural features of the '<em>Component IOccupancy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_IOCCUPANCY_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Check In Guest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_IOCCUPANCY___CHECK_IN_GUEST__STRING_STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Check Out Guest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_IOCCUPANCY___CHECK_OUT_GUEST__STRING_STRING_STRING = 1;

	/**
	 * The operation id for the '<em>List Free Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_IOCCUPANCY___LIST_FREE_ROOMS = 2;

	/**
	 * The operation id for the '<em>List Guests In Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_IOCCUPANCY___LIST_GUESTS_IN_ROOM__INT = 3;

	/**
	 * The operation id for the '<em>Number Of Guests In Hotel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_IOCCUPANCY___NUMBER_OF_GUESTS_IN_HOTEL = 4;

	/**
	 * The number of operations of the '<em>Component IOccupancy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_IOCCUPANCY_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link Occupancy.impl.OccupancyComponent_OccupancyHandlerImpl <em>Component Occupancy Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Occupancy.impl.OccupancyComponent_OccupancyHandlerImpl
	 * @see Occupancy.impl.OccupancyPackageImpl#getOccupancyComponent_OccupancyHandler()
	 * @generated
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER = 4;

	/**
	 * The number of structural features of the '<em>Component Occupancy Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER_FEATURE_COUNT = OCCUPANCY_COMPONENT_IOCCUPANCY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Check In Guest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___CHECK_IN_GUEST__STRING_STRING_STRING = OCCUPANCY_COMPONENT_IOCCUPANCY___CHECK_IN_GUEST__STRING_STRING_STRING;

	/**
	 * The operation id for the '<em>Check Out Guest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___CHECK_OUT_GUEST__STRING_STRING_STRING = OCCUPANCY_COMPONENT_IOCCUPANCY___CHECK_OUT_GUEST__STRING_STRING_STRING;

	/**
	 * The operation id for the '<em>List Free Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___LIST_FREE_ROOMS = OCCUPANCY_COMPONENT_IOCCUPANCY___LIST_FREE_ROOMS;

	/**
	 * The operation id for the '<em>List Guests In Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___LIST_GUESTS_IN_ROOM__INT = OCCUPANCY_COMPONENT_IOCCUPANCY___LIST_GUESTS_IN_ROOM__INT;

	/**
	 * The operation id for the '<em>Number Of Guests In Hotel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___NUMBER_OF_GUESTS_IN_HOTEL = OCCUPANCY_COMPONENT_IOCCUPANCY___NUMBER_OF_GUESTS_IN_HOTEL;

	/**
	 * The number of operations of the '<em>Component Occupancy Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER_OPERATION_COUNT = OCCUPANCY_COMPONENT_IOCCUPANCY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link Occupancy.OccupancyComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see Occupancy.OccupancyComponent
	 * @generated
	 */
	EClass getOccupancyComponent();

	/**
	 * Returns the meta object for class '{@link Occupancy.OccupancyComponent_Occupancy <em>Component Occupancy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Occupancy</em>'.
	 * @see Occupancy.OccupancyComponent_Occupancy
	 * @generated
	 */
	EClass getOccupancyComponent_Occupancy();

	/**
	 * Returns the meta object for the attribute '{@link Occupancy.OccupancyComponent_Occupancy#getRoomNumber <em>Room Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Number</em>'.
	 * @see Occupancy.OccupancyComponent_Occupancy#getRoomNumber()
	 * @see #getOccupancyComponent_Occupancy()
	 * @generated
	 */
	EAttribute getOccupancyComponent_Occupancy_RoomNumber();

	/**
	 * Returns the meta object for the attribute '{@link Occupancy.OccupancyComponent_Occupancy#getCheckInDateTime <em>Check In Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check In Date Time</em>'.
	 * @see Occupancy.OccupancyComponent_Occupancy#getCheckInDateTime()
	 * @see #getOccupancyComponent_Occupancy()
	 * @generated
	 */
	EAttribute getOccupancyComponent_Occupancy_CheckInDateTime();

	/**
	 * Returns the meta object for the attribute '{@link Occupancy.OccupancyComponent_Occupancy#getCheckOutDateTime <em>Check Out Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Out Date Time</em>'.
	 * @see Occupancy.OccupancyComponent_Occupancy#getCheckOutDateTime()
	 * @see #getOccupancyComponent_Occupancy()
	 * @generated
	 */
	EAttribute getOccupancyComponent_Occupancy_CheckOutDateTime();

	/**
	 * Returns the meta object for the reference list '{@link Occupancy.OccupancyComponent_Occupancy#getGuest <em>Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Guest</em>'.
	 * @see Occupancy.OccupancyComponent_Occupancy#getGuest()
	 * @see #getOccupancyComponent_Occupancy()
	 * @generated
	 */
	EReference getOccupancyComponent_Occupancy_Guest();

	/**
	 * Returns the meta object for the attribute '{@link Occupancy.OccupancyComponent_Occupancy#getBookingReference <em>Booking Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking Reference</em>'.
	 * @see Occupancy.OccupancyComponent_Occupancy#getBookingReference()
	 * @see #getOccupancyComponent_Occupancy()
	 * @generated
	 */
	EAttribute getOccupancyComponent_Occupancy_BookingReference();

	/**
	 * Returns the meta object for the '{@link Occupancy.OccupancyComponent_Occupancy#Occupancy(int, int, Occupancy.OccupancyComponent_Guest, java.lang.String) <em>Occupancy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Occupancy</em>' operation.
	 * @see Occupancy.OccupancyComponent_Occupancy#Occupancy(int, int, Occupancy.OccupancyComponent_Guest, java.lang.String)
	 * @generated
	 */
	EOperation getOccupancyComponent_Occupancy__Occupancy__int_int_OccupancyComponent_Guest_String();

	/**
	 * Returns the meta object for class '{@link Occupancy.OccupancyComponent_Guest <em>Component Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Guest</em>'.
	 * @see Occupancy.OccupancyComponent_Guest
	 * @generated
	 */
	EClass getOccupancyComponent_Guest();

	/**
	 * Returns the meta object for the attribute '{@link Occupancy.OccupancyComponent_Guest#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see Occupancy.OccupancyComponent_Guest#getFirstName()
	 * @see #getOccupancyComponent_Guest()
	 * @generated
	 */
	EAttribute getOccupancyComponent_Guest_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link Occupancy.OccupancyComponent_Guest#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see Occupancy.OccupancyComponent_Guest#getLastName()
	 * @see #getOccupancyComponent_Guest()
	 * @generated
	 */
	EAttribute getOccupancyComponent_Guest_LastName();

	/**
	 * Returns the meta object for the '{@link Occupancy.OccupancyComponent_Guest#Guest(java.lang.String, java.lang.String) <em>Guest</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Guest</em>' operation.
	 * @see Occupancy.OccupancyComponent_Guest#Guest(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getOccupancyComponent_Guest__Guest__String_String();

	/**
	 * Returns the meta object for class '{@link Occupancy.OccupancyComponent_IOccupancy <em>Component IOccupancy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component IOccupancy</em>'.
	 * @see Occupancy.OccupancyComponent_IOccupancy
	 * @generated
	 */
	EClass getOccupancyComponent_IOccupancy();

	/**
	 * Returns the meta object for the '{@link Occupancy.OccupancyComponent_IOccupancy#checkInGuest(java.lang.String, java.lang.String, java.lang.String) <em>Check In Guest</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check In Guest</em>' operation.
	 * @see Occupancy.OccupancyComponent_IOccupancy#checkInGuest(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getOccupancyComponent_IOccupancy__CheckInGuest__String_String_String();

	/**
	 * Returns the meta object for the '{@link Occupancy.OccupancyComponent_IOccupancy#checkOutGuest(java.lang.String, java.lang.String, java.lang.String) <em>Check Out Guest</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Out Guest</em>' operation.
	 * @see Occupancy.OccupancyComponent_IOccupancy#checkOutGuest(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getOccupancyComponent_IOccupancy__CheckOutGuest__String_String_String();

	/**
	 * Returns the meta object for the '{@link Occupancy.OccupancyComponent_IOccupancy#listFreeRooms() <em>List Free Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List Free Rooms</em>' operation.
	 * @see Occupancy.OccupancyComponent_IOccupancy#listFreeRooms()
	 * @generated
	 */
	EOperation getOccupancyComponent_IOccupancy__ListFreeRooms();

	/**
	 * Returns the meta object for the '{@link Occupancy.OccupancyComponent_IOccupancy#listGuestsInRoom(int) <em>List Guests In Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List Guests In Room</em>' operation.
	 * @see Occupancy.OccupancyComponent_IOccupancy#listGuestsInRoom(int)
	 * @generated
	 */
	EOperation getOccupancyComponent_IOccupancy__ListGuestsInRoom__int();

	/**
	 * Returns the meta object for the '{@link Occupancy.OccupancyComponent_IOccupancy#numberOfGuestsInHotel() <em>Number Of Guests In Hotel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Number Of Guests In Hotel</em>' operation.
	 * @see Occupancy.OccupancyComponent_IOccupancy#numberOfGuestsInHotel()
	 * @generated
	 */
	EOperation getOccupancyComponent_IOccupancy__NumberOfGuestsInHotel();

	/**
	 * Returns the meta object for class '{@link Occupancy.OccupancyComponent_OccupancyHandler <em>Component Occupancy Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Occupancy Handler</em>'.
	 * @see Occupancy.OccupancyComponent_OccupancyHandler
	 * @generated
	 */
	EClass getOccupancyComponent_OccupancyHandler();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OccupancyFactory getOccupancyFactory();

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
		 * The meta object literal for the '{@link Occupancy.impl.OccupancyComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Occupancy.impl.OccupancyComponentImpl
		 * @see Occupancy.impl.OccupancyPackageImpl#getOccupancyComponent()
		 * @generated
		 */
		EClass OCCUPANCY_COMPONENT = eINSTANCE.getOccupancyComponent();

		/**
		 * The meta object literal for the '{@link Occupancy.impl.OccupancyComponent_OccupancyImpl <em>Component Occupancy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Occupancy.impl.OccupancyComponent_OccupancyImpl
		 * @see Occupancy.impl.OccupancyPackageImpl#getOccupancyComponent_Occupancy()
		 * @generated
		 */
		EClass OCCUPANCY_COMPONENT_OCCUPANCY = eINSTANCE.getOccupancyComponent_Occupancy();

		/**
		 * The meta object literal for the '<em><b>Room Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCCUPANCY_COMPONENT_OCCUPANCY__ROOM_NUMBER = eINSTANCE.getOccupancyComponent_Occupancy_RoomNumber();

		/**
		 * The meta object literal for the '<em><b>Check In Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCCUPANCY_COMPONENT_OCCUPANCY__CHECK_IN_DATE_TIME = eINSTANCE.getOccupancyComponent_Occupancy_CheckInDateTime();

		/**
		 * The meta object literal for the '<em><b>Check Out Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCCUPANCY_COMPONENT_OCCUPANCY__CHECK_OUT_DATE_TIME = eINSTANCE.getOccupancyComponent_Occupancy_CheckOutDateTime();

		/**
		 * The meta object literal for the '<em><b>Guest</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCCUPANCY_COMPONENT_OCCUPANCY__GUEST = eINSTANCE.getOccupancyComponent_Occupancy_Guest();

		/**
		 * The meta object literal for the '<em><b>Booking Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCCUPANCY_COMPONENT_OCCUPANCY__BOOKING_REFERENCE = eINSTANCE.getOccupancyComponent_Occupancy_BookingReference();

		/**
		 * The meta object literal for the '<em><b>Occupancy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OCCUPANCY_COMPONENT_OCCUPANCY___OCCUPANCY__INT_INT_OCCUPANCYCOMPONENT_GUEST_STRING = eINSTANCE.getOccupancyComponent_Occupancy__Occupancy__int_int_OccupancyComponent_Guest_String();

		/**
		 * The meta object literal for the '{@link Occupancy.impl.OccupancyComponent_GuestImpl <em>Component Guest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Occupancy.impl.OccupancyComponent_GuestImpl
		 * @see Occupancy.impl.OccupancyPackageImpl#getOccupancyComponent_Guest()
		 * @generated
		 */
		EClass OCCUPANCY_COMPONENT_GUEST = eINSTANCE.getOccupancyComponent_Guest();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCCUPANCY_COMPONENT_GUEST__FIRST_NAME = eINSTANCE.getOccupancyComponent_Guest_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCCUPANCY_COMPONENT_GUEST__LAST_NAME = eINSTANCE.getOccupancyComponent_Guest_LastName();

		/**
		 * The meta object literal for the '<em><b>Guest</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OCCUPANCY_COMPONENT_GUEST___GUEST__STRING_STRING = eINSTANCE.getOccupancyComponent_Guest__Guest__String_String();

		/**
		 * The meta object literal for the '{@link Occupancy.OccupancyComponent_IOccupancy <em>Component IOccupancy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Occupancy.OccupancyComponent_IOccupancy
		 * @see Occupancy.impl.OccupancyPackageImpl#getOccupancyComponent_IOccupancy()
		 * @generated
		 */
		EClass OCCUPANCY_COMPONENT_IOCCUPANCY = eINSTANCE.getOccupancyComponent_IOccupancy();

		/**
		 * The meta object literal for the '<em><b>Check In Guest</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OCCUPANCY_COMPONENT_IOCCUPANCY___CHECK_IN_GUEST__STRING_STRING_STRING = eINSTANCE.getOccupancyComponent_IOccupancy__CheckInGuest__String_String_String();

		/**
		 * The meta object literal for the '<em><b>Check Out Guest</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OCCUPANCY_COMPONENT_IOCCUPANCY___CHECK_OUT_GUEST__STRING_STRING_STRING = eINSTANCE.getOccupancyComponent_IOccupancy__CheckOutGuest__String_String_String();

		/**
		 * The meta object literal for the '<em><b>List Free Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OCCUPANCY_COMPONENT_IOCCUPANCY___LIST_FREE_ROOMS = eINSTANCE.getOccupancyComponent_IOccupancy__ListFreeRooms();

		/**
		 * The meta object literal for the '<em><b>List Guests In Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OCCUPANCY_COMPONENT_IOCCUPANCY___LIST_GUESTS_IN_ROOM__INT = eINSTANCE.getOccupancyComponent_IOccupancy__ListGuestsInRoom__int();

		/**
		 * The meta object literal for the '<em><b>Number Of Guests In Hotel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OCCUPANCY_COMPONENT_IOCCUPANCY___NUMBER_OF_GUESTS_IN_HOTEL = eINSTANCE.getOccupancyComponent_IOccupancy__NumberOfGuestsInHotel();

		/**
		 * The meta object literal for the '{@link Occupancy.impl.OccupancyComponent_OccupancyHandlerImpl <em>Component Occupancy Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Occupancy.impl.OccupancyComponent_OccupancyHandlerImpl
		 * @see Occupancy.impl.OccupancyPackageImpl#getOccupancyComponent_OccupancyHandler()
		 * @generated
		 */
		EClass OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER = eINSTANCE.getOccupancyComponent_OccupancyHandler();

	}

} //OccupancyPackage
