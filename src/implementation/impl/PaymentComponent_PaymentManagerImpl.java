/**
 */
package implementation.impl;

import implementation.ImplementationPackage;
import implementation.PaymentComponent_PaymentManager;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Component Payment Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link implementation.impl.PaymentComponent_PaymentManagerImpl#getPaymentDetails <em>Payment Details</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PaymentComponent_PaymentManagerImpl extends MinimalEObjectImpl.Container implements PaymentComponent_PaymentManager {
	/**
	 * The default value of the '{@link #getPaymentDetails() <em>Payment Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentDetails()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_DETAILS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaymentDetails() <em>Payment Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentDetails()
	 * @generated
	 * @ordered
	 */
	protected String paymentDetails = PAYMENT_DETAILS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentComponent_PaymentManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.PAYMENT_COMPONENT_PAYMENT_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPaymentDetails() {
		return paymentDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentDetails(String newPaymentDetails) {
		String oldPaymentDetails = paymentDetails;
		paymentDetails = newPaymentDetails;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.PAYMENT_COMPONENT_PAYMENT_MANAGER__PAYMENT_DETAILS, oldPaymentDetails, paymentDetails));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void makePayment(String ccv, int amount, int ccNumber, int expireMonth, String expiryYear, String firstName, String lastName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void isCreditCardValid(String ccNumber, String ccv, String expiryMonth, String expiryYear, String firstName, String lastName) {
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
			case ImplementationPackage.PAYMENT_COMPONENT_PAYMENT_MANAGER__PAYMENT_DETAILS:
				return getPaymentDetails();
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
			case ImplementationPackage.PAYMENT_COMPONENT_PAYMENT_MANAGER__PAYMENT_DETAILS:
				setPaymentDetails((String)newValue);
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
			case ImplementationPackage.PAYMENT_COMPONENT_PAYMENT_MANAGER__PAYMENT_DETAILS:
				setPaymentDetails(PAYMENT_DETAILS_EDEFAULT);
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
			case ImplementationPackage.PAYMENT_COMPONENT_PAYMENT_MANAGER__PAYMENT_DETAILS:
				return PAYMENT_DETAILS_EDEFAULT == null ? paymentDetails != null : !PAYMENT_DETAILS_EDEFAULT.equals(paymentDetails);
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
			case ImplementationPackage.PAYMENT_COMPONENT_PAYMENT_MANAGER___MAKE_PAYMENT__STRING_INT_INT_INT_STRING_STRING_STRING:
				makePayment((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5), (String)arguments.get(6));
				return null;
			case ImplementationPackage.PAYMENT_COMPONENT_PAYMENT_MANAGER___IS_CREDIT_CARD_VALID__STRING_STRING_STRING_STRING_STRING_STRING:
				isCreditCardValid((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5));
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (paymentDetails: ");
		result.append(paymentDetails);
		result.append(')');
		return result.toString();
	}

} //PaymentComponent_PaymentManagerImpl
