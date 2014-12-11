/**
 */
package Implementation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Component Payment History DB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Implementation.PaymentComponent_PaymentHistoryDB#getPaymentHistory <em>Payment History</em>}</li>
 *   <li>{@link Implementation.PaymentComponent_PaymentHistoryDB#getPaymentManager <em>Payment Manager</em>}</li>
 * </ul>
 * </p>
 *
 * @see Implementation.ImplementationPackage#getPaymentComponent_PaymentHistoryDB()
 * @model
 * @generated
 */
public interface PaymentComponent_PaymentHistoryDB extends EObject {
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
	 * @see Implementation.ImplementationPackage#getPaymentComponent_PaymentHistoryDB_PaymentHistory()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPaymentHistory();

	/**
	 * Sets the value of the '{@link Implementation.PaymentComponent_PaymentHistoryDB#getPaymentHistory <em>Payment History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment History</em>' attribute.
	 * @see #getPaymentHistory()
	 * @generated
	 */
	void setPaymentHistory(String value);

	/**
	 * Returns the value of the '<em><b>Payment Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Manager</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Manager</em>' reference.
	 * @see #setPaymentManager(PaymentComponent_PaymentManager)
	 * @see Implementation.ImplementationPackage#getPaymentComponent_PaymentHistoryDB_PaymentManager()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PaymentComponent_PaymentManager getPaymentManager();

	/**
	 * Sets the value of the '{@link Implementation.PaymentComponent_PaymentHistoryDB#getPaymentManager <em>Payment Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Manager</em>' reference.
	 * @see #getPaymentManager()
	 * @generated
	 */
	void setPaymentManager(PaymentComponent_PaymentManager value);

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

} // PaymentComponent_PaymentHistoryDB
