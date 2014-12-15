/**
 */
package Implementation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Component Payment Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Implementation.PaymentComponent_PaymentHandler#getPayment <em>Payment</em>}</li>
 * </ul>
 * </p>
 *
 * @see Implementation.ImplementationPackage#getPaymentComponent_PaymentHandler()
 * @model
 * @generated
 */
public interface PaymentComponent_PaymentHandler extends PaymentComponent_IPayment {
	/**
	 * Returns the value of the '<em><b>Payment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment</em>' reference.
	 * @see #setPayment(PaymentComponent_Payment)
	 * @see Implementation.ImplementationPackage#getPaymentComponent_PaymentHandler_Payment()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PaymentComponent_Payment getPayment();

	/**
	 * Sets the value of the '{@link Implementation.PaymentComponent_PaymentHandler#getPayment <em>Payment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment</em>' reference.
	 * @see #getPayment()
	 * @generated
	 */
	void setPayment(PaymentComponent_Payment value);

} // PaymentComponent_PaymentHandler
