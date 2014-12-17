/**
 */
package Implementation.impl;

import Implementation.DecisionSupportComponent_OccupancyDSSInfo;
import Implementation.ImplementationPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision Support Component Occupancy DSS Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Implementation.impl.DecisionSupportComponent_OccupancyDSSInfoImpl#getRoomNumber <em>Room Number</em>}</li>
 *   <li>{@link Implementation.impl.DecisionSupportComponent_OccupancyDSSInfoImpl#getCheckInDateTime <em>Check In Date Time</em>}</li>
 *   <li>{@link Implementation.impl.DecisionSupportComponent_OccupancyDSSInfoImpl#getCheckOutDateTime <em>Check Out Date Time</em>}</li>
 *   <li>{@link Implementation.impl.DecisionSupportComponent_OccupancyDSSInfoImpl#getNumberOfGuests <em>Number Of Guests</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecisionSupportComponent_OccupancyDSSInfoImpl extends MinimalEObjectImpl.Container implements DecisionSupportComponent_OccupancyDSSInfo {
	/**
	 * The default value of the '{@link #getRoomNumber() <em>Room Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int ROOM_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRoomNumber() <em>Room Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomNumber()
	 * @generated
	 * @ordered
	 */
	protected int roomNumber = ROOM_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCheckInDateTime() <em>Check In Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckInDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final String CHECK_IN_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCheckInDateTime() <em>Check In Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckInDateTime()
	 * @generated
	 * @ordered
	 */
	protected String checkInDateTime = CHECK_IN_DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCheckOutDateTime() <em>Check Out Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckOutDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final String CHECK_OUT_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCheckOutDateTime() <em>Check Out Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckOutDateTime()
	 * @generated
	 * @ordered
	 */
	protected String checkOutDateTime = CHECK_OUT_DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfGuests() <em>Number Of Guests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfGuests()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_GUESTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfGuests() <em>Number Of Guests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfGuests()
	 * @generated
	 * @ordered
	 */
	protected int numberOfGuests = NUMBER_OF_GUESTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionSupportComponent_OccupancyDSSInfoImpl() {
		super();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected DecisionSupportComponent_OccupancyDSSInfoImpl(int roomNumber, String checkInDateTime, String checkOutDateTime, int numberOfGuests){
		this.roomNumber = roomNumber;
		this.checkInDateTime = checkInDateTime;
		this.checkOutDateTime = checkOutDateTime;
		this.numberOfGuests = numberOfGuests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.DECISION_SUPPORT_COMPONENT_OCCUPANCY_DSS_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRoomNumber() {
		return roomNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomNumber(int newRoomNumber) {
		int oldRoomNumber = roomNumber;
		roomNumber = newRoomNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.DECISION_SUPPORT_COMPONENT_OCCUPANCY_DSS_INFO__ROOM_NUMBER, oldRoomNumber, roomNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCheckInDateTime() {
		return checkInDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckInDateTime(String newCheckInDateTime) {
		String oldCheckInDateTime = checkInDateTime;
		checkInDateTime = newCheckInDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.DECISION_SUPPORT_COMPONENT_OCCUPANCY_DSS_INFO__CHECK_IN_DATE_TIME, oldCheckInDateTime, checkInDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCheckOutDateTime() {
		return checkOutDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckOutDateTime(String newCheckOutDateTime) {
		String oldCheckOutDateTime = checkOutDateTime;
		checkOutDateTime = newCheckOutDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.DECISION_SUPPORT_COMPONENT_OCCUPANCY_DSS_INFO__CHECK_OUT_DATE_TIME, oldCheckOutDateTime, checkOutDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfGuests() {
		return numberOfGuests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfGuests(int newNumberOfGuests) {
		int oldNumberOfGuests = numberOfGuests;
		numberOfGuests = newNumberOfGuests;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.DECISION_SUPPORT_COMPONENT_OCCUPANCY_DSS_INFO__NUMBER_OF_GUESTS, oldNumberOfGuests, numberOfGuests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_OCCUPANCY_DSS_INFO__ROOM_NUMBER:
				return getRoomNumber();
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_OCCUPANCY_DSS_INFO__CHECK_IN_DATE_TIME:
				return getCheckInDateTime();
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_OCCUPANCY_DSS_INFO__CHECK_OUT_DATE_TIME:
				return getCheckOutDateTime();
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_OCCUPANCY_DSS_INFO__NUMBER_OF_GUESTS:
				return getNumberOfGuests();
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
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_OCCUPANCY_DSS_INFO__ROOM_NUMBER:
				setRoomNumber((Integer)newValue);
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_OCCUPANCY_DSS_INFO__CHECK_IN_DATE_TIME:
				setCheckInDateTime((String)newValue);
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_OCCUPANCY_DSS_INFO__CHECK_OUT_DATE_TIME:
				setCheckOutDateTime((String)newValue);
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_OCCUPANCY_DSS_INFO__NUMBER_OF_GUESTS:
				setNumberOfGuests((Integer)newValue);
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
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_OCCUPANCY_DSS_INFO__ROOM_NUMBER:
				setRoomNumber(ROOM_NUMBER_EDEFAULT);
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_OCCUPANCY_DSS_INFO__CHECK_IN_DATE_TIME:
				setCheckInDateTime(CHECK_IN_DATE_TIME_EDEFAULT);
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_OCCUPANCY_DSS_INFO__CHECK_OUT_DATE_TIME:
				setCheckOutDateTime(CHECK_OUT_DATE_TIME_EDEFAULT);
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_OCCUPANCY_DSS_INFO__NUMBER_OF_GUESTS:
				setNumberOfGuests(NUMBER_OF_GUESTS_EDEFAULT);
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
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_OCCUPANCY_DSS_INFO__ROOM_NUMBER:
				return roomNumber != ROOM_NUMBER_EDEFAULT;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_OCCUPANCY_DSS_INFO__CHECK_IN_DATE_TIME:
				return CHECK_IN_DATE_TIME_EDEFAULT == null ? checkInDateTime != null : !CHECK_IN_DATE_TIME_EDEFAULT.equals(checkInDateTime);
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_OCCUPANCY_DSS_INFO__CHECK_OUT_DATE_TIME:
				return CHECK_OUT_DATE_TIME_EDEFAULT == null ? checkOutDateTime != null : !CHECK_OUT_DATE_TIME_EDEFAULT.equals(checkOutDateTime);
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_OCCUPANCY_DSS_INFO__NUMBER_OF_GUESTS:
				return numberOfGuests != NUMBER_OF_GUESTS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (roomNumber: ");
		result.append(roomNumber);
		result.append(", checkInDateTime: ");
		result.append(checkInDateTime);
		result.append(", checkOutDateTime: ");
		result.append(checkOutDateTime);
		result.append(", numberOfGuests: ");
		result.append(numberOfGuests);
		result.append(')');
		return result.toString();
	}

} //DecisionSupportComponent_OccupancyDSSInfoImpl
