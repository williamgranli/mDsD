/**
 */
package Implementation.impl;

import Implementation.DecisionSupportComponent_AdditionalServiceDSSInfo;
import Implementation.DecisionSupportComponent_BookingDSSInfo;
import Implementation.ImplementationPackage;

import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision Support Component Booking DSS Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Implementation.impl.DecisionSupportComponent_BookingDSSInfoImpl#getNumberOfGuests <em>Number Of Guests</em>}</li>
 *   <li>{@link Implementation.impl.DecisionSupportComponent_BookingDSSInfoImpl#getRoomType <em>Room Type</em>}</li>
 *   <li>{@link Implementation.impl.DecisionSupportComponent_BookingDSSInfoImpl#getArrivalDate <em>Arrival Date</em>}</li>
 *   <li>{@link Implementation.impl.DecisionSupportComponent_BookingDSSInfoImpl#getDepartureDate <em>Departure Date</em>}</li>
 *   <li>{@link Implementation.impl.DecisionSupportComponent_BookingDSSInfoImpl#getCustomerSSN <em>Customer SSN</em>}</li>
 *   <li>{@link Implementation.impl.DecisionSupportComponent_BookingDSSInfoImpl#getAdditionalServices <em>Additional Services</em>}</li>
 *   <li>{@link Implementation.impl.DecisionSupportComponent_BookingDSSInfoImpl#getCustomerFirstName <em>Customer First Name</em>}</li>
 *   <li>{@link Implementation.impl.DecisionSupportComponent_BookingDSSInfoImpl#getCustomerLastName <em>Customer Last Name</em>}</li>
 *   <li>{@link Implementation.impl.DecisionSupportComponent_BookingDSSInfoImpl#getAddress <em>Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecisionSupportComponent_BookingDSSInfoImpl extends MinimalEObjectImpl.Container implements DecisionSupportComponent_BookingDSSInfo {
	/**
	 * The default value of the '{@link #getNumberOfGuests() <em>Number Of Guests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfGuests()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_GUESTS_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getNumberOfGuests() <em>Number Of Guests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfGuests()
	 * @generated
	 * @ordered
	 */
	protected int numberOfGuests = NUMBER_OF_GUESTS_EDEFAULT;
	/**
	 * The default value of the '{@link #getRoomType() <em>Room Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomType()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOM_TYPE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRoomType() <em>Room Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomType()
	 * @generated
	 * @ordered
	 */
	protected String roomType = ROOM_TYPE_EDEFAULT;
	/**
	 * The default value of the '{@link #getArrivalDate() <em>Arrival Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ARRIVAL_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getArrivalDate() <em>Arrival Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalDate()
	 * @generated
	 * @ordered
	 */
	protected Date arrivalDate = ARRIVAL_DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getDepartureDate() <em>Departure Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartureDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DEPARTURE_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDepartureDate() <em>Departure Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartureDate()
	 * @generated
	 * @ordered
	 */
	protected Date departureDate = DEPARTURE_DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getCustomerSSN() <em>Customer SSN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerSSN()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOMER_SSN_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCustomerSSN() <em>Customer SSN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerSSN()
	 * @generated
	 * @ordered
	 */
	protected String customerSSN = CUSTOMER_SSN_EDEFAULT;
	/**
	 * The cached value of the '{@link #getAdditionalServices() <em>Additional Services</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalServices()
	 * @generated
	 * @ordered
	 */
	protected DecisionSupportComponent_AdditionalServiceDSSInfo additionalServices;
	/**
	 * The default value of the '{@link #getCustomerFirstName() <em>Customer First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOMER_FIRST_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCustomerFirstName() <em>Customer First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerFirstName()
	 * @generated
	 * @ordered
	 */
	protected String customerFirstName = CUSTOMER_FIRST_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getCustomerLastName() <em>Customer Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOMER_LAST_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCustomerLastName() <em>Customer Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerLastName()
	 * @generated
	 * @ordered
	 */
	protected String customerLastName = CUSTOMER_LAST_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionSupportComponent_BookingDSSInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfGuests() {
		return numberOfGuests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfGuests(int newNumberOfGuests) {
		int oldNumberOfGuests = numberOfGuests;
		numberOfGuests = newNumberOfGuests;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__NUMBER_OF_GUESTS, oldNumberOfGuests, numberOfGuests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoomType() {
		return roomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomType(String newRoomType) {
		String oldRoomType = roomType;
		roomType = newRoomType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__ROOM_TYPE, oldRoomType, roomType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getArrivalDate() {
		return arrivalDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrivalDate(Date newArrivalDate) {
		Date oldArrivalDate = arrivalDate;
		arrivalDate = newArrivalDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__ARRIVAL_DATE, oldArrivalDate, arrivalDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDepartureDate() {
		return departureDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepartureDate(Date newDepartureDate) {
		Date oldDepartureDate = departureDate;
		departureDate = newDepartureDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__DEPARTURE_DATE, oldDepartureDate, departureDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomerSSN() {
		return customerSSN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerSSN(String newCustomerSSN) {
		String oldCustomerSSN = customerSSN;
		customerSSN = newCustomerSSN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__CUSTOMER_SSN, oldCustomerSSN, customerSSN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionSupportComponent_AdditionalServiceDSSInfo getAdditionalServices() {
		if (additionalServices != null && additionalServices.eIsProxy()) {
			InternalEObject oldAdditionalServices = (InternalEObject)additionalServices;
			additionalServices = (DecisionSupportComponent_AdditionalServiceDSSInfo)eResolveProxy(oldAdditionalServices);
			if (additionalServices != oldAdditionalServices) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__ADDITIONAL_SERVICES, oldAdditionalServices, additionalServices));
			}
		}
		return additionalServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionSupportComponent_AdditionalServiceDSSInfo basicGetAdditionalServices() {
		return additionalServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditionalServices(DecisionSupportComponent_AdditionalServiceDSSInfo newAdditionalServices) {
		DecisionSupportComponent_AdditionalServiceDSSInfo oldAdditionalServices = additionalServices;
		additionalServices = newAdditionalServices;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__ADDITIONAL_SERVICES, oldAdditionalServices, additionalServices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomerFirstName() {
		return customerFirstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerFirstName(String newCustomerFirstName) {
		String oldCustomerFirstName = customerFirstName;
		customerFirstName = newCustomerFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__CUSTOMER_FIRST_NAME, oldCustomerFirstName, customerFirstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomerLastName() {
		return customerLastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerLastName(String newCustomerLastName) {
		String oldCustomerLastName = customerLastName;
		customerLastName = newCustomerLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__CUSTOMER_LAST_NAME, oldCustomerLastName, customerLastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__NUMBER_OF_GUESTS:
				return getNumberOfGuests();
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__ROOM_TYPE:
				return getRoomType();
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__ARRIVAL_DATE:
				return getArrivalDate();
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__DEPARTURE_DATE:
				return getDepartureDate();
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__CUSTOMER_SSN:
				return getCustomerSSN();
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__ADDITIONAL_SERVICES:
				if (resolve) return getAdditionalServices();
				return basicGetAdditionalServices();
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__CUSTOMER_FIRST_NAME:
				return getCustomerFirstName();
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__CUSTOMER_LAST_NAME:
				return getCustomerLastName();
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__ADDRESS:
				return getAddress();
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
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__NUMBER_OF_GUESTS:
				setNumberOfGuests((Integer)newValue);
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__ROOM_TYPE:
				setRoomType((String)newValue);
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__ARRIVAL_DATE:
				setArrivalDate((Date)newValue);
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__DEPARTURE_DATE:
				setDepartureDate((Date)newValue);
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__CUSTOMER_SSN:
				setCustomerSSN((String)newValue);
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__ADDITIONAL_SERVICES:
				setAdditionalServices((DecisionSupportComponent_AdditionalServiceDSSInfo)newValue);
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__CUSTOMER_FIRST_NAME:
				setCustomerFirstName((String)newValue);
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__CUSTOMER_LAST_NAME:
				setCustomerLastName((String)newValue);
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__ADDRESS:
				setAddress((String)newValue);
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
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__NUMBER_OF_GUESTS:
				setNumberOfGuests(NUMBER_OF_GUESTS_EDEFAULT);
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__ROOM_TYPE:
				setRoomType(ROOM_TYPE_EDEFAULT);
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__ARRIVAL_DATE:
				setArrivalDate(ARRIVAL_DATE_EDEFAULT);
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__DEPARTURE_DATE:
				setDepartureDate(DEPARTURE_DATE_EDEFAULT);
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__CUSTOMER_SSN:
				setCustomerSSN(CUSTOMER_SSN_EDEFAULT);
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__ADDITIONAL_SERVICES:
				setAdditionalServices((DecisionSupportComponent_AdditionalServiceDSSInfo)null);
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__CUSTOMER_FIRST_NAME:
				setCustomerFirstName(CUSTOMER_FIRST_NAME_EDEFAULT);
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__CUSTOMER_LAST_NAME:
				setCustomerLastName(CUSTOMER_LAST_NAME_EDEFAULT);
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
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
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__NUMBER_OF_GUESTS:
				return numberOfGuests != NUMBER_OF_GUESTS_EDEFAULT;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__ROOM_TYPE:
				return ROOM_TYPE_EDEFAULT == null ? roomType != null : !ROOM_TYPE_EDEFAULT.equals(roomType);
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__ARRIVAL_DATE:
				return ARRIVAL_DATE_EDEFAULT == null ? arrivalDate != null : !ARRIVAL_DATE_EDEFAULT.equals(arrivalDate);
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__DEPARTURE_DATE:
				return DEPARTURE_DATE_EDEFAULT == null ? departureDate != null : !DEPARTURE_DATE_EDEFAULT.equals(departureDate);
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__CUSTOMER_SSN:
				return CUSTOMER_SSN_EDEFAULT == null ? customerSSN != null : !CUSTOMER_SSN_EDEFAULT.equals(customerSSN);
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__ADDITIONAL_SERVICES:
				return additionalServices != null;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__CUSTOMER_FIRST_NAME:
				return CUSTOMER_FIRST_NAME_EDEFAULT == null ? customerFirstName != null : !CUSTOMER_FIRST_NAME_EDEFAULT.equals(customerFirstName);
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__CUSTOMER_LAST_NAME:
				return CUSTOMER_LAST_NAME_EDEFAULT == null ? customerLastName != null : !CUSTOMER_LAST_NAME_EDEFAULT.equals(customerLastName);
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
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
		result.append(" (numberOfGuests: ");
		result.append(numberOfGuests);
		result.append(", roomType: ");
		result.append(roomType);
		result.append(", arrivalDate: ");
		result.append(arrivalDate);
		result.append(", departureDate: ");
		result.append(departureDate);
		result.append(", customerSSN: ");
		result.append(customerSSN);
		result.append(", customerFirstName: ");
		result.append(customerFirstName);
		result.append(", customerLastName: ");
		result.append(customerLastName);
		result.append(", address: ");
		result.append(address);
		result.append(')');
		return result.toString();
	}

} //DecisionSupportComponent_BookingDSSInfoImpl
