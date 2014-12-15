/**
 */
package Implementation;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Component Payment Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Implementation.PaymentComponent_PaymentHandler#getPayment <em>Payment</em>}</li>
 *   <li>{@link Implementation.PaymentComponent_PaymentHandler#getCustomerProvides <em>Customer Provides</em>}</li>
 *   <li>{@link Implementation.PaymentComponent_PaymentHandler#getAdministratorProvides <em>Administrator Provides</em>}</li>
 * </ul>
 * </p>
 *
 * @see Implementation.ImplementationPackage#getPaymentComponent_PaymentHandler()
 * @model
 * @generated
 */
public interface PaymentComponent_PaymentHandler extends PaymentComponent_IPayment {
	/**
	 * Returns the value of the '<em><b>Payment</b></em>' reference list.
	 * The list contents are of type {@link Implementation.PaymentComponent_Payment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment</em>' reference list.
	 * @see Implementation.ImplementationPackage#getPaymentComponent_PaymentHandler_Payment()
	 * @model ordered="false"
	 * @generated
	 */
	EList<PaymentComponent_Payment> getPayment();

	/**
	 * Returns the value of the '<em><b>Customer Provides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Provides</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Provides</em>' reference.
	 * @see #setCustomerProvides(Bank_CustomerProvides)
	 * @see Implementation.ImplementationPackage#getPaymentComponent_PaymentHandler_CustomerProvides()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Bank_CustomerProvides getCustomerProvides();

	/**
	 * Sets the value of the '{@link Implementation.PaymentComponent_PaymentHandler#getCustomerProvides <em>Customer Provides</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Provides</em>' reference.
	 * @see #getCustomerProvides()
	 * @generated
	 */
	void setCustomerProvides(Bank_CustomerProvides value);

	/**
	 * Returns the value of the '<em><b>Administrator Provides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Administrator Provides</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Administrator Provides</em>' reference.
	 * @see #setAdministratorProvides(Bank_AdministratorProvides)
	 * @see Implementation.ImplementationPackage#getPaymentComponent_PaymentHandler_AdministratorProvides()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Bank_AdministratorProvides getAdministratorProvides();

	/**
	 * Sets the value of the '{@link Implementation.PaymentComponent_PaymentHandler#getAdministratorProvides <em>Administrator Provides</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Administrator Provides</em>' reference.
	 * @see #getAdministratorProvides()
	 * @generated
	 */
	void setAdministratorProvides(Bank_AdministratorProvides value);

} // PaymentComponent_PaymentHandler
