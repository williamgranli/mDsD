/**
 */
package Booking;

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
 * @see Booking.BookingFactory
 * @model kind="package"
 * @generated
 */
public interface BookingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Booking";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///Booking.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Booking";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BookingPackage eINSTANCE = Booking.impl.BookingPackageImpl.init();

	/**
	 * The meta object id for the '{@link Booking.impl.BookingComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Booking.impl.BookingComponentImpl
	 * @see Booking.impl.BookingPackageImpl#getBookingComponent()
	 * @generated
	 */
	int BOOKING_COMPONENT = 0;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Booking.impl.BookingComponent_PaymentDetailsImpl <em>Component Payment Details</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Booking.impl.BookingComponent_PaymentDetailsImpl
	 * @see Booking.impl.BookingPackageImpl#getBookingComponent_PaymentDetails()
	 * @generated
	 */
	int BOOKING_COMPONENT_PAYMENT_DETAILS = 1;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_PAYMENT_DETAILS__FIRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_PAYMENT_DETAILS__LAST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_PAYMENT_DETAILS__ADDRESS = 2;

	/**
	 * The feature id for the '<em><b>Cc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_PAYMENT_DETAILS__CC_NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Ccv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_PAYMENT_DETAILS__CCV = 4;

	/**
	 * The feature id for the '<em><b>Expiry Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_PAYMENT_DETAILS__EXPIRY_MONTH = 5;

	/**
	 * The feature id for the '<em><b>Expiry Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_PAYMENT_DETAILS__EXPIRY_YEAR = 6;

	/**
	 * The number of structural features of the '<em>Component Payment Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_PAYMENT_DETAILS_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Component Payment Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_PAYMENT_DETAILS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Booking.impl.BookingComponent_BookingImpl <em>Component Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Booking.impl.BookingComponent_BookingImpl
	 * @see Booking.impl.BookingPackageImpl#getBookingComponent_Booking()
	 * @generated
	 */
	int BOOKING_COMPONENT_BOOKING = 2;

	/**
	 * The feature id for the '<em><b>Arrival Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING__ARRIVAL_DATE = 0;

	/**
	 * The feature id for the '<em><b>Departure Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING__DEPARTURE_DATE = 1;

	/**
	 * The feature id for the '<em><b>Reference Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING__REFERENCE_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Current Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING__CURRENT_COST = 3;

	/**
	 * The number of structural features of the '<em>Component Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Booking Object</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING___BOOKING_OBJECT = 0;

	/**
	 * The operation id for the '<em>Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING___BOOKING__DATE_DATE = 1;

	/**
	 * The operation id for the '<em>Add Additional Service To Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING___ADD_ADDITIONAL_SERVICE_TO_BOOKING__BOOKINGCOMPONENT_ADDITIONALSERVICE = 2;

	/**
	 * The operation id for the '<em>Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING___BOOKING__STRING_DATE_DATE_STRING_STRING_STRING_STRING_STRING_STRING_STRING_STRING_STRING = 3;

	/**
	 * The operation id for the '<em>Add Room To Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING___ADD_ROOM_TO_BOOKING__BOOKINGCOMPONENT_ROOMTYPE = 4;

	/**
	 * The operation id for the '<em>Remove Room From Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING___REMOVE_ROOM_FROM_BOOKING__STRING = 5;

	/**
	 * The operation id for the '<em>Update Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING___UPDATE_BOOKING__STRING_DATE_DATE = 6;

	/**
	 * The operation id for the '<em>Remove Additional Service From Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING___REMOVE_ADDITIONAL_SERVICE_FROM_BOOKING__BOOKINGCOMPONENT_ADDITIONALSERVICE = 7;

	/**
	 * The operation id for the '<em>Current Cost</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING___CURRENT_COST = 8;

	/**
	 * The operation id for the '<em>Update Payment Details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING___UPDATE_PAYMENT_DETAILS__BOOKINGCOMPONENT_PAYMENTDETAILS = 9;

	/**
	 * The number of operations of the '<em>Component Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_OPERATION_COUNT = 10;

	/**
	 * The meta object id for the '{@link Booking.impl.BookingComponent_AdditionalServiceImpl <em>Component Additional Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Booking.impl.BookingComponent_AdditionalServiceImpl
	 * @see Booking.impl.BookingPackageImpl#getBookingComponent_AdditionalService()
	 * @generated
	 */
	int BOOKING_COMPONENT_ADDITIONAL_SERVICE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_ADDITIONAL_SERVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_ADDITIONAL_SERVICE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_ADDITIONAL_SERVICE__COST = 2;

	/**
	 * The number of structural features of the '<em>Component Additional Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_ADDITIONAL_SERVICE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Component Additional Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_ADDITIONAL_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Booking.impl.BookingComponent_RoomTypeImpl <em>Component Room Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Booking.impl.BookingComponent_RoomTypeImpl
	 * @see Booking.impl.BookingPackageImpl#getBookingComponent_RoomType()
	 * @generated
	 */
	int BOOKING_COMPONENT_ROOM_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Room Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_ROOM_TYPE__ROOM_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_ROOM_TYPE__COST = 1;

	/**
	 * The number of structural features of the '<em>Component Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_ROOM_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Component Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_ROOM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Booking.impl.BookingComponent_BookingManagerImpl <em>Component Booking Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Booking.impl.BookingComponent_BookingManagerImpl
	 * @see Booking.impl.BookingPackageImpl#getBookingComponent_BookingManager()
	 * @generated
	 */
	int BOOKING_COMPONENT_BOOKING_MANAGER = 5;

	/**
	 * The number of structural features of the '<em>Component Booking Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Booking Manager</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_MANAGER___BOOKING_MANAGER = 0;

	/**
	 * The number of operations of the '<em>Component Booking Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_MANAGER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Booking.BookingComponent_IBooking <em>Component IBooking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Booking.BookingComponent_IBooking
	 * @see Booking.impl.BookingPackageImpl#getBookingComponent_IBooking()
	 * @generated
	 */
	int BOOKING_COMPONENT_IBOOKING = 6;

	/**
	 * The number of structural features of the '<em>Component IBooking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Search Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING___SEARCH_ROOMS__STRING_INT_DATE_DATE = 0;

	/**
	 * The operation id for the '<em>Make Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING___MAKE_BOOKING__STRING_DATE_DATE_STRING_STRING_STRING_STRING_STRING_STRING_STRING_STRING_STRING = 1;

	/**
	 * The operation id for the '<em>Add Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING___ADD_ROOM__STRING_STRING = 2;

	/**
	 * The operation id for the '<em>Request Quote</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING___REQUEST_QUOTE__STRING_INT_DATE_DATE = 3;

	/**
	 * The operation id for the '<em>Edit Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING___EDIT_BOOKING__STRING_STRING_DATE_DATE_STRING = 4;

	/**
	 * The operation id for the '<em>Cancel Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING___CANCEL_BOOKING__STRING = 5;

	/**
	 * The operation id for the '<em>Add Additional Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING___ADD_ADDITIONAL_SERVICE__STRING_STRING = 6;

	/**
	 * The operation id for the '<em>Remove Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING___REMOVE_ROOM__STRING_STRING = 7;

	/**
	 * The operation id for the '<em>Remove Addional Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING___REMOVE_ADDIONAL_SERVICE__STRING_STRING = 8;

	/**
	 * The operation id for the '<em>Get Booking Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING___GET_BOOKING_INFO__STRING = 9;

	/**
	 * The operation id for the '<em>Generate Receipt</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING___GENERATE_RECEIPT__STRING = 10;

	/**
	 * The operation id for the '<em>Validate Reference Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING___VALIDATE_REFERENCE_NUMBER__STRING = 11;

	/**
	 * The operation id for the '<em>Generate Quote</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING___GENERATE_QUOTE__DATE_DATE_STRING = 12;

	/**
	 * The operation id for the '<em>Search For Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING___SEARCH_FOR_BOOKING__STRING = 13;

	/**
	 * The number of operations of the '<em>Component IBooking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING_OPERATION_COUNT = 14;

	/**
	 * The meta object id for the '{@link Booking.impl.BookingComponent_GuestImpl <em>Component Guest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Booking.impl.BookingComponent_GuestImpl
	 * @see Booking.impl.BookingPackageImpl#getBookingComponent_Guest()
	 * @generated
	 */
	int BOOKING_COMPONENT_GUEST = 7;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_GUEST__FIRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_GUEST__LAST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_GUEST__ADDRESS = 2;

	/**
	 * The number of structural features of the '<em>Component Guest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_GUEST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Component Guest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_GUEST_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link Booking.BookingComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see Booking.BookingComponent
	 * @generated
	 */
	EClass getBookingComponent();

	/**
	 * Returns the meta object for class '{@link Booking.BookingComponent_PaymentDetails <em>Component Payment Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Payment Details</em>'.
	 * @see Booking.BookingComponent_PaymentDetails
	 * @generated
	 */
	EClass getBookingComponent_PaymentDetails();

	/**
	 * Returns the meta object for the attribute '{@link Booking.BookingComponent_PaymentDetails#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see Booking.BookingComponent_PaymentDetails#getFirstName()
	 * @see #getBookingComponent_PaymentDetails()
	 * @generated
	 */
	EAttribute getBookingComponent_PaymentDetails_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link Booking.BookingComponent_PaymentDetails#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see Booking.BookingComponent_PaymentDetails#getLastName()
	 * @see #getBookingComponent_PaymentDetails()
	 * @generated
	 */
	EAttribute getBookingComponent_PaymentDetails_LastName();

	/**
	 * Returns the meta object for the attribute '{@link Booking.BookingComponent_PaymentDetails#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see Booking.BookingComponent_PaymentDetails#getAddress()
	 * @see #getBookingComponent_PaymentDetails()
	 * @generated
	 */
	EAttribute getBookingComponent_PaymentDetails_Address();

	/**
	 * Returns the meta object for the attribute '{@link Booking.BookingComponent_PaymentDetails#getCcNumber <em>Cc Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc Number</em>'.
	 * @see Booking.BookingComponent_PaymentDetails#getCcNumber()
	 * @see #getBookingComponent_PaymentDetails()
	 * @generated
	 */
	EAttribute getBookingComponent_PaymentDetails_CcNumber();

	/**
	 * Returns the meta object for the attribute '{@link Booking.BookingComponent_PaymentDetails#getCcv <em>Ccv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ccv</em>'.
	 * @see Booking.BookingComponent_PaymentDetails#getCcv()
	 * @see #getBookingComponent_PaymentDetails()
	 * @generated
	 */
	EAttribute getBookingComponent_PaymentDetails_Ccv();

	/**
	 * Returns the meta object for the attribute '{@link Booking.BookingComponent_PaymentDetails#getExpiryMonth <em>Expiry Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiry Month</em>'.
	 * @see Booking.BookingComponent_PaymentDetails#getExpiryMonth()
	 * @see #getBookingComponent_PaymentDetails()
	 * @generated
	 */
	EAttribute getBookingComponent_PaymentDetails_ExpiryMonth();

	/**
	 * Returns the meta object for the attribute '{@link Booking.BookingComponent_PaymentDetails#getExpiryYear <em>Expiry Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiry Year</em>'.
	 * @see Booking.BookingComponent_PaymentDetails#getExpiryYear()
	 * @see #getBookingComponent_PaymentDetails()
	 * @generated
	 */
	EAttribute getBookingComponent_PaymentDetails_ExpiryYear();

	/**
	 * Returns the meta object for class '{@link Booking.BookingComponent_Booking <em>Component Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Booking</em>'.
	 * @see Booking.BookingComponent_Booking
	 * @generated
	 */
	EClass getBookingComponent_Booking();

	/**
	 * Returns the meta object for the attribute '{@link Booking.BookingComponent_Booking#getArrivalDate <em>Arrival Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arrival Date</em>'.
	 * @see Booking.BookingComponent_Booking#getArrivalDate()
	 * @see #getBookingComponent_Booking()
	 * @generated
	 */
	EAttribute getBookingComponent_Booking_ArrivalDate();

	/**
	 * Returns the meta object for the attribute '{@link Booking.BookingComponent_Booking#getDepartureDate <em>Departure Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Departure Date</em>'.
	 * @see Booking.BookingComponent_Booking#getDepartureDate()
	 * @see #getBookingComponent_Booking()
	 * @generated
	 */
	EAttribute getBookingComponent_Booking_DepartureDate();

	/**
	 * Returns the meta object for the attribute '{@link Booking.BookingComponent_Booking#getReferenceNumber <em>Reference Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Number</em>'.
	 * @see Booking.BookingComponent_Booking#getReferenceNumber()
	 * @see #getBookingComponent_Booking()
	 * @generated
	 */
	EAttribute getBookingComponent_Booking_ReferenceNumber();

	/**
	 * Returns the meta object for the attribute '{@link Booking.BookingComponent_Booking#getCurrentCost <em>Current Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Cost</em>'.
	 * @see Booking.BookingComponent_Booking#getCurrentCost()
	 * @see #getBookingComponent_Booking()
	 * @generated
	 */
	EAttribute getBookingComponent_Booking_CurrentCost();

	/**
	 * Returns the meta object for the '{@link Booking.BookingComponent_Booking#BookingObject() <em>Booking Object</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Booking Object</em>' operation.
	 * @see Booking.BookingComponent_Booking#BookingObject()
	 * @generated
	 */
	EOperation getBookingComponent_Booking__BookingObject();

	/**
	 * Returns the meta object for the '{@link Booking.BookingComponent_Booking#Booking(java.util.Date, java.util.Date) <em>Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Booking</em>' operation.
	 * @see Booking.BookingComponent_Booking#Booking(java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getBookingComponent_Booking__Booking__Date_Date();

	/**
	 * Returns the meta object for the '{@link Booking.BookingComponent_Booking#addAdditionalServiceToBooking(Booking.BookingComponent_AdditionalService) <em>Add Additional Service To Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Additional Service To Booking</em>' operation.
	 * @see Booking.BookingComponent_Booking#addAdditionalServiceToBooking(Booking.BookingComponent_AdditionalService)
	 * @generated
	 */
	EOperation getBookingComponent_Booking__AddAdditionalServiceToBooking__BookingComponent_AdditionalService();

	/**
	 * Returns the meta object for the '{@link Booking.BookingComponent_Booking#Booking(java.lang.String, java.util.Date, java.util.Date, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Booking</em>' operation.
	 * @see Booking.BookingComponent_Booking#Booking(java.lang.String, java.util.Date, java.util.Date, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_Booking__Booking__String_Date_Date_String_String_String_String_String_String_String_String_String();

	/**
	 * Returns the meta object for the '{@link Booking.BookingComponent_Booking#addRoomToBooking(Booking.BookingComponent_RoomType) <em>Add Room To Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room To Booking</em>' operation.
	 * @see Booking.BookingComponent_Booking#addRoomToBooking(Booking.BookingComponent_RoomType)
	 * @generated
	 */
	EOperation getBookingComponent_Booking__AddRoomToBooking__BookingComponent_RoomType();

	/**
	 * Returns the meta object for the '{@link Booking.BookingComponent_Booking#removeRoomFromBooking(java.lang.String) <em>Remove Room From Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room From Booking</em>' operation.
	 * @see Booking.BookingComponent_Booking#removeRoomFromBooking(java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_Booking__RemoveRoomFromBooking__String();

	/**
	 * Returns the meta object for the '{@link Booking.BookingComponent_Booking#updateBooking(java.lang.String, java.util.Date, java.util.Date) <em>Update Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Booking</em>' operation.
	 * @see Booking.BookingComponent_Booking#updateBooking(java.lang.String, java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getBookingComponent_Booking__UpdateBooking__String_Date_Date();

	/**
	 * Returns the meta object for the '{@link Booking.BookingComponent_Booking#removeAdditionalServiceFromBooking(Booking.BookingComponent_AdditionalService) <em>Remove Additional Service From Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Additional Service From Booking</em>' operation.
	 * @see Booking.BookingComponent_Booking#removeAdditionalServiceFromBooking(Booking.BookingComponent_AdditionalService)
	 * @generated
	 */
	EOperation getBookingComponent_Booking__RemoveAdditionalServiceFromBooking__BookingComponent_AdditionalService();

	/**
	 * Returns the meta object for the '{@link Booking.BookingComponent_Booking#currentCost() <em>Current Cost</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Current Cost</em>' operation.
	 * @see Booking.BookingComponent_Booking#currentCost()
	 * @generated
	 */
	EOperation getBookingComponent_Booking__CurrentCost();

	/**
	 * Returns the meta object for the '{@link Booking.BookingComponent_Booking#updatePaymentDetails(Booking.BookingComponent_PaymentDetails) <em>Update Payment Details</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Payment Details</em>' operation.
	 * @see Booking.BookingComponent_Booking#updatePaymentDetails(Booking.BookingComponent_PaymentDetails)
	 * @generated
	 */
	EOperation getBookingComponent_Booking__UpdatePaymentDetails__BookingComponent_PaymentDetails();

	/**
	 * Returns the meta object for class '{@link Booking.BookingComponent_AdditionalService <em>Component Additional Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Additional Service</em>'.
	 * @see Booking.BookingComponent_AdditionalService
	 * @generated
	 */
	EClass getBookingComponent_AdditionalService();

	/**
	 * Returns the meta object for the attribute '{@link Booking.BookingComponent_AdditionalService#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Booking.BookingComponent_AdditionalService#getName()
	 * @see #getBookingComponent_AdditionalService()
	 * @generated
	 */
	EAttribute getBookingComponent_AdditionalService_Name();

	/**
	 * Returns the meta object for the attribute '{@link Booking.BookingComponent_AdditionalService#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Booking.BookingComponent_AdditionalService#getDescription()
	 * @see #getBookingComponent_AdditionalService()
	 * @generated
	 */
	EAttribute getBookingComponent_AdditionalService_Description();

	/**
	 * Returns the meta object for the attribute '{@link Booking.BookingComponent_AdditionalService#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see Booking.BookingComponent_AdditionalService#getCost()
	 * @see #getBookingComponent_AdditionalService()
	 * @generated
	 */
	EAttribute getBookingComponent_AdditionalService_Cost();

	/**
	 * Returns the meta object for class '{@link Booking.BookingComponent_RoomType <em>Component Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Room Type</em>'.
	 * @see Booking.BookingComponent_RoomType
	 * @generated
	 */
	EClass getBookingComponent_RoomType();

	/**
	 * Returns the meta object for the attribute '{@link Booking.BookingComponent_RoomType#getRoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Type</em>'.
	 * @see Booking.BookingComponent_RoomType#getRoomType()
	 * @see #getBookingComponent_RoomType()
	 * @generated
	 */
	EAttribute getBookingComponent_RoomType_RoomType();

	/**
	 * Returns the meta object for the attribute '{@link Booking.BookingComponent_RoomType#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see Booking.BookingComponent_RoomType#getCost()
	 * @see #getBookingComponent_RoomType()
	 * @generated
	 */
	EAttribute getBookingComponent_RoomType_Cost();

	/**
	 * Returns the meta object for class '{@link Booking.BookingComponent_BookingManager <em>Component Booking Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Booking Manager</em>'.
	 * @see Booking.BookingComponent_BookingManager
	 * @generated
	 */
	EClass getBookingComponent_BookingManager();

	/**
	 * Returns the meta object for the '{@link Booking.BookingComponent_BookingManager#BookingManager() <em>Booking Manager</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Booking Manager</em>' operation.
	 * @see Booking.BookingComponent_BookingManager#BookingManager()
	 * @generated
	 */
	EOperation getBookingComponent_BookingManager__BookingManager();

	/**
	 * Returns the meta object for class '{@link Booking.BookingComponent_IBooking <em>Component IBooking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component IBooking</em>'.
	 * @see Booking.BookingComponent_IBooking
	 * @generated
	 */
	EClass getBookingComponent_IBooking();

	/**
	 * Returns the meta object for the '{@link Booking.BookingComponent_IBooking#searchRooms(java.lang.String, int, java.util.Date, java.util.Date) <em>Search Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Rooms</em>' operation.
	 * @see Booking.BookingComponent_IBooking#searchRooms(java.lang.String, int, java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getBookingComponent_IBooking__SearchRooms__String_int_Date_Date();

	/**
	 * Returns the meta object for the '{@link Booking.BookingComponent_IBooking#makeBooking(java.lang.String, java.util.Date, java.util.Date, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Make Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Booking</em>' operation.
	 * @see Booking.BookingComponent_IBooking#makeBooking(java.lang.String, java.util.Date, java.util.Date, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_IBooking__MakeBooking__String_Date_Date_String_String_String_String_String_String_String_String_String();

	/**
	 * Returns the meta object for the '{@link Booking.BookingComponent_IBooking#addRoom(java.lang.String, java.lang.String) <em>Add Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room</em>' operation.
	 * @see Booking.BookingComponent_IBooking#addRoom(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_IBooking__AddRoom__String_String();

	/**
	 * Returns the meta object for the '{@link Booking.BookingComponent_IBooking#requestQuote(java.lang.String, int, java.util.Date, java.util.Date) <em>Request Quote</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Request Quote</em>' operation.
	 * @see Booking.BookingComponent_IBooking#requestQuote(java.lang.String, int, java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getBookingComponent_IBooking__RequestQuote__String_int_Date_Date();

	/**
	 * Returns the meta object for the '{@link Booking.BookingComponent_IBooking#editBooking(java.lang.String, java.lang.String, java.util.Date, java.util.Date, java.lang.String) <em>Edit Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Booking</em>' operation.
	 * @see Booking.BookingComponent_IBooking#editBooking(java.lang.String, java.lang.String, java.util.Date, java.util.Date, java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_IBooking__EditBooking__String_String_Date_Date_String();

	/**
	 * Returns the meta object for the '{@link Booking.BookingComponent_IBooking#cancelBooking(java.lang.String) <em>Cancel Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel Booking</em>' operation.
	 * @see Booking.BookingComponent_IBooking#cancelBooking(java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_IBooking__CancelBooking__String();

	/**
	 * Returns the meta object for the '{@link Booking.BookingComponent_IBooking#addAdditionalService(java.lang.String, java.lang.String) <em>Add Additional Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Additional Service</em>' operation.
	 * @see Booking.BookingComponent_IBooking#addAdditionalService(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_IBooking__AddAdditionalService__String_String();

	/**
	 * Returns the meta object for the '{@link Booking.BookingComponent_IBooking#removeRoom(java.lang.String, java.lang.String) <em>Remove Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room</em>' operation.
	 * @see Booking.BookingComponent_IBooking#removeRoom(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_IBooking__RemoveRoom__String_String();

	/**
	 * Returns the meta object for the '{@link Booking.BookingComponent_IBooking#removeAddionalService(java.lang.String, java.lang.String) <em>Remove Addional Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Addional Service</em>' operation.
	 * @see Booking.BookingComponent_IBooking#removeAddionalService(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_IBooking__RemoveAddionalService__String_String();

	/**
	 * Returns the meta object for the '{@link Booking.BookingComponent_IBooking#getBookingInfo(java.lang.String) <em>Get Booking Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Booking Info</em>' operation.
	 * @see Booking.BookingComponent_IBooking#getBookingInfo(java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_IBooking__GetBookingInfo__String();

	/**
	 * Returns the meta object for the '{@link Booking.BookingComponent_IBooking#generateReceipt(java.lang.String) <em>Generate Receipt</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Receipt</em>' operation.
	 * @see Booking.BookingComponent_IBooking#generateReceipt(java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_IBooking__GenerateReceipt__String();

	/**
	 * Returns the meta object for the '{@link Booking.BookingComponent_IBooking#validateReferenceNumber(java.lang.String) <em>Validate Reference Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Reference Number</em>' operation.
	 * @see Booking.BookingComponent_IBooking#validateReferenceNumber(java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_IBooking__ValidateReferenceNumber__String();

	/**
	 * Returns the meta object for the '{@link Booking.BookingComponent_IBooking#generateQuote(java.util.Date, java.util.Date, java.lang.String) <em>Generate Quote</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Quote</em>' operation.
	 * @see Booking.BookingComponent_IBooking#generateQuote(java.util.Date, java.util.Date, java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_IBooking__GenerateQuote__Date_Date_String();

	/**
	 * Returns the meta object for the '{@link Booking.BookingComponent_IBooking#searchForBooking(java.lang.String) <em>Search For Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search For Booking</em>' operation.
	 * @see Booking.BookingComponent_IBooking#searchForBooking(java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_IBooking__SearchForBooking__String();

	/**
	 * Returns the meta object for class '{@link Booking.BookingComponent_Guest <em>Component Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Guest</em>'.
	 * @see Booking.BookingComponent_Guest
	 * @generated
	 */
	EClass getBookingComponent_Guest();

	/**
	 * Returns the meta object for the attribute '{@link Booking.BookingComponent_Guest#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see Booking.BookingComponent_Guest#getFirstName()
	 * @see #getBookingComponent_Guest()
	 * @generated
	 */
	EAttribute getBookingComponent_Guest_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link Booking.BookingComponent_Guest#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see Booking.BookingComponent_Guest#getLastName()
	 * @see #getBookingComponent_Guest()
	 * @generated
	 */
	EAttribute getBookingComponent_Guest_LastName();

	/**
	 * Returns the meta object for the attribute '{@link Booking.BookingComponent_Guest#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see Booking.BookingComponent_Guest#getAddress()
	 * @see #getBookingComponent_Guest()
	 * @generated
	 */
	EAttribute getBookingComponent_Guest_Address();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BookingFactory getBookingFactory();

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
		 * The meta object literal for the '{@link Booking.impl.BookingComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Booking.impl.BookingComponentImpl
		 * @see Booking.impl.BookingPackageImpl#getBookingComponent()
		 * @generated
		 */
		EClass BOOKING_COMPONENT = eINSTANCE.getBookingComponent();

		/**
		 * The meta object literal for the '{@link Booking.impl.BookingComponent_PaymentDetailsImpl <em>Component Payment Details</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Booking.impl.BookingComponent_PaymentDetailsImpl
		 * @see Booking.impl.BookingPackageImpl#getBookingComponent_PaymentDetails()
		 * @generated
		 */
		EClass BOOKING_COMPONENT_PAYMENT_DETAILS = eINSTANCE.getBookingComponent_PaymentDetails();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_PAYMENT_DETAILS__FIRST_NAME = eINSTANCE.getBookingComponent_PaymentDetails_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_PAYMENT_DETAILS__LAST_NAME = eINSTANCE.getBookingComponent_PaymentDetails_LastName();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_PAYMENT_DETAILS__ADDRESS = eINSTANCE.getBookingComponent_PaymentDetails_Address();

		/**
		 * The meta object literal for the '<em><b>Cc Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_PAYMENT_DETAILS__CC_NUMBER = eINSTANCE.getBookingComponent_PaymentDetails_CcNumber();

		/**
		 * The meta object literal for the '<em><b>Ccv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_PAYMENT_DETAILS__CCV = eINSTANCE.getBookingComponent_PaymentDetails_Ccv();

		/**
		 * The meta object literal for the '<em><b>Expiry Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_PAYMENT_DETAILS__EXPIRY_MONTH = eINSTANCE.getBookingComponent_PaymentDetails_ExpiryMonth();

		/**
		 * The meta object literal for the '<em><b>Expiry Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_PAYMENT_DETAILS__EXPIRY_YEAR = eINSTANCE.getBookingComponent_PaymentDetails_ExpiryYear();

		/**
		 * The meta object literal for the '{@link Booking.impl.BookingComponent_BookingImpl <em>Component Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Booking.impl.BookingComponent_BookingImpl
		 * @see Booking.impl.BookingPackageImpl#getBookingComponent_Booking()
		 * @generated
		 */
		EClass BOOKING_COMPONENT_BOOKING = eINSTANCE.getBookingComponent_Booking();

		/**
		 * The meta object literal for the '<em><b>Arrival Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_BOOKING__ARRIVAL_DATE = eINSTANCE.getBookingComponent_Booking_ArrivalDate();

		/**
		 * The meta object literal for the '<em><b>Departure Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_BOOKING__DEPARTURE_DATE = eINSTANCE.getBookingComponent_Booking_DepartureDate();

		/**
		 * The meta object literal for the '<em><b>Reference Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_BOOKING__REFERENCE_NUMBER = eINSTANCE.getBookingComponent_Booking_ReferenceNumber();

		/**
		 * The meta object literal for the '<em><b>Current Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_BOOKING__CURRENT_COST = eINSTANCE.getBookingComponent_Booking_CurrentCost();

		/**
		 * The meta object literal for the '<em><b>Booking Object</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_BOOKING___BOOKING_OBJECT = eINSTANCE.getBookingComponent_Booking__BookingObject();

		/**
		 * The meta object literal for the '<em><b>Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_BOOKING___BOOKING__DATE_DATE = eINSTANCE.getBookingComponent_Booking__Booking__Date_Date();

		/**
		 * The meta object literal for the '<em><b>Add Additional Service To Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_BOOKING___ADD_ADDITIONAL_SERVICE_TO_BOOKING__BOOKINGCOMPONENT_ADDITIONALSERVICE = eINSTANCE.getBookingComponent_Booking__AddAdditionalServiceToBooking__BookingComponent_AdditionalService();

		/**
		 * The meta object literal for the '<em><b>Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_BOOKING___BOOKING__STRING_DATE_DATE_STRING_STRING_STRING_STRING_STRING_STRING_STRING_STRING_STRING = eINSTANCE.getBookingComponent_Booking__Booking__String_Date_Date_String_String_String_String_String_String_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Add Room To Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_BOOKING___ADD_ROOM_TO_BOOKING__BOOKINGCOMPONENT_ROOMTYPE = eINSTANCE.getBookingComponent_Booking__AddRoomToBooking__BookingComponent_RoomType();

		/**
		 * The meta object literal for the '<em><b>Remove Room From Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_BOOKING___REMOVE_ROOM_FROM_BOOKING__STRING = eINSTANCE.getBookingComponent_Booking__RemoveRoomFromBooking__String();

		/**
		 * The meta object literal for the '<em><b>Update Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_BOOKING___UPDATE_BOOKING__STRING_DATE_DATE = eINSTANCE.getBookingComponent_Booking__UpdateBooking__String_Date_Date();

		/**
		 * The meta object literal for the '<em><b>Remove Additional Service From Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_BOOKING___REMOVE_ADDITIONAL_SERVICE_FROM_BOOKING__BOOKINGCOMPONENT_ADDITIONALSERVICE = eINSTANCE.getBookingComponent_Booking__RemoveAdditionalServiceFromBooking__BookingComponent_AdditionalService();

		/**
		 * The meta object literal for the '<em><b>Current Cost</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_BOOKING___CURRENT_COST = eINSTANCE.getBookingComponent_Booking__CurrentCost();

		/**
		 * The meta object literal for the '<em><b>Update Payment Details</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_BOOKING___UPDATE_PAYMENT_DETAILS__BOOKINGCOMPONENT_PAYMENTDETAILS = eINSTANCE.getBookingComponent_Booking__UpdatePaymentDetails__BookingComponent_PaymentDetails();

		/**
		 * The meta object literal for the '{@link Booking.impl.BookingComponent_AdditionalServiceImpl <em>Component Additional Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Booking.impl.BookingComponent_AdditionalServiceImpl
		 * @see Booking.impl.BookingPackageImpl#getBookingComponent_AdditionalService()
		 * @generated
		 */
		EClass BOOKING_COMPONENT_ADDITIONAL_SERVICE = eINSTANCE.getBookingComponent_AdditionalService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_ADDITIONAL_SERVICE__NAME = eINSTANCE.getBookingComponent_AdditionalService_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_ADDITIONAL_SERVICE__DESCRIPTION = eINSTANCE.getBookingComponent_AdditionalService_Description();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_ADDITIONAL_SERVICE__COST = eINSTANCE.getBookingComponent_AdditionalService_Cost();

		/**
		 * The meta object literal for the '{@link Booking.impl.BookingComponent_RoomTypeImpl <em>Component Room Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Booking.impl.BookingComponent_RoomTypeImpl
		 * @see Booking.impl.BookingPackageImpl#getBookingComponent_RoomType()
		 * @generated
		 */
		EClass BOOKING_COMPONENT_ROOM_TYPE = eINSTANCE.getBookingComponent_RoomType();

		/**
		 * The meta object literal for the '<em><b>Room Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_ROOM_TYPE__ROOM_TYPE = eINSTANCE.getBookingComponent_RoomType_RoomType();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_ROOM_TYPE__COST = eINSTANCE.getBookingComponent_RoomType_Cost();

		/**
		 * The meta object literal for the '{@link Booking.impl.BookingComponent_BookingManagerImpl <em>Component Booking Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Booking.impl.BookingComponent_BookingManagerImpl
		 * @see Booking.impl.BookingPackageImpl#getBookingComponent_BookingManager()
		 * @generated
		 */
		EClass BOOKING_COMPONENT_BOOKING_MANAGER = eINSTANCE.getBookingComponent_BookingManager();

		/**
		 * The meta object literal for the '<em><b>Booking Manager</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_BOOKING_MANAGER___BOOKING_MANAGER = eINSTANCE.getBookingComponent_BookingManager__BookingManager();

		/**
		 * The meta object literal for the '{@link Booking.BookingComponent_IBooking <em>Component IBooking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Booking.BookingComponent_IBooking
		 * @see Booking.impl.BookingPackageImpl#getBookingComponent_IBooking()
		 * @generated
		 */
		EClass BOOKING_COMPONENT_IBOOKING = eINSTANCE.getBookingComponent_IBooking();

		/**
		 * The meta object literal for the '<em><b>Search Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING___SEARCH_ROOMS__STRING_INT_DATE_DATE = eINSTANCE.getBookingComponent_IBooking__SearchRooms__String_int_Date_Date();

		/**
		 * The meta object literal for the '<em><b>Make Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING___MAKE_BOOKING__STRING_DATE_DATE_STRING_STRING_STRING_STRING_STRING_STRING_STRING_STRING_STRING = eINSTANCE.getBookingComponent_IBooking__MakeBooking__String_Date_Date_String_String_String_String_String_String_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Add Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING___ADD_ROOM__STRING_STRING = eINSTANCE.getBookingComponent_IBooking__AddRoom__String_String();

		/**
		 * The meta object literal for the '<em><b>Request Quote</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING___REQUEST_QUOTE__STRING_INT_DATE_DATE = eINSTANCE.getBookingComponent_IBooking__RequestQuote__String_int_Date_Date();

		/**
		 * The meta object literal for the '<em><b>Edit Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING___EDIT_BOOKING__STRING_STRING_DATE_DATE_STRING = eINSTANCE.getBookingComponent_IBooking__EditBooking__String_String_Date_Date_String();

		/**
		 * The meta object literal for the '<em><b>Cancel Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING___CANCEL_BOOKING__STRING = eINSTANCE.getBookingComponent_IBooking__CancelBooking__String();

		/**
		 * The meta object literal for the '<em><b>Add Additional Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING___ADD_ADDITIONAL_SERVICE__STRING_STRING = eINSTANCE.getBookingComponent_IBooking__AddAdditionalService__String_String();

		/**
		 * The meta object literal for the '<em><b>Remove Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING___REMOVE_ROOM__STRING_STRING = eINSTANCE.getBookingComponent_IBooking__RemoveRoom__String_String();

		/**
		 * The meta object literal for the '<em><b>Remove Addional Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING___REMOVE_ADDIONAL_SERVICE__STRING_STRING = eINSTANCE.getBookingComponent_IBooking__RemoveAddionalService__String_String();

		/**
		 * The meta object literal for the '<em><b>Get Booking Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING___GET_BOOKING_INFO__STRING = eINSTANCE.getBookingComponent_IBooking__GetBookingInfo__String();

		/**
		 * The meta object literal for the '<em><b>Generate Receipt</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING___GENERATE_RECEIPT__STRING = eINSTANCE.getBookingComponent_IBooking__GenerateReceipt__String();

		/**
		 * The meta object literal for the '<em><b>Validate Reference Number</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING___VALIDATE_REFERENCE_NUMBER__STRING = eINSTANCE.getBookingComponent_IBooking__ValidateReferenceNumber__String();

		/**
		 * The meta object literal for the '<em><b>Generate Quote</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING___GENERATE_QUOTE__DATE_DATE_STRING = eINSTANCE.getBookingComponent_IBooking__GenerateQuote__Date_Date_String();

		/**
		 * The meta object literal for the '<em><b>Search For Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING___SEARCH_FOR_BOOKING__STRING = eINSTANCE.getBookingComponent_IBooking__SearchForBooking__String();

		/**
		 * The meta object literal for the '{@link Booking.impl.BookingComponent_GuestImpl <em>Component Guest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Booking.impl.BookingComponent_GuestImpl
		 * @see Booking.impl.BookingPackageImpl#getBookingComponent_Guest()
		 * @generated
		 */
		EClass BOOKING_COMPONENT_GUEST = eINSTANCE.getBookingComponent_Guest();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_GUEST__FIRST_NAME = eINSTANCE.getBookingComponent_Guest_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_GUEST__LAST_NAME = eINSTANCE.getBookingComponent_Guest_LastName();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_GUEST__ADDRESS = eINSTANCE.getBookingComponent_Guest_Address();

	}

} //BookingPackage
