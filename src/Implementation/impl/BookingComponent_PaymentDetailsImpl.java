/**
 */
package Implementation.impl;

import Implementation.BookingComponent_PaymentDetails;
import Implementation.ImplementationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking Component Payment Details</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Implementation.impl.BookingComponent_PaymentDetailsImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link Implementation.impl.BookingComponent_PaymentDetailsImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link Implementation.impl.BookingComponent_PaymentDetailsImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link Implementation.impl.BookingComponent_PaymentDetailsImpl#getCcNumber <em>Cc Number</em>}</li>
 *   <li>{@link Implementation.impl.BookingComponent_PaymentDetailsImpl#getCcv <em>Ccv</em>}</li>
 *   <li>{@link Implementation.impl.BookingComponent_PaymentDetailsImpl#getExpiryMonth <em>Expiry Month</em>}</li>
 *   <li>{@link Implementation.impl.BookingComponent_PaymentDetailsImpl#getExpiryYear <em>Expiry Year</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookingComponent_PaymentDetailsImpl extends MinimalEObjectImpl.Container implements BookingComponent_PaymentDetails {
	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getCcNumber() <em>Cc Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String CC_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCcNumber() <em>Cc Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcNumber()
	 * @generated
	 * @ordered
	 */
	protected String ccNumber = CC_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCcv() <em>Ccv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcv()
	 * @generated
	 * @ordered
	 */
	protected static final String CCV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCcv() <em>Ccv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcv()
	 * @generated
	 * @ordered
	 */
	protected String ccv = CCV_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpiryMonth() <em>Expiry Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiryMonth()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPIRY_MONTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpiryMonth() <em>Expiry Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiryMonth()
	 * @generated
	 * @ordered
	 */
	protected String expiryMonth = EXPIRY_MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpiryYear() <em>Expiry Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiryYear()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPIRY_YEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpiryYear() <em>Expiry Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiryYear()
	 * @generated
	 * @ordered
	 */
	protected String expiryYear = EXPIRY_YEAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingComponent_PaymentDetailsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.BOOKING_COMPONENT_PAYMENT_DETAILS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING_COMPONENT_PAYMENT_DETAILS__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING_COMPONENT_PAYMENT_DETAILS__LAST_NAME, oldLastName, lastName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING_COMPONENT_PAYMENT_DETAILS__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCcNumber() {
		return ccNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCcNumber(String newCcNumber) {
		String oldCcNumber = ccNumber;
		ccNumber = newCcNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING_COMPONENT_PAYMENT_DETAILS__CC_NUMBER, oldCcNumber, ccNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCcv() {
		return ccv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCcv(String newCcv) {
		String oldCcv = ccv;
		ccv = newCcv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING_COMPONENT_PAYMENT_DETAILS__CCV, oldCcv, ccv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpiryMonth() {
		return expiryMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpiryMonth(String newExpiryMonth) {
		String oldExpiryMonth = expiryMonth;
		expiryMonth = newExpiryMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING_COMPONENT_PAYMENT_DETAILS__EXPIRY_MONTH, oldExpiryMonth, expiryMonth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpiryYear() {
		return expiryYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpiryYear(String newExpiryYear) {
		String oldExpiryYear = expiryYear;
		expiryYear = newExpiryYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING_COMPONENT_PAYMENT_DETAILS__EXPIRY_YEAR, oldExpiryYear, expiryYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImplementationPackage.BOOKING_COMPONENT_PAYMENT_DETAILS__FIRST_NAME:
				return getFirstName();
			case ImplementationPackage.BOOKING_COMPONENT_PAYMENT_DETAILS__LAST_NAME:
				return getLastName();
			case ImplementationPackage.BOOKING_COMPONENT_PAYMENT_DETAILS__ADDRESS:
				return getAddress();
			case ImplementationPackage.BOOKING_COMPONENT_PAYMENT_DETAILS__CC_NUMBER:
				return getCcNumber();
			case ImplementationPackage.BOOKING_COMPONENT_PAYMENT_DETAILS__CCV:
				return getCcv();
			case ImplementationPackage.BOOKING_COMPONENT_PAYMENT_DETAILS__EXPIRY_MONTH:
				return getExpiryMonth();
			case ImplementationPackage.BOOKING_COMPONENT_PAYMENT_DETAILS__EXPIRY_YEAR:
				return getExpiryYear();
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
			case ImplementationPackage.BOOKING_COMPONENT_PAYMENT_DETAILS__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_PAYMENT_DETAILS__LAST_NAME:
				setLastName((String)newValue);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_PAYMENT_DETAILS__ADDRESS:
				setAddress((String)newValue);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_PAYMENT_DETAILS__CC_NUMBER:
				setCcNumber((String)newValue);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_PAYMENT_DETAILS__CCV:
				setCcv((String)newValue);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_PAYMENT_DETAILS__EXPIRY_MONTH:
				setExpiryMonth((String)newValue);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_PAYMENT_DETAILS__EXPIRY_YEAR:
				setExpiryYear((String)newValue);
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
			case ImplementationPackage.BOOKING_COMPONENT_PAYMENT_DETAILS__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_PAYMENT_DETAILS__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_PAYMENT_DETAILS__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_PAYMENT_DETAILS__CC_NUMBER:
				setCcNumber(CC_NUMBER_EDEFAULT);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_PAYMENT_DETAILS__CCV:
				setCcv(CCV_EDEFAULT);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_PAYMENT_DETAILS__EXPIRY_MONTH:
				setExpiryMonth(EXPIRY_MONTH_EDEFAULT);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_PAYMENT_DETAILS__EXPIRY_YEAR:
				setExpiryYear(EXPIRY_YEAR_EDEFAULT);
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
			case ImplementationPackage.BOOKING_COMPONENT_PAYMENT_DETAILS__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case ImplementationPackage.BOOKING_COMPONENT_PAYMENT_DETAILS__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case ImplementationPackage.BOOKING_COMPONENT_PAYMENT_DETAILS__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case ImplementationPackage.BOOKING_COMPONENT_PAYMENT_DETAILS__CC_NUMBER:
				return CC_NUMBER_EDEFAULT == null ? ccNumber != null : !CC_NUMBER_EDEFAULT.equals(ccNumber);
			case ImplementationPackage.BOOKING_COMPONENT_PAYMENT_DETAILS__CCV:
				return CCV_EDEFAULT == null ? ccv != null : !CCV_EDEFAULT.equals(ccv);
			case ImplementationPackage.BOOKING_COMPONENT_PAYMENT_DETAILS__EXPIRY_MONTH:
				return EXPIRY_MONTH_EDEFAULT == null ? expiryMonth != null : !EXPIRY_MONTH_EDEFAULT.equals(expiryMonth);
			case ImplementationPackage.BOOKING_COMPONENT_PAYMENT_DETAILS__EXPIRY_YEAR:
				return EXPIRY_YEAR_EDEFAULT == null ? expiryYear != null : !EXPIRY_YEAR_EDEFAULT.equals(expiryYear);
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
		result.append(" (firstName: ");
		result.append(firstName);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(", address: ");
		result.append(address);
		result.append(", ccNumber: ");
		result.append(ccNumber);
		result.append(", ccv: ");
		result.append(ccv);
		result.append(", expiryMonth: ");
		result.append(expiryMonth);
		result.append(", expiryYear: ");
		result.append(expiryYear);
		result.append(')');
		return result.toString();
	}

} //BookingComponent_PaymentDetailsImpl
