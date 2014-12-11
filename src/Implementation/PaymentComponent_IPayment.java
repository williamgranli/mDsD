/**
 */
package Implementation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Component IPayment</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Implementation.ImplementationPackage#getPaymentComponent_IPayment()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface PaymentComponent_IPayment extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model amountDataType="org.eclipse.uml2.types.Integer" amountRequired="true" amountOrdered="false" ccNumberDataType="org.eclipse.uml2.types.String" ccNumberRequired="true" ccNumberOrdered="false" ccvDataType="org.eclipse.uml2.types.String" ccvRequired="true" ccvOrdered="false" expiryMonthDataType="org.eclipse.uml2.types.String" expiryMonthRequired="true" expiryMonthOrdered="false" expiryYearDataType="org.eclipse.uml2.types.String" expiryYearRequired="true" expiryYearOrdered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false"
	 * @generated
	 */
	void payForBooking(int amount, String ccNumber, String ccv, String expiryMonth, String expiryYear, String firstName, String lastName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model amountDataType="org.eclipse.uml2.types.Integer" amountRequired="true" amountOrdered="false" ccNumberDataType="org.eclipse.uml2.types.String" ccNumberRequired="true" ccNumberOrdered="false" ccvDataType="org.eclipse.uml2.types.String" ccvRequired="true" ccvOrdered="false" expiryMonthDataType="org.eclipse.uml2.types.String" expiryMonthRequired="true" expiryMonthOrdered="false" expiryYearDataType="org.eclipse.uml2.types.String" expiryYearRequired="true" expiryYearOrdered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false"
	 * @generated
	 */
	void reserveFunds(int amount, String ccNumber, String ccv, String expiryMonth, String expiryYear, String firstName, String lastName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model amountDataType="org.eclipse.uml2.types.Integer" amountRequired="true" amountOrdered="false" ccNumberDataType="org.eclipse.uml2.types.String" ccNumberRequired="true" ccNumberOrdered="false" ccvDataType="org.eclipse.uml2.types.String" ccvRequired="true" ccvOrdered="false" expiryMonthDataType="org.eclipse.uml2.types.String" expiryMonthRequired="true" expiryMonthOrdered="false" expiryYearDataType="org.eclipse.uml2.types.String" expiryYearRequired="true" expiryYearOrdered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false"
	 * @generated
	 */
	void unreserveFunds(int amount, String ccNumber, String ccv, String expiryMonth, String expiryYear, String firstName, String lastName);

} // PaymentComponent_IPayment
