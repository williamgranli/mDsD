/**
 */
package Payment.impl;

import Payment.PaymentComponent;
import Payment.PaymentComponent_IPayment;
import Payment.PaymentComponent_PaymentCalculator;
import Payment.PaymentComponent_PaymentHistoryDB;
import Payment.PaymentComponent_PaymentManager;
import Payment.PaymentFactory;
import Payment.PaymentPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.types.impl.TypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PaymentPackageImpl extends EPackageImpl implements PaymentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentComponent_PaymentManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentComponent_PaymentCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentComponent_PaymentHistoryDBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentComponent_IPaymentEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Payment.PaymentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PaymentPackageImpl() {
		super(eNS_URI, PaymentFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PaymentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PaymentPackage init() {
		if (isInited) return (PaymentPackage)EPackage.Registry.INSTANCE.getEPackage(PaymentPackage.eNS_URI);

		// Obtain or create and register package
		PaymentPackageImpl thePaymentPackage = (PaymentPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PaymentPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PaymentPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		thePaymentPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		thePaymentPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePaymentPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PaymentPackage.eNS_URI, thePaymentPackage);
		return thePaymentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaymentComponent() {
		return paymentComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaymentComponent_PaymentManager() {
		return paymentComponent_PaymentManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentComponent_PaymentManager_PaymentDetails() {
		return (EAttribute)paymentComponent_PaymentManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPaymentComponent_PaymentManager__MakePayment__String_int_int_int_String_String_String() {
		return paymentComponent_PaymentManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPaymentComponent_PaymentManager__IsCreditCardValid__String_String_String_String_String_String() {
		return paymentComponent_PaymentManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaymentComponent_PaymentCalculator() {
		return paymentComponent_PaymentCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentComponent_PaymentCalculator_Cost() {
		return (EAttribute)paymentComponent_PaymentCalculatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentComponent_PaymentCalculator_Details() {
		return (EAttribute)paymentComponent_PaymentCalculatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPaymentComponent_PaymentCalculator__Calculate__int_EList_String_String_boolean() {
		return paymentComponent_PaymentCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPaymentComponent_PaymentCalculator__CheckLateCancellation__String_String() {
		return paymentComponent_PaymentCalculatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaymentComponent_PaymentHistoryDB() {
		return paymentComponent_PaymentHistoryDBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentComponent_PaymentHistoryDB_PaymentHistory() {
		return (EAttribute)paymentComponent_PaymentHistoryDBEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPaymentComponent_PaymentHistoryDB__CreatePaymentHistory__int_String_String() {
		return paymentComponent_PaymentHistoryDBEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPaymentComponent_PaymentHistoryDB__SearchForPayment__String() {
		return paymentComponent_PaymentHistoryDBEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaymentComponent_IPayment() {
		return paymentComponent_IPaymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPaymentComponent_IPayment__PayForBooking__int_String_String_String_String_String_String() {
		return paymentComponent_IPaymentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPaymentComponent_IPayment__ReserveFunds__int_String_String_String_String_String_String() {
		return paymentComponent_IPaymentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPaymentComponent_IPayment__UnreserveFunds__int_String_String_String_String_String_String() {
		return paymentComponent_IPaymentEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentFactory getPaymentFactory() {
		return (PaymentFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		paymentComponentEClass = createEClass(PAYMENT_COMPONENT);

		paymentComponent_PaymentManagerEClass = createEClass(PAYMENT_COMPONENT_PAYMENT_MANAGER);
		createEAttribute(paymentComponent_PaymentManagerEClass, PAYMENT_COMPONENT_PAYMENT_MANAGER__PAYMENT_DETAILS);
		createEOperation(paymentComponent_PaymentManagerEClass, PAYMENT_COMPONENT_PAYMENT_MANAGER___MAKE_PAYMENT__STRING_INT_INT_INT_STRING_STRING_STRING);
		createEOperation(paymentComponent_PaymentManagerEClass, PAYMENT_COMPONENT_PAYMENT_MANAGER___IS_CREDIT_CARD_VALID__STRING_STRING_STRING_STRING_STRING_STRING);

		paymentComponent_PaymentCalculatorEClass = createEClass(PAYMENT_COMPONENT_PAYMENT_CALCULATOR);
		createEAttribute(paymentComponent_PaymentCalculatorEClass, PAYMENT_COMPONENT_PAYMENT_CALCULATOR__COST);
		createEAttribute(paymentComponent_PaymentCalculatorEClass, PAYMENT_COMPONENT_PAYMENT_CALCULATOR__DETAILS);
		createEOperation(paymentComponent_PaymentCalculatorEClass, PAYMENT_COMPONENT_PAYMENT_CALCULATOR___CALCULATE__INT_ELIST_STRING_STRING_BOOLEAN);
		createEOperation(paymentComponent_PaymentCalculatorEClass, PAYMENT_COMPONENT_PAYMENT_CALCULATOR___CHECK_LATE_CANCELLATION__STRING_STRING);

		paymentComponent_PaymentHistoryDBEClass = createEClass(PAYMENT_COMPONENT_PAYMENT_HISTORY_DB);
		createEAttribute(paymentComponent_PaymentHistoryDBEClass, PAYMENT_COMPONENT_PAYMENT_HISTORY_DB__PAYMENT_HISTORY);
		createEOperation(paymentComponent_PaymentHistoryDBEClass, PAYMENT_COMPONENT_PAYMENT_HISTORY_DB___CREATE_PAYMENT_HISTORY__INT_STRING_STRING);
		createEOperation(paymentComponent_PaymentHistoryDBEClass, PAYMENT_COMPONENT_PAYMENT_HISTORY_DB___SEARCH_FOR_PAYMENT__STRING);

		paymentComponent_IPaymentEClass = createEClass(PAYMENT_COMPONENT_IPAYMENT);
		createEOperation(paymentComponent_IPaymentEClass, PAYMENT_COMPONENT_IPAYMENT___PAY_FOR_BOOKING__INT_STRING_STRING_STRING_STRING_STRING_STRING);
		createEOperation(paymentComponent_IPaymentEClass, PAYMENT_COMPONENT_IPAYMENT___RESERVE_FUNDS__INT_STRING_STRING_STRING_STRING_STRING_STRING);
		createEOperation(paymentComponent_IPaymentEClass, PAYMENT_COMPONENT_IPAYMENT___UNRESERVE_FUNDS__INT_STRING_STRING_STRING_STRING_STRING_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(paymentComponentEClass, PaymentComponent.class, "PaymentComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(paymentComponent_PaymentManagerEClass, PaymentComponent_PaymentManager.class, "PaymentComponent_PaymentManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaymentComponent_PaymentManager_PaymentDetails(), theTypesPackage.getString(), "paymentDetails", null, 1, 1, PaymentComponent_PaymentManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getPaymentComponent_PaymentManager__MakePayment__String_int_int_int_String_String_String(), null, "makePayment", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "amount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "expireMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "expiryYear", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getPaymentComponent_PaymentManager__IsCreditCardValid__String_String_String_String_String_String(), null, "isCreditCardValid", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "expiryMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "expiryYear", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(paymentComponent_PaymentCalculatorEClass, PaymentComponent_PaymentCalculator.class, "PaymentComponent_PaymentCalculator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaymentComponent_PaymentCalculator_Cost(), theTypesPackage.getInteger(), "cost", null, 1, 1, PaymentComponent_PaymentCalculator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPaymentComponent_PaymentCalculator_Details(), theTypesPackage.getString(), "details", null, 1, -1, PaymentComponent_PaymentCalculator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getPaymentComponent_PaymentCalculator__Calculate__int_EList_String_String_boolean(), null, "calculate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "additionalService", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "checkInDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "checkOutDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getBoolean(), "isLateCancellation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getPaymentComponent_PaymentCalculator__CheckLateCancellation__String_String(), null, "checkLateCancellation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "cancelDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "arrivalDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(paymentComponent_PaymentHistoryDBEClass, PaymentComponent_PaymentHistoryDB.class, "PaymentComponent_PaymentHistoryDB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaymentComponent_PaymentHistoryDB_PaymentHistory(), theTypesPackage.getString(), "paymentHistory", null, 1, 1, PaymentComponent_PaymentHistoryDB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getPaymentComponent_PaymentHistoryDB__CreatePaymentHistory__int_String_String(), null, "createPaymentHistory", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "amount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "paymentDateAndTime", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "customerName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getPaymentComponent_PaymentHistoryDB__SearchForPayment__String(), null, "searchForPayment", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "paymentDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(paymentComponent_IPaymentEClass, PaymentComponent_IPayment.class, "PaymentComponent_IPayment", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getPaymentComponent_IPayment__PayForBooking__int_String_String_String_String_String_String(), null, "payForBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "amount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "expiryMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "expiryYear", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getPaymentComponent_IPayment__ReserveFunds__int_String_String_String_String_String_String(), null, "reserveFunds", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "amount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "expiryMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "expiryYear", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getPaymentComponent_IPayment__UnreserveFunds__int_String_String_String_String_String_String(), null, "unreserveFunds", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "amount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "expiryMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "expiryYear", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PaymentPackageImpl
