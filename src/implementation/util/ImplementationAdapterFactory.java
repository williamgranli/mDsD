/**
 */
package implementation.util;

import implementation.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see implementation.ImplementationPackage
 * @generated
 */
public class ImplementationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ImplementationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ImplementationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationSwitch<Adapter> modelSwitch =
		new ImplementationSwitch<Adapter>() {
			@Override
			public Adapter caseDecisionSupportComponent(DecisionSupportComponent object) {
				return createDecisionSupportComponentAdapter();
			}
			@Override
			public Adapter caseDecisionSupportComponent_IDecisionSupport(DecisionSupportComponent_IDecisionSupport object) {
				return createDecisionSupportComponent_IDecisionSupportAdapter();
			}
			@Override
			public Adapter caseDecisionSupportComponent_DssProcessor(DecisionSupportComponent_DssProcessor object) {
				return createDecisionSupportComponent_DssProcessorAdapter();
			}
			@Override
			public Adapter caseDecisionSupportComponent_DssPresenter(DecisionSupportComponent_DssPresenter object) {
				return createDecisionSupportComponent_DssPresenterAdapter();
			}
			@Override
			public Adapter caseDecisionSupportComponent_DssController(DecisionSupportComponent_DssController object) {
				return createDecisionSupportComponent_DssControllerAdapter();
			}
			@Override
			public Adapter caseOccupancyComponent_IOccupancy(OccupancyComponent_IOccupancy object) {
				return createOccupancyComponent_IOccupancyAdapter();
			}
			@Override
			public Adapter caseOccupancyComponent(OccupancyComponent object) {
				return createOccupancyComponentAdapter();
			}
			@Override
			public Adapter caseOccupancyComponent_Occupancy(OccupancyComponent_Occupancy object) {
				return createOccupancyComponent_OccupancyAdapter();
			}
			@Override
			public Adapter caseOccupancyComponent_Guest(OccupancyComponent_Guest object) {
				return createOccupancyComponent_GuestAdapter();
			}
			@Override
			public Adapter caseOccupancyComponent_IOccupancyDecision(OccupancyComponent_IOccupancyDecision object) {
				return createOccupancyComponent_IOccupancyDecisionAdapter();
			}
			@Override
			public Adapter caseOccupancyComponent_OccupancyHandler(OccupancyComponent_OccupancyHandler object) {
				return createOccupancyComponent_OccupancyHandlerAdapter();
			}
			@Override
			public Adapter casePaymentComponent(PaymentComponent object) {
				return createPaymentComponentAdapter();
			}
			@Override
			public Adapter casePaymentComponent_PaymentManager(PaymentComponent_PaymentManager object) {
				return createPaymentComponent_PaymentManagerAdapter();
			}
			@Override
			public Adapter casePaymentComponent_PaymentCalculator(PaymentComponent_PaymentCalculator object) {
				return createPaymentComponent_PaymentCalculatorAdapter();
			}
			@Override
			public Adapter casePaymentComponent_PaymentHistoryDb(PaymentComponent_PaymentHistoryDb object) {
				return createPaymentComponent_PaymentHistoryDbAdapter();
			}
			@Override
			public Adapter casePaymentComponent_IPayment(PaymentComponent_IPayment object) {
				return createPaymentComponent_IPaymentAdapter();
			}
			@Override
			public Adapter caseAdditionalServiceComponent(AdditionalServiceComponent object) {
				return createAdditionalServiceComponentAdapter();
			}
			@Override
			public Adapter caseAdditionalServiceComponent_AdditionalService(AdditionalServiceComponent_AdditionalService object) {
				return createAdditionalServiceComponent_AdditionalServiceAdapter();
			}
			@Override
			public Adapter caseAdditionalServiceComponent_IAdditionalServiceDecision(AdditionalServiceComponent_IAdditionalServiceDecision object) {
				return createAdditionalServiceComponent_IAdditionalServiceDecisionAdapter();
			}
			@Override
			public Adapter caseAdditionalServiceComponent_AdditionalServiceEvent(AdditionalServiceComponent_AdditionalServiceEvent object) {
				return createAdditionalServiceComponent_AdditionalServiceEventAdapter();
			}
			@Override
			public Adapter caseAdditionalServiceComponent_IAdditionalServiceAdministration(AdditionalServiceComponent_IAdditionalServiceAdministration object) {
				return createAdditionalServiceComponent_IAdditionalServiceAdministrationAdapter();
			}
			@Override
			public Adapter caseAdditionalServiceComponent_IAdditionalServiceInformation(AdditionalServiceComponent_IAdditionalServiceInformation object) {
				return createAdditionalServiceComponent_IAdditionalServiceInformationAdapter();
			}
			@Override
			public Adapter caseBookingComponent(BookingComponent object) {
				return createBookingComponentAdapter();
			}
			@Override
			public Adapter caseBookingComponent_PaymentDetails(BookingComponent_PaymentDetails object) {
				return createBookingComponent_PaymentDetailsAdapter();
			}
			@Override
			public Adapter caseBookingComponent_Booking(BookingComponent_Booking object) {
				return createBookingComponent_BookingAdapter();
			}
			@Override
			public Adapter caseBookingComponent_AdditionalService(BookingComponent_AdditionalService object) {
				return createBookingComponent_AdditionalServiceAdapter();
			}
			@Override
			public Adapter caseBookingComponent_RoomType(BookingComponent_RoomType object) {
				return createBookingComponent_RoomTypeAdapter();
			}
			@Override
			public Adapter caseBookingComponent_BookingManager(BookingComponent_BookingManager object) {
				return createBookingComponent_BookingManagerAdapter();
			}
			@Override
			public Adapter caseBookingComponent_IBookingDecision(BookingComponent_IBookingDecision object) {
				return createBookingComponent_IBookingDecisionAdapter();
			}
			@Override
			public Adapter caseBookingComponent_IBooking(BookingComponent_IBooking object) {
				return createBookingComponent_IBookingAdapter();
			}
			@Override
			public Adapter caseBookingComponent_Guest(BookingComponent_Guest object) {
				return createBookingComponent_GuestAdapter();
			}
			@Override
			public Adapter caseStaffComponent(StaffComponent object) {
				return createStaffComponentAdapter();
			}
			@Override
			public Adapter caseStaffComponent_AccountManager(StaffComponent_AccountManager object) {
				return createStaffComponent_AccountManagerAdapter();
			}
			@Override
			public Adapter caseStaffComponent_IAuthentication(StaffComponent_IAuthentication object) {
				return createStaffComponent_IAuthenticationAdapter();
			}
			@Override
			public Adapter caseStaffComponent_IAccountAdministration(StaffComponent_IAccountAdministration object) {
				return createStaffComponent_IAccountAdministrationAdapter();
			}
			@Override
			public Adapter caseStaffComponent_Employee(StaffComponent_Employee object) {
				return createStaffComponent_EmployeeAdapter();
			}
			@Override
			public Adapter caseRoomComponent(RoomComponent object) {
				return createRoomComponentAdapter();
			}
			@Override
			public Adapter caseRoomComponent_Room(RoomComponent_Room object) {
				return createRoomComponent_RoomAdapter();
			}
			@Override
			public Adapter caseRoomComponent_Bedroom(RoomComponent_Bedroom object) {
				return createRoomComponent_BedroomAdapter();
			}
			@Override
			public Adapter caseRoomComponent_ConferenceRoom(RoomComponent_ConferenceRoom object) {
				return createRoomComponent_ConferenceRoomAdapter();
			}
			@Override
			public Adapter caseRoomComponent_IRoomAdministration(RoomComponent_IRoomAdministration object) {
				return createRoomComponent_IRoomAdministrationAdapter();
			}
			@Override
			public Adapter caseRoomComponent_IRoomInformation(RoomComponent_IRoomInformation object) {
				return createRoomComponent_IRoomInformationAdapter();
			}
			@Override
			public Adapter caseRoomComponent_RoomHandler(RoomComponent_RoomHandler object) {
				return createRoomComponent_RoomHandlerAdapter();
			}
			@Override
			public Adapter caseRoomComponent_IRoomDecision(RoomComponent_IRoomDecision object) {
				return createRoomComponent_IRoomDecisionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link implementation.DecisionSupportComponent <em>Decision Support Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.DecisionSupportComponent
	 * @generated
	 */
	public Adapter createDecisionSupportComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.DecisionSupportComponent_IDecisionSupport <em>Decision Support Component IDecision Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.DecisionSupportComponent_IDecisionSupport
	 * @generated
	 */
	public Adapter createDecisionSupportComponent_IDecisionSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.DecisionSupportComponent_DssProcessor <em>Decision Support Component Dss Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.DecisionSupportComponent_DssProcessor
	 * @generated
	 */
	public Adapter createDecisionSupportComponent_DssProcessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.DecisionSupportComponent_DssPresenter <em>Decision Support Component Dss Presenter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.DecisionSupportComponent_DssPresenter
	 * @generated
	 */
	public Adapter createDecisionSupportComponent_DssPresenterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.DecisionSupportComponent_DssController <em>Decision Support Component Dss Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.DecisionSupportComponent_DssController
	 * @generated
	 */
	public Adapter createDecisionSupportComponent_DssControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.OccupancyComponent_IOccupancy <em>Occupancy Component IOccupancy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.OccupancyComponent_IOccupancy
	 * @generated
	 */
	public Adapter createOccupancyComponent_IOccupancyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.OccupancyComponent <em>Occupancy Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.OccupancyComponent
	 * @generated
	 */
	public Adapter createOccupancyComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.OccupancyComponent_Occupancy <em>Occupancy Component Occupancy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.OccupancyComponent_Occupancy
	 * @generated
	 */
	public Adapter createOccupancyComponent_OccupancyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.OccupancyComponent_Guest <em>Occupancy Component Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.OccupancyComponent_Guest
	 * @generated
	 */
	public Adapter createOccupancyComponent_GuestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.OccupancyComponent_IOccupancyDecision <em>Occupancy Component IOccupancy Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.OccupancyComponent_IOccupancyDecision
	 * @generated
	 */
	public Adapter createOccupancyComponent_IOccupancyDecisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.OccupancyComponent_OccupancyHandler <em>Occupancy Component Occupancy Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.OccupancyComponent_OccupancyHandler
	 * @generated
	 */
	public Adapter createOccupancyComponent_OccupancyHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.PaymentComponent <em>Payment Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.PaymentComponent
	 * @generated
	 */
	public Adapter createPaymentComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.PaymentComponent_PaymentManager <em>Payment Component Payment Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.PaymentComponent_PaymentManager
	 * @generated
	 */
	public Adapter createPaymentComponent_PaymentManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.PaymentComponent_PaymentCalculator <em>Payment Component Payment Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.PaymentComponent_PaymentCalculator
	 * @generated
	 */
	public Adapter createPaymentComponent_PaymentCalculatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.PaymentComponent_PaymentHistoryDb <em>Payment Component Payment History Db</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.PaymentComponent_PaymentHistoryDb
	 * @generated
	 */
	public Adapter createPaymentComponent_PaymentHistoryDbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.PaymentComponent_IPayment <em>Payment Component IPayment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.PaymentComponent_IPayment
	 * @generated
	 */
	public Adapter createPaymentComponent_IPaymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.AdditionalServiceComponent <em>Additional Service Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.AdditionalServiceComponent
	 * @generated
	 */
	public Adapter createAdditionalServiceComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.AdditionalServiceComponent_AdditionalService <em>Additional Service Component Additional Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.AdditionalServiceComponent_AdditionalService
	 * @generated
	 */
	public Adapter createAdditionalServiceComponent_AdditionalServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.AdditionalServiceComponent_IAdditionalServiceDecision <em>Additional Service Component IAdditional Service Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.AdditionalServiceComponent_IAdditionalServiceDecision
	 * @generated
	 */
	public Adapter createAdditionalServiceComponent_IAdditionalServiceDecisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.AdditionalServiceComponent_AdditionalServiceEvent <em>Additional Service Component Additional Service Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.AdditionalServiceComponent_AdditionalServiceEvent
	 * @generated
	 */
	public Adapter createAdditionalServiceComponent_AdditionalServiceEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.AdditionalServiceComponent_IAdditionalServiceAdministration <em>Additional Service Component IAdditional Service Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.AdditionalServiceComponent_IAdditionalServiceAdministration
	 * @generated
	 */
	public Adapter createAdditionalServiceComponent_IAdditionalServiceAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.AdditionalServiceComponent_IAdditionalServiceInformation <em>Additional Service Component IAdditional Service Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.AdditionalServiceComponent_IAdditionalServiceInformation
	 * @generated
	 */
	public Adapter createAdditionalServiceComponent_IAdditionalServiceInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.BookingComponent <em>Booking Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.BookingComponent
	 * @generated
	 */
	public Adapter createBookingComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.BookingComponent_PaymentDetails <em>Booking Component Payment Details</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.BookingComponent_PaymentDetails
	 * @generated
	 */
	public Adapter createBookingComponent_PaymentDetailsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.BookingComponent_Booking <em>Booking Component Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.BookingComponent_Booking
	 * @generated
	 */
	public Adapter createBookingComponent_BookingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.BookingComponent_AdditionalService <em>Booking Component Additional Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.BookingComponent_AdditionalService
	 * @generated
	 */
	public Adapter createBookingComponent_AdditionalServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.BookingComponent_RoomType <em>Booking Component Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.BookingComponent_RoomType
	 * @generated
	 */
	public Adapter createBookingComponent_RoomTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.BookingComponent_BookingManager <em>Booking Component Booking Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.BookingComponent_BookingManager
	 * @generated
	 */
	public Adapter createBookingComponent_BookingManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.BookingComponent_IBookingDecision <em>Booking Component IBooking Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.BookingComponent_IBookingDecision
	 * @generated
	 */
	public Adapter createBookingComponent_IBookingDecisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.BookingComponent_IBooking <em>Booking Component IBooking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.BookingComponent_IBooking
	 * @generated
	 */
	public Adapter createBookingComponent_IBookingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.BookingComponent_Guest <em>Booking Component Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.BookingComponent_Guest
	 * @generated
	 */
	public Adapter createBookingComponent_GuestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.StaffComponent <em>Staff Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.StaffComponent
	 * @generated
	 */
	public Adapter createStaffComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.StaffComponent_AccountManager <em>Staff Component Account Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.StaffComponent_AccountManager
	 * @generated
	 */
	public Adapter createStaffComponent_AccountManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.StaffComponent_IAuthentication <em>Staff Component IAuthentication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.StaffComponent_IAuthentication
	 * @generated
	 */
	public Adapter createStaffComponent_IAuthenticationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.StaffComponent_IAccountAdministration <em>Staff Component IAccount Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.StaffComponent_IAccountAdministration
	 * @generated
	 */
	public Adapter createStaffComponent_IAccountAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.StaffComponent_Employee <em>Staff Component Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.StaffComponent_Employee
	 * @generated
	 */
	public Adapter createStaffComponent_EmployeeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.RoomComponent <em>Room Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.RoomComponent
	 * @generated
	 */
	public Adapter createRoomComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.RoomComponent_Room <em>Room Component Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.RoomComponent_Room
	 * @generated
	 */
	public Adapter createRoomComponent_RoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.RoomComponent_Bedroom <em>Room Component Bedroom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.RoomComponent_Bedroom
	 * @generated
	 */
	public Adapter createRoomComponent_BedroomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.RoomComponent_ConferenceRoom <em>Room Component Conference Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.RoomComponent_ConferenceRoom
	 * @generated
	 */
	public Adapter createRoomComponent_ConferenceRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.RoomComponent_IRoomAdministration <em>Room Component IRoom Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.RoomComponent_IRoomAdministration
	 * @generated
	 */
	public Adapter createRoomComponent_IRoomAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.RoomComponent_IRoomInformation <em>Room Component IRoom Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.RoomComponent_IRoomInformation
	 * @generated
	 */
	public Adapter createRoomComponent_IRoomInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.RoomComponent_RoomHandler <em>Room Component Room Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.RoomComponent_RoomHandler
	 * @generated
	 */
	public Adapter createRoomComponent_RoomHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.RoomComponent_IRoomDecision <em>Room Component IRoom Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.RoomComponent_IRoomDecision
	 * @generated
	 */
	public Adapter createRoomComponent_IRoomDecisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ImplementationAdapterFactory
