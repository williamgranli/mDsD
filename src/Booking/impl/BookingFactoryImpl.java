/**
 */
package Booking.impl;

import Booking.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BookingFactoryImpl extends EFactoryImpl implements BookingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BookingFactory init() {
		try {
			BookingFactory theBookingFactory = (BookingFactory)EPackage.Registry.INSTANCE.getEFactory(BookingPackage.eNS_URI);
			if (theBookingFactory != null) {
				return theBookingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BookingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BookingPackage.BOOKING_COMPONENT: return createBookingComponent();
			case BookingPackage.BOOKING_COMPONENT_PAYMENT_DETAILS: return createBookingComponent_PaymentDetails();
			case BookingPackage.BOOKING_COMPONENT_BOOKING: return createBookingComponent_Booking();
			case BookingPackage.BOOKING_COMPONENT_ADDITIONAL_SERVICE: return createBookingComponent_AdditionalService();
			case BookingPackage.BOOKING_COMPONENT_ROOM_TYPE: return createBookingComponent_RoomType();
			case BookingPackage.BOOKING_COMPONENT_BOOKING_MANAGER: return createBookingComponent_BookingManager();
			case BookingPackage.BOOKING_COMPONENT_GUEST: return createBookingComponent_Guest();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingComponent createBookingComponent() {
		BookingComponentImpl bookingComponent = new BookingComponentImpl();
		return bookingComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingComponent_PaymentDetails createBookingComponent_PaymentDetails() {
		BookingComponent_PaymentDetailsImpl bookingComponent_PaymentDetails = new BookingComponent_PaymentDetailsImpl();
		return bookingComponent_PaymentDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingComponent_Booking createBookingComponent_Booking() {
		BookingComponent_BookingImpl bookingComponent_Booking = new BookingComponent_BookingImpl();
		return bookingComponent_Booking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingComponent_AdditionalService createBookingComponent_AdditionalService() {
		BookingComponent_AdditionalServiceImpl bookingComponent_AdditionalService = new BookingComponent_AdditionalServiceImpl();
		return bookingComponent_AdditionalService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingComponent_RoomType createBookingComponent_RoomType() {
		BookingComponent_RoomTypeImpl bookingComponent_RoomType = new BookingComponent_RoomTypeImpl();
		return bookingComponent_RoomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingComponent_BookingManager createBookingComponent_BookingManager() {
		BookingComponent_BookingManagerImpl bookingComponent_BookingManager = new BookingComponent_BookingManagerImpl();
		return bookingComponent_BookingManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingComponent_Guest createBookingComponent_Guest() {
		BookingComponent_GuestImpl bookingComponent_Guest = new BookingComponent_GuestImpl();
		return bookingComponent_Guest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingPackage getBookingPackage() {
		return (BookingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BookingPackage getPackage() {
		return BookingPackage.eINSTANCE;
	}

} //BookingFactoryImpl
