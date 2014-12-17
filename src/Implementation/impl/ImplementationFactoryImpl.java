/**
 */
package Implementation.impl;

import Implementation.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImplementationFactoryImpl extends EFactoryImpl implements ImplementationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ImplementationFactory init() {
		try {
			ImplementationFactory theImplementationFactory = (ImplementationFactory)EPackage.Registry.INSTANCE.getEFactory(ImplementationPackage.eNS_URI);
			if (theImplementationFactory != null) {
				return theImplementationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ImplementationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT: return createDecisionSupportComponent();
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO: return createDecisionSupportComponent_BookingDSSInfo();
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_ADDITIONAL_SERVICE_DSS_INFO: return createDecisionSupportComponent_AdditionalServiceDSSInfo();
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER: return createDecisionSupportComponent_DSSController();
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_OCCUPANCY_DSS_INFO: return createDecisionSupportComponent_OccupancyDSSInfo();
			case ImplementationPackage.OCCUPANCY_COMPONENT: return createOccupancyComponent();
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY: return createOccupancyComponent_Occupancy();
			case ImplementationPackage.OCCUPANCY_COMPONENT_GUEST: return createOccupancyComponent_Guest();
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER: return createOccupancyComponent_OccupancyHandler();
			case ImplementationPackage.PAYMENT_COMPONENT: return createPaymentComponent();
			case ImplementationPackage.PAYMENT_COMPONENT_PAYMENT_HANDLER: return createPaymentComponent_PaymentHandler();
			case ImplementationPackage.PAYMENT_COMPONENT_PAYMENT: return createPaymentComponent_Payment();
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT: return createAdditionalServiceComponent();
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE: return createAdditionalServiceComponent_AdditionalService();
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT: return createAdditionalServiceComponent_AdditionalServiceEvent();
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER: return createAdditionalServiceComponent_AdditionalServiceHandler();
			case ImplementationPackage.BOOKING_COMPONENT: return createBookingComponent();
			case ImplementationPackage.BOOKING_COMPONENT_PAYMENT_DETAILS: return createBookingComponent_PaymentDetails();
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING: return createBookingComponent_Booking();
			case ImplementationPackage.BOOKING_COMPONENT_ADDITIONAL_SERVICE: return createBookingComponent_AdditionalService();
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_GUEST: return createBookingComponent_BookingGuest();
			case ImplementationPackage.BOOKING_COMPONENT_ROOM_TYPE: return createBookingComponent_RoomType();
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER: return createBookingComponent_BookingHandler();
			case ImplementationPackage.STAFF_COMPONENT: return createStaffComponent();
			case ImplementationPackage.STAFF_COMPONENT_ACCOUNT_MANAGER: return createStaffComponent_AccountManager();
			case ImplementationPackage.STAFF_COMPONENT_EMPLOYEE: return createStaffComponent_Employee();
			case ImplementationPackage.ROOM_COMPONENT: return createRoomComponent();
			case ImplementationPackage.ROOM_COMPONENT_ROOM: return createRoomComponent_Room();
			case ImplementationPackage.ROOM_COMPONENT_BEDROOM: return createRoomComponent_Bedroom();
			case ImplementationPackage.ROOM_COMPONENT_CONFERENCE_ROOM: return createRoomComponent_ConferenceRoom();
			case ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER: return createRoomComponent_RoomHandler();
			case ImplementationPackage.BANK: return createBank();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionSupportComponent createDecisionSupportComponent() {
		DecisionSupportComponentImpl decisionSupportComponent = new DecisionSupportComponentImpl();
		return decisionSupportComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionSupportComponent_BookingDSSInfo createDecisionSupportComponent_BookingDSSInfo() {
		DecisionSupportComponent_BookingDSSInfoImpl decisionSupportComponent_BookingDSSInfo = new DecisionSupportComponent_BookingDSSInfoImpl();
		return decisionSupportComponent_BookingDSSInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionSupportComponent_DSSController createDecisionSupportComponent_DSSController() {
		DecisionSupportComponent_DSSControllerImpl decisionSupportComponent_DSSController = new DecisionSupportComponent_DSSControllerImpl();
		return decisionSupportComponent_DSSController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionSupportComponent_OccupancyDSSInfo createDecisionSupportComponent_OccupancyDSSInfo() {
		DecisionSupportComponent_OccupancyDSSInfoImpl decisionSupportComponent_OccupancyDSSInfo = new DecisionSupportComponent_OccupancyDSSInfoImpl();
		return decisionSupportComponent_OccupancyDSSInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionSupportComponent_AdditionalServiceDSSInfo createDecisionSupportComponent_AdditionalServiceDSSInfo() {
		DecisionSupportComponent_AdditionalServiceDSSInfoImpl decisionSupportComponent_AdditionalServiceDSSInfo = new DecisionSupportComponent_AdditionalServiceDSSInfoImpl();
		return decisionSupportComponent_AdditionalServiceDSSInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccupancyComponent createOccupancyComponent() {
		OccupancyComponentImpl occupancyComponent = new OccupancyComponentImpl();
		return occupancyComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccupancyComponent_Occupancy createOccupancyComponent_Occupancy() {
		OccupancyComponent_OccupancyImpl occupancyComponent_Occupancy = new OccupancyComponent_OccupancyImpl();
		return occupancyComponent_Occupancy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccupancyComponent_Guest createOccupancyComponent_Guest() {
		OccupancyComponent_GuestImpl occupancyComponent_Guest = new OccupancyComponent_GuestImpl();
		return occupancyComponent_Guest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccupancyComponent_OccupancyHandler createOccupancyComponent_OccupancyHandler() {
		OccupancyComponent_OccupancyHandlerImpl occupancyComponent_OccupancyHandler = new OccupancyComponent_OccupancyHandlerImpl();
		return occupancyComponent_OccupancyHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentComponent createPaymentComponent() {
		PaymentComponentImpl paymentComponent = new PaymentComponentImpl();
		return paymentComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentComponent_PaymentHandler createPaymentComponent_PaymentHandler() {
		PaymentComponent_PaymentHandlerImpl paymentComponent_PaymentHandler = new PaymentComponent_PaymentHandlerImpl();
		return paymentComponent_PaymentHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentComponent_Payment createPaymentComponent_Payment() {
		PaymentComponent_PaymentImpl paymentComponent_Payment = new PaymentComponent_PaymentImpl();
		return paymentComponent_Payment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalServiceComponent createAdditionalServiceComponent() {
		AdditionalServiceComponentImpl additionalServiceComponent = new AdditionalServiceComponentImpl();
		return additionalServiceComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalServiceComponent_AdditionalService createAdditionalServiceComponent_AdditionalService() {
		AdditionalServiceComponent_AdditionalServiceImpl additionalServiceComponent_AdditionalService = new AdditionalServiceComponent_AdditionalServiceImpl();
		return additionalServiceComponent_AdditionalService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalServiceComponent_AdditionalServiceEvent createAdditionalServiceComponent_AdditionalServiceEvent() {
		AdditionalServiceComponent_AdditionalServiceEventImpl additionalServiceComponent_AdditionalServiceEvent = new AdditionalServiceComponent_AdditionalServiceEventImpl();
		return additionalServiceComponent_AdditionalServiceEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalServiceComponent_AdditionalServiceHandler createAdditionalServiceComponent_AdditionalServiceHandler() {
		AdditionalServiceComponent_AdditionalServiceHandlerImpl additionalServiceComponent_AdditionalServiceHandler = new AdditionalServiceComponent_AdditionalServiceHandlerImpl();
		return additionalServiceComponent_AdditionalServiceHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingComponent createBookingComponent() {
		BookingComponentImpl bookingComponent = new BookingComponentImpl();
		return bookingComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingComponent_PaymentDetails createBookingComponent_PaymentDetails() {
		BookingComponent_PaymentDetailsImpl bookingComponent_PaymentDetails = new BookingComponent_PaymentDetailsImpl();
		return bookingComponent_PaymentDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingComponent_Booking createBookingComponent_Booking() {
		BookingComponent_BookingImpl bookingComponent_Booking = new BookingComponent_BookingImpl();
		return bookingComponent_Booking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingComponent_AdditionalService createBookingComponent_AdditionalService() {
		BookingComponent_AdditionalServiceImpl bookingComponent_AdditionalService = new BookingComponent_AdditionalServiceImpl();
		return bookingComponent_AdditionalService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingComponent_BookingGuest createBookingComponent_BookingGuest() {
		BookingComponent_BookingGuestImpl bookingComponent_BookingGuest = new BookingComponent_BookingGuestImpl();
		return bookingComponent_BookingGuest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingComponent_RoomType createBookingComponent_RoomType() {
		BookingComponent_RoomTypeImpl bookingComponent_RoomType = new BookingComponent_RoomTypeImpl();
		return bookingComponent_RoomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingComponent_BookingHandler createBookingComponent_BookingHandler() {
		BookingComponent_BookingHandlerImpl bookingComponent_BookingHandler = new BookingComponent_BookingHandlerImpl();
		return bookingComponent_BookingHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffComponent createStaffComponent() {
		StaffComponentImpl staffComponent = new StaffComponentImpl();
		return staffComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffComponent_AccountManager createStaffComponent_AccountManager() {
		StaffComponent_AccountManagerImpl staffComponent_AccountManager = new StaffComponent_AccountManagerImpl();
		return staffComponent_AccountManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public StaffComponent_Employee createStaffComponent_Employee() {
		StaffComponent_EmployeeImpl staffComponent_Employee = new StaffComponent_EmployeeImpl(null, null, null, null, null);
		return staffComponent_Employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomComponent createRoomComponent() {
		RoomComponentImpl roomComponent = new RoomComponentImpl();
		return roomComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomComponent_Room createRoomComponent_Room() {
		RoomComponent_RoomImpl roomComponent_Room = new RoomComponent_RoomImpl();
		return roomComponent_Room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomComponent_Bedroom createRoomComponent_Bedroom() {
		RoomComponent_BedroomImpl roomComponent_Bedroom = new RoomComponent_BedroomImpl();
		return roomComponent_Bedroom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomComponent_ConferenceRoom createRoomComponent_ConferenceRoom() {
		RoomComponent_ConferenceRoomImpl roomComponent_ConferenceRoom = new RoomComponent_ConferenceRoomImpl();
		return roomComponent_ConferenceRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomComponent_RoomHandler createRoomComponent_RoomHandler() {
		RoomComponent_RoomHandlerImpl roomComponent_RoomHandler = new RoomComponent_RoomHandlerImpl();
		return roomComponent_RoomHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bank createBank() {
		BankImpl bank = new BankImpl();
		return bank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationPackage getImplementationPackage() {
		return (ImplementationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ImplementationPackage getPackage() {
		return ImplementationPackage.eINSTANCE;
	}

} //ImplementationFactoryImpl
