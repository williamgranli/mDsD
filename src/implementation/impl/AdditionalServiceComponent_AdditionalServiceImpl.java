/**
 */
package implementation.impl;

import implementation.AdditionalServiceComponent_AdditionalService;
import implementation.ImplementationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Additional Service Component Additional Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link implementation.impl.AdditionalServiceComponent_AdditionalServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link implementation.impl.AdditionalServiceComponent_AdditionalServiceImpl#isUsable <em>Usable</em>}</li>
 *   <li>{@link implementation.impl.AdditionalServiceComponent_AdditionalServiceImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link implementation.impl.AdditionalServiceComponent_AdditionalServiceImpl#getMaxAttendant <em>Max Attendant</em>}</li>
 *   <li>{@link implementation.impl.AdditionalServiceComponent_AdditionalServiceImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdditionalServiceComponent_AdditionalServiceImpl extends MinimalEObjectImpl.Container implements AdditionalServiceComponent_AdditionalService {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The default value of the '{@link #getMaxAttendant() <em>Max Attendant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAttendant()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_ATTENDANT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxAttendant() <em>Max Attendant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAttendant()
	 * @generated
	 * @ordered
	 */
	protected int maxAttendant = MAX_ATTENDANT_EDEFAULT;

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
	protected AdditionalServiceComponent_AdditionalServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__USABLE, oldUsable, usable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxAttendant() {
		return maxAttendant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxAttendant(int newMaxAttendant) {
		int oldMaxAttendant = maxAttendant;
		maxAttendant = newMaxAttendant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__MAX_ATTENDANT, oldMaxAttendant, maxAttendant));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__NAME:
				return getName();
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__USABLE:
				return isUsable();
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__PRICE:
				return getPrice();
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__MAX_ATTENDANT:
				return getMaxAttendant();
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__DESCRIPTION:
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
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__NAME:
				setName((String)newValue);
				return;
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__USABLE:
				setUsable((Boolean)newValue);
				return;
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__PRICE:
				setPrice((Integer)newValue);
				return;
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__MAX_ATTENDANT:
				setMaxAttendant((Integer)newValue);
				return;
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__DESCRIPTION:
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
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__USABLE:
				setUsable(USABLE_EDEFAULT);
				return;
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__MAX_ATTENDANT:
				setMaxAttendant(MAX_ATTENDANT_EDEFAULT);
				return;
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__DESCRIPTION:
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
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__USABLE:
				return usable != USABLE_EDEFAULT;
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__PRICE:
				return price != PRICE_EDEFAULT;
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__MAX_ATTENDANT:
				return maxAttendant != MAX_ATTENDANT_EDEFAULT;
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__DESCRIPTION:
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
		result.append(" (name: ");
		result.append(name);
		result.append(", usable: ");
		result.append(usable);
		result.append(", price: ");
		result.append(price);
		result.append(", maxAttendant: ");
		result.append(maxAttendant);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //AdditionalServiceComponent_AdditionalServiceImpl
