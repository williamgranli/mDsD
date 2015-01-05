/**
 */
package Implementation;

import java.util.Date;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking Component Booking Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Implementation.BookingComponent_BookingHandler#getBookings <em>Bookings</em>}</li>
 *   <li>{@link Implementation.BookingComponent_BookingHandler#getAuthentication <em>Authentication</em>}</li>
 *   <li>{@link Implementation.BookingComponent_BookingHandler#getIRoomInformation <em>IRoom Information</em>}</li>
 *   <li>{@link Implementation.BookingComponent_BookingHandler#getIAdditionalServiceInformation <em>IAdditional Service Information</em>}</li>
 *   <li>{@link Implementation.BookingComponent_BookingHandler#getIPayment <em>IPayment</em>}</li>
 * </ul>
 * </p>
 *
 * @see Implementation.ImplementationPackage#getBookingComponent_BookingHandler()
 * @model
 * @generated
 */
public interface BookingComponent_BookingHandler extends BookingComponent_IBookingInformation, BookingComponent_IBookingDecision, BookingComponent_IBookingAdministration {
	/**
	 * Returns the value of the '<em><b>Bookings</b></em>' reference list.
	 * The list contents are of type {@link Implementation.BookingComponent_Booking}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bookings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bookings</em>' reference list.
	 * @see Implementation.ImplementationPackage#getBookingComponent_BookingHandler_Bookings()
	 * @model ordered="false"
	 * @generated
	 */
	EList<BookingComponent_Booking> getBookings();

	/**
	 * Returns the value of the '<em><b>Authentication</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authentication</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication</em>' reference.
	 * @see #setAuthentication(StaffComponent_IAuthentication)
	 * @see Implementation.ImplementationPackage#getBookingComponent_BookingHandler_Authentication()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StaffComponent_IAuthentication getAuthentication();

	/**
	 * Sets the value of the '{@link Implementation.BookingComponent_BookingHandler#getAuthentication <em>Authentication</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication</em>' reference.
	 * @see #getAuthentication()
	 * @generated
	 */
	void setAuthentication(StaffComponent_IAuthentication value);

	/**
	 * Returns the value of the '<em><b>IRoom Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IRoom Information</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IRoom Information</em>' reference.
	 * @see #setIRoomInformation(RoomComponent_IRoomInformation)
	 * @see Implementation.ImplementationPackage#getBookingComponent_BookingHandler_IRoomInformation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomComponent_IRoomInformation getIRoomInformation();

	/**
	 * Sets the value of the '{@link Implementation.BookingComponent_BookingHandler#getIRoomInformation <em>IRoom Information</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IRoom Information</em>' reference.
	 * @see #getIRoomInformation()
	 * @generated
	 */
	void setIRoomInformation(RoomComponent_IRoomInformation value);

	/**
	 * Returns the value of the '<em><b>IAdditional Service Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IAdditional Service Information</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IAdditional Service Information</em>' reference.
	 * @see #setIAdditionalServiceInformation(AdditionalServiceComponent_IEventManagement)
	 * @see Implementation.ImplementationPackage#getBookingComponent_BookingHandler_IAdditionalServiceInformation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AdditionalServiceComponent_IEventManagement getIAdditionalServiceInformation();

	/**
	 * Sets the value of the '{@link Implementation.BookingComponent_BookingHandler#getIAdditionalServiceInformation <em>IAdditional Service Information</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IAdditional Service Information</em>' reference.
	 * @see #getIAdditionalServiceInformation()
	 * @generated
	 */
	void setIAdditionalServiceInformation(AdditionalServiceComponent_IEventManagement value);

	/**
	 * Returns the value of the '<em><b>IPayment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IPayment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IPayment</em>' reference.
	 * @see #setIPayment(PaymentComponent_IPayment)
	 * @see Implementation.ImplementationPackage#getBookingComponent_BookingHandler_IPayment()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PaymentComponent_IPayment getIPayment();

	/**
	 * Sets the value of the '{@link Implementation.BookingComponent_BookingHandler#getIPayment <em>IPayment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IPayment</em>' reference.
	 * @see #getIPayment()
	 * @generated
	 */
	void setIPayment(PaymentComponent_IPayment value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" referenceNumberDataType="org.eclipse.uml2.types.String" referenceNumberRequired="true" referenceNumberOrdered="false"
	 * @generated
	 */
	BookingComponent_Booking findBooking(String referenceNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" startDateRequired="true" startDateOrdered="false" endDateRequired="true" endDateOrdered="false" roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	boolean bookingAvailable(Date startDate, Date endDate, String roomType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" startDateRequired="true" startDateOrdered="false" endDateRequired="true" endDateOrdered="false"
	 * @generated
	 */
	int findBookingsByDate(Date startDate, Date endDate);

} // BookingComponent_BookingHandler
