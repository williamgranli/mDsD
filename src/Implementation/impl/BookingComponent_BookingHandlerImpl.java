/**
 */
package Implementation.impl;

import Implementation.AdditionalServiceComponent_IEventManagement;
import Implementation.BookingComponent_AdditionalService;
import Implementation.BookingComponent_Booking;
import Implementation.BookingComponent_BookingHandler;
import Implementation.BookingComponent_IBookingAdministration;
import Implementation.BookingComponent_IBookingDecision;
import Implementation.ImplementationPackage;
import Implementation.PaymentComponent_IPayment;
import Implementation.RoomComponent_IRoomInformation;
import Implementation.StaffComponent_IAuthentication;
import java.lang.reflect.InvocationTargetException;
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
 * An implementation of the model object '<em><b>Booking Component Booking Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Implementation.impl.BookingComponent_BookingHandlerImpl#getBookings <em>Bookings</em>}</li>
 *   <li>{@link Implementation.impl.BookingComponent_BookingHandlerImpl#getAuthentication <em>Authentication</em>}</li>
 *   <li>{@link Implementation.impl.BookingComponent_BookingHandlerImpl#getIRoomInformation <em>IRoom Information</em>}</li>
 *   <li>{@link Implementation.impl.BookingComponent_BookingHandlerImpl#getIAdditionalServiceInformation <em>IAdditional Service Information</em>}</li>
 *   <li>{@link Implementation.impl.BookingComponent_BookingHandlerImpl#getIPayment <em>IPayment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookingComponent_BookingHandlerImpl extends MinimalEObjectImpl.Container implements BookingComponent_BookingHandler {
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
	 * The cached value of the '{@link #getIAdditionalServiceInformation() <em>IAdditional Service Information</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIAdditionalServiceInformation()
	 * @generated
	 * @ordered
	 */
	protected AdditionalServiceComponent_IEventManagement iAdditionalServiceInformation;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */	
	protected BookingComponent_BookingHandlerImpl() {
		super();
		bookings = getBookings();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.BOOKING_COMPONENT_BOOKING_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BookingComponent_Booking> getBookings() {
		if (bookings == null) {
			bookings = new EObjectResolvingEList<BookingComponent_Booking>(BookingComponent_Booking.class, this, ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__BOOKINGS);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__AUTHENTICATION, oldAuthentication, authentication));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__AUTHENTICATION, oldAuthentication, authentication));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__IROOM_INFORMATION, oldIRoomInformation, iRoomInformation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__IROOM_INFORMATION, oldIRoomInformation, iRoomInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalServiceComponent_IEventManagement getIAdditionalServiceInformation() {
		if (iAdditionalServiceInformation != null && iAdditionalServiceInformation.eIsProxy()) {
			InternalEObject oldIAdditionalServiceInformation = (InternalEObject)iAdditionalServiceInformation;
			iAdditionalServiceInformation = (AdditionalServiceComponent_IEventManagement)eResolveProxy(oldIAdditionalServiceInformation);
			if (iAdditionalServiceInformation != oldIAdditionalServiceInformation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__IADDITIONAL_SERVICE_INFORMATION, oldIAdditionalServiceInformation, iAdditionalServiceInformation));
			}
		}
		return iAdditionalServiceInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalServiceComponent_IEventManagement basicGetIAdditionalServiceInformation() {
		return iAdditionalServiceInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIAdditionalServiceInformation(AdditionalServiceComponent_IEventManagement newIAdditionalServiceInformation) {
		AdditionalServiceComponent_IEventManagement oldIAdditionalServiceInformation = iAdditionalServiceInformation;
		iAdditionalServiceInformation = newIAdditionalServiceInformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__IADDITIONAL_SERVICE_INFORMATION, oldIAdditionalServiceInformation, iAdditionalServiceInformation));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__IPAYMENT, oldIPayment, iPayment));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__IPAYMENT, oldIPayment, iPayment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getGuestsInBooking(String bookingReference) {
		String foundGuests = "";
		
		
		for(BookingComponent_Booking booking : bookings){
			if (bookingReference.equals(booking.getBookingReference())) {
				foundGuests = booking.getGuestsInBooking();

			}
		}

		return foundGuests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getRoomTypesInBooking(String bookingReference) {
	String foundRoomTypes = null;
		
		
		for(BookingComponent_Booking booking : bookings){
			if (bookingReference.equals(booking.getBookingReference())) {
				foundRoomTypes = booking.getRoomTypesInBooking();

			}
		}

		return foundRoomTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> searchForBooking(String bookingReference) {
		Date todaysDate = new Date();

		EList<String> bookingInfo = new EObjectResolvingEList<String>(BookingComponent_Booking.class, this, ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__BOOKINGS);

		for(BookingComponent_Booking booking : bookings){

			// Booking is found for the reference number
			if(booking.getBookingReference().equals(bookingReference)){

				// Check that booking date is not in the future
				if((booking.getArrivalDate()).compareTo(todaysDate) <= 0){

					// Check if booking check out that has not passed
					if(booking.getDepartureDate().compareTo(todaysDate) <= 0){
						System.out.println("Booking departure date is already passed\n"
							+ "Departure date was on: " + (booking.getDepartureDate()).toString());
						return null;
					}

				}

				// Booking date is in the future
				else{
					System.out.println("Booking arrival date will be on: " + (booking.getArrivalDate()).toString());
					return null;
				}

				bookingInfo.add(booking.getRoomTypesInBooking());
				bookingInfo.add(booking.getGuestsInBooking());

				return bookingInfo;
			}
		}

		// return null if bookingReference doesn't match any booking
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isPaidFor(String bookingReference) {
		for (BookingComponent_Booking booking : bookings) {
			if (booking.getBookingReference().equals(bookingReference)) {
				return booking.isPaid();
			}
		}
		//should not happen
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean makePayment(String bookingReference) {
		boolean successful = false;
		
		for (BookingComponent_Booking booking : bookings) {
			if (booking.getBookingReference().equals(bookingReference)) {
				String paymentString = booking.getPaymentDetails().toString();
				String [] paymentArray = paymentString.split(",");
				successful = iPayment.makePayment(paymentArray[0], paymentArray[1], Integer.parseInt(paymentArray[2]), 
						Integer.parseInt(paymentArray[3]), paymentArray[4], paymentArray[5], booking.getCurrentCost());
				if (successful == true) {
					booking.setIsPaid(true);
				}
			}
		}
		
		return successful;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> getDSSInfo() {
		EList<String> DSSInfo = new EObjectResolvingEList<String>(BookingComponent_Booking.class, this, 
				ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__BOOKINGS);
		for (BookingComponent_Booking booking: bookings){
			String currentBookings=booking.getRoomTypesInBooking()+","+booking.getArrivalDate()+","+booking.getDepartureDate()+","
					+booking.getPaymentDetails().getSsn()+","+booking.getPaymentDetails().getFirstName()+","
					+booking.getPaymentDetails().getLastName()+","+booking.getPaymentDetails().getAddress()
					+","+booking.getGuests().size();
			
			String additionalServices=null;
			for (BookingComponent_AdditionalService additionalService: booking.getAdditionalServices()){
				if(additionalServices == null){
					additionalServices = additionalService.getName()+":"+additionalService.getCost();
				}
				else{
					additionalServices += ","+additionalService.getName()+":"+additionalService.getCost();
				}
			}
			DSSInfo.add(currentBookings+";"+additionalServices);
		}
		return DSSInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String makeBooking(Date arrivalDate, Date departureDate, String customerSSN, String customerFirstName, String customerLastName, String customerAddress, String ccNumber, String ccv, String expiryMonth, String expiryYear) {
		BookingComponent_Booking newBooking = new BookingComponent_BookingImpl(arrivalDate, departureDate);
		bookings.add(newBooking);
		
		return newBooking.getBookingReference();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addRoom(String bookingReference, String roomType, int price) {
		BookingComponent_Booking bookingToChange = findBooking(bookingReference);
		
		if(bookingToChange.getBookingReference().equals("NULL"))
		{
			System.out.println("Invalid Reference Number");
		}
		else
		{
			bookingToChange.addRoomToBooking(roomType, price);
		}
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
	 * @generated NOT
	 */
	public void editBooking(String bookingReference, Date arrivalDate, Date departureDate) {
		BookingComponent_Booking targetBooking = findBooking(bookingReference);
		
		if(targetBooking.getBookingReference().equals("NULL"))
		{
			System.out.println("Invalid Reference Number");
		}
		else
		{
			targetBooking.updateBooking(arrivalDate, departureDate);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void cancelBooking(String bookingReference) {
		BookingComponent_Booking bookingToRemove = findBooking(bookingReference);
		if(bookingToRemove.equals("NULL"))
		{
			System.out.println("Invalid Reference Number");
		}
		else
		{
			bookings.remove(bookingToRemove);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addAdditionalService(String bookingReference, String additionalServiceName, int price) {
		BookingComponent_Booking bookingToChange = findBooking(bookingReference);
		if(bookingToChange.equals("NULL"))
		{
			System.out.println("Invalid Reference Number");
		}
		else
		{
			bookingToChange.addAdditionalServiceToBooking(additionalServiceName, price);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeRoom(String bookingReference, String roomType) {
		BookingComponent_Booking bookingToRemove = findBooking(bookingReference);
		if(bookingToRemove.equals("NULL"))
		{
			System.out.println("Invalid Reference Number");
		}
		else
		{
			bookingToRemove.removeRoomFromBooking(roomType);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeAdditionalService(String bookingReference, String additionalServiceName) {
		BookingComponent_Booking bookingToRemove = findBooking(bookingReference);
		if(bookingToRemove.equals("NULL"))
		{
			System.out.println("Invalid Reference Number");
		}
		else
		{
			bookingToRemove.removeAdditionalServiceFromBooking(additionalServiceName);
		}
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
	public void addGuestToBooking(String bookingReference, String firstName, String lastName, String address) {
		BookingComponent_Booking bookingToChange = findBooking(bookingReference);
		if(bookingToChange.getBookingReference().equals("NULL"))
		{
			System.out.println("Invalid Booking Reference");
		}
		else
		{
			bookingToChange.addGuestToBooking(firstName, lastName, address);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeGuest(String bookingReference, String firstName, String lastName, String address) {
		BookingComponent_Booking targetBooking = findBooking(bookingReference);
		if(targetBooking.getBookingReference().equals("NULL")) {
			System.out.println("Invalid Booking Reference");
		} else {
			targetBooking.removeGuestFromBooking(firstName, lastName, address);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public BookingComponent_Booking findBooking(String referenceNumber) {
		BookingComponent_Booking targetBooking = new BookingComponent_BookingImpl();
		
		for(BookingComponent_Booking x : bookings)
		{
			if(x.getBookingReference().equals(referenceNumber))
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
	public boolean bookingAvailable(Date startDate, Date endDate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int findBookingsByDateAndType(Date startDate, Date endDate, String roomType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int findBookingsByDate(Date startDate, Date endDate) {
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
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__BOOKINGS:
				return getBookings();
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__AUTHENTICATION:
				if (resolve) return getAuthentication();
				return basicGetAuthentication();
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__IROOM_INFORMATION:
				if (resolve) return getIRoomInformation();
				return basicGetIRoomInformation();
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__IADDITIONAL_SERVICE_INFORMATION:
				if (resolve) return getIAdditionalServiceInformation();
				return basicGetIAdditionalServiceInformation();
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__IPAYMENT:
				if (resolve) return getIPayment();
				return basicGetIPayment();
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
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__BOOKINGS:
				getBookings().clear();
				getBookings().addAll((Collection<? extends BookingComponent_Booking>)newValue);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__AUTHENTICATION:
				setAuthentication((StaffComponent_IAuthentication)newValue);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__IROOM_INFORMATION:
				setIRoomInformation((RoomComponent_IRoomInformation)newValue);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__IADDITIONAL_SERVICE_INFORMATION:
				setIAdditionalServiceInformation((AdditionalServiceComponent_IEventManagement)newValue);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__IPAYMENT:
				setIPayment((PaymentComponent_IPayment)newValue);
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
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__BOOKINGS:
				getBookings().clear();
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__AUTHENTICATION:
				setAuthentication((StaffComponent_IAuthentication)null);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__IROOM_INFORMATION:
				setIRoomInformation((RoomComponent_IRoomInformation)null);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__IADDITIONAL_SERVICE_INFORMATION:
				setIAdditionalServiceInformation((AdditionalServiceComponent_IEventManagement)null);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__IPAYMENT:
				setIPayment((PaymentComponent_IPayment)null);
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
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__BOOKINGS:
				return bookings != null && !bookings.isEmpty();
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__AUTHENTICATION:
				return authentication != null;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__IROOM_INFORMATION:
				return iRoomInformation != null;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__IADDITIONAL_SERVICE_INFORMATION:
				return iAdditionalServiceInformation != null;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__IPAYMENT:
				return iPayment != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == BookingComponent_IBookingDecision.class) {
			switch (baseOperationID) {
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_DECISION___GET_DSS_INFO: return ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___GET_DSS_INFO;
				default: return -1;
			}
		}
		if (baseClass == BookingComponent_IBookingAdministration.class) {
			switch (baseOperationID) {
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___MAKE_BOOKING__DATE_DATE_STRING_STRING_STRING_STRING_STRING_STRING_STRING_STRING: return ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___MAKE_BOOKING__DATE_DATE_STRING_STRING_STRING_STRING_STRING_STRING_STRING_STRING;
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___ADD_ROOM__STRING_STRING_INT: return ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___ADD_ROOM__STRING_STRING_INT;
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___REQUEST_QUOTE__STRING_INT_DATE_DATE: return ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___REQUEST_QUOTE__STRING_INT_DATE_DATE;
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___EDIT_BOOKING__STRING_DATE_DATE: return ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___EDIT_BOOKING__STRING_DATE_DATE;
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___CANCEL_BOOKING__STRING: return ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___CANCEL_BOOKING__STRING;
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___ADD_ADDITIONAL_SERVICE__STRING_STRING_INT: return ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___ADD_ADDITIONAL_SERVICE__STRING_STRING_INT;
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___REMOVE_ROOM__STRING_STRING: return ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___REMOVE_ROOM__STRING_STRING;
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___REMOVE_ADDITIONAL_SERVICE__STRING_STRING: return ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___REMOVE_ADDITIONAL_SERVICE__STRING_STRING;
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___GENERATE_QUOTE__DATE_DATE_STRING: return ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___GENERATE_QUOTE__DATE_DATE_STRING;
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___ADD_GUEST_TO_BOOKING__STRING_STRING_STRING_STRING: return ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___ADD_GUEST_TO_BOOKING__STRING_STRING_STRING_STRING;
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___REMOVE_GUEST__STRING_STRING_STRING_STRING: return ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___REMOVE_GUEST__STRING_STRING_STRING_STRING;
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
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___GET_GUESTS_IN_BOOKING__STRING:
				return getGuestsInBooking((String)arguments.get(0));
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___GET_ROOM_TYPES_IN_BOOKING__STRING:
				return getRoomTypesInBooking((String)arguments.get(0));
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___SEARCH_FOR_BOOKING__STRING:
				return searchForBooking((String)arguments.get(0));
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___IS_PAID_FOR__STRING:
				return isPaidFor((String)arguments.get(0));
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___MAKE_PAYMENT__STRING:
				return makePayment((String)arguments.get(0));
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___GET_DSS_INFO:
				return getDSSInfo();
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___MAKE_BOOKING__DATE_DATE_STRING_STRING_STRING_STRING_STRING_STRING_STRING_STRING:
				return makeBooking((Date)arguments.get(0), (Date)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5), (String)arguments.get(6), (String)arguments.get(7), (String)arguments.get(8), (String)arguments.get(9));
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___ADD_ROOM__STRING_STRING_INT:
				addRoom((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___REQUEST_QUOTE__STRING_INT_DATE_DATE:
				requestQuote((String)arguments.get(0), (Integer)arguments.get(1), (Date)arguments.get(2), (Date)arguments.get(3));
				return null;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___EDIT_BOOKING__STRING_DATE_DATE:
				editBooking((String)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2));
				return null;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___CANCEL_BOOKING__STRING:
				cancelBooking((String)arguments.get(0));
				return null;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___ADD_ADDITIONAL_SERVICE__STRING_STRING_INT:
				addAdditionalService((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___REMOVE_ROOM__STRING_STRING:
				removeRoom((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___REMOVE_ADDITIONAL_SERVICE__STRING_STRING:
				removeAdditionalService((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___GENERATE_QUOTE__DATE_DATE_STRING:
				generateQuote((Date)arguments.get(0), (Date)arguments.get(1), (String)arguments.get(2));
				return null;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___ADD_GUEST_TO_BOOKING__STRING_STRING_STRING_STRING:
				addGuestToBooking((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
				return null;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___REMOVE_GUEST__STRING_STRING_STRING_STRING:
				removeGuest((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
				return null;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___FIND_BOOKING__STRING:
				return findBooking((String)arguments.get(0));
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___BOOKING_AVAILABLE__DATE_DATE:
				return bookingAvailable((Date)arguments.get(0), (Date)arguments.get(1));
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___FIND_BOOKINGS_BY_DATE_AND_TYPE__DATE_DATE_STRING:
				return findBookingsByDateAndType((Date)arguments.get(0), (Date)arguments.get(1), (String)arguments.get(2));
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___FIND_BOOKINGS_BY_DATE__DATE_DATE:
				return findBookingsByDate((Date)arguments.get(0), (Date)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //BookingComponent_BookingHandlerImpl
