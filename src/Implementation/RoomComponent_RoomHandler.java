/**
 */
package Implementation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Component Room Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Implementation.RoomComponent_RoomHandler#getAuthenticator <em>Authenticator</em>}</li>
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

} // RoomComponent_RoomHandler
