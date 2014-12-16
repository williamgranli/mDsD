/**
 */
package Implementation.impl;

import Implementation.ImplementationPackage;
import Implementation.OccupancyComponent_Guest;
import Implementation.OccupancyComponent_Occupancy;

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
 *   <li>{@link Implementation.impl.OccupancyComponent_OccupancyImpl#getRoomNumber <em>Room Number</em>}</li>
 *   <li>{@link Implementation.impl.OccupancyComponent_OccupancyImpl#getCheckInDateTime <em>Check In Date Time</em>}</li>
 *   <li>{@link Implementation.impl.OccupancyComponent_OccupancyImpl#getCheckOutDateTime <em>Check Out Date Time</em>}</li>
 *   <li>{@link Implementation.impl.OccupancyComponent_OccupancyImpl#getGuest <em>Guest</em>}</li>
 *   <li>{@link Implementation.impl.OccupancyComponent_OccupancyImpl#getBookingReference <em>Booking Reference</em>}</li>
 *   <li>{@link Implementation.impl.OccupancyComponent_OccupancyImpl#getGuests <em>Guests</em>}</li>
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
	protected static final long CHECK_IN_DATE_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCheckInDateTime() <em>Check In Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckInDateTime()
	 * @generated
	 * @ordered
	 */
	protected long checkInDateTime = CHECK_IN_DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCheckOutDateTime() <em>Check Out Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckOutDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final long CHECK_OUT_DATE_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCheckOutDateTime() <em>Check Out Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckOutDateTime()
	 * @generated
	 * @ordered
	 */
	protected long checkOutDateTime = CHECK_OUT_DATE_TIME_EDEFAULT;

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
	 * The cached value of the '{@link #getGuests() <em>Guests</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuests()
	 * @generated
	 * @ordered
	 */
	protected EList<OccupancyComponent_Guest> guests;

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
	public long getCheckInDateTime() {
		return checkInDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckInDateTime(long newCheckInDateTime) {
		long oldCheckInDateTime = checkInDateTime;
		checkInDateTime = newCheckInDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY__CHECK_IN_DATE_TIME, oldCheckInDateTime, checkInDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setCheckInDateTime(int newCheckInDateTime) {
		int oldCheckInDateTime = newCheckInDateTime;
		checkInDateTime = newCheckInDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY__CHECK_IN_DATE_TIME, oldCheckInDateTime, checkInDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCheckOutDateTime() {
		return checkOutDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckOutDateTime(long newCheckOutDateTime) {
		long oldCheckOutDateTime = checkOutDateTime;
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
	public EList<OccupancyComponent_Guest> getGuests() {
		if (guests == null) {
			guests = new EObjectResolvingEList<OccupancyComponent_Guest>(OccupancyComponent_Guest.class, this, ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY__GUESTS);
		}
		return guests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getPartner(String firstName, String lastName) {
		for(OccupancyComponent_Guest guest: guests){
			if ((guest.getFirstName()).equals(firstName) && (guest.getLastName()).equals(lastName))
				return firstName + "," + lastName;
		}
		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean addGuestToOccupancy(String firstName, String lastName) {

		guests.add(new OccupancyComponent_GuestImpl(firstName, lastName));
		return true;

		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isInOccupancy(EList<String> roomTypes, String guestRoomType) {
		return false; //sdadfdsffdsfdsfdsfdsfds
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
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY__GUESTS:
				return getGuests();
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
				setCheckInDateTime((Long)newValue);
				return;
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY__CHECK_OUT_DATE_TIME:
				setCheckOutDateTime((Long)newValue);
				return;
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY__GUEST:
				getGuest().clear();
				getGuest().addAll((Collection<? extends OccupancyComponent_Guest>)newValue);
				return;
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY__BOOKING_REFERENCE:
				setBookingReference((String)newValue);
				return;
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY__GUESTS:
				getGuests().clear();
				getGuests().addAll((Collection<? extends OccupancyComponent_Guest>)newValue);
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
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY__GUESTS:
				getGuests().clear();
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
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY__GUESTS:
				return guests != null && !guests.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY___GET_PARTNER__STRING_STRING:
				return getPartner((String)arguments.get(0), (String)arguments.get(1));
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY___ADD_GUEST_TO_OCCUPANCY__STRING_STRING:
				return addGuestToOccupancy((String)arguments.get(0), (String)arguments.get(1));
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY___IS_IN_OCCUPANCY__ELIST_STRING:
				return isInOccupancy((EList<String>)arguments.get(0), (String)arguments.get(1));
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
