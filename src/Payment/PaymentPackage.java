/**
 */
package Payment;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Payment.PaymentFactory
 * @model kind="package"
 * @generated
 */
public interface PaymentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Payment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///Payment.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Payment";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PaymentPackage eINSTANCE = Payment.impl.PaymentPackageImpl.init();

	/**
	 * The meta object id for the '{@link Payment.impl.PaymentComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Payment.impl.PaymentComponentImpl
	 * @see Payment.impl.PaymentPackageImpl#getPaymentComponent()
	 * @generated
	 */
	int PAYMENT_COMPONENT = 0;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Payment.impl.PaymentComponent_PaymentManagerImpl <em>Component Payment Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Payment.impl.PaymentComponent_PaymentManagerImpl
	 * @see Payment.impl.PaymentPackageImpl#getPaymentComponent_PaymentManager()
	 * @generated
	 */
	int PAYMENT_COMPONENT_PAYMENT_MANAGER = 1;

	/**
	 * The feature id for the '<em><b>Payment Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_MANAGER__PAYMENT_DETAILS = 0;

	/**
	 * The number of structural features of the '<em>Component Payment Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_MANAGER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Make Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_MANAGER___MAKE_PAYMENT__STRING_INT_INT_INT_STRING_STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Is Credit Card Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_MANAGER___IS_CREDIT_CARD_VALID__STRING_STRING_STRING_STRING_STRING_STRING = 1;

	/**
	 * The number of operations of the '<em>Component Payment Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_MANAGER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link Payment.impl.PaymentComponent_PaymentCalculatorImpl <em>Component Payment Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Payment.impl.PaymentComponent_PaymentCalculatorImpl
	 * @see Payment.impl.PaymentPackageImpl#getPaymentComponent_PaymentCalculator()
	 * @generated
	 */
	int PAYMENT_COMPONENT_PAYMENT_CALCULATOR = 2;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_CALCULATOR__COST = 0;

	/**
	 * The feature id for the '<em><b>Details</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_CALCULATOR__DETAILS = 1;

	/**
	 * The number of structural features of the '<em>Component Payment Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_CALCULATOR_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_CALCULATOR___CALCULATE__INT_ELIST_STRING_STRING_BOOLEAN = 0;

	/**
	 * The operation id for the '<em>Check Late Cancellation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_CALCULATOR___CHECK_LATE_CANCELLATION__STRING_STRING = 1;

	/**
	 * The number of operations of the '<em>Component Payment Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_CALCULATOR_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link Payment.impl.PaymentComponent_PaymentHistoryDBImpl <em>Component Payment History DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Payment.impl.PaymentComponent_PaymentHistoryDBImpl
	 * @see Payment.impl.PaymentPackageImpl#getPaymentComponent_PaymentHistoryDB()
	 * @generated
	 */
	int PAYMENT_COMPONENT_PAYMENT_HISTORY_DB = 3;

	/**
	 * The feature id for the '<em><b>Payment History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_HISTORY_DB__PAYMENT_HISTORY = 0;

	/**
	 * The number of structural features of the '<em>Component Payment History DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_HISTORY_DB_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Create Payment History</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_HISTORY_DB___CREATE_PAYMENT_HISTORY__INT_STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Search For Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_HISTORY_DB___SEARCH_FOR_PAYMENT__STRING = 1;

	/**
	 * The number of operations of the '<em>Component Payment History DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_HISTORY_DB_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link Payment.PaymentComponent_IPayment <em>Component IPayment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Payment.PaymentComponent_IPayment
	 * @see Payment.impl.PaymentPackageImpl#getPaymentComponent_IPayment()
	 * @generated
	 */
	int PAYMENT_COMPONENT_IPAYMENT = 4;

	/**
	 * The number of structural features of the '<em>Component IPayment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_IPAYMENT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Pay For Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_IPAYMENT___PAY_FOR_BOOKING__INT_STRING_STRING_STRING_STRING_STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Reserve Funds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_IPAYMENT___RESERVE_FUNDS__INT_STRING_STRING_STRING_STRING_STRING_STRING = 1;

	/**
	 * The operation id for the '<em>Unreserve Funds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_IPAYMENT___UNRESERVE_FUNDS__INT_STRING_STRING_STRING_STRING_STRING_STRING = 2;

	/**
	 * The number of operations of the '<em>Component IPayment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_IPAYMENT_OPERATION_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link Payment.PaymentComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see Payment.PaymentComponent
	 * @generated
	 */
	EClass getPaymentComponent();

	/**
	 * Returns the meta object for class '{@link Payment.PaymentComponent_PaymentManager <em>Component Payment Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Payment Manager</em>'.
	 * @see Payment.PaymentComponent_PaymentManager
	 * @generated
	 */
	EClass getPaymentComponent_PaymentManager();

	/**
	 * Returns the meta object for the attribute '{@link Payment.PaymentComponent_PaymentManager#getPaymentDetails <em>Payment Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Details</em>'.
	 * @see Payment.PaymentComponent_PaymentManager#getPaymentDetails()
	 * @see #getPaymentComponent_PaymentManager()
	 * @generated
	 */
	EAttribute getPaymentComponent_PaymentManager_PaymentDetails();

	/**
	 * Returns the meta object for the '{@link Payment.PaymentComponent_PaymentManager#makePayment(java.lang.String, int, int, int, java.lang.String, java.lang.String, java.lang.String) <em>Make Payment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Payment</em>' operation.
	 * @see Payment.PaymentComponent_PaymentManager#makePayment(java.lang.String, int, int, int, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getPaymentComponent_PaymentManager__MakePayment__String_int_int_int_String_String_String();

	/**
	 * Returns the meta object for the '{@link Payment.PaymentComponent_PaymentManager#isCreditCardValid(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Is Credit Card Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Credit Card Valid</em>' operation.
	 * @see Payment.PaymentComponent_PaymentManager#isCreditCardValid(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getPaymentComponent_PaymentManager__IsCreditCardValid__String_String_String_String_String_String();

	/**
	 * Returns the meta object for class '{@link Payment.PaymentComponent_PaymentCalculator <em>Component Payment Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Payment Calculator</em>'.
	 * @see Payment.PaymentComponent_PaymentCalculator
	 * @generated
	 */
	EClass getPaymentComponent_PaymentCalculator();

	/**
	 * Returns the meta object for the attribute '{@link Payment.PaymentComponent_PaymentCalculator#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see Payment.PaymentComponent_PaymentCalculator#getCost()
	 * @see #getPaymentComponent_PaymentCalculator()
	 * @generated
	 */
	EAttribute getPaymentComponent_PaymentCalculator_Cost();

	/**
	 * Returns the meta object for the attribute list '{@link Payment.PaymentComponent_PaymentCalculator#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Details</em>'.
	 * @see Payment.PaymentComponent_PaymentCalculator#getDetails()
	 * @see #getPaymentComponent_PaymentCalculator()
	 * @generated
	 */
	EAttribute getPaymentComponent_PaymentCalculator_Details();

	/**
	 * Returns the meta object for the '{@link Payment.PaymentComponent_PaymentCalculator#calculate(int, org.eclipse.emf.common.util.EList, java.lang.String, java.lang.String, boolean) <em>Calculate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate</em>' operation.
	 * @see Payment.PaymentComponent_PaymentCalculator#calculate(int, org.eclipse.emf.common.util.EList, java.lang.String, java.lang.String, boolean)
	 * @generated
	 */
	EOperation getPaymentComponent_PaymentCalculator__Calculate__int_EList_String_String_boolean();

	/**
	 * Returns the meta object for the '{@link Payment.PaymentComponent_PaymentCalculator#checkLateCancellation(java.lang.String, java.lang.String) <em>Check Late Cancellation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Late Cancellation</em>' operation.
	 * @see Payment.PaymentComponent_PaymentCalculator#checkLateCancellation(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getPaymentComponent_PaymentCalculator__CheckLateCancellation__String_String();

	/**
	 * Returns the meta object for class '{@link Payment.PaymentComponent_PaymentHistoryDB <em>Component Payment History DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Payment History DB</em>'.
	 * @see Payment.PaymentComponent_PaymentHistoryDB
	 * @generated
	 */
	EClass getPaymentComponent_PaymentHistoryDB();

	/**
	 * Returns the meta object for the attribute '{@link Payment.PaymentComponent_PaymentHistoryDB#getPaymentHistory <em>Payment History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment History</em>'.
	 * @see Payment.PaymentComponent_PaymentHistoryDB#getPaymentHistory()
	 * @see #getPaymentComponent_PaymentHistoryDB()
	 * @generated
	 */
	EAttribute getPaymentComponent_PaymentHistoryDB_PaymentHistory();

	/**
	 * Returns the meta object for the '{@link Payment.PaymentComponent_PaymentHistoryDB#createPaymentHistory(int, java.lang.String, java.lang.String) <em>Create Payment History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Payment History</em>' operation.
	 * @see Payment.PaymentComponent_PaymentHistoryDB#createPaymentHistory(int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getPaymentComponent_PaymentHistoryDB__CreatePaymentHistory__int_String_String();

	/**
	 * Returns the meta object for the '{@link Payment.PaymentComponent_PaymentHistoryDB#searchForPayment(java.lang.String) <em>Search For Payment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search For Payment</em>' operation.
	 * @see Payment.PaymentComponent_PaymentHistoryDB#searchForPayment(java.lang.String)
	 * @generated
	 */
	EOperation getPaymentComponent_PaymentHistoryDB__SearchForPayment__String();

	/**
	 * Returns the meta object for class '{@link Payment.PaymentComponent_IPayment <em>Component IPayment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component IPayment</em>'.
	 * @see Payment.PaymentComponent_IPayment
	 * @generated
	 */
	EClass getPaymentComponent_IPayment();

	/**
	 * Returns the meta object for the '{@link Payment.PaymentComponent_IPayment#payForBooking(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Pay For Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pay For Booking</em>' operation.
	 * @see Payment.PaymentComponent_IPayment#payForBooking(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getPaymentComponent_IPayment__PayForBooking__int_String_String_String_String_String_String();

	/**
	 * Returns the meta object for the '{@link Payment.PaymentComponent_IPayment#reserveFunds(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Reserve Funds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reserve Funds</em>' operation.
	 * @see Payment.PaymentComponent_IPayment#reserveFunds(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getPaymentComponent_IPayment__ReserveFunds__int_String_String_String_String_String_String();

	/**
	 * Returns the meta object for the '{@link Payment.PaymentComponent_IPayment#unreserveFunds(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Unreserve Funds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unreserve Funds</em>' operation.
	 * @see Payment.PaymentComponent_IPayment#unreserveFunds(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getPaymentComponent_IPayment__UnreserveFunds__int_String_String_String_String_String_String();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PaymentFactory getPaymentFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Payment.impl.PaymentComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Payment.impl.PaymentComponentImpl
		 * @see Payment.impl.PaymentPackageImpl#getPaymentComponent()
		 * @generated
		 */
		EClass PAYMENT_COMPONENT = eINSTANCE.getPaymentComponent();

		/**
		 * The meta object literal for the '{@link Payment.impl.PaymentComponent_PaymentManagerImpl <em>Component Payment Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Payment.impl.PaymentComponent_PaymentManagerImpl
		 * @see Payment.impl.PaymentPackageImpl#getPaymentComponent_PaymentManager()
		 * @generated
		 */
		EClass PAYMENT_COMPONENT_PAYMENT_MANAGER = eINSTANCE.getPaymentComponent_PaymentManager();

		/**
		 * The meta object literal for the '<em><b>Payment Details</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_COMPONENT_PAYMENT_MANAGER__PAYMENT_DETAILS = eINSTANCE.getPaymentComponent_PaymentManager_PaymentDetails();

		/**
		 * The meta object literal for the '<em><b>Make Payment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT_COMPONENT_PAYMENT_MANAGER___MAKE_PAYMENT__STRING_INT_INT_INT_STRING_STRING_STRING = eINSTANCE.getPaymentComponent_PaymentManager__MakePayment__String_int_int_int_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Is Credit Card Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT_COMPONENT_PAYMENT_MANAGER___IS_CREDIT_CARD_VALID__STRING_STRING_STRING_STRING_STRING_STRING = eINSTANCE.getPaymentComponent_PaymentManager__IsCreditCardValid__String_String_String_String_String_String();

		/**
		 * The meta object literal for the '{@link Payment.impl.PaymentComponent_PaymentCalculatorImpl <em>Component Payment Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Payment.impl.PaymentComponent_PaymentCalculatorImpl
		 * @see Payment.impl.PaymentPackageImpl#getPaymentComponent_PaymentCalculator()
		 * @generated
		 */
		EClass PAYMENT_COMPONENT_PAYMENT_CALCULATOR = eINSTANCE.getPaymentComponent_PaymentCalculator();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_COMPONENT_PAYMENT_CALCULATOR__COST = eINSTANCE.getPaymentComponent_PaymentCalculator_Cost();

		/**
		 * The meta object literal for the '<em><b>Details</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_COMPONENT_PAYMENT_CALCULATOR__DETAILS = eINSTANCE.getPaymentComponent_PaymentCalculator_Details();

		/**
		 * The meta object literal for the '<em><b>Calculate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT_COMPONENT_PAYMENT_CALCULATOR___CALCULATE__INT_ELIST_STRING_STRING_BOOLEAN = eINSTANCE.getPaymentComponent_PaymentCalculator__Calculate__int_EList_String_String_boolean();

		/**
		 * The meta object literal for the '<em><b>Check Late Cancellation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT_COMPONENT_PAYMENT_CALCULATOR___CHECK_LATE_CANCELLATION__STRING_STRING = eINSTANCE.getPaymentComponent_PaymentCalculator__CheckLateCancellation__String_String();

		/**
		 * The meta object literal for the '{@link Payment.impl.PaymentComponent_PaymentHistoryDBImpl <em>Component Payment History DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Payment.impl.PaymentComponent_PaymentHistoryDBImpl
		 * @see Payment.impl.PaymentPackageImpl#getPaymentComponent_PaymentHistoryDB()
		 * @generated
		 */
		EClass PAYMENT_COMPONENT_PAYMENT_HISTORY_DB = eINSTANCE.getPaymentComponent_PaymentHistoryDB();

		/**
		 * The meta object literal for the '<em><b>Payment History</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_COMPONENT_PAYMENT_HISTORY_DB__PAYMENT_HISTORY = eINSTANCE.getPaymentComponent_PaymentHistoryDB_PaymentHistory();

		/**
		 * The meta object literal for the '<em><b>Create Payment History</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT_COMPONENT_PAYMENT_HISTORY_DB___CREATE_PAYMENT_HISTORY__INT_STRING_STRING = eINSTANCE.getPaymentComponent_PaymentHistoryDB__CreatePaymentHistory__int_String_String();

		/**
		 * The meta object literal for the '<em><b>Search For Payment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT_COMPONENT_PAYMENT_HISTORY_DB___SEARCH_FOR_PAYMENT__STRING = eINSTANCE.getPaymentComponent_PaymentHistoryDB__SearchForPayment__String();

		/**
		 * The meta object literal for the '{@link Payment.PaymentComponent_IPayment <em>Component IPayment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Payment.PaymentComponent_IPayment
		 * @see Payment.impl.PaymentPackageImpl#getPaymentComponent_IPayment()
		 * @generated
		 */
		EClass PAYMENT_COMPONENT_IPAYMENT = eINSTANCE.getPaymentComponent_IPayment();

		/**
		 * The meta object literal for the '<em><b>Pay For Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT_COMPONENT_IPAYMENT___PAY_FOR_BOOKING__INT_STRING_STRING_STRING_STRING_STRING_STRING = eINSTANCE.getPaymentComponent_IPayment__PayForBooking__int_String_String_String_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Reserve Funds</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT_COMPONENT_IPAYMENT___RESERVE_FUNDS__INT_STRING_STRING_STRING_STRING_STRING_STRING = eINSTANCE.getPaymentComponent_IPayment__ReserveFunds__int_String_String_String_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Unreserve Funds</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT_COMPONENT_IPAYMENT___UNRESERVE_FUNDS__INT_STRING_STRING_STRING_STRING_STRING_STRING = eINSTANCE.getPaymentComponent_IPayment__UnreserveFunds__int_String_String_String_String_String_String();

	}

} //PaymentPackage
