/**
 */
package Implementation.impl;

import Implementation.ImplementationPackage;
import Implementation.RoomComponent_IRoomAdministration;
import Implementation.RoomComponent_IRoomInformation;
import Implementation.RoomComponent_Room;
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
 *   <li>{@link Implementation.impl.RoomComponent_RoomHandlerImpl#getRoom <em>Room</em>}</li>
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
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected EList<RoomComponent_Room> room;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomComponent_RoomHandlerImpl() {
		super();
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
	public EList<RoomComponent_Room> getRoom() {
		if (room == null) {
			room = new EObjectResolvingEList<RoomComponent_Room>(RoomComponent_Room.class, this, ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER__ROOM);
		}
		return room;
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
	public String getAllRoomNumbers() {
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
	public void createRoom(int roomNumber, boolean usable, int price, String roomTypeName, String description) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void editRoom(int roomNumber, boolean usable, int price, String roomTypeName, String description) {
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER__AUTHENTICATOR:
				if (resolve) return getAuthenticator();
				return basicGetAuthenticator();
			case ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER__ROOM:
				return getRoom();
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
			case ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER__ROOM:
				getRoom().clear();
				getRoom().addAll((Collection<? extends RoomComponent_Room>)newValue);
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
			case ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER__ROOM:
				getRoom().clear();
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
			case ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER__ROOM:
				return room != null && !room.isEmpty();
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
				default: return -1;
			}
		}
		if (baseClass == RoomComponent_IRoomAdministration.class) {
			switch (baseOperationID) {
				case ImplementationPackage.ROOM_COMPONENT_IROOM_ADMINISTRATION___CREATE_ROOM__INT_BOOLEAN_INT_STRING_STRING: return ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER___CREATE_ROOM__INT_BOOLEAN_INT_STRING_STRING;
				case ImplementationPackage.ROOM_COMPONENT_IROOM_ADMINISTRATION___EDIT_ROOM__INT_BOOLEAN_INT_STRING_STRING: return ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER___EDIT_ROOM__INT_BOOLEAN_INT_STRING_STRING;
				case ImplementationPackage.ROOM_COMPONENT_IROOM_ADMINISTRATION___REMOVE__INT: return ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER___REMOVE__INT;
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
			case ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER___CREATE_ROOM__INT_BOOLEAN_INT_STRING_STRING:
				createRoom((Integer)arguments.get(0), (Boolean)arguments.get(1), (Integer)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4));
				return null;
			case ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER___EDIT_ROOM__INT_BOOLEAN_INT_STRING_STRING:
				editRoom((Integer)arguments.get(0), (Boolean)arguments.get(1), (Integer)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4));
				return null;
			case ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER___REMOVE__INT:
				remove((Integer)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoomComponent_RoomHandlerImpl
