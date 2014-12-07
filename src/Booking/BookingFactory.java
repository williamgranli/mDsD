/**
 */
package Booking;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Booking.BookingPackage
 * @generated
 */
public interface BookingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BookingFactory eINSTANCE = Booking.impl.BookingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	BookingComponent createBookingComponent();

	/**
	 * Returns a new object of class '<em>Component Payment Details</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Payment Details</em>'.
	 * @generated
	 */
	BookingComponent_PaymentDetails createBookingComponent_PaymentDetails();

	/**
	 * Returns a new object of class '<em>Component Booking</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Booking</em>'.
	 * @generated
	 */
	BookingComponent_Booking createBookingComponent_Booking();

	/**
	 * Returns a new object of class '<em>Component Additional Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Additional Service</em>'.
	 * @generated
	 */
	BookingComponent_AdditionalService createBookingComponent_AdditionalService();

	/**
	 * Returns a new object of class '<em>Component Room Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Room Type</em>'.
	 * @generated
	 */
	BookingComponent_RoomType createBookingComponent_RoomType();

	/**
	 * Returns a new object of class '<em>Component Booking Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Booking Manager</em>'.
	 * @generated
	 */
	BookingComponent_BookingManager createBookingComponent_BookingManager();

	/**
	 * Returns a new object of class '<em>Component Guest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Guest</em>'.
	 * @generated
	 */
	BookingComponent_Guest createBookingComponent_Guest();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BookingPackage getBookingPackage();

} //BookingFactory
