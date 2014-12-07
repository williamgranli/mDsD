/**
 */
package Booking.util;

import Booking.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Booking.BookingPackage
 * @generated
 */
public class BookingSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BookingPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingSwitch() {
		if (modelPackage == null) {
			modelPackage = BookingPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BookingPackage.BOOKING_COMPONENT: {
				BookingComponent bookingComponent = (BookingComponent)theEObject;
				T result = caseBookingComponent(bookingComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookingPackage.BOOKING_COMPONENT_PAYMENT_DETAILS: {
				BookingComponent_PaymentDetails bookingComponent_PaymentDetails = (BookingComponent_PaymentDetails)theEObject;
				T result = caseBookingComponent_PaymentDetails(bookingComponent_PaymentDetails);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookingPackage.BOOKING_COMPONENT_BOOKING: {
				BookingComponent_Booking bookingComponent_Booking = (BookingComponent_Booking)theEObject;
				T result = caseBookingComponent_Booking(bookingComponent_Booking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookingPackage.BOOKING_COMPONENT_ADDITIONAL_SERVICE: {
				BookingComponent_AdditionalService bookingComponent_AdditionalService = (BookingComponent_AdditionalService)theEObject;
				T result = caseBookingComponent_AdditionalService(bookingComponent_AdditionalService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookingPackage.BOOKING_COMPONENT_ROOM_TYPE: {
				BookingComponent_RoomType bookingComponent_RoomType = (BookingComponent_RoomType)theEObject;
				T result = caseBookingComponent_RoomType(bookingComponent_RoomType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookingPackage.BOOKING_COMPONENT_BOOKING_MANAGER: {
				BookingComponent_BookingManager bookingComponent_BookingManager = (BookingComponent_BookingManager)theEObject;
				T result = caseBookingComponent_BookingManager(bookingComponent_BookingManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookingPackage.BOOKING_COMPONENT_IBOOKING: {
				BookingComponent_IBooking bookingComponent_IBooking = (BookingComponent_IBooking)theEObject;
				T result = caseBookingComponent_IBooking(bookingComponent_IBooking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookingPackage.BOOKING_COMPONENT_GUEST: {
				BookingComponent_Guest bookingComponent_Guest = (BookingComponent_Guest)theEObject;
				T result = caseBookingComponent_Guest(bookingComponent_Guest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookingComponent(BookingComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Payment Details</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Payment Details</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookingComponent_PaymentDetails(BookingComponent_PaymentDetails object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Booking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Booking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookingComponent_Booking(BookingComponent_Booking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Additional Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Additional Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookingComponent_AdditionalService(BookingComponent_AdditionalService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Room Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Room Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookingComponent_RoomType(BookingComponent_RoomType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Booking Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Booking Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookingComponent_BookingManager(BookingComponent_BookingManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component IBooking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component IBooking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookingComponent_IBooking(BookingComponent_IBooking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Guest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Guest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookingComponent_Guest(BookingComponent_Guest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BookingSwitch
