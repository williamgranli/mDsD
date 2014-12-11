/**
 */
package Implementation;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking Component Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Implementation.BookingComponent_Booking#getArrivalDate <em>Arrival Date</em>}</li>
 *   <li>{@link Implementation.BookingComponent_Booking#getDepartureDate <em>Departure Date</em>}</li>
 *   <li>{@link Implementation.BookingComponent_Booking#getReferenceNumber <em>Reference Number</em>}</li>
 *   <li>{@link Implementation.BookingComponent_Booking#getCurrentCost <em>Current Cost</em>}</li>
 *   <li>{@link Implementation.BookingComponent_Booking#getAdditionalServices <em>Additional Services</em>}</li>
 *   <li>{@link Implementation.BookingComponent_Booking#getGuests <em>Guests</em>}</li>
 *   <li>{@link Implementation.BookingComponent_Booking#getPaymentDetails <em>Payment Details</em>}</li>
 *   <li>{@link Implementation.BookingComponent_Booking#getRooms <em>Rooms</em>}</li>
 * </ul>
 * </p>
 *
 * @see Implementation.ImplementationPackage#getBookingComponent_Booking()
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
	 * @see Implementation.ImplementationPackage#getBookingComponent_Booking_ArrivalDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getArrivalDate();

	/**
	 * Sets the value of the '{@link Implementation.BookingComponent_Booking#getArrivalDate <em>Arrival Date</em>}' attribute.
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
	 * @see Implementation.ImplementationPackage#getBookingComponent_Booking_DepartureDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getDepartureDate();

	/**
	 * Sets the value of the '{@link Implementation.BookingComponent_Booking#getDepartureDate <em>Departure Date</em>}' attribute.
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
	 * @see Implementation.ImplementationPackage#getBookingComponent_Booking_ReferenceNumber()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getReferenceNumber();

	/**
	 * Sets the value of the '{@link Implementation.BookingComponent_Booking#getReferenceNumber <em>Reference Number</em>}' attribute.
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
	 * @see Implementation.ImplementationPackage#getBookingComponent_Booking_CurrentCost()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getCurrentCost();

	/**
	 * Sets the value of the '{@link Implementation.BookingComponent_Booking#getCurrentCost <em>Current Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Cost</em>' attribute.
	 * @see #getCurrentCost()
	 * @generated
	 */
	void setCurrentCost(int value);

	/**
	 * Returns the value of the '<em><b>Additional Services</b></em>' reference list.
	 * The list contents are of type {@link Implementation.BookingComponent_AdditionalService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Services</em>' reference list.
	 * @see Implementation.ImplementationPackage#getBookingComponent_Booking_AdditionalServices()
	 * @model ordered="false"
	 * @generated
	 */
	EList<BookingComponent_AdditionalService> getAdditionalServices();

	/**
	 * Returns the value of the '<em><b>Guests</b></em>' reference list.
	 * The list contents are of type {@link Implementation.BookingComponent_BookingGuest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guests</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guests</em>' reference list.
	 * @see Implementation.ImplementationPackage#getBookingComponent_Booking_Guests()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<BookingComponent_BookingGuest> getGuests();

	/**
	 * Returns the value of the '<em><b>Payment Details</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Details</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Details</em>' reference.
	 * @see #setPaymentDetails(BookingComponent_PaymentDetails)
	 * @see Implementation.ImplementationPackage#getBookingComponent_Booking_PaymentDetails()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BookingComponent_PaymentDetails getPaymentDetails();

	/**
	 * Sets the value of the '{@link Implementation.BookingComponent_Booking#getPaymentDetails <em>Payment Details</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Details</em>' reference.
	 * @see #getPaymentDetails()
	 * @generated
	 */
	void setPaymentDetails(BookingComponent_PaymentDetails value);

	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' reference list.
	 * The list contents are of type {@link Implementation.BookingComponent_RoomType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rooms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' reference list.
	 * @see Implementation.ImplementationPackage#getBookingComponent_Booking_Rooms()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<BookingComponent_RoomType> getRooms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BookingComponent_Booking Booking();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" arrivalDateRequired="true" arrivalDateOrdered="false" departureDateRequired="true" departureDateOrdered="false"
	 * @generated
	 */
	BookingComponent_Booking Booking(Date arrivalDate, Date departureDate);

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
	 * @model required="true" ordered="false" roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false" arrivalDateRequired="true" arrivalDateOrdered="false" departureDateRequired="true" departureDateOrdered="false" customerSSNDataType="org.eclipse.uml2.types.String" customerSSNRequired="true" customerSSNOrdered="false" customerFirstNameDataType="org.eclipse.uml2.types.String" customerFirstNameRequired="true" customerFirstNameOrdered="false" customerLastNameDataType="org.eclipse.uml2.types.String" customerLastNameRequired="true" customerLastNameOrdered="false" customerAddressDataType="org.eclipse.uml2.types.String" customerAddressRequired="true" customerAddressOrdered="false" customerEmailDataType="org.eclipse.uml2.types.String" customerEmailRequired="true" customerEmailOrdered="false" ccNumberDataType="org.eclipse.uml2.types.String" ccNumberRequired="true" ccNumberOrdered="false" ccvDataType="org.eclipse.uml2.types.String" ccvRequired="true" ccvOrdered="false" expiryMonthDataType="org.eclipse.uml2.types.String" expiryMonthRequired="true" expiryMonthOrdered="false" expiryYearDataType="org.eclipse.uml2.types.String" expiryYearRequired="true" expiryYearOrdered="false"
	 * @generated
	 */
	BookingComponent_Booking Booking(String roomType, Date arrivalDate, Date departureDate, String customerSSN, String customerFirstName, String customerLastName, String customerAddress, String customerEmail, String ccNumber, String ccv, String expiryMonth, String expiryYear);

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
	 * @model arrivalDateRequired="true" arrivalDateOrdered="false" departureDateRequired="true" departureDateOrdered="false"
	 * @generated
	 */
	void updateBooking(Date arrivalDate, Date departureDate);

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
