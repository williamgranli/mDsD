/**
 */
package Implementation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Occupancy Component Occupancy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Implementation.OccupancyComponent_Occupancy#getRoomNumber <em>Room Number</em>}</li>
 *   <li>{@link Implementation.OccupancyComponent_Occupancy#getCheckInDateTime <em>Check In Date Time</em>}</li>
 *   <li>{@link Implementation.OccupancyComponent_Occupancy#getCheckOutDateTime <em>Check Out Date Time</em>}</li>
 *   <li>{@link Implementation.OccupancyComponent_Occupancy#getGuest <em>Guest</em>}</li>
 *   <li>{@link Implementation.OccupancyComponent_Occupancy#getBookingReference <em>Booking Reference</em>}</li>
 *   <li>{@link Implementation.OccupancyComponent_Occupancy#getGuests <em>Guests</em>}</li>
 * </ul>
 * </p>
 *
 * @see Implementation.ImplementationPackage#getOccupancyComponent_Occupancy()
 * @model
 * @generated
 */
public interface OccupancyComponent_Occupancy extends EObject {
	/**
	 * Returns the value of the '<em><b>Room Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Number</em>' attribute.
	 * @see #setRoomNumber(int)
	 * @see Implementation.ImplementationPackage#getOccupancyComponent_Occupancy_RoomNumber()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getRoomNumber();

	/**
	 * Sets the value of the '{@link Implementation.OccupancyComponent_Occupancy#getRoomNumber <em>Room Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Number</em>' attribute.
	 * @see #getRoomNumber()
	 * @generated
	 */
	void setRoomNumber(int value);

	/**
	 * Returns the value of the '<em><b>Check In Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check In Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check In Date Time</em>' attribute.
	 * @see #setCheckInDateTime(long)
	 * @see Implementation.ImplementationPackage#getOccupancyComponent_Occupancy_CheckInDateTime()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	long getCheckInDateTime();

	/**
	 * Sets the value of the '{@link Implementation.OccupancyComponent_Occupancy#getCheckInDateTime <em>Check In Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check In Date Time</em>' attribute.
	 * @see #getCheckInDateTime()
	 * @generated
	 */
	void setCheckInDateTime(long value);

	/**
	 * Returns the value of the '<em><b>Check Out Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check Out Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Out Date Time</em>' attribute.
	 * @see #setCheckOutDateTime(long)
	 * @see Implementation.ImplementationPackage#getOccupancyComponent_Occupancy_CheckOutDateTime()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	long getCheckOutDateTime();

	/**
	 * Sets the value of the '{@link Implementation.OccupancyComponent_Occupancy#getCheckOutDateTime <em>Check Out Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Out Date Time</em>' attribute.
	 * @see #getCheckOutDateTime()
	 * @generated
	 */
	void setCheckOutDateTime(long value);

	/**
	 * Returns the value of the '<em><b>Guest</b></em>' reference list.
	 * The list contents are of type {@link Implementation.OccupancyComponent_Guest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guest</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guest</em>' reference list.
	 * @see Implementation.ImplementationPackage#getOccupancyComponent_Occupancy_Guest()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<OccupancyComponent_Guest> getGuest();

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
	 * @see Implementation.ImplementationPackage#getOccupancyComponent_Occupancy_BookingReference()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getBookingReference();

	/**
	 * Sets the value of the '{@link Implementation.OccupancyComponent_Occupancy#getBookingReference <em>Booking Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking Reference</em>' attribute.
	 * @see #getBookingReference()
	 * @generated
	 */
	void setBookingReference(String value);

	/**
	 * Returns the value of the '<em><b>Guests</b></em>' reference list.
	 * The list contents are of type {@link Implementation.OccupancyComponent_Guest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guests</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guests</em>' reference list.
	 * @see Implementation.ImplementationPackage#getOccupancyComponent_Occupancy_Guests()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<OccupancyComponent_Guest> getGuests();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false"
	 * @generated
	 */
	String getPartner(String firstName, String lastName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false"
	 * @generated
	 */
	boolean addGuestToOccupancy(String firstName, String lastName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" roomTypesDataType="org.eclipse.uml2.types.String" roomTypesMany="true" roomTypesOrdered="false" guestRoomTypeDataType="org.eclipse.uml2.types.String" guestRoomTypeRequired="true" guestRoomTypeOrdered="false"
	 * @generated
	 */
	boolean isInOccupancy(EList<String> roomTypes, String guestRoomType);

} // OccupancyComponent_Occupancy
