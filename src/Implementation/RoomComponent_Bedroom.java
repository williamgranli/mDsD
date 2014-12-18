/**
 */
package Implementation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Component Bedroom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Implementation.RoomComponent_Bedroom#getBedCount <em>Bed Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see Implementation.ImplementationPackage#getRoomComponent_Bedroom()
 * @model
 * @generated
 */
public interface RoomComponent_Bedroom extends RoomComponent_Room {
	/**
	 * Returns the value of the '<em><b>Bed Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bed Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bed Count</em>' attribute.
	 * @see #setBedCount(int)
	 * @see Implementation.ImplementationPackage#getRoomComponent_Bedroom_BedCount()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getBedCount();

	/**
	 * Sets the value of the '{@link Implementation.RoomComponent_Bedroom#getBedCount <em>Bed Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bed Count</em>' attribute.
	 * @see #getBedCount()
	 * @generated
	 */
	void setBedCount(int value);

} // RoomComponent_Bedroom
