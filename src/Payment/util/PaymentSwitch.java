/**
 */
package Payment.util;

import Payment.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Payment.PaymentPackage
 * @generated
 */
public class PaymentSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PaymentPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentSwitch() {
		if (modelPackage == null) {
			modelPackage = PaymentPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PaymentPackage.PAYMENT_COMPONENT: {
				PaymentComponent paymentComponent = (PaymentComponent)theEObject;
				T result = casePaymentComponent(paymentComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PaymentPackage.PAYMENT_COMPONENT_PAYMENT_MANAGER: {
				PaymentComponent_PaymentManager paymentComponent_PaymentManager = (PaymentComponent_PaymentManager)theEObject;
				T result = casePaymentComponent_PaymentManager(paymentComponent_PaymentManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PaymentPackage.PAYMENT_COMPONENT_PAYMENT_CALCULATOR: {
				PaymentComponent_PaymentCalculator paymentComponent_PaymentCalculator = (PaymentComponent_PaymentCalculator)theEObject;
				T result = casePaymentComponent_PaymentCalculator(paymentComponent_PaymentCalculator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PaymentPackage.PAYMENT_COMPONENT_PAYMENT_HISTORY_DB: {
				PaymentComponent_PaymentHistoryDB paymentComponent_PaymentHistoryDB = (PaymentComponent_PaymentHistoryDB)theEObject;
				T result = casePaymentComponent_PaymentHistoryDB(paymentComponent_PaymentHistoryDB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PaymentPackage.PAYMENT_COMPONENT_IPAYMENT: {
				PaymentComponent_IPayment paymentComponent_IPayment = (PaymentComponent_IPayment)theEObject;
				T result = casePaymentComponent_IPayment(paymentComponent_IPayment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaymentComponent(PaymentComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Payment Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Payment Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaymentComponent_PaymentManager(PaymentComponent_PaymentManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Payment Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Payment Calculator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaymentComponent_PaymentCalculator(PaymentComponent_PaymentCalculator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Payment History DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Payment History DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaymentComponent_PaymentHistoryDB(PaymentComponent_PaymentHistoryDB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component IPayment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component IPayment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaymentComponent_IPayment(PaymentComponent_IPayment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PaymentSwitch
