/**
 */
package Implementation.impl;

import Implementation.BookingComponent_IBooking;
import Implementation.ImplementationPackage;
import Implementation.OccupancyComponent_OccupancyHandler;
import Implementation.RoomComponent_IRoomInformation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Occupancy Component Occupancy Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Implementation.impl.OccupancyComponent_OccupancyHandlerImpl#getIRoomInformation <em>IRoom Information</em>}</li>
 *   <li>{@link Implementation.impl.OccupancyComponent_OccupancyHandlerImpl#getIBooking <em>IBooking</em>}</li>
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
	protected BookingComponent_IBooking iBooking;

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
	public BookingComponent_IBooking getIBooking() {
		if (iBooking != null && iBooking.eIsProxy()) {
			InternalEObject oldIBooking = (InternalEObject)iBooking;
			iBooking = (BookingComponent_IBooking)eResolveProxy(oldIBooking);
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
	public BookingComponent_IBooking basicGetIBooking() {
		return iBooking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIBooking(BookingComponent_IBooking newIBooking) {
		BookingComponent_IBooking oldIBooking = iBooking;
		iBooking = newIBooking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER__IBOOKING, oldIBooking, iBooking));
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
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER__IROOM_INFORMATION:
				setIRoomInformation((RoomComponent_IRoomInformation)newValue);
				return;
			case ImplementationPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER__IBOOKING:
				setIBooking((BookingComponent_IBooking)newValue);
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
				setIBooking((BookingComponent_IBooking)null);
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
		}
		return super.eIsSet(featureID);
	}

} //OccupancyComponent_OccupancyHandlerImpl
