/**
 */
package Booking.impl;

import Booking.BookingComponent;
import Booking.BookingComponent_AdditionalService;
import Booking.BookingComponent_Booking;
import Booking.BookingComponent_BookingManager;
import Booking.BookingComponent_Guest;
import Booking.BookingComponent_IBooking;
import Booking.BookingComponent_PaymentDetails;
import Booking.BookingComponent_RoomType;
import Booking.BookingFactory;
import Booking.BookingPackage;

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
public class BookingPackageImpl extends EPackageImpl implements BookingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingComponent_PaymentDetailsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingComponent_BookingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingComponent_AdditionalServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingComponent_RoomTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingComponent_BookingManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingComponent_IBookingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingComponent_GuestEClass = null;

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
	 * @see Booking.BookingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BookingPackageImpl() {
		super(eNS_URI, BookingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BookingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BookingPackage init() {
		if (isInited) return (BookingPackage)EPackage.Registry.INSTANCE.getEPackage(BookingPackage.eNS_URI);

		// Obtain or create and register package
		BookingPackageImpl theBookingPackage = (BookingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BookingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BookingPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theBookingPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theBookingPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBookingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BookingPackage.eNS_URI, theBookingPackage);
		return theBookingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookingComponent() {
		return bookingComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookingComponent_PaymentDetails() {
		return bookingComponent_PaymentDetailsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookingComponent_PaymentDetails_FirstName() {
		return (EAttribute)bookingComponent_PaymentDetailsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookingComponent_PaymentDetails_LastName() {
		return (EAttribute)bookingComponent_PaymentDetailsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookingComponent_PaymentDetails_Address() {
		return (EAttribute)bookingComponent_PaymentDetailsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookingComponent_PaymentDetails_CcNumber() {
		return (EAttribute)bookingComponent_PaymentDetailsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookingComponent_PaymentDetails_Ccv() {
		return (EAttribute)bookingComponent_PaymentDetailsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookingComponent_PaymentDetails_ExpiryMonth() {
		return (EAttribute)bookingComponent_PaymentDetailsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookingComponent_PaymentDetails_ExpiryYear() {
		return (EAttribute)bookingComponent_PaymentDetailsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookingComponent_Booking() {
		return bookingComponent_BookingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookingComponent_Booking_ArrivalDate() {
		return (EAttribute)bookingComponent_BookingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookingComponent_Booking_DepartureDate() {
		return (EAttribute)bookingComponent_BookingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookingComponent_Booking_ReferenceNumber() {
		return (EAttribute)bookingComponent_BookingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookingComponent_Booking_CurrentCost() {
		return (EAttribute)bookingComponent_BookingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingComponent_Booking__BookingObject() {
		return bookingComponent_BookingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingComponent_Booking__Booking__Date_Date() {
		return bookingComponent_BookingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingComponent_Booking__AddAdditionalServiceToBooking__BookingComponent_AdditionalService() {
		return bookingComponent_BookingEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingComponent_Booking__Booking__String_Date_Date_String_String_String_String_String_String_String_String_String() {
		return bookingComponent_BookingEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingComponent_Booking__AddRoomToBooking__BookingComponent_RoomType() {
		return bookingComponent_BookingEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingComponent_Booking__RemoveRoomFromBooking__String() {
		return bookingComponent_BookingEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingComponent_Booking__UpdateBooking__String_Date_Date() {
		return bookingComponent_BookingEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingComponent_Booking__RemoveAdditionalServiceFromBooking__BookingComponent_AdditionalService() {
		return bookingComponent_BookingEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingComponent_Booking__CurrentCost() {
		return bookingComponent_BookingEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingComponent_Booking__UpdatePaymentDetails__BookingComponent_PaymentDetails() {
		return bookingComponent_BookingEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookingComponent_AdditionalService() {
		return bookingComponent_AdditionalServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookingComponent_AdditionalService_Name() {
		return (EAttribute)bookingComponent_AdditionalServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookingComponent_AdditionalService_Description() {
		return (EAttribute)bookingComponent_AdditionalServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookingComponent_AdditionalService_Cost() {
		return (EAttribute)bookingComponent_AdditionalServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookingComponent_RoomType() {
		return bookingComponent_RoomTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookingComponent_RoomType_RoomType() {
		return (EAttribute)bookingComponent_RoomTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookingComponent_RoomType_Cost() {
		return (EAttribute)bookingComponent_RoomTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookingComponent_BookingManager() {
		return bookingComponent_BookingManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingComponent_BookingManager__BookingManager() {
		return bookingComponent_BookingManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookingComponent_IBooking() {
		return bookingComponent_IBookingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingComponent_IBooking__SearchRooms__String_int_Date_Date() {
		return bookingComponent_IBookingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingComponent_IBooking__MakeBooking__String_Date_Date_String_String_String_String_String_String_String_String_String() {
		return bookingComponent_IBookingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingComponent_IBooking__AddRoom__String_String() {
		return bookingComponent_IBookingEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingComponent_IBooking__RequestQuote__String_int_Date_Date() {
		return bookingComponent_IBookingEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingComponent_IBooking__EditBooking__String_String_Date_Date_String() {
		return bookingComponent_IBookingEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingComponent_IBooking__CancelBooking__String() {
		return bookingComponent_IBookingEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingComponent_IBooking__AddAdditionalService__String_String() {
		return bookingComponent_IBookingEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingComponent_IBooking__RemoveRoom__String_String() {
		return bookingComponent_IBookingEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingComponent_IBooking__RemoveAddionalService__String_String() {
		return bookingComponent_IBookingEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingComponent_IBooking__GetBookingInfo__String() {
		return bookingComponent_IBookingEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingComponent_IBooking__GenerateReceipt__String() {
		return bookingComponent_IBookingEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingComponent_IBooking__ValidateReferenceNumber__String() {
		return bookingComponent_IBookingEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingComponent_IBooking__GenerateQuote__Date_Date_String() {
		return bookingComponent_IBookingEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingComponent_IBooking__SearchForBooking__String() {
		return bookingComponent_IBookingEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookingComponent_Guest() {
		return bookingComponent_GuestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookingComponent_Guest_FirstName() {
		return (EAttribute)bookingComponent_GuestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookingComponent_Guest_LastName() {
		return (EAttribute)bookingComponent_GuestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookingComponent_Guest_Address() {
		return (EAttribute)bookingComponent_GuestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingFactory getBookingFactory() {
		return (BookingFactory)getEFactoryInstance();
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
		bookingComponentEClass = createEClass(BOOKING_COMPONENT);

		bookingComponent_PaymentDetailsEClass = createEClass(BOOKING_COMPONENT_PAYMENT_DETAILS);
		createEAttribute(bookingComponent_PaymentDetailsEClass, BOOKING_COMPONENT_PAYMENT_DETAILS__FIRST_NAME);
		createEAttribute(bookingComponent_PaymentDetailsEClass, BOOKING_COMPONENT_PAYMENT_DETAILS__LAST_NAME);
		createEAttribute(bookingComponent_PaymentDetailsEClass, BOOKING_COMPONENT_PAYMENT_DETAILS__ADDRESS);
		createEAttribute(bookingComponent_PaymentDetailsEClass, BOOKING_COMPONENT_PAYMENT_DETAILS__CC_NUMBER);
		createEAttribute(bookingComponent_PaymentDetailsEClass, BOOKING_COMPONENT_PAYMENT_DETAILS__CCV);
		createEAttribute(bookingComponent_PaymentDetailsEClass, BOOKING_COMPONENT_PAYMENT_DETAILS__EXPIRY_MONTH);
		createEAttribute(bookingComponent_PaymentDetailsEClass, BOOKING_COMPONENT_PAYMENT_DETAILS__EXPIRY_YEAR);

		bookingComponent_BookingEClass = createEClass(BOOKING_COMPONENT_BOOKING);
		createEAttribute(bookingComponent_BookingEClass, BOOKING_COMPONENT_BOOKING__ARRIVAL_DATE);
		createEAttribute(bookingComponent_BookingEClass, BOOKING_COMPONENT_BOOKING__DEPARTURE_DATE);
		createEAttribute(bookingComponent_BookingEClass, BOOKING_COMPONENT_BOOKING__REFERENCE_NUMBER);
		createEAttribute(bookingComponent_BookingEClass, BOOKING_COMPONENT_BOOKING__CURRENT_COST);
		createEOperation(bookingComponent_BookingEClass, BOOKING_COMPONENT_BOOKING___BOOKING_OBJECT);
		createEOperation(bookingComponent_BookingEClass, BOOKING_COMPONENT_BOOKING___BOOKING__DATE_DATE);
		createEOperation(bookingComponent_BookingEClass, BOOKING_COMPONENT_BOOKING___ADD_ADDITIONAL_SERVICE_TO_BOOKING__BOOKINGCOMPONENT_ADDITIONALSERVICE);
		createEOperation(bookingComponent_BookingEClass, BOOKING_COMPONENT_BOOKING___BOOKING__STRING_DATE_DATE_STRING_STRING_STRING_STRING_STRING_STRING_STRING_STRING_STRING);
		createEOperation(bookingComponent_BookingEClass, BOOKING_COMPONENT_BOOKING___ADD_ROOM_TO_BOOKING__BOOKINGCOMPONENT_ROOMTYPE);
		createEOperation(bookingComponent_BookingEClass, BOOKING_COMPONENT_BOOKING___REMOVE_ROOM_FROM_BOOKING__STRING);
		createEOperation(bookingComponent_BookingEClass, BOOKING_COMPONENT_BOOKING___UPDATE_BOOKING__STRING_DATE_DATE);
		createEOperation(bookingComponent_BookingEClass, BOOKING_COMPONENT_BOOKING___REMOVE_ADDITIONAL_SERVICE_FROM_BOOKING__BOOKINGCOMPONENT_ADDITIONALSERVICE);
		createEOperation(bookingComponent_BookingEClass, BOOKING_COMPONENT_BOOKING___CURRENT_COST);
		createEOperation(bookingComponent_BookingEClass, BOOKING_COMPONENT_BOOKING___UPDATE_PAYMENT_DETAILS__BOOKINGCOMPONENT_PAYMENTDETAILS);

		bookingComponent_AdditionalServiceEClass = createEClass(BOOKING_COMPONENT_ADDITIONAL_SERVICE);
		createEAttribute(bookingComponent_AdditionalServiceEClass, BOOKING_COMPONENT_ADDITIONAL_SERVICE__NAME);
		createEAttribute(bookingComponent_AdditionalServiceEClass, BOOKING_COMPONENT_ADDITIONAL_SERVICE__DESCRIPTION);
		createEAttribute(bookingComponent_AdditionalServiceEClass, BOOKING_COMPONENT_ADDITIONAL_SERVICE__COST);

		bookingComponent_RoomTypeEClass = createEClass(BOOKING_COMPONENT_ROOM_TYPE);
		createEAttribute(bookingComponent_RoomTypeEClass, BOOKING_COMPONENT_ROOM_TYPE__ROOM_TYPE);
		createEAttribute(bookingComponent_RoomTypeEClass, BOOKING_COMPONENT_ROOM_TYPE__COST);

		bookingComponent_BookingManagerEClass = createEClass(BOOKING_COMPONENT_BOOKING_MANAGER);
		createEOperation(bookingComponent_BookingManagerEClass, BOOKING_COMPONENT_BOOKING_MANAGER___BOOKING_MANAGER);

		bookingComponent_IBookingEClass = createEClass(BOOKING_COMPONENT_IBOOKING);
		createEOperation(bookingComponent_IBookingEClass, BOOKING_COMPONENT_IBOOKING___SEARCH_ROOMS__STRING_INT_DATE_DATE);
		createEOperation(bookingComponent_IBookingEClass, BOOKING_COMPONENT_IBOOKING___MAKE_BOOKING__STRING_DATE_DATE_STRING_STRING_STRING_STRING_STRING_STRING_STRING_STRING_STRING);
		createEOperation(bookingComponent_IBookingEClass, BOOKING_COMPONENT_IBOOKING___ADD_ROOM__STRING_STRING);
		createEOperation(bookingComponent_IBookingEClass, BOOKING_COMPONENT_IBOOKING___REQUEST_QUOTE__STRING_INT_DATE_DATE);
		createEOperation(bookingComponent_IBookingEClass, BOOKING_COMPONENT_IBOOKING___EDIT_BOOKING__STRING_STRING_DATE_DATE_STRING);
		createEOperation(bookingComponent_IBookingEClass, BOOKING_COMPONENT_IBOOKING___CANCEL_BOOKING__STRING);
		createEOperation(bookingComponent_IBookingEClass, BOOKING_COMPONENT_IBOOKING___ADD_ADDITIONAL_SERVICE__STRING_STRING);
		createEOperation(bookingComponent_IBookingEClass, BOOKING_COMPONENT_IBOOKING___REMOVE_ROOM__STRING_STRING);
		createEOperation(bookingComponent_IBookingEClass, BOOKING_COMPONENT_IBOOKING___REMOVE_ADDIONAL_SERVICE__STRING_STRING);
		createEOperation(bookingComponent_IBookingEClass, BOOKING_COMPONENT_IBOOKING___GET_BOOKING_INFO__STRING);
		createEOperation(bookingComponent_IBookingEClass, BOOKING_COMPONENT_IBOOKING___GENERATE_RECEIPT__STRING);
		createEOperation(bookingComponent_IBookingEClass, BOOKING_COMPONENT_IBOOKING___VALIDATE_REFERENCE_NUMBER__STRING);
		createEOperation(bookingComponent_IBookingEClass, BOOKING_COMPONENT_IBOOKING___GENERATE_QUOTE__DATE_DATE_STRING);
		createEOperation(bookingComponent_IBookingEClass, BOOKING_COMPONENT_IBOOKING___SEARCH_FOR_BOOKING__STRING);

		bookingComponent_GuestEClass = createEClass(BOOKING_COMPONENT_GUEST);
		createEAttribute(bookingComponent_GuestEClass, BOOKING_COMPONENT_GUEST__FIRST_NAME);
		createEAttribute(bookingComponent_GuestEClass, BOOKING_COMPONENT_GUEST__LAST_NAME);
		createEAttribute(bookingComponent_GuestEClass, BOOKING_COMPONENT_GUEST__ADDRESS);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(bookingComponentEClass, BookingComponent.class, "BookingComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bookingComponent_PaymentDetailsEClass, BookingComponent_PaymentDetails.class, "BookingComponent_PaymentDetails", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBookingComponent_PaymentDetails_FirstName(), theTypesPackage.getString(), "firstName", null, 1, 1, BookingComponent_PaymentDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBookingComponent_PaymentDetails_LastName(), theTypesPackage.getString(), "lastName", null, 1, 1, BookingComponent_PaymentDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBookingComponent_PaymentDetails_Address(), theTypesPackage.getString(), "address", null, 1, 1, BookingComponent_PaymentDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBookingComponent_PaymentDetails_CcNumber(), theTypesPackage.getString(), "ccNumber", null, 1, 1, BookingComponent_PaymentDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBookingComponent_PaymentDetails_Ccv(), theTypesPackage.getString(), "ccv", null, 1, 1, BookingComponent_PaymentDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBookingComponent_PaymentDetails_ExpiryMonth(), theTypesPackage.getString(), "expiryMonth", null, 1, 1, BookingComponent_PaymentDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBookingComponent_PaymentDetails_ExpiryYear(), theTypesPackage.getString(), "expiryYear", null, 1, 1, BookingComponent_PaymentDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bookingComponent_BookingEClass, BookingComponent_Booking.class, "BookingComponent_Booking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBookingComponent_Booking_ArrivalDate(), ecorePackage.getEDate(), "arrivalDate", null, 1, 1, BookingComponent_Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBookingComponent_Booking_DepartureDate(), ecorePackage.getEDate(), "departureDate", null, 1, 1, BookingComponent_Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBookingComponent_Booking_ReferenceNumber(), theTypesPackage.getString(), "referenceNumber", null, 1, 1, BookingComponent_Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBookingComponent_Booking_CurrentCost(), theTypesPackage.getInteger(), "currentCost", null, 1, 1, BookingComponent_Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getBookingComponent_Booking__BookingObject(), null, "BookingObject", 1, 1, IS_UNIQUE, !IS_ORDERED);

		EOperation op = initEOperation(getBookingComponent_Booking__Booking__Date_Date(), null, "Booking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "arrivalDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "departureDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingComponent_Booking__AddAdditionalServiceToBooking__BookingComponent_AdditionalService(), null, "addAdditionalServiceToBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBookingComponent_AdditionalService(), "newService", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingComponent_Booking__Booking__String_Date_Date_String_String_String_String_String_String_String_String_String(), null, "Booking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "arrivalDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "departureDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "customerSSN", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "customerFirstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "customerLastName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "customerAddress", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "customerEmail", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "expiryMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "expiryYear", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingComponent_Booking__AddRoomToBooking__BookingComponent_RoomType(), null, "addRoomToBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBookingComponent_RoomType(), "newRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingComponent_Booking__RemoveRoomFromBooking__String(), null, "removeRoomFromBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingComponent_Booking__UpdateBooking__String_Date_Date(), null, "updateBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookingReference", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "arrivalDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "departureDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingComponent_Booking__RemoveAdditionalServiceFromBooking__BookingComponent_AdditionalService(), null, "removeAdditionalServiceFromBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBookingComponent_AdditionalService(), "additionalService", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBookingComponent_Booking__CurrentCost(), theTypesPackage.getInteger(), "currentCost", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingComponent_Booking__UpdatePaymentDetails__BookingComponent_PaymentDetails(), null, "updatePaymentDetails", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBookingComponent_PaymentDetails(), "newPaymentDetails", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(bookingComponent_AdditionalServiceEClass, BookingComponent_AdditionalService.class, "BookingComponent_AdditionalService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBookingComponent_AdditionalService_Name(), theTypesPackage.getString(), "name", null, 1, 1, BookingComponent_AdditionalService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBookingComponent_AdditionalService_Description(), theTypesPackage.getString(), "description", null, 1, 1, BookingComponent_AdditionalService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBookingComponent_AdditionalService_Cost(), theTypesPackage.getInteger(), "cost", null, 1, 1, BookingComponent_AdditionalService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bookingComponent_RoomTypeEClass, BookingComponent_RoomType.class, "BookingComponent_RoomType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBookingComponent_RoomType_RoomType(), theTypesPackage.getString(), "roomType", null, 1, 1, BookingComponent_RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBookingComponent_RoomType_Cost(), theTypesPackage.getInteger(), "cost", null, 1, 1, BookingComponent_RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bookingComponent_BookingManagerEClass, BookingComponent_BookingManager.class, "BookingComponent_BookingManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getBookingComponent_BookingManager__BookingManager(), null, "BookingManager", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(bookingComponent_IBookingEClass, BookingComponent_IBooking.class, "BookingComponent_IBooking", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getBookingComponent_IBooking__SearchRooms__String_int_Date_Date(), null, "searchRooms", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "arrivalDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "departureDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingComponent_IBooking__MakeBooking__String_Date_Date_String_String_String_String_String_String_String_String_String(), null, "makeBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "arrivalDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "departureDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "customerSSN", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "customerFirstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "customerLastName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "customerAddress", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "customerEmail", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "expiryMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "expiryYear", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingComponent_IBooking__AddRoom__String_String(), null, "addRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookingReference", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingComponent_IBooking__RequestQuote__String_int_Date_Date(), null, "requestQuote", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "arrivalDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "departureDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingComponent_IBooking__EditBooking__String_String_Date_Date_String(), null, "editBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookingReference", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "arrivalDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "departureDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "customerId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingComponent_IBooking__CancelBooking__String(), null, "cancelBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookingReference", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingComponent_IBooking__AddAdditionalService__String_String(), null, "addAdditionalService", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookingReference", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "additionalServiceName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingComponent_IBooking__RemoveRoom__String_String(), null, "removeRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookingReference", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingComponent_IBooking__RemoveAddionalService__String_String(), null, "removeAddionalService", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookingReference", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "additionalServiceName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingComponent_IBooking__GetBookingInfo__String(), null, "getBookingInfo", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookingReference", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingComponent_IBooking__GenerateReceipt__String(), null, "generateReceipt", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookingReference", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingComponent_IBooking__ValidateReferenceNumber__String(), theTypesPackage.getString(), "validateReferenceNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "referenceNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingComponent_IBooking__GenerateQuote__Date_Date_String(), null, "generateQuote", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "startDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "endDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingComponent_IBooking__SearchForBooking__String(), null, "searchForBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookingReference", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(bookingComponent_GuestEClass, BookingComponent_Guest.class, "BookingComponent_Guest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBookingComponent_Guest_FirstName(), theTypesPackage.getString(), "firstName", null, 1, 1, BookingComponent_Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBookingComponent_Guest_LastName(), theTypesPackage.getString(), "lastName", null, 1, 1, BookingComponent_Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBookingComponent_Guest_Address(), theTypesPackage.getString(), "address", null, 1, 1, BookingComponent_Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //BookingPackageImpl
