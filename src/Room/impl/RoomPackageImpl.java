/**
 */
package Room.impl;

import Room.RoomComponent;
import Room.RoomComponent_Bedroom;
import Room.RoomComponent_ConferenceRoom;
import Room.RoomComponent_IRoomAdministration;
import Room.RoomComponent_IRoomInformation;
import Room.RoomComponent_Room;
import Room.RoomComponent_RoomHandler;
import Room.RoomFactory;
import Room.RoomPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.types.impl.TypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoomPackageImpl extends EPackageImpl implements RoomPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomComponent_RoomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomComponent_BedroomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomComponent_ConferenceRoomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomComponent_IRoomAdministrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomComponent_IRoomInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomComponent_RoomHandlerEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Room.RoomPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RoomPackageImpl() {
		super(eNS_URI, RoomFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RoomPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RoomPackage init() {
		if (isInited) return (RoomPackage)EPackage.Registry.INSTANCE.getEPackage(RoomPackage.eNS_URI);

		// Obtain or create and register package
		RoomPackageImpl theRoomPackage = (RoomPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RoomPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RoomPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theRoomPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theRoomPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRoomPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RoomPackage.eNS_URI, theRoomPackage);
		return theRoomPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomComponent() {
		return roomComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomComponent_Room() {
		return roomComponent_RoomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomComponent_Room_RoomNumber() {
		return (EAttribute)roomComponent_RoomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomComponent_Room_Usable() {
		return (EAttribute)roomComponent_RoomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomComponent_Room_Price() {
		return (EAttribute)roomComponent_RoomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomComponent_Room_RoomTypeName() {
		return (EAttribute)roomComponent_RoomEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomComponent_Room_Description() {
		return (EAttribute)roomComponent_RoomEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomComponent_Bedroom() {
		return roomComponent_BedroomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomComponent_Bedroom_BedCount() {
		return (EAttribute)roomComponent_BedroomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomComponent_Bedroom__CreateBedroom__int_boolean_int_String_String_int() {
		return roomComponent_BedroomEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomComponent_Bedroom__EditRoom__int_boolean_int_String_String_int() {
		return roomComponent_BedroomEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomComponent_ConferenceRoom() {
		return roomComponent_ConferenceRoomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomComponent_ConferenceRoom_NumberOfSeats() {
		return (EAttribute)roomComponent_ConferenceRoomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomComponent_ConferenceRoom_Projector() {
		return (EAttribute)roomComponent_ConferenceRoomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomComponent_ConferenceRoom_ConferencePhone() {
		return (EAttribute)roomComponent_ConferenceRoomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomComponent_ConferenceRoom__CreateConferenceRoom__int_boolean_int_String_String_int_boolean_boolean() {
		return roomComponent_ConferenceRoomEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomComponent_ConferenceRoom__EditRoom__int_boolean_int_String_String_int_boolean_boolean() {
		return roomComponent_ConferenceRoomEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomComponent_IRoomAdministration() {
		return roomComponent_IRoomAdministrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomComponent_IRoomAdministration__CreateRoom__int_boolean_int_String_String() {
		return roomComponent_IRoomAdministrationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomComponent_IRoomAdministration__EditRoom__int_boolean_int_String_String() {
		return roomComponent_IRoomAdministrationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomComponent_IRoomAdministration__Remove__int() {
		return roomComponent_IRoomAdministrationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomComponent_IRoomInformation() {
		return roomComponent_IRoomInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomComponent_IRoomInformation__GetRoomInfo__int() {
		return roomComponent_IRoomInformationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomComponent_IRoomInformation__SearchRoom__String() {
		return roomComponent_IRoomInformationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomComponent_IRoomInformation__GetRoomTypes() {
		return roomComponent_IRoomInformationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomComponent_IRoomInformation__GetAllRoomNumbers() {
		return roomComponent_IRoomInformationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomComponent_IRoomInformation__CountNumberOfTotalRooms() {
		return roomComponent_IRoomInformationEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomComponent_RoomHandler() {
		return roomComponent_RoomHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomFactory getRoomFactory() {
		return (RoomFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		roomComponentEClass = createEClass(ROOM_COMPONENT);

		roomComponent_RoomEClass = createEClass(ROOM_COMPONENT_ROOM);
		createEAttribute(roomComponent_RoomEClass, ROOM_COMPONENT_ROOM__ROOM_NUMBER);
		createEAttribute(roomComponent_RoomEClass, ROOM_COMPONENT_ROOM__USABLE);
		createEAttribute(roomComponent_RoomEClass, ROOM_COMPONENT_ROOM__PRICE);
		createEAttribute(roomComponent_RoomEClass, ROOM_COMPONENT_ROOM__ROOM_TYPE_NAME);
		createEAttribute(roomComponent_RoomEClass, ROOM_COMPONENT_ROOM__DESCRIPTION);

		roomComponent_BedroomEClass = createEClass(ROOM_COMPONENT_BEDROOM);
		createEAttribute(roomComponent_BedroomEClass, ROOM_COMPONENT_BEDROOM__BED_COUNT);
		createEOperation(roomComponent_BedroomEClass, ROOM_COMPONENT_BEDROOM___CREATE_BEDROOM__INT_BOOLEAN_INT_STRING_STRING_INT);
		createEOperation(roomComponent_BedroomEClass, ROOM_COMPONENT_BEDROOM___EDIT_ROOM__INT_BOOLEAN_INT_STRING_STRING_INT);

		roomComponent_ConferenceRoomEClass = createEClass(ROOM_COMPONENT_CONFERENCE_ROOM);
		createEAttribute(roomComponent_ConferenceRoomEClass, ROOM_COMPONENT_CONFERENCE_ROOM__NUMBER_OF_SEATS);
		createEAttribute(roomComponent_ConferenceRoomEClass, ROOM_COMPONENT_CONFERENCE_ROOM__PROJECTOR);
		createEAttribute(roomComponent_ConferenceRoomEClass, ROOM_COMPONENT_CONFERENCE_ROOM__CONFERENCE_PHONE);
		createEOperation(roomComponent_ConferenceRoomEClass, ROOM_COMPONENT_CONFERENCE_ROOM___CREATE_CONFERENCE_ROOM__INT_BOOLEAN_INT_STRING_STRING_INT_BOOLEAN_BOOLEAN);
		createEOperation(roomComponent_ConferenceRoomEClass, ROOM_COMPONENT_CONFERENCE_ROOM___EDIT_ROOM__INT_BOOLEAN_INT_STRING_STRING_INT_BOOLEAN_BOOLEAN);

		roomComponent_IRoomAdministrationEClass = createEClass(ROOM_COMPONENT_IROOM_ADMINISTRATION);
		createEOperation(roomComponent_IRoomAdministrationEClass, ROOM_COMPONENT_IROOM_ADMINISTRATION___CREATE_ROOM__INT_BOOLEAN_INT_STRING_STRING);
		createEOperation(roomComponent_IRoomAdministrationEClass, ROOM_COMPONENT_IROOM_ADMINISTRATION___EDIT_ROOM__INT_BOOLEAN_INT_STRING_STRING);
		createEOperation(roomComponent_IRoomAdministrationEClass, ROOM_COMPONENT_IROOM_ADMINISTRATION___REMOVE__INT);

		roomComponent_IRoomInformationEClass = createEClass(ROOM_COMPONENT_IROOM_INFORMATION);
		createEOperation(roomComponent_IRoomInformationEClass, ROOM_COMPONENT_IROOM_INFORMATION___GET_ROOM_INFO__INT);
		createEOperation(roomComponent_IRoomInformationEClass, ROOM_COMPONENT_IROOM_INFORMATION___SEARCH_ROOM__STRING);
		createEOperation(roomComponent_IRoomInformationEClass, ROOM_COMPONENT_IROOM_INFORMATION___GET_ROOM_TYPES);
		createEOperation(roomComponent_IRoomInformationEClass, ROOM_COMPONENT_IROOM_INFORMATION___GET_ALL_ROOM_NUMBERS);
		createEOperation(roomComponent_IRoomInformationEClass, ROOM_COMPONENT_IROOM_INFORMATION___COUNT_NUMBER_OF_TOTAL_ROOMS);

		roomComponent_RoomHandlerEClass = createEClass(ROOM_COMPONENT_ROOM_HANDLER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		roomComponent_BedroomEClass.getESuperTypes().add(this.getRoomComponent_Room());
		roomComponent_ConferenceRoomEClass.getESuperTypes().add(this.getRoomComponent_Room());

		// Initialize classes, features, and operations; add parameters
		initEClass(roomComponentEClass, RoomComponent.class, "RoomComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roomComponent_RoomEClass, RoomComponent_Room.class, "RoomComponent_Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomComponent_Room_RoomNumber(), theTypesPackage.getInteger(), "roomNumber", null, 1, 1, RoomComponent_Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomComponent_Room_Usable(), theTypesPackage.getBoolean(), "usable", null, 1, 1, RoomComponent_Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomComponent_Room_Price(), theTypesPackage.getInteger(), "price", null, 1, 1, RoomComponent_Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomComponent_Room_RoomTypeName(), theTypesPackage.getString(), "roomTypeName", null, 1, 1, RoomComponent_Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomComponent_Room_Description(), theTypesPackage.getString(), "description", null, 1, 1, RoomComponent_Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomComponent_BedroomEClass, RoomComponent_Bedroom.class, "RoomComponent_Bedroom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomComponent_Bedroom_BedCount(), theTypesPackage.getInteger(), "bedCount", null, 1, 1, RoomComponent_Bedroom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getRoomComponent_Bedroom__CreateBedroom__int_boolean_int_String_String_int(), null, "createBedroom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getBoolean(), "usable", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomTypeName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "bedCount", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomComponent_Bedroom__EditRoom__int_boolean_int_String_String_int(), null, "editRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "usable", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roomTypeName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bedCount", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomComponent_ConferenceRoomEClass, RoomComponent_ConferenceRoom.class, "RoomComponent_ConferenceRoom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomComponent_ConferenceRoom_NumberOfSeats(), ecorePackage.getEInt(), "numberOfSeats", null, 1, 1, RoomComponent_ConferenceRoom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomComponent_ConferenceRoom_Projector(), ecorePackage.getEBoolean(), "projector", null, 1, 1, RoomComponent_ConferenceRoom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomComponent_ConferenceRoom_ConferencePhone(), ecorePackage.getEBoolean(), "conferencePhone", null, 1, 1, RoomComponent_ConferenceRoom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getRoomComponent_ConferenceRoom__CreateConferenceRoom__int_boolean_int_String_String_int_boolean_boolean(), null, "createConferenceRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getBoolean(), "usable", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomTypeName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "numberOfSeats", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getBoolean(), "projector", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getBoolean(), "conferenceRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomComponent_ConferenceRoom__EditRoom__int_boolean_int_String_String_int_boolean_boolean(), null, "editRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "usable", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roomTypeName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "numberOfSeats", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "projector", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "conferencePhone", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomComponent_IRoomAdministrationEClass, RoomComponent_IRoomAdministration.class, "RoomComponent_IRoomAdministration", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getRoomComponent_IRoomAdministration__CreateRoom__int_boolean_int_String_String(), null, "createRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getBoolean(), "usable", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomTypeName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomComponent_IRoomAdministration__EditRoom__int_boolean_int_String_String(), null, "editRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getBoolean(), "usable", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roomTypeName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomComponent_IRoomAdministration__Remove__int(), null, "remove", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomComponent_IRoomInformationEClass, RoomComponent_IRoomInformation.class, "RoomComponent_IRoomInformation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getRoomComponent_IRoomInformation__GetRoomInfo__int(), null, "getRoomInfo", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomComponent_IRoomInformation__SearchRoom__String(), null, "searchRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomTypeName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getRoomComponent_IRoomInformation__GetRoomTypes(), null, "getRoomTypes", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getRoomComponent_IRoomInformation__GetAllRoomNumbers(), null, "getAllRoomNumbers", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getRoomComponent_IRoomInformation__CountNumberOfTotalRooms(), null, "countNumberOfTotalRooms", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomComponent_RoomHandlerEClass, RoomComponent_RoomHandler.class, "RoomComponent_RoomHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //RoomPackageImpl
