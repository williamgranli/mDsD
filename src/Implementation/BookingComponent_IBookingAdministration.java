/**
 */
package Implementation;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking Component IBooking Administration</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Implementation.ImplementationPackage#getBookingComponent_IBookingAdministration()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface BookingComponent_IBookingAdministration extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" arrivalDateRequired="true" arrivalDateOrdered="false" departureDateRequired="true" departureDateOrdered="false" customerSSNDataType="org.eclipse.uml2.types.String" customerSSNRequired="true" customerSSNOrdered="false" customerFirstNameDataType="org.eclipse.uml2.types.String" customerFirstNameRequired="true" customerFirstNameOrdered="false" customerLastNameDataType="org.eclipse.uml2.types.String" customerLastNameRequired="true" customerLastNameOrdered="false" customerAddressDataType="org.eclipse.uml2.types.String" customerAddressRequired="true" customerAddressOrdered="false" ccNumberDataType="org.eclipse.uml2.types.String" ccNumberRequired="true" ccNumberOrdered="false" ccvDataType="org.eclipse.uml2.types.String" ccvRequired="true" ccvOrdered="false" expiryMonthDataType="org.eclipse.uml2.types.String" expiryMonthRequired="true" expiryMonthOrdered="false" expiryYearDataType="org.eclipse.uml2.types.String" expiryYearRequired="true" expiryYearOrdered="false"
	 * @generated
	 */
	String makeBooking(Date arrivalDate, Date departureDate, String customerSSN, String customerFirstName, String customerLastName, String customerAddress, String ccNumber, String ccv, String expiryMonth, String expiryYear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingReferenceDataType="org.eclipse.uml2.types.String" bookingReferenceRequired="true" bookingReferenceOrdered="false" roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false" priceDataType="org.eclipse.uml2.types.Integer" priceRequired="true" priceOrdered="false"
	 * @generated
	 */
	void addRoom(String bookingReference, String roomType, int price);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false" priceDataType="org.eclipse.uml2.types.Integer" priceRequired="true" priceOrdered="false" arrivalDateRequired="true" arrivalDateOrdered="false" departureDateRequired="true" departureDateOrdered="false"
	 * @generated
	 */
	void requestQuote(String roomType, int price, Date arrivalDate, Date departureDate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingReferenceDataType="org.eclipse.uml2.types.String" bookingReferenceRequired="true" bookingReferenceOrdered="false" arrivalDateRequired="true" arrivalDateOrdered="false" departureDateRequired="true" departureDateOrdered="false"
	 * @generated
	 */
	void editBooking(String bookingReference, Date arrivalDate, Date departureDate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingReferenceDataType="org.eclipse.uml2.types.String" bookingReferenceRequired="true" bookingReferenceOrdered="false"
	 * @generated
	 */
	void cancelBooking(String bookingReference);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingReferenceDataType="org.eclipse.uml2.types.String" bookingReferenceRequired="true" bookingReferenceOrdered="false" additionalServiceNameDataType="org.eclipse.uml2.types.String" additionalServiceNameRequired="true" additionalServiceNameOrdered="false" costDataType="org.eclipse.uml2.types.Integer" costRequired="true" costOrdered="false"
	 * @generated
	 */
	void addAdditionalService(String bookingReference, String additionalServiceName, int cost);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingReferenceDataType="org.eclipse.uml2.types.String" bookingReferenceRequired="true" bookingReferenceOrdered="false" roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	void removeRoom(String bookingReference, String roomType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingReferenceDataType="org.eclipse.uml2.types.String" bookingReferenceRequired="true" bookingReferenceOrdered="false" additionalServiceNameDataType="org.eclipse.uml2.types.String" additionalServiceNameRequired="true" additionalServiceNameOrdered="false"
	 * @generated
	 */
	void removeAdditionalService(String bookingReference, String additionalServiceName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model startDateRequired="true" startDateOrdered="false" endDateRequired="true" endDateOrdered="false" roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	void generateQuote(Date startDate, Date endDate, String roomType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingReferenceDataType="org.eclipse.uml2.types.String" bookingReferenceRequired="true" bookingReferenceOrdered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false" addressDataType="org.eclipse.uml2.types.String" addressRequired="true" addressOrdered="false"
	 * @generated
	 */
	void addGuestToBooking(String bookingReference, String firstName, String lastName, String address);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingReferenceDataType="org.eclipse.uml2.types.String" bookingReferenceRequired="true" bookingReferenceOrdered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false" addressDataType="org.eclipse.uml2.types.String" addressRequired="true" addressOrdered="false"
	 * @generated
	 */
	void removeGuest(String bookingReference, String firstName, String lastName, String address);

} // BookingComponent_IBookingAdministration
