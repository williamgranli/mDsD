/**
 */
package Implementation.util;

import Implementation.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Implementation.ImplementationPackage
 * @generated
 */
public class ImplementationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ImplementationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationSwitch() {
		if (modelPackage == null) {
			modelPackage = ImplementationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT: {
				DecisionSupportComponent decisionSupportComponent = (DecisionSupportComponent)theEObject;
				T result = caseDecisionSupportComponent(decisionSupportComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT: {
				DecisionSupportComponent_IDecisionSupport decisionSupportComponent_IDecisionSupport = (DecisionSupportComponent_IDecisionSupport)theEObject;
				T result = caseDecisionSupportComponent_IDecisionSupport(decisionSupportComponent_IDecisionSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_PROCESSOR: {
				DecisionSupportComponent_DSSProcessor decisionSupportComponent_DSSProcessor = (DecisionSupportComponent_DSSProcessor)theEObject;
				T result = caseDecisionSupportComponent_DSSProcessor(decisionSupportComponent_DSSProcessor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_PRESENTER: {
				DecisionSupportComponent_DSSPresenter decisionSupportComponent_DSSPresenter = (DecisionSupportComponent_DSSPresenter)theEObject;
				T result = caseDecisionSupportComponent_DSSPresenter(decisionSupportComponent_DSSPresenter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER: {
				DecisionSupportComponent_DSSController decisionSupportComponent_DSSController = (DecisionSupportComponent_DSSController)theEObject;
				T result = caseDecisionSupportComponent_DSSController(decisionSupportComponent_DSSController);
				if (result == null) result = caseDecisionSupportComponent_IDecisionSupport(decisionSupportComponent_DSSController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.ROOM_COMPONENT_IROOM_DECISION: {
				RoomComponent_IRoomDecision roomComponent_IRoomDecision = (RoomComponent_IRoomDecision)theEObject;
				T result = caseRoomComponent_IRoomDecision(roomComponent_IRoomDecision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.OCCUPANCY_COMPONENT_IOCCUPANCY_DECISION: {
				OccupancyComponent_IOccupancyDecision occupancyComponent_IOccupancyDecision = (OccupancyComponent_IOccupancyDecision)theEObject;
				T result = caseOccupancyComponent_IOccupancyDecision(occupancyComponent_IOccupancyDecision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_DECISION: {
				AdditionalServiceComponent_IAdditionalServiceDecision additionalServiceComponent_IAdditionalServiceDecision = (AdditionalServiceComponent_IAdditionalServiceDecision)theEObject;
				T result = caseAdditionalServiceComponent_IAdditionalServiceDecision(additionalServiceComponent_IAdditionalServiceDecision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_DECISION: {
				BookingComponent_IBookingDecision bookingComponent_IBookingDecision = (BookingComponent_IBookingDecision)theEObject;
				T result = caseBookingComponent_IBookingDecision(bookingComponent_IBookingDecision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.OCCUPANCY_COMPONENT: {
				OccupancyComponent occupancyComponent = (OccupancyComponent)theEObject;
				T result = caseOccupancyComponent(occupancyComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY: {
				OccupancyComponent_Occupancy occupancyComponent_Occupancy = (OccupancyComponent_Occupancy)theEObject;
				T result = caseOccupancyComponent_Occupancy(occupancyComponent_Occupancy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.OCCUPANCY_COMPONENT_GUEST: {
				OccupancyComponent_Guest occupancyComponent_Guest = (OccupancyComponent_Guest)theEObject;
				T result = caseOccupancyComponent_Guest(occupancyComponent_Guest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.OCCUPANCY_COMPONENT_IOCCUPANCY: {
				OccupancyComponent_IOccupancy occupancyComponent_IOccupancy = (OccupancyComponent_IOccupancy)theEObject;
				T result = caseOccupancyComponent_IOccupancy(occupancyComponent_IOccupancy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER: {
				OccupancyComponent_OccupancyHandler occupancyComponent_OccupancyHandler = (OccupancyComponent_OccupancyHandler)theEObject;
				T result = caseOccupancyComponent_OccupancyHandler(occupancyComponent_OccupancyHandler);
				if (result == null) result = caseOccupancyComponent_IOccupancyDecision(occupancyComponent_OccupancyHandler);
				if (result == null) result = caseOccupancyComponent_IOccupancy(occupancyComponent_OccupancyHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.ROOM_COMPONENT_IROOM_INFORMATION: {
				RoomComponent_IRoomInformation roomComponent_IRoomInformation = (RoomComponent_IRoomInformation)theEObject;
				T result = caseRoomComponent_IRoomInformation(roomComponent_IRoomInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.BOOKING_COMPONENT_IBOOKING: {
				BookingComponent_IBooking bookingComponent_IBooking = (BookingComponent_IBooking)theEObject;
				T result = caseBookingComponent_IBooking(bookingComponent_IBooking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.PAYMENT_COMPONENT: {
				PaymentComponent paymentComponent = (PaymentComponent)theEObject;
				T result = casePaymentComponent(paymentComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.PAYMENT_COMPONENT_PAYMENT_MANAGER: {
				PaymentComponent_PaymentManager paymentComponent_PaymentManager = (PaymentComponent_PaymentManager)theEObject;
				T result = casePaymentComponent_PaymentManager(paymentComponent_PaymentManager);
				if (result == null) result = casePaymentComponent_IPayment(paymentComponent_PaymentManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.PAYMENT_COMPONENT_PAYMENT: {
				PaymentComponent_Payment paymentComponent_Payment = (PaymentComponent_Payment)theEObject;
				T result = casePaymentComponent_Payment(paymentComponent_Payment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.PAYMENT_COMPONENT_IPAYMENT: {
				PaymentComponent_IPayment paymentComponent_IPayment = (PaymentComponent_IPayment)theEObject;
				T result = casePaymentComponent_IPayment(paymentComponent_IPayment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT: {
				AdditionalServiceComponent additionalServiceComponent = (AdditionalServiceComponent)theEObject;
				T result = caseAdditionalServiceComponent(additionalServiceComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE: {
				AdditionalServiceComponent_AdditionalService additionalServiceComponent_AdditionalService = (AdditionalServiceComponent_AdditionalService)theEObject;
				T result = caseAdditionalServiceComponent_AdditionalService(additionalServiceComponent_AdditionalService);
				if (result == null) result = caseAdditionalServiceComponent_IAdditionalServiceDecision(additionalServiceComponent_AdditionalService);
				if (result == null) result = caseAdditionalServiceComponent_IAdditionalServiceInformation(additionalServiceComponent_AdditionalService);
				if (result == null) result = caseAdditionalServiceComponent_IAdditionalServiceAdministration(additionalServiceComponent_AdditionalService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.STAFF_COMPONENT_IAUTHENTICATION: {
				StaffComponent_IAuthentication staffComponent_IAuthentication = (StaffComponent_IAuthentication)theEObject;
				T result = caseStaffComponent_IAuthentication(staffComponent_IAuthentication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_INFORMATION: {
				AdditionalServiceComponent_IAdditionalServiceInformation additionalServiceComponent_IAdditionalServiceInformation = (AdditionalServiceComponent_IAdditionalServiceInformation)theEObject;
				T result = caseAdditionalServiceComponent_IAdditionalServiceInformation(additionalServiceComponent_IAdditionalServiceInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION: {
				AdditionalServiceComponent_IAdditionalServiceAdministration additionalServiceComponent_IAdditionalServiceAdministration = (AdditionalServiceComponent_IAdditionalServiceAdministration)theEObject;
				T result = caseAdditionalServiceComponent_IAdditionalServiceAdministration(additionalServiceComponent_IAdditionalServiceAdministration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT: {
				AdditionalServiceComponent_AdditionalServiceEvent additionalServiceComponent_AdditionalServiceEvent = (AdditionalServiceComponent_AdditionalServiceEvent)theEObject;
				T result = caseAdditionalServiceComponent_AdditionalServiceEvent(additionalServiceComponent_AdditionalServiceEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.BOOKING_COMPONENT: {
				BookingComponent bookingComponent = (BookingComponent)theEObject;
				T result = caseBookingComponent(bookingComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.BOOKING_COMPONENT_PAYMENT_DETAILS: {
				BookingComponent_PaymentDetails bookingComponent_PaymentDetails = (BookingComponent_PaymentDetails)theEObject;
				T result = caseBookingComponent_PaymentDetails(bookingComponent_PaymentDetails);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING: {
				BookingComponent_Booking bookingComponent_Booking = (BookingComponent_Booking)theEObject;
				T result = caseBookingComponent_Booking(bookingComponent_Booking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.BOOKING_COMPONENT_ADDITIONAL_SERVICE: {
				BookingComponent_AdditionalService bookingComponent_AdditionalService = (BookingComponent_AdditionalService)theEObject;
				T result = caseBookingComponent_AdditionalService(bookingComponent_AdditionalService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_GUEST: {
				BookingComponent_BookingGuest bookingComponent_BookingGuest = (BookingComponent_BookingGuest)theEObject;
				T result = caseBookingComponent_BookingGuest(bookingComponent_BookingGuest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.BOOKING_COMPONENT_ROOM_TYPE: {
				BookingComponent_RoomType bookingComponent_RoomType = (BookingComponent_RoomType)theEObject;
				T result = caseBookingComponent_RoomType(bookingComponent_RoomType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER: {
				BookingComponent_BookingManager bookingComponent_BookingManager = (BookingComponent_BookingManager)theEObject;
				T result = caseBookingComponent_BookingManager(bookingComponent_BookingManager);
				if (result == null) result = caseBookingComponent_IBooking(bookingComponent_BookingManager);
				if (result == null) result = caseBookingComponent_IBookingDecision(bookingComponent_BookingManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.STAFF_COMPONENT: {
				StaffComponent staffComponent = (StaffComponent)theEObject;
				T result = caseStaffComponent(staffComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.STAFF_COMPONENT_ACCOUNT_MANAGER: {
				StaffComponent_AccountManager staffComponent_AccountManager = (StaffComponent_AccountManager)theEObject;
				T result = caseStaffComponent_AccountManager(staffComponent_AccountManager);
				if (result == null) result = caseStaffComponent_IAuthentication(staffComponent_AccountManager);
				if (result == null) result = caseStaffComponent_IAccountAdministration(staffComponent_AccountManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.STAFF_COMPONENT_IACCOUNT_ADMINISTRATION: {
				StaffComponent_IAccountAdministration staffComponent_IAccountAdministration = (StaffComponent_IAccountAdministration)theEObject;
				T result = caseStaffComponent_IAccountAdministration(staffComponent_IAccountAdministration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.STAFF_COMPONENT_EMPLOYEE: {
				StaffComponent_Employee staffComponent_Employee = (StaffComponent_Employee)theEObject;
				T result = caseStaffComponent_Employee(staffComponent_Employee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.ROOM_COMPONENT: {
				RoomComponent roomComponent = (RoomComponent)theEObject;
				T result = caseRoomComponent(roomComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.ROOM_COMPONENT_ROOM: {
				RoomComponent_Room roomComponent_Room = (RoomComponent_Room)theEObject;
				T result = caseRoomComponent_Room(roomComponent_Room);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.ROOM_COMPONENT_BEDROOM: {
				RoomComponent_Bedroom roomComponent_Bedroom = (RoomComponent_Bedroom)theEObject;
				T result = caseRoomComponent_Bedroom(roomComponent_Bedroom);
				if (result == null) result = caseRoomComponent_Room(roomComponent_Bedroom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.ROOM_COMPONENT_CONFERENCE_ROOM: {
				RoomComponent_ConferenceRoom roomComponent_ConferenceRoom = (RoomComponent_ConferenceRoom)theEObject;
				T result = caseRoomComponent_ConferenceRoom(roomComponent_ConferenceRoom);
				if (result == null) result = caseRoomComponent_Room(roomComponent_ConferenceRoom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.ROOM_COMPONENT_IROOM_ADMINISTRATION: {
				RoomComponent_IRoomAdministration roomComponent_IRoomAdministration = (RoomComponent_IRoomAdministration)theEObject;
				T result = caseRoomComponent_IRoomAdministration(roomComponent_IRoomAdministration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER: {
				RoomComponent_RoomHandler roomComponent_RoomHandler = (RoomComponent_RoomHandler)theEObject;
				T result = caseRoomComponent_RoomHandler(roomComponent_RoomHandler);
				if (result == null) result = caseRoomComponent_IRoomDecision(roomComponent_RoomHandler);
				if (result == null) result = caseRoomComponent_IRoomInformation(roomComponent_RoomHandler);
				if (result == null) result = caseRoomComponent_IRoomAdministration(roomComponent_RoomHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Support Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Support Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecisionSupportComponent(DecisionSupportComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Support Component IDecision Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Support Component IDecision Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecisionSupportComponent_IDecisionSupport(DecisionSupportComponent_IDecisionSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Support Component DSS Processor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Support Component DSS Processor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecisionSupportComponent_DSSProcessor(DecisionSupportComponent_DSSProcessor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Support Component DSS Presenter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Support Component DSS Presenter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecisionSupportComponent_DSSPresenter(DecisionSupportComponent_DSSPresenter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Support Component DSS Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Support Component DSS Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecisionSupportComponent_DSSController(DecisionSupportComponent_DSSController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Component IRoom Decision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Component IRoom Decision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomComponent_IRoomDecision(RoomComponent_IRoomDecision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Occupancy Component IOccupancy Decision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Occupancy Component IOccupancy Decision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOccupancyComponent_IOccupancyDecision(OccupancyComponent_IOccupancyDecision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additional Service Component IAdditional Service Decision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additional Service Component IAdditional Service Decision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionalServiceComponent_IAdditionalServiceDecision(AdditionalServiceComponent_IAdditionalServiceDecision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booking Component IBooking Decision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booking Component IBooking Decision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookingComponent_IBookingDecision(BookingComponent_IBookingDecision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Occupancy Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Occupancy Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOccupancyComponent(OccupancyComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Occupancy Component Occupancy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Occupancy Component Occupancy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOccupancyComponent_Occupancy(OccupancyComponent_Occupancy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Occupancy Component Guest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Occupancy Component Guest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOccupancyComponent_Guest(OccupancyComponent_Guest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Occupancy Component IOccupancy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Occupancy Component IOccupancy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOccupancyComponent_IOccupancy(OccupancyComponent_IOccupancy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Occupancy Component Occupancy Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Occupancy Component Occupancy Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOccupancyComponent_OccupancyHandler(OccupancyComponent_OccupancyHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Component IRoom Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Component IRoom Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomComponent_IRoomInformation(RoomComponent_IRoomInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booking Component IBooking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booking Component IBooking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookingComponent_IBooking(BookingComponent_IBooking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payment Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payment Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaymentComponent(PaymentComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payment Component Payment Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payment Component Payment Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaymentComponent_PaymentManager(PaymentComponent_PaymentManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payment Component Payment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payment Component Payment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaymentComponent_Payment(PaymentComponent_Payment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payment Component IPayment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payment Component IPayment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaymentComponent_IPayment(PaymentComponent_IPayment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additional Service Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additional Service Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionalServiceComponent(AdditionalServiceComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additional Service Component Additional Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additional Service Component Additional Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionalServiceComponent_AdditionalService(AdditionalServiceComponent_AdditionalService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Staff Component IAuthentication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Staff Component IAuthentication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaffComponent_IAuthentication(StaffComponent_IAuthentication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additional Service Component IAdditional Service Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additional Service Component IAdditional Service Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionalServiceComponent_IAdditionalServiceInformation(AdditionalServiceComponent_IAdditionalServiceInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additional Service Component IAdditional Service Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additional Service Component IAdditional Service Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionalServiceComponent_IAdditionalServiceAdministration(AdditionalServiceComponent_IAdditionalServiceAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additional Service Component Additional Service Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additional Service Component Additional Service Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionalServiceComponent_AdditionalServiceEvent(AdditionalServiceComponent_AdditionalServiceEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booking Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booking Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookingComponent(BookingComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booking Component Payment Details</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booking Component Payment Details</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookingComponent_PaymentDetails(BookingComponent_PaymentDetails object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booking Component Booking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booking Component Booking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookingComponent_Booking(BookingComponent_Booking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booking Component Additional Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booking Component Additional Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookingComponent_AdditionalService(BookingComponent_AdditionalService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booking Component Booking Guest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booking Component Booking Guest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookingComponent_BookingGuest(BookingComponent_BookingGuest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booking Component Room Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booking Component Room Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookingComponent_RoomType(BookingComponent_RoomType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booking Component Booking Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booking Component Booking Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookingComponent_BookingManager(BookingComponent_BookingManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Staff Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Staff Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaffComponent(StaffComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Staff Component Account Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Staff Component Account Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaffComponent_AccountManager(StaffComponent_AccountManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Staff Component IAccount Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Staff Component IAccount Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaffComponent_IAccountAdministration(StaffComponent_IAccountAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Staff Component Employee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Staff Component Employee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaffComponent_Employee(StaffComponent_Employee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomComponent(RoomComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Component Room</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Component Room</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomComponent_Room(RoomComponent_Room object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Component Bedroom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Component Bedroom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomComponent_Bedroom(RoomComponent_Bedroom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Component Conference Room</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Component Conference Room</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomComponent_ConferenceRoom(RoomComponent_ConferenceRoom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Component IRoom Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Component IRoom Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomComponent_IRoomAdministration(RoomComponent_IRoomAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Component Room Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Component Room Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomComponent_RoomHandler(RoomComponent_RoomHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ImplementationSwitch
