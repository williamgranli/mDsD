/**
 */
package Payment.impl;

import Payment.*;

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
public class PaymentFactoryImpl extends EFactoryImpl implements PaymentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PaymentFactory init() {
		try {
			PaymentFactory thePaymentFactory = (PaymentFactory)EPackage.Registry.INSTANCE.getEFactory(PaymentPackage.eNS_URI);
			if (thePaymentFactory != null) {
				return thePaymentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PaymentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentFactoryImpl() {
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
			case PaymentPackage.PAYMENT_COMPONENT: return createPaymentComponent();
			case PaymentPackage.PAYMENT_COMPONENT_PAYMENT_MANAGER: return createPaymentComponent_PaymentManager();
			case PaymentPackage.PAYMENT_COMPONENT_PAYMENT_CALCULATOR: return createPaymentComponent_PaymentCalculator();
			case PaymentPackage.PAYMENT_COMPONENT_PAYMENT_HISTORY_DB: return createPaymentComponent_PaymentHistoryDB();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentComponent createPaymentComponent() {
		PaymentComponentImpl paymentComponent = new PaymentComponentImpl();
		return paymentComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentComponent_PaymentManager createPaymentComponent_PaymentManager() {
		PaymentComponent_PaymentManagerImpl paymentComponent_PaymentManager = new PaymentComponent_PaymentManagerImpl();
		return paymentComponent_PaymentManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentComponent_PaymentCalculator createPaymentComponent_PaymentCalculator() {
		PaymentComponent_PaymentCalculatorImpl paymentComponent_PaymentCalculator = new PaymentComponent_PaymentCalculatorImpl();
		return paymentComponent_PaymentCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentComponent_PaymentHistoryDB createPaymentComponent_PaymentHistoryDB() {
		PaymentComponent_PaymentHistoryDBImpl paymentComponent_PaymentHistoryDB = new PaymentComponent_PaymentHistoryDBImpl();
		return paymentComponent_PaymentHistoryDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentPackage getPaymentPackage() {
		return (PaymentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PaymentPackage getPackage() {
		return PaymentPackage.eINSTANCE;
	}

} //PaymentFactoryImpl
