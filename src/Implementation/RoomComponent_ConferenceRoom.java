/**
 */
package Implementation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Component Conference Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Implementation.RoomComponent_ConferenceRoom#getNumberOfSeats <em>Number Of Seats</em>}</li>
 *   <li>{@link Implementation.RoomComponent_ConferenceRoom#isProjector <em>Projector</em>}</li>
 *   <li>{@link Implementation.RoomComponent_ConferenceRoom#isConferencePhone <em>Conference Phone</em>}</li>
 * </ul>
 * </p>
 *
 * @see Implementation.ImplementationPackage#getRoomComponent_ConferenceRoom()
 * @model
 * @generated
 */
public interface RoomComponent_ConferenceRoom extends RoomComponent_Room {
	/**
	 * Returns the value of the '<em><b>Number Of Seats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Seats</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Seats</em>' attribute.
	 * @see #setNumberOfSeats(int)
	 * @see Implementation.ImplementationPackage#getRoomComponent_ConferenceRoom_NumberOfSeats()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getNumberOfSeats();

	/**
	 * Sets the value of the '{@link Implementation.RoomComponent_ConferenceRoom#getNumberOfSeats <em>Number Of Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Seats</em>' attribute.
	 * @see #getNumberOfSeats()
	 * @generated
	 */
	void setNumberOfSeats(int value);

	/**
	 * Returns the value of the '<em><b>Projector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projector</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projector</em>' attribute.
	 * @see #setProjector(boolean)
	 * @see Implementation.ImplementationPackage#getRoomComponent_ConferenceRoom_Projector()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isProjector();

	/**
	 * Sets the value of the '{@link Implementation.RoomComponent_ConferenceRoom#isProjector <em>Projector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Projector</em>' attribute.
	 * @see #isProjector()
	 * @generated
	 */
	void setProjector(boolean value);

	/**
	 * Returns the value of the '<em><b>Conference Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conference Phone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conference Phone</em>' attribute.
	 * @see #setConferencePhone(boolean)
	 * @see Implementation.ImplementationPackage#getRoomComponent_ConferenceRoom_ConferencePhone()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isConferencePhone();

	/**
	 * Sets the value of the '{@link Implementation.RoomComponent_ConferenceRoom#isConferencePhone <em>Conference Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conference Phone</em>' attribute.
	 * @see #isConferencePhone()
	 * @generated
	 */
	void setConferencePhone(boolean value);

} // RoomComponent_ConferenceRoom
