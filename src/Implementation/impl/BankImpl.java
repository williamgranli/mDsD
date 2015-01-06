/**
 */
package Implementation.impl;

import Implementation.Bank;
import Implementation.BookingComponent_IBookingAdministration;
import Implementation.BookingComponent_IBookingInformation;
import Implementation.ImplementationPackage;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.Map;
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
	public String makeBooking(String roomType, Date arrivalDate, Date departureDate, String customerSSN) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean addRoom(String bookingReference, String roomType, int price) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean editBooking(String bookingReference, Date arrivalDate, Date departureDate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean cancelBooking(String bookingReference) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean addAdditionalService(String bookingReference, String additionalServiceName, int cost) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean removeRoom(String bookingReference, String roomType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean removeAdditionalService(String bookingReference, String additionalServiceName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean addGuestToBooking(String bookingReference, String firstName, String lastName, String address, String phoneNumber) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean removeGuest(String bookingReference, String firstName, String lastName, String address) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean confirmBooking(String bookingReference) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean addPaymentDetails(String bookingReference, String customerFirstName, String customerLastName, String customerAddress, String ccNumber, String ccv, int expiryMonth, int expiryYear) {
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
	public Map searchAvailableRoomTypes(Date arrivalDate, Date departureDate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int findBookingsByDateAndType(Date arrivalDate, Date departureDate, String roomType) {
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
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___MAKE_BOOKING__STRING_DATE_DATE_STRING: return ImplementationPackage.BANK___MAKE_BOOKING__STRING_DATE_DATE_STRING;
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___ADD_ROOM__STRING_STRING_INT: return ImplementationPackage.BANK___ADD_ROOM__STRING_STRING_INT;
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___EDIT_BOOKING__STRING_DATE_DATE: return ImplementationPackage.BANK___EDIT_BOOKING__STRING_DATE_DATE;
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___CANCEL_BOOKING__STRING: return ImplementationPackage.BANK___CANCEL_BOOKING__STRING;
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___ADD_ADDITIONAL_SERVICE__STRING_STRING_INT: return ImplementationPackage.BANK___ADD_ADDITIONAL_SERVICE__STRING_STRING_INT;
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___REMOVE_ROOM__STRING_STRING: return ImplementationPackage.BANK___REMOVE_ROOM__STRING_STRING;
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___REMOVE_ADDITIONAL_SERVICE__STRING_STRING: return ImplementationPackage.BANK___REMOVE_ADDITIONAL_SERVICE__STRING_STRING;
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___ADD_GUEST_TO_BOOKING__STRING_STRING_STRING_STRING_STRING: return ImplementationPackage.BANK___ADD_GUEST_TO_BOOKING__STRING_STRING_STRING_STRING_STRING;
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___REMOVE_GUEST__STRING_STRING_STRING_STRING: return ImplementationPackage.BANK___REMOVE_GUEST__STRING_STRING_STRING_STRING;
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___CONFIRM_BOOKING__STRING: return ImplementationPackage.BANK___CONFIRM_BOOKING__STRING;
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___ADD_PAYMENT_DETAILS__STRING_STRING_STRING_STRING_STRING_STRING_INT_INT: return ImplementationPackage.BANK___ADD_PAYMENT_DETAILS__STRING_STRING_STRING_STRING_STRING_STRING_INT_INT;
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
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_INFORMATION___SEARCH_AVAILABLE_ROOM_TYPES__DATE_DATE: return ImplementationPackage.BANK___SEARCH_AVAILABLE_ROOM_TYPES__DATE_DATE;
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_INFORMATION___FIND_BOOKINGS_BY_DATE_AND_TYPE__DATE_DATE_STRING: return ImplementationPackage.BANK___FIND_BOOKINGS_BY_DATE_AND_TYPE__DATE_DATE_STRING;
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
			case ImplementationPackage.BANK___MAKE_BOOKING__STRING_DATE_DATE_STRING:
				return makeBooking((String)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2), (String)arguments.get(3));
			case ImplementationPackage.BANK___ADD_ROOM__STRING_STRING_INT:
				return addRoom((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2));
			case ImplementationPackage.BANK___EDIT_BOOKING__STRING_DATE_DATE:
				return editBooking((String)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2));
			case ImplementationPackage.BANK___CANCEL_BOOKING__STRING:
				return cancelBooking((String)arguments.get(0));
			case ImplementationPackage.BANK___ADD_ADDITIONAL_SERVICE__STRING_STRING_INT:
				return addAdditionalService((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2));
			case ImplementationPackage.BANK___REMOVE_ROOM__STRING_STRING:
				return removeRoom((String)arguments.get(0), (String)arguments.get(1));
			case ImplementationPackage.BANK___REMOVE_ADDITIONAL_SERVICE__STRING_STRING:
				return removeAdditionalService((String)arguments.get(0), (String)arguments.get(1));
			case ImplementationPackage.BANK___ADD_GUEST_TO_BOOKING__STRING_STRING_STRING_STRING_STRING:
				return addGuestToBooking((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4));
			case ImplementationPackage.BANK___REMOVE_GUEST__STRING_STRING_STRING_STRING:
				return removeGuest((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
			case ImplementationPackage.BANK___CONFIRM_BOOKING__STRING:
				return confirmBooking((String)arguments.get(0));
			case ImplementationPackage.BANK___ADD_PAYMENT_DETAILS__STRING_STRING_STRING_STRING_STRING_STRING_INT_INT:
				return addPaymentDetails((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5), (Integer)arguments.get(6), (Integer)arguments.get(7));
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
			case ImplementationPackage.BANK___SEARCH_AVAILABLE_ROOM_TYPES__DATE_DATE:
				return searchAvailableRoomTypes((Date)arguments.get(0), (Date)arguments.get(1));
			case ImplementationPackage.BANK___FIND_BOOKINGS_BY_DATE_AND_TYPE__DATE_DATE_STRING:
				return findBookingsByDateAndType((Date)arguments.get(0), (Date)arguments.get(1), (String)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

} //BankImpl
