/**
 */
package Implementation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Support Component Occupancy DSS Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Implementation.DecisionSupportComponent_OccupancyDSSInfo#getRoomNumber <em>Room Number</em>}</li>
 *   <li>{@link Implementation.DecisionSupportComponent_OccupancyDSSInfo#getCheckInDateTime <em>Check In Date Time</em>}</li>
 *   <li>{@link Implementation.DecisionSupportComponent_OccupancyDSSInfo#getCheckOutDateTime <em>Check Out Date Time</em>}</li>
 *   <li>{@link Implementation.DecisionSupportComponent_OccupancyDSSInfo#getNumberOfGuests <em>Number Of Guests</em>}</li>
 * </ul>
 * </p>
 *
 * @see Implementation.ImplementationPackage#getDecisionSupportComponent_OccupancyDSSInfo()
 * @model
 * @generated
 */
public interface DecisionSupportComponent_OccupancyDSSInfo extends EObject {
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
	 * @see Implementation.ImplementationPackage#getDecisionSupportComponent_OccupancyDSSInfo_RoomNumber()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getRoomNumber();

	/**
	 * Sets the value of the '{@link Implementation.DecisionSupportComponent_OccupancyDSSInfo#getRoomNumber <em>Room Number</em>}' attribute.
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
	 * @see #setCheckInDateTime(String)
	 * @see Implementation.ImplementationPackage#getDecisionSupportComponent_OccupancyDSSInfo_CheckInDateTime()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCheckInDateTime();

	/**
	 * Sets the value of the '{@link Implementation.DecisionSupportComponent_OccupancyDSSInfo#getCheckInDateTime <em>Check In Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check In Date Time</em>' attribute.
	 * @see #getCheckInDateTime()
	 * @generated
	 */
	void setCheckInDateTime(String value);

	/**
	 * Returns the value of the '<em><b>Check Out Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check Out Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Out Date Time</em>' attribute.
	 * @see #setCheckOutDateTime(String)
	 * @see Implementation.ImplementationPackage#getDecisionSupportComponent_OccupancyDSSInfo_CheckOutDateTime()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCheckOutDateTime();

	/**
	 * Sets the value of the '{@link Implementation.DecisionSupportComponent_OccupancyDSSInfo#getCheckOutDateTime <em>Check Out Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Out Date Time</em>' attribute.
	 * @see #getCheckOutDateTime()
	 * @generated
	 */
	void setCheckOutDateTime(String value);

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
	 * @see Implementation.ImplementationPackage#getDecisionSupportComponent_OccupancyDSSInfo_NumberOfGuests()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getNumberOfGuests();

	/**
	 * Sets the value of the '{@link Implementation.DecisionSupportComponent_OccupancyDSSInfo#getNumberOfGuests <em>Number Of Guests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Guests</em>' attribute.
	 * @see #getNumberOfGuests()
	 * @generated
	 */
	void setNumberOfGuests(int value);

} // DecisionSupportComponent_OccupancyDSSInfo
