/**
 */
package Occupancy.impl;

import Occupancy.OccupancyComponent;
import Occupancy.OccupancyComponent_Guest;
import Occupancy.OccupancyComponent_IOccupancy;
import Occupancy.OccupancyComponent_Occupancy;
import Occupancy.OccupancyComponent_OccupancyHandler;
import Occupancy.OccupancyFactory;
import Occupancy.OccupancyPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.types.impl.TypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OccupancyPackageImpl extends EPackageImpl implements OccupancyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass occupancyComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass occupancyComponent_OccupancyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass occupancyComponent_GuestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass occupancyComponent_IOccupancyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass occupancyComponent_OccupancyHandlerEClass = null;

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
	 * @see Occupancy.OccupancyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OccupancyPackageImpl() {
		super(eNS_URI, OccupancyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OccupancyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OccupancyPackage init() {
		if (isInited) return (OccupancyPackage)EPackage.Registry.INSTANCE.getEPackage(OccupancyPackage.eNS_URI);

		// Obtain or create and register package
		OccupancyPackageImpl theOccupancyPackage = (OccupancyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OccupancyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OccupancyPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theOccupancyPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theOccupancyPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOccupancyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OccupancyPackage.eNS_URI, theOccupancyPackage);
		return theOccupancyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOccupancyComponent() {
		return occupancyComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOccupancyComponent_Occupancy() {
		return occupancyComponent_OccupancyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOccupancyComponent_Occupancy_RoomNumber() {
		return (EAttribute)occupancyComponent_OccupancyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOccupancyComponent_Occupancy_CheckInDateTime() {
		return (EAttribute)occupancyComponent_OccupancyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOccupancyComponent_Occupancy_CheckOutDateTime() {
		return (EAttribute)occupancyComponent_OccupancyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOccupancyComponent_Occupancy_Guest() {
		return (EReference)occupancyComponent_OccupancyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOccupancyComponent_Occupancy_BookingReference() {
		return (EAttribute)occupancyComponent_OccupancyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOccupancyComponent_Occupancy__Occupancy__int_int_OccupancyComponent_Guest_String() {
		return occupancyComponent_OccupancyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOccupancyComponent_Guest() {
		return occupancyComponent_GuestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOccupancyComponent_Guest_FirstName() {
		return (EAttribute)occupancyComponent_GuestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOccupancyComponent_Guest_LastName() {
		return (EAttribute)occupancyComponent_GuestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOccupancyComponent_Guest__Guest__String_String() {
		return occupancyComponent_GuestEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOccupancyComponent_IOccupancy() {
		return occupancyComponent_IOccupancyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOccupancyComponent_IOccupancy__CheckInGuest__String_String_String() {
		return occupancyComponent_IOccupancyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOccupancyComponent_IOccupancy__CheckOutGuest__String_String_String() {
		return occupancyComponent_IOccupancyEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOccupancyComponent_IOccupancy__ListFreeRooms() {
		return occupancyComponent_IOccupancyEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOccupancyComponent_IOccupancy__ListGuestsInRoom__int() {
		return occupancyComponent_IOccupancyEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOccupancyComponent_IOccupancy__NumberOfGuestsInHotel() {
		return occupancyComponent_IOccupancyEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOccupancyComponent_OccupancyHandler() {
		return occupancyComponent_OccupancyHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccupancyFactory getOccupancyFactory() {
		return (OccupancyFactory)getEFactoryInstance();
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
		occupancyComponentEClass = createEClass(OCCUPANCY_COMPONENT);

		occupancyComponent_OccupancyEClass = createEClass(OCCUPANCY_COMPONENT_OCCUPANCY);
		createEAttribute(occupancyComponent_OccupancyEClass, OCCUPANCY_COMPONENT_OCCUPANCY__ROOM_NUMBER);
		createEAttribute(occupancyComponent_OccupancyEClass, OCCUPANCY_COMPONENT_OCCUPANCY__CHECK_IN_DATE_TIME);
		createEAttribute(occupancyComponent_OccupancyEClass, OCCUPANCY_COMPONENT_OCCUPANCY__CHECK_OUT_DATE_TIME);
		createEReference(occupancyComponent_OccupancyEClass, OCCUPANCY_COMPONENT_OCCUPANCY__GUEST);
		createEAttribute(occupancyComponent_OccupancyEClass, OCCUPANCY_COMPONENT_OCCUPANCY__BOOKING_REFERENCE);
		createEOperation(occupancyComponent_OccupancyEClass, OCCUPANCY_COMPONENT_OCCUPANCY___OCCUPANCY__INT_INT_OCCUPANCYCOMPONENT_GUEST_STRING);

		occupancyComponent_GuestEClass = createEClass(OCCUPANCY_COMPONENT_GUEST);
		createEAttribute(occupancyComponent_GuestEClass, OCCUPANCY_COMPONENT_GUEST__FIRST_NAME);
		createEAttribute(occupancyComponent_GuestEClass, OCCUPANCY_COMPONENT_GUEST__LAST_NAME);
		createEOperation(occupancyComponent_GuestEClass, OCCUPANCY_COMPONENT_GUEST___GUEST__STRING_STRING);

		occupancyComponent_IOccupancyEClass = createEClass(OCCUPANCY_COMPONENT_IOCCUPANCY);
		createEOperation(occupancyComponent_IOccupancyEClass, OCCUPANCY_COMPONENT_IOCCUPANCY___CHECK_IN_GUEST__STRING_STRING_STRING);
		createEOperation(occupancyComponent_IOccupancyEClass, OCCUPANCY_COMPONENT_IOCCUPANCY___CHECK_OUT_GUEST__STRING_STRING_STRING);
		createEOperation(occupancyComponent_IOccupancyEClass, OCCUPANCY_COMPONENT_IOCCUPANCY___LIST_FREE_ROOMS);
		createEOperation(occupancyComponent_IOccupancyEClass, OCCUPANCY_COMPONENT_IOCCUPANCY___LIST_GUESTS_IN_ROOM__INT);
		createEOperation(occupancyComponent_IOccupancyEClass, OCCUPANCY_COMPONENT_IOCCUPANCY___NUMBER_OF_GUESTS_IN_HOTEL);

		occupancyComponent_OccupancyHandlerEClass = createEClass(OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER);
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
		occupancyComponent_OccupancyHandlerEClass.getESuperTypes().add(this.getOccupancyComponent_IOccupancy());

		// Initialize classes, features, and operations; add parameters
		initEClass(occupancyComponentEClass, OccupancyComponent.class, "OccupancyComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(occupancyComponent_OccupancyEClass, OccupancyComponent_Occupancy.class, "OccupancyComponent_Occupancy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOccupancyComponent_Occupancy_RoomNumber(), theTypesPackage.getInteger(), "roomNumber", null, 1, 1, OccupancyComponent_Occupancy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOccupancyComponent_Occupancy_CheckInDateTime(), theTypesPackage.getInteger(), "checkInDateTime", null, 1, 1, OccupancyComponent_Occupancy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOccupancyComponent_Occupancy_CheckOutDateTime(), theTypesPackage.getInteger(), "checkOutDateTime", null, 1, 1, OccupancyComponent_Occupancy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOccupancyComponent_Occupancy_Guest(), this.getOccupancyComponent_Guest(), null, "Guest", null, 1, -1, OccupancyComponent_Occupancy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOccupancyComponent_Occupancy_BookingReference(), theTypesPackage.getString(), "bookingReference", null, 1, 1, OccupancyComponent_Occupancy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getOccupancyComponent_Occupancy__Occupancy__int_int_OccupancyComponent_Guest_String(), null, "Occupancy", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "checkInDateTime", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getOccupancyComponent_Guest(), "Guest", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookingReference", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(occupancyComponent_GuestEClass, OccupancyComponent_Guest.class, "OccupancyComponent_Guest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOccupancyComponent_Guest_FirstName(), theTypesPackage.getString(), "firstName", null, 1, 1, OccupancyComponent_Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOccupancyComponent_Guest_LastName(), theTypesPackage.getString(), "lastName", null, 1, 1, OccupancyComponent_Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getOccupancyComponent_Guest__Guest__String_String(), null, "Guest", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(occupancyComponent_IOccupancyEClass, OccupancyComponent_IOccupancy.class, "OccupancyComponent_IOccupancy", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getOccupancyComponent_IOccupancy__CheckInGuest__String_String_String(), null, "checkInGuest", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookingReference", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getOccupancyComponent_IOccupancy__CheckOutGuest__String_String_String(), null, "checkOutGuest", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookingReference", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getOccupancyComponent_IOccupancy__ListFreeRooms(), null, "listFreeRooms", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getOccupancyComponent_IOccupancy__ListGuestsInRoom__int(), null, "listGuestsInRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getOccupancyComponent_IOccupancy__NumberOfGuestsInHotel(), null, "numberOfGuestsInHotel", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(occupancyComponent_OccupancyHandlerEClass, OccupancyComponent_OccupancyHandler.class, "OccupancyComponent_OccupancyHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //OccupancyPackageImpl
