/**
 */
package Implementation;

import java.util.Date;
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
	 * @model ccNumberDataType="org.eclipse.uml2.types.String" ccNumberRequired="true" ccNumberOrdered="false" ccvDataType="org.eclipse.uml2.types.String" ccvRequired="true" ccvOrdered="false" expiryYearDataType="org.eclipse.uml2.types.String" expiryYearRequired="true" expiryYearOrdered="false" expiryMonthDataType="org.eclipse.uml2.types.String" expiryMonthRequired="true" expiryMonthOrdered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false" doubleRequired="true" doubleOrdered="false" returnValueDataType="org.eclipse.uml2.types.Boolean" returnValueRequired="true" returnValueOrdered="false"
	 * @generated
	 */
	void makePayment(String ccNumber, String ccv, String expiryYear, String expiryMonth, String firstName, String lastName, Date double_, boolean returnValue);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ccNumberDataType="org.eclipse.uml2.types.String" ccNumberRequired="true" ccNumberOrdered="false" ccvDataType="org.eclipse.uml2.types.String" ccvRequired="true" ccvOrdered="false" expiryYearDataType="org.eclipse.uml2.types.String" expiryYearRequired="true" expiryYearOrdered="false" expiryMonthDataType="org.eclipse.uml2.types.String" expiryMonthRequired="true" expiryMonthOrdered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false" priceRequired="true" priceOrdered="false" returnValueDataType="org.eclipse.uml2.types.Boolean" returnValueRequired="true" returnValueOrdered="false"
	 * @generated
	 */
	void validateCC(String ccNumber, String ccv, String expiryYear, String expiryMonth, String firstName, String lastName, double price, boolean returnValue);

} // PaymentComponent_IPayment
