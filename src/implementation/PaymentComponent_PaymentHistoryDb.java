/**
 */
package implementation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Component Payment History Db</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link implementation.PaymentComponent_PaymentHistoryDb#getPaymentHistory <em>Payment History</em>}</li>
 * </ul>
 * </p>
 *
 * @see implementation.ImplementationPackage#getPaymentComponent_PaymentHistoryDb()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PaymentHistoryDB'"
 * @generated
 */
public interface PaymentComponent_PaymentHistoryDb extends EObject {
	/**
	 * Returns the value of the '<em><b>Payment History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment History</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment History</em>' attribute.
	 * @see #setPaymentHistory(String)
	 * @see implementation.ImplementationPackage#getPaymentComponent_PaymentHistoryDb_PaymentHistory()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPaymentHistory();

	/**
	 * Sets the value of the '{@link implementation.PaymentComponent_PaymentHistoryDb#getPaymentHistory <em>Payment History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment History</em>' attribute.
	 * @see #getPaymentHistory()
	 * @generated
	 */
	void setPaymentHistory(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model amountDataType="org.eclipse.uml2.types.Integer" amountRequired="true" amountOrdered="false" paymentDateAndTimeDataType="org.eclipse.uml2.types.String" paymentDateAndTimeRequired="true" paymentDateAndTimeOrdered="false" customerNameDataType="org.eclipse.uml2.types.String" customerNameRequired="true" customerNameOrdered="false"
	 * @generated
	 */
	void createPaymentHistory(int amount, String paymentDateAndTime, String customerName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model paymentDateDataType="org.eclipse.uml2.types.String" paymentDateRequired="true" paymentDateOrdered="false"
	 * @generated
	 */
	void searchForPayment(String paymentDate);

} // PaymentComponent_PaymentHistoryDb
