/**
 */
package Implementation.impl;

import Implementation.BookingComponent_AdditionalService;
import Implementation.ImplementationPackage;

import java.util.Date;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking Component Additional Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Implementation.impl.BookingComponent_AdditionalServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link Implementation.impl.BookingComponent_AdditionalServiceImpl#getGuestCount <em>Guest Count</em>}</li>
 *   <li>{@link Implementation.impl.BookingComponent_AdditionalServiceImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link Implementation.impl.BookingComponent_AdditionalServiceImpl#getDateTime <em>Date Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookingComponent_AdditionalServiceImpl extends MinimalEObjectImpl.Container implements BookingComponent_AdditionalService {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuestCount() <em>Guest Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuestCount()
	 * @generated
	 * @ordered
	 */
	protected static final int GUEST_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGuestCount() <em>Guest Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuestCount()
	 * @generated
	 * @ordered
	 */
	protected int guestCount = GUEST_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date dateTime = DATE_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingComponent_AdditionalServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.BOOKING_COMPONENT_ADDITIONAL_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING_COMPONENT_ADDITIONAL_SERVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGuestCount() {
		return guestCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuestCount(int newGuestCount) {
		int oldGuestCount = guestCount;
		guestCount = newGuestCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING_COMPONENT_ADDITIONAL_SERVICE__GUEST_COUNT, oldGuestCount, guestCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING_COMPONENT_ADDITIONAL_SERVICE__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateTime() {
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTime(Date newDateTime) {
		Date oldDateTime = dateTime;
		dateTime = newDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING_COMPONENT_ADDITIONAL_SERVICE__DATE_TIME, oldDateTime, dateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImplementationPackage.BOOKING_COMPONENT_ADDITIONAL_SERVICE__NAME:
				return getName();
			case ImplementationPackage.BOOKING_COMPONENT_ADDITIONAL_SERVICE__GUEST_COUNT:
				return getGuestCount();
			case ImplementationPackage.BOOKING_COMPONENT_ADDITIONAL_SERVICE__LOCATION:
				return getLocation();
			case ImplementationPackage.BOOKING_COMPONENT_ADDITIONAL_SERVICE__DATE_TIME:
				return getDateTime();
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
			case ImplementationPackage.BOOKING_COMPONENT_ADDITIONAL_SERVICE__NAME:
				setName((String)newValue);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_ADDITIONAL_SERVICE__GUEST_COUNT:
				setGuestCount((Integer)newValue);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_ADDITIONAL_SERVICE__LOCATION:
				setLocation((String)newValue);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_ADDITIONAL_SERVICE__DATE_TIME:
				setDateTime((Date)newValue);
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
			case ImplementationPackage.BOOKING_COMPONENT_ADDITIONAL_SERVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_ADDITIONAL_SERVICE__GUEST_COUNT:
				setGuestCount(GUEST_COUNT_EDEFAULT);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_ADDITIONAL_SERVICE__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_ADDITIONAL_SERVICE__DATE_TIME:
				setDateTime(DATE_TIME_EDEFAULT);
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
			case ImplementationPackage.BOOKING_COMPONENT_ADDITIONAL_SERVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ImplementationPackage.BOOKING_COMPONENT_ADDITIONAL_SERVICE__GUEST_COUNT:
				return guestCount != GUEST_COUNT_EDEFAULT;
			case ImplementationPackage.BOOKING_COMPONENT_ADDITIONAL_SERVICE__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case ImplementationPackage.BOOKING_COMPONENT_ADDITIONAL_SERVICE__DATE_TIME:
				return DATE_TIME_EDEFAULT == null ? dateTime != null : !DATE_TIME_EDEFAULT.equals(dateTime);
		}
		return super.eIsSet(featureID);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", guestCount: ");
		result.append(guestCount);
		result.append(", location: ");
		result.append(location);
		result.append(", dateTime: ");
		result.append(dateTime);
		result.append(')');
		return result.toString();
	}

} //BookingComponent_AdditionalServiceImpl
