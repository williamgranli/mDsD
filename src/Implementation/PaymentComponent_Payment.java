/**
 */
package Implementation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Component Payment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Implementation.PaymentComponent_Payment#getCcNumber <em>Cc Number</em>}</li>
 *   <li>{@link Implementation.PaymentComponent_Payment#getCcv <em>Ccv</em>}</li>
 *   <li>{@link Implementation.PaymentComponent_Payment#getFirstName <em>First Name</em>}</li>
 *   <li>{@link Implementation.PaymentComponent_Payment#getLastName <em>Last Name</em>}</li>
 *   <li>{@link Implementation.PaymentComponent_Payment#getExpiryMonth <em>Expiry Month</em>}</li>
 *   <li>{@link Implementation.PaymentComponent_Payment#getExpiryYear <em>Expiry Year</em>}</li>
 *   <li>{@link Implementation.PaymentComponent_Payment#getAmount <em>Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @see Implementation.ImplementationPackage#getPaymentComponent_Payment()
 * @model
 * @generated
 */
public interface PaymentComponent_Payment extends EObject {

	/**
	 * Returns the value of the '<em><b>Cc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc Number</em>' attribute.
	 * @see #setCcNumber(String)
	 * @see Implementation.ImplementationPackage#getPaymentComponent_Payment_CcNumber()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCcNumber();

	/**
	 * Sets the value of the '{@link Implementation.PaymentComponent_Payment#getCcNumber <em>Cc Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc Number</em>' attribute.
	 * @see #getCcNumber()
	 * @generated
	 */
	void setCcNumber(String value);

	/**
	 * Returns the value of the '<em><b>Ccv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ccv</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ccv</em>' attribute.
	 * @see #setCcv(String)
	 * @see Implementation.ImplementationPackage#getPaymentComponent_Payment_Ccv()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCcv();

	/**
	 * Sets the value of the '{@link Implementation.PaymentComponent_Payment#getCcv <em>Ccv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ccv</em>' attribute.
	 * @see #getCcv()
	 * @generated
	 */
	void setCcv(String value);

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see Implementation.ImplementationPackage#getPaymentComponent_Payment_FirstName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link Implementation.PaymentComponent_Payment#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see Implementation.ImplementationPackage#getPaymentComponent_Payment_LastName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link Implementation.PaymentComponent_Payment#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Expiry Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expiry Month</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiry Month</em>' attribute.
	 * @see #setExpiryMonth(int)
	 * @see Implementation.ImplementationPackage#getPaymentComponent_Payment_ExpiryMonth()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getExpiryMonth();

	/**
	 * Sets the value of the '{@link Implementation.PaymentComponent_Payment#getExpiryMonth <em>Expiry Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiry Month</em>' attribute.
	 * @see #getExpiryMonth()
	 * @generated
	 */
	void setExpiryMonth(int value);

	/**
	 * Returns the value of the '<em><b>Expiry Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expiry Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiry Year</em>' attribute.
	 * @see #setExpiryYear(int)
	 * @see Implementation.ImplementationPackage#getPaymentComponent_Payment_ExpiryYear()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getExpiryYear();

	/**
	 * Sets the value of the '{@link Implementation.PaymentComponent_Payment#getExpiryYear <em>Expiry Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiry Year</em>' attribute.
	 * @see #getExpiryYear()
	 * @generated
	 */
	void setExpiryYear(int value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(double)
	 * @see Implementation.ImplementationPackage#getPaymentComponent_Payment_Amount()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getAmount();

	/**
	 * Sets the value of the '{@link Implementation.PaymentComponent_Payment#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(double value);
} // PaymentComponent_Payment
