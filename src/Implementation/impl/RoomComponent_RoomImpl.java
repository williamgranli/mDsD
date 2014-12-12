/**
 */
package Implementation.impl;

import Implementation.ImplementationPackage;
import Implementation.RoomComponent_Room;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Component Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Implementation.impl.RoomComponent_RoomImpl#getRoomNumber <em>Room Number</em>}</li>
 *   <li>{@link Implementation.impl.RoomComponent_RoomImpl#isUsable <em>Usable</em>}</li>
 *   <li>{@link Implementation.impl.RoomComponent_RoomImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link Implementation.impl.RoomComponent_RoomImpl#getRoomTypeName <em>Room Type Name</em>}</li>
 *   <li>{@link Implementation.impl.RoomComponent_RoomImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomComponent_RoomImpl extends MinimalEObjectImpl.Container implements RoomComponent_Room {
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
	 * The default value of the '{@link #isUsable() <em>Usable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUsable() <em>Usable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsable()
	 * @generated
	 * @ordered
	 */
	protected boolean usable = USABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final int PRICE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected int price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoomTypeName() <em>Room Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOM_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoomTypeName() <em>Room Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomTypeName()
	 * @generated
	 * @ordered
	 */
	protected String roomTypeName = ROOM_TYPE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomComponent_RoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected RoomComponent_RoomImpl() {
		super();
		this.setRoomNumber(roomNumber);
		this.setUsable(usable);
		this.setPrice(price);
		this.setRoomTypeName(roomTypeName);
		this.setDescription(description);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.ROOM_COMPONENT_ROOM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ROOM_COMPONENT_ROOM__ROOM_NUMBER, oldRoomNumber, roomNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUsable() {
		return usable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsable(boolean newUsable) {
		boolean oldUsable = usable;
		usable = newUsable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ROOM_COMPONENT_ROOM__USABLE, oldUsable, usable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(int newPrice) {
		int oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ROOM_COMPONENT_ROOM__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoomTypeName() {
		return roomTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomTypeName(String newRoomTypeName) {
		String oldRoomTypeName = roomTypeName;
		roomTypeName = newRoomTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ROOM_COMPONENT_ROOM__ROOM_TYPE_NAME, oldRoomTypeName, roomTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ROOM_COMPONENT_ROOM__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImplementationPackage.ROOM_COMPONENT_ROOM__ROOM_NUMBER:
				return getRoomNumber();
			case ImplementationPackage.ROOM_COMPONENT_ROOM__USABLE:
				return isUsable();
			case ImplementationPackage.ROOM_COMPONENT_ROOM__PRICE:
				return getPrice();
			case ImplementationPackage.ROOM_COMPONENT_ROOM__ROOM_TYPE_NAME:
				return getRoomTypeName();
			case ImplementationPackage.ROOM_COMPONENT_ROOM__DESCRIPTION:
				return getDescription();
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
			case ImplementationPackage.ROOM_COMPONENT_ROOM__ROOM_NUMBER:
				setRoomNumber((Integer)newValue);
				return;
			case ImplementationPackage.ROOM_COMPONENT_ROOM__USABLE:
				setUsable((Boolean)newValue);
				return;
			case ImplementationPackage.ROOM_COMPONENT_ROOM__PRICE:
				setPrice((Integer)newValue);
				return;
			case ImplementationPackage.ROOM_COMPONENT_ROOM__ROOM_TYPE_NAME:
				setRoomTypeName((String)newValue);
				return;
			case ImplementationPackage.ROOM_COMPONENT_ROOM__DESCRIPTION:
				setDescription((String)newValue);
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
			case ImplementationPackage.ROOM_COMPONENT_ROOM__ROOM_NUMBER:
				setRoomNumber(ROOM_NUMBER_EDEFAULT);
				return;
			case ImplementationPackage.ROOM_COMPONENT_ROOM__USABLE:
				setUsable(USABLE_EDEFAULT);
				return;
			case ImplementationPackage.ROOM_COMPONENT_ROOM__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case ImplementationPackage.ROOM_COMPONENT_ROOM__ROOM_TYPE_NAME:
				setRoomTypeName(ROOM_TYPE_NAME_EDEFAULT);
				return;
			case ImplementationPackage.ROOM_COMPONENT_ROOM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case ImplementationPackage.ROOM_COMPONENT_ROOM__ROOM_NUMBER:
				return roomNumber != ROOM_NUMBER_EDEFAULT;
			case ImplementationPackage.ROOM_COMPONENT_ROOM__USABLE:
				return usable != USABLE_EDEFAULT;
			case ImplementationPackage.ROOM_COMPONENT_ROOM__PRICE:
				return price != PRICE_EDEFAULT;
			case ImplementationPackage.ROOM_COMPONENT_ROOM__ROOM_TYPE_NAME:
				return ROOM_TYPE_NAME_EDEFAULT == null ? roomTypeName != null : !ROOM_TYPE_NAME_EDEFAULT.equals(roomTypeName);
			case ImplementationPackage.ROOM_COMPONENT_ROOM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(", usable: ");
		result.append(usable);
		result.append(", price: ");
		result.append(price);
		result.append(", roomTypeName: ");
		result.append(roomTypeName);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //RoomComponent_RoomImpl
