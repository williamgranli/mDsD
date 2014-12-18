/**
 */
package Implementation.impl;

import Implementation.ImplementationPackage;
import Implementation.RoomComponent;

import Implementation.RoomComponent_IRoomAdministration;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class RoomComponentImpl extends MinimalEObjectImpl.Container implements RoomComponent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.ROOM_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoomInfo(int roomNumber) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> searchRoom(String roomTypeName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRoomTypes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getAllRoomNumbers() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int countNumberOfTotalRooms() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCountOfRoomType(String roomType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createBedRoom(int roomNumber, boolean usable, int price, String roomTypeName, String description, int bedCount) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	 * @generated
	 */
	public void remove(int roomNumber) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createConferenceRoom(int roomNumber, boolean usable, int price, String roomTypeName, String description, int numberOfSeats, boolean projector, boolean conferencePhone) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == RoomComponent_IRoomAdministration.class) {
			switch (baseOperationID) {
				case ImplementationPackage.ROOM_COMPONENT_IROOM_ADMINISTRATION___CREATE_BED_ROOM__INT_BOOLEAN_INT_STRING_STRING_INT: return ImplementationPackage.ROOM_COMPONENT___CREATE_BED_ROOM__INT_BOOLEAN_INT_STRING_STRING_INT;
				case ImplementationPackage.ROOM_COMPONENT_IROOM_ADMINISTRATION___EDIT_BED_ROOM__INT_INT_BOOLEAN_INT_STRING_STRING_INT: return ImplementationPackage.ROOM_COMPONENT___EDIT_BED_ROOM__INT_INT_BOOLEAN_INT_STRING_STRING_INT;
				case ImplementationPackage.ROOM_COMPONENT_IROOM_ADMINISTRATION___REMOVE__INT: return ImplementationPackage.ROOM_COMPONENT___REMOVE__INT;
				case ImplementationPackage.ROOM_COMPONENT_IROOM_ADMINISTRATION___CREATE_CONFERENCE_ROOM__INT_BOOLEAN_INT_STRING_STRING_INT_BOOLEAN_BOOLEAN: return ImplementationPackage.ROOM_COMPONENT___CREATE_CONFERENCE_ROOM__INT_BOOLEAN_INT_STRING_STRING_INT_BOOLEAN_BOOLEAN;
				case ImplementationPackage.ROOM_COMPONENT_IROOM_ADMINISTRATION___EDIT_CONFERENCE_ROOM__INT_INT_BOOLEAN_INT_STRING_STRING_INT_BOOLEAN_BOOLEAN: return ImplementationPackage.ROOM_COMPONENT___EDIT_CONFERENCE_ROOM__INT_INT_BOOLEAN_INT_STRING_STRING_INT_BOOLEAN_BOOLEAN;
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
			case ImplementationPackage.ROOM_COMPONENT___GET_ROOM_INFO__INT:
				return getRoomInfo((Integer)arguments.get(0));
			case ImplementationPackage.ROOM_COMPONENT___SEARCH_ROOM__STRING:
				return searchRoom((String)arguments.get(0));
			case ImplementationPackage.ROOM_COMPONENT___GET_ROOM_TYPES:
				return getRoomTypes();
			case ImplementationPackage.ROOM_COMPONENT___GET_ALL_ROOM_NUMBERS:
				return getAllRoomNumbers();
			case ImplementationPackage.ROOM_COMPONENT___COUNT_NUMBER_OF_TOTAL_ROOMS:
				return countNumberOfTotalRooms();
			case ImplementationPackage.ROOM_COMPONENT___GET_COUNT_OF_ROOM_TYPE__STRING:
				return getCountOfRoomType((String)arguments.get(0));
			case ImplementationPackage.ROOM_COMPONENT___CREATE_BED_ROOM__INT_BOOLEAN_INT_STRING_STRING_INT:
				createBedRoom((Integer)arguments.get(0), (Boolean)arguments.get(1), (Integer)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (Integer)arguments.get(5));
				return null;
			case ImplementationPackage.ROOM_COMPONENT___EDIT_BED_ROOM__INT_INT_BOOLEAN_INT_STRING_STRING_INT:
				editBedRoom((Integer)arguments.get(0), (Integer)arguments.get(1), (Boolean)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5), (Integer)arguments.get(6));
				return null;
			case ImplementationPackage.ROOM_COMPONENT___REMOVE__INT:
				remove((Integer)arguments.get(0));
				return null;
			case ImplementationPackage.ROOM_COMPONENT___CREATE_CONFERENCE_ROOM__INT_BOOLEAN_INT_STRING_STRING_INT_BOOLEAN_BOOLEAN:
				createConferenceRoom((Integer)arguments.get(0), (Boolean)arguments.get(1), (Integer)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (Integer)arguments.get(5), (Boolean)arguments.get(6), (Boolean)arguments.get(7));
				return null;
			case ImplementationPackage.ROOM_COMPONENT___EDIT_CONFERENCE_ROOM__INT_INT_BOOLEAN_INT_STRING_STRING_INT_BOOLEAN_BOOLEAN:
				editConferenceRoom((Integer)arguments.get(0), (Integer)arguments.get(1), (Boolean)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5), (Integer)arguments.get(6), (Boolean)arguments.get(7), (Boolean)arguments.get(8));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoomComponentImpl
