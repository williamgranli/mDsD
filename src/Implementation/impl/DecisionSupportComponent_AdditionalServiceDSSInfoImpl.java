/**
 */
package Implementation.impl;

import Implementation.DecisionSupportComponent_AdditionalServiceDSSInfo;
import Implementation.ImplementationPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision Support Component Additional Service DSS Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Implementation.impl.DecisionSupportComponent_AdditionalServiceDSSInfoImpl#getAdditionalServiceName <em>Additional Service Name</em>}</li>
 *   <li>{@link Implementation.impl.DecisionSupportComponent_AdditionalServiceDSSInfoImpl#getAdditionalServicePrice <em>Additional Service Price</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecisionSupportComponent_AdditionalServiceDSSInfoImpl extends MinimalEObjectImpl.Container implements DecisionSupportComponent_AdditionalServiceDSSInfo {
	/**
	 * The default value of the '{@link #getAdditionalServiceName() <em>Additional Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_SERVICE_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAdditionalServiceName() <em>Additional Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalServiceName()
	 * @generated
	 * @ordered
	 */
	protected String additionalServiceName = ADDITIONAL_SERVICE_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getAdditionalServicePrice() <em>Additional Service Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalServicePrice()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_SERVICE_PRICE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAdditionalServicePrice() <em>Additional Service Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalServicePrice()
	 * @generated
	 * @ordered
	 */
	protected String additionalServicePrice = ADDITIONAL_SERVICE_PRICE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionSupportComponent_AdditionalServiceDSSInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.DECISION_SUPPORT_COMPONENT_ADDITIONAL_SERVICE_DSS_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdditionalServiceName() {
		return additionalServiceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditionalServiceName(String newAdditionalServiceName) {
		String oldAdditionalServiceName = additionalServiceName;
		additionalServiceName = newAdditionalServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.DECISION_SUPPORT_COMPONENT_ADDITIONAL_SERVICE_DSS_INFO__ADDITIONAL_SERVICE_NAME, oldAdditionalServiceName, additionalServiceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdditionalServicePrice() {
		return additionalServicePrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditionalServicePrice(String newAdditionalServicePrice) {
		String oldAdditionalServicePrice = additionalServicePrice;
		additionalServicePrice = newAdditionalServicePrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.DECISION_SUPPORT_COMPONENT_ADDITIONAL_SERVICE_DSS_INFO__ADDITIONAL_SERVICE_PRICE, oldAdditionalServicePrice, additionalServicePrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_ADDITIONAL_SERVICE_DSS_INFO__ADDITIONAL_SERVICE_NAME:
				return getAdditionalServiceName();
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_ADDITIONAL_SERVICE_DSS_INFO__ADDITIONAL_SERVICE_PRICE:
				return getAdditionalServicePrice();
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
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_ADDITIONAL_SERVICE_DSS_INFO__ADDITIONAL_SERVICE_NAME:
				setAdditionalServiceName((String)newValue);
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_ADDITIONAL_SERVICE_DSS_INFO__ADDITIONAL_SERVICE_PRICE:
				setAdditionalServicePrice((String)newValue);
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
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_ADDITIONAL_SERVICE_DSS_INFO__ADDITIONAL_SERVICE_NAME:
				setAdditionalServiceName(ADDITIONAL_SERVICE_NAME_EDEFAULT);
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_ADDITIONAL_SERVICE_DSS_INFO__ADDITIONAL_SERVICE_PRICE:
				setAdditionalServicePrice(ADDITIONAL_SERVICE_PRICE_EDEFAULT);
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
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_ADDITIONAL_SERVICE_DSS_INFO__ADDITIONAL_SERVICE_NAME:
				return ADDITIONAL_SERVICE_NAME_EDEFAULT == null ? additionalServiceName != null : !ADDITIONAL_SERVICE_NAME_EDEFAULT.equals(additionalServiceName);
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_ADDITIONAL_SERVICE_DSS_INFO__ADDITIONAL_SERVICE_PRICE:
				return ADDITIONAL_SERVICE_PRICE_EDEFAULT == null ? additionalServicePrice != null : !ADDITIONAL_SERVICE_PRICE_EDEFAULT.equals(additionalServicePrice);
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
		result.append(" (additionalServiceName: ");
		result.append(additionalServiceName);
		result.append(", additionalServicePrice: ");
		result.append(additionalServicePrice);
		result.append(')');
		return result.toString();
	}

} //DecisionSupportComponent_AdditionalServiceDSSInfoImpl
