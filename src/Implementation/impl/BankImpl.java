/**
 */
package Implementation.impl;

import Implementation.Bank;
import Implementation.BookingComponent_IBookingAdministration;
import Implementation.BookingComponent_IBookingInformation;
import Implementation.ImplementationPackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bank</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BankImpl extends MinimalEObjectImpl.Container implements Bank {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BankImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.BANK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDSSInfo() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String makeBooking(Date arrivalDate, Date departureDate, String customerSSN, String customerFirstName, String customerLastName, String customerAddress, String ccNumber, String ccv, String expiryMonth, String expiryYear) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addRoom(String bookingReference, String roomType, int price) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void editBooking(String bookingReference, Date arrivalDate, Date departureDate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void cancelBooking(String bookingReference) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addAdditionalService(String bookingReference, String additionalServiceName, int cost) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeRoom(String bookingReference, String roomType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeAdditionalService(String bookingReference, String additionalServiceName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addGuestToBooking(String bookingReference, String firstName, String lastName, String address) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeGuest(String bookingReference, String firstName, String lastName, String address) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuestsInBooking(String bookingReference) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoomTypesInBooking(String bookingReference) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> searchForBooking(String bookingReference) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPaidFor(String bookingReference) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean makePayment(String bookingReference) {
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == BookingComponent_IBookingAdministration.class) {
			switch (baseOperationID) {
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___MAKE_BOOKING__DATE_DATE_STRING_STRING_STRING_STRING_STRING_STRING_STRING_STRING: return ImplementationPackage.BANK___MAKE_BOOKING__DATE_DATE_STRING_STRING_STRING_STRING_STRING_STRING_STRING_STRING;
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___ADD_ROOM__STRING_STRING_INT: return ImplementationPackage.BANK___ADD_ROOM__STRING_STRING_INT;
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___EDIT_BOOKING__STRING_DATE_DATE: return ImplementationPackage.BANK___EDIT_BOOKING__STRING_DATE_DATE;
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___CANCEL_BOOKING__STRING: return ImplementationPackage.BANK___CANCEL_BOOKING__STRING;
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___ADD_ADDITIONAL_SERVICE__STRING_STRING_INT: return ImplementationPackage.BANK___ADD_ADDITIONAL_SERVICE__STRING_STRING_INT;
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___REMOVE_ROOM__STRING_STRING: return ImplementationPackage.BANK___REMOVE_ROOM__STRING_STRING;
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___REMOVE_ADDITIONAL_SERVICE__STRING_STRING: return ImplementationPackage.BANK___REMOVE_ADDITIONAL_SERVICE__STRING_STRING;
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___ADD_GUEST_TO_BOOKING__STRING_STRING_STRING_STRING: return ImplementationPackage.BANK___ADD_GUEST_TO_BOOKING__STRING_STRING_STRING_STRING;
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___REMOVE_GUEST__STRING_STRING_STRING_STRING: return ImplementationPackage.BANK___REMOVE_GUEST__STRING_STRING_STRING_STRING;
				default: return -1;
			}
		}
		if (baseClass == BookingComponent_IBookingInformation.class) {
			switch (baseOperationID) {
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_INFORMATION___GET_GUESTS_IN_BOOKING__STRING: return ImplementationPackage.BANK___GET_GUESTS_IN_BOOKING__STRING;
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_INFORMATION___GET_ROOM_TYPES_IN_BOOKING__STRING: return ImplementationPackage.BANK___GET_ROOM_TYPES_IN_BOOKING__STRING;
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_INFORMATION___SEARCH_FOR_BOOKING__STRING: return ImplementationPackage.BANK___SEARCH_FOR_BOOKING__STRING;
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_INFORMATION___IS_PAID_FOR__STRING: return ImplementationPackage.BANK___IS_PAID_FOR__STRING;
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_INFORMATION___MAKE_PAYMENT__STRING: return ImplementationPackage.BANK___MAKE_PAYMENT__STRING;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ImplementationPackage.BANK___GET_DSS_INFO:
				return getDSSInfo();
			case ImplementationPackage.BANK___MAKE_BOOKING__DATE_DATE_STRING_STRING_STRING_STRING_STRING_STRING_STRING_STRING:
				return makeBooking((Date)arguments.get(0), (Date)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5), (String)arguments.get(6), (String)arguments.get(7), (String)arguments.get(8), (String)arguments.get(9));
			case ImplementationPackage.BANK___ADD_ROOM__STRING_STRING_INT:
				addRoom((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ImplementationPackage.BANK___EDIT_BOOKING__STRING_DATE_DATE:
				editBooking((String)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2));
				return null;
			case ImplementationPackage.BANK___CANCEL_BOOKING__STRING:
				cancelBooking((String)arguments.get(0));
				return null;
			case ImplementationPackage.BANK___ADD_ADDITIONAL_SERVICE__STRING_STRING_INT:
				addAdditionalService((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ImplementationPackage.BANK___REMOVE_ROOM__STRING_STRING:
				removeRoom((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case ImplementationPackage.BANK___REMOVE_ADDITIONAL_SERVICE__STRING_STRING:
				removeAdditionalService((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case ImplementationPackage.BANK___ADD_GUEST_TO_BOOKING__STRING_STRING_STRING_STRING:
				addGuestToBooking((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
				return null;
			case ImplementationPackage.BANK___REMOVE_GUEST__STRING_STRING_STRING_STRING:
				removeGuest((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
				return null;
			case ImplementationPackage.BANK___GET_GUESTS_IN_BOOKING__STRING:
				return getGuestsInBooking((String)arguments.get(0));
			case ImplementationPackage.BANK___GET_ROOM_TYPES_IN_BOOKING__STRING:
				return getRoomTypesInBooking((String)arguments.get(0));
			case ImplementationPackage.BANK___SEARCH_FOR_BOOKING__STRING:
				return searchForBooking((String)arguments.get(0));
			case ImplementationPackage.BANK___IS_PAID_FOR__STRING:
				return isPaidFor((String)arguments.get(0));
			case ImplementationPackage.BANK___MAKE_PAYMENT__STRING:
				return makePayment((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //BankImpl
