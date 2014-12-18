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
 *   <li>{@link Implementation.BookingComponent_Booking#getBookingReference <em>Booking Reference</em>}</li>
 *   <li>{@link Implementation.BookingComponent_Booking#getCurrentCost <em>Current Cost</em>}</li>
 *   <li>{@link Implementation.BookingComponent_Booking#getAdditionalServices <em>Additional Services</em>}</li>
 *   <li>{@link Implementation.BookingComponent_Booking#getGuests <em>Guests</em>}</li>
 *   <li>{@link Implementation.BookingComponent_Booking#getPaymentDetails <em>Payment Details</em>}</li>
 *   <li>{@link Implementation.BookingComponent_Booking#getRooms <em>Rooms</em>}</li>
 *   <li>{@link Implementation.BookingComponent_Booking#isPaid <em>Is Paid</em>}</li>
 *   <li>{@link Implementation.BookingComponent_Booking#isActive <em>Is Active</em>}</li>
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
	 * Returns the value of the '<em><b>Booking Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking Reference</em>' attribute.
	 * @see #setBookingReference(String)
	 * @see Implementation.ImplementationPackage#getBookingComponent_Booking_BookingReference()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getBookingReference();

	/**
	 * Sets the value of the '{@link Implementation.BookingComponent_Booking#getBookingReference <em>Booking Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking Reference</em>' attribute.
	 * @see #getBookingReference()
	 * @generated
	 */
	void setBookingReference(String value);

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
	 * Returns the value of the '<em><b>Is Paid</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Paid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Paid</em>' attribute.
	 * @see #setIsPaid(boolean)
	 * @see Implementation.ImplementationPackage#getBookingComponent_Booking_IsPaid()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isPaid();

	/**
	 * Sets the value of the '{@link Implementation.BookingComponent_Booking#isPaid <em>Is Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Paid</em>' attribute.
	 * @see #isPaid()
	 * @generated
	 */
	void setIsPaid(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Active</em>' attribute.
	 * @see #setIsActive(boolean)
	 * @see Implementation.ImplementationPackage#getBookingComponent_Booking_IsActive()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isActive();

	/**
	 * Sets the value of the '{@link Implementation.BookingComponent_Booking#isActive <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
	void setIsActive(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model newServiceDataType="org.eclipse.uml2.types.String" newServiceRequired="true" newServiceOrdered="false" priceDataType="org.eclipse.uml2.types.Integer" priceRequired="true" priceOrdered="false"
	 * @generated
	 */
	void addAdditionalServiceToBooking(String newService, int price);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false" roomPriceDataType="org.eclipse.uml2.types.Integer" roomPriceRequired="true" roomPriceOrdered="false"
	 * @generated
	 */
	void addRoomToBooking(String roomType, int roomPrice);

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
	 * @model additionalServiceNameDataType="org.eclipse.uml2.types.String" additionalServiceNameRequired="true" additionalServiceNameOrdered="false"
	 * @generated
	 */
	void removeAdditionalServiceFromBooking(String additionalServiceName);

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
	 * @model firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false" addressDataType="org.eclipse.uml2.types.String" addressRequired="true" addressOrdered="false" ccNumberDataType="org.eclipse.uml2.types.String" ccNumberRequired="true" ccNumberOrdered="false" ccvDataType="org.eclipse.uml2.types.String" ccvRequired="true" ccvOrdered="false" expiryMonthDataType="org.eclipse.uml2.types.Integer" expiryMonthRequired="true" expiryMonthOrdered="false" expiryYearDataType="org.eclipse.uml2.types.Integer" expiryYearRequired="true" expiryYearOrdered="false"
	 * @generated
	 */
	void updatePaymentDetails(String firstName, String lastName, String address, String ccNumber, String ccv, int expiryMonth, int expiryYear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String generateReferenceNumber();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false" addressDataType="org.eclipse.uml2.types.String" addressRequired="true" addressOrdered="false"
	 * @generated
	 */
	void addGuestToBooking(String firstName, String lastName, String address);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false" addressDataType="org.eclipse.uml2.types.String" addressRequired="true" addressOrdered="false"
	 * @generated
	 */
	void removeGuestFromBooking(String firstName, String lastName, String address);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getGuestsInBooking();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getRoomTypesInBooking();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false" addressDataType="org.eclipse.uml2.types.String" addressRequired="true" addressOrdered="false" ccNumberDataType="org.eclipse.uml2.types.String" ccNumberRequired="true" ccNumberOrdered="false" ccvDataType="org.eclipse.uml2.types.String" ccvRequired="true" ccvOrdered="false" expiryMonthDataType="org.eclipse.uml2.types.Integer" expiryMonthRequired="true" expiryMonthOrdered="false" expiryYearDataType="org.eclipse.uml2.types.Integer" expiryYearRequired="true" expiryYearOrdered="false"
	 * @generated
	 */
	void addPaymentDetails(String firstName, String lastName, String address, String ccNumber, String ccv, int expiryMonth, int expiryYear);

} // BookingComponent_Booking
