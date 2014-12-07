/**
 */
package Payment;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Payment.PaymentPackage
 * @generated
 */
public interface PaymentFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PaymentFactory eINSTANCE = Payment.impl.PaymentFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	PaymentComponent createPaymentComponent();

	/**
	 * Returns a new object of class '<em>Component Payment Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Payment Manager</em>'.
	 * @generated
	 */
	PaymentComponent_PaymentManager createPaymentComponent_PaymentManager();

	/**
	 * Returns a new object of class '<em>Component Payment Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Payment Calculator</em>'.
	 * @generated
	 */
	PaymentComponent_PaymentCalculator createPaymentComponent_PaymentCalculator();

	/**
	 * Returns a new object of class '<em>Component Payment History DB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Payment History DB</em>'.
	 * @generated
	 */
	PaymentComponent_PaymentHistoryDB createPaymentComponent_PaymentHistoryDB();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PaymentPackage getPaymentPackage();

} //PaymentFactory
