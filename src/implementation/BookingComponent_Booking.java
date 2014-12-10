/**
 */
package implementation;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking Component Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link implementation.BookingComponent_Booking#getArrivalDate <em>Arrival Date</em>}</li>
 *   <li>{@link implementation.BookingComponent_Booking#getDepartureDate <em>Departure Date</em>}</li>
 *   <li>{@link implementation.BookingComponent_Booking#getReferenceNumber <em>Reference Number</em>}</li>
 *   <li>{@link implementation.BookingComponent_Booking#getCurrentCost <em>Current Cost</em>}</li>
 * </ul>
 * </p>
 *
 * @see implementation.ImplementationPackage#getBookingComponent_Booking()
 * @model
 * @generated
 */
public interface BookingComponent_Booking extends EObject {
	/**
	 * Returns the value of the '<em><b>Arrival Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arrival Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrival Date</em>' attribute.
	 * @see #setArrivalDate(Date)
	 * @see implementation.ImplementationPackage#getBookingComponent_Booking_ArrivalDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getArrivalDate();

	/**
	 * Sets the value of the '{@link implementation.BookingComponent_Booking#getArrivalDate <em>Arrival Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrival Date</em>' attribute.
	 * @see #getArrivalDate()
	 * @generated
	 */
	void setArrivalDate(Date value);

	/**
	 * Returns the value of the '<em><b>Departure Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Departure Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departure Date</em>' attribute.
	 * @see #setDepartureDate(Date)
	 * @see implementation.ImplementationPackage#getBookingComponent_Booking_DepartureDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getDepartureDate();

	/**
	 * Sets the value of the '{@link implementation.BookingComponent_Booking#getDepartureDate <em>Departure Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Departure Date</em>' attribute.
	 * @see #getDepartureDate()
	 * @generated
	 */
	void setDepartureDate(Date value);

	/**
	 * Returns the value of the '<em><b>Reference Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Number</em>' attribute.
	 * @see #setReferenceNumber(String)
	 * @see implementation.ImplementationPackage#getBookingComponent_Booking_ReferenceNumber()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getReferenceNumber();

	/**
	 * Sets the value of the '{@link implementation.BookingComponent_Booking#getReferenceNumber <em>Reference Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Number</em>' attribute.
	 * @see #getReferenceNumber()
	 * @generated
	 */
	void setReferenceNumber(String value);

	/**
	 * Returns the value of the '<em><b>Current Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Cost</em>' attribute.
	 * @see #setCurrentCost(int)
	 * @see implementation.ImplementationPackage#getBookingComponent_Booking_CurrentCost()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getCurrentCost();

	/**
	 * Sets the value of the '{@link implementation.BookingComponent_Booking#getCurrentCost <em>Current Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Cost</em>' attribute.
	 * @see #getCurrentCost()
	 * @generated
	 */
	void setCurrentCost(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BookingObject'"
	 * @generated
	 */
	void bookingObject();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model arrivalDateRequired="true" arrivalDateOrdered="false" departureDateRequired="true" departureDateOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Booking'"
	 * @generated
	 */
	void booking(Date arrivalDate, Date departureDate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model newServiceRequired="true" newServiceOrdered="false"
	 * @generated
	 */
	void addAdditionalServiceToBooking(BookingComponent_AdditionalService newService);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false" arrivalDateRequired="true" arrivalDateOrdered="false" departureDateRequired="true" departureDateOrdered="false" customerSsnDataType="org.eclipse.uml2.types.String" customerSsnRequired="true" customerSsnOrdered="false"
	 *        customerSsnAnnotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='customerSSN'" customerFirstNameDataType="org.eclipse.uml2.types.String" customerFirstNameRequired="true" customerFirstNameOrdered="false" customerLastNameDataType="org.eclipse.uml2.types.String" customerLastNameRequired="true" customerLastNameOrdered="false" customerAddressDataType="org.eclipse.uml2.types.String" customerAddressRequired="true" customerAddressOrdered="false" customerEmailDataType="org.eclipse.uml2.types.String" customerEmailRequired="true" customerEmailOrdered="false" ccNumberDataType="org.eclipse.uml2.types.String" ccNumberRequired="true" ccNumberOrdered="false" ccvDataType="org.eclipse.uml2.types.String" ccvRequired="true" ccvOrdered="false" expiryMonthDataType="org.eclipse.uml2.types.String" expiryMonthRequired="true" expiryMonthOrdered="false" expiryYearDataType="org.eclipse.uml2.types.String" expiryYearRequired="true" expiryYearOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Booking'"
	 * @generated
	 */
	void booking(String roomType, Date arrivalDate, Date departureDate, String customerSsn, String customerFirstName, String customerLastName, String customerAddress, String customerEmail, String ccNumber, String ccv, String expiryMonth, String expiryYear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model newRoomRequired="true" newRoomOrdered="false"
	 * @generated
	 */
	void addRoomToBooking(BookingComponent_RoomType newRoom);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	void removeRoomFromBooking(String roomType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingReferenceDataType="org.eclipse.uml2.types.String" bookingReferenceRequired="true" bookingReferenceOrdered="false" arrivalDateRequired="true" arrivalDateOrdered="false" departureDateRequired="true" departureDateOrdered="false"
	 * @generated
	 */
	void updateBooking(String bookingReference, Date arrivalDate, Date departureDate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model additionalServiceRequired="true" additionalServiceOrdered="false"
	 * @generated
	 */
	void removeAdditionalServiceFromBooking(BookingComponent_AdditionalService additionalService);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int currentCost();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model newPaymentDetailsRequired="true" newPaymentDetailsOrdered="false"
	 * @generated
	 */
	void updatePaymentDetails(BookingComponent_PaymentDetails newPaymentDetails);

} // BookingComponent_Booking
