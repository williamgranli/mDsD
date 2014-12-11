/**
 */
package Implementation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Component Payment Calculator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Implementation.PaymentComponent_PaymentCalculator#getCost <em>Cost</em>}</li>
 *   <li>{@link Implementation.PaymentComponent_PaymentCalculator#getDetails <em>Details</em>}</li>
 *   <li>{@link Implementation.PaymentComponent_PaymentCalculator#getPaymentManager <em>Payment Manager</em>}</li>
 * </ul>
 * </p>
 *
 * @see Implementation.ImplementationPackage#getPaymentComponent_PaymentCalculator()
 * @model
 * @generated
 */
public interface PaymentComponent_PaymentCalculator extends EObject {
	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(int)
	 * @see Implementation.ImplementationPackage#getPaymentComponent_PaymentCalculator_Cost()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getCost();

	/**
	 * Sets the value of the '{@link Implementation.PaymentComponent_PaymentCalculator#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(int value);

	/**
	 * Returns the value of the '<em><b>Details</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Details</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Details</em>' attribute list.
	 * @see Implementation.ImplementationPackage#getPaymentComponent_PaymentCalculator_Details()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	EList<String> getDetails();

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
	 * @see Implementation.ImplementationPackage#getPaymentComponent_PaymentCalculator_PaymentManager()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PaymentComponent_PaymentManager getPaymentManager();

	/**
	 * Sets the value of the '{@link Implementation.PaymentComponent_PaymentCalculator#getPaymentManager <em>Payment Manager</em>}' reference.
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
	 * @model priceDataType="org.eclipse.uml2.types.Integer" priceRequired="true" priceOrdered="false" additionalServiceDataType="org.eclipse.uml2.types.String" additionalServiceMany="true" additionalServiceOrdered="false" checkInDateDataType="org.eclipse.uml2.types.String" checkInDateRequired="true" checkInDateOrdered="false" checkOutDateDataType="org.eclipse.uml2.types.String" checkOutDateRequired="true" checkOutDateOrdered="false" isLateCancellationDataType="org.eclipse.uml2.types.Boolean" isLateCancellationRequired="true" isLateCancellationOrdered="false"
	 * @generated
	 */
	void calculate(int price, EList<String> additionalService, String checkInDate, String checkOutDate, boolean isLateCancellation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model cancelDateDataType="org.eclipse.uml2.types.String" cancelDateRequired="true" cancelDateOrdered="false" arrivalDateDataType="org.eclipse.uml2.types.String" arrivalDateRequired="true" arrivalDateOrdered="false"
	 * @generated
	 */
	void checkLateCancellation(String cancelDate, String arrivalDate);

} // PaymentComponent_PaymentCalculator
