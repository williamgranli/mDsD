/**
 */
package Implementation;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Component Room Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Implementation.RoomComponent_RoomHandler#getAuthenticator <em>Authenticator</em>}</li>
 *   <li>{@link Implementation.RoomComponent_RoomHandler#getRoom <em>Room</em>}</li>
 *   <li>{@link Implementation.RoomComponent_RoomHandler#getConferenceRoom <em>Conference Room</em>}</li>
 * </ul>
 * </p>
 *
 * @see Implementation.ImplementationPackage#getRoomComponent_RoomHandler()
 * @model
 * @generated
 */
public interface RoomComponent_RoomHandler extends RoomComponent_IRoomDecision, RoomComponent_IRoomInformation, RoomComponent_IRoomAdministration {
	/**
	 * Returns the value of the '<em><b>Authenticator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authenticator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authenticator</em>' reference.
	 * @see #setAuthenticator(StaffComponent_IAuthentication)
	 * @see Implementation.ImplementationPackage#getRoomComponent_RoomHandler_Authenticator()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StaffComponent_IAuthentication getAuthenticator();

	/**
	 * Sets the value of the '{@link Implementation.RoomComponent_RoomHandler#getAuthenticator <em>Authenticator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authenticator</em>' reference.
	 * @see #getAuthenticator()
	 * @generated
	 */
	void setAuthenticator(StaffComponent_IAuthentication value);

	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference list.
	 * The list contents are of type {@link Implementation.RoomComponent_Bedroom}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference list.
	 * @see Implementation.ImplementationPackage#getRoomComponent_RoomHandler_Room()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<RoomComponent_Bedroom> getRoom();

	/**
	 * Returns the value of the '<em><b>Conference Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conference Room</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conference Room</em>' reference.
	 * @see #setConferenceRoom(RoomComponent_ConferenceRoom)
	 * @see Implementation.ImplementationPackage#getRoomComponent_RoomHandler_ConferenceRoom()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomComponent_ConferenceRoom getConferenceRoom();

	/**
	 * Sets the value of the '{@link Implementation.RoomComponent_RoomHandler#getConferenceRoom <em>Conference Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conference Room</em>' reference.
	 * @see #getConferenceRoom()
	 * @generated
	 */
	void setConferenceRoom(RoomComponent_ConferenceRoom value);

} // RoomComponent_RoomHandler
