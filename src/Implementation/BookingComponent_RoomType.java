/**
 */
package Implementation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking Component Room Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Implementation.BookingComponent_RoomType#getRoomType <em>Room Type</em>}</li>
 *   <li>{@link Implementation.BookingComponent_RoomType#getCost <em>Cost</em>}</li>
 * </ul>
 * </p>
 *
 * @see Implementation.ImplementationPackage#getBookingComponent_RoomType()
 * @model
 * @generated
 */
public interface BookingComponent_RoomType extends EObject {
	/**
	 * Returns the value of the '<em><b>Room Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Type</em>' attribute.
	 * @see #setRoomType(String)
	 * @see Implementation.ImplementationPackage#getBookingComponent_RoomType_RoomType()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getRoomType();

	/**
	 * Sets the value of the '{@link Implementation.BookingComponent_RoomType#getRoomType <em>Room Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Type</em>' attribute.
	 * @see #getRoomType()
	 * @generated
	 */
	void setRoomType(String value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(int)
	 * @see Implementation.ImplementationPackage#getBookingComponent_RoomType_Cost()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getCost();

	/**
	 * Sets the value of the '{@link Implementation.BookingComponent_RoomType#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(int value);

} // BookingComponent_RoomType
