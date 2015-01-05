/**
 */
package Implementation.impl;

import Implementation.DecisionSupportComponent_AdditionalServiceDSSInfo;
import Implementation.DecisionSupportComponent_BookingDSSInfo;
import Implementation.ImplementationPackage;
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
 * An implementation of the model object '<em><b>Decision Support Component Booking DSS Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Implementation.impl.DecisionSupportComponent_BookingDSSInfoImpl#getNumberOfGuests <em>Number Of Guests</em>}</li>
 *   <li>{@link Implementation.impl.DecisionSupportComponent_BookingDSSInfoImpl#getRoomType <em>Room Type</em>}</li>
 *   <li>{@link Implementation.impl.DecisionSupportComponent_BookingDSSInfoImpl#getArrivalDate <em>Arrival Date</em>}</li>
 *   <li>{@link Implementation.impl.DecisionSupportComponent_BookingDSSInfoImpl#getDepartureDate <em>Departure Date</em>}</li>
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
	protected static final String ARRIVAL_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getArrivalDate() <em>Arrival Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalDate()
	 * @generated
	 * @ordered
	 */
	protected String arrivalDate = ARRIVAL_DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getDepartureDate() <em>Departure Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartureDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPARTURE_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDepartureDate() <em>Departure Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartureDate()
	 * @generated
	 * @ordered
	 */
	protected String departureDate = DEPARTURE_DATE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getAdditionalServices() <em>Additional Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalServices()
	 * @generated
	 * @ordered
	 */
	protected EList<DecisionSupportComponent_AdditionalServiceDSSInfo> additionalServices;
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
	 * @generated NOT
	 */
	protected DecisionSupportComponent_BookingDSSInfoImpl(String roomType, String arrivalDate,
			String departureDate, String customerFirstName,
			String customerLastName, String address, int numberOfGuests) {
		super();
		this.roomType= roomType;
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.address = address;
		this.numberOfGuests = numberOfGuests;
		this.additionalServices = null;
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
	public String getArrivalDate() {
		return arrivalDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrivalDate(String newArrivalDate) {
		String oldArrivalDate = arrivalDate;
		arrivalDate = newArrivalDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__ARRIVAL_DATE, oldArrivalDate, arrivalDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDepartureDate() {
		return departureDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepartureDate(String newDepartureDate) {
		String oldDepartureDate = departureDate;
		departureDate = newDepartureDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__DEPARTURE_DATE, oldDepartureDate, departureDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DecisionSupportComponent_AdditionalServiceDSSInfo> getAdditionalServices() {
		if (additionalServices == null) {
			additionalServices = new EObjectResolvingEList<DecisionSupportComponent_AdditionalServiceDSSInfo>(DecisionSupportComponent_AdditionalServiceDSSInfo.class, this, ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__ADDITIONAL_SERVICES);
		}
		return additionalServices;
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
	 * @generated NOT
	 */
	public void addAdditionalService(String additionalServiceName, long additionalServicePrice) {
		if (additionalServices == null) {
			additionalServices = new EObjectResolvingEList<DecisionSupportComponent_AdditionalServiceDSSInfo>(DecisionSupportComponent_AdditionalServiceDSSInfo.class, this, ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__ADDITIONAL_SERVICES);
		}
		
		additionalServices.add(new DecisionSupportComponent_AdditionalServiceDSSInfoImpl
				(additionalServiceName, additionalServicePrice));
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
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__ADDITIONAL_SERVICES:
				return getAdditionalServices();
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
	@SuppressWarnings("unchecked")
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
				setArrivalDate((String)newValue);
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__DEPARTURE_DATE:
				setDepartureDate((String)newValue);
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__ADDITIONAL_SERVICES:
				getAdditionalServices().clear();
				getAdditionalServices().addAll((Collection<? extends DecisionSupportComponent_AdditionalServiceDSSInfo>)newValue);
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
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__ADDITIONAL_SERVICES:
				getAdditionalServices().clear();
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
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO__ADDITIONAL_SERVICES:
				return additionalServices != null && !additionalServices.isEmpty();
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_BOOKING_DSS_INFO___ADD_ADDITIONAL_SERVICE__STRING_LONG:
				addAdditionalService((String)arguments.get(0), (Long)arguments.get(1));
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
		result.append(" (numberOfGuests: ");
		result.append(numberOfGuests);
		result.append(", roomType: ");
		result.append(roomType);
		result.append(", arrivalDate: ");
		result.append(arrivalDate);
		result.append(", departureDate: ");
		result.append(departureDate);
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
