/**
 */
package implementation.impl;

import implementation.BookingComponent_AdditionalService;
import implementation.BookingComponent_Booking;
import implementation.BookingComponent_PaymentDetails;
import implementation.BookingComponent_RoomType;
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
 * An implementation of the model object '<em><b>Booking Component Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link implementation.impl.BookingComponent_BookingImpl#getArrivalDate <em>Arrival Date</em>}</li>
 *   <li>{@link implementation.impl.BookingComponent_BookingImpl#getDepartureDate <em>Departure Date</em>}</li>
 *   <li>{@link implementation.impl.BookingComponent_BookingImpl#getReferenceNumber <em>Reference Number</em>}</li>
 *   <li>{@link implementation.impl.BookingComponent_BookingImpl#getCurrentCost <em>Current Cost</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookingComponent_BookingImpl extends MinimalEObjectImpl.Container implements BookingComponent_Booking {
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
	 * The default value of the '{@link #getReferenceNumber() <em>Reference Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferenceNumber() <em>Reference Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceNumber()
	 * @generated
	 * @ordered
	 */
	protected String referenceNumber = REFERENCE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentCost() <em>Current Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentCost()
	 * @generated
	 * @ordered
	 */
	protected static final int CURRENT_COST_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCurrentCost() <em>Current Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentCost()
	 * @generated
	 * @ordered
	 */
	protected int currentCost = CURRENT_COST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingComponent_BookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.BOOKING_COMPONENT_BOOKING;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING_COMPONENT_BOOKING__ARRIVAL_DATE, oldArrivalDate, arrivalDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING_COMPONENT_BOOKING__DEPARTURE_DATE, oldDepartureDate, departureDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferenceNumber() {
		return referenceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceNumber(String newReferenceNumber) {
		String oldReferenceNumber = referenceNumber;
		referenceNumber = newReferenceNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING_COMPONENT_BOOKING__REFERENCE_NUMBER, oldReferenceNumber, referenceNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCurrentCost() {
		return currentCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentCost(int newCurrentCost) {
		int oldCurrentCost = currentCost;
		currentCost = newCurrentCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING_COMPONENT_BOOKING__CURRENT_COST, oldCurrentCost, currentCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void bookingObject() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void booking(Date arrivalDate, Date departureDate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addAdditionalServiceToBooking(BookingComponent_AdditionalService newService) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void booking(String roomType, Date arrivalDate, Date departureDate, String customerSsn, String customerFirstName, String customerLastName, String customerAddress, String customerEmail, String ccNumber, String ccv, String expiryMonth, String expiryYear) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addRoomToBooking(BookingComponent_RoomType newRoom) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeRoomFromBooking(String roomType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateBooking(String bookingReference, Date arrivalDate, Date departureDate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeAdditionalServiceFromBooking(BookingComponent_AdditionalService additionalService) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int currentCost() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updatePaymentDetails(BookingComponent_PaymentDetails newPaymentDetails) {
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
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__ARRIVAL_DATE:
				return getArrivalDate();
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__DEPARTURE_DATE:
				return getDepartureDate();
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__REFERENCE_NUMBER:
				return getReferenceNumber();
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__CURRENT_COST:
				return getCurrentCost();
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
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__ARRIVAL_DATE:
				setArrivalDate((Date)newValue);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__DEPARTURE_DATE:
				setDepartureDate((Date)newValue);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__REFERENCE_NUMBER:
				setReferenceNumber((String)newValue);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__CURRENT_COST:
				setCurrentCost((Integer)newValue);
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
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__ARRIVAL_DATE:
				setArrivalDate(ARRIVAL_DATE_EDEFAULT);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__DEPARTURE_DATE:
				setDepartureDate(DEPARTURE_DATE_EDEFAULT);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__REFERENCE_NUMBER:
				setReferenceNumber(REFERENCE_NUMBER_EDEFAULT);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__CURRENT_COST:
				setCurrentCost(CURRENT_COST_EDEFAULT);
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
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__ARRIVAL_DATE:
				return ARRIVAL_DATE_EDEFAULT == null ? arrivalDate != null : !ARRIVAL_DATE_EDEFAULT.equals(arrivalDate);
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__DEPARTURE_DATE:
				return DEPARTURE_DATE_EDEFAULT == null ? departureDate != null : !DEPARTURE_DATE_EDEFAULT.equals(departureDate);
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__REFERENCE_NUMBER:
				return REFERENCE_NUMBER_EDEFAULT == null ? referenceNumber != null : !REFERENCE_NUMBER_EDEFAULT.equals(referenceNumber);
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__CURRENT_COST:
				return currentCost != CURRENT_COST_EDEFAULT;
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
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING___BOOKING_OBJECT:
				bookingObject();
				return null;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING___BOOKING__DATE_DATE:
				booking((Date)arguments.get(0), (Date)arguments.get(1));
				return null;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING___ADD_ADDITIONAL_SERVICE_TO_BOOKING__BOOKINGCOMPONENT_ADDITIONALSERVICE:
				addAdditionalServiceToBooking((BookingComponent_AdditionalService)arguments.get(0));
				return null;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING___BOOKING__STRING_DATE_DATE_STRING_STRING_STRING_STRING_STRING_STRING_STRING_STRING_STRING:
				booking((String)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5), (String)arguments.get(6), (String)arguments.get(7), (String)arguments.get(8), (String)arguments.get(9), (String)arguments.get(10), (String)arguments.get(11));
				return null;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING___ADD_ROOM_TO_BOOKING__BOOKINGCOMPONENT_ROOMTYPE:
				addRoomToBooking((BookingComponent_RoomType)arguments.get(0));
				return null;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING___REMOVE_ROOM_FROM_BOOKING__STRING:
				removeRoomFromBooking((String)arguments.get(0));
				return null;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING___UPDATE_BOOKING__STRING_DATE_DATE:
				updateBooking((String)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2));
				return null;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING___REMOVE_ADDITIONAL_SERVICE_FROM_BOOKING__BOOKINGCOMPONENT_ADDITIONALSERVICE:
				removeAdditionalServiceFromBooking((BookingComponent_AdditionalService)arguments.get(0));
				return null;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING___CURRENT_COST:
				return currentCost();
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING___UPDATE_PAYMENT_DETAILS__BOOKINGCOMPONENT_PAYMENTDETAILS:
				updatePaymentDetails((BookingComponent_PaymentDetails)arguments.get(0));
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
		result.append(" (arrivalDate: ");
		result.append(arrivalDate);
		result.append(", departureDate: ");
		result.append(departureDate);
		result.append(", referenceNumber: ");
		result.append(referenceNumber);
		result.append(", currentCost: ");
		result.append(currentCost);
		result.append(')');
		return result.toString();
	}

} //BookingComponent_BookingImpl
