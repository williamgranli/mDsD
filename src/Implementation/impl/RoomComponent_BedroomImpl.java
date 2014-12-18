/**
 */
package Implementation.impl;

import Implementation.ImplementationPackage;
import Implementation.RoomComponent_Bedroom;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Component Bedroom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Implementation.impl.RoomComponent_BedroomImpl#getBedCount <em>Bed Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomComponent_BedroomImpl extends RoomComponent_RoomImpl implements RoomComponent_Bedroom {
	/**
	 * The default value of the '{@link #getBedCount() <em>Bed Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedCount()
	 * @generated
	 * @ordered
	 */
	protected static final int BED_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBedCount() <em>Bed Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedCount()
	 * @generated
	 * @ordered
	 */
	protected int bedCount = BED_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomComponent_BedroomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected RoomComponent_BedroomImpl(int roomNumber, boolean usable, int price, String roomTypeName, String description, int bedCount) {
		super(roomNumber, usable, price, roomTypeName, description);
		this.setBedCount(bedCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.ROOM_COMPONENT_BEDROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBedCount() {
		return bedCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBedCount(int newBedCount) {
		int oldBedCount = bedCount;
		bedCount = newBedCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ROOM_COMPONENT_BEDROOM__BED_COUNT, oldBedCount, bedCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImplementationPackage.ROOM_COMPONENT_BEDROOM__BED_COUNT:
				return getBedCount();
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
			case ImplementationPackage.ROOM_COMPONENT_BEDROOM__BED_COUNT:
				setBedCount((Integer)newValue);
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
			case ImplementationPackage.ROOM_COMPONENT_BEDROOM__BED_COUNT:
				setBedCount(BED_COUNT_EDEFAULT);
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
			case ImplementationPackage.ROOM_COMPONENT_BEDROOM__BED_COUNT:
				return bedCount != BED_COUNT_EDEFAULT;
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
		result.append(" (bedCount: ");
		result.append(bedCount);
		result.append(')');
		return result.toString();
	}

} //RoomComponent_BedroomImpl
