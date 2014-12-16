/**
 */
package Implementation.impl;

import Implementation.BookingComponent_IBookingInformation;
import Implementation.ImplementationPackage;
import Implementation.OccupancyComponent_IOccupancy;
import Implementation.OccupancyComponent_Occupancy;
import Implementation.OccupancyComponent_OccupancyHandler;
import Implementation.RoomComponent_IRoomInformation;
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
	 * @generated
	 */
	protected OccupancyComponent_OccupancyHandlerImpl() {
		super();
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
	 * @generated
	 */
	public void checkInGuest(String bookingReference, String firstName, String lastName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkOutGuest(String bookingReference, String firstName, String lastName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> listFreeRooms() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> listGuestsInRoom(int roomNumber) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int numberOfGuestsInHotel() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isOccupied(String roomNumber) {
		for(OccupancyComponent_Occupancy occupan: occupancy){
			if(occupan.getRoomNumber() == Integer.valueOf(roomNumber))
				return true;
		}

		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean addGuestToOccupancy(String firstName, String lastName) {
		guests.add(new OccupancyComponent_GuestImpl(firstName, lastName));
		return true;
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
				case ImplementationPackage.OCCUPANCY_COMPONENT_IOCCUPANCY___CHECK_IN_GUEST__STRING_STRING_STRING: return ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___CHECK_IN_GUEST__STRING_STRING_STRING;
				case ImplementationPackage.OCCUPANCY_COMPONENT_IOCCUPANCY___CHECK_OUT_GUEST__STRING_STRING_STRING: return ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___CHECK_OUT_GUEST__STRING_STRING_STRING;
				case ImplementationPackage.OCCUPANCY_COMPONENT_IOCCUPANCY___LIST_FREE_ROOMS: return ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___LIST_FREE_ROOMS;
				case ImplementationPackage.OCCUPANCY_COMPONENT_IOCCUPANCY___LIST_GUESTS_IN_ROOM__INT: return ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___LIST_GUESTS_IN_ROOM__INT;
				case ImplementationPackage.OCCUPANCY_COMPONENT_IOCCUPANCY___NUMBER_OF_GUESTS_IN_HOTEL: return ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___NUMBER_OF_GUESTS_IN_HOTEL;
				case ImplementationPackage.OCCUPANCY_COMPONENT_IOCCUPANCY___IS_OCCUPIED__STRING: return ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___IS_OCCUPIED__STRING;
				case ImplementationPackage.OCCUPANCY_COMPONENT_IOCCUPANCY___ADD_GUEST_TO_OCCUPANCY__STRING_STRING: return ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___ADD_GUEST_TO_OCCUPANCY__STRING_STRING;
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
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___CHECK_IN_GUEST__STRING_STRING_STRING:
				checkInGuest((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
				return null;
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___CHECK_OUT_GUEST__STRING_STRING_STRING:
				checkOutGuest((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
				return null;
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___LIST_FREE_ROOMS:
				return listFreeRooms();
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___LIST_GUESTS_IN_ROOM__INT:
				return listGuestsInRoom((Integer)arguments.get(0));
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___NUMBER_OF_GUESTS_IN_HOTEL:
				return numberOfGuestsInHotel();
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___IS_OCCUPIED__STRING:
				return isOccupied((String)arguments.get(0));
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___ADD_GUEST_TO_OCCUPANCY__STRING_STRING:
				return addGuestToOccupancy((String)arguments.get(0), (String)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //OccupancyComponent_OccupancyHandlerImpl
