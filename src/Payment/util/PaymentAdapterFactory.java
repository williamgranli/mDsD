/**
 */
package Payment.util;

import Payment.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Payment.PaymentPackage
 * @generated
 */
public class PaymentAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PaymentPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PaymentPackage.eINSTANCE;
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
	protected PaymentSwitch<Adapter> modelSwitch =
		new PaymentSwitch<Adapter>() {
			@Override
			public Adapter casePaymentComponent(PaymentComponent object) {
				return createPaymentComponentAdapter();
			}
			@Override
			public Adapter casePaymentComponent_PaymentManager(PaymentComponent_PaymentManager object) {
				return createPaymentComponent_PaymentManagerAdapter();
			}
			@Override
			public Adapter casePaymentComponent_PaymentCalculator(PaymentComponent_PaymentCalculator object) {
				return createPaymentComponent_PaymentCalculatorAdapter();
			}
			@Override
			public Adapter casePaymentComponent_PaymentHistoryDB(PaymentComponent_PaymentHistoryDB object) {
				return createPaymentComponent_PaymentHistoryDBAdapter();
			}
			@Override
			public Adapter casePaymentComponent_IPayment(PaymentComponent_IPayment object) {
				return createPaymentComponent_IPaymentAdapter();
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
	 * Creates a new adapter for an object of class '{@link Payment.PaymentComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Payment.PaymentComponent
	 * @generated
	 */
	public Adapter createPaymentComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Payment.PaymentComponent_PaymentManager <em>Component Payment Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Payment.PaymentComponent_PaymentManager
	 * @generated
	 */
	public Adapter createPaymentComponent_PaymentManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Payment.PaymentComponent_PaymentCalculator <em>Component Payment Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Payment.PaymentComponent_PaymentCalculator
	 * @generated
	 */
	public Adapter createPaymentComponent_PaymentCalculatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Payment.PaymentComponent_PaymentHistoryDB <em>Component Payment History DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Payment.PaymentComponent_PaymentHistoryDB
	 * @generated
	 */
	public Adapter createPaymentComponent_PaymentHistoryDBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Payment.PaymentComponent_IPayment <em>Component IPayment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Payment.PaymentComponent_IPayment
	 * @generated
	 */
	public Adapter createPaymentComponent_IPaymentAdapter() {
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

} //PaymentAdapterFactory
