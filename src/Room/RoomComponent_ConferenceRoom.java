/**
 */
package Room;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Conference Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Room.RoomComponent_ConferenceRoom#getNumberOfSeats <em>Number Of Seats</em>}</li>
 *   <li>{@link Room.RoomComponent_ConferenceRoom#isProjector <em>Projector</em>}</li>
 *   <li>{@link Room.RoomComponent_ConferenceRoom#isConferencePhone <em>Conference Phone</em>}</li>
 * </ul>
 * </p>
 *
 * @see Room.RoomPackage#getRoomComponent_ConferenceRoom()
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
	 * @see Room.RoomPackage#getRoomComponent_ConferenceRoom_NumberOfSeats()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getNumberOfSeats();

	/**
	 * Sets the value of the '{@link Room.RoomComponent_ConferenceRoom#getNumberOfSeats <em>Number Of Seats</em>}' attribute.
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
	 * @see Room.RoomPackage#getRoomComponent_ConferenceRoom_Projector()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isProjector();

	/**
	 * Sets the value of the '{@link Room.RoomComponent_ConferenceRoom#isProjector <em>Projector</em>}' attribute.
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
	 * @see Room.RoomPackage#getRoomComponent_ConferenceRoom_ConferencePhone()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isConferencePhone();

	/**
	 * Sets the value of the '{@link Room.RoomComponent_ConferenceRoom#isConferencePhone <em>Conference Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conference Phone</em>' attribute.
	 * @see #isConferencePhone()
	 * @generated
	 */
	void setConferencePhone(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomNumberDataType="org.eclipse.uml2.types.Integer" roomNumberRequired="true" roomNumberOrdered="false" usableDataType="org.eclipse.uml2.types.Boolean" usableRequired="true" usableOrdered="false" priceDataType="org.eclipse.uml2.types.Integer" priceRequired="true" priceOrdered="false" roomTypeNameDataType="org.eclipse.uml2.types.String" roomTypeNameRequired="true" roomTypeNameOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false" numberOfSeatsDataType="org.eclipse.uml2.types.Integer" numberOfSeatsRequired="true" numberOfSeatsOrdered="false" projectorDataType="org.eclipse.uml2.types.Boolean" projectorRequired="true" projectorOrdered="false" conferenceRoomDataType="org.eclipse.uml2.types.Boolean" conferenceRoomRequired="true" conferenceRoomOrdered="false"
	 * @generated
	 */
	void createConferenceRoom(int roomNumber, boolean usable, int price, String roomTypeName, String description, int numberOfSeats, boolean projector, boolean conferenceRoom);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomNumberRequired="true" roomNumberOrdered="false" usableRequired="true" usableOrdered="false" priceRequired="true" priceOrdered="false" roomTypeNameRequired="true" roomTypeNameOrdered="false" descriptionRequired="true" descriptionOrdered="false" numberOfSeatsRequired="true" numberOfSeatsOrdered="false" projectorRequired="true" projectorOrdered="false" conferencePhoneRequired="true" conferencePhoneOrdered="false"
	 * @generated
	 */
	void editRoom(int roomNumber, boolean usable, int price, String roomTypeName, String description, int numberOfSeats, boolean projector, boolean conferencePhone);

} // RoomComponent_ConferenceRoom
