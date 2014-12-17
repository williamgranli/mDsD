/**
 */
package Implementation.impl;


import Implementation.ImplementationPackage;
import Implementation.RoomComponent_Bedroom;
import Implementation.RoomComponent_ConferenceRoom;
import Implementation.RoomComponent_IRoomAdministration;
import Implementation.RoomComponent_IRoomInformation;
import Implementation.RoomComponent_RoomHandler;
import Implementation.StaffComponent_IAuthentication;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Component Room Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Implementation.impl.RoomComponent_RoomHandlerImpl#getAuthenticator <em>Authenticator</em>}</li>
 *   <li>{@link Implementation.impl.RoomComponent_RoomHandlerImpl#getBedRooms <em>Bed Rooms</em>}</li>
 *   <li>{@link Implementation.impl.RoomComponent_RoomHandlerImpl#getConferenceRooms <em>Conference Rooms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomComponent_RoomHandlerImpl extends MinimalEObjectImpl.Container implements RoomComponent_RoomHandler {
	/**
	 * The cached value of the '{@link #getAuthenticator() <em>Authenticator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticator()
	 * @generated
	 * @ordered
	 */
	protected StaffComponent_IAuthentication authenticator;

	/**
	 * The cached value of the '{@link #getBedRooms() <em>Bed Rooms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedRooms()
	 * @generated
	 * @ordered
	 */
	protected EList<RoomComponent_Bedroom> bedRooms;

	/**
	 * The cached value of the '{@link #getConferenceRooms() <em>Conference Rooms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConferenceRooms()
	 * @generated
	 * @ordered
	 */
	protected EList<RoomComponent_ConferenceRoom> conferenceRooms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected RoomComponent_RoomHandlerImpl() {
		super();

		// Initialize rooms collection
		bedRooms = getBedRooms();
		conferenceRooms = getConferenceRooms();
	
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.ROOM_COMPONENT_ROOM_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffComponent_IAuthentication getAuthenticator() {
		if (authenticator != null && authenticator.eIsProxy()) {
			InternalEObject oldAuthenticator = (InternalEObject)authenticator;
			authenticator = (StaffComponent_IAuthentication)eResolveProxy(oldAuthenticator);
			if (authenticator != oldAuthenticator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER__AUTHENTICATOR, oldAuthenticator, authenticator));
			}
		}
		return authenticator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffComponent_IAuthentication basicGetAuthenticator() {
		return authenticator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthenticator(StaffComponent_IAuthentication newAuthenticator) {
		StaffComponent_IAuthentication oldAuthenticator = authenticator;
		authenticator = newAuthenticator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER__AUTHENTICATOR, oldAuthenticator, authenticator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomComponent_Bedroom> getBedRooms() {
		if (bedRooms == null) {
			bedRooms = new EObjectResolvingEList<RoomComponent_Bedroom>(RoomComponent_Bedroom.class, this, ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER__BED_ROOMS);
		}
		return bedRooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomComponent_ConferenceRoom> getConferenceRooms() {
		if (conferenceRooms == null) {
			conferenceRooms = new EObjectResolvingEList<RoomComponent_ConferenceRoom>(RoomComponent_ConferenceRoom.class, this, ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER__CONFERENCE_ROOMS);
		}
		return conferenceRooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getRoomInfo(int roomNumber) {
		for (RoomComponent_Bedroom r : bedRooms) {

			if (r.getRoomNumber() == roomNumber) {
				return  r.getRoomNumber() + "," 
				+r.getRoomTypeName() + ","
				+ r.getPrice() + ","
				+  r.getDescription();
			}

		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> searchRoom(String roomTypeName) {

		EList<String> foundRooms = new EObjectResolvingEList<String>(RoomComponent_Bedroom.class, this, ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER__BED_ROOMS);

		// Add all conference rooms if roomTypeName == conference
		if (roomTypeName.equals("conference")) {
			for (RoomComponent_ConferenceRoom cr : conferenceRooms) {
				foundRooms.add(cr.getRoomNumber() + "," + cr.getRoomTypeName()
						+ "," + cr.getPrice() + "," + cr.isProjector() + ","
						+ cr.isConferencePhone() + "," + cr.getDescription()
						+ ",");
			}
		}

		// Add all bedrooms if roomTypeNaame == bedroom
		if (roomTypeName.equals("bedroom")) {
			for (RoomComponent_Bedroom br : bedRooms) {
				foundRooms.add(br.getRoomNumber() + "," + br.getRoomTypeName()
						+ "," + br.getPrice() + "," + br.getBedCount() + ","
						+ br.getDescription());
			}
		}

		if (foundRooms.size() == 0) {
			System.out.println("No rooms found for the type: " + roomTypeName);
			return null;
		}

		else {
			return foundRooms;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> getRoomTypes() {
		EList<String> foundRoomTypes = new EObjectResolvingEList<String>(RoomComponent_Bedroom.class, this, ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER__BED_ROOMS);
		boolean typeInList = false;

		for (RoomComponent_Bedroom r : bedRooms) {

			// Check if type already in list
			for (String rt : foundRoomTypes) {
				if ((r.getRoomTypeName()).equals(rt))
					typeInList = true;
			}

			// Add to foundTypes if not already in list
			if (!typeInList) {
				foundRoomTypes.add(r.getRoomTypeName());
			}

			typeInList = false;
		}

		return foundRoomTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Integer> getAllRoomNumbers() {
		EList<Integer> allRoomNumbers = new EObjectResolvingEList<Integer>(RoomComponent_Bedroom.class, this, ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER__BED_ROOMS);

		for (RoomComponent_Bedroom r : bedRooms) {
			allRoomNumbers.add(r.getRoomNumber());
		}
		
		for(RoomComponent_ConferenceRoom cr: conferenceRooms){
			allRoomNumbers.add(cr.getRoomNumber());
		}

		return allRoomNumbers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int countNumberOfTotalRooms() {
		return bedRooms.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getCountOfRoomType(String roomType) {
		int count = 0;
		for(RoomComponent_Bedroom bedroom: bedRooms){
			if(bedroom.getRoomTypeName().equals(roomType)){
				count++;
			}
				
		}
		
		for(RoomComponent_ConferenceRoom confRooms: conferenceRooms){
			if(confRooms.getRoomTypeName().equals(roomType)){
				count++;
			}
		}
			
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void createBedRoom(int roomNumber, boolean usable, int price, String roomTypeName, String description, int bedCount) {
		for (RoomComponent_Bedroom br : bedRooms) {
			if (br.getRoomNumber() == roomNumber) {
				System.out.println("Room with number: " + roomNumber
						+ " already exists");
				return;
			}
		}

		RoomComponent_BedroomImpl bedroom = new RoomComponent_BedroomImpl();
		bedroom.setRoomNumber(roomNumber);
		bedroom.setUsable(usable);
		bedroom.setPrice(price);
		bedroom.setRoomTypeName(roomTypeName);
		bedroom.setDescription(description);
		bedroom.setBedCount(bedCount);

		bedRooms.add(bedroom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void editBedRoom(int currentRoomNumber, int roomNumber, boolean usable, int price, String roomTypeName, String description, int bedCount) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void editBedRoom(int roomNumber, boolean usable, int price, String roomTypeName, String description, int bedCount) {
		for (RoomComponent_Bedroom r : bedRooms) {

			if (r.getRoomNumber() == roomNumber) {
				r.setUsable(usable);
				r.setPrice(price);
				r.setRoomTypeName(roomTypeName);
				r.setDescription(description);
				r.setBedCount(bedCount);

				return;
			}

		}

		// Bedroom with room number is not found
		System.out.println("Bedroom with room number: " + roomNumber
				+ " was not found");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void remove(int roomNumber) {
		for (RoomComponent_Bedroom br : bedRooms) {

			if (br.getRoomNumber() == roomNumber) {
				bedRooms.remove(br);
				return;
			}
		}

		for (RoomComponent_ConferenceRoom cr : conferenceRooms) {

			if (cr.getRoomNumber() == roomNumber) {
				conferenceRooms.remove(cr);
				return;
			}
		}

		System.out.println("Room with ID: " + roomNumber
				+ " could not be found");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void createConferenceRoom(int roomNumber, boolean usable, int price, String roomTypeName, String description, int numberOfSeats, boolean projector, boolean conferencePhone) {
		for (RoomComponent_ConferenceRoom cr : conferenceRooms) {
			if (cr.getRoomNumber() == roomNumber) {
				System.out.println("Conference Room with number: " + roomNumber
						+ " already exists");
				return;
			}
		}

		RoomComponent_ConferenceRoomImpl conferenceRoom = new RoomComponent_ConferenceRoomImpl();
		conferenceRoom.setRoomNumber(roomNumber);
		conferenceRoom.setUsable(usable);
		conferenceRoom.setPrice(price);
		conferenceRoom.setRoomTypeName(roomTypeName);
		conferenceRoom.setDescription(description);
		conferenceRoom.setNumberOfSeats(numberOfSeats);
		conferenceRoom.setProjector(projector);
		conferenceRoom.setConferencePhone(conferencePhone);

		conferenceRooms.add(conferenceRoom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void editConferenceRoom(int currentRoomNumber, int roomNumber, boolean usable, int price, String roomTypeName, String description, int numberOfSeats, boolean projector, boolean conferencePhone) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void editConferenceRoom(int roomNumber, boolean usable, int price, String roomTypeName, String description, int numberOfSeats, boolean projector, boolean conferencePhone) {
		for (RoomComponent_ConferenceRoom cr : conferenceRooms) {

			if (cr.getRoomNumber() == roomNumber) {
				cr.setUsable(usable);
				cr.setPrice(price);
				cr.setRoomTypeName(roomTypeName);
				cr.setDescription(description);
				cr.setNumberOfSeats(numberOfSeats);
				cr.setProjector(projector);
				cr.setConferencePhone(conferencePhone);

				return;
			}
		}

		// conference room with room number is not found
		System.out.println("Room with id: " + roomNumber + " was not found.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER__AUTHENTICATOR:
				if (resolve) return getAuthenticator();
				return basicGetAuthenticator();
			case ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER__BED_ROOMS:
				return getBedRooms();
			case ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER__CONFERENCE_ROOMS:
				return getConferenceRooms();
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
			case ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER__AUTHENTICATOR:
				setAuthenticator((StaffComponent_IAuthentication)newValue);
				return;
			case ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER__BED_ROOMS:
				getBedRooms().clear();
				getBedRooms().addAll((Collection<? extends RoomComponent_Bedroom>)newValue);
				return;
			case ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER__CONFERENCE_ROOMS:
				getConferenceRooms().clear();
				getConferenceRooms().addAll((Collection<? extends RoomComponent_ConferenceRoom>)newValue);
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
			case ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER__AUTHENTICATOR:
				setAuthenticator((StaffComponent_IAuthentication)null);
				return;
			case ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER__BED_ROOMS:
				getBedRooms().clear();
				return;
			case ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER__CONFERENCE_ROOMS:
				getConferenceRooms().clear();
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
			case ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER__AUTHENTICATOR:
				return authenticator != null;
			case ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER__BED_ROOMS:
				return bedRooms != null && !bedRooms.isEmpty();
			case ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER__CONFERENCE_ROOMS:
				return conferenceRooms != null && !conferenceRooms.isEmpty();
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
		if (baseClass == RoomComponent_IRoomInformation.class) {
			switch (baseOperationID) {
				case ImplementationPackage.ROOM_COMPONENT_IROOM_INFORMATION___GET_ROOM_INFO__INT: return ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER___GET_ROOM_INFO__INT;
				case ImplementationPackage.ROOM_COMPONENT_IROOM_INFORMATION___SEARCH_ROOM__STRING: return ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER___SEARCH_ROOM__STRING;
				case ImplementationPackage.ROOM_COMPONENT_IROOM_INFORMATION___GET_ROOM_TYPES: return ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER___GET_ROOM_TYPES;
				case ImplementationPackage.ROOM_COMPONENT_IROOM_INFORMATION___GET_ALL_ROOM_NUMBERS: return ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER___GET_ALL_ROOM_NUMBERS;
				case ImplementationPackage.ROOM_COMPONENT_IROOM_INFORMATION___COUNT_NUMBER_OF_TOTAL_ROOMS: return ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER___COUNT_NUMBER_OF_TOTAL_ROOMS;
				case ImplementationPackage.ROOM_COMPONENT_IROOM_INFORMATION___GET_COUNT_OF_ROOM_TYPE__STRING: return ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER___GET_COUNT_OF_ROOM_TYPE__STRING;
				default: return -1;
			}
		}
		if (baseClass == RoomComponent_IRoomAdministration.class) {
			switch (baseOperationID) {
				case ImplementationPackage.ROOM_COMPONENT_IROOM_ADMINISTRATION___CREATE_BED_ROOM__INT_BOOLEAN_INT_STRING_STRING_INT: return ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER___CREATE_BED_ROOM__INT_BOOLEAN_INT_STRING_STRING_INT;
				case ImplementationPackage.ROOM_COMPONENT_IROOM_ADMINISTRATION___EDIT_BED_ROOM__INT_INT_BOOLEAN_INT_STRING_STRING_INT: return ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER___EDIT_BED_ROOM__INT_INT_BOOLEAN_INT_STRING_STRING_INT;
				case ImplementationPackage.ROOM_COMPONENT_IROOM_ADMINISTRATION___REMOVE__INT: return ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER___REMOVE__INT;
				case ImplementationPackage.ROOM_COMPONENT_IROOM_ADMINISTRATION___CREATE_CONFERENCE_ROOM__INT_BOOLEAN_INT_STRING_STRING_INT_BOOLEAN_BOOLEAN: return ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER___CREATE_CONFERENCE_ROOM__INT_BOOLEAN_INT_STRING_STRING_INT_BOOLEAN_BOOLEAN;
				case ImplementationPackage.ROOM_COMPONENT_IROOM_ADMINISTRATION___EDIT_CONFERENCE_ROOM__INT_INT_BOOLEAN_INT_STRING_STRING_INT_BOOLEAN_BOOLEAN: return ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER___EDIT_CONFERENCE_ROOM__INT_INT_BOOLEAN_INT_STRING_STRING_INT_BOOLEAN_BOOLEAN;
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
			case ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER___GET_ROOM_INFO__INT:
				return getRoomInfo((Integer)arguments.get(0));
			case ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER___SEARCH_ROOM__STRING:
				return searchRoom((String)arguments.get(0));
			case ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER___GET_ROOM_TYPES:
				return getRoomTypes();
			case ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER___GET_ALL_ROOM_NUMBERS:
				return getAllRoomNumbers();
			case ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER___COUNT_NUMBER_OF_TOTAL_ROOMS:
				return countNumberOfTotalRooms();
			case ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER___GET_COUNT_OF_ROOM_TYPE__STRING:
				return getCountOfRoomType((String)arguments.get(0));
			case ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER___CREATE_BED_ROOM__INT_BOOLEAN_INT_STRING_STRING_INT:
				createBedRoom((Integer)arguments.get(0), (Boolean)arguments.get(1), (Integer)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (Integer)arguments.get(5));
				return null;
			case ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER___EDIT_BED_ROOM__INT_INT_BOOLEAN_INT_STRING_STRING_INT:
				editBedRoom((Integer)arguments.get(0), (Integer)arguments.get(1), (Boolean)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5), (Integer)arguments.get(6));
				return null;
			case ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER___REMOVE__INT:
				remove((Integer)arguments.get(0));
				return null;
			case ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER___CREATE_CONFERENCE_ROOM__INT_BOOLEAN_INT_STRING_STRING_INT_BOOLEAN_BOOLEAN:
				createConferenceRoom((Integer)arguments.get(0), (Boolean)arguments.get(1), (Integer)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (Integer)arguments.get(5), (Boolean)arguments.get(6), (Boolean)arguments.get(7));
				return null;
			case ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER___EDIT_CONFERENCE_ROOM__INT_INT_BOOLEAN_INT_STRING_STRING_INT_BOOLEAN_BOOLEAN:
				editConferenceRoom((Integer)arguments.get(0), (Integer)arguments.get(1), (Boolean)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5), (Integer)arguments.get(6), (Boolean)arguments.get(7), (Boolean)arguments.get(8));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoomComponent_RoomHandlerImpl
