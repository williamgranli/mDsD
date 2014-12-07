/**
 */
package Booking.util;

import Booking.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Booking.BookingPackage
 * @generated
 */
public class BookingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BookingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BookingPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingSwitch<Adapter> modelSwitch =
		new BookingSwitch<Adapter>() {
			@Override
			public Adapter caseBookingComponent(BookingComponent object) {
				return createBookingComponentAdapter();
			}
			@Override
			public Adapter caseBookingComponent_PaymentDetails(BookingComponent_PaymentDetails object) {
				return createBookingComponent_PaymentDetailsAdapter();
			}
			@Override
			public Adapter caseBookingComponent_Booking(BookingComponent_Booking object) {
				return createBookingComponent_BookingAdapter();
			}
			@Override
			public Adapter caseBookingComponent_AdditionalService(BookingComponent_AdditionalService object) {
				return createBookingComponent_AdditionalServiceAdapter();
			}
			@Override
			public Adapter caseBookingComponent_RoomType(BookingComponent_RoomType object) {
				return createBookingComponent_RoomTypeAdapter();
			}
			@Override
			public Adapter caseBookingComponent_BookingManager(BookingComponent_BookingManager object) {
				return createBookingComponent_BookingManagerAdapter();
			}
			@Override
			public Adapter caseBookingComponent_IBooking(BookingComponent_IBooking object) {
				return createBookingComponent_IBookingAdapter();
			}
			@Override
			public Adapter caseBookingComponent_Guest(BookingComponent_Guest object) {
				return createBookingComponent_GuestAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Booking.BookingComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Booking.BookingComponent
	 * @generated
	 */
	public Adapter createBookingComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Booking.BookingComponent_PaymentDetails <em>Component Payment Details</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Booking.BookingComponent_PaymentDetails
	 * @generated
	 */
	public Adapter createBookingComponent_PaymentDetailsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Booking.BookingComponent_Booking <em>Component Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Booking.BookingComponent_Booking
	 * @generated
	 */
	public Adapter createBookingComponent_BookingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Booking.BookingComponent_AdditionalService <em>Component Additional Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Booking.BookingComponent_AdditionalService
	 * @generated
	 */
	public Adapter createBookingComponent_AdditionalServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Booking.BookingComponent_RoomType <em>Component Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Booking.BookingComponent_RoomType
	 * @generated
	 */
	public Adapter createBookingComponent_RoomTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Booking.BookingComponent_BookingManager <em>Component Booking Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Booking.BookingComponent_BookingManager
	 * @generated
	 */
	public Adapter createBookingComponent_BookingManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Booking.BookingComponent_IBooking <em>Component IBooking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Booking.BookingComponent_IBooking
	 * @generated
	 */
	public Adapter createBookingComponent_IBookingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Booking.BookingComponent_Guest <em>Component Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Booking.BookingComponent_Guest
	 * @generated
	 */
	public Adapter createBookingComponent_GuestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BookingAdapterFactory
