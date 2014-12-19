/**
 */
package Implementation.impl;

import Implementation.BookingComponent_Booking;
import Implementation.BookingComponent_IBookingInformation;
import Implementation.ImplementationPackage;
import Implementation.OccupancyComponent_IOccupancy;
import Implementation.OccupancyComponent_Occupancy;
import Implementation.OccupancyComponent_OccupancyHandler;
import Implementation.RoomComponent_IRoomInformation;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Occupancy Component Occupancy Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Implementation.impl.OccupancyComponent_OccupancyHandlerImpl#getIRoomInformation <em>IRoom Information</em>}</li>
 *   <li>{@link Implementation.impl.OccupancyComponent_OccupancyHandlerImpl#getIBooking <em>IBooking</em>}</li>
 *   <li>{@link Implementation.impl.OccupancyComponent_OccupancyHandlerImpl#getOccupancy <em>Occupancy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OccupancyComponent_OccupancyHandlerImpl extends MinimalEObjectImpl.Container implements OccupancyComponent_OccupancyHandler {
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
	 * The cached value of the '{@link #getIBooking() <em>IBooking</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIBooking()
	 * @generated
	 * @ordered
	 */
	protected BookingComponent_IBookingInformation iBooking;

	/**
	 * The cached value of the '{@link #getOccupancy() <em>Occupancy</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccupancy()
	 * @generated
	 * @ordered
	 */
	protected EList<OccupancyComponent_Occupancy> occupancy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected OccupancyComponent_OccupancyHandlerImpl() {
		super();
		occupancy = new BasicEList<OccupancyComponent_Occupancy>();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER__IROOM_INFORMATION, oldIRoomInformation, iRoomInformation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER__IROOM_INFORMATION, oldIRoomInformation, iRoomInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingComponent_IBookingInformation getIBooking() {
		if (iBooking != null && iBooking.eIsProxy()) {
			InternalEObject oldIBooking = (InternalEObject)iBooking;
			iBooking = (BookingComponent_IBookingInformation)eResolveProxy(oldIBooking);
			if (iBooking != oldIBooking) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER__IBOOKING, oldIBooking, iBooking));
			}
		}
		return iBooking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingComponent_IBookingInformation basicGetIBooking() {
		return iBooking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIBooking(BookingComponent_IBookingInformation newIBooking) {
		BookingComponent_IBookingInformation oldIBooking = iBooking;
		iBooking = newIBooking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER__IBOOKING, oldIBooking, iBooking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OccupancyComponent_Occupancy> getOccupancy() {
		if (occupancy == null) {
			occupancy = new EObjectResolvingEList<OccupancyComponent_Occupancy>(OccupancyComponent_Occupancy.class, this, ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER__OCCUPANCY);
		}
		return occupancy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getDSSOccupancyInfo() {
		String dssOccupancyInfo = "";
		for (OccupancyComponent_Occupancy occupan: occupancy){
			if (dssOccupancyInfo.isEmpty()){
				dssOccupancyInfo = occupan.getRoomNumber() + "," + occupan.getCheckInDateTime() + "," + occupan.getCheckOutDateTime();
			}
			else{
				dssOccupancyInfo += ";" + occupan.getRoomNumber() + "," + occupan.getCheckInDateTime() + "," + occupan.getCheckOutDateTime();
			}
		}
		return dssOccupancyInfo;
		//return numberOfCheckins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void checkInGuest(String bookingReference, String firstName, String lastName, String roomType, String partnerFirstName, String partnerLastName) {
		// Returns a list of guests and room types for a booking
	EList<String> bookingInfo= iBooking.searchForBooking(bookingReference);
	
				//System.out.println("from occupancy: " + bookingInfo.get(0).toString());
	
	String[] guestsForBooking;
	EList<String> roomTypesArray;
	String roomTypes;
	
				// If  reference does'nt return booking Info
	if(bookingInfo != null){
		
		roomTypes = bookingInfo.get(0).toString();
		guestsForBooking = (bookingInfo.get(1)).split(";");
		
					//System.out.println(guestsForBooking[1]);
		
		
		
	}else{
		System.out.println("Booking reference does not match a booking");
		return;
	}
	
	for(String guest: guestsForBooking){
		String[] guestInfo = guest.split(",");
		
					// if guest firstName and lastName matches a guest in list
		if((guestInfo[0].equals(firstName)) && (guestInfo[1].equals(lastName))){
			
			roomTypesArray = new BasicEList<String>();
			String[] x = roomTypes.split(",");
			
			for(int i = 0; i < x.length; i++){
				roomTypesArray.add(x[i]);
			}
			
			
			
						// if roomType provided by guest is in booking // check
			if(isInRoomTypes(roomTypesArray, roomType)){
				
							// Check if a partner info is not null check if partner exist in booking and
							// check guest in the same room
				if((partnerFirstName != null) && (partnerLastName != null)){
					OccupancyComponent_Occupancy occupan = findOccupancy(bookingReference, partnerFirstName, partnerLastName);
					
								// Check if occupancy exits for partner and bookingReference
					if(occupan != null){
						
						
						if (!isTooManyOccupants(occupan.getRoomNumber(), occupan.getGuests().size())) {
							occupan.addGuestToOccupancy(firstName, lastName);
							System.out.println("Guest: " + firstName + " " + lastName + " is check in in the same room: " + 
								occupan.getRoomNumber() +  "with " + partnerFirstName + " " + partnerLastName);
							
							return;
						}
						
						else{
							System.out.println("Occupancy" + occupan.getRoomNumber() + "already has max guests");
						}
						
						
					}
					
								//if partner is not found for specified partnerFirstName and partnerLastName
					else{
						System.out.println("No occupancy was found for the specified booking: " + bookingReference 
							+ " and partner information : " + partnerFirstName + " " + partnerLastName);
						return;
					}
				}
				
				
				
				int roomAvailable = getAvailableRooms(roomType);
				
				if(roomAvailable != 0){
					
					OccupancyComponent_OccupancyImpl currentOccupancy = new OccupancyComponent_OccupancyImpl();
					currentOccupancy.setRoomNumber(roomAvailable);
					
								// todo change checkInDateTime variable to Date instead of int 
								// and regenerate getters and setters to accept date.
					currentOccupancy.setCheckInDateTime(System.currentTimeMillis());
					currentOccupancy.setBookingReference(bookingReference);
					currentOccupancy.addGuestToOccupancy(firstName, lastName);
					
					occupancy.add(currentOccupancy);
					
					return;
				}
				
			}else{
				System.out.println("Room type provided by guest doesn't match types in booking");
			}
			
		}
		
		
		else{
			System.out.println("Name: " + firstName + "  " + lastName + "does not exist in booking");
		}
	}
}



public boolean isTooManyOccupants(int roomNumber, int guestCount){
	String[] roomInfo = iRoomInformation.getRoomInfo(roomNumber).split(",");
	
	int bedCount = Integer.valueOf(roomInfo[4]);
	return bedCount == guestCount;
		//System.out.println("isTooManyOccupants: "+roomInfo[4]);

	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void checkOutGuest(int roomNumber, String firstName, String lastName) {
		String fullName = "" + firstName + "," + lastName;
		
		EList<String> guestsInRoom = new BasicEList<String>();
		
		//Get guests from occupancy object with this roomNumber
		guestsInRoom = listGuestsInRoom(roomNumber);
		
		if(guestsInRoom == null){
			System.out.println("No guests found in room: " + roomNumber);
			return;
		}
				
		//Iterate through the guests in the room to match it
		//with the one talking to the receptionist
		for(String guest: guestsInRoom) {
			if (guest == fullName) {
				for (OccupancyComponent_Occupancy currentOccupancy : occupancy) {
					//If this occupancy is not checked out...
					if (currentOccupancy.getRoomNumber() == roomNumber 
							&& currentOccupancy.getCheckOutDateTime() != 0L) {
						//...check out the occupancy
						currentOccupancy.setCheckOutDateTime(System.currentTimeMillis());
						if (iBooking.isPaidFor(currentOccupancy.getBookingReference()) == true) {
							System.out.println("Booking has already been paid for!");
						}
						else { 
							iBooking.makePayment(currentOccupancy.getBookingReference());
						}
					}				
				}
			}
			else {
				System.out.println("Room number and name of guest does not match an occupancy");
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
 	 */
	public EList<String> listGuestsInRoom(int roomNumber) {
		if (!isOccupied(roomNumber)) {
			System.out.println("The room is not occupied");
			return null;
		}
		
		EList<String> guestsInRoom = new BasicEList<String>();
		
		
		for(OccupancyComponent_Occupancy eachOccupancy: occupancy) {
			if (roomNumber == eachOccupancy.getRoomNumber()) {
				guestsInRoom = eachOccupancy.listGuests();
			}
		}
		return guestsInRoom;
	}


	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int numberOfGuestsInHotel() {
		int numberOfGuestsInHotel = 0;
		
		for (OccupancyComponent_Occupancy occupan : occupancy) {
			numberOfGuestsInHotel += occupan.getGuests().size();
		}
		
		return numberOfGuestsInHotel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isOccupied(int roomNumber) {
		for(OccupancyComponent_Occupancy occupan: occupancy){
			if(occupan.getRoomNumber() == Integer.valueOf(roomNumber)
					&& occupan.getCheckOutDateTime() != 0L)
				return true;
		}

		return false;
	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getAvailableRooms(String roomType) {
		EList<Integer> allRoomNumbers = iRoomInformation.getAllRoomNumbers();
		EList<String> allRoomInfo = new BasicEList<String>();
		
		for(Integer roomNumber: allRoomNumbers){
			allRoomInfo.add(iRoomInformation.getRoomInfo(roomNumber));
		}
		
		
		// Search for room in list that matches the type and is not occupied
		for(String roomInfo: allRoomInfo){
			String[] roomInfoArray = roomInfo.split(",");
			
			int roomNumber = Integer.valueOf(roomInfoArray[0]);
			//Change roomNumber to int (in the args)
			if(!isOccupied(roomNumber) && roomType.equals(roomInfoArray[1]))
				return roomNumber;
		}
		
		// Potential over-booking scenario 
		System.out.println("No rooms are available for this type "); 
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OccupancyComponent_Occupancy findOccupancy(String bookingReference, String partnerFirstName, String partnerLastName) {
		for(OccupancyComponent_Occupancy occupan : occupancy){
			
			String partnerInBooking = occupan.getPartner(partnerFirstName, partnerLastName);
			boolean partnerExist = false;
			if(partnerInBooking != null){
				partnerExist = partnerInBooking.equals(partnerFirstName + "," + partnerLastName);
			}
			
			
			// if reference is in occupancy and partner specified is also in occupancy return occupancy
			if((occupan.getBookingReference()).equals(bookingReference) && partnerExist){
				return occupan;
			}
		}
		
		return null;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isInRoomTypes(EList<String> roomTypes, String guestInRoomType) {

			for(String roomType: roomTypes){
				if(roomType.equals(guestInRoomType))
					return true;
			}
			
			return false;
		

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER__IROOM_INFORMATION:
				if (resolve) return getIRoomInformation();
				return basicGetIRoomInformation();
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER__IBOOKING:
				if (resolve) return getIBooking();
				return basicGetIBooking();
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER__OCCUPANCY:
				return getOccupancy();
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
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER__IROOM_INFORMATION:
				setIRoomInformation((RoomComponent_IRoomInformation)newValue);
				return;
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER__IBOOKING:
				setIBooking((BookingComponent_IBookingInformation)newValue);
				return;
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER__OCCUPANCY:
				getOccupancy().clear();
				getOccupancy().addAll((Collection<? extends OccupancyComponent_Occupancy>)newValue);
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
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER__IROOM_INFORMATION:
				setIRoomInformation((RoomComponent_IRoomInformation)null);
				return;
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER__IBOOKING:
				setIBooking((BookingComponent_IBookingInformation)null);
				return;
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER__OCCUPANCY:
				getOccupancy().clear();
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
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER__IROOM_INFORMATION:
				return iRoomInformation != null;
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER__IBOOKING:
				return iBooking != null;
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER__OCCUPANCY:
				return occupancy != null && !occupancy.isEmpty();
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
		if (baseClass == OccupancyComponent_IOccupancy.class) {
			switch (baseOperationID) {
				case ImplementationPackage.OCCUPANCY_COMPONENT_IOCCUPANCY___CHECK_IN_GUEST__STRING_STRING_STRING_STRING_STRING_STRING: return ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___CHECK_IN_GUEST__STRING_STRING_STRING_STRING_STRING_STRING;
				case ImplementationPackage.OCCUPANCY_COMPONENT_IOCCUPANCY___CHECK_OUT_GUEST__INT_STRING_STRING: return ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___CHECK_OUT_GUEST__INT_STRING_STRING;
				case ImplementationPackage.OCCUPANCY_COMPONENT_IOCCUPANCY___LIST_GUESTS_IN_ROOM__INT: return ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___LIST_GUESTS_IN_ROOM__INT;
				case ImplementationPackage.OCCUPANCY_COMPONENT_IOCCUPANCY___NUMBER_OF_GUESTS_IN_HOTEL: return ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___NUMBER_OF_GUESTS_IN_HOTEL;
				case ImplementationPackage.OCCUPANCY_COMPONENT_IOCCUPANCY___IS_OCCUPIED__INT: return ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___IS_OCCUPIED__INT;
				case ImplementationPackage.OCCUPANCY_COMPONENT_IOCCUPANCY___GET_AVAILABLE_ROOMS__STRING: return ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___GET_AVAILABLE_ROOMS__STRING;
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___GET_DSS_OCCUPANCY_INFO:
				return getDSSOccupancyInfo();
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___CHECK_IN_GUEST__STRING_STRING_STRING_STRING_STRING_STRING:
				checkInGuest((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5));
				return null;
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___CHECK_OUT_GUEST__INT_STRING_STRING:
				checkOutGuest((Integer)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
				return null;
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___LIST_GUESTS_IN_ROOM__INT:
				return listGuestsInRoom((Integer)arguments.get(0));
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___NUMBER_OF_GUESTS_IN_HOTEL:
				return numberOfGuestsInHotel();
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___IS_OCCUPIED__INT:
				return isOccupied((Integer)arguments.get(0));
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___GET_AVAILABLE_ROOMS__STRING:
				return getAvailableRooms((String)arguments.get(0));
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___FIND_OCCUPANCY__STRING_STRING_STRING:
				return findOccupancy((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___IS_IN_ROOM_TYPES__ELIST_STRING:
				return isInRoomTypes((EList<String>)arguments.get(0), (String)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //OccupancyComponent_OccupancyHandlerImpl
