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

} // PaymentComponent_PaymentHandler
