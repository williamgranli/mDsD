/**
 */
package Implementation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Component Payment Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Implementation.PaymentComponent_PaymentManager#getPaymentDetails <em>Payment Details</em>}</li>
 *   <li>{@link Implementation.PaymentComponent_PaymentManager#getPayments <em>Payments</em>}</li>
 * </ul>
 * </p>
 *
 * @see Implementation.ImplementationPackage#getPaymentComponent_PaymentManager()
 * @model
 * @generated
 */
public interface PaymentComponent_PaymentManager extends PaymentComponent_IPayment {
	/**
	 * Returns the value of the '<em><b>Payment Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Details</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Details</em>' attribute.
	 * @see #setPaymentDetails(String)
	 * @see Implementation.ImplementationPackage#getPaymentComponent_PaymentManager_PaymentDetails()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPaymentDetails();

	/**
	 * Sets the value of the '{@link Implementation.PaymentComponent_PaymentManager#getPaymentDetails <em>Payment Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Details</em>' attribute.
	 * @see #getPaymentDetails()
	 * @generated
	 */
	void setPaymentDetails(String value);

	/**
	 * Returns the value of the '<em><b>Payments</b></em>' reference list.
	 * The list contents are of type {@link Implementation.PaymentComponent_Payment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payments</em>' reference list.
	 * @see Implementation.ImplementationPackage#getPaymentComponent_PaymentManager_Payments()
	 * @model ordered="false"
	 * @generated
	 */
	EList<PaymentComponent_Payment> getPayments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ccvDataType="org.eclipse.uml2.types.String" ccvRequired="true" ccvOrdered="false" amountDataType="org.eclipse.uml2.types.Integer" amountRequired="true" amountOrdered="false" ccNumberDataType="org.eclipse.uml2.types.Integer" ccNumberRequired="true" ccNumberOrdered="false" expireMonthDataType="org.eclipse.uml2.types.Integer" expireMonthRequired="true" expireMonthOrdered="false" expiryYearDataType="org.eclipse.uml2.types.String" expiryYearRequired="true" expiryYearOrdered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false"
	 * @generated
	 */
	void makePayment(String ccv, int amount, int ccNumber, int expireMonth, String expiryYear, String firstName, String lastName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ccNumberDataType="org.eclipse.uml2.types.String" ccNumberRequired="true" ccNumberOrdered="false" ccvDataType="org.eclipse.uml2.types.String" ccvRequired="true" ccvOrdered="false" expiryMonthDataType="org.eclipse.uml2.types.String" expiryMonthRequired="true" expiryMonthOrdered="false" expiryYearDataType="org.eclipse.uml2.types.String" expiryYearRequired="true" expiryYearOrdered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false"
	 * @generated
	 */
	void isCreditCardValid(String ccNumber, String ccv, String expiryMonth, String expiryYear, String firstName, String lastName);

} // PaymentComponent_PaymentManager
