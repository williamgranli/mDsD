/**
 */
package implementation.impl;

import implementation.ImplementationPackage;
import implementation.OccupancyComponent_Guest;
import implementation.OccupancyComponent_Occupancy;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Occupancy Component Occupancy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link implementation.impl.OccupancyComponent_OccupancyImpl#getRoomNumber <em>Room Number</em>}</li>
 *   <li>{@link implementation.impl.OccupancyComponent_OccupancyImpl#getCheckInDateTime <em>Check In Date Time</em>}</li>
 *   <li>{@link implementation.impl.OccupancyComponent_OccupancyImpl#getCheckOutDateTime <em>Check Out Date Time</em>}</li>
 *   <li>{@link implementation.impl.OccupancyComponent_OccupancyImpl#getGuest <em>Guest</em>}</li>
 *   <li>{@link implementation.impl.OccupancyComponent_OccupancyImpl#getBookingReference <em>Booking Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OccupancyComponent_OccupancyImpl extends MinimalEObjectImpl.Container implements OccupancyComponent_Occupancy {
	/**
	 * The default value of the '{@link #getRoomNumber() <em>Room Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int ROOM_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRoomNumber() <em>Room Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomNumber()
	 * @generated
	 * @ordered
	 */
	protected int roomNumber = ROOM_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCheckInDateTime() <em>Check In Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckInDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final int CHECK_IN_DATE_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCheckInDateTime() <em>Check In Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckInDateTime()
	 * @generated
	 * @ordered
	 */
	protected int checkInDateTime = CHECK_IN_DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCheckOutDateTime() <em>Check Out Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckOutDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final int CHECK_OUT_DATE_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCheckOutDateTime() <em>Check Out Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckOutDateTime()
	 * @generated
	 * @ordered
	 */
	protected int checkOutDateTime = CHECK_OUT_DATE_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGuest() <em>Guest</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuest()
	 * @generated
	 * @ordered
	 */
	protected EList<OccupancyComponent_Guest> guest;

	/**
	 * The default value of the '{@link #getBookingReference() <em>Booking Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingReference()
	 * @generated
	 * @ordered
	 */
	protected static final String BOOKING_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBookingReference() <em>Booking Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingReference()
	 * @generated
	 * @ordered
	 */
	protected String bookingReference = BOOKING_REFERENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OccupancyComponent_OccupancyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.OCCUPANCY_COMPONENT_OCCUPANCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRoomNumber() {
		return roomNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomNumber(int newRoomNumber) {
		int oldRoomNumber = roomNumber;
		roomNumber = newRoomNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY__ROOM_NUMBER, oldRoomNumber, roomNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCheckInDateTime() {
		return checkInDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckInDateTime(int newCheckInDateTime) {
		int oldCheckInDateTime = checkInDateTime;
		checkInDateTime = newCheckInDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY__CHECK_IN_DATE_TIME, oldCheckInDateTime, checkInDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCheckOutDateTime() {
		return checkOutDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckOutDateTime(int newCheckOutDateTime) {
		int oldCheckOutDateTime = checkOutDateTime;
		checkOutDateTime = newCheckOutDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY__CHECK_OUT_DATE_TIME, oldCheckOutDateTime, checkOutDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OccupancyComponent_Guest> getGuest() {
		if (guest == null) {
			guest = new EObjectResolvingEList<OccupancyComponent_Guest>(OccupancyComponent_Guest.class, this, ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY__GUEST);
		}
		return guest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBookingReference() {
		return bookingReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingReference(String newBookingReference) {
		String oldBookingReference = bookingReference;
		bookingReference = newBookingReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY__BOOKING_REFERENCE, oldBookingReference, bookingReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void occupancy(int roomNumber, int checkInDateTime, OccupancyComponent_Guest guest, String bookingReference) {
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
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY__ROOM_NUMBER:
				return getRoomNumber();
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY__CHECK_IN_DATE_TIME:
				return getCheckInDateTime();
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY__CHECK_OUT_DATE_TIME:
				return getCheckOutDateTime();
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY__GUEST:
				return getGuest();
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY__BOOKING_REFERENCE:
				return getBookingReference();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY__ROOM_NUMBER:
				setRoomNumber((Integer)newValue);
				return;
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY__CHECK_IN_DATE_TIME:
				setCheckInDateTime((Integer)newValue);
				return;
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY__CHECK_OUT_DATE_TIME:
				setCheckOutDateTime((Integer)newValue);
				return;
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY__GUEST:
				getGuest().clear();
				getGuest().addAll((Collection<? extends OccupancyComponent_Guest>)newValue);
				return;
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY__BOOKING_REFERENCE:
				setBookingReference((String)newValue);
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
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY__ROOM_NUMBER:
				setRoomNumber(ROOM_NUMBER_EDEFAULT);
				return;
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY__CHECK_IN_DATE_TIME:
				setCheckInDateTime(CHECK_IN_DATE_TIME_EDEFAULT);
				return;
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY__CHECK_OUT_DATE_TIME:
				setCheckOutDateTime(CHECK_OUT_DATE_TIME_EDEFAULT);
				return;
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY__GUEST:
				getGuest().clear();
				return;
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY__BOOKING_REFERENCE:
				setBookingReference(BOOKING_REFERENCE_EDEFAULT);
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
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY__ROOM_NUMBER:
				return roomNumber != ROOM_NUMBER_EDEFAULT;
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY__CHECK_IN_DATE_TIME:
				return checkInDateTime != CHECK_IN_DATE_TIME_EDEFAULT;
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY__CHECK_OUT_DATE_TIME:
				return checkOutDateTime != CHECK_OUT_DATE_TIME_EDEFAULT;
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY__GUEST:
				return guest != null && !guest.isEmpty();
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY__BOOKING_REFERENCE:
				return BOOKING_REFERENCE_EDEFAULT == null ? bookingReference != null : !BOOKING_REFERENCE_EDEFAULT.equals(bookingReference);
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
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY___OCCUPANCY__INT_INT_OCCUPANCYCOMPONENT_GUEST_STRING:
				occupancy((Integer)arguments.get(0), (Integer)arguments.get(1), (OccupancyComponent_Guest)arguments.get(2), (String)arguments.get(3));
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
		result.append(" (roomNumber: ");
		result.append(roomNumber);
		result.append(", checkInDateTime: ");
		result.append(checkInDateTime);
		result.append(", checkOutDateTime: ");
		result.append(checkOutDateTime);
		result.append(", bookingReference: ");
		result.append(bookingReference);
		result.append(')');
		return result.toString();
	}

} //OccupancyComponent_OccupancyImpl
