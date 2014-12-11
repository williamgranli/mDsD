/**
 */
package Implementation.impl;

import Implementation.AdditionalServiceComponent_IAdditionalServiceInformation;
import Implementation.BookingComponent_Booking;
import Implementation.BookingComponent_BookingManager;
import Implementation.ImplementationPackage;
import Implementation.PaymentComponent_IPayment;
import Implementation.RoomComponent_IRoomInformation;
import Implementation.StaffComponent_IAuthentication;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking Component Booking Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Implementation.impl.BookingComponent_BookingManagerImpl#getBookings <em>Bookings</em>}</li>
 *   <li>{@link Implementation.impl.BookingComponent_BookingManagerImpl#getAuthentication <em>Authentication</em>}</li>
 *   <li>{@link Implementation.impl.BookingComponent_BookingManagerImpl#getIRoomInformation <em>IRoom Information</em>}</li>
 *   <li>{@link Implementation.impl.BookingComponent_BookingManagerImpl#getIPayment <em>IPayment</em>}</li>
 *   <li>{@link Implementation.impl.BookingComponent_BookingManagerImpl#getIAdditionalServiceInformation <em>IAdditional Service Information</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookingComponent_BookingManagerImpl extends MinimalEObjectImpl.Container implements BookingComponent_BookingManager {
	/**
	 * The cached value of the '{@link #getBookings() <em>Bookings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookings()
	 * @generated
	 * @ordered
	 */
	protected EList<BookingComponent_Booking> bookings;

	/**
	 * The cached value of the '{@link #getAuthentication() <em>Authentication</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthentication()
	 * @generated
	 * @ordered
	 */
	protected StaffComponent_IAuthentication authentication;

	/**
	 * The cached value of the '{@link #getIRoomInformation() <em>IRoom Information</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIRoomInformation()
	 * @generated
	 * @ordered
	 */
	protected RoomComponent_IRoomInformation iRoomInformation;

	/**
	 * The cached value of the '{@link #getIPayment() <em>IPayment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPayment()
	 * @generated
	 * @ordered
	 */
	protected PaymentComponent_IPayment iPayment;

	/**
	 * The cached value of the '{@link #getIAdditionalServiceInformation() <em>IAdditional Service Information</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIAdditionalServiceInformation()
	 * @generated
	 * @ordered
	 */
	protected AdditionalServiceComponent_IAdditionalServiceInformation iAdditionalServiceInformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	protected BookingComponent_BookingManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.BOOKING_COMPONENT_BOOKING_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BookingComponent_Booking> getBookings() {
		if (bookings == null) {
			bookings = new EObjectResolvingEList<BookingComponent_Booking>(BookingComponent_Booking.class, this, ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER__BOOKINGS);
		}
		return bookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffComponent_IAuthentication getAuthentication() {
		if (authentication != null && authentication.eIsProxy()) {
			InternalEObject oldAuthentication = (InternalEObject)authentication;
			authentication = (StaffComponent_IAuthentication)eResolveProxy(oldAuthentication);
			if (authentication != oldAuthentication) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER__AUTHENTICATION, oldAuthentication, authentication));
			}
		}
		return authentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffComponent_IAuthentication basicGetAuthentication() {
		return authentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthentication(StaffComponent_IAuthentication newAuthentication) {
		StaffComponent_IAuthentication oldAuthentication = authentication;
		authentication = newAuthentication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER__AUTHENTICATION, oldAuthentication, authentication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomComponent_IRoomInformation getIRoomInformation() {
		if (iRoomInformation != null && iRoomInformation.eIsProxy()) {
			InternalEObject oldIRoomInformation = (InternalEObject)iRoomInformation;
			iRoomInformation = (RoomComponent_IRoomInformation)eResolveProxy(oldIRoomInformation);
			if (iRoomInformation != oldIRoomInformation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER__IROOM_INFORMATION, oldIRoomInformation, iRoomInformation));
			}
		}
		return iRoomInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomComponent_IRoomInformation basicGetIRoomInformation() {
		return iRoomInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIRoomInformation(RoomComponent_IRoomInformation newIRoomInformation) {
		RoomComponent_IRoomInformation oldIRoomInformation = iRoomInformation;
		iRoomInformation = newIRoomInformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER__IROOM_INFORMATION, oldIRoomInformation, iRoomInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentComponent_IPayment getIPayment() {
		if (iPayment != null && iPayment.eIsProxy()) {
			InternalEObject oldIPayment = (InternalEObject)iPayment;
			iPayment = (PaymentComponent_IPayment)eResolveProxy(oldIPayment);
			if (iPayment != oldIPayment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER__IPAYMENT, oldIPayment, iPayment));
			}
		}
		return iPayment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentComponent_IPayment basicGetIPayment() {
		return iPayment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIPayment(PaymentComponent_IPayment newIPayment) {
		PaymentComponent_IPayment oldIPayment = iPayment;
		iPayment = newIPayment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER__IPAYMENT, oldIPayment, iPayment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalServiceComponent_IAdditionalServiceInformation getIAdditionalServiceInformation() {
		if (iAdditionalServiceInformation != null && iAdditionalServiceInformation.eIsProxy()) {
			InternalEObject oldIAdditionalServiceInformation = (InternalEObject)iAdditionalServiceInformation;
			iAdditionalServiceInformation = (AdditionalServiceComponent_IAdditionalServiceInformation)eResolveProxy(oldIAdditionalServiceInformation);
			if (iAdditionalServiceInformation != oldIAdditionalServiceInformation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER__IADDITIONAL_SERVICE_INFORMATION, oldIAdditionalServiceInformation, iAdditionalServiceInformation));
			}
		}
		return iAdditionalServiceInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalServiceComponent_IAdditionalServiceInformation basicGetIAdditionalServiceInformation() {
		return iAdditionalServiceInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIAdditionalServiceInformation(AdditionalServiceComponent_IAdditionalServiceInformation newIAdditionalServiceInformation) {
		AdditionalServiceComponent_IAdditionalServiceInformation oldIAdditionalServiceInformation = iAdditionalServiceInformation;
		iAdditionalServiceInformation = newIAdditionalServiceInformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER__IADDITIONAL_SERVICE_INFORMATION, oldIAdditionalServiceInformation, iAdditionalServiceInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void makeBooking(String roomType, Date arrivalDate, Date departureDate, String customerSSN, String customerFirstName, String customerLastName, String customerAddress, String ccNumber, String ccv, String expiryMonth, String expiryYear) {
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
	 * @generated NOT
	 */
	public void makeBooking(String roomType, Date arrivalDate, Date departureDate, String customerSSN, String customerFirstName, String customerLastName, String customerAddress, String customerEmail, String ccNumber, String ccv, String expiryMonth, String expiryYear) {
		BookingComponent_Booking newBooking = new BookingComponent_BookingImpl();
		newBooking.Booking(roomType, arrivalDate, departureDate, customerSSN, customerFirstName, customerLastName, customerAddress, customerEmail, ccNumber, ccv, expiryMonth);
		bookings.add(newBooking);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void requestQuote(String roomType, int price, Date arrivalDate, Date departureDate) {
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
	public void addAdditionalService(String bookingReference, String additionalServiceName, int price) {
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
	public void removeAddionalService(String bookingReference, String additionalServiceName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void generateQuote(Date startDate, Date endDate, String roomType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> searchForBooking(String bookingReference) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		EList<String> foundGuests = (EList<String>) new ArrayList<String>();
		for(BookingComponent_Booking x : bookings)
		{
			if(x.getReferenceNumber().equals(bookingReference))
			{
				//Add to return list
				x.getGuests();
			}
		}
		return foundGuests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addGuestToBooking(String firstName, String lastName, String address) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void BookingManager() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public BookingComponent_Booking findBooking(String referenceNumber) 	
	{
		BookingComponent_Booking targetBooking = new BookingComponent_BookingImpl();
		
		for(BookingComponent_Booking x : bookings)
		{
			if(x.getReferenceNumber().equals(referenceNumber))
			{
				targetBooking = x;
			}
		}
		return targetBooking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER__BOOKINGS:
				return getBookings();
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER__AUTHENTICATION:
				if (resolve) return getAuthentication();
				return basicGetAuthentication();
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER__IROOM_INFORMATION:
				if (resolve) return getIRoomInformation();
				return basicGetIRoomInformation();
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER__IPAYMENT:
				if (resolve) return getIPayment();
				return basicGetIPayment();
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER__IADDITIONAL_SERVICE_INFORMATION:
				if (resolve) return getIAdditionalServiceInformation();
				return basicGetIAdditionalServiceInformation();
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
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER__BOOKINGS:
				getBookings().clear();
				getBookings().addAll((Collection<? extends BookingComponent_Booking>)newValue);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER__AUTHENTICATION:
				setAuthentication((StaffComponent_IAuthentication)newValue);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER__IROOM_INFORMATION:
				setIRoomInformation((RoomComponent_IRoomInformation)newValue);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER__IPAYMENT:
				setIPayment((PaymentComponent_IPayment)newValue);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER__IADDITIONAL_SERVICE_INFORMATION:
				setIAdditionalServiceInformation((AdditionalServiceComponent_IAdditionalServiceInformation)newValue);
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
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER__BOOKINGS:
				getBookings().clear();
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER__AUTHENTICATION:
				setAuthentication((StaffComponent_IAuthentication)null);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER__IROOM_INFORMATION:
				setIRoomInformation((RoomComponent_IRoomInformation)null);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER__IPAYMENT:
				setIPayment((PaymentComponent_IPayment)null);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER__IADDITIONAL_SERVICE_INFORMATION:
				setIAdditionalServiceInformation((AdditionalServiceComponent_IAdditionalServiceInformation)null);
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
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER__BOOKINGS:
				return bookings != null && !bookings.isEmpty();
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER__AUTHENTICATION:
				return authentication != null;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER__IROOM_INFORMATION:
				return iRoomInformation != null;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER__IPAYMENT:
				return iPayment != null;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER__IADDITIONAL_SERVICE_INFORMATION:
				return iAdditionalServiceInformation != null;
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
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER___MAKE_BOOKING__STRING_DATE_DATE_STRING_STRING_STRING_STRING_STRING_STRING_STRING_STRING:
				makeBooking((String)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5), (String)arguments.get(6), (String)arguments.get(7), (String)arguments.get(8), (String)arguments.get(9), (String)arguments.get(10));
				return null;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER___ADD_ROOM__STRING_STRING_INT:
				addRoom((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER___REQUEST_QUOTE__STRING_INT_DATE_DATE:
				requestQuote((String)arguments.get(0), (Integer)arguments.get(1), (Date)arguments.get(2), (Date)arguments.get(3));
				return null;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER___EDIT_BOOKING__STRING_DATE_DATE:
				editBooking((String)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2));
				return null;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER___CANCEL_BOOKING__STRING:
				cancelBooking((String)arguments.get(0));
				return null;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER___ADD_ADDITIONAL_SERVICE__STRING_STRING_INT:
				addAdditionalService((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER___REMOVE_ROOM__STRING_STRING:
				removeRoom((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER___REMOVE_ADDIONAL_SERVICE__STRING_STRING:
				removeAddionalService((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER___GENERATE_QUOTE__DATE_DATE_STRING:
				generateQuote((Date)arguments.get(0), (Date)arguments.get(1), (String)arguments.get(2));
				return null;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER___SEARCH_FOR_BOOKING__STRING:
				return searchForBooking((String)arguments.get(0));
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER___ADD_GUEST_TO_BOOKING__STRING_STRING_STRING:
				addGuestToBooking((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
				return null;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER___BOOKING_MANAGER:
				BookingManager();
				return null;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER___FIND_BOOKING__STRING:
				return findBooking((String)arguments.get(0));
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER___MAKE_BOOKING__STRING_DATE_DATE_STRING_STRING_STRING_STRING_STRING_STRING_STRING_STRING_STRING:
				makeBooking((String)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5), (String)arguments.get(6), (String)arguments.get(7), (String)arguments.get(8), (String)arguments.get(9), (String)arguments.get(10), (String)arguments.get(11));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //BookingComponent_BookingManagerImpl
