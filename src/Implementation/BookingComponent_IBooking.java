/**
 */
package Implementation;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking Component IBooking</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Implementation.ImplementationPackage#getBookingComponent_IBooking()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface BookingComponent_IBooking extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false" priceDataType="org.eclipse.uml2.types.Integer" priceRequired="true" priceOrdered="false" arrivalDateRequired="true" arrivalDateOrdered="false" departureDateRequired="true" departureDateOrdered="false"
	 * @generated
	 */
	void searchRooms(String roomType, int price, Date arrivalDate, Date departureDate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false" arrivalDateRequired="true" arrivalDateOrdered="false" departureDateRequired="true" departureDateOrdered="false" customerSSNDataType="org.eclipse.uml2.types.String" customerSSNRequired="true" customerSSNOrdered="false" customerFirstNameDataType="org.eclipse.uml2.types.String" customerFirstNameRequired="true" customerFirstNameOrdered="false" customerLastNameDataType="org.eclipse.uml2.types.String" customerLastNameRequired="true" customerLastNameOrdered="false" customerAddressDataType="org.eclipse.uml2.types.String" customerAddressRequired="true" customerAddressOrdered="false" customerEmailDataType="org.eclipse.uml2.types.String" customerEmailRequired="true" customerEmailOrdered="false" ccNumberDataType="org.eclipse.uml2.types.String" ccNumberRequired="true" ccNumberOrdered="false" ccvDataType="org.eclipse.uml2.types.String" ccvRequired="true" ccvOrdered="false" expiryMonthDataType="org.eclipse.uml2.types.String" expiryMonthRequired="true" expiryMonthOrdered="false" expiryYearDataType="org.eclipse.uml2.types.String" expiryYearRequired="true" expiryYearOrdered="false"
	 * @generated
	 */
	void makeBooking(String roomType, Date arrivalDate, Date departureDate, String customerSSN, String customerFirstName, String customerLastName, String customerAddress, String customerEmail, String ccNumber, String ccv, String expiryMonth, String expiryYear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingReferenceDataType="org.eclipse.uml2.types.String" bookingReferenceRequired="true" bookingReferenceOrdered="false" roomIdDataType="org.eclipse.uml2.types.String" roomIdRequired="true" roomIdOrdered="false"
	 * @generated
	 */
	void addRoom(String bookingReference, String roomId);

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
	 * @model bookingReferenceDataType="org.eclipse.uml2.types.String" bookingReferenceRequired="true" bookingReferenceOrdered="false" roomIdDataType="org.eclipse.uml2.types.String" roomIdRequired="true" roomIdOrdered="false" arrivalDateRequired="true" arrivalDateOrdered="false" departureDateRequired="true" departureDateOrdered="false" customerIdDataType="org.eclipse.uml2.types.String" customerIdRequired="true" customerIdOrdered="false"
	 * @generated
	 */
	void editBooking(String bookingReference, String roomId, Date arrivalDate, Date departureDate, String customerId);

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
	 * @model bookingReferenceDataType="org.eclipse.uml2.types.String" bookingReferenceRequired="true" bookingReferenceOrdered="false" additionalServiceNameDataType="org.eclipse.uml2.types.String" additionalServiceNameRequired="true" additionalServiceNameOrdered="false"
	 * @generated
	 */
	void addAdditionalService(String bookingReference, String additionalServiceName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingReferenceDataType="org.eclipse.uml2.types.String" bookingReferenceRequired="true" bookingReferenceOrdered="false" roomIdDataType="org.eclipse.uml2.types.String" roomIdRequired="true" roomIdOrdered="false"
	 * @generated
	 */
	void removeRoom(String bookingReference, String roomId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingReferenceDataType="org.eclipse.uml2.types.String" bookingReferenceRequired="true" bookingReferenceOrdered="false" additionalServiceNameDataType="org.eclipse.uml2.types.String" additionalServiceNameRequired="true" additionalServiceNameOrdered="false"
	 * @generated
	 */
	void removeAddionalService(String bookingReference, String additionalServiceName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingReferenceDataType="org.eclipse.uml2.types.String" bookingReferenceRequired="true" bookingReferenceOrdered="false"
	 * @generated
	 */
	void getBookingInfo(String bookingReference);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingReferenceDataType="org.eclipse.uml2.types.String" bookingReferenceRequired="true" bookingReferenceOrdered="false"
	 * @generated
	 */
	void generateReceipt(String bookingReference);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" referenceNumberDataType="org.eclipse.uml2.types.String" referenceNumberRequired="true" referenceNumberOrdered="false"
	 * @generated
	 */
	String validateReferenceNumber(String referenceNumber);

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
	 * @model bookingReferenceDataType="org.eclipse.uml2.types.String" bookingReferenceRequired="true" bookingReferenceOrdered="false"
	 * @generated
	 */
	void searchForBooking(String bookingReference);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false"
	 * @generated
	 */
	void addGuestToBooking(String firstName);

} // BookingComponent_IBooking
