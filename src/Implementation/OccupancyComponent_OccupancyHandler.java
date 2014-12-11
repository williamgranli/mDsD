/**
 */
package Implementation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Occupancy Component Occupancy Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Implementation.OccupancyComponent_OccupancyHandler#getIRoomInformation <em>IRoom Information</em>}</li>
 *   <li>{@link Implementation.OccupancyComponent_OccupancyHandler#getIBooking <em>IBooking</em>}</li>
 * </ul>
 * </p>
 *
 * @see Implementation.ImplementationPackage#getOccupancyComponent_OccupancyHandler()
 * @model
 * @generated
 */
public interface OccupancyComponent_OccupancyHandler extends EObject {
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
	 * @see Implementation.ImplementationPackage#getOccupancyComponent_OccupancyHandler_IRoomInformation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomComponent_IRoomInformation getIRoomInformation();

	/**
	 * Sets the value of the '{@link Implementation.OccupancyComponent_OccupancyHandler#getIRoomInformation <em>IRoom Information</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IRoom Information</em>' reference.
	 * @see #getIRoomInformation()
	 * @generated
	 */
	void setIRoomInformation(RoomComponent_IRoomInformation value);

	/**
	 * Returns the value of the '<em><b>IBooking</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IBooking</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IBooking</em>' reference.
	 * @see #setIBooking(BookingComponent_IBooking)
	 * @see Implementation.ImplementationPackage#getOccupancyComponent_OccupancyHandler_IBooking()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BookingComponent_IBooking getIBooking();

	/**
	 * Sets the value of the '{@link Implementation.OccupancyComponent_OccupancyHandler#getIBooking <em>IBooking</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IBooking</em>' reference.
	 * @see #getIBooking()
	 * @generated
	 */
	void setIBooking(BookingComponent_IBooking value);

} // OccupancyComponent_OccupancyHandler
