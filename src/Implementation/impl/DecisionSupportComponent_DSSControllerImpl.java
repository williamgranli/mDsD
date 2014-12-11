/**
 */
package Implementation.impl;

import Implementation.AdditionalServiceComponent_IAdditionalServiceDecision;
import Implementation.BookingComponent_IBookingDecision;
import Implementation.DecisionSupportComponent_DSSController;
import Implementation.DecisionSupportComponent_DSSPresenter;
import Implementation.DecisionSupportComponent_DSSProcessor;
import Implementation.ImplementationPackage;
import Implementation.OccupancyComponent_IOccupancyDecision;
import Implementation.RoomComponent_IRoomDecision;

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
 * An implementation of the model object '<em><b>Decision Support Component DSS Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Implementation.impl.DecisionSupportComponent_DSSControllerImpl#getDSSProcessor <em>DSS Processor</em>}</li>
 *   <li>{@link Implementation.impl.DecisionSupportComponent_DSSControllerImpl#getDSSPresenter <em>DSS Presenter</em>}</li>
 *   <li>{@link Implementation.impl.DecisionSupportComponent_DSSControllerImpl#getIRoomDecision <em>IRoom Decision</em>}</li>
 *   <li>{@link Implementation.impl.DecisionSupportComponent_DSSControllerImpl#getIOccupancyDecision <em>IOccupancy Decision</em>}</li>
 *   <li>{@link Implementation.impl.DecisionSupportComponent_DSSControllerImpl#getIAdditionalServiceDecision <em>IAdditional Service Decision</em>}</li>
 *   <li>{@link Implementation.impl.DecisionSupportComponent_DSSControllerImpl#getIBookingDecision <em>IBooking Decision</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecisionSupportComponent_DSSControllerImpl extends MinimalEObjectImpl.Container implements DecisionSupportComponent_DSSController {
	/**
	 * The cached value of the '{@link #getDSSProcessor() <em>DSS Processor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDSSProcessor()
	 * @generated
	 * @ordered
	 */
	protected EList<DecisionSupportComponent_DSSProcessor> dSSProcessor;

	/**
	 * The cached value of the '{@link #getDSSPresenter() <em>DSS Presenter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDSSPresenter()
	 * @generated
	 * @ordered
	 */
	protected DecisionSupportComponent_DSSPresenter dSSPresenter;

	/**
	 * The cached value of the '{@link #getIRoomDecision() <em>IRoom Decision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIRoomDecision()
	 * @generated
	 * @ordered
	 */
	protected RoomComponent_IRoomDecision iRoomDecision;

	/**
	 * The cached value of the '{@link #getIOccupancyDecision() <em>IOccupancy Decision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIOccupancyDecision()
	 * @generated
	 * @ordered
	 */
	protected OccupancyComponent_IOccupancyDecision iOccupancyDecision;

	/**
	 * The cached value of the '{@link #getIAdditionalServiceDecision() <em>IAdditional Service Decision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIAdditionalServiceDecision()
	 * @generated
	 * @ordered
	 */
	protected AdditionalServiceComponent_IAdditionalServiceDecision iAdditionalServiceDecision;

	/**
	 * The cached value of the '{@link #getIBookingDecision() <em>IBooking Decision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIBookingDecision()
	 * @generated
	 * @ordered
	 */
	protected BookingComponent_IBookingDecision iBookingDecision;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionSupportComponent_DSSControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DecisionSupportComponent_DSSProcessor> getDSSProcessor() {
		if (dSSProcessor == null) {
			dSSProcessor = new EObjectResolvingEList<DecisionSupportComponent_DSSProcessor>(DecisionSupportComponent_DSSProcessor.class, this, ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__DSS_PROCESSOR);
		}
		return dSSProcessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionSupportComponent_DSSPresenter getDSSPresenter() {
		if (dSSPresenter != null && dSSPresenter.eIsProxy()) {
			InternalEObject oldDSSPresenter = (InternalEObject)dSSPresenter;
			dSSPresenter = (DecisionSupportComponent_DSSPresenter)eResolveProxy(oldDSSPresenter);
			if (dSSPresenter != oldDSSPresenter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__DSS_PRESENTER, oldDSSPresenter, dSSPresenter));
			}
		}
		return dSSPresenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionSupportComponent_DSSPresenter basicGetDSSPresenter() {
		return dSSPresenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDSSPresenter(DecisionSupportComponent_DSSPresenter newDSSPresenter) {
		DecisionSupportComponent_DSSPresenter oldDSSPresenter = dSSPresenter;
		dSSPresenter = newDSSPresenter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__DSS_PRESENTER, oldDSSPresenter, dSSPresenter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomComponent_IRoomDecision getIRoomDecision() {
		if (iRoomDecision != null && iRoomDecision.eIsProxy()) {
			InternalEObject oldIRoomDecision = (InternalEObject)iRoomDecision;
			iRoomDecision = (RoomComponent_IRoomDecision)eResolveProxy(oldIRoomDecision);
			if (iRoomDecision != oldIRoomDecision) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__IROOM_DECISION, oldIRoomDecision, iRoomDecision));
			}
		}
		return iRoomDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomComponent_IRoomDecision basicGetIRoomDecision() {
		return iRoomDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIRoomDecision(RoomComponent_IRoomDecision newIRoomDecision) {
		RoomComponent_IRoomDecision oldIRoomDecision = iRoomDecision;
		iRoomDecision = newIRoomDecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__IROOM_DECISION, oldIRoomDecision, iRoomDecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccupancyComponent_IOccupancyDecision getIOccupancyDecision() {
		if (iOccupancyDecision != null && iOccupancyDecision.eIsProxy()) {
			InternalEObject oldIOccupancyDecision = (InternalEObject)iOccupancyDecision;
			iOccupancyDecision = (OccupancyComponent_IOccupancyDecision)eResolveProxy(oldIOccupancyDecision);
			if (iOccupancyDecision != oldIOccupancyDecision) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__IOCCUPANCY_DECISION, oldIOccupancyDecision, iOccupancyDecision));
			}
		}
		return iOccupancyDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccupancyComponent_IOccupancyDecision basicGetIOccupancyDecision() {
		return iOccupancyDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIOccupancyDecision(OccupancyComponent_IOccupancyDecision newIOccupancyDecision) {
		OccupancyComponent_IOccupancyDecision oldIOccupancyDecision = iOccupancyDecision;
		iOccupancyDecision = newIOccupancyDecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__IOCCUPANCY_DECISION, oldIOccupancyDecision, iOccupancyDecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalServiceComponent_IAdditionalServiceDecision getIAdditionalServiceDecision() {
		if (iAdditionalServiceDecision != null && iAdditionalServiceDecision.eIsProxy()) {
			InternalEObject oldIAdditionalServiceDecision = (InternalEObject)iAdditionalServiceDecision;
			iAdditionalServiceDecision = (AdditionalServiceComponent_IAdditionalServiceDecision)eResolveProxy(oldIAdditionalServiceDecision);
			if (iAdditionalServiceDecision != oldIAdditionalServiceDecision) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__IADDITIONAL_SERVICE_DECISION, oldIAdditionalServiceDecision, iAdditionalServiceDecision));
			}
		}
		return iAdditionalServiceDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalServiceComponent_IAdditionalServiceDecision basicGetIAdditionalServiceDecision() {
		return iAdditionalServiceDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIAdditionalServiceDecision(AdditionalServiceComponent_IAdditionalServiceDecision newIAdditionalServiceDecision) {
		AdditionalServiceComponent_IAdditionalServiceDecision oldIAdditionalServiceDecision = iAdditionalServiceDecision;
		iAdditionalServiceDecision = newIAdditionalServiceDecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__IADDITIONAL_SERVICE_DECISION, oldIAdditionalServiceDecision, iAdditionalServiceDecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingComponent_IBookingDecision getIBookingDecision() {
		if (iBookingDecision != null && iBookingDecision.eIsProxy()) {
			InternalEObject oldIBookingDecision = (InternalEObject)iBookingDecision;
			iBookingDecision = (BookingComponent_IBookingDecision)eResolveProxy(oldIBookingDecision);
			if (iBookingDecision != oldIBookingDecision) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__IBOOKING_DECISION, oldIBookingDecision, iBookingDecision));
			}
		}
		return iBookingDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingComponent_IBookingDecision basicGetIBookingDecision() {
		return iBookingDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIBookingDecision(BookingComponent_IBookingDecision newIBookingDecision) {
		BookingComponent_IBookingDecision oldIBookingDecision = iBookingDecision;
		iBookingDecision = newIBookingDecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__IBOOKING_DECISION, oldIBookingDecision, iBookingDecision));
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
	public void listFreeRooms() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void listGuestsInRoom(int roomNumber) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void numberOfGuestsInHotel() {
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
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__DSS_PROCESSOR:
				return getDSSProcessor();
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__DSS_PRESENTER:
				if (resolve) return getDSSPresenter();
				return basicGetDSSPresenter();
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__IROOM_DECISION:
				if (resolve) return getIRoomDecision();
				return basicGetIRoomDecision();
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__IOCCUPANCY_DECISION:
				if (resolve) return getIOccupancyDecision();
				return basicGetIOccupancyDecision();
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__IADDITIONAL_SERVICE_DECISION:
				if (resolve) return getIAdditionalServiceDecision();
				return basicGetIAdditionalServiceDecision();
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__IBOOKING_DECISION:
				if (resolve) return getIBookingDecision();
				return basicGetIBookingDecision();
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
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__DSS_PROCESSOR:
				getDSSProcessor().clear();
				getDSSProcessor().addAll((Collection<? extends DecisionSupportComponent_DSSProcessor>)newValue);
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__DSS_PRESENTER:
				setDSSPresenter((DecisionSupportComponent_DSSPresenter)newValue);
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__IROOM_DECISION:
				setIRoomDecision((RoomComponent_IRoomDecision)newValue);
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__IOCCUPANCY_DECISION:
				setIOccupancyDecision((OccupancyComponent_IOccupancyDecision)newValue);
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__IADDITIONAL_SERVICE_DECISION:
				setIAdditionalServiceDecision((AdditionalServiceComponent_IAdditionalServiceDecision)newValue);
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__IBOOKING_DECISION:
				setIBookingDecision((BookingComponent_IBookingDecision)newValue);
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
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__DSS_PROCESSOR:
				getDSSProcessor().clear();
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__DSS_PRESENTER:
				setDSSPresenter((DecisionSupportComponent_DSSPresenter)null);
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__IROOM_DECISION:
				setIRoomDecision((RoomComponent_IRoomDecision)null);
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__IOCCUPANCY_DECISION:
				setIOccupancyDecision((OccupancyComponent_IOccupancyDecision)null);
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__IADDITIONAL_SERVICE_DECISION:
				setIAdditionalServiceDecision((AdditionalServiceComponent_IAdditionalServiceDecision)null);
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__IBOOKING_DECISION:
				setIBookingDecision((BookingComponent_IBookingDecision)null);
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
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__DSS_PROCESSOR:
				return dSSProcessor != null && !dSSProcessor.isEmpty();
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__DSS_PRESENTER:
				return dSSPresenter != null;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__IROOM_DECISION:
				return iRoomDecision != null;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__IOCCUPANCY_DECISION:
				return iOccupancyDecision != null;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__IADDITIONAL_SERVICE_DECISION:
				return iAdditionalServiceDecision != null;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__IBOOKING_DECISION:
				return iBookingDecision != null;
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
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER___CHECK_IN_GUEST__STRING_STRING_STRING:
				checkInGuest((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
				return null;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER___CHECK_OUT_GUEST__STRING_STRING_STRING:
				checkOutGuest((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
				return null;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER___LIST_FREE_ROOMS:
				listFreeRooms();
				return null;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER___LIST_GUESTS_IN_ROOM__INT:
				listGuestsInRoom((Integer)arguments.get(0));
				return null;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER___NUMBER_OF_GUESTS_IN_HOTEL:
				numberOfGuestsInHotel();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //DecisionSupportComponent_DSSControllerImpl
