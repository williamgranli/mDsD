/**
 */
package Implementation;

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
 * @see Implementation.ImplementationFactory
 * @model kind="package"
 * @generated
 */
public interface ImplementationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Implementation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///Implementation.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Implementation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImplementationPackage eINSTANCE = Implementation.impl.ImplementationPackageImpl.init();

	/**
	 * The meta object id for the '{@link Implementation.impl.DecisionSupportComponentImpl <em>Decision Support Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.impl.DecisionSupportComponentImpl
	 * @see Implementation.impl.ImplementationPackageImpl#getDecisionSupportComponent()
	 * @generated
	 */
	int DECISION_SUPPORT_COMPONENT = 0;

	/**
	 * The meta object id for the '{@link Implementation.DecisionSupportComponent_IDecisionSupport <em>Decision Support Component IDecision Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.DecisionSupportComponent_IDecisionSupport
	 * @see Implementation.impl.ImplementationPackageImpl#getDecisionSupportComponent_IDecisionSupport()
	 * @generated
	 */
	int DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT = 1;

	/**
	 * The number of structural features of the '<em>Decision Support Component IDecision Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get DSS Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT___GET_DSS_DATA = 0;

	/**
	 * The operation id for the '<em>Get All Room Type Frequency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT___GET_ALL_ROOM_TYPE_FREQUENCY = 1;

	/**
	 * The operation id for the '<em>Get Room Type Frequency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT___GET_ROOM_TYPE_FREQUENCY__STRING = 2;

	/**
	 * The operation id for the '<em>Count Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT___COUNT_ROOM_TYPE__ELIST_STRING = 3;

	/**
	 * The operation id for the '<em>Get All Customer Booking Frequency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT___GET_ALL_CUSTOMER_BOOKING_FREQUENCY = 4;

	/**
	 * The operation id for the '<em>Get Customer Booking Frequency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT___GET_CUSTOMER_BOOKING_FREQUENCY__STRING = 5;

	/**
	 * The operation id for the '<em>Get DSS Occupancy Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT___GET_DSS_OCCUPANCY_INFO = 6;

	/**
	 * The operation id for the '<em>Get Number Of Occupancies Of Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT___GET_NUMBER_OF_OCCUPANCIES_OF_ROOM__INT = 7;

	/**
	 * The number of operations of the '<em>Decision Support Component IDecision Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT_OPERATION_COUNT = 8;

	/**
	 * The number of structural features of the '<em>Decision Support Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_FEATURE_COUNT = DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get DSS Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT___GET_DSS_DATA = DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT___GET_DSS_DATA;

	/**
	 * The operation id for the '<em>Get All Room Type Frequency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT___GET_ALL_ROOM_TYPE_FREQUENCY = DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT___GET_ALL_ROOM_TYPE_FREQUENCY;

	/**
	 * The operation id for the '<em>Get Room Type Frequency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT___GET_ROOM_TYPE_FREQUENCY__STRING = DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT___GET_ROOM_TYPE_FREQUENCY__STRING;

	/**
	 * The operation id for the '<em>Count Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT___COUNT_ROOM_TYPE__ELIST_STRING = DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT___COUNT_ROOM_TYPE__ELIST_STRING;

	/**
	 * The operation id for the '<em>Get All Customer Booking Frequency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT___GET_ALL_CUSTOMER_BOOKING_FREQUENCY = DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT___GET_ALL_CUSTOMER_BOOKING_FREQUENCY;

	/**
	 * The operation id for the '<em>Get Customer Booking Frequency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT___GET_CUSTOMER_BOOKING_FREQUENCY__STRING = DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT___GET_CUSTOMER_BOOKING_FREQUENCY__STRING;

	/**
	 * The operation id for the '<em>Get DSS Occupancy Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT___GET_DSS_OCCUPANCY_INFO = DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT___GET_DSS_OCCUPANCY_INFO;

	/**
	 * The operation id for the '<em>Get Number Of Occupancies Of Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT___GET_NUMBER_OF_OCCUPANCIES_OF_ROOM__INT = DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT___GET_NUMBER_OF_OCCUPANCIES_OF_ROOM__INT;

	/**
	 * The number of operations of the '<em>Decision Support Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_OPERATION_COUNT = DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Implementation.impl.DecisionSupportComponent_BookingDSSInfoImpl <em>Decision Support Component Booking DSS Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.impl.DecisionSupportComponent_BookingDSSInfoImpl
	 * @see Implementation.impl.ImplementationPackageImpl#getDecisionSupportComponent_BookingDSSInfo()
	 * @generated
	 */
	int DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO = 2;

	/**
	 * The feature id for the '<em><b>Number Of Guests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__NUMBER_OF_GUESTS = 0;

	/**
	 * The feature id for the '<em><b>Room Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__ROOM_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Arrival Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__ARRIVAL_DATE = 2;

	/**
	 * The feature id for the '<em><b>Departure Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__DEPARTURE_DATE = 3;

	/**
	 * The feature id for the '<em><b>Customer SSN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__CUSTOMER_SSN = 4;

	/**
	 * The feature id for the '<em><b>Additional Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__ADDITIONAL_SERVICES = 5;

	/**
	 * The feature id for the '<em><b>Customer First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__CUSTOMER_FIRST_NAME = 6;

	/**
	 * The feature id for the '<em><b>Customer Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__CUSTOMER_LAST_NAME = 7;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__ADDRESS = 8;

	/**
	 * The number of structural features of the '<em>Decision Support Component Booking DSS Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO_FEATURE_COUNT = 9;

	/**
	 * The operation id for the '<em>Add Additional Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO___ADD_ADDITIONAL_SERVICE__STRING_LONG = 0;

	/**
	 * The number of operations of the '<em>Decision Support Component Booking DSS Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Implementation.impl.DecisionSupportComponent_DSSControllerImpl <em>Decision Support Component DSS Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.impl.DecisionSupportComponent_DSSControllerImpl
	 * @see Implementation.impl.ImplementationPackageImpl#getDecisionSupportComponent_DSSController()
	 * @generated
	 */
	int DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER = 4;

	/**
	 * The meta object id for the '{@link Implementation.OccupancyComponent_IOccupancyDecision <em>Occupancy Component IOccupancy Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.OccupancyComponent_IOccupancyDecision
	 * @see Implementation.impl.ImplementationPackageImpl#getOccupancyComponent_IOccupancyDecision()
	 * @generated
	 */
	int OCCUPANCY_COMPONENT_IOCCUPANCY_DECISION = 5;

	/**
	 * The meta object id for the '{@link Implementation.BookingComponent_IBookingDecision <em>Booking Component IBooking Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.BookingComponent_IBookingDecision
	 * @see Implementation.impl.ImplementationPackageImpl#getBookingComponent_IBookingDecision()
	 * @generated
	 */
	int BOOKING_COMPONENT_IBOOKING_DECISION = 6;

	/**
	 * The meta object id for the '{@link Implementation.impl.DecisionSupportComponent_OccupancyDSSInfoImpl <em>Decision Support Component Occupancy DSS Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.impl.DecisionSupportComponent_OccupancyDSSInfoImpl
	 * @see Implementation.impl.ImplementationPackageImpl#getDecisionSupportComponent_OccupancyDSSInfo()
	 * @generated
	 */
	int DECISION_SUPPORT_COMPONENT_OCCUPANCY_DSS_INFO = 7;

	/**
	 * The meta object id for the '{@link Implementation.impl.DecisionSupportComponent_AdditionalServiceDSSInfoImpl <em>Decision Support Component Additional Service DSS Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.impl.DecisionSupportComponent_AdditionalServiceDSSInfoImpl
	 * @see Implementation.impl.ImplementationPackageImpl#getDecisionSupportComponent_AdditionalServiceDSSInfo()
	 * @generated
	 */
	int DECISION_SUPPORT_COMPONENT_ADDITIONAL_SERVICE_DSS_INFO = 3;

	/**
	 * The feature id for the '<em><b>Additional Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_ADDITIONAL_SERVICE_DSS_INFO__ADDITIONAL_SERVICE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Additional Service Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_ADDITIONAL_SERVICE_DSS_INFO__ADDITIONAL_SERVICE_PRICE = 1;

	/**
	 * The number of structural features of the '<em>Decision Support Component Additional Service DSS Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_ADDITIONAL_SERVICE_DSS_INFO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Decision Support Component Additional Service DSS Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_ADDITIONAL_SERVICE_DSS_INFO_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>IOccupancy Decision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__IOCCUPANCY_DECISION = DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>IBooking Decision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__IBOOKING_DECISION = DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occupancy DSS Info</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__OCCUPANCY_DSS_INFO = DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Additional Service DSS Info</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__ADDITIONAL_SERVICE_DSS_INFO = DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Booking DSS Info</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__BOOKING_DSS_INFO = DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Decision Support Component DSS Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER_FEATURE_COUNT = DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get DSS Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER___GET_DSS_DATA = DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT___GET_DSS_DATA;

	/**
	 * The operation id for the '<em>Get All Room Type Frequency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER___GET_ALL_ROOM_TYPE_FREQUENCY = DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT___GET_ALL_ROOM_TYPE_FREQUENCY;

	/**
	 * The operation id for the '<em>Get Room Type Frequency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER___GET_ROOM_TYPE_FREQUENCY__STRING = DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT___GET_ROOM_TYPE_FREQUENCY__STRING;

	/**
	 * The operation id for the '<em>Count Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER___COUNT_ROOM_TYPE__ELIST_STRING = DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT___COUNT_ROOM_TYPE__ELIST_STRING;

	/**
	 * The operation id for the '<em>Get All Customer Booking Frequency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER___GET_ALL_CUSTOMER_BOOKING_FREQUENCY = DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT___GET_ALL_CUSTOMER_BOOKING_FREQUENCY;

	/**
	 * The operation id for the '<em>Get Customer Booking Frequency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER___GET_CUSTOMER_BOOKING_FREQUENCY__STRING = DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT___GET_CUSTOMER_BOOKING_FREQUENCY__STRING;

	/**
	 * The operation id for the '<em>Get DSS Occupancy Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER___GET_DSS_OCCUPANCY_INFO = DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT___GET_DSS_OCCUPANCY_INFO;

	/**
	 * The operation id for the '<em>Get Number Of Occupancies Of Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER___GET_NUMBER_OF_OCCUPANCIES_OF_ROOM__INT = DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT___GET_NUMBER_OF_OCCUPANCIES_OF_ROOM__INT;

	/**
	 * The operation id for the '<em>Count Customer Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER___COUNT_CUSTOMER_BOOKING__ELIST_STRING = DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Position In List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER___GET_POSITION_IN_LIST__ELIST_STRING = DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Decision Support Component DSS Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER_OPERATION_COUNT = DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT_OPERATION_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Occupancy Component IOccupancy Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_IOCCUPANCY_DECISION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get DSS Occupancy Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_IOCCUPANCY_DECISION___GET_DSS_OCCUPANCY_INFO = 0;

	/**
	 * The number of operations of the '<em>Occupancy Component IOccupancy Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_IOCCUPANCY_DECISION_OPERATION_COUNT = 1;

	/**
	 * The number of structural features of the '<em>Booking Component IBooking Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING_DECISION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get DSS Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING_DECISION___GET_DSS_INFO = 0;

	/**
	 * The number of operations of the '<em>Booking Component IBooking Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING_DECISION_OPERATION_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Room Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_OCCUPANCY_DSS_INFO__ROOM_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Check In Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_OCCUPANCY_DSS_INFO__CHECK_IN_DATE_TIME = 1;

	/**
	 * The feature id for the '<em><b>Check Out Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_OCCUPANCY_DSS_INFO__CHECK_OUT_DATE_TIME = 2;

	/**
	 * The feature id for the '<em><b>Number Of Guests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_OCCUPANCY_DSS_INFO__NUMBER_OF_GUESTS = 3;

	/**
	 * The number of structural features of the '<em>Decision Support Component Occupancy DSS Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_OCCUPANCY_DSS_INFO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Decision Support Component Occupancy DSS Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_OCCUPANCY_DSS_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Implementation.impl.OccupancyComponentImpl <em>Occupancy Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.impl.OccupancyComponentImpl
	 * @see Implementation.impl.ImplementationPackageImpl#getOccupancyComponent()
	 * @generated
	 */
	int OCCUPANCY_COMPONENT = 8;

	/**
	 * The number of structural features of the '<em>Occupancy Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Occupancy Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Implementation.impl.OccupancyComponent_OccupancyImpl <em>Occupancy Component Occupancy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.impl.OccupancyComponent_OccupancyImpl
	 * @see Implementation.impl.ImplementationPackageImpl#getOccupancyComponent_Occupancy()
	 * @generated
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY = 9;

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
	 * The feature id for the '<em><b>Booking Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY__BOOKING_REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Guests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY__GUESTS = 4;

	/**
	 * The number of structural features of the '<em>Occupancy Component Occupancy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Get Partner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY___GET_PARTNER__STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Add Guest To Occupancy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY___ADD_GUEST_TO_OCCUPANCY__STRING_STRING = 1;

	/**
	 * The operation id for the '<em>List Guests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY___LIST_GUESTS = 2;

	/**
	 * The number of operations of the '<em>Occupancy Component Occupancy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link Implementation.impl.OccupancyComponent_GuestImpl <em>Occupancy Component Guest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.impl.OccupancyComponent_GuestImpl
	 * @see Implementation.impl.ImplementationPackageImpl#getOccupancyComponent_Guest()
	 * @generated
	 */
	int OCCUPANCY_COMPONENT_GUEST = 10;

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
	 * The number of structural features of the '<em>Occupancy Component Guest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_GUEST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Occupancy Component Guest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_GUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Implementation.OccupancyComponent_IOccupancy <em>Occupancy Component IOccupancy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.OccupancyComponent_IOccupancy
	 * @see Implementation.impl.ImplementationPackageImpl#getOccupancyComponent_IOccupancy()
	 * @generated
	 */
	int OCCUPANCY_COMPONENT_IOCCUPANCY = 11;

	/**
	 * The number of structural features of the '<em>Occupancy Component IOccupancy</em>' class.
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
	int OCCUPANCY_COMPONENT_IOCCUPANCY___CHECK_IN_GUEST__STRING_STRING_STRING_STRING_STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Check Out Guest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_IOCCUPANCY___CHECK_OUT_GUEST__INT_STRING_STRING = 1;

	/**
	 * The operation id for the '<em>List Guests In Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_IOCCUPANCY___LIST_GUESTS_IN_ROOM__INT = 2;

	/**
	 * The operation id for the '<em>Number Of Guests In Hotel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_IOCCUPANCY___NUMBER_OF_GUESTS_IN_HOTEL = 3;

	/**
	 * The operation id for the '<em>Is Occupied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_IOCCUPANCY___IS_OCCUPIED__INT = 4;

	/**
	 * The operation id for the '<em>Get Available Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_IOCCUPANCY___GET_AVAILABLE_ROOMS__STRING = 5;

	/**
	 * The number of operations of the '<em>Occupancy Component IOccupancy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_IOCCUPANCY_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link Implementation.impl.OccupancyComponent_OccupancyHandlerImpl <em>Occupancy Component Occupancy Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.impl.OccupancyComponent_OccupancyHandlerImpl
	 * @see Implementation.impl.ImplementationPackageImpl#getOccupancyComponent_OccupancyHandler()
	 * @generated
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER = 12;

	/**
	 * The feature id for the '<em><b>IRoom Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER__IROOM_INFORMATION = OCCUPANCY_COMPONENT_IOCCUPANCY_DECISION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>IBooking</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER__IBOOKING = OCCUPANCY_COMPONENT_IOCCUPANCY_DECISION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occupancy</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER__OCCUPANCY = OCCUPANCY_COMPONENT_IOCCUPANCY_DECISION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Occupancy Component Occupancy Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER_FEATURE_COUNT = OCCUPANCY_COMPONENT_IOCCUPANCY_DECISION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get DSS Occupancy Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___GET_DSS_OCCUPANCY_INFO = OCCUPANCY_COMPONENT_IOCCUPANCY_DECISION___GET_DSS_OCCUPANCY_INFO;

	/**
	 * The operation id for the '<em>Check In Guest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___CHECK_IN_GUEST__STRING_STRING_STRING_STRING_STRING_STRING = OCCUPANCY_COMPONENT_IOCCUPANCY_DECISION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Check Out Guest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___CHECK_OUT_GUEST__INT_STRING_STRING = OCCUPANCY_COMPONENT_IOCCUPANCY_DECISION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>List Guests In Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___LIST_GUESTS_IN_ROOM__INT = OCCUPANCY_COMPONENT_IOCCUPANCY_DECISION_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Number Of Guests In Hotel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___NUMBER_OF_GUESTS_IN_HOTEL = OCCUPANCY_COMPONENT_IOCCUPANCY_DECISION_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Occupied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___IS_OCCUPIED__INT = OCCUPANCY_COMPONENT_IOCCUPANCY_DECISION_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Available Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___GET_AVAILABLE_ROOMS__STRING = OCCUPANCY_COMPONENT_IOCCUPANCY_DECISION_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Find Occupancy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___FIND_OCCUPANCY__STRING_STRING_STRING = OCCUPANCY_COMPONENT_IOCCUPANCY_DECISION_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is In Room Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___IS_IN_ROOM_TYPES__ELIST_STRING = OCCUPANCY_COMPONENT_IOCCUPANCY_DECISION_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Occupancy Component Occupancy Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER_OPERATION_COUNT = OCCUPANCY_COMPONENT_IOCCUPANCY_DECISION_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link Implementation.RoomComponent_IRoomInformation <em>Room Component IRoom Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.RoomComponent_IRoomInformation
	 * @see Implementation.impl.ImplementationPackageImpl#getRoomComponent_IRoomInformation()
	 * @generated
	 */
	int ROOM_COMPONENT_IROOM_INFORMATION = 13;

	/**
	 * The number of structural features of the '<em>Room Component IRoom Information</em>' class.
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
	 * The operation id for the '<em>Get Count Of Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_IROOM_INFORMATION___GET_COUNT_OF_ROOM_TYPE__STRING = 5;

	/**
	 * The number of operations of the '<em>Room Component IRoom Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_IROOM_INFORMATION_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link Implementation.BookingComponent_IBookingInformation <em>Booking Component IBooking Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.BookingComponent_IBookingInformation
	 * @see Implementation.impl.ImplementationPackageImpl#getBookingComponent_IBookingInformation()
	 * @generated
	 */
	int BOOKING_COMPONENT_IBOOKING_INFORMATION = 14;

	/**
	 * The number of structural features of the '<em>Booking Component IBooking Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING_INFORMATION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Guests In Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING_INFORMATION___GET_GUESTS_IN_BOOKING__STRING = 0;

	/**
	 * The operation id for the '<em>Get Room Types In Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING_INFORMATION___GET_ROOM_TYPES_IN_BOOKING__STRING = 1;

	/**
	 * The operation id for the '<em>Search For Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING_INFORMATION___SEARCH_FOR_BOOKING__STRING = 2;

	/**
	 * The operation id for the '<em>Is Paid For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING_INFORMATION___IS_PAID_FOR__STRING = 3;

	/**
	 * The operation id for the '<em>Make Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING_INFORMATION___MAKE_PAYMENT__STRING = 4;

	/**
	 * The number of operations of the '<em>Booking Component IBooking Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING_INFORMATION_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link Implementation.impl.PaymentComponentImpl <em>Payment Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.impl.PaymentComponentImpl
	 * @see Implementation.impl.ImplementationPackageImpl#getPaymentComponent()
	 * @generated
	 */
	int PAYMENT_COMPONENT = 15;

	/**
	 * The meta object id for the '{@link Implementation.PaymentComponent_IPayment <em>Payment Component IPayment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.PaymentComponent_IPayment
	 * @see Implementation.impl.ImplementationPackageImpl#getPaymentComponent_IPayment()
	 * @generated
	 */
	int PAYMENT_COMPONENT_IPAYMENT = 16;

	/**
	 * The number of structural features of the '<em>Payment Component IPayment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_IPAYMENT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Make Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_IPAYMENT___MAKE_PAYMENT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE = 0;

	/**
	 * The operation id for the '<em>Validate CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_IPAYMENT___VALIDATE_CC__STRING_STRING_INT_INT_STRING_STRING = 1;

	/**
	 * The operation id for the '<em>Add CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_IPAYMENT___ADD_CC__STRING_STRING_INT_INT_STRING_STRING = 2;

	/**
	 * The operation id for the '<em>Check Balance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_IPAYMENT___CHECK_BALANCE__STRING_STRING_INT_INT_STRING_STRING = 3;

	/**
	 * The operation id for the '<em>Make Deposit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_IPAYMENT___MAKE_DEPOSIT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE = 4;

	/**
	 * The operation id for the '<em>Remove CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_IPAYMENT___REMOVE_CC__STRING_STRING_INT_INT_STRING_STRING = 5;

	/**
	 * The number of operations of the '<em>Payment Component IPayment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_IPAYMENT_OPERATION_COUNT = 6;

	/**
	 * The number of structural features of the '<em>Payment Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_FEATURE_COUNT = PAYMENT_COMPONENT_IPAYMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Make Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT___MAKE_PAYMENT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE = PAYMENT_COMPONENT_IPAYMENT___MAKE_PAYMENT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE;

	/**
	 * The operation id for the '<em>Validate CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT___VALIDATE_CC__STRING_STRING_INT_INT_STRING_STRING = PAYMENT_COMPONENT_IPAYMENT___VALIDATE_CC__STRING_STRING_INT_INT_STRING_STRING;

	/**
	 * The operation id for the '<em>Add CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT___ADD_CC__STRING_STRING_INT_INT_STRING_STRING = PAYMENT_COMPONENT_IPAYMENT___ADD_CC__STRING_STRING_INT_INT_STRING_STRING;

	/**
	 * The operation id for the '<em>Check Balance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT___CHECK_BALANCE__STRING_STRING_INT_INT_STRING_STRING = PAYMENT_COMPONENT_IPAYMENT___CHECK_BALANCE__STRING_STRING_INT_INT_STRING_STRING;

	/**
	 * The operation id for the '<em>Make Deposit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT___MAKE_DEPOSIT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE = PAYMENT_COMPONENT_IPAYMENT___MAKE_DEPOSIT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE;

	/**
	 * The operation id for the '<em>Remove CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT___REMOVE_CC__STRING_STRING_INT_INT_STRING_STRING = PAYMENT_COMPONENT_IPAYMENT___REMOVE_CC__STRING_STRING_INT_INT_STRING_STRING;

	/**
	 * The number of operations of the '<em>Payment Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_OPERATION_COUNT = PAYMENT_COMPONENT_IPAYMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Implementation.impl.PaymentComponent_PaymentHandlerImpl <em>Payment Component Payment Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.impl.PaymentComponent_PaymentHandlerImpl
	 * @see Implementation.impl.ImplementationPackageImpl#getPaymentComponent_PaymentHandler()
	 * @generated
	 */
	int PAYMENT_COMPONENT_PAYMENT_HANDLER = 17;

	/**
	 * The feature id for the '<em><b>Payment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_HANDLER__PAYMENT = PAYMENT_COMPONENT_IPAYMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Customer Provides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_HANDLER__CUSTOMER_PROVIDES = PAYMENT_COMPONENT_IPAYMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Administrator Provides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_HANDLER__ADMINISTRATOR_PROVIDES = PAYMENT_COMPONENT_IPAYMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Payment Component Payment Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_HANDLER_FEATURE_COUNT = PAYMENT_COMPONENT_IPAYMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Make Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_HANDLER___MAKE_PAYMENT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE = PAYMENT_COMPONENT_IPAYMENT___MAKE_PAYMENT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE;

	/**
	 * The operation id for the '<em>Validate CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_HANDLER___VALIDATE_CC__STRING_STRING_INT_INT_STRING_STRING = PAYMENT_COMPONENT_IPAYMENT___VALIDATE_CC__STRING_STRING_INT_INT_STRING_STRING;

	/**
	 * The operation id for the '<em>Add CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_HANDLER___ADD_CC__STRING_STRING_INT_INT_STRING_STRING = PAYMENT_COMPONENT_IPAYMENT___ADD_CC__STRING_STRING_INT_INT_STRING_STRING;

	/**
	 * The operation id for the '<em>Check Balance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_HANDLER___CHECK_BALANCE__STRING_STRING_INT_INT_STRING_STRING = PAYMENT_COMPONENT_IPAYMENT___CHECK_BALANCE__STRING_STRING_INT_INT_STRING_STRING;

	/**
	 * The operation id for the '<em>Make Deposit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_HANDLER___MAKE_DEPOSIT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE = PAYMENT_COMPONENT_IPAYMENT___MAKE_DEPOSIT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE;

	/**
	 * The operation id for the '<em>Remove CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_HANDLER___REMOVE_CC__STRING_STRING_INT_INT_STRING_STRING = PAYMENT_COMPONENT_IPAYMENT___REMOVE_CC__STRING_STRING_INT_INT_STRING_STRING;

	/**
	 * The number of operations of the '<em>Payment Component Payment Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_HANDLER_OPERATION_COUNT = PAYMENT_COMPONENT_IPAYMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Implementation.impl.PaymentComponent_PaymentImpl <em>Payment Component Payment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.impl.PaymentComponent_PaymentImpl
	 * @see Implementation.impl.ImplementationPackageImpl#getPaymentComponent_Payment()
	 * @generated
	 */
	int PAYMENT_COMPONENT_PAYMENT = 18;

	/**
	 * The feature id for the '<em><b>Cc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT__CC_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Ccv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT__CCV = 1;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT__FIRST_NAME = 2;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT__LAST_NAME = 3;

	/**
	 * The feature id for the '<em><b>Expiry Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT__EXPIRY_MONTH = 4;

	/**
	 * The feature id for the '<em><b>Expiry Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT__EXPIRY_YEAR = 5;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT__AMOUNT = 6;

	/**
	 * The number of structural features of the '<em>Payment Component Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Payment Component Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Implementation.Bank_CustomerProvides <em>Bank Customer Provides</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.Bank_CustomerProvides
	 * @see Implementation.impl.ImplementationPackageImpl#getBank_CustomerProvides()
	 * @generated
	 */
	int BANK_CUSTOMER_PROVIDES = 19;

	/**
	 * The number of structural features of the '<em>Bank Customer Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_CUSTOMER_PROVIDES_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Make Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_CUSTOMER_PROVIDES___MAKE_PAYMENT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE = 0;

	/**
	 * The operation id for the '<em>Is Credit Card Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_CUSTOMER_PROVIDES___IS_CREDIT_CARD_VALID__STRING_STRING_INT_INT_STRING_STRING = 1;

	/**
	 * The number of operations of the '<em>Bank Customer Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_CUSTOMER_PROVIDES_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link Implementation.Bank_AdministratorProvides <em>Bank Administrator Provides</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.Bank_AdministratorProvides
	 * @see Implementation.impl.ImplementationPackageImpl#getBank_AdministratorProvides()
	 * @generated
	 */
	int BANK_ADMINISTRATOR_PROVIDES = 20;

	/**
	 * The number of structural features of the '<em>Bank Administrator Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_ADMINISTRATOR_PROVIDES_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Make Deposit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_ADMINISTRATOR_PROVIDES___MAKE_DEPOSIT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE = 0;

	/**
	 * The operation id for the '<em>Add Credit Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_ADMINISTRATOR_PROVIDES___ADD_CREDIT_CARD__STRING_STRING_INT_INT_STRING_STRING = 1;

	/**
	 * The operation id for the '<em>Remove Credit Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_ADMINISTRATOR_PROVIDES___REMOVE_CREDIT_CARD__STRING_STRING_INT_INT_STRING_STRING = 2;

	/**
	 * The operation id for the '<em>Get Balance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_ADMINISTRATOR_PROVIDES___GET_BALANCE__STRING_STRING_INT_INT_STRING_STRING = 3;

	/**
	 * The number of operations of the '<em>Bank Administrator Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_ADMINISTRATOR_PROVIDES_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link Implementation.impl.AdditionalServiceComponentImpl <em>Additional Service Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.impl.AdditionalServiceComponentImpl
	 * @see Implementation.impl.ImplementationPackageImpl#getAdditionalServiceComponent()
	 * @generated
	 */
	int ADDITIONAL_SERVICE_COMPONENT = 21;

	/**
	 * The meta object id for the '{@link Implementation.impl.AdditionalServiceComponent_AdditionalServiceImpl <em>Additional Service Component Additional Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.impl.AdditionalServiceComponent_AdditionalServiceImpl
	 * @see Implementation.impl.ImplementationPackageImpl#getAdditionalServiceComponent_AdditionalService()
	 * @generated
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE = 24;

	/**
	 * The meta object id for the '{@link Implementation.StaffComponent_IAuthentication <em>Staff Component IAuthentication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.StaffComponent_IAuthentication
	 * @see Implementation.impl.ImplementationPackageImpl#getStaffComponent_IAuthentication()
	 * @generated
	 */
	int STAFF_COMPONENT_IAUTHENTICATION = 27;

	/**
	 * The meta object id for the '{@link Implementation.AdditionalServiceComponent_IAdditionalServiceAdministration <em>Additional Service Component IAdditional Service Administration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.AdditionalServiceComponent_IAdditionalServiceAdministration
	 * @see Implementation.impl.ImplementationPackageImpl#getAdditionalServiceComponent_IAdditionalServiceAdministration()
	 * @generated
	 */
	int ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION = 22;

	/**
	 * The meta object id for the '{@link Implementation.impl.AdditionalServiceComponent_AdditionalServiceEventImpl <em>Additional Service Component Additional Service Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.impl.AdditionalServiceComponent_AdditionalServiceEventImpl
	 * @see Implementation.impl.ImplementationPackageImpl#getAdditionalServiceComponent_AdditionalServiceEvent()
	 * @generated
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT = 25;

	/**
	 * The meta object id for the '{@link Implementation.impl.AdditionalServiceComponent_AdditionalServiceHandlerImpl <em>Additional Service Component Additional Service Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.impl.AdditionalServiceComponent_AdditionalServiceHandlerImpl
	 * @see Implementation.impl.ImplementationPackageImpl#getAdditionalServiceComponent_AdditionalServiceHandler()
	 * @generated
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER = 26;

	/**
	 * The meta object id for the '{@link Implementation.impl.BookingComponentImpl <em>Booking Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.impl.BookingComponentImpl
	 * @see Implementation.impl.ImplementationPackageImpl#getBookingComponent()
	 * @generated
	 */
	int BOOKING_COMPONENT = 28;

	/**
	 * The meta object id for the '{@link Implementation.impl.BookingComponent_PaymentDetailsImpl <em>Booking Component Payment Details</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.impl.BookingComponent_PaymentDetailsImpl
	 * @see Implementation.impl.ImplementationPackageImpl#getBookingComponent_PaymentDetails()
	 * @generated
	 */
	int BOOKING_COMPONENT_PAYMENT_DETAILS = 29;

	/**
	 * The meta object id for the '{@link Implementation.impl.BookingComponent_BookingImpl <em>Booking Component Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.impl.BookingComponent_BookingImpl
	 * @see Implementation.impl.ImplementationPackageImpl#getBookingComponent_Booking()
	 * @generated
	 */
	int BOOKING_COMPONENT_BOOKING = 30;

	/**
	 * The meta object id for the '{@link Implementation.impl.BookingComponent_AdditionalServiceImpl <em>Booking Component Additional Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.impl.BookingComponent_AdditionalServiceImpl
	 * @see Implementation.impl.ImplementationPackageImpl#getBookingComponent_AdditionalService()
	 * @generated
	 */
	int BOOKING_COMPONENT_ADDITIONAL_SERVICE = 31;

	/**
	 * The meta object id for the '{@link Implementation.impl.BookingComponent_BookingGuestImpl <em>Booking Component Booking Guest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.impl.BookingComponent_BookingGuestImpl
	 * @see Implementation.impl.ImplementationPackageImpl#getBookingComponent_BookingGuest()
	 * @generated
	 */
	int BOOKING_COMPONENT_BOOKING_GUEST = 32;

	/**
	 * The meta object id for the '{@link Implementation.impl.BookingComponent_RoomTypeImpl <em>Booking Component Room Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.impl.BookingComponent_RoomTypeImpl
	 * @see Implementation.impl.ImplementationPackageImpl#getBookingComponent_RoomType()
	 * @generated
	 */
	int BOOKING_COMPONENT_ROOM_TYPE = 33;

	/**
	 * The meta object id for the '{@link Implementation.impl.StaffComponentImpl <em>Staff Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.impl.StaffComponentImpl
	 * @see Implementation.impl.ImplementationPackageImpl#getStaffComponent()
	 * @generated
	 */
	int STAFF_COMPONENT = 36;

	/**
	 * The meta object id for the '{@link Implementation.impl.StaffComponent_AccountManagerImpl <em>Staff Component Account Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.impl.StaffComponent_AccountManagerImpl
	 * @see Implementation.impl.ImplementationPackageImpl#getStaffComponent_AccountManager()
	 * @generated
	 */
	int STAFF_COMPONENT_ACCOUNT_MANAGER = 38;

	/**
	 * The meta object id for the '{@link Implementation.StaffComponent_IAccountAdministration <em>Staff Component IAccount Administration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.StaffComponent_IAccountAdministration
	 * @see Implementation.impl.ImplementationPackageImpl#getStaffComponent_IAccountAdministration()
	 * @generated
	 */
	int STAFF_COMPONENT_IACCOUNT_ADMINISTRATION = 37;

	/**
	 * The meta object id for the '{@link Implementation.impl.StaffComponent_EmployeeImpl <em>Staff Component Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.impl.StaffComponent_EmployeeImpl
	 * @see Implementation.impl.ImplementationPackageImpl#getStaffComponent_Employee()
	 * @generated
	 */
	int STAFF_COMPONENT_EMPLOYEE = 39;

	/**
	 * The meta object id for the '{@link Implementation.impl.RoomComponentImpl <em>Room Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.impl.RoomComponentImpl
	 * @see Implementation.impl.ImplementationPackageImpl#getRoomComponent()
	 * @generated
	 */
	int ROOM_COMPONENT = 40;

	/**
	 * The meta object id for the '{@link Implementation.impl.RoomComponent_RoomImpl <em>Room Component Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.impl.RoomComponent_RoomImpl
	 * @see Implementation.impl.ImplementationPackageImpl#getRoomComponent_Room()
	 * @generated
	 */
	int ROOM_COMPONENT_ROOM = 42;

	/**
	 * The meta object id for the '{@link Implementation.impl.RoomComponent_BedroomImpl <em>Room Component Bedroom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.impl.RoomComponent_BedroomImpl
	 * @see Implementation.impl.ImplementationPackageImpl#getRoomComponent_Bedroom()
	 * @generated
	 */
	int ROOM_COMPONENT_BEDROOM = 43;

	/**
	 * The meta object id for the '{@link Implementation.impl.RoomComponent_ConferenceRoomImpl <em>Room Component Conference Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.impl.RoomComponent_ConferenceRoomImpl
	 * @see Implementation.impl.ImplementationPackageImpl#getRoomComponent_ConferenceRoom()
	 * @generated
	 */
	int ROOM_COMPONENT_CONFERENCE_ROOM = 44;

	/**
	 * The meta object id for the '{@link Implementation.RoomComponent_IRoomAdministration <em>Room Component IRoom Administration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.RoomComponent_IRoomAdministration
	 * @see Implementation.impl.ImplementationPackageImpl#getRoomComponent_IRoomAdministration()
	 * @generated
	 */
	int ROOM_COMPONENT_IROOM_ADMINISTRATION = 41;

	/**
	 * The meta object id for the '{@link Implementation.impl.RoomComponent_RoomHandlerImpl <em>Room Component Room Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.impl.RoomComponent_RoomHandlerImpl
	 * @see Implementation.impl.ImplementationPackageImpl#getRoomComponent_RoomHandler()
	 * @generated
	 */
	int ROOM_COMPONENT_ROOM_HANDLER = 45;

	/**
	 * The number of structural features of the '<em>Additional Service Component IAdditional Service Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Additional Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___CREATE_ADDITIONAL_SERVICE__STRING_BOOLEAN_INT_STRING = 0;

	/**
	 * The operation id for the '<em>Edit Additional Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___EDIT_ADDITIONAL_SERVICE__STRING_STRING_BOOLEAN_INT_STRING = 1;

	/**
	 * The operation id for the '<em>Remove Additional Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___REMOVE_ADDITIONAL_SERVICE__STRING = 2;

	/**
	 * The operation id for the '<em>Create Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___CREATE_EVENT__STRING_DATE_STRING_INT_INT = 3;

	/**
	 * The operation id for the '<em>Edit Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___EDIT_EVENT__STRING_DATE_STRING_INT_INT = 4;

	/**
	 * The operation id for the '<em>Remove Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___REMOVE_EVENT__STRING_DATE_STRING = 5;

	/**
	 * The operation id for the '<em>Remove Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___REMOVE_EVENTS__STRING_DATE = 6;

	/**
	 * The number of operations of the '<em>Additional Service Component IAdditional Service Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION_OPERATION_COUNT = 7;

	/**
	 * The number of structural features of the '<em>Additional Service Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_FEATURE_COUNT = ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Additional Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT___CREATE_ADDITIONAL_SERVICE__STRING_BOOLEAN_INT_STRING = ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___CREATE_ADDITIONAL_SERVICE__STRING_BOOLEAN_INT_STRING;

	/**
	 * The operation id for the '<em>Edit Additional Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT___EDIT_ADDITIONAL_SERVICE__STRING_STRING_BOOLEAN_INT_STRING = ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___EDIT_ADDITIONAL_SERVICE__STRING_STRING_BOOLEAN_INT_STRING;

	/**
	 * The operation id for the '<em>Remove Additional Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT___REMOVE_ADDITIONAL_SERVICE__STRING = ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___REMOVE_ADDITIONAL_SERVICE__STRING;

	/**
	 * The operation id for the '<em>Create Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT___CREATE_EVENT__STRING_DATE_STRING_INT_INT = ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___CREATE_EVENT__STRING_DATE_STRING_INT_INT;

	/**
	 * The operation id for the '<em>Edit Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT___EDIT_EVENT__STRING_DATE_STRING_INT_INT = ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___EDIT_EVENT__STRING_DATE_STRING_INT_INT;

	/**
	 * The operation id for the '<em>Remove Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT___REMOVE_EVENT__STRING_DATE_STRING = ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___REMOVE_EVENT__STRING_DATE_STRING;

	/**
	 * The operation id for the '<em>Remove Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT___REMOVE_EVENTS__STRING_DATE = ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___REMOVE_EVENTS__STRING_DATE;

	/**
	 * The operation id for the '<em>Get Services</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT___GET_SERVICES = ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT___GET_EVENTS__STRING = ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Guest To Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT___ADD_GUEST_TO_EVENT__STRING_DATE_STRING_INT = ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Remove Guests From Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT___REMOVE_GUESTS_FROM_EVENT__STRING_DATE_STRING_INT = ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Additional Service Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_OPERATION_COUNT = ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link Implementation.AdditionalServiceComponent_IEventManagement <em>Additional Service Component IEvent Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.AdditionalServiceComponent_IEventManagement
	 * @see Implementation.impl.ImplementationPackageImpl#getAdditionalServiceComponent_IEventManagement()
	 * @generated
	 */
	int ADDITIONAL_SERVICE_COMPONENT_IEVENT_MANAGEMENT = 23;

	/**
	 * The number of structural features of the '<em>Additional Service Component IEvent Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_IEVENT_MANAGEMENT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Services</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_IEVENT_MANAGEMENT___GET_SERVICES = 0;

	/**
	 * The operation id for the '<em>Get Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_IEVENT_MANAGEMENT___GET_EVENTS__STRING = 1;

	/**
	 * The operation id for the '<em>Add Guest To Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_IEVENT_MANAGEMENT___ADD_GUEST_TO_EVENT__STRING_DATE_STRING_INT = 2;

	/**
	 * The operation id for the '<em>Remove Guests From Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_IEVENT_MANAGEMENT___REMOVE_GUESTS_FROM_EVENT__STRING_DATE_STRING_INT = 3;

	/**
	 * The number of operations of the '<em>Additional Service Component IEvent Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_IEVENT_MANAGEMENT_OPERATION_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Usable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__USABLE = 1;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__PRICE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Additional Service Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__ADDITIONAL_SERVICE_EVENT = 4;

	/**
	 * The feature id for the '<em><b>Temp Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__TEMP_EVENTS = 5;

	/**
	 * The number of structural features of the '<em>Additional Service Component Additional Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Find Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE___FIND_EVENT__DATE_STRING = 0;

	/**
	 * The operation id for the '<em>Find Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE___FIND_EVENTS__DATE = 1;

	/**
	 * The operation id for the '<em>Create Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE___CREATE_EVENT__DATE_STRING_INT_INT = 2;

	/**
	 * The operation id for the '<em>Edit Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE___EDIT_EVENT__DATE_STRING_INT_INT = 3;

	/**
	 * The operation id for the '<em>Remove Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE___REMOVE_EVENT__DATE_STRING = 4;

	/**
	 * The operation id for the '<em>Remove Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE___REMOVE_EVENTS__DATE = 5;

	/**
	 * The number of operations of the '<em>Additional Service Component Additional Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_OPERATION_COUNT = 6;

	/**
	 * The feature id for the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__DATE_TIME = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Max Attendant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__MAX_ATTENDANT = 2;

	/**
	 * The feature id for the '<em><b>Current Attendants</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__CURRENT_ATTENDANTS = 3;

	/**
	 * The number of structural features of the '<em>Additional Service Component Additional Service Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Additional Service Component Additional Service Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Additional Service</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER__ADDITIONAL_SERVICE = ADDITIONAL_SERVICE_COMPONENT_IEVENT_MANAGEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>IAuthentication</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER__IAUTHENTICATION = ADDITIONAL_SERVICE_COMPONENT_IEVENT_MANAGEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Additional Service Component Additional Service Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER_FEATURE_COUNT = ADDITIONAL_SERVICE_COMPONENT_IEVENT_MANAGEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Services</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___GET_SERVICES = ADDITIONAL_SERVICE_COMPONENT_IEVENT_MANAGEMENT___GET_SERVICES;

	/**
	 * The operation id for the '<em>Get Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___GET_EVENTS__STRING = ADDITIONAL_SERVICE_COMPONENT_IEVENT_MANAGEMENT___GET_EVENTS__STRING;

	/**
	 * The operation id for the '<em>Add Guest To Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___ADD_GUEST_TO_EVENT__STRING_DATE_STRING_INT = ADDITIONAL_SERVICE_COMPONENT_IEVENT_MANAGEMENT___ADD_GUEST_TO_EVENT__STRING_DATE_STRING_INT;

	/**
	 * The operation id for the '<em>Remove Guests From Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___REMOVE_GUESTS_FROM_EVENT__STRING_DATE_STRING_INT = ADDITIONAL_SERVICE_COMPONENT_IEVENT_MANAGEMENT___REMOVE_GUESTS_FROM_EVENT__STRING_DATE_STRING_INT;

	/**
	 * The operation id for the '<em>Create Additional Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___CREATE_ADDITIONAL_SERVICE__STRING_BOOLEAN_INT_STRING = ADDITIONAL_SERVICE_COMPONENT_IEVENT_MANAGEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Edit Additional Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___EDIT_ADDITIONAL_SERVICE__STRING_STRING_BOOLEAN_INT_STRING = ADDITIONAL_SERVICE_COMPONENT_IEVENT_MANAGEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Remove Additional Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___REMOVE_ADDITIONAL_SERVICE__STRING = ADDITIONAL_SERVICE_COMPONENT_IEVENT_MANAGEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Create Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___CREATE_EVENT__STRING_DATE_STRING_INT_INT = ADDITIONAL_SERVICE_COMPONENT_IEVENT_MANAGEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Edit Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___EDIT_EVENT__STRING_DATE_STRING_INT_INT = ADDITIONAL_SERVICE_COMPONENT_IEVENT_MANAGEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Remove Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___REMOVE_EVENT__STRING_DATE_STRING = ADDITIONAL_SERVICE_COMPONENT_IEVENT_MANAGEMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Remove Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___REMOVE_EVENTS__STRING_DATE = ADDITIONAL_SERVICE_COMPONENT_IEVENT_MANAGEMENT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Find Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___FIND_SERVICE__STRING = ADDITIONAL_SERVICE_COMPONENT_IEVENT_MANAGEMENT_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Additional Service Component Additional Service Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER_OPERATION_COUNT = ADDITIONAL_SERVICE_COMPONENT_IEVENT_MANAGEMENT_OPERATION_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Staff Component IAuthentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_IAUTHENTICATION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Log In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_IAUTHENTICATION___LOG_IN__STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Log Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_IAUTHENTICATION___LOG_OUT__STRING = 1;

	/**
	 * The operation id for the '<em>Is Logged In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_IAUTHENTICATION___IS_LOGGED_IN__STRING = 2;

	/**
	 * The number of operations of the '<em>Staff Component IAuthentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_IAUTHENTICATION_OPERATION_COUNT = 3;

	/**
	 * The number of structural features of the '<em>Booking Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Booking Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Ssn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_PAYMENT_DETAILS__SSN = 7;

	/**
	 * The number of structural features of the '<em>Booking Component Payment Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_PAYMENT_DETAILS_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Booking Component Payment Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_PAYMENT_DETAILS_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Booking Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING__BOOKING_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Current Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING__CURRENT_COST = 3;

	/**
	 * The feature id for the '<em><b>Additional Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING__ADDITIONAL_SERVICES = 4;

	/**
	 * The feature id for the '<em><b>Guests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING__GUESTS = 5;

	/**
	 * The feature id for the '<em><b>Payment Details</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING__PAYMENT_DETAILS = 6;

	/**
	 * The feature id for the '<em><b>Rooms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING__ROOMS = 7;

	/**
	 * The feature id for the '<em><b>Is Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING__IS_PAID = 8;

	/**
	 * The number of structural features of the '<em>Booking Component Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_FEATURE_COUNT = 9;

	/**
	 * The operation id for the '<em>Add Additional Service To Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING___ADD_ADDITIONAL_SERVICE_TO_BOOKING__STRING_INT = 0;

	/**
	 * The operation id for the '<em>Add Room To Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING___ADD_ROOM_TO_BOOKING__STRING_INT = 1;

	/**
	 * The operation id for the '<em>Remove Room From Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING___REMOVE_ROOM_FROM_BOOKING__STRING = 2;

	/**
	 * The operation id for the '<em>Update Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING___UPDATE_BOOKING__DATE_DATE = 3;

	/**
	 * The operation id for the '<em>Remove Additional Service From Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING___REMOVE_ADDITIONAL_SERVICE_FROM_BOOKING__STRING = 4;

	/**
	 * The operation id for the '<em>Current Cost</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING___CURRENT_COST = 5;

	/**
	 * The operation id for the '<em>Update Payment Details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING___UPDATE_PAYMENT_DETAILS__BOOKINGCOMPONENT_PAYMENTDETAILS = 6;

	/**
	 * The operation id for the '<em>Generate Reference Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING___GENERATE_REFERENCE_NUMBER = 7;

	/**
	 * The operation id for the '<em>Add Guest To Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING___ADD_GUEST_TO_BOOKING__STRING_STRING_STRING = 8;

	/**
	 * The operation id for the '<em>Remove Guest From Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING___REMOVE_GUEST_FROM_BOOKING__STRING_STRING_STRING = 9;

	/**
	 * The operation id for the '<em>Get Guests In Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING___GET_GUESTS_IN_BOOKING = 10;

	/**
	 * The operation id for the '<em>Get Room Types In Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING___GET_ROOM_TYPES_IN_BOOKING = 11;

	/**
	 * The number of operations of the '<em>Booking Component Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_OPERATION_COUNT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_ADDITIONAL_SERVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_ADDITIONAL_SERVICE__COST = 1;

	/**
	 * The number of structural features of the '<em>Booking Component Additional Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_ADDITIONAL_SERVICE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Booking Component Additional Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_ADDITIONAL_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_GUEST__FIRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_GUEST__LAST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_GUEST__ADDRESS = 2;

	/**
	 * The number of structural features of the '<em>Booking Component Booking Guest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_GUEST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Booking Component Booking Guest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_GUEST_OPERATION_COUNT = 0;

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
	 * The number of structural features of the '<em>Booking Component Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_ROOM_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Booking Component Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_ROOM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Implementation.impl.BookingComponent_BookingHandlerImpl <em>Booking Component Booking Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.impl.BookingComponent_BookingHandlerImpl
	 * @see Implementation.impl.ImplementationPackageImpl#getBookingComponent_BookingHandler()
	 * @generated
	 */
	int BOOKING_COMPONENT_BOOKING_HANDLER = 34;

	/**
	 * The feature id for the '<em><b>Bookings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_HANDLER__BOOKINGS = BOOKING_COMPONENT_IBOOKING_INFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Authentication</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_HANDLER__AUTHENTICATION = BOOKING_COMPONENT_IBOOKING_INFORMATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>IRoom Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_HANDLER__IROOM_INFORMATION = BOOKING_COMPONENT_IBOOKING_INFORMATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>IAdditional Service Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_HANDLER__IADDITIONAL_SERVICE_INFORMATION = BOOKING_COMPONENT_IBOOKING_INFORMATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>IPayment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_HANDLER__IPAYMENT = BOOKING_COMPONENT_IBOOKING_INFORMATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Booking Component Booking Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_HANDLER_FEATURE_COUNT = BOOKING_COMPONENT_IBOOKING_INFORMATION_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Guests In Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_HANDLER___GET_GUESTS_IN_BOOKING__STRING = BOOKING_COMPONENT_IBOOKING_INFORMATION___GET_GUESTS_IN_BOOKING__STRING;

	/**
	 * The operation id for the '<em>Get Room Types In Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_HANDLER___GET_ROOM_TYPES_IN_BOOKING__STRING = BOOKING_COMPONENT_IBOOKING_INFORMATION___GET_ROOM_TYPES_IN_BOOKING__STRING;

	/**
	 * The operation id for the '<em>Search For Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_HANDLER___SEARCH_FOR_BOOKING__STRING = BOOKING_COMPONENT_IBOOKING_INFORMATION___SEARCH_FOR_BOOKING__STRING;

	/**
	 * The operation id for the '<em>Is Paid For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_HANDLER___IS_PAID_FOR__STRING = BOOKING_COMPONENT_IBOOKING_INFORMATION___IS_PAID_FOR__STRING;

	/**
	 * The operation id for the '<em>Make Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_HANDLER___MAKE_PAYMENT__STRING = BOOKING_COMPONENT_IBOOKING_INFORMATION___MAKE_PAYMENT__STRING;

	/**
	 * The operation id for the '<em>Get DSS Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_HANDLER___GET_DSS_INFO = BOOKING_COMPONENT_IBOOKING_INFORMATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Make Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_HANDLER___MAKE_BOOKING__DATE_DATE_STRING_STRING_STRING_STRING_STRING_STRING_STRING_STRING = BOOKING_COMPONENT_IBOOKING_INFORMATION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_HANDLER___ADD_ROOM__STRING_STRING_INT = BOOKING_COMPONENT_IBOOKING_INFORMATION_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Request Quote</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_HANDLER___REQUEST_QUOTE__STRING_INT_DATE_DATE = BOOKING_COMPONENT_IBOOKING_INFORMATION_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Edit Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_HANDLER___EDIT_BOOKING__STRING_DATE_DATE = BOOKING_COMPONENT_IBOOKING_INFORMATION_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Cancel Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_HANDLER___CANCEL_BOOKING__STRING = BOOKING_COMPONENT_IBOOKING_INFORMATION_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Add Additional Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_HANDLER___ADD_ADDITIONAL_SERVICE__STRING_STRING_INT = BOOKING_COMPONENT_IBOOKING_INFORMATION_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Remove Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_HANDLER___REMOVE_ROOM__STRING_STRING = BOOKING_COMPONENT_IBOOKING_INFORMATION_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Remove Additional Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_HANDLER___REMOVE_ADDITIONAL_SERVICE__STRING_STRING = BOOKING_COMPONENT_IBOOKING_INFORMATION_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Generate Quote</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_HANDLER___GENERATE_QUOTE__DATE_DATE_STRING = BOOKING_COMPONENT_IBOOKING_INFORMATION_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Add Guest To Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_HANDLER___ADD_GUEST_TO_BOOKING__STRING_STRING_STRING_STRING = BOOKING_COMPONENT_IBOOKING_INFORMATION_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Remove Guest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_HANDLER___REMOVE_GUEST__STRING_STRING_STRING_STRING = BOOKING_COMPONENT_IBOOKING_INFORMATION_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Find Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_HANDLER___FIND_BOOKING__STRING = BOOKING_COMPONENT_IBOOKING_INFORMATION_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Booking Available</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_HANDLER___BOOKING_AVAILABLE__DATE_DATE = BOOKING_COMPONENT_IBOOKING_INFORMATION_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Find Bookings By Date And Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_HANDLER___FIND_BOOKINGS_BY_DATE_AND_TYPE__DATE_DATE_STRING = BOOKING_COMPONENT_IBOOKING_INFORMATION_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Find Bookings By Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_HANDLER___FIND_BOOKINGS_BY_DATE__DATE_DATE = BOOKING_COMPONENT_IBOOKING_INFORMATION_OPERATION_COUNT + 15;

	/**
	 * The number of operations of the '<em>Booking Component Booking Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_HANDLER_OPERATION_COUNT = BOOKING_COMPONENT_IBOOKING_INFORMATION_OPERATION_COUNT + 16;

	/**
	 * The meta object id for the '{@link Implementation.BookingComponent_IBookingAdministration <em>Booking Component IBooking Administration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.BookingComponent_IBookingAdministration
	 * @see Implementation.impl.ImplementationPackageImpl#getBookingComponent_IBookingAdministration()
	 * @generated
	 */
	int BOOKING_COMPONENT_IBOOKING_ADMINISTRATION = 35;

	/**
	 * The number of structural features of the '<em>Booking Component IBooking Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING_ADMINISTRATION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Make Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___MAKE_BOOKING__DATE_DATE_STRING_STRING_STRING_STRING_STRING_STRING_STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Add Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___ADD_ROOM__STRING_STRING_INT = 1;

	/**
	 * The operation id for the '<em>Request Quote</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___REQUEST_QUOTE__STRING_INT_DATE_DATE = 2;

	/**
	 * The operation id for the '<em>Edit Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___EDIT_BOOKING__STRING_DATE_DATE = 3;

	/**
	 * The operation id for the '<em>Cancel Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___CANCEL_BOOKING__STRING = 4;

	/**
	 * The operation id for the '<em>Add Additional Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___ADD_ADDITIONAL_SERVICE__STRING_STRING_INT = 5;

	/**
	 * The operation id for the '<em>Remove Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___REMOVE_ROOM__STRING_STRING = 6;

	/**
	 * The operation id for the '<em>Remove Additional Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___REMOVE_ADDITIONAL_SERVICE__STRING_STRING = 7;

	/**
	 * The operation id for the '<em>Generate Quote</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___GENERATE_QUOTE__DATE_DATE_STRING = 8;

	/**
	 * The operation id for the '<em>Add Guest To Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___ADD_GUEST_TO_BOOKING__STRING_STRING_STRING_STRING = 9;

	/**
	 * The operation id for the '<em>Remove Guest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___REMOVE_GUEST__STRING_STRING_STRING_STRING = 10;

	/**
	 * The number of operations of the '<em>Booking Component IBooking Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING_ADMINISTRATION_OPERATION_COUNT = 11;

	/**
	 * The number of structural features of the '<em>Staff Component IAccount Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_IACCOUNT_ADMINISTRATION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_IACCOUNT_ADMINISTRATION___CREATE_ACCOUNT__STRING_STRING_STRING_STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Edit Account Details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_IACCOUNT_ADMINISTRATION___EDIT_ACCOUNT_DETAILS__STRING_STRING_STRING_STRING_STRING = 1;

	/**
	 * The operation id for the '<em>Remove Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_IACCOUNT_ADMINISTRATION___REMOVE_ACCOUNT__STRING = 2;

	/**
	 * The number of operations of the '<em>Staff Component IAccount Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_IACCOUNT_ADMINISTRATION_OPERATION_COUNT = 3;

	/**
	 * The number of structural features of the '<em>Staff Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_FEATURE_COUNT = STAFF_COMPONENT_IACCOUNT_ADMINISTRATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT___CREATE_ACCOUNT__STRING_STRING_STRING_STRING_STRING = STAFF_COMPONENT_IACCOUNT_ADMINISTRATION___CREATE_ACCOUNT__STRING_STRING_STRING_STRING_STRING;

	/**
	 * The operation id for the '<em>Edit Account Details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT___EDIT_ACCOUNT_DETAILS__STRING_STRING_STRING_STRING_STRING = STAFF_COMPONENT_IACCOUNT_ADMINISTRATION___EDIT_ACCOUNT_DETAILS__STRING_STRING_STRING_STRING_STRING;

	/**
	 * The operation id for the '<em>Remove Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT___REMOVE_ACCOUNT__STRING = STAFF_COMPONENT_IACCOUNT_ADMINISTRATION___REMOVE_ACCOUNT__STRING;

	/**
	 * The operation id for the '<em>Log In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT___LOG_IN__STRING_STRING = STAFF_COMPONENT_IACCOUNT_ADMINISTRATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Log Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT___LOG_OUT__STRING = STAFF_COMPONENT_IACCOUNT_ADMINISTRATION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Logged In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT___IS_LOGGED_IN__STRING = STAFF_COMPONENT_IACCOUNT_ADMINISTRATION_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Staff Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_OPERATION_COUNT = STAFF_COMPONENT_IACCOUNT_ADMINISTRATION_OPERATION_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Logged In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_ACCOUNT_MANAGER__LOGGED_IN = STAFF_COMPONENT_IAUTHENTICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Employees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_ACCOUNT_MANAGER__EMPLOYEES = STAFF_COMPONENT_IAUTHENTICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>IAuthentication</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_ACCOUNT_MANAGER__IAUTHENTICATION = STAFF_COMPONENT_IAUTHENTICATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Staff Component Account Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_ACCOUNT_MANAGER_FEATURE_COUNT = STAFF_COMPONENT_IAUTHENTICATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Log In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_ACCOUNT_MANAGER___LOG_IN__STRING_STRING = STAFF_COMPONENT_IAUTHENTICATION___LOG_IN__STRING_STRING;

	/**
	 * The operation id for the '<em>Log Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_ACCOUNT_MANAGER___LOG_OUT__STRING = STAFF_COMPONENT_IAUTHENTICATION___LOG_OUT__STRING;

	/**
	 * The operation id for the '<em>Is Logged In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_ACCOUNT_MANAGER___IS_LOGGED_IN__STRING = STAFF_COMPONENT_IAUTHENTICATION___IS_LOGGED_IN__STRING;

	/**
	 * The operation id for the '<em>Create Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_ACCOUNT_MANAGER___CREATE_ACCOUNT__STRING_STRING_STRING_STRING_STRING = STAFF_COMPONENT_IAUTHENTICATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Edit Account Details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_ACCOUNT_MANAGER___EDIT_ACCOUNT_DETAILS__STRING_STRING_STRING_STRING_STRING = STAFF_COMPONENT_IAUTHENTICATION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Remove Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_ACCOUNT_MANAGER___REMOVE_ACCOUNT__STRING = STAFF_COMPONENT_IAUTHENTICATION_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Find Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_ACCOUNT_MANAGER___FIND_ACCOUNT__STRING = STAFF_COMPONENT_IAUTHENTICATION_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Staff Component Account Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_ACCOUNT_MANAGER_OPERATION_COUNT = STAFF_COMPONENT_IAUTHENTICATION_OPERATION_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_EMPLOYEE__ID = 0;

	/**
	 * The feature id for the '<em><b>Ssn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_EMPLOYEE__SSN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_EMPLOYEE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_EMPLOYEE__EMAIL = 3;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_EMPLOYEE__PHONE = 4;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_EMPLOYEE__PASSWORD = 5;

	/**
	 * The number of structural features of the '<em>Staff Component Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_EMPLOYEE_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Get Employee Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_EMPLOYEE___GET_EMPLOYEE_INFO = 0;

	/**
	 * The number of operations of the '<em>Staff Component Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_EMPLOYEE_OPERATION_COUNT = 1;

	/**
	 * The number of structural features of the '<em>Room Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_FEATURE_COUNT = ROOM_COMPONENT_IROOM_INFORMATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Room Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT___GET_ROOM_INFO__INT = ROOM_COMPONENT_IROOM_INFORMATION___GET_ROOM_INFO__INT;

	/**
	 * The operation id for the '<em>Search Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT___SEARCH_ROOM__STRING = ROOM_COMPONENT_IROOM_INFORMATION___SEARCH_ROOM__STRING;

	/**
	 * The operation id for the '<em>Get Room Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT___GET_ROOM_TYPES = ROOM_COMPONENT_IROOM_INFORMATION___GET_ROOM_TYPES;

	/**
	 * The operation id for the '<em>Get All Room Numbers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT___GET_ALL_ROOM_NUMBERS = ROOM_COMPONENT_IROOM_INFORMATION___GET_ALL_ROOM_NUMBERS;

	/**
	 * The operation id for the '<em>Count Number Of Total Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT___COUNT_NUMBER_OF_TOTAL_ROOMS = ROOM_COMPONENT_IROOM_INFORMATION___COUNT_NUMBER_OF_TOTAL_ROOMS;

	/**
	 * The operation id for the '<em>Get Count Of Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT___GET_COUNT_OF_ROOM_TYPE__STRING = ROOM_COMPONENT_IROOM_INFORMATION___GET_COUNT_OF_ROOM_TYPE__STRING;

	/**
	 * The operation id for the '<em>Create Bed Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT___CREATE_BED_ROOM__INT_BOOLEAN_INT_STRING_STRING_INT = ROOM_COMPONENT_IROOM_INFORMATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Edit Bed Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT___EDIT_BED_ROOM__INT_INT_BOOLEAN_INT_STRING_STRING_INT = ROOM_COMPONENT_IROOM_INFORMATION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Remove</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT___REMOVE__INT = ROOM_COMPONENT_IROOM_INFORMATION_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Create Conference Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT___CREATE_CONFERENCE_ROOM__INT_BOOLEAN_INT_STRING_STRING_INT_BOOLEAN_BOOLEAN = ROOM_COMPONENT_IROOM_INFORMATION_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Edit Conference Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT___EDIT_CONFERENCE_ROOM__INT_INT_BOOLEAN_INT_STRING_STRING_INT_BOOLEAN_BOOLEAN = ROOM_COMPONENT_IROOM_INFORMATION_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Room Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_OPERATION_COUNT = ROOM_COMPONENT_IROOM_INFORMATION_OPERATION_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Room Component IRoom Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_IROOM_ADMINISTRATION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Bed Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_IROOM_ADMINISTRATION___CREATE_BED_ROOM__INT_BOOLEAN_INT_STRING_STRING_INT = 0;

	/**
	 * The operation id for the '<em>Edit Bed Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_IROOM_ADMINISTRATION___EDIT_BED_ROOM__INT_INT_BOOLEAN_INT_STRING_STRING_INT = 1;

	/**
	 * The operation id for the '<em>Remove</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_IROOM_ADMINISTRATION___REMOVE__INT = 2;

	/**
	 * The operation id for the '<em>Create Conference Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_IROOM_ADMINISTRATION___CREATE_CONFERENCE_ROOM__INT_BOOLEAN_INT_STRING_STRING_INT_BOOLEAN_BOOLEAN = 3;

	/**
	 * The operation id for the '<em>Edit Conference Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_IROOM_ADMINISTRATION___EDIT_CONFERENCE_ROOM__INT_INT_BOOLEAN_INT_STRING_STRING_INT_BOOLEAN_BOOLEAN = 4;

	/**
	 * The number of operations of the '<em>Room Component IRoom Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_IROOM_ADMINISTRATION_OPERATION_COUNT = 5;

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
	 * The number of structural features of the '<em>Room Component Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_ROOM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Room Component Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_ROOM_OPERATION_COUNT = 0;

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
	 * The number of structural features of the '<em>Room Component Bedroom</em>' class.
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
	 * The number of operations of the '<em>Room Component Bedroom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_BEDROOM_OPERATION_COUNT = ROOM_COMPONENT_ROOM_OPERATION_COUNT + 2;

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
	 * The number of structural features of the '<em>Room Component Conference Room</em>' class.
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
	 * The number of operations of the '<em>Room Component Conference Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_CONFERENCE_ROOM_OPERATION_COUNT = ROOM_COMPONENT_ROOM_OPERATION_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Authenticator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_ROOM_HANDLER__AUTHENTICATOR = ROOM_COMPONENT_IROOM_INFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bed Rooms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_ROOM_HANDLER__BED_ROOMS = ROOM_COMPONENT_IROOM_INFORMATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Conference Rooms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_ROOM_HANDLER__CONFERENCE_ROOMS = ROOM_COMPONENT_IROOM_INFORMATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Room Component Room Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_ROOM_HANDLER_FEATURE_COUNT = ROOM_COMPONENT_IROOM_INFORMATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Room Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_ROOM_HANDLER___GET_ROOM_INFO__INT = ROOM_COMPONENT_IROOM_INFORMATION___GET_ROOM_INFO__INT;

	/**
	 * The operation id for the '<em>Search Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_ROOM_HANDLER___SEARCH_ROOM__STRING = ROOM_COMPONENT_IROOM_INFORMATION___SEARCH_ROOM__STRING;

	/**
	 * The operation id for the '<em>Get Room Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_ROOM_HANDLER___GET_ROOM_TYPES = ROOM_COMPONENT_IROOM_INFORMATION___GET_ROOM_TYPES;

	/**
	 * The operation id for the '<em>Get All Room Numbers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_ROOM_HANDLER___GET_ALL_ROOM_NUMBERS = ROOM_COMPONENT_IROOM_INFORMATION___GET_ALL_ROOM_NUMBERS;

	/**
	 * The operation id for the '<em>Count Number Of Total Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_ROOM_HANDLER___COUNT_NUMBER_OF_TOTAL_ROOMS = ROOM_COMPONENT_IROOM_INFORMATION___COUNT_NUMBER_OF_TOTAL_ROOMS;

	/**
	 * The operation id for the '<em>Get Count Of Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_ROOM_HANDLER___GET_COUNT_OF_ROOM_TYPE__STRING = ROOM_COMPONENT_IROOM_INFORMATION___GET_COUNT_OF_ROOM_TYPE__STRING;

	/**
	 * The operation id for the '<em>Create Bed Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_ROOM_HANDLER___CREATE_BED_ROOM__INT_BOOLEAN_INT_STRING_STRING_INT = ROOM_COMPONENT_IROOM_INFORMATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Edit Bed Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_ROOM_HANDLER___EDIT_BED_ROOM__INT_INT_BOOLEAN_INT_STRING_STRING_INT = ROOM_COMPONENT_IROOM_INFORMATION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Remove</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_ROOM_HANDLER___REMOVE__INT = ROOM_COMPONENT_IROOM_INFORMATION_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Create Conference Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_ROOM_HANDLER___CREATE_CONFERENCE_ROOM__INT_BOOLEAN_INT_STRING_STRING_INT_BOOLEAN_BOOLEAN = ROOM_COMPONENT_IROOM_INFORMATION_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Edit Conference Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_ROOM_HANDLER___EDIT_CONFERENCE_ROOM__INT_INT_BOOLEAN_INT_STRING_STRING_INT_BOOLEAN_BOOLEAN = ROOM_COMPONENT_IROOM_INFORMATION_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Room Component Room Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_ROOM_HANDLER_OPERATION_COUNT = ROOM_COMPONENT_IROOM_INFORMATION_OPERATION_COUNT + 5;


	/**
	 * The meta object id for the '{@link Implementation.impl.BankImpl <em>Bank</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Implementation.impl.BankImpl
	 * @see Implementation.impl.ImplementationPackageImpl#getBank()
	 * @generated
	 */
	int BANK = 46;

	/**
	 * The number of structural features of the '<em>Bank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_FEATURE_COUNT = BOOKING_COMPONENT_IBOOKING_DECISION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get DSS Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK___GET_DSS_INFO = BOOKING_COMPONENT_IBOOKING_DECISION___GET_DSS_INFO;

	/**
	 * The operation id for the '<em>Make Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK___MAKE_BOOKING__DATE_DATE_STRING_STRING_STRING_STRING_STRING_STRING_STRING_STRING = BOOKING_COMPONENT_IBOOKING_DECISION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK___ADD_ROOM__STRING_STRING_INT = BOOKING_COMPONENT_IBOOKING_DECISION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Request Quote</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK___REQUEST_QUOTE__STRING_INT_DATE_DATE = BOOKING_COMPONENT_IBOOKING_DECISION_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Edit Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK___EDIT_BOOKING__STRING_DATE_DATE = BOOKING_COMPONENT_IBOOKING_DECISION_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Cancel Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK___CANCEL_BOOKING__STRING = BOOKING_COMPONENT_IBOOKING_DECISION_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Add Additional Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK___ADD_ADDITIONAL_SERVICE__STRING_STRING_INT = BOOKING_COMPONENT_IBOOKING_DECISION_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Remove Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK___REMOVE_ROOM__STRING_STRING = BOOKING_COMPONENT_IBOOKING_DECISION_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Remove Additional Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK___REMOVE_ADDITIONAL_SERVICE__STRING_STRING = BOOKING_COMPONENT_IBOOKING_DECISION_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Generate Quote</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK___GENERATE_QUOTE__DATE_DATE_STRING = BOOKING_COMPONENT_IBOOKING_DECISION_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Add Guest To Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK___ADD_GUEST_TO_BOOKING__STRING_STRING_STRING_STRING = BOOKING_COMPONENT_IBOOKING_DECISION_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Remove Guest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK___REMOVE_GUEST__STRING_STRING_STRING_STRING = BOOKING_COMPONENT_IBOOKING_DECISION_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Guests In Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK___GET_GUESTS_IN_BOOKING__STRING = BOOKING_COMPONENT_IBOOKING_DECISION_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Room Types In Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK___GET_ROOM_TYPES_IN_BOOKING__STRING = BOOKING_COMPONENT_IBOOKING_DECISION_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Search For Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK___SEARCH_FOR_BOOKING__STRING = BOOKING_COMPONENT_IBOOKING_DECISION_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Paid For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK___IS_PAID_FOR__STRING = BOOKING_COMPONENT_IBOOKING_DECISION_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Make Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK___MAKE_PAYMENT__STRING = BOOKING_COMPONENT_IBOOKING_DECISION_OPERATION_COUNT + 15;

	/**
	 * The number of operations of the '<em>Bank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_OPERATION_COUNT = BOOKING_COMPONENT_IBOOKING_DECISION_OPERATION_COUNT + 16;


	/**
	 * Returns the meta object for class '{@link Implementation.DecisionSupportComponent <em>Decision Support Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Support Component</em>'.
	 * @see Implementation.DecisionSupportComponent
	 * @generated
	 */
	EClass getDecisionSupportComponent();

	/**
	 * Returns the meta object for class '{@link Implementation.DecisionSupportComponent_IDecisionSupport <em>Decision Support Component IDecision Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Support Component IDecision Support</em>'.
	 * @see Implementation.DecisionSupportComponent_IDecisionSupport
	 * @generated
	 */
	EClass getDecisionSupportComponent_IDecisionSupport();

	/**
	 * Returns the meta object for the '{@link Implementation.DecisionSupportComponent_IDecisionSupport#getDSSData() <em>Get DSS Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get DSS Data</em>' operation.
	 * @see Implementation.DecisionSupportComponent_IDecisionSupport#getDSSData()
	 * @generated
	 */
	EOperation getDecisionSupportComponent_IDecisionSupport__GetDSSData();

	/**
	 * Returns the meta object for the '{@link Implementation.DecisionSupportComponent_IDecisionSupport#getAllRoomTypeFrequency() <em>Get All Room Type Frequency</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Room Type Frequency</em>' operation.
	 * @see Implementation.DecisionSupportComponent_IDecisionSupport#getAllRoomTypeFrequency()
	 * @generated
	 */
	EOperation getDecisionSupportComponent_IDecisionSupport__GetAllRoomTypeFrequency();

	/**
	 * Returns the meta object for the '{@link Implementation.DecisionSupportComponent_IDecisionSupport#getRoomTypeFrequency(java.lang.String) <em>Get Room Type Frequency</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Type Frequency</em>' operation.
	 * @see Implementation.DecisionSupportComponent_IDecisionSupport#getRoomTypeFrequency(java.lang.String)
	 * @generated
	 */
	EOperation getDecisionSupportComponent_IDecisionSupport__GetRoomTypeFrequency__String();

	/**
	 * Returns the meta object for the '{@link Implementation.DecisionSupportComponent_IDecisionSupport#countRoomType(org.eclipse.emf.common.util.EList, java.lang.String) <em>Count Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Count Room Type</em>' operation.
	 * @see Implementation.DecisionSupportComponent_IDecisionSupport#countRoomType(org.eclipse.emf.common.util.EList, java.lang.String)
	 * @generated
	 */
	EOperation getDecisionSupportComponent_IDecisionSupport__CountRoomType__EList_String();

	/**
	 * Returns the meta object for the '{@link Implementation.DecisionSupportComponent_IDecisionSupport#getAllCustomerBookingFrequency() <em>Get All Customer Booking Frequency</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Customer Booking Frequency</em>' operation.
	 * @see Implementation.DecisionSupportComponent_IDecisionSupport#getAllCustomerBookingFrequency()
	 * @generated
	 */
	EOperation getDecisionSupportComponent_IDecisionSupport__GetAllCustomerBookingFrequency();

	/**
	 * Returns the meta object for the '{@link Implementation.DecisionSupportComponent_IDecisionSupport#getCustomerBookingFrequency(java.lang.String) <em>Get Customer Booking Frequency</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Customer Booking Frequency</em>' operation.
	 * @see Implementation.DecisionSupportComponent_IDecisionSupport#getCustomerBookingFrequency(java.lang.String)
	 * @generated
	 */
	EOperation getDecisionSupportComponent_IDecisionSupport__GetCustomerBookingFrequency__String();

	/**
	 * Returns the meta object for the '{@link Implementation.DecisionSupportComponent_IDecisionSupport#getDSSOccupancyInfo() <em>Get DSS Occupancy Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get DSS Occupancy Info</em>' operation.
	 * @see Implementation.DecisionSupportComponent_IDecisionSupport#getDSSOccupancyInfo()
	 * @generated
	 */
	EOperation getDecisionSupportComponent_IDecisionSupport__GetDSSOccupancyInfo();

	/**
	 * Returns the meta object for the '{@link Implementation.DecisionSupportComponent_IDecisionSupport#getNumberOfOccupanciesOfRoom(int) <em>Get Number Of Occupancies Of Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Number Of Occupancies Of Room</em>' operation.
	 * @see Implementation.DecisionSupportComponent_IDecisionSupport#getNumberOfOccupanciesOfRoom(int)
	 * @generated
	 */
	EOperation getDecisionSupportComponent_IDecisionSupport__GetNumberOfOccupanciesOfRoom__int();

	/**
	 * Returns the meta object for class '{@link Implementation.DecisionSupportComponent_BookingDSSInfo <em>Decision Support Component Booking DSS Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Support Component Booking DSS Info</em>'.
	 * @see Implementation.DecisionSupportComponent_BookingDSSInfo
	 * @generated
	 */
	EClass getDecisionSupportComponent_BookingDSSInfo();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.DecisionSupportComponent_BookingDSSInfo#getNumberOfGuests <em>Number Of Guests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Guests</em>'.
	 * @see Implementation.DecisionSupportComponent_BookingDSSInfo#getNumberOfGuests()
	 * @see #getDecisionSupportComponent_BookingDSSInfo()
	 * @generated
	 */
	EAttribute getDecisionSupportComponent_BookingDSSInfo_NumberOfGuests();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.DecisionSupportComponent_BookingDSSInfo#getRoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Type</em>'.
	 * @see Implementation.DecisionSupportComponent_BookingDSSInfo#getRoomType()
	 * @see #getDecisionSupportComponent_BookingDSSInfo()
	 * @generated
	 */
	EAttribute getDecisionSupportComponent_BookingDSSInfo_RoomType();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.DecisionSupportComponent_BookingDSSInfo#getArrivalDate <em>Arrival Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arrival Date</em>'.
	 * @see Implementation.DecisionSupportComponent_BookingDSSInfo#getArrivalDate()
	 * @see #getDecisionSupportComponent_BookingDSSInfo()
	 * @generated
	 */
	EAttribute getDecisionSupportComponent_BookingDSSInfo_ArrivalDate();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.DecisionSupportComponent_BookingDSSInfo#getDepartureDate <em>Departure Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Departure Date</em>'.
	 * @see Implementation.DecisionSupportComponent_BookingDSSInfo#getDepartureDate()
	 * @see #getDecisionSupportComponent_BookingDSSInfo()
	 * @generated
	 */
	EAttribute getDecisionSupportComponent_BookingDSSInfo_DepartureDate();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.DecisionSupportComponent_BookingDSSInfo#getCustomerSSN <em>Customer SSN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer SSN</em>'.
	 * @see Implementation.DecisionSupportComponent_BookingDSSInfo#getCustomerSSN()
	 * @see #getDecisionSupportComponent_BookingDSSInfo()
	 * @generated
	 */
	EAttribute getDecisionSupportComponent_BookingDSSInfo_CustomerSSN();

	/**
	 * Returns the meta object for the reference list '{@link Implementation.DecisionSupportComponent_BookingDSSInfo#getAdditionalServices <em>Additional Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Additional Services</em>'.
	 * @see Implementation.DecisionSupportComponent_BookingDSSInfo#getAdditionalServices()
	 * @see #getDecisionSupportComponent_BookingDSSInfo()
	 * @generated
	 */
	EReference getDecisionSupportComponent_BookingDSSInfo_AdditionalServices();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.DecisionSupportComponent_BookingDSSInfo#getCustomerFirstName <em>Customer First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer First Name</em>'.
	 * @see Implementation.DecisionSupportComponent_BookingDSSInfo#getCustomerFirstName()
	 * @see #getDecisionSupportComponent_BookingDSSInfo()
	 * @generated
	 */
	EAttribute getDecisionSupportComponent_BookingDSSInfo_CustomerFirstName();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.DecisionSupportComponent_BookingDSSInfo#getCustomerLastName <em>Customer Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer Last Name</em>'.
	 * @see Implementation.DecisionSupportComponent_BookingDSSInfo#getCustomerLastName()
	 * @see #getDecisionSupportComponent_BookingDSSInfo()
	 * @generated
	 */
	EAttribute getDecisionSupportComponent_BookingDSSInfo_CustomerLastName();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.DecisionSupportComponent_BookingDSSInfo#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see Implementation.DecisionSupportComponent_BookingDSSInfo#getAddress()
	 * @see #getDecisionSupportComponent_BookingDSSInfo()
	 * @generated
	 */
	EAttribute getDecisionSupportComponent_BookingDSSInfo_Address();

	/**
	 * Returns the meta object for the '{@link Implementation.DecisionSupportComponent_BookingDSSInfo#addAdditionalService(java.lang.String, long) <em>Add Additional Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Additional Service</em>' operation.
	 * @see Implementation.DecisionSupportComponent_BookingDSSInfo#addAdditionalService(java.lang.String, long)
	 * @generated
	 */
	EOperation getDecisionSupportComponent_BookingDSSInfo__AddAdditionalService__String_long();

	/**
	 * Returns the meta object for class '{@link Implementation.DecisionSupportComponent_DSSController <em>Decision Support Component DSS Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Support Component DSS Controller</em>'.
	 * @see Implementation.DecisionSupportComponent_DSSController
	 * @generated
	 */
	EClass getDecisionSupportComponent_DSSController();

	/**
	 * Returns the meta object for the reference '{@link Implementation.DecisionSupportComponent_DSSController#getIOccupancyDecision <em>IOccupancy Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>IOccupancy Decision</em>'.
	 * @see Implementation.DecisionSupportComponent_DSSController#getIOccupancyDecision()
	 * @see #getDecisionSupportComponent_DSSController()
	 * @generated
	 */
	EReference getDecisionSupportComponent_DSSController_IOccupancyDecision();

	/**
	 * Returns the meta object for the reference '{@link Implementation.DecisionSupportComponent_DSSController#getIBookingDecision <em>IBooking Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>IBooking Decision</em>'.
	 * @see Implementation.DecisionSupportComponent_DSSController#getIBookingDecision()
	 * @see #getDecisionSupportComponent_DSSController()
	 * @generated
	 */
	EReference getDecisionSupportComponent_DSSController_IBookingDecision();

	/**
	 * Returns the meta object for the reference list '{@link Implementation.DecisionSupportComponent_DSSController#getOccupancyDSSInfo <em>Occupancy DSS Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Occupancy DSS Info</em>'.
	 * @see Implementation.DecisionSupportComponent_DSSController#getOccupancyDSSInfo()
	 * @see #getDecisionSupportComponent_DSSController()
	 * @generated
	 */
	EReference getDecisionSupportComponent_DSSController_OccupancyDSSInfo();

	/**
	 * Returns the meta object for the reference list '{@link Implementation.DecisionSupportComponent_DSSController#getAdditionalServiceDSSInfo <em>Additional Service DSS Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Additional Service DSS Info</em>'.
	 * @see Implementation.DecisionSupportComponent_DSSController#getAdditionalServiceDSSInfo()
	 * @see #getDecisionSupportComponent_DSSController()
	 * @generated
	 */
	EReference getDecisionSupportComponent_DSSController_AdditionalServiceDSSInfo();

	/**
	 * Returns the meta object for the reference list '{@link Implementation.DecisionSupportComponent_DSSController#getBookingDSSInfo <em>Booking DSS Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Booking DSS Info</em>'.
	 * @see Implementation.DecisionSupportComponent_DSSController#getBookingDSSInfo()
	 * @see #getDecisionSupportComponent_DSSController()
	 * @generated
	 */
	EReference getDecisionSupportComponent_DSSController_BookingDSSInfo();

	/**
	 * Returns the meta object for the '{@link Implementation.DecisionSupportComponent_DSSController#countCustomerBooking(org.eclipse.emf.common.util.EList, java.lang.String) <em>Count Customer Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Count Customer Booking</em>' operation.
	 * @see Implementation.DecisionSupportComponent_DSSController#countCustomerBooking(org.eclipse.emf.common.util.EList, java.lang.String)
	 * @generated
	 */
	EOperation getDecisionSupportComponent_DSSController__CountCustomerBooking__EList_String();

	/**
	 * Returns the meta object for the '{@link Implementation.DecisionSupportComponent_DSSController#getPositionInList(org.eclipse.emf.common.util.EList, java.lang.String) <em>Get Position In List</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Position In List</em>' operation.
	 * @see Implementation.DecisionSupportComponent_DSSController#getPositionInList(org.eclipse.emf.common.util.EList, java.lang.String)
	 * @generated
	 */
	EOperation getDecisionSupportComponent_DSSController__GetPositionInList__EList_String();

	/**
	 * Returns the meta object for class '{@link Implementation.OccupancyComponent_IOccupancyDecision <em>Occupancy Component IOccupancy Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Occupancy Component IOccupancy Decision</em>'.
	 * @see Implementation.OccupancyComponent_IOccupancyDecision
	 * @generated
	 */
	EClass getOccupancyComponent_IOccupancyDecision();

	/**
	 * Returns the meta object for the '{@link Implementation.OccupancyComponent_IOccupancyDecision#getDSSOccupancyInfo() <em>Get DSS Occupancy Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get DSS Occupancy Info</em>' operation.
	 * @see Implementation.OccupancyComponent_IOccupancyDecision#getDSSOccupancyInfo()
	 * @generated
	 */
	EOperation getOccupancyComponent_IOccupancyDecision__GetDSSOccupancyInfo();

	/**
	 * Returns the meta object for class '{@link Implementation.BookingComponent_IBookingDecision <em>Booking Component IBooking Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Component IBooking Decision</em>'.
	 * @see Implementation.BookingComponent_IBookingDecision
	 * @generated
	 */
	EClass getBookingComponent_IBookingDecision();

	/**
	 * Returns the meta object for the '{@link Implementation.BookingComponent_IBookingDecision#getDSSInfo() <em>Get DSS Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get DSS Info</em>' operation.
	 * @see Implementation.BookingComponent_IBookingDecision#getDSSInfo()
	 * @generated
	 */
	EOperation getBookingComponent_IBookingDecision__GetDSSInfo();

	/**
	 * Returns the meta object for class '{@link Implementation.DecisionSupportComponent_OccupancyDSSInfo <em>Decision Support Component Occupancy DSS Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Support Component Occupancy DSS Info</em>'.
	 * @see Implementation.DecisionSupportComponent_OccupancyDSSInfo
	 * @generated
	 */
	EClass getDecisionSupportComponent_OccupancyDSSInfo();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.DecisionSupportComponent_OccupancyDSSInfo#getRoomNumber <em>Room Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Number</em>'.
	 * @see Implementation.DecisionSupportComponent_OccupancyDSSInfo#getRoomNumber()
	 * @see #getDecisionSupportComponent_OccupancyDSSInfo()
	 * @generated
	 */
	EAttribute getDecisionSupportComponent_OccupancyDSSInfo_RoomNumber();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.DecisionSupportComponent_OccupancyDSSInfo#getCheckInDateTime <em>Check In Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check In Date Time</em>'.
	 * @see Implementation.DecisionSupportComponent_OccupancyDSSInfo#getCheckInDateTime()
	 * @see #getDecisionSupportComponent_OccupancyDSSInfo()
	 * @generated
	 */
	EAttribute getDecisionSupportComponent_OccupancyDSSInfo_CheckInDateTime();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.DecisionSupportComponent_OccupancyDSSInfo#getCheckOutDateTime <em>Check Out Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Out Date Time</em>'.
	 * @see Implementation.DecisionSupportComponent_OccupancyDSSInfo#getCheckOutDateTime()
	 * @see #getDecisionSupportComponent_OccupancyDSSInfo()
	 * @generated
	 */
	EAttribute getDecisionSupportComponent_OccupancyDSSInfo_CheckOutDateTime();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.DecisionSupportComponent_OccupancyDSSInfo#getNumberOfGuests <em>Number Of Guests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Guests</em>'.
	 * @see Implementation.DecisionSupportComponent_OccupancyDSSInfo#getNumberOfGuests()
	 * @see #getDecisionSupportComponent_OccupancyDSSInfo()
	 * @generated
	 */
	EAttribute getDecisionSupportComponent_OccupancyDSSInfo_NumberOfGuests();

	/**
	 * Returns the meta object for class '{@link Implementation.DecisionSupportComponent_AdditionalServiceDSSInfo <em>Decision Support Component Additional Service DSS Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Support Component Additional Service DSS Info</em>'.
	 * @see Implementation.DecisionSupportComponent_AdditionalServiceDSSInfo
	 * @generated
	 */
	EClass getDecisionSupportComponent_AdditionalServiceDSSInfo();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.DecisionSupportComponent_AdditionalServiceDSSInfo#getAdditionalServiceName <em>Additional Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Service Name</em>'.
	 * @see Implementation.DecisionSupportComponent_AdditionalServiceDSSInfo#getAdditionalServiceName()
	 * @see #getDecisionSupportComponent_AdditionalServiceDSSInfo()
	 * @generated
	 */
	EAttribute getDecisionSupportComponent_AdditionalServiceDSSInfo_AdditionalServiceName();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.DecisionSupportComponent_AdditionalServiceDSSInfo#getAdditionalServicePrice <em>Additional Service Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Service Price</em>'.
	 * @see Implementation.DecisionSupportComponent_AdditionalServiceDSSInfo#getAdditionalServicePrice()
	 * @see #getDecisionSupportComponent_AdditionalServiceDSSInfo()
	 * @generated
	 */
	EAttribute getDecisionSupportComponent_AdditionalServiceDSSInfo_AdditionalServicePrice();

	/**
	 * Returns the meta object for class '{@link Implementation.OccupancyComponent <em>Occupancy Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Occupancy Component</em>'.
	 * @see Implementation.OccupancyComponent
	 * @generated
	 */
	EClass getOccupancyComponent();

	/**
	 * Returns the meta object for class '{@link Implementation.OccupancyComponent_Occupancy <em>Occupancy Component Occupancy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Occupancy Component Occupancy</em>'.
	 * @see Implementation.OccupancyComponent_Occupancy
	 * @generated
	 */
	EClass getOccupancyComponent_Occupancy();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.OccupancyComponent_Occupancy#getRoomNumber <em>Room Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Number</em>'.
	 * @see Implementation.OccupancyComponent_Occupancy#getRoomNumber()
	 * @see #getOccupancyComponent_Occupancy()
	 * @generated
	 */
	EAttribute getOccupancyComponent_Occupancy_RoomNumber();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.OccupancyComponent_Occupancy#getCheckInDateTime <em>Check In Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check In Date Time</em>'.
	 * @see Implementation.OccupancyComponent_Occupancy#getCheckInDateTime()
	 * @see #getOccupancyComponent_Occupancy()
	 * @generated
	 */
	EAttribute getOccupancyComponent_Occupancy_CheckInDateTime();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.OccupancyComponent_Occupancy#getCheckOutDateTime <em>Check Out Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Out Date Time</em>'.
	 * @see Implementation.OccupancyComponent_Occupancy#getCheckOutDateTime()
	 * @see #getOccupancyComponent_Occupancy()
	 * @generated
	 */
	EAttribute getOccupancyComponent_Occupancy_CheckOutDateTime();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.OccupancyComponent_Occupancy#getBookingReference <em>Booking Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking Reference</em>'.
	 * @see Implementation.OccupancyComponent_Occupancy#getBookingReference()
	 * @see #getOccupancyComponent_Occupancy()
	 * @generated
	 */
	EAttribute getOccupancyComponent_Occupancy_BookingReference();

	/**
	 * Returns the meta object for the reference list '{@link Implementation.OccupancyComponent_Occupancy#getGuests <em>Guests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Guests</em>'.
	 * @see Implementation.OccupancyComponent_Occupancy#getGuests()
	 * @see #getOccupancyComponent_Occupancy()
	 * @generated
	 */
	EReference getOccupancyComponent_Occupancy_Guests();

	/**
	 * Returns the meta object for the '{@link Implementation.OccupancyComponent_Occupancy#getPartner(java.lang.String, java.lang.String) <em>Get Partner</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Partner</em>' operation.
	 * @see Implementation.OccupancyComponent_Occupancy#getPartner(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getOccupancyComponent_Occupancy__GetPartner__String_String();

	/**
	 * Returns the meta object for the '{@link Implementation.OccupancyComponent_Occupancy#addGuestToOccupancy(java.lang.String, java.lang.String) <em>Add Guest To Occupancy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Guest To Occupancy</em>' operation.
	 * @see Implementation.OccupancyComponent_Occupancy#addGuestToOccupancy(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getOccupancyComponent_Occupancy__AddGuestToOccupancy__String_String();

	/**
	 * Returns the meta object for the '{@link Implementation.OccupancyComponent_Occupancy#listGuests() <em>List Guests</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List Guests</em>' operation.
	 * @see Implementation.OccupancyComponent_Occupancy#listGuests()
	 * @generated
	 */
	EOperation getOccupancyComponent_Occupancy__ListGuests();

	/**
	 * Returns the meta object for class '{@link Implementation.OccupancyComponent_Guest <em>Occupancy Component Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Occupancy Component Guest</em>'.
	 * @see Implementation.OccupancyComponent_Guest
	 * @generated
	 */
	EClass getOccupancyComponent_Guest();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.OccupancyComponent_Guest#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see Implementation.OccupancyComponent_Guest#getFirstName()
	 * @see #getOccupancyComponent_Guest()
	 * @generated
	 */
	EAttribute getOccupancyComponent_Guest_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.OccupancyComponent_Guest#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see Implementation.OccupancyComponent_Guest#getLastName()
	 * @see #getOccupancyComponent_Guest()
	 * @generated
	 */
	EAttribute getOccupancyComponent_Guest_LastName();

	/**
	 * Returns the meta object for class '{@link Implementation.OccupancyComponent_IOccupancy <em>Occupancy Component IOccupancy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Occupancy Component IOccupancy</em>'.
	 * @see Implementation.OccupancyComponent_IOccupancy
	 * @generated
	 */
	EClass getOccupancyComponent_IOccupancy();

	/**
	 * Returns the meta object for the '{@link Implementation.OccupancyComponent_IOccupancy#checkInGuest(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Check In Guest</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check In Guest</em>' operation.
	 * @see Implementation.OccupancyComponent_IOccupancy#checkInGuest(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getOccupancyComponent_IOccupancy__CheckInGuest__String_String_String_String_String_String();

	/**
	 * Returns the meta object for the '{@link Implementation.OccupancyComponent_IOccupancy#checkOutGuest(int, java.lang.String, java.lang.String) <em>Check Out Guest</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Out Guest</em>' operation.
	 * @see Implementation.OccupancyComponent_IOccupancy#checkOutGuest(int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getOccupancyComponent_IOccupancy__CheckOutGuest__int_String_String();

	/**
	 * Returns the meta object for the '{@link Implementation.OccupancyComponent_IOccupancy#listGuestsInRoom(int) <em>List Guests In Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List Guests In Room</em>' operation.
	 * @see Implementation.OccupancyComponent_IOccupancy#listGuestsInRoom(int)
	 * @generated
	 */
	EOperation getOccupancyComponent_IOccupancy__ListGuestsInRoom__int();

	/**
	 * Returns the meta object for the '{@link Implementation.OccupancyComponent_IOccupancy#numberOfGuestsInHotel() <em>Number Of Guests In Hotel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Number Of Guests In Hotel</em>' operation.
	 * @see Implementation.OccupancyComponent_IOccupancy#numberOfGuestsInHotel()
	 * @generated
	 */
	EOperation getOccupancyComponent_IOccupancy__NumberOfGuestsInHotel();

	/**
	 * Returns the meta object for the '{@link Implementation.OccupancyComponent_IOccupancy#isOccupied(int) <em>Is Occupied</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Occupied</em>' operation.
	 * @see Implementation.OccupancyComponent_IOccupancy#isOccupied(int)
	 * @generated
	 */
	EOperation getOccupancyComponent_IOccupancy__IsOccupied__int();

	/**
	 * Returns the meta object for the '{@link Implementation.OccupancyComponent_IOccupancy#getAvailableRooms(java.lang.String) <em>Get Available Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Available Rooms</em>' operation.
	 * @see Implementation.OccupancyComponent_IOccupancy#getAvailableRooms(java.lang.String)
	 * @generated
	 */
	EOperation getOccupancyComponent_IOccupancy__GetAvailableRooms__String();

	/**
	 * Returns the meta object for class '{@link Implementation.OccupancyComponent_OccupancyHandler <em>Occupancy Component Occupancy Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Occupancy Component Occupancy Handler</em>'.
	 * @see Implementation.OccupancyComponent_OccupancyHandler
	 * @generated
	 */
	EClass getOccupancyComponent_OccupancyHandler();

	/**
	 * Returns the meta object for the reference '{@link Implementation.OccupancyComponent_OccupancyHandler#getIRoomInformation <em>IRoom Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>IRoom Information</em>'.
	 * @see Implementation.OccupancyComponent_OccupancyHandler#getIRoomInformation()
	 * @see #getOccupancyComponent_OccupancyHandler()
	 * @generated
	 */
	EReference getOccupancyComponent_OccupancyHandler_IRoomInformation();

	/**
	 * Returns the meta object for the reference '{@link Implementation.OccupancyComponent_OccupancyHandler#getIBooking <em>IBooking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>IBooking</em>'.
	 * @see Implementation.OccupancyComponent_OccupancyHandler#getIBooking()
	 * @see #getOccupancyComponent_OccupancyHandler()
	 * @generated
	 */
	EReference getOccupancyComponent_OccupancyHandler_IBooking();

	/**
	 * Returns the meta object for the reference list '{@link Implementation.OccupancyComponent_OccupancyHandler#getOccupancy <em>Occupancy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Occupancy</em>'.
	 * @see Implementation.OccupancyComponent_OccupancyHandler#getOccupancy()
	 * @see #getOccupancyComponent_OccupancyHandler()
	 * @generated
	 */
	EReference getOccupancyComponent_OccupancyHandler_Occupancy();

	/**
	 * Returns the meta object for the '{@link Implementation.OccupancyComponent_OccupancyHandler#findOccupancy(java.lang.String, java.lang.String, java.lang.String) <em>Find Occupancy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Occupancy</em>' operation.
	 * @see Implementation.OccupancyComponent_OccupancyHandler#findOccupancy(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getOccupancyComponent_OccupancyHandler__FindOccupancy__String_String_String();

	/**
	 * Returns the meta object for the '{@link Implementation.OccupancyComponent_OccupancyHandler#isInRoomTypes(org.eclipse.emf.common.util.EList, java.lang.String) <em>Is In Room Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is In Room Types</em>' operation.
	 * @see Implementation.OccupancyComponent_OccupancyHandler#isInRoomTypes(org.eclipse.emf.common.util.EList, java.lang.String)
	 * @generated
	 */
	EOperation getOccupancyComponent_OccupancyHandler__IsInRoomTypes__EList_String();

	/**
	 * Returns the meta object for class '{@link Implementation.RoomComponent_IRoomInformation <em>Room Component IRoom Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Component IRoom Information</em>'.
	 * @see Implementation.RoomComponent_IRoomInformation
	 * @generated
	 */
	EClass getRoomComponent_IRoomInformation();

	/**
	 * Returns the meta object for the '{@link Implementation.RoomComponent_IRoomInformation#getRoomInfo(int) <em>Get Room Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Info</em>' operation.
	 * @see Implementation.RoomComponent_IRoomInformation#getRoomInfo(int)
	 * @generated
	 */
	EOperation getRoomComponent_IRoomInformation__GetRoomInfo__int();

	/**
	 * Returns the meta object for the '{@link Implementation.RoomComponent_IRoomInformation#searchRoom(java.lang.String) <em>Search Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Room</em>' operation.
	 * @see Implementation.RoomComponent_IRoomInformation#searchRoom(java.lang.String)
	 * @generated
	 */
	EOperation getRoomComponent_IRoomInformation__SearchRoom__String();

	/**
	 * Returns the meta object for the '{@link Implementation.RoomComponent_IRoomInformation#getRoomTypes() <em>Get Room Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Types</em>' operation.
	 * @see Implementation.RoomComponent_IRoomInformation#getRoomTypes()
	 * @generated
	 */
	EOperation getRoomComponent_IRoomInformation__GetRoomTypes();

	/**
	 * Returns the meta object for the '{@link Implementation.RoomComponent_IRoomInformation#getAllRoomNumbers() <em>Get All Room Numbers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Room Numbers</em>' operation.
	 * @see Implementation.RoomComponent_IRoomInformation#getAllRoomNumbers()
	 * @generated
	 */
	EOperation getRoomComponent_IRoomInformation__GetAllRoomNumbers();

	/**
	 * Returns the meta object for the '{@link Implementation.RoomComponent_IRoomInformation#countNumberOfTotalRooms() <em>Count Number Of Total Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Count Number Of Total Rooms</em>' operation.
	 * @see Implementation.RoomComponent_IRoomInformation#countNumberOfTotalRooms()
	 * @generated
	 */
	EOperation getRoomComponent_IRoomInformation__CountNumberOfTotalRooms();

	/**
	 * Returns the meta object for the '{@link Implementation.RoomComponent_IRoomInformation#getCountOfRoomType(java.lang.String) <em>Get Count Of Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Count Of Room Type</em>' operation.
	 * @see Implementation.RoomComponent_IRoomInformation#getCountOfRoomType(java.lang.String)
	 * @generated
	 */
	EOperation getRoomComponent_IRoomInformation__GetCountOfRoomType__String();

	/**
	 * Returns the meta object for class '{@link Implementation.BookingComponent_IBookingInformation <em>Booking Component IBooking Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Component IBooking Information</em>'.
	 * @see Implementation.BookingComponent_IBookingInformation
	 * @generated
	 */
	EClass getBookingComponent_IBookingInformation();

	/**
	 * Returns the meta object for the '{@link Implementation.BookingComponent_IBookingInformation#getGuestsInBooking(java.lang.String) <em>Get Guests In Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Guests In Booking</em>' operation.
	 * @see Implementation.BookingComponent_IBookingInformation#getGuestsInBooking(java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_IBookingInformation__GetGuestsInBooking__String();

	/**
	 * Returns the meta object for the '{@link Implementation.BookingComponent_IBookingInformation#getRoomTypesInBooking(java.lang.String) <em>Get Room Types In Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Types In Booking</em>' operation.
	 * @see Implementation.BookingComponent_IBookingInformation#getRoomTypesInBooking(java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_IBookingInformation__GetRoomTypesInBooking__String();

	/**
	 * Returns the meta object for the '{@link Implementation.BookingComponent_IBookingInformation#searchForBooking(java.lang.String) <em>Search For Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search For Booking</em>' operation.
	 * @see Implementation.BookingComponent_IBookingInformation#searchForBooking(java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_IBookingInformation__SearchForBooking__String();

	/**
	 * Returns the meta object for the '{@link Implementation.BookingComponent_IBookingInformation#isPaidFor(java.lang.String) <em>Is Paid For</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Paid For</em>' operation.
	 * @see Implementation.BookingComponent_IBookingInformation#isPaidFor(java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_IBookingInformation__IsPaidFor__String();

	/**
	 * Returns the meta object for the '{@link Implementation.BookingComponent_IBookingInformation#makePayment(java.lang.String) <em>Make Payment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Payment</em>' operation.
	 * @see Implementation.BookingComponent_IBookingInformation#makePayment(java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_IBookingInformation__MakePayment__String();

	/**
	 * Returns the meta object for class '{@link Implementation.PaymentComponent <em>Payment Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment Component</em>'.
	 * @see Implementation.PaymentComponent
	 * @generated
	 */
	EClass getPaymentComponent();

	/**
	 * Returns the meta object for class '{@link Implementation.PaymentComponent_Payment <em>Payment Component Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment Component Payment</em>'.
	 * @see Implementation.PaymentComponent_Payment
	 * @generated
	 */
	EClass getPaymentComponent_Payment();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.PaymentComponent_Payment#getCcNumber <em>Cc Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc Number</em>'.
	 * @see Implementation.PaymentComponent_Payment#getCcNumber()
	 * @see #getPaymentComponent_Payment()
	 * @generated
	 */
	EAttribute getPaymentComponent_Payment_CcNumber();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.PaymentComponent_Payment#getCcv <em>Ccv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ccv</em>'.
	 * @see Implementation.PaymentComponent_Payment#getCcv()
	 * @see #getPaymentComponent_Payment()
	 * @generated
	 */
	EAttribute getPaymentComponent_Payment_Ccv();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.PaymentComponent_Payment#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see Implementation.PaymentComponent_Payment#getFirstName()
	 * @see #getPaymentComponent_Payment()
	 * @generated
	 */
	EAttribute getPaymentComponent_Payment_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.PaymentComponent_Payment#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see Implementation.PaymentComponent_Payment#getLastName()
	 * @see #getPaymentComponent_Payment()
	 * @generated
	 */
	EAttribute getPaymentComponent_Payment_LastName();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.PaymentComponent_Payment#getExpiryMonth <em>Expiry Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiry Month</em>'.
	 * @see Implementation.PaymentComponent_Payment#getExpiryMonth()
	 * @see #getPaymentComponent_Payment()
	 * @generated
	 */
	EAttribute getPaymentComponent_Payment_ExpiryMonth();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.PaymentComponent_Payment#getExpiryYear <em>Expiry Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiry Year</em>'.
	 * @see Implementation.PaymentComponent_Payment#getExpiryYear()
	 * @see #getPaymentComponent_Payment()
	 * @generated
	 */
	EAttribute getPaymentComponent_Payment_ExpiryYear();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.PaymentComponent_Payment#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see Implementation.PaymentComponent_Payment#getAmount()
	 * @see #getPaymentComponent_Payment()
	 * @generated
	 */
	EAttribute getPaymentComponent_Payment_Amount();

	/**
	 * Returns the meta object for class '{@link Implementation.Bank_CustomerProvides <em>Bank Customer Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bank Customer Provides</em>'.
	 * @see Implementation.Bank_CustomerProvides
	 * @generated
	 */
	EClass getBank_CustomerProvides();

	/**
	 * Returns the meta object for the '{@link Implementation.Bank_CustomerProvides#makePayment(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, double) <em>Make Payment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Payment</em>' operation.
	 * @see Implementation.Bank_CustomerProvides#makePayment(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, double)
	 * @generated
	 */
	EOperation getBank_CustomerProvides__MakePayment__String_String_int_int_String_String_double();

	/**
	 * Returns the meta object for the '{@link Implementation.Bank_CustomerProvides#isCreditCardValid(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String) <em>Is Credit Card Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Credit Card Valid</em>' operation.
	 * @see Implementation.Bank_CustomerProvides#isCreditCardValid(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getBank_CustomerProvides__IsCreditCardValid__String_String_int_int_String_String();

	/**
	 * Returns the meta object for class '{@link Implementation.Bank_AdministratorProvides <em>Bank Administrator Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bank Administrator Provides</em>'.
	 * @see Implementation.Bank_AdministratorProvides
	 * @generated
	 */
	EClass getBank_AdministratorProvides();

	/**
	 * Returns the meta object for the '{@link Implementation.Bank_AdministratorProvides#makeDeposit(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, double) <em>Make Deposit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Deposit</em>' operation.
	 * @see Implementation.Bank_AdministratorProvides#makeDeposit(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, double)
	 * @generated
	 */
	EOperation getBank_AdministratorProvides__MakeDeposit__String_String_int_int_String_String_double();

	/**
	 * Returns the meta object for the '{@link Implementation.Bank_AdministratorProvides#addCreditCard(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String) <em>Add Credit Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Credit Card</em>' operation.
	 * @see Implementation.Bank_AdministratorProvides#addCreditCard(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getBank_AdministratorProvides__AddCreditCard__String_String_int_int_String_String();

	/**
	 * Returns the meta object for the '{@link Implementation.Bank_AdministratorProvides#removeCreditCard(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String) <em>Remove Credit Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Credit Card</em>' operation.
	 * @see Implementation.Bank_AdministratorProvides#removeCreditCard(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getBank_AdministratorProvides__RemoveCreditCard__String_String_int_int_String_String();

	/**
	 * Returns the meta object for the '{@link Implementation.Bank_AdministratorProvides#getBalance(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String) <em>Get Balance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Balance</em>' operation.
	 * @see Implementation.Bank_AdministratorProvides#getBalance(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getBank_AdministratorProvides__GetBalance__String_String_int_int_String_String();

	/**
	 * Returns the meta object for class '{@link Implementation.PaymentComponent_IPayment <em>Payment Component IPayment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment Component IPayment</em>'.
	 * @see Implementation.PaymentComponent_IPayment
	 * @generated
	 */
	EClass getPaymentComponent_IPayment();

	/**
	 * Returns the meta object for the '{@link Implementation.PaymentComponent_IPayment#makePayment(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, double) <em>Make Payment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Payment</em>' operation.
	 * @see Implementation.PaymentComponent_IPayment#makePayment(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, double)
	 * @generated
	 */
	EOperation getPaymentComponent_IPayment__MakePayment__String_String_int_int_String_String_double();

	/**
	 * Returns the meta object for the '{@link Implementation.PaymentComponent_IPayment#validateCC(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String) <em>Validate CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate CC</em>' operation.
	 * @see Implementation.PaymentComponent_IPayment#validateCC(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getPaymentComponent_IPayment__ValidateCC__String_String_int_int_String_String();

	/**
	 * Returns the meta object for the '{@link Implementation.PaymentComponent_IPayment#addCC(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String) <em>Add CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add CC</em>' operation.
	 * @see Implementation.PaymentComponent_IPayment#addCC(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getPaymentComponent_IPayment__AddCC__String_String_int_int_String_String();

	/**
	 * Returns the meta object for the '{@link Implementation.PaymentComponent_IPayment#checkBalance(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String) <em>Check Balance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Balance</em>' operation.
	 * @see Implementation.PaymentComponent_IPayment#checkBalance(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getPaymentComponent_IPayment__CheckBalance__String_String_int_int_String_String();

	/**
	 * Returns the meta object for the '{@link Implementation.PaymentComponent_IPayment#makeDeposit(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, double) <em>Make Deposit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Deposit</em>' operation.
	 * @see Implementation.PaymentComponent_IPayment#makeDeposit(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, double)
	 * @generated
	 */
	EOperation getPaymentComponent_IPayment__MakeDeposit__String_String_int_int_String_String_double();

	/**
	 * Returns the meta object for the '{@link Implementation.PaymentComponent_IPayment#removeCC(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String) <em>Remove CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove CC</em>' operation.
	 * @see Implementation.PaymentComponent_IPayment#removeCC(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getPaymentComponent_IPayment__RemoveCC__String_String_int_int_String_String();

	/**
	 * Returns the meta object for class '{@link Implementation.PaymentComponent_PaymentHandler <em>Payment Component Payment Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment Component Payment Handler</em>'.
	 * @see Implementation.PaymentComponent_PaymentHandler
	 * @generated
	 */
	EClass getPaymentComponent_PaymentHandler();

	/**
	 * Returns the meta object for the reference list '{@link Implementation.PaymentComponent_PaymentHandler#getPayment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Payment</em>'.
	 * @see Implementation.PaymentComponent_PaymentHandler#getPayment()
	 * @see #getPaymentComponent_PaymentHandler()
	 * @generated
	 */
	EReference getPaymentComponent_PaymentHandler_Payment();

	/**
	 * Returns the meta object for the reference '{@link Implementation.PaymentComponent_PaymentHandler#getCustomerProvides <em>Customer Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer Provides</em>'.
	 * @see Implementation.PaymentComponent_PaymentHandler#getCustomerProvides()
	 * @see #getPaymentComponent_PaymentHandler()
	 * @generated
	 */
	EReference getPaymentComponent_PaymentHandler_CustomerProvides();

	/**
	 * Returns the meta object for the reference '{@link Implementation.PaymentComponent_PaymentHandler#getAdministratorProvides <em>Administrator Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Administrator Provides</em>'.
	 * @see Implementation.PaymentComponent_PaymentHandler#getAdministratorProvides()
	 * @see #getPaymentComponent_PaymentHandler()
	 * @generated
	 */
	EReference getPaymentComponent_PaymentHandler_AdministratorProvides();

	/**
	 * Returns the meta object for class '{@link Implementation.AdditionalServiceComponent <em>Additional Service Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additional Service Component</em>'.
	 * @see Implementation.AdditionalServiceComponent
	 * @generated
	 */
	EClass getAdditionalServiceComponent();

	/**
	 * Returns the meta object for class '{@link Implementation.AdditionalServiceComponent_AdditionalService <em>Additional Service Component Additional Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additional Service Component Additional Service</em>'.
	 * @see Implementation.AdditionalServiceComponent_AdditionalService
	 * @generated
	 */
	EClass getAdditionalServiceComponent_AdditionalService();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.AdditionalServiceComponent_AdditionalService#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Implementation.AdditionalServiceComponent_AdditionalService#getName()
	 * @see #getAdditionalServiceComponent_AdditionalService()
	 * @generated
	 */
	EAttribute getAdditionalServiceComponent_AdditionalService_Name();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.AdditionalServiceComponent_AdditionalService#isUsable <em>Usable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usable</em>'.
	 * @see Implementation.AdditionalServiceComponent_AdditionalService#isUsable()
	 * @see #getAdditionalServiceComponent_AdditionalService()
	 * @generated
	 */
	EAttribute getAdditionalServiceComponent_AdditionalService_Usable();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.AdditionalServiceComponent_AdditionalService#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see Implementation.AdditionalServiceComponent_AdditionalService#getPrice()
	 * @see #getAdditionalServiceComponent_AdditionalService()
	 * @generated
	 */
	EAttribute getAdditionalServiceComponent_AdditionalService_Price();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.AdditionalServiceComponent_AdditionalService#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Implementation.AdditionalServiceComponent_AdditionalService#getDescription()
	 * @see #getAdditionalServiceComponent_AdditionalService()
	 * @generated
	 */
	EAttribute getAdditionalServiceComponent_AdditionalService_Description();

	/**
	 * Returns the meta object for the reference list '{@link Implementation.AdditionalServiceComponent_AdditionalService#getAdditionalServiceEvent <em>Additional Service Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Additional Service Event</em>'.
	 * @see Implementation.AdditionalServiceComponent_AdditionalService#getAdditionalServiceEvent()
	 * @see #getAdditionalServiceComponent_AdditionalService()
	 * @generated
	 */
	EReference getAdditionalServiceComponent_AdditionalService_AdditionalServiceEvent();

	/**
	 * Returns the meta object for the reference list '{@link Implementation.AdditionalServiceComponent_AdditionalService#getTempEvents <em>Temp Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Temp Events</em>'.
	 * @see Implementation.AdditionalServiceComponent_AdditionalService#getTempEvents()
	 * @see #getAdditionalServiceComponent_AdditionalService()
	 * @generated
	 */
	EReference getAdditionalServiceComponent_AdditionalService_TempEvents();

	/**
	 * Returns the meta object for the '{@link Implementation.AdditionalServiceComponent_AdditionalService#findEvent(java.util.Date, java.lang.String) <em>Find Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Event</em>' operation.
	 * @see Implementation.AdditionalServiceComponent_AdditionalService#findEvent(java.util.Date, java.lang.String)
	 * @generated
	 */
	EOperation getAdditionalServiceComponent_AdditionalService__FindEvent__Date_String();

	/**
	 * Returns the meta object for the '{@link Implementation.AdditionalServiceComponent_AdditionalService#findEvents(java.util.Date) <em>Find Events</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Events</em>' operation.
	 * @see Implementation.AdditionalServiceComponent_AdditionalService#findEvents(java.util.Date)
	 * @generated
	 */
	EOperation getAdditionalServiceComponent_AdditionalService__FindEvents__Date();

	/**
	 * Returns the meta object for the '{@link Implementation.AdditionalServiceComponent_AdditionalService#createEvent(java.util.Date, java.lang.String, int, int) <em>Create Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Event</em>' operation.
	 * @see Implementation.AdditionalServiceComponent_AdditionalService#createEvent(java.util.Date, java.lang.String, int, int)
	 * @generated
	 */
	EOperation getAdditionalServiceComponent_AdditionalService__CreateEvent__Date_String_int_int();

	/**
	 * Returns the meta object for the '{@link Implementation.AdditionalServiceComponent_AdditionalService#editEvent(java.util.Date, java.lang.String, int, int) <em>Edit Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Event</em>' operation.
	 * @see Implementation.AdditionalServiceComponent_AdditionalService#editEvent(java.util.Date, java.lang.String, int, int)
	 * @generated
	 */
	EOperation getAdditionalServiceComponent_AdditionalService__EditEvent__Date_String_int_int();

	/**
	 * Returns the meta object for the '{@link Implementation.AdditionalServiceComponent_AdditionalService#removeEvent(java.util.Date, java.lang.String) <em>Remove Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Event</em>' operation.
	 * @see Implementation.AdditionalServiceComponent_AdditionalService#removeEvent(java.util.Date, java.lang.String)
	 * @generated
	 */
	EOperation getAdditionalServiceComponent_AdditionalService__RemoveEvent__Date_String();

	/**
	 * Returns the meta object for the '{@link Implementation.AdditionalServiceComponent_AdditionalService#removeEvents(java.util.Date) <em>Remove Events</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Events</em>' operation.
	 * @see Implementation.AdditionalServiceComponent_AdditionalService#removeEvents(java.util.Date)
	 * @generated
	 */
	EOperation getAdditionalServiceComponent_AdditionalService__RemoveEvents__Date();

	/**
	 * Returns the meta object for class '{@link Implementation.StaffComponent_IAuthentication <em>Staff Component IAuthentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff Component IAuthentication</em>'.
	 * @see Implementation.StaffComponent_IAuthentication
	 * @generated
	 */
	EClass getStaffComponent_IAuthentication();

	/**
	 * Returns the meta object for the '{@link Implementation.StaffComponent_IAuthentication#logIn(java.lang.String, java.lang.String) <em>Log In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Log In</em>' operation.
	 * @see Implementation.StaffComponent_IAuthentication#logIn(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getStaffComponent_IAuthentication__LogIn__String_String();

	/**
	 * Returns the meta object for the '{@link Implementation.StaffComponent_IAuthentication#logOut(java.lang.String) <em>Log Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Log Out</em>' operation.
	 * @see Implementation.StaffComponent_IAuthentication#logOut(java.lang.String)
	 * @generated
	 */
	EOperation getStaffComponent_IAuthentication__LogOut__String();

	/**
	 * Returns the meta object for the '{@link Implementation.StaffComponent_IAuthentication#isLoggedIn(java.lang.String) <em>Is Logged In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Logged In</em>' operation.
	 * @see Implementation.StaffComponent_IAuthentication#isLoggedIn(java.lang.String)
	 * @generated
	 */
	EOperation getStaffComponent_IAuthentication__IsLoggedIn__String();

	/**
	 * Returns the meta object for class '{@link Implementation.AdditionalServiceComponent_AdditionalServiceHandler <em>Additional Service Component Additional Service Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additional Service Component Additional Service Handler</em>'.
	 * @see Implementation.AdditionalServiceComponent_AdditionalServiceHandler
	 * @generated
	 */
	EClass getAdditionalServiceComponent_AdditionalServiceHandler();

	/**
	 * Returns the meta object for the reference '{@link Implementation.AdditionalServiceComponent_AdditionalServiceHandler#getIAuthentication <em>IAuthentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>IAuthentication</em>'.
	 * @see Implementation.AdditionalServiceComponent_AdditionalServiceHandler#getIAuthentication()
	 * @see #getAdditionalServiceComponent_AdditionalServiceHandler()
	 * @generated
	 */
	EReference getAdditionalServiceComponent_AdditionalServiceHandler_IAuthentication();

	/**
	 * Returns the meta object for the reference list '{@link Implementation.AdditionalServiceComponent_AdditionalServiceHandler#getAdditionalService <em>Additional Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Additional Service</em>'.
	 * @see Implementation.AdditionalServiceComponent_AdditionalServiceHandler#getAdditionalService()
	 * @see #getAdditionalServiceComponent_AdditionalServiceHandler()
	 * @generated
	 */
	EReference getAdditionalServiceComponent_AdditionalServiceHandler_AdditionalService();

	/**
	 * Returns the meta object for the '{@link Implementation.AdditionalServiceComponent_AdditionalServiceHandler#findService(java.lang.String) <em>Find Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Service</em>' operation.
	 * @see Implementation.AdditionalServiceComponent_AdditionalServiceHandler#findService(java.lang.String)
	 * @generated
	 */
	EOperation getAdditionalServiceComponent_AdditionalServiceHandler__FindService__String();

	/**
	 * Returns the meta object for class '{@link Implementation.AdditionalServiceComponent_IAdditionalServiceAdministration <em>Additional Service Component IAdditional Service Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additional Service Component IAdditional Service Administration</em>'.
	 * @see Implementation.AdditionalServiceComponent_IAdditionalServiceAdministration
	 * @generated
	 */
	EClass getAdditionalServiceComponent_IAdditionalServiceAdministration();

	/**
	 * Returns the meta object for the '{@link Implementation.AdditionalServiceComponent_IAdditionalServiceAdministration#createAdditionalService(java.lang.String, boolean, int, java.lang.String) <em>Create Additional Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Additional Service</em>' operation.
	 * @see Implementation.AdditionalServiceComponent_IAdditionalServiceAdministration#createAdditionalService(java.lang.String, boolean, int, java.lang.String)
	 * @generated
	 */
	EOperation getAdditionalServiceComponent_IAdditionalServiceAdministration__CreateAdditionalService__String_boolean_int_String();

	/**
	 * Returns the meta object for the '{@link Implementation.AdditionalServiceComponent_IAdditionalServiceAdministration#editAdditionalService(java.lang.String, java.lang.String, boolean, int, java.lang.String) <em>Edit Additional Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Additional Service</em>' operation.
	 * @see Implementation.AdditionalServiceComponent_IAdditionalServiceAdministration#editAdditionalService(java.lang.String, java.lang.String, boolean, int, java.lang.String)
	 * @generated
	 */
	EOperation getAdditionalServiceComponent_IAdditionalServiceAdministration__EditAdditionalService__String_String_boolean_int_String();

	/**
	 * Returns the meta object for the '{@link Implementation.AdditionalServiceComponent_IAdditionalServiceAdministration#removeAdditionalService(java.lang.String) <em>Remove Additional Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Additional Service</em>' operation.
	 * @see Implementation.AdditionalServiceComponent_IAdditionalServiceAdministration#removeAdditionalService(java.lang.String)
	 * @generated
	 */
	EOperation getAdditionalServiceComponent_IAdditionalServiceAdministration__RemoveAdditionalService__String();

	/**
	 * Returns the meta object for the '{@link Implementation.AdditionalServiceComponent_IAdditionalServiceAdministration#createEvent(java.lang.String, java.util.Date, java.lang.String, int, int) <em>Create Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Event</em>' operation.
	 * @see Implementation.AdditionalServiceComponent_IAdditionalServiceAdministration#createEvent(java.lang.String, java.util.Date, java.lang.String, int, int)
	 * @generated
	 */
	EOperation getAdditionalServiceComponent_IAdditionalServiceAdministration__CreateEvent__String_Date_String_int_int();

	/**
	 * Returns the meta object for the '{@link Implementation.AdditionalServiceComponent_IAdditionalServiceAdministration#editEvent(java.lang.String, java.util.Date, java.lang.String, int, int) <em>Edit Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Event</em>' operation.
	 * @see Implementation.AdditionalServiceComponent_IAdditionalServiceAdministration#editEvent(java.lang.String, java.util.Date, java.lang.String, int, int)
	 * @generated
	 */
	EOperation getAdditionalServiceComponent_IAdditionalServiceAdministration__EditEvent__String_Date_String_int_int();

	/**
	 * Returns the meta object for the '{@link Implementation.AdditionalServiceComponent_IAdditionalServiceAdministration#removeEvent(java.lang.String, java.util.Date, java.lang.String) <em>Remove Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Event</em>' operation.
	 * @see Implementation.AdditionalServiceComponent_IAdditionalServiceAdministration#removeEvent(java.lang.String, java.util.Date, java.lang.String)
	 * @generated
	 */
	EOperation getAdditionalServiceComponent_IAdditionalServiceAdministration__RemoveEvent__String_Date_String();

	/**
	 * Returns the meta object for the '{@link Implementation.AdditionalServiceComponent_IAdditionalServiceAdministration#removeEvents(java.lang.String, java.util.Date) <em>Remove Events</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Events</em>' operation.
	 * @see Implementation.AdditionalServiceComponent_IAdditionalServiceAdministration#removeEvents(java.lang.String, java.util.Date)
	 * @generated
	 */
	EOperation getAdditionalServiceComponent_IAdditionalServiceAdministration__RemoveEvents__String_Date();

	/**
	 * Returns the meta object for class '{@link Implementation.AdditionalServiceComponent_IEventManagement <em>Additional Service Component IEvent Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additional Service Component IEvent Management</em>'.
	 * @see Implementation.AdditionalServiceComponent_IEventManagement
	 * @generated
	 */
	EClass getAdditionalServiceComponent_IEventManagement();

	/**
	 * Returns the meta object for the '{@link Implementation.AdditionalServiceComponent_IEventManagement#getServices() <em>Get Services</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Services</em>' operation.
	 * @see Implementation.AdditionalServiceComponent_IEventManagement#getServices()
	 * @generated
	 */
	EOperation getAdditionalServiceComponent_IEventManagement__GetServices();

	/**
	 * Returns the meta object for the '{@link Implementation.AdditionalServiceComponent_IEventManagement#getEvents(java.lang.String) <em>Get Events</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Events</em>' operation.
	 * @see Implementation.AdditionalServiceComponent_IEventManagement#getEvents(java.lang.String)
	 * @generated
	 */
	EOperation getAdditionalServiceComponent_IEventManagement__GetEvents__String();

	/**
	 * Returns the meta object for the '{@link Implementation.AdditionalServiceComponent_IEventManagement#addGuestToEvent(java.lang.String, java.util.Date, java.lang.String, int) <em>Add Guest To Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Guest To Event</em>' operation.
	 * @see Implementation.AdditionalServiceComponent_IEventManagement#addGuestToEvent(java.lang.String, java.util.Date, java.lang.String, int)
	 * @generated
	 */
	EOperation getAdditionalServiceComponent_IEventManagement__AddGuestToEvent__String_Date_String_int();

	/**
	 * Returns the meta object for the '{@link Implementation.AdditionalServiceComponent_IEventManagement#removeGuestsFromEvent(java.lang.String, java.util.Date, java.lang.String, int) <em>Remove Guests From Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Guests From Event</em>' operation.
	 * @see Implementation.AdditionalServiceComponent_IEventManagement#removeGuestsFromEvent(java.lang.String, java.util.Date, java.lang.String, int)
	 * @generated
	 */
	EOperation getAdditionalServiceComponent_IEventManagement__RemoveGuestsFromEvent__String_Date_String_int();

	/**
	 * Returns the meta object for class '{@link Implementation.AdditionalServiceComponent_AdditionalServiceEvent <em>Additional Service Component Additional Service Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additional Service Component Additional Service Event</em>'.
	 * @see Implementation.AdditionalServiceComponent_AdditionalServiceEvent
	 * @generated
	 */
	EClass getAdditionalServiceComponent_AdditionalServiceEvent();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.AdditionalServiceComponent_AdditionalServiceEvent#getDateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Time</em>'.
	 * @see Implementation.AdditionalServiceComponent_AdditionalServiceEvent#getDateTime()
	 * @see #getAdditionalServiceComponent_AdditionalServiceEvent()
	 * @generated
	 */
	EAttribute getAdditionalServiceComponent_AdditionalServiceEvent_DateTime();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.AdditionalServiceComponent_AdditionalServiceEvent#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see Implementation.AdditionalServiceComponent_AdditionalServiceEvent#getLocation()
	 * @see #getAdditionalServiceComponent_AdditionalServiceEvent()
	 * @generated
	 */
	EAttribute getAdditionalServiceComponent_AdditionalServiceEvent_Location();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.AdditionalServiceComponent_AdditionalServiceEvent#getMaxAttendant <em>Max Attendant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Attendant</em>'.
	 * @see Implementation.AdditionalServiceComponent_AdditionalServiceEvent#getMaxAttendant()
	 * @see #getAdditionalServiceComponent_AdditionalServiceEvent()
	 * @generated
	 */
	EAttribute getAdditionalServiceComponent_AdditionalServiceEvent_MaxAttendant();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.AdditionalServiceComponent_AdditionalServiceEvent#getCurrentAttendants <em>Current Attendants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Attendants</em>'.
	 * @see Implementation.AdditionalServiceComponent_AdditionalServiceEvent#getCurrentAttendants()
	 * @see #getAdditionalServiceComponent_AdditionalServiceEvent()
	 * @generated
	 */
	EAttribute getAdditionalServiceComponent_AdditionalServiceEvent_CurrentAttendants();

	/**
	 * Returns the meta object for class '{@link Implementation.BookingComponent <em>Booking Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Component</em>'.
	 * @see Implementation.BookingComponent
	 * @generated
	 */
	EClass getBookingComponent();

	/**
	 * Returns the meta object for class '{@link Implementation.BookingComponent_PaymentDetails <em>Booking Component Payment Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Component Payment Details</em>'.
	 * @see Implementation.BookingComponent_PaymentDetails
	 * @generated
	 */
	EClass getBookingComponent_PaymentDetails();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.BookingComponent_PaymentDetails#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see Implementation.BookingComponent_PaymentDetails#getFirstName()
	 * @see #getBookingComponent_PaymentDetails()
	 * @generated
	 */
	EAttribute getBookingComponent_PaymentDetails_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.BookingComponent_PaymentDetails#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see Implementation.BookingComponent_PaymentDetails#getLastName()
	 * @see #getBookingComponent_PaymentDetails()
	 * @generated
	 */
	EAttribute getBookingComponent_PaymentDetails_LastName();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.BookingComponent_PaymentDetails#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see Implementation.BookingComponent_PaymentDetails#getAddress()
	 * @see #getBookingComponent_PaymentDetails()
	 * @generated
	 */
	EAttribute getBookingComponent_PaymentDetails_Address();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.BookingComponent_PaymentDetails#getCcNumber <em>Cc Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc Number</em>'.
	 * @see Implementation.BookingComponent_PaymentDetails#getCcNumber()
	 * @see #getBookingComponent_PaymentDetails()
	 * @generated
	 */
	EAttribute getBookingComponent_PaymentDetails_CcNumber();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.BookingComponent_PaymentDetails#getCcv <em>Ccv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ccv</em>'.
	 * @see Implementation.BookingComponent_PaymentDetails#getCcv()
	 * @see #getBookingComponent_PaymentDetails()
	 * @generated
	 */
	EAttribute getBookingComponent_PaymentDetails_Ccv();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.BookingComponent_PaymentDetails#getExpiryMonth <em>Expiry Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiry Month</em>'.
	 * @see Implementation.BookingComponent_PaymentDetails#getExpiryMonth()
	 * @see #getBookingComponent_PaymentDetails()
	 * @generated
	 */
	EAttribute getBookingComponent_PaymentDetails_ExpiryMonth();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.BookingComponent_PaymentDetails#getExpiryYear <em>Expiry Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiry Year</em>'.
	 * @see Implementation.BookingComponent_PaymentDetails#getExpiryYear()
	 * @see #getBookingComponent_PaymentDetails()
	 * @generated
	 */
	EAttribute getBookingComponent_PaymentDetails_ExpiryYear();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.BookingComponent_PaymentDetails#getSsn <em>Ssn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssn</em>'.
	 * @see Implementation.BookingComponent_PaymentDetails#getSsn()
	 * @see #getBookingComponent_PaymentDetails()
	 * @generated
	 */
	EAttribute getBookingComponent_PaymentDetails_Ssn();

	/**
	 * Returns the meta object for class '{@link Implementation.BookingComponent_Booking <em>Booking Component Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Component Booking</em>'.
	 * @see Implementation.BookingComponent_Booking
	 * @generated
	 */
	EClass getBookingComponent_Booking();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.BookingComponent_Booking#getArrivalDate <em>Arrival Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arrival Date</em>'.
	 * @see Implementation.BookingComponent_Booking#getArrivalDate()
	 * @see #getBookingComponent_Booking()
	 * @generated
	 */
	EAttribute getBookingComponent_Booking_ArrivalDate();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.BookingComponent_Booking#getDepartureDate <em>Departure Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Departure Date</em>'.
	 * @see Implementation.BookingComponent_Booking#getDepartureDate()
	 * @see #getBookingComponent_Booking()
	 * @generated
	 */
	EAttribute getBookingComponent_Booking_DepartureDate();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.BookingComponent_Booking#getBookingReference <em>Booking Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking Reference</em>'.
	 * @see Implementation.BookingComponent_Booking#getBookingReference()
	 * @see #getBookingComponent_Booking()
	 * @generated
	 */
	EAttribute getBookingComponent_Booking_BookingReference();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.BookingComponent_Booking#getCurrentCost <em>Current Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Cost</em>'.
	 * @see Implementation.BookingComponent_Booking#getCurrentCost()
	 * @see #getBookingComponent_Booking()
	 * @generated
	 */
	EAttribute getBookingComponent_Booking_CurrentCost();

	/**
	 * Returns the meta object for the reference list '{@link Implementation.BookingComponent_Booking#getAdditionalServices <em>Additional Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Additional Services</em>'.
	 * @see Implementation.BookingComponent_Booking#getAdditionalServices()
	 * @see #getBookingComponent_Booking()
	 * @generated
	 */
	EReference getBookingComponent_Booking_AdditionalServices();

	/**
	 * Returns the meta object for the reference list '{@link Implementation.BookingComponent_Booking#getGuests <em>Guests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Guests</em>'.
	 * @see Implementation.BookingComponent_Booking#getGuests()
	 * @see #getBookingComponent_Booking()
	 * @generated
	 */
	EReference getBookingComponent_Booking_Guests();

	/**
	 * Returns the meta object for the reference '{@link Implementation.BookingComponent_Booking#getPaymentDetails <em>Payment Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment Details</em>'.
	 * @see Implementation.BookingComponent_Booking#getPaymentDetails()
	 * @see #getBookingComponent_Booking()
	 * @generated
	 */
	EReference getBookingComponent_Booking_PaymentDetails();

	/**
	 * Returns the meta object for the reference list '{@link Implementation.BookingComponent_Booking#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rooms</em>'.
	 * @see Implementation.BookingComponent_Booking#getRooms()
	 * @see #getBookingComponent_Booking()
	 * @generated
	 */
	EReference getBookingComponent_Booking_Rooms();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.BookingComponent_Booking#isPaid <em>Is Paid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Paid</em>'.
	 * @see Implementation.BookingComponent_Booking#isPaid()
	 * @see #getBookingComponent_Booking()
	 * @generated
	 */
	EAttribute getBookingComponent_Booking_IsPaid();

	/**
	 * Returns the meta object for the '{@link Implementation.BookingComponent_Booking#addAdditionalServiceToBooking(java.lang.String, int) <em>Add Additional Service To Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Additional Service To Booking</em>' operation.
	 * @see Implementation.BookingComponent_Booking#addAdditionalServiceToBooking(java.lang.String, int)
	 * @generated
	 */
	EOperation getBookingComponent_Booking__AddAdditionalServiceToBooking__String_int();

	/**
	 * Returns the meta object for the '{@link Implementation.BookingComponent_Booking#addRoomToBooking(java.lang.String, int) <em>Add Room To Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room To Booking</em>' operation.
	 * @see Implementation.BookingComponent_Booking#addRoomToBooking(java.lang.String, int)
	 * @generated
	 */
	EOperation getBookingComponent_Booking__AddRoomToBooking__String_int();

	/**
	 * Returns the meta object for the '{@link Implementation.BookingComponent_Booking#removeRoomFromBooking(java.lang.String) <em>Remove Room From Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room From Booking</em>' operation.
	 * @see Implementation.BookingComponent_Booking#removeRoomFromBooking(java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_Booking__RemoveRoomFromBooking__String();

	/**
	 * Returns the meta object for the '{@link Implementation.BookingComponent_Booking#updateBooking(java.util.Date, java.util.Date) <em>Update Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Booking</em>' operation.
	 * @see Implementation.BookingComponent_Booking#updateBooking(java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getBookingComponent_Booking__UpdateBooking__Date_Date();

	/**
	 * Returns the meta object for the '{@link Implementation.BookingComponent_Booking#removeAdditionalServiceFromBooking(java.lang.String) <em>Remove Additional Service From Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Additional Service From Booking</em>' operation.
	 * @see Implementation.BookingComponent_Booking#removeAdditionalServiceFromBooking(java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_Booking__RemoveAdditionalServiceFromBooking__String();

	/**
	 * Returns the meta object for the '{@link Implementation.BookingComponent_Booking#currentCost() <em>Current Cost</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Current Cost</em>' operation.
	 * @see Implementation.BookingComponent_Booking#currentCost()
	 * @generated
	 */
	EOperation getBookingComponent_Booking__CurrentCost();

	/**
	 * Returns the meta object for the '{@link Implementation.BookingComponent_Booking#updatePaymentDetails(Implementation.BookingComponent_PaymentDetails) <em>Update Payment Details</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Payment Details</em>' operation.
	 * @see Implementation.BookingComponent_Booking#updatePaymentDetails(Implementation.BookingComponent_PaymentDetails)
	 * @generated
	 */
	EOperation getBookingComponent_Booking__UpdatePaymentDetails__BookingComponent_PaymentDetails();

	/**
	 * Returns the meta object for the '{@link Implementation.BookingComponent_Booking#generateReferenceNumber() <em>Generate Reference Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Reference Number</em>' operation.
	 * @see Implementation.BookingComponent_Booking#generateReferenceNumber()
	 * @generated
	 */
	EOperation getBookingComponent_Booking__GenerateReferenceNumber();

	/**
	 * Returns the meta object for the '{@link Implementation.BookingComponent_Booking#addGuestToBooking(java.lang.String, java.lang.String, java.lang.String) <em>Add Guest To Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Guest To Booking</em>' operation.
	 * @see Implementation.BookingComponent_Booking#addGuestToBooking(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_Booking__AddGuestToBooking__String_String_String();

	/**
	 * Returns the meta object for the '{@link Implementation.BookingComponent_Booking#removeGuestFromBooking(java.lang.String, java.lang.String, java.lang.String) <em>Remove Guest From Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Guest From Booking</em>' operation.
	 * @see Implementation.BookingComponent_Booking#removeGuestFromBooking(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_Booking__RemoveGuestFromBooking__String_String_String();

	/**
	 * Returns the meta object for the '{@link Implementation.BookingComponent_Booking#getGuestsInBooking() <em>Get Guests In Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Guests In Booking</em>' operation.
	 * @see Implementation.BookingComponent_Booking#getGuestsInBooking()
	 * @generated
	 */
	EOperation getBookingComponent_Booking__GetGuestsInBooking();

	/**
	 * Returns the meta object for the '{@link Implementation.BookingComponent_Booking#getRoomTypesInBooking() <em>Get Room Types In Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Types In Booking</em>' operation.
	 * @see Implementation.BookingComponent_Booking#getRoomTypesInBooking()
	 * @generated
	 */
	EOperation getBookingComponent_Booking__GetRoomTypesInBooking();

	/**
	 * Returns the meta object for class '{@link Implementation.BookingComponent_AdditionalService <em>Booking Component Additional Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Component Additional Service</em>'.
	 * @see Implementation.BookingComponent_AdditionalService
	 * @generated
	 */
	EClass getBookingComponent_AdditionalService();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.BookingComponent_AdditionalService#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Implementation.BookingComponent_AdditionalService#getName()
	 * @see #getBookingComponent_AdditionalService()
	 * @generated
	 */
	EAttribute getBookingComponent_AdditionalService_Name();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.BookingComponent_AdditionalService#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see Implementation.BookingComponent_AdditionalService#getCost()
	 * @see #getBookingComponent_AdditionalService()
	 * @generated
	 */
	EAttribute getBookingComponent_AdditionalService_Cost();

	/**
	 * Returns the meta object for class '{@link Implementation.BookingComponent_BookingGuest <em>Booking Component Booking Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Component Booking Guest</em>'.
	 * @see Implementation.BookingComponent_BookingGuest
	 * @generated
	 */
	EClass getBookingComponent_BookingGuest();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.BookingComponent_BookingGuest#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see Implementation.BookingComponent_BookingGuest#getFirstName()
	 * @see #getBookingComponent_BookingGuest()
	 * @generated
	 */
	EAttribute getBookingComponent_BookingGuest_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.BookingComponent_BookingGuest#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see Implementation.BookingComponent_BookingGuest#getLastName()
	 * @see #getBookingComponent_BookingGuest()
	 * @generated
	 */
	EAttribute getBookingComponent_BookingGuest_LastName();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.BookingComponent_BookingGuest#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see Implementation.BookingComponent_BookingGuest#getAddress()
	 * @see #getBookingComponent_BookingGuest()
	 * @generated
	 */
	EAttribute getBookingComponent_BookingGuest_Address();

	/**
	 * Returns the meta object for class '{@link Implementation.BookingComponent_RoomType <em>Booking Component Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Component Room Type</em>'.
	 * @see Implementation.BookingComponent_RoomType
	 * @generated
	 */
	EClass getBookingComponent_RoomType();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.BookingComponent_RoomType#getRoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Type</em>'.
	 * @see Implementation.BookingComponent_RoomType#getRoomType()
	 * @see #getBookingComponent_RoomType()
	 * @generated
	 */
	EAttribute getBookingComponent_RoomType_RoomType();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.BookingComponent_RoomType#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see Implementation.BookingComponent_RoomType#getCost()
	 * @see #getBookingComponent_RoomType()
	 * @generated
	 */
	EAttribute getBookingComponent_RoomType_Cost();

	/**
	 * Returns the meta object for class '{@link Implementation.BookingComponent_BookingHandler <em>Booking Component Booking Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Component Booking Handler</em>'.
	 * @see Implementation.BookingComponent_BookingHandler
	 * @generated
	 */
	EClass getBookingComponent_BookingHandler();

	/**
	 * Returns the meta object for the reference list '{@link Implementation.BookingComponent_BookingHandler#getBookings <em>Bookings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bookings</em>'.
	 * @see Implementation.BookingComponent_BookingHandler#getBookings()
	 * @see #getBookingComponent_BookingHandler()
	 * @generated
	 */
	EReference getBookingComponent_BookingHandler_Bookings();

	/**
	 * Returns the meta object for the reference '{@link Implementation.BookingComponent_BookingHandler#getAuthentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Authentication</em>'.
	 * @see Implementation.BookingComponent_BookingHandler#getAuthentication()
	 * @see #getBookingComponent_BookingHandler()
	 * @generated
	 */
	EReference getBookingComponent_BookingHandler_Authentication();

	/**
	 * Returns the meta object for the reference '{@link Implementation.BookingComponent_BookingHandler#getIRoomInformation <em>IRoom Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>IRoom Information</em>'.
	 * @see Implementation.BookingComponent_BookingHandler#getIRoomInformation()
	 * @see #getBookingComponent_BookingHandler()
	 * @generated
	 */
	EReference getBookingComponent_BookingHandler_IRoomInformation();

	/**
	 * Returns the meta object for the reference '{@link Implementation.BookingComponent_BookingHandler#getIAdditionalServiceInformation <em>IAdditional Service Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>IAdditional Service Information</em>'.
	 * @see Implementation.BookingComponent_BookingHandler#getIAdditionalServiceInformation()
	 * @see #getBookingComponent_BookingHandler()
	 * @generated
	 */
	EReference getBookingComponent_BookingHandler_IAdditionalServiceInformation();

	/**
	 * Returns the meta object for the reference '{@link Implementation.BookingComponent_BookingHandler#getIPayment <em>IPayment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>IPayment</em>'.
	 * @see Implementation.BookingComponent_BookingHandler#getIPayment()
	 * @see #getBookingComponent_BookingHandler()
	 * @generated
	 */
	EReference getBookingComponent_BookingHandler_IPayment();

	/**
	 * Returns the meta object for the '{@link Implementation.BookingComponent_BookingHandler#findBooking(java.lang.String) <em>Find Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Booking</em>' operation.
	 * @see Implementation.BookingComponent_BookingHandler#findBooking(java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_BookingHandler__FindBooking__String();

	/**
	 * Returns the meta object for the '{@link Implementation.BookingComponent_BookingHandler#bookingAvailable(java.util.Date, java.util.Date) <em>Booking Available</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Booking Available</em>' operation.
	 * @see Implementation.BookingComponent_BookingHandler#bookingAvailable(java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getBookingComponent_BookingHandler__BookingAvailable__Date_Date();

	/**
	 * Returns the meta object for the '{@link Implementation.BookingComponent_BookingHandler#findBookingsByDateAndType(java.util.Date, java.util.Date, java.lang.String) <em>Find Bookings By Date And Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Bookings By Date And Type</em>' operation.
	 * @see Implementation.BookingComponent_BookingHandler#findBookingsByDateAndType(java.util.Date, java.util.Date, java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_BookingHandler__FindBookingsByDateAndType__Date_Date_String();

	/**
	 * Returns the meta object for the '{@link Implementation.BookingComponent_BookingHandler#findBookingsByDate(java.util.Date, java.util.Date) <em>Find Bookings By Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Bookings By Date</em>' operation.
	 * @see Implementation.BookingComponent_BookingHandler#findBookingsByDate(java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getBookingComponent_BookingHandler__FindBookingsByDate__Date_Date();

	/**
	 * Returns the meta object for class '{@link Implementation.BookingComponent_IBookingAdministration <em>Booking Component IBooking Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Component IBooking Administration</em>'.
	 * @see Implementation.BookingComponent_IBookingAdministration
	 * @generated
	 */
	EClass getBookingComponent_IBookingAdministration();

	/**
	 * Returns the meta object for the '{@link Implementation.BookingComponent_IBookingAdministration#makeBooking(java.util.Date, java.util.Date, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Make Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Booking</em>' operation.
	 * @see Implementation.BookingComponent_IBookingAdministration#makeBooking(java.util.Date, java.util.Date, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_IBookingAdministration__MakeBooking__Date_Date_String_String_String_String_String_String_String_String();

	/**
	 * Returns the meta object for the '{@link Implementation.BookingComponent_IBookingAdministration#addRoom(java.lang.String, java.lang.String, int) <em>Add Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room</em>' operation.
	 * @see Implementation.BookingComponent_IBookingAdministration#addRoom(java.lang.String, java.lang.String, int)
	 * @generated
	 */
	EOperation getBookingComponent_IBookingAdministration__AddRoom__String_String_int();

	/**
	 * Returns the meta object for the '{@link Implementation.BookingComponent_IBookingAdministration#requestQuote(java.lang.String, int, java.util.Date, java.util.Date) <em>Request Quote</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Request Quote</em>' operation.
	 * @see Implementation.BookingComponent_IBookingAdministration#requestQuote(java.lang.String, int, java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getBookingComponent_IBookingAdministration__RequestQuote__String_int_Date_Date();

	/**
	 * Returns the meta object for the '{@link Implementation.BookingComponent_IBookingAdministration#editBooking(java.lang.String, java.util.Date, java.util.Date) <em>Edit Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Booking</em>' operation.
	 * @see Implementation.BookingComponent_IBookingAdministration#editBooking(java.lang.String, java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getBookingComponent_IBookingAdministration__EditBooking__String_Date_Date();

	/**
	 * Returns the meta object for the '{@link Implementation.BookingComponent_IBookingAdministration#cancelBooking(java.lang.String) <em>Cancel Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel Booking</em>' operation.
	 * @see Implementation.BookingComponent_IBookingAdministration#cancelBooking(java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_IBookingAdministration__CancelBooking__String();

	/**
	 * Returns the meta object for the '{@link Implementation.BookingComponent_IBookingAdministration#addAdditionalService(java.lang.String, java.lang.String, int) <em>Add Additional Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Additional Service</em>' operation.
	 * @see Implementation.BookingComponent_IBookingAdministration#addAdditionalService(java.lang.String, java.lang.String, int)
	 * @generated
	 */
	EOperation getBookingComponent_IBookingAdministration__AddAdditionalService__String_String_int();

	/**
	 * Returns the meta object for the '{@link Implementation.BookingComponent_IBookingAdministration#removeRoom(java.lang.String, java.lang.String) <em>Remove Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room</em>' operation.
	 * @see Implementation.BookingComponent_IBookingAdministration#removeRoom(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_IBookingAdministration__RemoveRoom__String_String();

	/**
	 * Returns the meta object for the '{@link Implementation.BookingComponent_IBookingAdministration#removeAdditionalService(java.lang.String, java.lang.String) <em>Remove Additional Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Additional Service</em>' operation.
	 * @see Implementation.BookingComponent_IBookingAdministration#removeAdditionalService(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_IBookingAdministration__RemoveAdditionalService__String_String();

	/**
	 * Returns the meta object for the '{@link Implementation.BookingComponent_IBookingAdministration#generateQuote(java.util.Date, java.util.Date, java.lang.String) <em>Generate Quote</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Quote</em>' operation.
	 * @see Implementation.BookingComponent_IBookingAdministration#generateQuote(java.util.Date, java.util.Date, java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_IBookingAdministration__GenerateQuote__Date_Date_String();

	/**
	 * Returns the meta object for the '{@link Implementation.BookingComponent_IBookingAdministration#addGuestToBooking(java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Add Guest To Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Guest To Booking</em>' operation.
	 * @see Implementation.BookingComponent_IBookingAdministration#addGuestToBooking(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_IBookingAdministration__AddGuestToBooking__String_String_String_String();

	/**
	 * Returns the meta object for the '{@link Implementation.BookingComponent_IBookingAdministration#removeGuest(java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Remove Guest</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Guest</em>' operation.
	 * @see Implementation.BookingComponent_IBookingAdministration#removeGuest(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_IBookingAdministration__RemoveGuest__String_String_String_String();

	/**
	 * Returns the meta object for class '{@link Implementation.StaffComponent <em>Staff Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff Component</em>'.
	 * @see Implementation.StaffComponent
	 * @generated
	 */
	EClass getStaffComponent();

	/**
	 * Returns the meta object for class '{@link Implementation.StaffComponent_AccountManager <em>Staff Component Account Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff Component Account Manager</em>'.
	 * @see Implementation.StaffComponent_AccountManager
	 * @generated
	 */
	EClass getStaffComponent_AccountManager();

	/**
	 * Returns the meta object for the reference '{@link Implementation.StaffComponent_AccountManager#getIAuthentication <em>IAuthentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>IAuthentication</em>'.
	 * @see Implementation.StaffComponent_AccountManager#getIAuthentication()
	 * @see #getStaffComponent_AccountManager()
	 * @generated
	 */
	EReference getStaffComponent_AccountManager_IAuthentication();

	/**
	 * Returns the meta object for the reference list '{@link Implementation.StaffComponent_AccountManager#getLoggedIn <em>Logged In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Logged In</em>'.
	 * @see Implementation.StaffComponent_AccountManager#getLoggedIn()
	 * @see #getStaffComponent_AccountManager()
	 * @generated
	 */
	EReference getStaffComponent_AccountManager_LoggedIn();

	/**
	 * Returns the meta object for the reference list '{@link Implementation.StaffComponent_AccountManager#getEmployees <em>Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Employees</em>'.
	 * @see Implementation.StaffComponent_AccountManager#getEmployees()
	 * @see #getStaffComponent_AccountManager()
	 * @generated
	 */
	EReference getStaffComponent_AccountManager_Employees();

	/**
	 * Returns the meta object for the '{@link Implementation.StaffComponent_AccountManager#findAccount(java.lang.String) <em>Find Account</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Account</em>' operation.
	 * @see Implementation.StaffComponent_AccountManager#findAccount(java.lang.String)
	 * @generated
	 */
	EOperation getStaffComponent_AccountManager__FindAccount__String();

	/**
	 * Returns the meta object for class '{@link Implementation.StaffComponent_IAccountAdministration <em>Staff Component IAccount Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff Component IAccount Administration</em>'.
	 * @see Implementation.StaffComponent_IAccountAdministration
	 * @generated
	 */
	EClass getStaffComponent_IAccountAdministration();

	/**
	 * Returns the meta object for the '{@link Implementation.StaffComponent_IAccountAdministration#createAccount(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Create Account</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Account</em>' operation.
	 * @see Implementation.StaffComponent_IAccountAdministration#createAccount(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getStaffComponent_IAccountAdministration__CreateAccount__String_String_String_String_String();

	/**
	 * Returns the meta object for the '{@link Implementation.StaffComponent_IAccountAdministration#editAccountDetails(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Edit Account Details</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Account Details</em>' operation.
	 * @see Implementation.StaffComponent_IAccountAdministration#editAccountDetails(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getStaffComponent_IAccountAdministration__EditAccountDetails__String_String_String_String_String();

	/**
	 * Returns the meta object for the '{@link Implementation.StaffComponent_IAccountAdministration#removeAccount(java.lang.String) <em>Remove Account</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Account</em>' operation.
	 * @see Implementation.StaffComponent_IAccountAdministration#removeAccount(java.lang.String)
	 * @generated
	 */
	EOperation getStaffComponent_IAccountAdministration__RemoveAccount__String();

	/**
	 * Returns the meta object for class '{@link Implementation.StaffComponent_Employee <em>Staff Component Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff Component Employee</em>'.
	 * @see Implementation.StaffComponent_Employee
	 * @generated
	 */
	EClass getStaffComponent_Employee();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.StaffComponent_Employee#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Implementation.StaffComponent_Employee#getId()
	 * @see #getStaffComponent_Employee()
	 * @generated
	 */
	EAttribute getStaffComponent_Employee_Id();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.StaffComponent_Employee#getSsn <em>Ssn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssn</em>'.
	 * @see Implementation.StaffComponent_Employee#getSsn()
	 * @see #getStaffComponent_Employee()
	 * @generated
	 */
	EAttribute getStaffComponent_Employee_Ssn();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.StaffComponent_Employee#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Implementation.StaffComponent_Employee#getName()
	 * @see #getStaffComponent_Employee()
	 * @generated
	 */
	EAttribute getStaffComponent_Employee_Name();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.StaffComponent_Employee#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see Implementation.StaffComponent_Employee#getEmail()
	 * @see #getStaffComponent_Employee()
	 * @generated
	 */
	EAttribute getStaffComponent_Employee_Email();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.StaffComponent_Employee#getPhone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone</em>'.
	 * @see Implementation.StaffComponent_Employee#getPhone()
	 * @see #getStaffComponent_Employee()
	 * @generated
	 */
	EAttribute getStaffComponent_Employee_Phone();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.StaffComponent_Employee#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see Implementation.StaffComponent_Employee#getPassword()
	 * @see #getStaffComponent_Employee()
	 * @generated
	 */
	EAttribute getStaffComponent_Employee_Password();

	/**
	 * Returns the meta object for the '{@link Implementation.StaffComponent_Employee#getEmployeeInfo() <em>Get Employee Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Employee Info</em>' operation.
	 * @see Implementation.StaffComponent_Employee#getEmployeeInfo()
	 * @generated
	 */
	EOperation getStaffComponent_Employee__GetEmployeeInfo();

	/**
	 * Returns the meta object for class '{@link Implementation.RoomComponent <em>Room Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Component</em>'.
	 * @see Implementation.RoomComponent
	 * @generated
	 */
	EClass getRoomComponent();

	/**
	 * Returns the meta object for class '{@link Implementation.RoomComponent_Room <em>Room Component Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Component Room</em>'.
	 * @see Implementation.RoomComponent_Room
	 * @generated
	 */
	EClass getRoomComponent_Room();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.RoomComponent_Room#getRoomNumber <em>Room Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Number</em>'.
	 * @see Implementation.RoomComponent_Room#getRoomNumber()
	 * @see #getRoomComponent_Room()
	 * @generated
	 */
	EAttribute getRoomComponent_Room_RoomNumber();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.RoomComponent_Room#isUsable <em>Usable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usable</em>'.
	 * @see Implementation.RoomComponent_Room#isUsable()
	 * @see #getRoomComponent_Room()
	 * @generated
	 */
	EAttribute getRoomComponent_Room_Usable();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.RoomComponent_Room#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see Implementation.RoomComponent_Room#getPrice()
	 * @see #getRoomComponent_Room()
	 * @generated
	 */
	EAttribute getRoomComponent_Room_Price();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.RoomComponent_Room#getRoomTypeName <em>Room Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Type Name</em>'.
	 * @see Implementation.RoomComponent_Room#getRoomTypeName()
	 * @see #getRoomComponent_Room()
	 * @generated
	 */
	EAttribute getRoomComponent_Room_RoomTypeName();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.RoomComponent_Room#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Implementation.RoomComponent_Room#getDescription()
	 * @see #getRoomComponent_Room()
	 * @generated
	 */
	EAttribute getRoomComponent_Room_Description();

	/**
	 * Returns the meta object for class '{@link Implementation.RoomComponent_Bedroom <em>Room Component Bedroom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Component Bedroom</em>'.
	 * @see Implementation.RoomComponent_Bedroom
	 * @generated
	 */
	EClass getRoomComponent_Bedroom();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.RoomComponent_Bedroom#getBedCount <em>Bed Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bed Count</em>'.
	 * @see Implementation.RoomComponent_Bedroom#getBedCount()
	 * @see #getRoomComponent_Bedroom()
	 * @generated
	 */
	EAttribute getRoomComponent_Bedroom_BedCount();

	/**
	 * Returns the meta object for the '{@link Implementation.RoomComponent_Bedroom#createBedroom(int, boolean, int, java.lang.String, java.lang.String, int) <em>Create Bedroom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Bedroom</em>' operation.
	 * @see Implementation.RoomComponent_Bedroom#createBedroom(int, boolean, int, java.lang.String, java.lang.String, int)
	 * @generated
	 */
	EOperation getRoomComponent_Bedroom__CreateBedroom__int_boolean_int_String_String_int();

	/**
	 * Returns the meta object for the '{@link Implementation.RoomComponent_Bedroom#editRoom(int, boolean, int, java.lang.String, java.lang.String, int) <em>Edit Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Room</em>' operation.
	 * @see Implementation.RoomComponent_Bedroom#editRoom(int, boolean, int, java.lang.String, java.lang.String, int)
	 * @generated
	 */
	EOperation getRoomComponent_Bedroom__EditRoom__int_boolean_int_String_String_int();

	/**
	 * Returns the meta object for class '{@link Implementation.RoomComponent_ConferenceRoom <em>Room Component Conference Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Component Conference Room</em>'.
	 * @see Implementation.RoomComponent_ConferenceRoom
	 * @generated
	 */
	EClass getRoomComponent_ConferenceRoom();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.RoomComponent_ConferenceRoom#getNumberOfSeats <em>Number Of Seats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Seats</em>'.
	 * @see Implementation.RoomComponent_ConferenceRoom#getNumberOfSeats()
	 * @see #getRoomComponent_ConferenceRoom()
	 * @generated
	 */
	EAttribute getRoomComponent_ConferenceRoom_NumberOfSeats();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.RoomComponent_ConferenceRoom#isProjector <em>Projector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Projector</em>'.
	 * @see Implementation.RoomComponent_ConferenceRoom#isProjector()
	 * @see #getRoomComponent_ConferenceRoom()
	 * @generated
	 */
	EAttribute getRoomComponent_ConferenceRoom_Projector();

	/**
	 * Returns the meta object for the attribute '{@link Implementation.RoomComponent_ConferenceRoom#isConferencePhone <em>Conference Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conference Phone</em>'.
	 * @see Implementation.RoomComponent_ConferenceRoom#isConferencePhone()
	 * @see #getRoomComponent_ConferenceRoom()
	 * @generated
	 */
	EAttribute getRoomComponent_ConferenceRoom_ConferencePhone();

	/**
	 * Returns the meta object for the '{@link Implementation.RoomComponent_ConferenceRoom#createConferenceRoom(int, boolean, int, java.lang.String, java.lang.String, int, boolean, boolean) <em>Create Conference Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Conference Room</em>' operation.
	 * @see Implementation.RoomComponent_ConferenceRoom#createConferenceRoom(int, boolean, int, java.lang.String, java.lang.String, int, boolean, boolean)
	 * @generated
	 */
	EOperation getRoomComponent_ConferenceRoom__CreateConferenceRoom__int_boolean_int_String_String_int_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link Implementation.RoomComponent_ConferenceRoom#editRoom(int, boolean, int, java.lang.String, java.lang.String, int, boolean, boolean) <em>Edit Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Room</em>' operation.
	 * @see Implementation.RoomComponent_ConferenceRoom#editRoom(int, boolean, int, java.lang.String, java.lang.String, int, boolean, boolean)
	 * @generated
	 */
	EOperation getRoomComponent_ConferenceRoom__EditRoom__int_boolean_int_String_String_int_boolean_boolean();

	/**
	 * Returns the meta object for class '{@link Implementation.RoomComponent_IRoomAdministration <em>Room Component IRoom Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Component IRoom Administration</em>'.
	 * @see Implementation.RoomComponent_IRoomAdministration
	 * @generated
	 */
	EClass getRoomComponent_IRoomAdministration();

	/**
	 * Returns the meta object for the '{@link Implementation.RoomComponent_IRoomAdministration#createBedRoom(int, boolean, int, java.lang.String, java.lang.String, int) <em>Create Bed Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Bed Room</em>' operation.
	 * @see Implementation.RoomComponent_IRoomAdministration#createBedRoom(int, boolean, int, java.lang.String, java.lang.String, int)
	 * @generated
	 */
	EOperation getRoomComponent_IRoomAdministration__CreateBedRoom__int_boolean_int_String_String_int();

	/**
	 * Returns the meta object for the '{@link Implementation.RoomComponent_IRoomAdministration#editBedRoom(int, int, boolean, int, java.lang.String, java.lang.String, int) <em>Edit Bed Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Bed Room</em>' operation.
	 * @see Implementation.RoomComponent_IRoomAdministration#editBedRoom(int, int, boolean, int, java.lang.String, java.lang.String, int)
	 * @generated
	 */
	EOperation getRoomComponent_IRoomAdministration__EditBedRoom__int_int_boolean_int_String_String_int();

	/**
	 * Returns the meta object for the '{@link Implementation.RoomComponent_IRoomAdministration#remove(int) <em>Remove</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove</em>' operation.
	 * @see Implementation.RoomComponent_IRoomAdministration#remove(int)
	 * @generated
	 */
	EOperation getRoomComponent_IRoomAdministration__Remove__int();

	/**
	 * Returns the meta object for the '{@link Implementation.RoomComponent_IRoomAdministration#createConferenceRoom(int, boolean, int, java.lang.String, java.lang.String, int, boolean, boolean) <em>Create Conference Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Conference Room</em>' operation.
	 * @see Implementation.RoomComponent_IRoomAdministration#createConferenceRoom(int, boolean, int, java.lang.String, java.lang.String, int, boolean, boolean)
	 * @generated
	 */
	EOperation getRoomComponent_IRoomAdministration__CreateConferenceRoom__int_boolean_int_String_String_int_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link Implementation.RoomComponent_IRoomAdministration#editConferenceRoom(int, int, boolean, int, java.lang.String, java.lang.String, int, boolean, boolean) <em>Edit Conference Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Conference Room</em>' operation.
	 * @see Implementation.RoomComponent_IRoomAdministration#editConferenceRoom(int, int, boolean, int, java.lang.String, java.lang.String, int, boolean, boolean)
	 * @generated
	 */
	EOperation getRoomComponent_IRoomAdministration__EditConferenceRoom__int_int_boolean_int_String_String_int_boolean_boolean();

	/**
	 * Returns the meta object for class '{@link Implementation.RoomComponent_RoomHandler <em>Room Component Room Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Component Room Handler</em>'.
	 * @see Implementation.RoomComponent_RoomHandler
	 * @generated
	 */
	EClass getRoomComponent_RoomHandler();

	/**
	 * Returns the meta object for the reference '{@link Implementation.RoomComponent_RoomHandler#getAuthenticator <em>Authenticator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Authenticator</em>'.
	 * @see Implementation.RoomComponent_RoomHandler#getAuthenticator()
	 * @see #getRoomComponent_RoomHandler()
	 * @generated
	 */
	EReference getRoomComponent_RoomHandler_Authenticator();

	/**
	 * Returns the meta object for the reference list '{@link Implementation.RoomComponent_RoomHandler#getBedRooms <em>Bed Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bed Rooms</em>'.
	 * @see Implementation.RoomComponent_RoomHandler#getBedRooms()
	 * @see #getRoomComponent_RoomHandler()
	 * @generated
	 */
	EReference getRoomComponent_RoomHandler_BedRooms();

	/**
	 * Returns the meta object for the reference list '{@link Implementation.RoomComponent_RoomHandler#getConferenceRooms <em>Conference Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conference Rooms</em>'.
	 * @see Implementation.RoomComponent_RoomHandler#getConferenceRooms()
	 * @see #getRoomComponent_RoomHandler()
	 * @generated
	 */
	EReference getRoomComponent_RoomHandler_ConferenceRooms();

	/**
	 * Returns the meta object for class '{@link Implementation.Bank <em>Bank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bank</em>'.
	 * @see Implementation.Bank
	 * @generated
	 */
	EClass getBank();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ImplementationFactory getImplementationFactory();

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
		 * The meta object literal for the '{@link Implementation.impl.DecisionSupportComponentImpl <em>Decision Support Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.impl.DecisionSupportComponentImpl
		 * @see Implementation.impl.ImplementationPackageImpl#getDecisionSupportComponent()
		 * @generated
		 */
		EClass DECISION_SUPPORT_COMPONENT = eINSTANCE.getDecisionSupportComponent();

		/**
		 * The meta object literal for the '{@link Implementation.DecisionSupportComponent_IDecisionSupport <em>Decision Support Component IDecision Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.DecisionSupportComponent_IDecisionSupport
		 * @see Implementation.impl.ImplementationPackageImpl#getDecisionSupportComponent_IDecisionSupport()
		 * @generated
		 */
		EClass DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT = eINSTANCE.getDecisionSupportComponent_IDecisionSupport();

		/**
		 * The meta object literal for the '<em><b>Get DSS Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT___GET_DSS_DATA = eINSTANCE.getDecisionSupportComponent_IDecisionSupport__GetDSSData();

		/**
		 * The meta object literal for the '<em><b>Get All Room Type Frequency</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT___GET_ALL_ROOM_TYPE_FREQUENCY = eINSTANCE.getDecisionSupportComponent_IDecisionSupport__GetAllRoomTypeFrequency();

		/**
		 * The meta object literal for the '<em><b>Get Room Type Frequency</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT___GET_ROOM_TYPE_FREQUENCY__STRING = eINSTANCE.getDecisionSupportComponent_IDecisionSupport__GetRoomTypeFrequency__String();

		/**
		 * The meta object literal for the '<em><b>Count Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT___COUNT_ROOM_TYPE__ELIST_STRING = eINSTANCE.getDecisionSupportComponent_IDecisionSupport__CountRoomType__EList_String();

		/**
		 * The meta object literal for the '<em><b>Get All Customer Booking Frequency</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT___GET_ALL_CUSTOMER_BOOKING_FREQUENCY = eINSTANCE.getDecisionSupportComponent_IDecisionSupport__GetAllCustomerBookingFrequency();

		/**
		 * The meta object literal for the '<em><b>Get Customer Booking Frequency</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT___GET_CUSTOMER_BOOKING_FREQUENCY__STRING = eINSTANCE.getDecisionSupportComponent_IDecisionSupport__GetCustomerBookingFrequency__String();

		/**
		 * The meta object literal for the '<em><b>Get DSS Occupancy Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT___GET_DSS_OCCUPANCY_INFO = eINSTANCE.getDecisionSupportComponent_IDecisionSupport__GetDSSOccupancyInfo();

		/**
		 * The meta object literal for the '<em><b>Get Number Of Occupancies Of Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT___GET_NUMBER_OF_OCCUPANCIES_OF_ROOM__INT = eINSTANCE.getDecisionSupportComponent_IDecisionSupport__GetNumberOfOccupanciesOfRoom__int();

		/**
		 * The meta object literal for the '{@link Implementation.impl.DecisionSupportComponent_BookingDSSInfoImpl <em>Decision Support Component Booking DSS Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.impl.DecisionSupportComponent_BookingDSSInfoImpl
		 * @see Implementation.impl.ImplementationPackageImpl#getDecisionSupportComponent_BookingDSSInfo()
		 * @generated
		 */
		EClass DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO = eINSTANCE.getDecisionSupportComponent_BookingDSSInfo();

		/**
		 * The meta object literal for the '<em><b>Number Of Guests</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__NUMBER_OF_GUESTS = eINSTANCE.getDecisionSupportComponent_BookingDSSInfo_NumberOfGuests();

		/**
		 * The meta object literal for the '<em><b>Room Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__ROOM_TYPE = eINSTANCE.getDecisionSupportComponent_BookingDSSInfo_RoomType();

		/**
		 * The meta object literal for the '<em><b>Arrival Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__ARRIVAL_DATE = eINSTANCE.getDecisionSupportComponent_BookingDSSInfo_ArrivalDate();

		/**
		 * The meta object literal for the '<em><b>Departure Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__DEPARTURE_DATE = eINSTANCE.getDecisionSupportComponent_BookingDSSInfo_DepartureDate();

		/**
		 * The meta object literal for the '<em><b>Customer SSN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__CUSTOMER_SSN = eINSTANCE.getDecisionSupportComponent_BookingDSSInfo_CustomerSSN();

		/**
		 * The meta object literal for the '<em><b>Additional Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__ADDITIONAL_SERVICES = eINSTANCE.getDecisionSupportComponent_BookingDSSInfo_AdditionalServices();

		/**
		 * The meta object literal for the '<em><b>Customer First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__CUSTOMER_FIRST_NAME = eINSTANCE.getDecisionSupportComponent_BookingDSSInfo_CustomerFirstName();

		/**
		 * The meta object literal for the '<em><b>Customer Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__CUSTOMER_LAST_NAME = eINSTANCE.getDecisionSupportComponent_BookingDSSInfo_CustomerLastName();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__ADDRESS = eINSTANCE.getDecisionSupportComponent_BookingDSSInfo_Address();

		/**
		 * The meta object literal for the '<em><b>Add Additional Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO___ADD_ADDITIONAL_SERVICE__STRING_LONG = eINSTANCE.getDecisionSupportComponent_BookingDSSInfo__AddAdditionalService__String_long();

		/**
		 * The meta object literal for the '{@link Implementation.impl.DecisionSupportComponent_DSSControllerImpl <em>Decision Support Component DSS Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.impl.DecisionSupportComponent_DSSControllerImpl
		 * @see Implementation.impl.ImplementationPackageImpl#getDecisionSupportComponent_DSSController()
		 * @generated
		 */
		EClass DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER = eINSTANCE.getDecisionSupportComponent_DSSController();

		/**
		 * The meta object literal for the '<em><b>IOccupancy Decision</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__IOCCUPANCY_DECISION = eINSTANCE.getDecisionSupportComponent_DSSController_IOccupancyDecision();

		/**
		 * The meta object literal for the '<em><b>IBooking Decision</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__IBOOKING_DECISION = eINSTANCE.getDecisionSupportComponent_DSSController_IBookingDecision();

		/**
		 * The meta object literal for the '<em><b>Occupancy DSS Info</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__OCCUPANCY_DSS_INFO = eINSTANCE.getDecisionSupportComponent_DSSController_OccupancyDSSInfo();

		/**
		 * The meta object literal for the '<em><b>Additional Service DSS Info</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__ADDITIONAL_SERVICE_DSS_INFO = eINSTANCE.getDecisionSupportComponent_DSSController_AdditionalServiceDSSInfo();

		/**
		 * The meta object literal for the '<em><b>Booking DSS Info</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__BOOKING_DSS_INFO = eINSTANCE.getDecisionSupportComponent_DSSController_BookingDSSInfo();

		/**
		 * The meta object literal for the '<em><b>Count Customer Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER___COUNT_CUSTOMER_BOOKING__ELIST_STRING = eINSTANCE.getDecisionSupportComponent_DSSController__CountCustomerBooking__EList_String();

		/**
		 * The meta object literal for the '<em><b>Get Position In List</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER___GET_POSITION_IN_LIST__ELIST_STRING = eINSTANCE.getDecisionSupportComponent_DSSController__GetPositionInList__EList_String();

		/**
		 * The meta object literal for the '{@link Implementation.OccupancyComponent_IOccupancyDecision <em>Occupancy Component IOccupancy Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.OccupancyComponent_IOccupancyDecision
		 * @see Implementation.impl.ImplementationPackageImpl#getOccupancyComponent_IOccupancyDecision()
		 * @generated
		 */
		EClass OCCUPANCY_COMPONENT_IOCCUPANCY_DECISION = eINSTANCE.getOccupancyComponent_IOccupancyDecision();

		/**
		 * The meta object literal for the '<em><b>Get DSS Occupancy Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OCCUPANCY_COMPONENT_IOCCUPANCY_DECISION___GET_DSS_OCCUPANCY_INFO = eINSTANCE.getOccupancyComponent_IOccupancyDecision__GetDSSOccupancyInfo();

		/**
		 * The meta object literal for the '{@link Implementation.BookingComponent_IBookingDecision <em>Booking Component IBooking Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.BookingComponent_IBookingDecision
		 * @see Implementation.impl.ImplementationPackageImpl#getBookingComponent_IBookingDecision()
		 * @generated
		 */
		EClass BOOKING_COMPONENT_IBOOKING_DECISION = eINSTANCE.getBookingComponent_IBookingDecision();

		/**
		 * The meta object literal for the '<em><b>Get DSS Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING_DECISION___GET_DSS_INFO = eINSTANCE.getBookingComponent_IBookingDecision__GetDSSInfo();

		/**
		 * The meta object literal for the '{@link Implementation.impl.DecisionSupportComponent_OccupancyDSSInfoImpl <em>Decision Support Component Occupancy DSS Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.impl.DecisionSupportComponent_OccupancyDSSInfoImpl
		 * @see Implementation.impl.ImplementationPackageImpl#getDecisionSupportComponent_OccupancyDSSInfo()
		 * @generated
		 */
		EClass DECISION_SUPPORT_COMPONENT_OCCUPANCY_DSS_INFO = eINSTANCE.getDecisionSupportComponent_OccupancyDSSInfo();

		/**
		 * The meta object literal for the '<em><b>Room Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_SUPPORT_COMPONENT_OCCUPANCY_DSS_INFO__ROOM_NUMBER = eINSTANCE.getDecisionSupportComponent_OccupancyDSSInfo_RoomNumber();

		/**
		 * The meta object literal for the '<em><b>Check In Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_SUPPORT_COMPONENT_OCCUPANCY_DSS_INFO__CHECK_IN_DATE_TIME = eINSTANCE.getDecisionSupportComponent_OccupancyDSSInfo_CheckInDateTime();

		/**
		 * The meta object literal for the '<em><b>Check Out Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_SUPPORT_COMPONENT_OCCUPANCY_DSS_INFO__CHECK_OUT_DATE_TIME = eINSTANCE.getDecisionSupportComponent_OccupancyDSSInfo_CheckOutDateTime();

		/**
		 * The meta object literal for the '<em><b>Number Of Guests</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_SUPPORT_COMPONENT_OCCUPANCY_DSS_INFO__NUMBER_OF_GUESTS = eINSTANCE.getDecisionSupportComponent_OccupancyDSSInfo_NumberOfGuests();

		/**
		 * The meta object literal for the '{@link Implementation.impl.DecisionSupportComponent_AdditionalServiceDSSInfoImpl <em>Decision Support Component Additional Service DSS Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.impl.DecisionSupportComponent_AdditionalServiceDSSInfoImpl
		 * @see Implementation.impl.ImplementationPackageImpl#getDecisionSupportComponent_AdditionalServiceDSSInfo()
		 * @generated
		 */
		EClass DECISION_SUPPORT_COMPONENT_ADDITIONAL_SERVICE_DSS_INFO = eINSTANCE.getDecisionSupportComponent_AdditionalServiceDSSInfo();

		/**
		 * The meta object literal for the '<em><b>Additional Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_SUPPORT_COMPONENT_ADDITIONAL_SERVICE_DSS_INFO__ADDITIONAL_SERVICE_NAME = eINSTANCE.getDecisionSupportComponent_AdditionalServiceDSSInfo_AdditionalServiceName();

		/**
		 * The meta object literal for the '<em><b>Additional Service Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_SUPPORT_COMPONENT_ADDITIONAL_SERVICE_DSS_INFO__ADDITIONAL_SERVICE_PRICE = eINSTANCE.getDecisionSupportComponent_AdditionalServiceDSSInfo_AdditionalServicePrice();

		/**
		 * The meta object literal for the '{@link Implementation.impl.OccupancyComponentImpl <em>Occupancy Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.impl.OccupancyComponentImpl
		 * @see Implementation.impl.ImplementationPackageImpl#getOccupancyComponent()
		 * @generated
		 */
		EClass OCCUPANCY_COMPONENT = eINSTANCE.getOccupancyComponent();

		/**
		 * The meta object literal for the '{@link Implementation.impl.OccupancyComponent_OccupancyImpl <em>Occupancy Component Occupancy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.impl.OccupancyComponent_OccupancyImpl
		 * @see Implementation.impl.ImplementationPackageImpl#getOccupancyComponent_Occupancy()
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
		 * The meta object literal for the '<em><b>Booking Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCCUPANCY_COMPONENT_OCCUPANCY__BOOKING_REFERENCE = eINSTANCE.getOccupancyComponent_Occupancy_BookingReference();

		/**
		 * The meta object literal for the '<em><b>Guests</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCCUPANCY_COMPONENT_OCCUPANCY__GUESTS = eINSTANCE.getOccupancyComponent_Occupancy_Guests();

		/**
		 * The meta object literal for the '<em><b>Get Partner</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OCCUPANCY_COMPONENT_OCCUPANCY___GET_PARTNER__STRING_STRING = eINSTANCE.getOccupancyComponent_Occupancy__GetPartner__String_String();

		/**
		 * The meta object literal for the '<em><b>Add Guest To Occupancy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OCCUPANCY_COMPONENT_OCCUPANCY___ADD_GUEST_TO_OCCUPANCY__STRING_STRING = eINSTANCE.getOccupancyComponent_Occupancy__AddGuestToOccupancy__String_String();

		/**
		 * The meta object literal for the '<em><b>List Guests</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OCCUPANCY_COMPONENT_OCCUPANCY___LIST_GUESTS = eINSTANCE.getOccupancyComponent_Occupancy__ListGuests();

		/**
		 * The meta object literal for the '{@link Implementation.impl.OccupancyComponent_GuestImpl <em>Occupancy Component Guest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.impl.OccupancyComponent_GuestImpl
		 * @see Implementation.impl.ImplementationPackageImpl#getOccupancyComponent_Guest()
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
		 * The meta object literal for the '{@link Implementation.OccupancyComponent_IOccupancy <em>Occupancy Component IOccupancy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.OccupancyComponent_IOccupancy
		 * @see Implementation.impl.ImplementationPackageImpl#getOccupancyComponent_IOccupancy()
		 * @generated
		 */
		EClass OCCUPANCY_COMPONENT_IOCCUPANCY = eINSTANCE.getOccupancyComponent_IOccupancy();

		/**
		 * The meta object literal for the '<em><b>Check In Guest</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OCCUPANCY_COMPONENT_IOCCUPANCY___CHECK_IN_GUEST__STRING_STRING_STRING_STRING_STRING_STRING = eINSTANCE.getOccupancyComponent_IOccupancy__CheckInGuest__String_String_String_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Check Out Guest</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OCCUPANCY_COMPONENT_IOCCUPANCY___CHECK_OUT_GUEST__INT_STRING_STRING = eINSTANCE.getOccupancyComponent_IOccupancy__CheckOutGuest__int_String_String();

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
		 * The meta object literal for the '<em><b>Is Occupied</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OCCUPANCY_COMPONENT_IOCCUPANCY___IS_OCCUPIED__INT = eINSTANCE.getOccupancyComponent_IOccupancy__IsOccupied__int();

		/**
		 * The meta object literal for the '<em><b>Get Available Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OCCUPANCY_COMPONENT_IOCCUPANCY___GET_AVAILABLE_ROOMS__STRING = eINSTANCE.getOccupancyComponent_IOccupancy__GetAvailableRooms__String();

		/**
		 * The meta object literal for the '{@link Implementation.impl.OccupancyComponent_OccupancyHandlerImpl <em>Occupancy Component Occupancy Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.impl.OccupancyComponent_OccupancyHandlerImpl
		 * @see Implementation.impl.ImplementationPackageImpl#getOccupancyComponent_OccupancyHandler()
		 * @generated
		 */
		EClass OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER = eINSTANCE.getOccupancyComponent_OccupancyHandler();

		/**
		 * The meta object literal for the '<em><b>IRoom Information</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER__IROOM_INFORMATION = eINSTANCE.getOccupancyComponent_OccupancyHandler_IRoomInformation();

		/**
		 * The meta object literal for the '<em><b>IBooking</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER__IBOOKING = eINSTANCE.getOccupancyComponent_OccupancyHandler_IBooking();

		/**
		 * The meta object literal for the '<em><b>Occupancy</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER__OCCUPANCY = eINSTANCE.getOccupancyComponent_OccupancyHandler_Occupancy();

		/**
		 * The meta object literal for the '<em><b>Find Occupancy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___FIND_OCCUPANCY__STRING_STRING_STRING = eINSTANCE.getOccupancyComponent_OccupancyHandler__FindOccupancy__String_String_String();

		/**
		 * The meta object literal for the '<em><b>Is In Room Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___IS_IN_ROOM_TYPES__ELIST_STRING = eINSTANCE.getOccupancyComponent_OccupancyHandler__IsInRoomTypes__EList_String();

		/**
		 * The meta object literal for the '{@link Implementation.RoomComponent_IRoomInformation <em>Room Component IRoom Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.RoomComponent_IRoomInformation
		 * @see Implementation.impl.ImplementationPackageImpl#getRoomComponent_IRoomInformation()
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
		 * The meta object literal for the '<em><b>Get Count Of Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_COMPONENT_IROOM_INFORMATION___GET_COUNT_OF_ROOM_TYPE__STRING = eINSTANCE.getRoomComponent_IRoomInformation__GetCountOfRoomType__String();

		/**
		 * The meta object literal for the '{@link Implementation.BookingComponent_IBookingInformation <em>Booking Component IBooking Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.BookingComponent_IBookingInformation
		 * @see Implementation.impl.ImplementationPackageImpl#getBookingComponent_IBookingInformation()
		 * @generated
		 */
		EClass BOOKING_COMPONENT_IBOOKING_INFORMATION = eINSTANCE.getBookingComponent_IBookingInformation();

		/**
		 * The meta object literal for the '<em><b>Get Guests In Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING_INFORMATION___GET_GUESTS_IN_BOOKING__STRING = eINSTANCE.getBookingComponent_IBookingInformation__GetGuestsInBooking__String();

		/**
		 * The meta object literal for the '<em><b>Get Room Types In Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING_INFORMATION___GET_ROOM_TYPES_IN_BOOKING__STRING = eINSTANCE.getBookingComponent_IBookingInformation__GetRoomTypesInBooking__String();

		/**
		 * The meta object literal for the '<em><b>Search For Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING_INFORMATION___SEARCH_FOR_BOOKING__STRING = eINSTANCE.getBookingComponent_IBookingInformation__SearchForBooking__String();

		/**
		 * The meta object literal for the '<em><b>Is Paid For</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING_INFORMATION___IS_PAID_FOR__STRING = eINSTANCE.getBookingComponent_IBookingInformation__IsPaidFor__String();

		/**
		 * The meta object literal for the '<em><b>Make Payment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING_INFORMATION___MAKE_PAYMENT__STRING = eINSTANCE.getBookingComponent_IBookingInformation__MakePayment__String();

		/**
		 * The meta object literal for the '{@link Implementation.impl.PaymentComponentImpl <em>Payment Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.impl.PaymentComponentImpl
		 * @see Implementation.impl.ImplementationPackageImpl#getPaymentComponent()
		 * @generated
		 */
		EClass PAYMENT_COMPONENT = eINSTANCE.getPaymentComponent();

		/**
		 * The meta object literal for the '{@link Implementation.impl.PaymentComponent_PaymentImpl <em>Payment Component Payment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.impl.PaymentComponent_PaymentImpl
		 * @see Implementation.impl.ImplementationPackageImpl#getPaymentComponent_Payment()
		 * @generated
		 */
		EClass PAYMENT_COMPONENT_PAYMENT = eINSTANCE.getPaymentComponent_Payment();

		/**
		 * The meta object literal for the '<em><b>Cc Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_COMPONENT_PAYMENT__CC_NUMBER = eINSTANCE.getPaymentComponent_Payment_CcNumber();

		/**
		 * The meta object literal for the '<em><b>Ccv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_COMPONENT_PAYMENT__CCV = eINSTANCE.getPaymentComponent_Payment_Ccv();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_COMPONENT_PAYMENT__FIRST_NAME = eINSTANCE.getPaymentComponent_Payment_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_COMPONENT_PAYMENT__LAST_NAME = eINSTANCE.getPaymentComponent_Payment_LastName();

		/**
		 * The meta object literal for the '<em><b>Expiry Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_COMPONENT_PAYMENT__EXPIRY_MONTH = eINSTANCE.getPaymentComponent_Payment_ExpiryMonth();

		/**
		 * The meta object literal for the '<em><b>Expiry Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_COMPONENT_PAYMENT__EXPIRY_YEAR = eINSTANCE.getPaymentComponent_Payment_ExpiryYear();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_COMPONENT_PAYMENT__AMOUNT = eINSTANCE.getPaymentComponent_Payment_Amount();

		/**
		 * The meta object literal for the '{@link Implementation.Bank_CustomerProvides <em>Bank Customer Provides</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.Bank_CustomerProvides
		 * @see Implementation.impl.ImplementationPackageImpl#getBank_CustomerProvides()
		 * @generated
		 */
		EClass BANK_CUSTOMER_PROVIDES = eINSTANCE.getBank_CustomerProvides();

		/**
		 * The meta object literal for the '<em><b>Make Payment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BANK_CUSTOMER_PROVIDES___MAKE_PAYMENT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE = eINSTANCE.getBank_CustomerProvides__MakePayment__String_String_int_int_String_String_double();

		/**
		 * The meta object literal for the '<em><b>Is Credit Card Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BANK_CUSTOMER_PROVIDES___IS_CREDIT_CARD_VALID__STRING_STRING_INT_INT_STRING_STRING = eINSTANCE.getBank_CustomerProvides__IsCreditCardValid__String_String_int_int_String_String();

		/**
		 * The meta object literal for the '{@link Implementation.Bank_AdministratorProvides <em>Bank Administrator Provides</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.Bank_AdministratorProvides
		 * @see Implementation.impl.ImplementationPackageImpl#getBank_AdministratorProvides()
		 * @generated
		 */
		EClass BANK_ADMINISTRATOR_PROVIDES = eINSTANCE.getBank_AdministratorProvides();

		/**
		 * The meta object literal for the '<em><b>Make Deposit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BANK_ADMINISTRATOR_PROVIDES___MAKE_DEPOSIT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE = eINSTANCE.getBank_AdministratorProvides__MakeDeposit__String_String_int_int_String_String_double();

		/**
		 * The meta object literal for the '<em><b>Add Credit Card</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BANK_ADMINISTRATOR_PROVIDES___ADD_CREDIT_CARD__STRING_STRING_INT_INT_STRING_STRING = eINSTANCE.getBank_AdministratorProvides__AddCreditCard__String_String_int_int_String_String();

		/**
		 * The meta object literal for the '<em><b>Remove Credit Card</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BANK_ADMINISTRATOR_PROVIDES___REMOVE_CREDIT_CARD__STRING_STRING_INT_INT_STRING_STRING = eINSTANCE.getBank_AdministratorProvides__RemoveCreditCard__String_String_int_int_String_String();

		/**
		 * The meta object literal for the '<em><b>Get Balance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BANK_ADMINISTRATOR_PROVIDES___GET_BALANCE__STRING_STRING_INT_INT_STRING_STRING = eINSTANCE.getBank_AdministratorProvides__GetBalance__String_String_int_int_String_String();

		/**
		 * The meta object literal for the '{@link Implementation.PaymentComponent_IPayment <em>Payment Component IPayment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.PaymentComponent_IPayment
		 * @see Implementation.impl.ImplementationPackageImpl#getPaymentComponent_IPayment()
		 * @generated
		 */
		EClass PAYMENT_COMPONENT_IPAYMENT = eINSTANCE.getPaymentComponent_IPayment();

		/**
		 * The meta object literal for the '<em><b>Make Payment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT_COMPONENT_IPAYMENT___MAKE_PAYMENT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE = eINSTANCE.getPaymentComponent_IPayment__MakePayment__String_String_int_int_String_String_double();

		/**
		 * The meta object literal for the '<em><b>Validate CC</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT_COMPONENT_IPAYMENT___VALIDATE_CC__STRING_STRING_INT_INT_STRING_STRING = eINSTANCE.getPaymentComponent_IPayment__ValidateCC__String_String_int_int_String_String();

		/**
		 * The meta object literal for the '<em><b>Add CC</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT_COMPONENT_IPAYMENT___ADD_CC__STRING_STRING_INT_INT_STRING_STRING = eINSTANCE.getPaymentComponent_IPayment__AddCC__String_String_int_int_String_String();

		/**
		 * The meta object literal for the '<em><b>Check Balance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT_COMPONENT_IPAYMENT___CHECK_BALANCE__STRING_STRING_INT_INT_STRING_STRING = eINSTANCE.getPaymentComponent_IPayment__CheckBalance__String_String_int_int_String_String();

		/**
		 * The meta object literal for the '<em><b>Make Deposit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT_COMPONENT_IPAYMENT___MAKE_DEPOSIT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE = eINSTANCE.getPaymentComponent_IPayment__MakeDeposit__String_String_int_int_String_String_double();

		/**
		 * The meta object literal for the '<em><b>Remove CC</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT_COMPONENT_IPAYMENT___REMOVE_CC__STRING_STRING_INT_INT_STRING_STRING = eINSTANCE.getPaymentComponent_IPayment__RemoveCC__String_String_int_int_String_String();

		/**
		 * The meta object literal for the '{@link Implementation.impl.PaymentComponent_PaymentHandlerImpl <em>Payment Component Payment Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.impl.PaymentComponent_PaymentHandlerImpl
		 * @see Implementation.impl.ImplementationPackageImpl#getPaymentComponent_PaymentHandler()
		 * @generated
		 */
		EClass PAYMENT_COMPONENT_PAYMENT_HANDLER = eINSTANCE.getPaymentComponent_PaymentHandler();

		/**
		 * The meta object literal for the '<em><b>Payment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_COMPONENT_PAYMENT_HANDLER__PAYMENT = eINSTANCE.getPaymentComponent_PaymentHandler_Payment();

		/**
		 * The meta object literal for the '<em><b>Customer Provides</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_COMPONENT_PAYMENT_HANDLER__CUSTOMER_PROVIDES = eINSTANCE.getPaymentComponent_PaymentHandler_CustomerProvides();

		/**
		 * The meta object literal for the '<em><b>Administrator Provides</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_COMPONENT_PAYMENT_HANDLER__ADMINISTRATOR_PROVIDES = eINSTANCE.getPaymentComponent_PaymentHandler_AdministratorProvides();

		/**
		 * The meta object literal for the '{@link Implementation.impl.AdditionalServiceComponentImpl <em>Additional Service Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.impl.AdditionalServiceComponentImpl
		 * @see Implementation.impl.ImplementationPackageImpl#getAdditionalServiceComponent()
		 * @generated
		 */
		EClass ADDITIONAL_SERVICE_COMPONENT = eINSTANCE.getAdditionalServiceComponent();

		/**
		 * The meta object literal for the '{@link Implementation.impl.AdditionalServiceComponent_AdditionalServiceImpl <em>Additional Service Component Additional Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.impl.AdditionalServiceComponent_AdditionalServiceImpl
		 * @see Implementation.impl.ImplementationPackageImpl#getAdditionalServiceComponent_AdditionalService()
		 * @generated
		 */
		EClass ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE = eINSTANCE.getAdditionalServiceComponent_AdditionalService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__NAME = eINSTANCE.getAdditionalServiceComponent_AdditionalService_Name();

		/**
		 * The meta object literal for the '<em><b>Usable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__USABLE = eINSTANCE.getAdditionalServiceComponent_AdditionalService_Usable();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__PRICE = eINSTANCE.getAdditionalServiceComponent_AdditionalService_Price();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__DESCRIPTION = eINSTANCE.getAdditionalServiceComponent_AdditionalService_Description();

		/**
		 * The meta object literal for the '<em><b>Additional Service Event</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__ADDITIONAL_SERVICE_EVENT = eINSTANCE.getAdditionalServiceComponent_AdditionalService_AdditionalServiceEvent();

		/**
		 * The meta object literal for the '<em><b>Temp Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__TEMP_EVENTS = eINSTANCE.getAdditionalServiceComponent_AdditionalService_TempEvents();

		/**
		 * The meta object literal for the '<em><b>Find Event</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE___FIND_EVENT__DATE_STRING = eINSTANCE.getAdditionalServiceComponent_AdditionalService__FindEvent__Date_String();

		/**
		 * The meta object literal for the '<em><b>Find Events</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE___FIND_EVENTS__DATE = eINSTANCE.getAdditionalServiceComponent_AdditionalService__FindEvents__Date();

		/**
		 * The meta object literal for the '<em><b>Create Event</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE___CREATE_EVENT__DATE_STRING_INT_INT = eINSTANCE.getAdditionalServiceComponent_AdditionalService__CreateEvent__Date_String_int_int();

		/**
		 * The meta object literal for the '<em><b>Edit Event</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE___EDIT_EVENT__DATE_STRING_INT_INT = eINSTANCE.getAdditionalServiceComponent_AdditionalService__EditEvent__Date_String_int_int();

		/**
		 * The meta object literal for the '<em><b>Remove Event</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE___REMOVE_EVENT__DATE_STRING = eINSTANCE.getAdditionalServiceComponent_AdditionalService__RemoveEvent__Date_String();

		/**
		 * The meta object literal for the '<em><b>Remove Events</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE___REMOVE_EVENTS__DATE = eINSTANCE.getAdditionalServiceComponent_AdditionalService__RemoveEvents__Date();

		/**
		 * The meta object literal for the '{@link Implementation.StaffComponent_IAuthentication <em>Staff Component IAuthentication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.StaffComponent_IAuthentication
		 * @see Implementation.impl.ImplementationPackageImpl#getStaffComponent_IAuthentication()
		 * @generated
		 */
		EClass STAFF_COMPONENT_IAUTHENTICATION = eINSTANCE.getStaffComponent_IAuthentication();

		/**
		 * The meta object literal for the '<em><b>Log In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_COMPONENT_IAUTHENTICATION___LOG_IN__STRING_STRING = eINSTANCE.getStaffComponent_IAuthentication__LogIn__String_String();

		/**
		 * The meta object literal for the '<em><b>Log Out</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_COMPONENT_IAUTHENTICATION___LOG_OUT__STRING = eINSTANCE.getStaffComponent_IAuthentication__LogOut__String();

		/**
		 * The meta object literal for the '<em><b>Is Logged In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_COMPONENT_IAUTHENTICATION___IS_LOGGED_IN__STRING = eINSTANCE.getStaffComponent_IAuthentication__IsLoggedIn__String();

		/**
		 * The meta object literal for the '{@link Implementation.impl.AdditionalServiceComponent_AdditionalServiceHandlerImpl <em>Additional Service Component Additional Service Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.impl.AdditionalServiceComponent_AdditionalServiceHandlerImpl
		 * @see Implementation.impl.ImplementationPackageImpl#getAdditionalServiceComponent_AdditionalServiceHandler()
		 * @generated
		 */
		EClass ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER = eINSTANCE.getAdditionalServiceComponent_AdditionalServiceHandler();

		/**
		 * The meta object literal for the '<em><b>IAuthentication</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER__IAUTHENTICATION = eINSTANCE.getAdditionalServiceComponent_AdditionalServiceHandler_IAuthentication();

		/**
		 * The meta object literal for the '<em><b>Additional Service</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER__ADDITIONAL_SERVICE = eINSTANCE.getAdditionalServiceComponent_AdditionalServiceHandler_AdditionalService();

		/**
		 * The meta object literal for the '<em><b>Find Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___FIND_SERVICE__STRING = eINSTANCE.getAdditionalServiceComponent_AdditionalServiceHandler__FindService__String();

		/**
		 * The meta object literal for the '{@link Implementation.AdditionalServiceComponent_IAdditionalServiceAdministration <em>Additional Service Component IAdditional Service Administration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.AdditionalServiceComponent_IAdditionalServiceAdministration
		 * @see Implementation.impl.ImplementationPackageImpl#getAdditionalServiceComponent_IAdditionalServiceAdministration()
		 * @generated
		 */
		EClass ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION = eINSTANCE.getAdditionalServiceComponent_IAdditionalServiceAdministration();

		/**
		 * The meta object literal for the '<em><b>Create Additional Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___CREATE_ADDITIONAL_SERVICE__STRING_BOOLEAN_INT_STRING = eINSTANCE.getAdditionalServiceComponent_IAdditionalServiceAdministration__CreateAdditionalService__String_boolean_int_String();

		/**
		 * The meta object literal for the '<em><b>Edit Additional Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___EDIT_ADDITIONAL_SERVICE__STRING_STRING_BOOLEAN_INT_STRING = eINSTANCE.getAdditionalServiceComponent_IAdditionalServiceAdministration__EditAdditionalService__String_String_boolean_int_String();

		/**
		 * The meta object literal for the '<em><b>Remove Additional Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___REMOVE_ADDITIONAL_SERVICE__STRING = eINSTANCE.getAdditionalServiceComponent_IAdditionalServiceAdministration__RemoveAdditionalService__String();

		/**
		 * The meta object literal for the '<em><b>Create Event</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___CREATE_EVENT__STRING_DATE_STRING_INT_INT = eINSTANCE.getAdditionalServiceComponent_IAdditionalServiceAdministration__CreateEvent__String_Date_String_int_int();

		/**
		 * The meta object literal for the '<em><b>Edit Event</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___EDIT_EVENT__STRING_DATE_STRING_INT_INT = eINSTANCE.getAdditionalServiceComponent_IAdditionalServiceAdministration__EditEvent__String_Date_String_int_int();

		/**
		 * The meta object literal for the '<em><b>Remove Event</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___REMOVE_EVENT__STRING_DATE_STRING = eINSTANCE.getAdditionalServiceComponent_IAdditionalServiceAdministration__RemoveEvent__String_Date_String();

		/**
		 * The meta object literal for the '<em><b>Remove Events</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___REMOVE_EVENTS__STRING_DATE = eINSTANCE.getAdditionalServiceComponent_IAdditionalServiceAdministration__RemoveEvents__String_Date();

		/**
		 * The meta object literal for the '{@link Implementation.AdditionalServiceComponent_IEventManagement <em>Additional Service Component IEvent Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.AdditionalServiceComponent_IEventManagement
		 * @see Implementation.impl.ImplementationPackageImpl#getAdditionalServiceComponent_IEventManagement()
		 * @generated
		 */
		EClass ADDITIONAL_SERVICE_COMPONENT_IEVENT_MANAGEMENT = eINSTANCE.getAdditionalServiceComponent_IEventManagement();

		/**
		 * The meta object literal for the '<em><b>Get Services</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADDITIONAL_SERVICE_COMPONENT_IEVENT_MANAGEMENT___GET_SERVICES = eINSTANCE.getAdditionalServiceComponent_IEventManagement__GetServices();

		/**
		 * The meta object literal for the '<em><b>Get Events</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADDITIONAL_SERVICE_COMPONENT_IEVENT_MANAGEMENT___GET_EVENTS__STRING = eINSTANCE.getAdditionalServiceComponent_IEventManagement__GetEvents__String();

		/**
		 * The meta object literal for the '<em><b>Add Guest To Event</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADDITIONAL_SERVICE_COMPONENT_IEVENT_MANAGEMENT___ADD_GUEST_TO_EVENT__STRING_DATE_STRING_INT = eINSTANCE.getAdditionalServiceComponent_IEventManagement__AddGuestToEvent__String_Date_String_int();

		/**
		 * The meta object literal for the '<em><b>Remove Guests From Event</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADDITIONAL_SERVICE_COMPONENT_IEVENT_MANAGEMENT___REMOVE_GUESTS_FROM_EVENT__STRING_DATE_STRING_INT = eINSTANCE.getAdditionalServiceComponent_IEventManagement__RemoveGuestsFromEvent__String_Date_String_int();

		/**
		 * The meta object literal for the '{@link Implementation.impl.AdditionalServiceComponent_AdditionalServiceEventImpl <em>Additional Service Component Additional Service Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.impl.AdditionalServiceComponent_AdditionalServiceEventImpl
		 * @see Implementation.impl.ImplementationPackageImpl#getAdditionalServiceComponent_AdditionalServiceEvent()
		 * @generated
		 */
		EClass ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT = eINSTANCE.getAdditionalServiceComponent_AdditionalServiceEvent();

		/**
		 * The meta object literal for the '<em><b>Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__DATE_TIME = eINSTANCE.getAdditionalServiceComponent_AdditionalServiceEvent_DateTime();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__LOCATION = eINSTANCE.getAdditionalServiceComponent_AdditionalServiceEvent_Location();

		/**
		 * The meta object literal for the '<em><b>Max Attendant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__MAX_ATTENDANT = eINSTANCE.getAdditionalServiceComponent_AdditionalServiceEvent_MaxAttendant();

		/**
		 * The meta object literal for the '<em><b>Current Attendants</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__CURRENT_ATTENDANTS = eINSTANCE.getAdditionalServiceComponent_AdditionalServiceEvent_CurrentAttendants();

		/**
		 * The meta object literal for the '{@link Implementation.impl.BookingComponentImpl <em>Booking Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.impl.BookingComponentImpl
		 * @see Implementation.impl.ImplementationPackageImpl#getBookingComponent()
		 * @generated
		 */
		EClass BOOKING_COMPONENT = eINSTANCE.getBookingComponent();

		/**
		 * The meta object literal for the '{@link Implementation.impl.BookingComponent_PaymentDetailsImpl <em>Booking Component Payment Details</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.impl.BookingComponent_PaymentDetailsImpl
		 * @see Implementation.impl.ImplementationPackageImpl#getBookingComponent_PaymentDetails()
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
		 * The meta object literal for the '<em><b>Ssn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_PAYMENT_DETAILS__SSN = eINSTANCE.getBookingComponent_PaymentDetails_Ssn();

		/**
		 * The meta object literal for the '{@link Implementation.impl.BookingComponent_BookingImpl <em>Booking Component Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.impl.BookingComponent_BookingImpl
		 * @see Implementation.impl.ImplementationPackageImpl#getBookingComponent_Booking()
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
		 * The meta object literal for the '<em><b>Booking Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_BOOKING__BOOKING_REFERENCE = eINSTANCE.getBookingComponent_Booking_BookingReference();

		/**
		 * The meta object literal for the '<em><b>Current Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_BOOKING__CURRENT_COST = eINSTANCE.getBookingComponent_Booking_CurrentCost();

		/**
		 * The meta object literal for the '<em><b>Additional Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_COMPONENT_BOOKING__ADDITIONAL_SERVICES = eINSTANCE.getBookingComponent_Booking_AdditionalServices();

		/**
		 * The meta object literal for the '<em><b>Guests</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_COMPONENT_BOOKING__GUESTS = eINSTANCE.getBookingComponent_Booking_Guests();

		/**
		 * The meta object literal for the '<em><b>Payment Details</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_COMPONENT_BOOKING__PAYMENT_DETAILS = eINSTANCE.getBookingComponent_Booking_PaymentDetails();

		/**
		 * The meta object literal for the '<em><b>Rooms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_COMPONENT_BOOKING__ROOMS = eINSTANCE.getBookingComponent_Booking_Rooms();

		/**
		 * The meta object literal for the '<em><b>Is Paid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_BOOKING__IS_PAID = eINSTANCE.getBookingComponent_Booking_IsPaid();

		/**
		 * The meta object literal for the '<em><b>Add Additional Service To Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_BOOKING___ADD_ADDITIONAL_SERVICE_TO_BOOKING__STRING_INT = eINSTANCE.getBookingComponent_Booking__AddAdditionalServiceToBooking__String_int();

		/**
		 * The meta object literal for the '<em><b>Add Room To Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_BOOKING___ADD_ROOM_TO_BOOKING__STRING_INT = eINSTANCE.getBookingComponent_Booking__AddRoomToBooking__String_int();

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
		EOperation BOOKING_COMPONENT_BOOKING___UPDATE_BOOKING__DATE_DATE = eINSTANCE.getBookingComponent_Booking__UpdateBooking__Date_Date();

		/**
		 * The meta object literal for the '<em><b>Remove Additional Service From Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_BOOKING___REMOVE_ADDITIONAL_SERVICE_FROM_BOOKING__STRING = eINSTANCE.getBookingComponent_Booking__RemoveAdditionalServiceFromBooking__String();

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
		 * The meta object literal for the '<em><b>Generate Reference Number</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_BOOKING___GENERATE_REFERENCE_NUMBER = eINSTANCE.getBookingComponent_Booking__GenerateReferenceNumber();

		/**
		 * The meta object literal for the '<em><b>Add Guest To Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_BOOKING___ADD_GUEST_TO_BOOKING__STRING_STRING_STRING = eINSTANCE.getBookingComponent_Booking__AddGuestToBooking__String_String_String();

		/**
		 * The meta object literal for the '<em><b>Remove Guest From Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_BOOKING___REMOVE_GUEST_FROM_BOOKING__STRING_STRING_STRING = eINSTANCE.getBookingComponent_Booking__RemoveGuestFromBooking__String_String_String();

		/**
		 * The meta object literal for the '<em><b>Get Guests In Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_BOOKING___GET_GUESTS_IN_BOOKING = eINSTANCE.getBookingComponent_Booking__GetGuestsInBooking();

		/**
		 * The meta object literal for the '<em><b>Get Room Types In Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_BOOKING___GET_ROOM_TYPES_IN_BOOKING = eINSTANCE.getBookingComponent_Booking__GetRoomTypesInBooking();

		/**
		 * The meta object literal for the '{@link Implementation.impl.BookingComponent_AdditionalServiceImpl <em>Booking Component Additional Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.impl.BookingComponent_AdditionalServiceImpl
		 * @see Implementation.impl.ImplementationPackageImpl#getBookingComponent_AdditionalService()
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
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_ADDITIONAL_SERVICE__COST = eINSTANCE.getBookingComponent_AdditionalService_Cost();

		/**
		 * The meta object literal for the '{@link Implementation.impl.BookingComponent_BookingGuestImpl <em>Booking Component Booking Guest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.impl.BookingComponent_BookingGuestImpl
		 * @see Implementation.impl.ImplementationPackageImpl#getBookingComponent_BookingGuest()
		 * @generated
		 */
		EClass BOOKING_COMPONENT_BOOKING_GUEST = eINSTANCE.getBookingComponent_BookingGuest();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_BOOKING_GUEST__FIRST_NAME = eINSTANCE.getBookingComponent_BookingGuest_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_BOOKING_GUEST__LAST_NAME = eINSTANCE.getBookingComponent_BookingGuest_LastName();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_BOOKING_GUEST__ADDRESS = eINSTANCE.getBookingComponent_BookingGuest_Address();

		/**
		 * The meta object literal for the '{@link Implementation.impl.BookingComponent_RoomTypeImpl <em>Booking Component Room Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.impl.BookingComponent_RoomTypeImpl
		 * @see Implementation.impl.ImplementationPackageImpl#getBookingComponent_RoomType()
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
		 * The meta object literal for the '{@link Implementation.impl.BookingComponent_BookingHandlerImpl <em>Booking Component Booking Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.impl.BookingComponent_BookingHandlerImpl
		 * @see Implementation.impl.ImplementationPackageImpl#getBookingComponent_BookingHandler()
		 * @generated
		 */
		EClass BOOKING_COMPONENT_BOOKING_HANDLER = eINSTANCE.getBookingComponent_BookingHandler();

		/**
		 * The meta object literal for the '<em><b>Bookings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_COMPONENT_BOOKING_HANDLER__BOOKINGS = eINSTANCE.getBookingComponent_BookingHandler_Bookings();

		/**
		 * The meta object literal for the '<em><b>Authentication</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_COMPONENT_BOOKING_HANDLER__AUTHENTICATION = eINSTANCE.getBookingComponent_BookingHandler_Authentication();

		/**
		 * The meta object literal for the '<em><b>IRoom Information</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_COMPONENT_BOOKING_HANDLER__IROOM_INFORMATION = eINSTANCE.getBookingComponent_BookingHandler_IRoomInformation();

		/**
		 * The meta object literal for the '<em><b>IAdditional Service Information</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_COMPONENT_BOOKING_HANDLER__IADDITIONAL_SERVICE_INFORMATION = eINSTANCE.getBookingComponent_BookingHandler_IAdditionalServiceInformation();

		/**
		 * The meta object literal for the '<em><b>IPayment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_COMPONENT_BOOKING_HANDLER__IPAYMENT = eINSTANCE.getBookingComponent_BookingHandler_IPayment();

		/**
		 * The meta object literal for the '<em><b>Find Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_BOOKING_HANDLER___FIND_BOOKING__STRING = eINSTANCE.getBookingComponent_BookingHandler__FindBooking__String();

		/**
		 * The meta object literal for the '<em><b>Booking Available</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_BOOKING_HANDLER___BOOKING_AVAILABLE__DATE_DATE = eINSTANCE.getBookingComponent_BookingHandler__BookingAvailable__Date_Date();

		/**
		 * The meta object literal for the '<em><b>Find Bookings By Date And Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_BOOKING_HANDLER___FIND_BOOKINGS_BY_DATE_AND_TYPE__DATE_DATE_STRING = eINSTANCE.getBookingComponent_BookingHandler__FindBookingsByDateAndType__Date_Date_String();

		/**
		 * The meta object literal for the '<em><b>Find Bookings By Date</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_BOOKING_HANDLER___FIND_BOOKINGS_BY_DATE__DATE_DATE = eINSTANCE.getBookingComponent_BookingHandler__FindBookingsByDate__Date_Date();

		/**
		 * The meta object literal for the '{@link Implementation.BookingComponent_IBookingAdministration <em>Booking Component IBooking Administration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.BookingComponent_IBookingAdministration
		 * @see Implementation.impl.ImplementationPackageImpl#getBookingComponent_IBookingAdministration()
		 * @generated
		 */
		EClass BOOKING_COMPONENT_IBOOKING_ADMINISTRATION = eINSTANCE.getBookingComponent_IBookingAdministration();

		/**
		 * The meta object literal for the '<em><b>Make Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___MAKE_BOOKING__DATE_DATE_STRING_STRING_STRING_STRING_STRING_STRING_STRING_STRING = eINSTANCE.getBookingComponent_IBookingAdministration__MakeBooking__Date_Date_String_String_String_String_String_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Add Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___ADD_ROOM__STRING_STRING_INT = eINSTANCE.getBookingComponent_IBookingAdministration__AddRoom__String_String_int();

		/**
		 * The meta object literal for the '<em><b>Request Quote</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___REQUEST_QUOTE__STRING_INT_DATE_DATE = eINSTANCE.getBookingComponent_IBookingAdministration__RequestQuote__String_int_Date_Date();

		/**
		 * The meta object literal for the '<em><b>Edit Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___EDIT_BOOKING__STRING_DATE_DATE = eINSTANCE.getBookingComponent_IBookingAdministration__EditBooking__String_Date_Date();

		/**
		 * The meta object literal for the '<em><b>Cancel Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___CANCEL_BOOKING__STRING = eINSTANCE.getBookingComponent_IBookingAdministration__CancelBooking__String();

		/**
		 * The meta object literal for the '<em><b>Add Additional Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___ADD_ADDITIONAL_SERVICE__STRING_STRING_INT = eINSTANCE.getBookingComponent_IBookingAdministration__AddAdditionalService__String_String_int();

		/**
		 * The meta object literal for the '<em><b>Remove Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___REMOVE_ROOM__STRING_STRING = eINSTANCE.getBookingComponent_IBookingAdministration__RemoveRoom__String_String();

		/**
		 * The meta object literal for the '<em><b>Remove Additional Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___REMOVE_ADDITIONAL_SERVICE__STRING_STRING = eINSTANCE.getBookingComponent_IBookingAdministration__RemoveAdditionalService__String_String();

		/**
		 * The meta object literal for the '<em><b>Generate Quote</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___GENERATE_QUOTE__DATE_DATE_STRING = eINSTANCE.getBookingComponent_IBookingAdministration__GenerateQuote__Date_Date_String();

		/**
		 * The meta object literal for the '<em><b>Add Guest To Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___ADD_GUEST_TO_BOOKING__STRING_STRING_STRING_STRING = eINSTANCE.getBookingComponent_IBookingAdministration__AddGuestToBooking__String_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Remove Guest</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___REMOVE_GUEST__STRING_STRING_STRING_STRING = eINSTANCE.getBookingComponent_IBookingAdministration__RemoveGuest__String_String_String_String();

		/**
		 * The meta object literal for the '{@link Implementation.impl.StaffComponentImpl <em>Staff Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.impl.StaffComponentImpl
		 * @see Implementation.impl.ImplementationPackageImpl#getStaffComponent()
		 * @generated
		 */
		EClass STAFF_COMPONENT = eINSTANCE.getStaffComponent();

		/**
		 * The meta object literal for the '{@link Implementation.impl.StaffComponent_AccountManagerImpl <em>Staff Component Account Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.impl.StaffComponent_AccountManagerImpl
		 * @see Implementation.impl.ImplementationPackageImpl#getStaffComponent_AccountManager()
		 * @generated
		 */
		EClass STAFF_COMPONENT_ACCOUNT_MANAGER = eINSTANCE.getStaffComponent_AccountManager();

		/**
		 * The meta object literal for the '<em><b>IAuthentication</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAFF_COMPONENT_ACCOUNT_MANAGER__IAUTHENTICATION = eINSTANCE.getStaffComponent_AccountManager_IAuthentication();

		/**
		 * The meta object literal for the '<em><b>Logged In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAFF_COMPONENT_ACCOUNT_MANAGER__LOGGED_IN = eINSTANCE.getStaffComponent_AccountManager_LoggedIn();

		/**
		 * The meta object literal for the '<em><b>Employees</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAFF_COMPONENT_ACCOUNT_MANAGER__EMPLOYEES = eINSTANCE.getStaffComponent_AccountManager_Employees();

		/**
		 * The meta object literal for the '<em><b>Find Account</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_COMPONENT_ACCOUNT_MANAGER___FIND_ACCOUNT__STRING = eINSTANCE.getStaffComponent_AccountManager__FindAccount__String();

		/**
		 * The meta object literal for the '{@link Implementation.StaffComponent_IAccountAdministration <em>Staff Component IAccount Administration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.StaffComponent_IAccountAdministration
		 * @see Implementation.impl.ImplementationPackageImpl#getStaffComponent_IAccountAdministration()
		 * @generated
		 */
		EClass STAFF_COMPONENT_IACCOUNT_ADMINISTRATION = eINSTANCE.getStaffComponent_IAccountAdministration();

		/**
		 * The meta object literal for the '<em><b>Create Account</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_COMPONENT_IACCOUNT_ADMINISTRATION___CREATE_ACCOUNT__STRING_STRING_STRING_STRING_STRING = eINSTANCE.getStaffComponent_IAccountAdministration__CreateAccount__String_String_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Edit Account Details</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_COMPONENT_IACCOUNT_ADMINISTRATION___EDIT_ACCOUNT_DETAILS__STRING_STRING_STRING_STRING_STRING = eINSTANCE.getStaffComponent_IAccountAdministration__EditAccountDetails__String_String_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Remove Account</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_COMPONENT_IACCOUNT_ADMINISTRATION___REMOVE_ACCOUNT__STRING = eINSTANCE.getStaffComponent_IAccountAdministration__RemoveAccount__String();

		/**
		 * The meta object literal for the '{@link Implementation.impl.StaffComponent_EmployeeImpl <em>Staff Component Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.impl.StaffComponent_EmployeeImpl
		 * @see Implementation.impl.ImplementationPackageImpl#getStaffComponent_Employee()
		 * @generated
		 */
		EClass STAFF_COMPONENT_EMPLOYEE = eINSTANCE.getStaffComponent_Employee();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_COMPONENT_EMPLOYEE__ID = eINSTANCE.getStaffComponent_Employee_Id();

		/**
		 * The meta object literal for the '<em><b>Ssn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_COMPONENT_EMPLOYEE__SSN = eINSTANCE.getStaffComponent_Employee_Ssn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_COMPONENT_EMPLOYEE__NAME = eINSTANCE.getStaffComponent_Employee_Name();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_COMPONENT_EMPLOYEE__EMAIL = eINSTANCE.getStaffComponent_Employee_Email();

		/**
		 * The meta object literal for the '<em><b>Phone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_COMPONENT_EMPLOYEE__PHONE = eINSTANCE.getStaffComponent_Employee_Phone();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_COMPONENT_EMPLOYEE__PASSWORD = eINSTANCE.getStaffComponent_Employee_Password();

		/**
		 * The meta object literal for the '<em><b>Get Employee Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_COMPONENT_EMPLOYEE___GET_EMPLOYEE_INFO = eINSTANCE.getStaffComponent_Employee__GetEmployeeInfo();

		/**
		 * The meta object literal for the '{@link Implementation.impl.RoomComponentImpl <em>Room Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.impl.RoomComponentImpl
		 * @see Implementation.impl.ImplementationPackageImpl#getRoomComponent()
		 * @generated
		 */
		EClass ROOM_COMPONENT = eINSTANCE.getRoomComponent();

		/**
		 * The meta object literal for the '{@link Implementation.impl.RoomComponent_RoomImpl <em>Room Component Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.impl.RoomComponent_RoomImpl
		 * @see Implementation.impl.ImplementationPackageImpl#getRoomComponent_Room()
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
		 * The meta object literal for the '{@link Implementation.impl.RoomComponent_BedroomImpl <em>Room Component Bedroom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.impl.RoomComponent_BedroomImpl
		 * @see Implementation.impl.ImplementationPackageImpl#getRoomComponent_Bedroom()
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
		 * The meta object literal for the '{@link Implementation.impl.RoomComponent_ConferenceRoomImpl <em>Room Component Conference Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.impl.RoomComponent_ConferenceRoomImpl
		 * @see Implementation.impl.ImplementationPackageImpl#getRoomComponent_ConferenceRoom()
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
		 * The meta object literal for the '{@link Implementation.RoomComponent_IRoomAdministration <em>Room Component IRoom Administration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.RoomComponent_IRoomAdministration
		 * @see Implementation.impl.ImplementationPackageImpl#getRoomComponent_IRoomAdministration()
		 * @generated
		 */
		EClass ROOM_COMPONENT_IROOM_ADMINISTRATION = eINSTANCE.getRoomComponent_IRoomAdministration();

		/**
		 * The meta object literal for the '<em><b>Create Bed Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_COMPONENT_IROOM_ADMINISTRATION___CREATE_BED_ROOM__INT_BOOLEAN_INT_STRING_STRING_INT = eINSTANCE.getRoomComponent_IRoomAdministration__CreateBedRoom__int_boolean_int_String_String_int();

		/**
		 * The meta object literal for the '<em><b>Edit Bed Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_COMPONENT_IROOM_ADMINISTRATION___EDIT_BED_ROOM__INT_INT_BOOLEAN_INT_STRING_STRING_INT = eINSTANCE.getRoomComponent_IRoomAdministration__EditBedRoom__int_int_boolean_int_String_String_int();

		/**
		 * The meta object literal for the '<em><b>Remove</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_COMPONENT_IROOM_ADMINISTRATION___REMOVE__INT = eINSTANCE.getRoomComponent_IRoomAdministration__Remove__int();

		/**
		 * The meta object literal for the '<em><b>Create Conference Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_COMPONENT_IROOM_ADMINISTRATION___CREATE_CONFERENCE_ROOM__INT_BOOLEAN_INT_STRING_STRING_INT_BOOLEAN_BOOLEAN = eINSTANCE.getRoomComponent_IRoomAdministration__CreateConferenceRoom__int_boolean_int_String_String_int_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Edit Conference Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_COMPONENT_IROOM_ADMINISTRATION___EDIT_CONFERENCE_ROOM__INT_INT_BOOLEAN_INT_STRING_STRING_INT_BOOLEAN_BOOLEAN = eINSTANCE.getRoomComponent_IRoomAdministration__EditConferenceRoom__int_int_boolean_int_String_String_int_boolean_boolean();

		/**
		 * The meta object literal for the '{@link Implementation.impl.RoomComponent_RoomHandlerImpl <em>Room Component Room Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.impl.RoomComponent_RoomHandlerImpl
		 * @see Implementation.impl.ImplementationPackageImpl#getRoomComponent_RoomHandler()
		 * @generated
		 */
		EClass ROOM_COMPONENT_ROOM_HANDLER = eINSTANCE.getRoomComponent_RoomHandler();

		/**
		 * The meta object literal for the '<em><b>Authenticator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_COMPONENT_ROOM_HANDLER__AUTHENTICATOR = eINSTANCE.getRoomComponent_RoomHandler_Authenticator();

		/**
		 * The meta object literal for the '<em><b>Bed Rooms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_COMPONENT_ROOM_HANDLER__BED_ROOMS = eINSTANCE.getRoomComponent_RoomHandler_BedRooms();

		/**
		 * The meta object literal for the '<em><b>Conference Rooms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_COMPONENT_ROOM_HANDLER__CONFERENCE_ROOMS = eINSTANCE.getRoomComponent_RoomHandler_ConferenceRooms();

		/**
		 * The meta object literal for the '{@link Implementation.impl.BankImpl <em>Bank</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Implementation.impl.BankImpl
		 * @see Implementation.impl.ImplementationPackageImpl#getBank()
		 * @generated
		 */
		EClass BANK = eINSTANCE.getBank();

	}

} //ImplementationPackage
