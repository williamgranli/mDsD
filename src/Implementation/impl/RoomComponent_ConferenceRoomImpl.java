/**
 */
package Implementation.impl;

import Implementation.ImplementationPackage;
import Implementation.RoomComponent_ConferenceRoom;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Component Conference Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Implementation.impl.RoomComponent_ConferenceRoomImpl#getNumberOfSeats <em>Number Of Seats</em>}</li>
 *   <li>{@link Implementation.impl.RoomComponent_ConferenceRoomImpl#isProjector <em>Projector</em>}</li>
 *   <li>{@link Implementation.impl.RoomComponent_ConferenceRoomImpl#isConferencePhone <em>Conference Phone</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomComponent_ConferenceRoomImpl extends RoomComponent_RoomImpl implements RoomComponent_ConferenceRoom {
	/**
	 * The default value of the '{@link #getNumberOfSeats() <em>Number Of Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSeats()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_SEATS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfSeats() <em>Number Of Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSeats()
	 * @generated
	 * @ordered
	 */
	protected int numberOfSeats = NUMBER_OF_SEATS_EDEFAULT;

	/**
	 * The default value of the '{@link #isProjector() <em>Projector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProjector()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROJECTOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isProjector() <em>Projector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProjector()
	 * @generated
	 * @ordered
	 */
	protected boolean projector = PROJECTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isConferencePhone() <em>Conference Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConferencePhone()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONFERENCE_PHONE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConferencePhone() <em>Conference Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConferencePhone()
	 * @generated
	 * @ordered
	 */
	protected boolean conferencePhone = CONFERENCE_PHONE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomComponent_ConferenceRoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.ROOM_COMPONENT_CONFERENCE_ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfSeats(int newNumberOfSeats) {
		int oldNumberOfSeats = numberOfSeats;
		numberOfSeats = newNumberOfSeats;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ROOM_COMPONENT_CONFERENCE_ROOM__NUMBER_OF_SEATS, oldNumberOfSeats, numberOfSeats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProjector() {
		return projector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjector(boolean newProjector) {
		boolean oldProjector = projector;
		projector = newProjector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ROOM_COMPONENT_CONFERENCE_ROOM__PROJECTOR, oldProjector, projector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConferencePhone() {
		return conferencePhone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConferencePhone(boolean newConferencePhone) {
		boolean oldConferencePhone = conferencePhone;
		conferencePhone = newConferencePhone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ROOM_COMPONENT_CONFERENCE_ROOM__CONFERENCE_PHONE, oldConferencePhone, conferencePhone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createConferenceRoom(int roomNumber, boolean usable, int price, String roomTypeName, String description, int numberOfSeats, boolean projector, boolean conferenceRoom) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void editRoom(int roomNumber, boolean usable, int price, String roomTypeName, String description, int numberOfSeats, boolean projector, boolean conferencePhone) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImplementationPackage.ROOM_COMPONENT_CONFERENCE_ROOM__NUMBER_OF_SEATS:
				return getNumberOfSeats();
			case ImplementationPackage.ROOM_COMPONENT_CONFERENCE_ROOM__PROJECTOR:
				return isProjector();
			case ImplementationPackage.ROOM_COMPONENT_CONFERENCE_ROOM__CONFERENCE_PHONE:
				return isConferencePhone();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ImplementationPackage.ROOM_COMPONENT_CONFERENCE_ROOM__NUMBER_OF_SEATS:
				setNumberOfSeats((Integer)newValue);
				return;
			case ImplementationPackage.ROOM_COMPONENT_CONFERENCE_ROOM__PROJECTOR:
				setProjector((Boolean)newValue);
				return;
			case ImplementationPackage.ROOM_COMPONENT_CONFERENCE_ROOM__CONFERENCE_PHONE:
				setConferencePhone((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ImplementationPackage.ROOM_COMPONENT_CONFERENCE_ROOM__NUMBER_OF_SEATS:
				setNumberOfSeats(NUMBER_OF_SEATS_EDEFAULT);
				return;
			case ImplementationPackage.ROOM_COMPONENT_CONFERENCE_ROOM__PROJECTOR:
				setProjector(PROJECTOR_EDEFAULT);
				return;
			case ImplementationPackage.ROOM_COMPONENT_CONFERENCE_ROOM__CONFERENCE_PHONE:
				setConferencePhone(CONFERENCE_PHONE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ImplementationPackage.ROOM_COMPONENT_CONFERENCE_ROOM__NUMBER_OF_SEATS:
				return numberOfSeats != NUMBER_OF_SEATS_EDEFAULT;
			case ImplementationPackage.ROOM_COMPONENT_CONFERENCE_ROOM__PROJECTOR:
				return projector != PROJECTOR_EDEFAULT;
			case ImplementationPackage.ROOM_COMPONENT_CONFERENCE_ROOM__CONFERENCE_PHONE:
				return conferencePhone != CONFERENCE_PHONE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ImplementationPackage.ROOM_COMPONENT_CONFERENCE_ROOM___CREATE_CONFERENCE_ROOM__INT_BOOLEAN_INT_STRING_STRING_INT_BOOLEAN_BOOLEAN:
				createConferenceRoom((Integer)arguments.get(0), (Boolean)arguments.get(1), (Integer)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (Integer)arguments.get(5), (Boolean)arguments.get(6), (Boolean)arguments.get(7));
				return null;
			case ImplementationPackage.ROOM_COMPONENT_CONFERENCE_ROOM___EDIT_ROOM__INT_BOOLEAN_INT_STRING_STRING_INT_BOOLEAN_BOOLEAN:
				editRoom((Integer)arguments.get(0), (Boolean)arguments.get(1), (Integer)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (Integer)arguments.get(5), (Boolean)arguments.get(6), (Boolean)arguments.get(7));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (numberOfSeats: ");
		result.append(numberOfSeats);
		result.append(", projector: ");
		result.append(projector);
		result.append(", conferencePhone: ");
		result.append(conferencePhone);
		result.append(')');
		return result.toString();
	}

} //RoomComponent_ConferenceRoomImpl
