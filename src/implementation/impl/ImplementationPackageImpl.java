/**
 */
package implementation.impl;

import implementation.AdditionalServiceComponent;
import implementation.AdditionalServiceComponent_AdditionalService;
import implementation.AdditionalServiceComponent_AdditionalServiceEvent;
import implementation.AdditionalServiceComponent_IAdditionalServiceAdministration;
import implementation.AdditionalServiceComponent_IAdditionalServiceDecision;
import implementation.AdditionalServiceComponent_IAdditionalServiceInformation;
import implementation.BookingComponent;
import implementation.BookingComponent_AdditionalService;
import implementation.BookingComponent_Booking;
import implementation.BookingComponent_BookingManager;
import implementation.BookingComponent_Guest;
import implementation.BookingComponent_IBooking;
import implementation.BookingComponent_IBookingDecision;
import implementation.BookingComponent_PaymentDetails;
import implementation.BookingComponent_RoomType;
import implementation.DecisionSupportComponent;
import implementation.DecisionSupportComponent_DssController;
import implementation.DecisionSupportComponent_DssPresenter;
import implementation.DecisionSupportComponent_DssProcessor;
import implementation.DecisionSupportComponent_IDecisionSupport;
import implementation.ImplementationFactory;
import implementation.ImplementationPackage;
import implementation.OccupancyComponent;
import implementation.OccupancyComponent_Guest;
import implementation.OccupancyComponent_IOccupancy;
import implementation.OccupancyComponent_IOccupancyDecision;
import implementation.OccupancyComponent_Occupancy;
import implementation.OccupancyComponent_OccupancyHandler;
import implementation.PaymentComponent;
import implementation.PaymentComponent_IPayment;
import implementation.PaymentComponent_PaymentCalculator;
import implementation.PaymentComponent_PaymentHistoryDb;
import implementation.PaymentComponent_PaymentManager;
import implementation.RoomComponent;
import implementation.RoomComponent_Bedroom;
import implementation.RoomComponent_ConferenceRoom;
import implementation.RoomComponent_IRoomAdministration;
import implementation.RoomComponent_IRoomDecision;
import implementation.RoomComponent_IRoomInformation;
import implementation.RoomComponent_Room;
import implementation.RoomComponent_RoomHandler;
import implementation.StaffComponent;
import implementation.StaffComponent_AccountManager;
import implementation.StaffComponent_Employee;
import implementation.StaffComponent_IAccountAdministration;
import implementation.StaffComponent_IAuthentication;

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
public class ImplementationPackageImpl extends EPackageImpl implements ImplementationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionSupportComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionSupportComponent_IDecisionSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionSupportComponent_DssProcessorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionSupportComponent_DssPresenterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionSupportComponent_DssControllerEClass = null;

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
	private EClass occupancyComponent_IOccupancyDecisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass occupancyComponent_OccupancyHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentComponent_PaymentManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentComponent_PaymentCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentComponent_PaymentHistoryDbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentComponent_IPaymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionalServiceComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionalServiceComponent_AdditionalServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionalServiceComponent_IAdditionalServiceDecisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionalServiceComponent_AdditionalServiceEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionalServiceComponent_IAdditionalServiceAdministrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionalServiceComponent_IAdditionalServiceInformationEClass = null;

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
	private EClass bookingComponent_IBookingDecisionEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staffComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staffComponent_AccountManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staffComponent_IAuthenticationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staffComponent_IAccountAdministrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staffComponent_EmployeeEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomComponent_IRoomDecisionEClass = null;

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
	 * @see implementation.ImplementationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ImplementationPackageImpl() {
		super(eNS_URI, ImplementationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ImplementationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ImplementationPackage init() {
		if (isInited) return (ImplementationPackage)EPackage.Registry.INSTANCE.getEPackage(ImplementationPackage.eNS_URI);

		// Obtain or create and register package
		ImplementationPackageImpl theImplementationPackage = (ImplementationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ImplementationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ImplementationPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theImplementationPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theImplementationPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theImplementationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ImplementationPackage.eNS_URI, theImplementationPackage);
		return theImplementationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecisionSupportComponent() {
		return decisionSupportComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecisionSupportComponent_IDecisionSupport() {
		return decisionSupportComponent_IDecisionSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecisionSupportComponent_DssProcessor() {
		return decisionSupportComponent_DssProcessorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecisionSupportComponent_DssPresenter() {
		return decisionSupportComponent_DssPresenterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecisionSupportComponent_DssController() {
		return decisionSupportComponent_DssControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecisionSupportComponent_DssController_DssProcessor() {
		return (EReference)decisionSupportComponent_DssControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecisionSupportComponent_DssController_DssPresenter() {
		return (EReference)decisionSupportComponent_DssControllerEClass.getEStructuralFeatures().get(1);
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
	public EClass getOccupancyComponent_IOccupancyDecision() {
		return occupancyComponent_IOccupancyDecisionEClass;
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
	public EClass getPaymentComponent() {
		return paymentComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaymentComponent_PaymentManager() {
		return paymentComponent_PaymentManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentComponent_PaymentManager_PaymentDetails() {
		return (EAttribute)paymentComponent_PaymentManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPaymentComponent_PaymentManager__MakePayment__String_int_int_int_String_String_String() {
		return paymentComponent_PaymentManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPaymentComponent_PaymentManager__IsCreditCardValid__String_String_String_String_String_String() {
		return paymentComponent_PaymentManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaymentComponent_PaymentCalculator() {
		return paymentComponent_PaymentCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentComponent_PaymentCalculator_Cost() {
		return (EAttribute)paymentComponent_PaymentCalculatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentComponent_PaymentCalculator_Details() {
		return (EAttribute)paymentComponent_PaymentCalculatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPaymentComponent_PaymentCalculator__Calculate__int_EList_String_String_boolean() {
		return paymentComponent_PaymentCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPaymentComponent_PaymentCalculator__CheckLateCancellation__String_String() {
		return paymentComponent_PaymentCalculatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaymentComponent_PaymentHistoryDb() {
		return paymentComponent_PaymentHistoryDbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentComponent_PaymentHistoryDb_PaymentHistory() {
		return (EAttribute)paymentComponent_PaymentHistoryDbEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPaymentComponent_PaymentHistoryDb__CreatePaymentHistory__int_String_String() {
		return paymentComponent_PaymentHistoryDbEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPaymentComponent_PaymentHistoryDb__SearchForPayment__String() {
		return paymentComponent_PaymentHistoryDbEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaymentComponent_IPayment() {
		return paymentComponent_IPaymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPaymentComponent_IPayment__PayForBooking__int_String_String_String_String_String_String() {
		return paymentComponent_IPaymentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPaymentComponent_IPayment__ReserveFunds__int_String_String_String_String_String_String() {
		return paymentComponent_IPaymentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPaymentComponent_IPayment__UnreserveFunds__int_String_String_String_String_String_String() {
		return paymentComponent_IPaymentEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdditionalServiceComponent() {
		return additionalServiceComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdditionalServiceComponent_AdditionalService() {
		return additionalServiceComponent_AdditionalServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdditionalServiceComponent_AdditionalService_Name() {
		return (EAttribute)additionalServiceComponent_AdditionalServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdditionalServiceComponent_AdditionalService_Usable() {
		return (EAttribute)additionalServiceComponent_AdditionalServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdditionalServiceComponent_AdditionalService_Price() {
		return (EAttribute)additionalServiceComponent_AdditionalServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdditionalServiceComponent_AdditionalService_MaxAttendant() {
		return (EAttribute)additionalServiceComponent_AdditionalServiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdditionalServiceComponent_AdditionalService_Description() {
		return (EAttribute)additionalServiceComponent_AdditionalServiceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdditionalServiceComponent_IAdditionalServiceDecision() {
		return additionalServiceComponent_IAdditionalServiceDecisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdditionalServiceComponent_AdditionalServiceEvent() {
		return additionalServiceComponent_AdditionalServiceEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdditionalServiceComponent_AdditionalServiceEvent_DateTime() {
		return (EAttribute)additionalServiceComponent_AdditionalServiceEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdditionalServiceComponent_AdditionalServiceEvent_Name() {
		return (EAttribute)additionalServiceComponent_AdditionalServiceEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdditionalServiceComponent_AdditionalServiceEvent_Location() {
		return (EAttribute)additionalServiceComponent_AdditionalServiceEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdditionalServiceComponent_AdditionalServiceEvent_Price() {
		return (EAttribute)additionalServiceComponent_AdditionalServiceEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdditionalServiceComponent_AdditionalServiceEvent_MaxAttendant() {
		return (EAttribute)additionalServiceComponent_AdditionalServiceEventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdditionalServiceComponent_AdditionalServiceEvent__GetAdditionalServiceInfo__String() {
		return additionalServiceComponent_AdditionalServiceEventEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdditionalServiceComponent_IAdditionalServiceAdministration() {
		return additionalServiceComponent_IAdditionalServiceAdministrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdditionalServiceComponent_IAdditionalServiceAdministration__CreateAdditionalService__String_int_int() {
		return additionalServiceComponent_IAdditionalServiceAdministrationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdditionalServiceComponent_IAdditionalServiceAdministration__EditAdditionalService__String_String_int_int() {
		return additionalServiceComponent_IAdditionalServiceAdministrationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdditionalServiceComponent_IAdditionalServiceAdministration__RemoveAdditionalService__String() {
		return additionalServiceComponent_IAdditionalServiceAdministrationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdditionalServiceComponent_IAdditionalServiceInformation() {
		return additionalServiceComponent_IAdditionalServiceInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdditionalServiceComponent_IAdditionalServiceInformation__GetAdditionalServiceInfo__String() {
		return additionalServiceComponent_IAdditionalServiceInformationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdditionalServiceComponent_IAdditionalServiceInformation__GetAllAdditionalServices() {
		return additionalServiceComponent_IAdditionalServiceInformationEClass.getEOperations().get(1);
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
	public EClass getBookingComponent_IBookingDecision() {
		return bookingComponent_IBookingDecisionEClass;
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
	public EClass getStaffComponent() {
		return staffComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaffComponent_AccountManager() {
		return staffComponent_AccountManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaffComponent_AccountManager__FindAccount__String() {
		return staffComponent_AccountManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaffComponent_IAuthentication() {
		return staffComponent_IAuthenticationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaffComponent_IAuthentication__LogIn__String_String() {
		return staffComponent_IAuthenticationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaffComponent_IAuthentication__LogOut__String() {
		return staffComponent_IAuthenticationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaffComponent_IAuthentication__IsLoggedIn__String() {
		return staffComponent_IAuthenticationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaffComponent_IAccountAdministration() {
		return staffComponent_IAccountAdministrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaffComponent_IAccountAdministration__CreateAccount__String_String_String_String_String() {
		return staffComponent_IAccountAdministrationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaffComponent_IAccountAdministration__EditAccountDetails__String() {
		return staffComponent_IAccountAdministrationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaffComponent_IAccountAdministration__RemoveAccount__String() {
		return staffComponent_IAccountAdministrationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaffComponent_Employee() {
		return staffComponent_EmployeeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaffComponent_Employee_Id() {
		return (EAttribute)staffComponent_EmployeeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaffComponent_Employee_Ssn() {
		return (EAttribute)staffComponent_EmployeeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaffComponent_Employee_Name() {
		return (EAttribute)staffComponent_EmployeeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaffComponent_Employee_Email() {
		return (EAttribute)staffComponent_EmployeeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaffComponent_Employee_Phone() {
		return (EAttribute)staffComponent_EmployeeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaffComponent_Employee_Password() {
		return (EAttribute)staffComponent_EmployeeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaffComponent_Employee__Employee__String_String_String_String() {
		return staffComponent_EmployeeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaffComponent_Employee__Employee() {
		return staffComponent_EmployeeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaffComponent_Employee__GetEmployeeInfo__String() {
		return staffComponent_EmployeeEClass.getEOperations().get(2);
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
	public EClass getRoomComponent_IRoomDecision() {
		return roomComponent_IRoomDecisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationFactory getImplementationFactory() {
		return (ImplementationFactory)getEFactoryInstance();
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
		decisionSupportComponentEClass = createEClass(DECISION_SUPPORT_COMPONENT);

		decisionSupportComponent_IDecisionSupportEClass = createEClass(DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT);

		decisionSupportComponent_DssProcessorEClass = createEClass(DECISION_SUPPORT_COMPONENT_DSS_PROCESSOR);

		decisionSupportComponent_DssPresenterEClass = createEClass(DECISION_SUPPORT_COMPONENT_DSS_PRESENTER);

		decisionSupportComponent_DssControllerEClass = createEClass(DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER);
		createEReference(decisionSupportComponent_DssControllerEClass, DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__DSS_PROCESSOR);
		createEReference(decisionSupportComponent_DssControllerEClass, DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__DSS_PRESENTER);

		occupancyComponent_IOccupancyEClass = createEClass(OCCUPANCY_COMPONENT_IOCCUPANCY);
		createEOperation(occupancyComponent_IOccupancyEClass, OCCUPANCY_COMPONENT_IOCCUPANCY___CHECK_IN_GUEST__STRING_STRING_STRING);
		createEOperation(occupancyComponent_IOccupancyEClass, OCCUPANCY_COMPONENT_IOCCUPANCY___CHECK_OUT_GUEST__STRING_STRING_STRING);
		createEOperation(occupancyComponent_IOccupancyEClass, OCCUPANCY_COMPONENT_IOCCUPANCY___LIST_FREE_ROOMS);
		createEOperation(occupancyComponent_IOccupancyEClass, OCCUPANCY_COMPONENT_IOCCUPANCY___LIST_GUESTS_IN_ROOM__INT);
		createEOperation(occupancyComponent_IOccupancyEClass, OCCUPANCY_COMPONENT_IOCCUPANCY___NUMBER_OF_GUESTS_IN_HOTEL);

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

		occupancyComponent_IOccupancyDecisionEClass = createEClass(OCCUPANCY_COMPONENT_IOCCUPANCY_DECISION);

		occupancyComponent_OccupancyHandlerEClass = createEClass(OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER);

		paymentComponentEClass = createEClass(PAYMENT_COMPONENT);

		paymentComponent_PaymentManagerEClass = createEClass(PAYMENT_COMPONENT_PAYMENT_MANAGER);
		createEAttribute(paymentComponent_PaymentManagerEClass, PAYMENT_COMPONENT_PAYMENT_MANAGER__PAYMENT_DETAILS);
		createEOperation(paymentComponent_PaymentManagerEClass, PAYMENT_COMPONENT_PAYMENT_MANAGER___MAKE_PAYMENT__STRING_INT_INT_INT_STRING_STRING_STRING);
		createEOperation(paymentComponent_PaymentManagerEClass, PAYMENT_COMPONENT_PAYMENT_MANAGER___IS_CREDIT_CARD_VALID__STRING_STRING_STRING_STRING_STRING_STRING);

		paymentComponent_PaymentCalculatorEClass = createEClass(PAYMENT_COMPONENT_PAYMENT_CALCULATOR);
		createEAttribute(paymentComponent_PaymentCalculatorEClass, PAYMENT_COMPONENT_PAYMENT_CALCULATOR__COST);
		createEAttribute(paymentComponent_PaymentCalculatorEClass, PAYMENT_COMPONENT_PAYMENT_CALCULATOR__DETAILS);
		createEOperation(paymentComponent_PaymentCalculatorEClass, PAYMENT_COMPONENT_PAYMENT_CALCULATOR___CALCULATE__INT_ELIST_STRING_STRING_BOOLEAN);
		createEOperation(paymentComponent_PaymentCalculatorEClass, PAYMENT_COMPONENT_PAYMENT_CALCULATOR___CHECK_LATE_CANCELLATION__STRING_STRING);

		paymentComponent_PaymentHistoryDbEClass = createEClass(PAYMENT_COMPONENT_PAYMENT_HISTORY_DB);
		createEAttribute(paymentComponent_PaymentHistoryDbEClass, PAYMENT_COMPONENT_PAYMENT_HISTORY_DB__PAYMENT_HISTORY);
		createEOperation(paymentComponent_PaymentHistoryDbEClass, PAYMENT_COMPONENT_PAYMENT_HISTORY_DB___CREATE_PAYMENT_HISTORY__INT_STRING_STRING);
		createEOperation(paymentComponent_PaymentHistoryDbEClass, PAYMENT_COMPONENT_PAYMENT_HISTORY_DB___SEARCH_FOR_PAYMENT__STRING);

		paymentComponent_IPaymentEClass = createEClass(PAYMENT_COMPONENT_IPAYMENT);
		createEOperation(paymentComponent_IPaymentEClass, PAYMENT_COMPONENT_IPAYMENT___PAY_FOR_BOOKING__INT_STRING_STRING_STRING_STRING_STRING_STRING);
		createEOperation(paymentComponent_IPaymentEClass, PAYMENT_COMPONENT_IPAYMENT___RESERVE_FUNDS__INT_STRING_STRING_STRING_STRING_STRING_STRING);
		createEOperation(paymentComponent_IPaymentEClass, PAYMENT_COMPONENT_IPAYMENT___UNRESERVE_FUNDS__INT_STRING_STRING_STRING_STRING_STRING_STRING);

		additionalServiceComponentEClass = createEClass(ADDITIONAL_SERVICE_COMPONENT);

		additionalServiceComponent_AdditionalServiceEClass = createEClass(ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE);
		createEAttribute(additionalServiceComponent_AdditionalServiceEClass, ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__NAME);
		createEAttribute(additionalServiceComponent_AdditionalServiceEClass, ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__USABLE);
		createEAttribute(additionalServiceComponent_AdditionalServiceEClass, ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__PRICE);
		createEAttribute(additionalServiceComponent_AdditionalServiceEClass, ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__MAX_ATTENDANT);
		createEAttribute(additionalServiceComponent_AdditionalServiceEClass, ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__DESCRIPTION);

		additionalServiceComponent_IAdditionalServiceDecisionEClass = createEClass(ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_DECISION);

		additionalServiceComponent_AdditionalServiceEventEClass = createEClass(ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT);
		createEAttribute(additionalServiceComponent_AdditionalServiceEventEClass, ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__DATE_TIME);
		createEAttribute(additionalServiceComponent_AdditionalServiceEventEClass, ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__NAME);
		createEAttribute(additionalServiceComponent_AdditionalServiceEventEClass, ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__LOCATION);
		createEAttribute(additionalServiceComponent_AdditionalServiceEventEClass, ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__PRICE);
		createEAttribute(additionalServiceComponent_AdditionalServiceEventEClass, ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__MAX_ATTENDANT);
		createEOperation(additionalServiceComponent_AdditionalServiceEventEClass, ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT___GET_ADDITIONAL_SERVICE_INFO__STRING);

		additionalServiceComponent_IAdditionalServiceAdministrationEClass = createEClass(ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION);
		createEOperation(additionalServiceComponent_IAdditionalServiceAdministrationEClass, ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___CREATE_ADDITIONAL_SERVICE__STRING_INT_INT);
		createEOperation(additionalServiceComponent_IAdditionalServiceAdministrationEClass, ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___EDIT_ADDITIONAL_SERVICE__STRING_STRING_INT_INT);
		createEOperation(additionalServiceComponent_IAdditionalServiceAdministrationEClass, ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___REMOVE_ADDITIONAL_SERVICE__STRING);

		additionalServiceComponent_IAdditionalServiceInformationEClass = createEClass(ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_INFORMATION);
		createEOperation(additionalServiceComponent_IAdditionalServiceInformationEClass, ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_INFORMATION___GET_ADDITIONAL_SERVICE_INFO__STRING);
		createEOperation(additionalServiceComponent_IAdditionalServiceInformationEClass, ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_INFORMATION___GET_ALL_ADDITIONAL_SERVICES);

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

		bookingComponent_IBookingDecisionEClass = createEClass(BOOKING_COMPONENT_IBOOKING_DECISION);

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

		staffComponentEClass = createEClass(STAFF_COMPONENT);

		staffComponent_AccountManagerEClass = createEClass(STAFF_COMPONENT_ACCOUNT_MANAGER);
		createEOperation(staffComponent_AccountManagerEClass, STAFF_COMPONENT_ACCOUNT_MANAGER___FIND_ACCOUNT__STRING);

		staffComponent_IAuthenticationEClass = createEClass(STAFF_COMPONENT_IAUTHENTICATION);
		createEOperation(staffComponent_IAuthenticationEClass, STAFF_COMPONENT_IAUTHENTICATION___LOG_IN__STRING_STRING);
		createEOperation(staffComponent_IAuthenticationEClass, STAFF_COMPONENT_IAUTHENTICATION___LOG_OUT__STRING);
		createEOperation(staffComponent_IAuthenticationEClass, STAFF_COMPONENT_IAUTHENTICATION___IS_LOGGED_IN__STRING);

		staffComponent_IAccountAdministrationEClass = createEClass(STAFF_COMPONENT_IACCOUNT_ADMINISTRATION);
		createEOperation(staffComponent_IAccountAdministrationEClass, STAFF_COMPONENT_IACCOUNT_ADMINISTRATION___CREATE_ACCOUNT__STRING_STRING_STRING_STRING_STRING);
		createEOperation(staffComponent_IAccountAdministrationEClass, STAFF_COMPONENT_IACCOUNT_ADMINISTRATION___EDIT_ACCOUNT_DETAILS__STRING);
		createEOperation(staffComponent_IAccountAdministrationEClass, STAFF_COMPONENT_IACCOUNT_ADMINISTRATION___REMOVE_ACCOUNT__STRING);

		staffComponent_EmployeeEClass = createEClass(STAFF_COMPONENT_EMPLOYEE);
		createEAttribute(staffComponent_EmployeeEClass, STAFF_COMPONENT_EMPLOYEE__ID);
		createEAttribute(staffComponent_EmployeeEClass, STAFF_COMPONENT_EMPLOYEE__SSN);
		createEAttribute(staffComponent_EmployeeEClass, STAFF_COMPONENT_EMPLOYEE__NAME);
		createEAttribute(staffComponent_EmployeeEClass, STAFF_COMPONENT_EMPLOYEE__EMAIL);
		createEAttribute(staffComponent_EmployeeEClass, STAFF_COMPONENT_EMPLOYEE__PHONE);
		createEAttribute(staffComponent_EmployeeEClass, STAFF_COMPONENT_EMPLOYEE__PASSWORD);
		createEOperation(staffComponent_EmployeeEClass, STAFF_COMPONENT_EMPLOYEE___EMPLOYEE__STRING_STRING_STRING_STRING);
		createEOperation(staffComponent_EmployeeEClass, STAFF_COMPONENT_EMPLOYEE___EMPLOYEE);
		createEOperation(staffComponent_EmployeeEClass, STAFF_COMPONENT_EMPLOYEE___GET_EMPLOYEE_INFO__STRING);

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

		roomComponent_IRoomDecisionEClass = createEClass(ROOM_COMPONENT_IROOM_DECISION);
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
		decisionSupportComponent_DssControllerEClass.getESuperTypes().add(this.getOccupancyComponent_IOccupancy());
		additionalServiceComponent_AdditionalServiceEClass.getESuperTypes().add(this.getAdditionalServiceComponent_IAdditionalServiceDecision());
		bookingComponent_BookingManagerEClass.getESuperTypes().add(this.getBookingComponent_IBookingDecision());
		staffComponent_AccountManagerEClass.getESuperTypes().add(this.getStaffComponent_IAuthentication());
		staffComponent_AccountManagerEClass.getESuperTypes().add(this.getStaffComponent_IAccountAdministration());
		roomComponent_BedroomEClass.getESuperTypes().add(this.getRoomComponent_Room());
		roomComponent_ConferenceRoomEClass.getESuperTypes().add(this.getRoomComponent_Room());
		roomComponent_RoomHandlerEClass.getESuperTypes().add(this.getRoomComponent_IRoomDecision());

		// Initialize classes, features, and operations; add parameters
		initEClass(decisionSupportComponentEClass, DecisionSupportComponent.class, "DecisionSupportComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(decisionSupportComponent_IDecisionSupportEClass, DecisionSupportComponent_IDecisionSupport.class, "DecisionSupportComponent_IDecisionSupport", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(decisionSupportComponent_DssProcessorEClass, DecisionSupportComponent_DssProcessor.class, "DecisionSupportComponent_DssProcessor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(decisionSupportComponent_DssPresenterEClass, DecisionSupportComponent_DssPresenter.class, "DecisionSupportComponent_DssPresenter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(decisionSupportComponent_DssControllerEClass, DecisionSupportComponent_DssController.class, "DecisionSupportComponent_DssController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDecisionSupportComponent_DssController_DssProcessor(), this.getDecisionSupportComponent_DssProcessor(), null, "dssProcessor", null, 0, -1, DecisionSupportComponent_DssController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDecisionSupportComponent_DssController_DssPresenter(), this.getDecisionSupportComponent_DssPresenter(), null, "dssPresenter", null, 1, 1, DecisionSupportComponent_DssController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(occupancyComponent_IOccupancyEClass, OccupancyComponent_IOccupancy.class, "OccupancyComponent_IOccupancy", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getOccupancyComponent_IOccupancy__CheckInGuest__String_String_String(), null, "checkInGuest", 1, 1, IS_UNIQUE, !IS_ORDERED);
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

		initEClass(occupancyComponentEClass, OccupancyComponent.class, "OccupancyComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(occupancyComponent_OccupancyEClass, OccupancyComponent_Occupancy.class, "OccupancyComponent_Occupancy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOccupancyComponent_Occupancy_RoomNumber(), theTypesPackage.getInteger(), "roomNumber", null, 1, 1, OccupancyComponent_Occupancy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOccupancyComponent_Occupancy_CheckInDateTime(), theTypesPackage.getInteger(), "checkInDateTime", null, 1, 1, OccupancyComponent_Occupancy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOccupancyComponent_Occupancy_CheckOutDateTime(), theTypesPackage.getInteger(), "checkOutDateTime", null, 1, 1, OccupancyComponent_Occupancy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOccupancyComponent_Occupancy_Guest(), this.getOccupancyComponent_Guest(), null, "guest", null, 1, -1, OccupancyComponent_Occupancy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOccupancyComponent_Occupancy_BookingReference(), theTypesPackage.getString(), "bookingReference", null, 1, 1, OccupancyComponent_Occupancy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getOccupancyComponent_Occupancy__Occupancy__int_int_OccupancyComponent_Guest_String(), null, "occupancy", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "checkInDateTime", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getOccupancyComponent_Guest(), "guest", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookingReference", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(occupancyComponent_GuestEClass, OccupancyComponent_Guest.class, "OccupancyComponent_Guest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOccupancyComponent_Guest_FirstName(), theTypesPackage.getString(), "firstName", null, 1, 1, OccupancyComponent_Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOccupancyComponent_Guest_LastName(), theTypesPackage.getString(), "lastName", null, 1, 1, OccupancyComponent_Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getOccupancyComponent_Guest__Guest__String_String(), null, "guest", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(occupancyComponent_IOccupancyDecisionEClass, OccupancyComponent_IOccupancyDecision.class, "OccupancyComponent_IOccupancyDecision", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(occupancyComponent_OccupancyHandlerEClass, OccupancyComponent_OccupancyHandler.class, "OccupancyComponent_OccupancyHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(paymentComponentEClass, PaymentComponent.class, "PaymentComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(paymentComponent_PaymentManagerEClass, PaymentComponent_PaymentManager.class, "PaymentComponent_PaymentManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaymentComponent_PaymentManager_PaymentDetails(), theTypesPackage.getString(), "paymentDetails", null, 1, 1, PaymentComponent_PaymentManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getPaymentComponent_PaymentManager__MakePayment__String_int_int_int_String_String_String(), null, "makePayment", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "amount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "expireMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "expiryYear", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getPaymentComponent_PaymentManager__IsCreditCardValid__String_String_String_String_String_String(), null, "isCreditCardValid", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "expiryMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "expiryYear", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(paymentComponent_PaymentCalculatorEClass, PaymentComponent_PaymentCalculator.class, "PaymentComponent_PaymentCalculator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaymentComponent_PaymentCalculator_Cost(), theTypesPackage.getInteger(), "cost", null, 1, 1, PaymentComponent_PaymentCalculator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPaymentComponent_PaymentCalculator_Details(), theTypesPackage.getString(), "details", null, 1, -1, PaymentComponent_PaymentCalculator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getPaymentComponent_PaymentCalculator__Calculate__int_EList_String_String_boolean(), null, "calculate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "additionalService", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "checkInDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "checkOutDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getBoolean(), "isLateCancellation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getPaymentComponent_PaymentCalculator__CheckLateCancellation__String_String(), null, "checkLateCancellation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "cancelDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "arrivalDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(paymentComponent_PaymentHistoryDbEClass, PaymentComponent_PaymentHistoryDb.class, "PaymentComponent_PaymentHistoryDb", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaymentComponent_PaymentHistoryDb_PaymentHistory(), theTypesPackage.getString(), "paymentHistory", null, 1, 1, PaymentComponent_PaymentHistoryDb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getPaymentComponent_PaymentHistoryDb__CreatePaymentHistory__int_String_String(), null, "createPaymentHistory", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "amount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "paymentDateAndTime", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "customerName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getPaymentComponent_PaymentHistoryDb__SearchForPayment__String(), null, "searchForPayment", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "paymentDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(paymentComponent_IPaymentEClass, PaymentComponent_IPayment.class, "PaymentComponent_IPayment", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getPaymentComponent_IPayment__PayForBooking__int_String_String_String_String_String_String(), null, "payForBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "amount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "expiryMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "expiryYear", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getPaymentComponent_IPayment__ReserveFunds__int_String_String_String_String_String_String(), null, "reserveFunds", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "amount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "expiryMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "expiryYear", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getPaymentComponent_IPayment__UnreserveFunds__int_String_String_String_String_String_String(), null, "unreserveFunds", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "amount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "expiryMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "expiryYear", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(additionalServiceComponentEClass, AdditionalServiceComponent.class, "AdditionalServiceComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(additionalServiceComponent_AdditionalServiceEClass, AdditionalServiceComponent_AdditionalService.class, "AdditionalServiceComponent_AdditionalService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdditionalServiceComponent_AdditionalService_Name(), theTypesPackage.getString(), "name", null, 1, 1, AdditionalServiceComponent_AdditionalService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAdditionalServiceComponent_AdditionalService_Usable(), theTypesPackage.getBoolean(), "usable", null, 1, 1, AdditionalServiceComponent_AdditionalService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAdditionalServiceComponent_AdditionalService_Price(), theTypesPackage.getInteger(), "price", null, 1, 1, AdditionalServiceComponent_AdditionalService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAdditionalServiceComponent_AdditionalService_MaxAttendant(), theTypesPackage.getInteger(), "maxAttendant", null, 1, 1, AdditionalServiceComponent_AdditionalService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAdditionalServiceComponent_AdditionalService_Description(), theTypesPackage.getString(), "description", null, 1, 1, AdditionalServiceComponent_AdditionalService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(additionalServiceComponent_IAdditionalServiceDecisionEClass, AdditionalServiceComponent_IAdditionalServiceDecision.class, "AdditionalServiceComponent_IAdditionalServiceDecision", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(additionalServiceComponent_AdditionalServiceEventEClass, AdditionalServiceComponent_AdditionalServiceEvent.class, "AdditionalServiceComponent_AdditionalServiceEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdditionalServiceComponent_AdditionalServiceEvent_DateTime(), ecorePackage.getEDate(), "dateTime", null, 1, 1, AdditionalServiceComponent_AdditionalServiceEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAdditionalServiceComponent_AdditionalServiceEvent_Name(), theTypesPackage.getString(), "name", null, 1, 1, AdditionalServiceComponent_AdditionalServiceEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAdditionalServiceComponent_AdditionalServiceEvent_Location(), theTypesPackage.getString(), "location", null, 1, 1, AdditionalServiceComponent_AdditionalServiceEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAdditionalServiceComponent_AdditionalServiceEvent_Price(), theTypesPackage.getInteger(), "price", null, 1, 1, AdditionalServiceComponent_AdditionalServiceEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAdditionalServiceComponent_AdditionalServiceEvent_MaxAttendant(), theTypesPackage.getInteger(), "maxAttendant", null, 1, 1, AdditionalServiceComponent_AdditionalServiceEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getAdditionalServiceComponent_AdditionalServiceEvent__GetAdditionalServiceInfo__String(), null, "getAdditionalServiceInfo", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "addtionalServiceName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(additionalServiceComponent_IAdditionalServiceAdministrationEClass, AdditionalServiceComponent_IAdditionalServiceAdministration.class, "AdditionalServiceComponent_IAdditionalServiceAdministration", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getAdditionalServiceComponent_IAdditionalServiceAdministration__CreateAdditionalService__String_int_int(), null, "createAdditionalService", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "maxAttendants", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getAdditionalServiceComponent_IAdditionalServiceAdministration__EditAdditionalService__String_String_int_int(), null, "editAdditionalService", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "oldName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "maxAttendants", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getAdditionalServiceComponent_IAdditionalServiceAdministration__RemoveAdditionalService__String(), null, "removeAdditionalService", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(additionalServiceComponent_IAdditionalServiceInformationEClass, AdditionalServiceComponent_IAdditionalServiceInformation.class, "AdditionalServiceComponent_IAdditionalServiceInformation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getAdditionalServiceComponent_IAdditionalServiceInformation__GetAdditionalServiceInfo__String(), null, "getAdditionalServiceInfo", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getAdditionalServiceComponent_IAdditionalServiceInformation__GetAllAdditionalServices(), null, "getAllAdditionalServices", 1, 1, IS_UNIQUE, !IS_ORDERED);

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

		initEOperation(getBookingComponent_Booking__BookingObject(), null, "bookingObject", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingComponent_Booking__Booking__Date_Date(), null, "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "arrivalDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "departureDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingComponent_Booking__AddAdditionalServiceToBooking__BookingComponent_AdditionalService(), null, "addAdditionalServiceToBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBookingComponent_AdditionalService(), "newService", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingComponent_Booking__Booking__String_Date_Date_String_String_String_String_String_String_String_String_String(), null, "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "arrivalDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "departureDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "customerSsn", 1, 1, IS_UNIQUE, !IS_ORDERED);
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

		initEOperation(getBookingComponent_BookingManager__BookingManager(), null, "bookingManager", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(bookingComponent_IBookingDecisionEClass, BookingComponent_IBookingDecision.class, "BookingComponent_IBookingDecision", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		addEParameter(op, theTypesPackage.getString(), "customerSsn", 1, 1, IS_UNIQUE, !IS_ORDERED);
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

		initEClass(staffComponentEClass, StaffComponent.class, "StaffComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(staffComponent_AccountManagerEClass, StaffComponent_AccountManager.class, "StaffComponent_AccountManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getStaffComponent_AccountManager__FindAccount__String(), this.getStaffComponent_Employee(), "findAccount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ssn", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(staffComponent_IAuthenticationEClass, StaffComponent_IAuthentication.class, "StaffComponent_IAuthentication", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getStaffComponent_IAuthentication__LogIn__String_String(), null, "logIn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ssn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "password", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getStaffComponent_IAuthentication__LogOut__String(), null, "logOut", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ssn", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getStaffComponent_IAuthentication__IsLoggedIn__String(), null, "isLoggedIn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ssn", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(staffComponent_IAccountAdministrationEClass, StaffComponent_IAccountAdministration.class, "StaffComponent_IAccountAdministration", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getStaffComponent_IAccountAdministration__CreateAccount__String_String_String_String_String(), theTypesPackage.getInteger(), "createAccount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ssn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "email", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "phone", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "password", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getStaffComponent_IAccountAdministration__EditAccountDetails__String(), theTypesPackage.getString(), "editAccountDetails", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ssn", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getStaffComponent_IAccountAdministration__RemoveAccount__String(), null, "removeAccount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ssn", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(staffComponent_EmployeeEClass, StaffComponent_Employee.class, "StaffComponent_Employee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStaffComponent_Employee_Id(), theTypesPackage.getInteger(), "id", null, 1, 1, StaffComponent_Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStaffComponent_Employee_Ssn(), theTypesPackage.getString(), "ssn", null, 1, 1, StaffComponent_Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStaffComponent_Employee_Name(), theTypesPackage.getString(), "name", null, 1, 1, StaffComponent_Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStaffComponent_Employee_Email(), theTypesPackage.getString(), "email", null, 1, 1, StaffComponent_Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStaffComponent_Employee_Phone(), theTypesPackage.getString(), "phone", null, 1, 1, StaffComponent_Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStaffComponent_Employee_Password(), theTypesPackage.getString(), "password", null, 1, 1, StaffComponent_Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getStaffComponent_Employee__Employee__String_String_String_String(), null, "employee", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ssn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "email", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "phone", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getStaffComponent_Employee__Employee(), null, "employee", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getStaffComponent_Employee__GetEmployeeInfo__String(), this.getStaffComponent_Employee(), "getEmployeeInfo", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ssn", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomComponentEClass, RoomComponent.class, "RoomComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roomComponent_RoomEClass, RoomComponent_Room.class, "RoomComponent_Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomComponent_Room_RoomNumber(), theTypesPackage.getInteger(), "roomNumber", null, 1, 1, RoomComponent_Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomComponent_Room_Usable(), theTypesPackage.getBoolean(), "usable", null, 1, 1, RoomComponent_Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomComponent_Room_Price(), theTypesPackage.getInteger(), "price", null, 1, 1, RoomComponent_Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomComponent_Room_RoomTypeName(), theTypesPackage.getString(), "roomTypeName", null, 1, 1, RoomComponent_Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomComponent_Room_Description(), theTypesPackage.getString(), "description", null, 1, 1, RoomComponent_Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomComponent_BedroomEClass, RoomComponent_Bedroom.class, "RoomComponent_Bedroom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomComponent_Bedroom_BedCount(), theTypesPackage.getInteger(), "bedCount", null, 1, 1, RoomComponent_Bedroom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getRoomComponent_Bedroom__CreateBedroom__int_boolean_int_String_String_int(), null, "createBedroom", 1, 1, IS_UNIQUE, !IS_ORDERED);
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

		initEClass(roomComponent_IRoomDecisionEClass, RoomComponent_IRoomDecision.class, "RoomComponent_IRoomDecision", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
		// http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName
		createEmofAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "originalName", "Implementation"
		   });	
		addAnnotation
		  (decisionSupportComponent_DssProcessorEClass, 
		   source, 
		   new String[] {
			 "originalName", "DSSProcessor"
		   });	
		addAnnotation
		  (decisionSupportComponent_DssPresenterEClass, 
		   source, 
		   new String[] {
			 "originalName", "DSSPresenter"
		   });	
		addAnnotation
		  (decisionSupportComponent_DssControllerEClass, 
		   source, 
		   new String[] {
			 "originalName", "DSSController"
		   });	
		addAnnotation
		  (getDecisionSupportComponent_DssController_DssProcessor(), 
		   source, 
		   new String[] {
			 "originalName", "dSSProcessor"
		   });	
		addAnnotation
		  (getDecisionSupportComponent_DssController_DssPresenter(), 
		   source, 
		   new String[] {
			 "originalName", "dSSPresenter"
		   });	
		addAnnotation
		  (getOccupancyComponent_Occupancy__Occupancy__int_int_OccupancyComponent_Guest_String(), 
		   source, 
		   new String[] {
			 "originalName", "Occupancy"
		   });	
		addAnnotation
		  ((getOccupancyComponent_Occupancy__Occupancy__int_int_OccupancyComponent_Guest_String()).getEParameters().get(2), 
		   source, 
		   new String[] {
			 "originalName", "Guest"
		   });	
		addAnnotation
		  (getOccupancyComponent_Occupancy_Guest(), 
		   source, 
		   new String[] {
			 "originalName", "Guest"
		   });	
		addAnnotation
		  (getOccupancyComponent_Guest__Guest__String_String(), 
		   source, 
		   new String[] {
			 "originalName", "Guest"
		   });	
		addAnnotation
		  (paymentComponent_PaymentHistoryDbEClass, 
		   source, 
		   new String[] {
			 "originalName", "PaymentHistoryDB"
		   });	
		addAnnotation
		  (getAdditionalServiceComponent_AdditionalService_Description(), 
		   source, 
		   new String[] {
			 "originalName", "Description"
		   });	
		addAnnotation
		  (getBookingComponent_Booking__BookingObject(), 
		   source, 
		   new String[] {
			 "originalName", "BookingObject"
		   });	
		addAnnotation
		  (getBookingComponent_Booking__Booking__Date_Date(), 
		   source, 
		   new String[] {
			 "originalName", "Booking"
		   });	
		addAnnotation
		  (getBookingComponent_Booking__Booking__String_Date_Date_String_String_String_String_String_String_String_String_String(), 
		   source, 
		   new String[] {
			 "originalName", "Booking"
		   });	
		addAnnotation
		  ((getBookingComponent_Booking__Booking__String_Date_Date_String_String_String_String_String_String_String_String_String()).getEParameters().get(3), 
		   source, 
		   new String[] {
			 "originalName", "customerSSN"
		   });	
		addAnnotation
		  (getBookingComponent_BookingManager__BookingManager(), 
		   source, 
		   new String[] {
			 "originalName", "BookingManager"
		   });	
		addAnnotation
		  ((getBookingComponent_IBooking__MakeBooking__String_Date_Date_String_String_String_String_String_String_String_String_String()).getEParameters().get(3), 
		   source, 
		   new String[] {
			 "originalName", "customerSSN"
		   });	
		addAnnotation
		  (getStaffComponent_Employee__Employee__String_String_String_String(), 
		   source, 
		   new String[] {
			 "originalName", "Employee"
		   });	
		addAnnotation
		  (getStaffComponent_Employee__Employee(), 
		   source, 
		   new String[] {
			 "originalName", "Employee"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEmofAnnotations() {
		String source = "http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName";	
		addAnnotation
		  (getDecisionSupportComponent_DssController_DssProcessor(), 
		   source, 
		   new String[] {
			 "body", "dSSController"
		   });	
		addAnnotation
		  (getDecisionSupportComponent_DssController_DssPresenter(), 
		   source, 
		   new String[] {
			 "body", "dSSController"
		   });
	}

} //ImplementationPackageImpl
