/**
 */
package Payment.impl;

import Payment.PaymentComponent_PaymentHistoryDB;
import Payment.PaymentPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Payment History DB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Payment.impl.PaymentComponent_PaymentHistoryDBImpl#getPaymentHistory <em>Payment History</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PaymentComponent_PaymentHistoryDBImpl extends MinimalEObjectImpl.Container implements PaymentComponent_PaymentHistoryDB {
	/**
	 * The default value of the '{@link #getPaymentHistory() <em>Payment History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentHistory()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_HISTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaymentHistory() <em>Payment History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentHistory()
	 * @generated
	 * @ordered
	 */
	protected String paymentHistory = PAYMENT_HISTORY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentComponent_PaymentHistoryDBImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentPackage.Literals.PAYMENT_COMPONENT_PAYMENT_HISTORY_DB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPaymentHistory() {
		return paymentHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentHistory(String newPaymentHistory) {
		String oldPaymentHistory = paymentHistory;
		paymentHistory = newPaymentHistory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_COMPONENT_PAYMENT_HISTORY_DB__PAYMENT_HISTORY, oldPaymentHistory, paymentHistory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPaymentHistory(int amount, String paymentDateAndTime, String customerName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void searchForPayment(String paymentDate) {
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
			case PaymentPackage.PAYMENT_COMPONENT_PAYMENT_HISTORY_DB__PAYMENT_HISTORY:
				return getPaymentHistory();
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
			case PaymentPackage.PAYMENT_COMPONENT_PAYMENT_HISTORY_DB__PAYMENT_HISTORY:
				setPaymentHistory((String)newValue);
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
			case PaymentPackage.PAYMENT_COMPONENT_PAYMENT_HISTORY_DB__PAYMENT_HISTORY:
				setPaymentHistory(PAYMENT_HISTORY_EDEFAULT);
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
			case PaymentPackage.PAYMENT_COMPONENT_PAYMENT_HISTORY_DB__PAYMENT_HISTORY:
				return PAYMENT_HISTORY_EDEFAULT == null ? paymentHistory != null : !PAYMENT_HISTORY_EDEFAULT.equals(paymentHistory);
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
			case PaymentPackage.PAYMENT_COMPONENT_PAYMENT_HISTORY_DB___CREATE_PAYMENT_HISTORY__INT_STRING_STRING:
				createPaymentHistory((Integer)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
				return null;
			case PaymentPackage.PAYMENT_COMPONENT_PAYMENT_HISTORY_DB___SEARCH_FOR_PAYMENT__STRING:
				searchForPayment((String)arguments.get(0));
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
		result.append(" (paymentHistory: ");
		result.append(paymentHistory);
		result.append(')');
		return result.toString();
	}

} //PaymentComponent_PaymentHistoryDBImpl
