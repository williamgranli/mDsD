/**
 */
package implementation.impl;

import implementation.AdditionalServiceComponent_AdditionalServiceEvent;
import implementation.ImplementationPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Additional Service Component Additional Service Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link implementation.impl.AdditionalServiceComponent_AdditionalServiceEventImpl#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link implementation.impl.AdditionalServiceComponent_AdditionalServiceEventImpl#getName <em>Name</em>}</li>
 *   <li>{@link implementation.impl.AdditionalServiceComponent_AdditionalServiceEventImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link implementation.impl.AdditionalServiceComponent_AdditionalServiceEventImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link implementation.impl.AdditionalServiceComponent_AdditionalServiceEventImpl#getMaxAttendant <em>Max Attendant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdditionalServiceComponent_AdditionalServiceEventImpl extends MinimalEObjectImpl.Container implements AdditionalServiceComponent_AdditionalServiceEvent {
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
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final int PRICE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected int price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxAttendant() <em>Max Attendant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAttendant()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_ATTENDANT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxAttendant() <em>Max Attendant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAttendant()
	 * @generated
	 * @ordered
	 */
	protected int maxAttendant = MAX_ATTENDANT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdditionalServiceComponent_AdditionalServiceEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__DATE_TIME, oldDateTime, dateTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(int newPrice) {
		int oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxAttendant() {
		return maxAttendant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxAttendant(int newMaxAttendant) {
		int oldMaxAttendant = maxAttendant;
		maxAttendant = newMaxAttendant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__MAX_ATTENDANT, oldMaxAttendant, maxAttendant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getAdditionalServiceInfo(String addtionalServiceName) {
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
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__DATE_TIME:
				return getDateTime();
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__NAME:
				return getName();
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__LOCATION:
				return getLocation();
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__PRICE:
				return getPrice();
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__MAX_ATTENDANT:
				return getMaxAttendant();
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
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__DATE_TIME:
				setDateTime((Date)newValue);
				return;
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__NAME:
				setName((String)newValue);
				return;
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__LOCATION:
				setLocation((String)newValue);
				return;
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__PRICE:
				setPrice((Integer)newValue);
				return;
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__MAX_ATTENDANT:
				setMaxAttendant((Integer)newValue);
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
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__DATE_TIME:
				setDateTime(DATE_TIME_EDEFAULT);
				return;
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__MAX_ATTENDANT:
				setMaxAttendant(MAX_ATTENDANT_EDEFAULT);
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
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__DATE_TIME:
				return DATE_TIME_EDEFAULT == null ? dateTime != null : !DATE_TIME_EDEFAULT.equals(dateTime);
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__PRICE:
				return price != PRICE_EDEFAULT;
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__MAX_ATTENDANT:
				return maxAttendant != MAX_ATTENDANT_EDEFAULT;
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
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT___GET_ADDITIONAL_SERVICE_INFO__STRING:
				getAdditionalServiceInfo((String)arguments.get(0));
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
		result.append(" (dateTime: ");
		result.append(dateTime);
		result.append(", name: ");
		result.append(name);
		result.append(", location: ");
		result.append(location);
		result.append(", price: ");
		result.append(price);
		result.append(", maxAttendant: ");
		result.append(maxAttendant);
		result.append(')');
		return result.toString();
	}

} //AdditionalServiceComponent_AdditionalServiceEventImpl
