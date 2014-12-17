/**
 */
package Implementation;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Occupancy DSS Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Implementation.OccupancyDSSInfo#getRoomNumber <em>Room Number</em>}</li>
 *   <li>{@link Implementation.OccupancyDSSInfo#getCheckInDateTime <em>Check In Date Time</em>}</li>
 *   <li>{@link Implementation.OccupancyDSSInfo#getCheckOutDateTime <em>Check Out Date Time</em>}</li>
 *   <li>{@link Implementation.OccupancyDSSInfo#getNumberOfGuests <em>Number Of Guests</em>}</li>
 * </ul>
 * </p>
 *
 * @see Implementation.ImplementationPackage#getOccupancyDSSInfo()
 * @model
 * @generated
 */
public interface OccupancyDSSInfo extends EObject {
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
	 * @see Implementation.ImplementationPackage#getOccupancyDSSInfo_RoomNumber()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getRoomNumber();

	/**
	 * Sets the value of the '{@link Implementation.OccupancyDSSInfo#getRoomNumber <em>Room Number</em>}' attribute.
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
	 * @see #setCheckInDateTime(Date)
	 * @see Implementation.ImplementationPackage#getOccupancyDSSInfo_CheckInDateTime()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getCheckInDateTime();

	/**
	 * Sets the value of the '{@link Implementation.OccupancyDSSInfo#getCheckInDateTime <em>Check In Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check In Date Time</em>' attribute.
	 * @see #getCheckInDateTime()
	 * @generated
	 */
	void setCheckInDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Check Out Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check Out Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Out Date Time</em>' attribute.
	 * @see #setCheckOutDateTime(Date)
	 * @see Implementation.ImplementationPackage#getOccupancyDSSInfo_CheckOutDateTime()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getCheckOutDateTime();

	/**
	 * Sets the value of the '{@link Implementation.OccupancyDSSInfo#getCheckOutDateTime <em>Check Out Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Out Date Time</em>' attribute.
	 * @see #getCheckOutDateTime()
	 * @generated
	 */
	void setCheckOutDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Number Of Guests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Guests</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Guests</em>' attribute.
	 * @see #setNumberOfGuests(int)
	 * @see Implementation.ImplementationPackage#getOccupancyDSSInfo_NumberOfGuests()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getNumberOfGuests();

	/**
	 * Sets the value of the '{@link Implementation.OccupancyDSSInfo#getNumberOfGuests <em>Number Of Guests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Guests</em>' attribute.
	 * @see #getNumberOfGuests()
	 * @generated
	 */
	void setNumberOfGuests(int value);

} // OccupancyDSSInfo
