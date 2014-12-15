/**
 */
package Implementation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Implementation.ImplementationPackage
 * @generated
 */
public interface ImplementationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImplementationFactory eINSTANCE = Implementation.impl.ImplementationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Decision Support Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decision Support Component</em>'.
	 * @generated
	 */
	DecisionSupportComponent createDecisionSupportComponent();

	/**
	 * Returns a new object of class '<em>Decision Support Component DSS Processor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decision Support Component DSS Processor</em>'.
	 * @generated
	 */
	DecisionSupportComponent_DSSProcessor createDecisionSupportComponent_DSSProcessor();

	/**
	 * Returns a new object of class '<em>Decision Support Component DSS Presenter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decision Support Component DSS Presenter</em>'.
	 * @generated
	 */
	DecisionSupportComponent_DSSPresenter createDecisionSupportComponent_DSSPresenter();

	/**
	 * Returns a new object of class '<em>Decision Support Component DSS Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decision Support Component DSS Controller</em>'.
	 * @generated
	 */
	DecisionSupportComponent_DSSController createDecisionSupportComponent_DSSController();

	/**
	 * Returns a new object of class '<em>Occupancy Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Occupancy Component</em>'.
	 * @generated
	 */
	OccupancyComponent createOccupancyComponent();

	/**
	 * Returns a new object of class '<em>Occupancy Component Occupancy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Occupancy Component Occupancy</em>'.
	 * @generated
	 */
	OccupancyComponent_Occupancy createOccupancyComponent_Occupancy();

	/**
	 * Returns a new object of class '<em>Occupancy Component Guest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Occupancy Component Guest</em>'.
	 * @generated
	 */
	OccupancyComponent_Guest createOccupancyComponent_Guest();

	/**
	 * Returns a new object of class '<em>Occupancy Component Occupancy Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Occupancy Component Occupancy Handler</em>'.
	 * @generated
	 */
	OccupancyComponent_OccupancyHandler createOccupancyComponent_OccupancyHandler();

	/**
	 * Returns a new object of class '<em>Payment Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payment Component</em>'.
	 * @generated
	 */
	PaymentComponent createPaymentComponent();

	/**
	 * Returns a new object of class '<em>Payment Component Payment Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payment Component Payment Handler</em>'.
	 * @generated
	 */
	PaymentComponent_PaymentHandler createPaymentComponent_PaymentHandler();

	/**
	 * Returns a new object of class '<em>Payment Component Payment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payment Component Payment</em>'.
	 * @generated
	 */
	PaymentComponent_Payment createPaymentComponent_Payment();

	/**
	 * Returns a new object of class '<em>Additional Service Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Additional Service Component</em>'.
	 * @generated
	 */
	AdditionalServiceComponent createAdditionalServiceComponent();

	/**
	 * Returns a new object of class '<em>Additional Service Component Additional Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Additional Service Component Additional Service</em>'.
	 * @generated
	 */
	AdditionalServiceComponent_AdditionalService createAdditionalServiceComponent_AdditionalService();

	/**
	 * Returns a new object of class '<em>Additional Service Component Additional Service Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Additional Service Component Additional Service Event</em>'.
	 * @generated
	 */
	AdditionalServiceComponent_AdditionalServiceEvent createAdditionalServiceComponent_AdditionalServiceEvent();

	/**
	 * Returns a new object of class '<em>Additional Service Component Additional Service Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Additional Service Component Additional Service Handler</em>'.
	 * @generated
	 */
	AdditionalServiceComponent_AdditionalServiceHandler createAdditionalServiceComponent_AdditionalServiceHandler();

	/**
	 * Returns a new object of class '<em>Booking Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Booking Component</em>'.
	 * @generated
	 */
	BookingComponent createBookingComponent();

	/**
	 * Returns a new object of class '<em>Booking Component Payment Details</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Booking Component Payment Details</em>'.
	 * @generated
	 */
	BookingComponent_PaymentDetails createBookingComponent_PaymentDetails();

	/**
	 * Returns a new object of class '<em>Booking Component Booking</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Booking Component Booking</em>'.
	 * @generated
	 */
	BookingComponent_Booking createBookingComponent_Booking();

	/**
	 * Returns a new object of class '<em>Booking Component Additional Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Booking Component Additional Service</em>'.
	 * @generated
	 */
	BookingComponent_AdditionalService createBookingComponent_AdditionalService();

	/**
	 * Returns a new object of class '<em>Booking Component Booking Guest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Booking Component Booking Guest</em>'.
	 * @generated
	 */
	BookingComponent_BookingGuest createBookingComponent_BookingGuest();

	/**
	 * Returns a new object of class '<em>Booking Component Room Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Booking Component Room Type</em>'.
	 * @generated
	 */
	BookingComponent_RoomType createBookingComponent_RoomType();

	/**
	 * Returns a new object of class '<em>Booking Component Booking Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Booking Component Booking Manager</em>'.
	 * @generated
	 */
	BookingComponent_BookingManager createBookingComponent_BookingManager();

	/**
	 * Returns a new object of class '<em>Staff Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Staff Component</em>'.
	 * @generated
	 */
	StaffComponent createStaffComponent();

	/**
	 * Returns a new object of class '<em>Staff Component Account Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Staff Component Account Manager</em>'.
	 * @generated
	 */
	StaffComponent_AccountManager createStaffComponent_AccountManager();

	/**
	 * Returns a new object of class '<em>Staff Component Employee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Staff Component Employee</em>'.
	 * @generated
	 */
	StaffComponent_Employee createStaffComponent_Employee();

	/**
	 * Returns a new object of class '<em>Room Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Component</em>'.
	 * @generated
	 */
	RoomComponent createRoomComponent();

	/**
	 * Returns a new object of class '<em>Room Component Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Component Room</em>'.
	 * @generated
	 */
	RoomComponent_Room createRoomComponent_Room();

	/**
	 * Returns a new object of class '<em>Room Component Bedroom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Component Bedroom</em>'.
	 * @generated
	 */
	RoomComponent_Bedroom createRoomComponent_Bedroom();

	/**
	 * Returns a new object of class '<em>Room Component Conference Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Component Conference Room</em>'.
	 * @generated
	 */
	RoomComponent_ConferenceRoom createRoomComponent_ConferenceRoom();

	/**
	 * Returns a new object of class '<em>Room Component Room Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Component Room Handler</em>'.
	 * @generated
	 */
	RoomComponent_RoomHandler createRoomComponent_RoomHandler();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ImplementationPackage getImplementationPackage();

} //ImplementationFactory
