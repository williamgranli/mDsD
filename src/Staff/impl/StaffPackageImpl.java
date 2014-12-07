/**
 */
package Staff.impl;

import Staff.StaffComponent;
import Staff.StaffComponent_AccountManager;
import Staff.StaffComponent_Employee;
import Staff.StaffComponent_IAccountAdministration;
import Staff.StaffComponent_IAuthentication;
import Staff.StaffFactory;
import Staff.StaffPackage;

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
public class StaffPackageImpl extends EPackageImpl implements StaffPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staffComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staffComponent_AccountManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staffComponent_IAuthenticationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staffComponent_IAccountAdministrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staffComponent_EmployeeEClass = null;

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
	 * @see Staff.StaffPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StaffPackageImpl() {
		super(eNS_URI, StaffFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StaffPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StaffPackage init() {
		if (isInited) return (StaffPackage)EPackage.Registry.INSTANCE.getEPackage(StaffPackage.eNS_URI);

		// Obtain or create and register package
		StaffPackageImpl theStaffPackage = (StaffPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StaffPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StaffPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theStaffPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theStaffPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStaffPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StaffPackage.eNS_URI, theStaffPackage);
		return theStaffPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaffComponent() {
		return staffComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaffComponent_AccountManager() {
		return staffComponent_AccountManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaffComponent_AccountManager__FindAccount__String() {
		return staffComponent_AccountManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaffComponent_IAuthentication() {
		return staffComponent_IAuthenticationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaffComponent_IAuthentication__LogIn__String_String() {
		return staffComponent_IAuthenticationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaffComponent_IAuthentication__LogOut__String() {
		return staffComponent_IAuthenticationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaffComponent_IAuthentication__IsLoggedIn__String() {
		return staffComponent_IAuthenticationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaffComponent_IAccountAdministration() {
		return staffComponent_IAccountAdministrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaffComponent_IAccountAdministration__CreateAccount__String_String_String_String_String() {
		return staffComponent_IAccountAdministrationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaffComponent_IAccountAdministration__EditAccountDetails__String() {
		return staffComponent_IAccountAdministrationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaffComponent_IAccountAdministration__RemoveAccount__String() {
		return staffComponent_IAccountAdministrationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaffComponent_Employee() {
		return staffComponent_EmployeeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaffComponent_Employee_Id() {
		return (EAttribute)staffComponent_EmployeeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaffComponent_Employee_Ssn() {
		return (EAttribute)staffComponent_EmployeeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaffComponent_Employee_Name() {
		return (EAttribute)staffComponent_EmployeeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaffComponent_Employee_Email() {
		return (EAttribute)staffComponent_EmployeeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaffComponent_Employee_Phone() {
		return (EAttribute)staffComponent_EmployeeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaffComponent_Employee_Password() {
		return (EAttribute)staffComponent_EmployeeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaffComponent_Employee__Employee__String_String_String_String() {
		return staffComponent_EmployeeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaffComponent_Employee__Employee() {
		return staffComponent_EmployeeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaffComponent_Employee__GetEmployeeInfo__String() {
		return staffComponent_EmployeeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffFactory getStaffFactory() {
		return (StaffFactory)getEFactoryInstance();
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
		staffComponentEClass = createEClass(STAFF_COMPONENT);

		staffComponent_AccountManagerEClass = createEClass(STAFF_COMPONENT_ACCOUNT_MANAGER);
		createEOperation(staffComponent_AccountManagerEClass, STAFF_COMPONENT_ACCOUNT_MANAGER___FIND_ACCOUNT__STRING);

		staffComponent_IAuthenticationEClass = createEClass(STAFF_COMPONENT_IAUTHENTICATION);
		createEOperation(staffComponent_IAuthenticationEClass, STAFF_COMPONENT_IAUTHENTICATION___LOG_IN__STRING_STRING);
		createEOperation(staffComponent_IAuthenticationEClass, STAFF_COMPONENT_IAUTHENTICATION___LOG_OUT__STRING);
		createEOperation(staffComponent_IAuthenticationEClass, STAFF_COMPONENT_IAUTHENTICATION___IS_LOGGED_IN__STRING);

		staffComponent_IAccountAdministrationEClass = createEClass(STAFF_COMPONENT_IACCOUNT_ADMINISTRATION);
		createEOperation(staffComponent_IAccountAdministrationEClass, STAFF_COMPONENT_IACCOUNT_ADMINISTRATION___CREATE_ACCOUNT__STRING_STRING_STRING_STRING_STRING);
		createEOperation(staffComponent_IAccountAdministrationEClass, STAFF_COMPONENT_IACCOUNT_ADMINISTRATION___EDIT_ACCOUNT_DETAILS__STRING);
		createEOperation(staffComponent_IAccountAdministrationEClass, STAFF_COMPONENT_IACCOUNT_ADMINISTRATION___REMOVE_ACCOUNT__STRING);

		staffComponent_EmployeeEClass = createEClass(STAFF_COMPONENT_EMPLOYEE);
		createEAttribute(staffComponent_EmployeeEClass, STAFF_COMPONENT_EMPLOYEE__ID);
		createEAttribute(staffComponent_EmployeeEClass, STAFF_COMPONENT_EMPLOYEE__SSN);
		createEAttribute(staffComponent_EmployeeEClass, STAFF_COMPONENT_EMPLOYEE__NAME);
		createEAttribute(staffComponent_EmployeeEClass, STAFF_COMPONENT_EMPLOYEE__EMAIL);
		createEAttribute(staffComponent_EmployeeEClass, STAFF_COMPONENT_EMPLOYEE__PHONE);
		createEAttribute(staffComponent_EmployeeEClass, STAFF_COMPONENT_EMPLOYEE__PASSWORD);
		createEOperation(staffComponent_EmployeeEClass, STAFF_COMPONENT_EMPLOYEE___EMPLOYEE__STRING_STRING_STRING_STRING);
		createEOperation(staffComponent_EmployeeEClass, STAFF_COMPONENT_EMPLOYEE___EMPLOYEE);
		createEOperation(staffComponent_EmployeeEClass, STAFF_COMPONENT_EMPLOYEE___GET_EMPLOYEE_INFO__STRING);
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
		staffComponent_AccountManagerEClass.getESuperTypes().add(this.getStaffComponent_IAuthentication());
		staffComponent_AccountManagerEClass.getESuperTypes().add(this.getStaffComponent_IAccountAdministration());

		// Initialize classes, features, and operations; add parameters
		initEClass(staffComponentEClass, StaffComponent.class, "StaffComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(staffComponent_AccountManagerEClass, StaffComponent_AccountManager.class, "StaffComponent_AccountManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getStaffComponent_AccountManager__FindAccount__String(), this.getStaffComponent_Employee(), "findAccount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ssn", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(staffComponent_IAuthenticationEClass, StaffComponent_IAuthentication.class, "StaffComponent_IAuthentication", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getStaffComponent_IAuthentication__LogIn__String_String(), null, "logIn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ssn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "password", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getStaffComponent_IAuthentication__LogOut__String(), null, "logOut", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ssn", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getStaffComponent_IAuthentication__IsLoggedIn__String(), null, "isLoggedIn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ssn", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(staffComponent_IAccountAdministrationEClass, StaffComponent_IAccountAdministration.class, "StaffComponent_IAccountAdministration", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getStaffComponent_IAccountAdministration__CreateAccount__String_String_String_String_String(), theTypesPackage.getInteger(), "createAccount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ssn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "email", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "phone", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "password", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getStaffComponent_IAccountAdministration__EditAccountDetails__String(), theTypesPackage.getString(), "editAccountDetails", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ssn", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getStaffComponent_IAccountAdministration__RemoveAccount__String(), null, "removeAccount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ssn", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(staffComponent_EmployeeEClass, StaffComponent_Employee.class, "StaffComponent_Employee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStaffComponent_Employee_Id(), theTypesPackage.getInteger(), "id", null, 1, 1, StaffComponent_Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStaffComponent_Employee_Ssn(), theTypesPackage.getString(), "ssn", null, 1, 1, StaffComponent_Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStaffComponent_Employee_Name(), theTypesPackage.getString(), "name", null, 1, 1, StaffComponent_Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStaffComponent_Employee_Email(), theTypesPackage.getString(), "email", null, 1, 1, StaffComponent_Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStaffComponent_Employee_Phone(), theTypesPackage.getString(), "phone", null, 1, 1, StaffComponent_Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStaffComponent_Employee_Password(), theTypesPackage.getString(), "password", null, 1, 1, StaffComponent_Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getStaffComponent_Employee__Employee__String_String_String_String(), null, "Employee", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ssn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "email", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "phone", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getStaffComponent_Employee__Employee(), null, "Employee", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getStaffComponent_Employee__GetEmployeeInfo__String(), this.getStaffComponent_Employee(), "getEmployeeInfo", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ssn", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //StaffPackageImpl
