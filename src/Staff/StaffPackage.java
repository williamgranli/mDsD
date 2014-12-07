/**
 */
package Staff;

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
 * @see Staff.StaffFactory
 * @model kind="package"
 * @generated
 */
public interface StaffPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Staff";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///Staff.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Staff";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StaffPackage eINSTANCE = Staff.impl.StaffPackageImpl.init();

	/**
	 * The meta object id for the '{@link Staff.impl.StaffComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Staff.impl.StaffComponentImpl
	 * @see Staff.impl.StaffPackageImpl#getStaffComponent()
	 * @generated
	 */
	int STAFF_COMPONENT = 0;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Staff.StaffComponent_IAuthentication <em>Component IAuthentication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Staff.StaffComponent_IAuthentication
	 * @see Staff.impl.StaffPackageImpl#getStaffComponent_IAuthentication()
	 * @generated
	 */
	int STAFF_COMPONENT_IAUTHENTICATION = 2;

	/**
	 * The number of structural features of the '<em>Component IAuthentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_IAUTHENTICATION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Log In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_IAUTHENTICATION___LOG_IN__STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Log Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_IAUTHENTICATION___LOG_OUT__STRING = 1;

	/**
	 * The operation id for the '<em>Is Logged In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_IAUTHENTICATION___IS_LOGGED_IN__STRING = 2;

	/**
	 * The number of operations of the '<em>Component IAuthentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_IAUTHENTICATION_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link Staff.impl.StaffComponent_AccountManagerImpl <em>Component Account Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Staff.impl.StaffComponent_AccountManagerImpl
	 * @see Staff.impl.StaffPackageImpl#getStaffComponent_AccountManager()
	 * @generated
	 */
	int STAFF_COMPONENT_ACCOUNT_MANAGER = 1;

	/**
	 * The number of structural features of the '<em>Component Account Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_ACCOUNT_MANAGER_FEATURE_COUNT = STAFF_COMPONENT_IAUTHENTICATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Log In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_ACCOUNT_MANAGER___LOG_IN__STRING_STRING = STAFF_COMPONENT_IAUTHENTICATION___LOG_IN__STRING_STRING;

	/**
	 * The operation id for the '<em>Log Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_ACCOUNT_MANAGER___LOG_OUT__STRING = STAFF_COMPONENT_IAUTHENTICATION___LOG_OUT__STRING;

	/**
	 * The operation id for the '<em>Is Logged In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_ACCOUNT_MANAGER___IS_LOGGED_IN__STRING = STAFF_COMPONENT_IAUTHENTICATION___IS_LOGGED_IN__STRING;

	/**
	 * The operation id for the '<em>Create Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_ACCOUNT_MANAGER___CREATE_ACCOUNT__STRING_STRING_STRING_STRING_STRING = STAFF_COMPONENT_IAUTHENTICATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Edit Account Details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_ACCOUNT_MANAGER___EDIT_ACCOUNT_DETAILS__STRING = STAFF_COMPONENT_IAUTHENTICATION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Remove Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_ACCOUNT_MANAGER___REMOVE_ACCOUNT__STRING = STAFF_COMPONENT_IAUTHENTICATION_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Find Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_ACCOUNT_MANAGER___FIND_ACCOUNT__STRING = STAFF_COMPONENT_IAUTHENTICATION_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Component Account Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_ACCOUNT_MANAGER_OPERATION_COUNT = STAFF_COMPONENT_IAUTHENTICATION_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link Staff.StaffComponent_IAccountAdministration <em>Component IAccount Administration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Staff.StaffComponent_IAccountAdministration
	 * @see Staff.impl.StaffPackageImpl#getStaffComponent_IAccountAdministration()
	 * @generated
	 */
	int STAFF_COMPONENT_IACCOUNT_ADMINISTRATION = 3;

	/**
	 * The number of structural features of the '<em>Component IAccount Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_IACCOUNT_ADMINISTRATION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_IACCOUNT_ADMINISTRATION___CREATE_ACCOUNT__STRING_STRING_STRING_STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Edit Account Details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_IACCOUNT_ADMINISTRATION___EDIT_ACCOUNT_DETAILS__STRING = 1;

	/**
	 * The operation id for the '<em>Remove Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_IACCOUNT_ADMINISTRATION___REMOVE_ACCOUNT__STRING = 2;

	/**
	 * The number of operations of the '<em>Component IAccount Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_IACCOUNT_ADMINISTRATION_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link Staff.impl.StaffComponent_EmployeeImpl <em>Component Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Staff.impl.StaffComponent_EmployeeImpl
	 * @see Staff.impl.StaffPackageImpl#getStaffComponent_Employee()
	 * @generated
	 */
	int STAFF_COMPONENT_EMPLOYEE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_EMPLOYEE__ID = 0;

	/**
	 * The feature id for the '<em><b>Ssn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_EMPLOYEE__SSN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_EMPLOYEE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_EMPLOYEE__EMAIL = 3;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_EMPLOYEE__PHONE = 4;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_EMPLOYEE__PASSWORD = 5;

	/**
	 * The number of structural features of the '<em>Component Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_EMPLOYEE_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Employee</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_EMPLOYEE___EMPLOYEE__STRING_STRING_STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Employee</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_EMPLOYEE___EMPLOYEE = 1;

	/**
	 * The operation id for the '<em>Get Employee Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_EMPLOYEE___GET_EMPLOYEE_INFO__STRING = 2;

	/**
	 * The number of operations of the '<em>Component Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_EMPLOYEE_OPERATION_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link Staff.StaffComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see Staff.StaffComponent
	 * @generated
	 */
	EClass getStaffComponent();

	/**
	 * Returns the meta object for class '{@link Staff.StaffComponent_AccountManager <em>Component Account Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Account Manager</em>'.
	 * @see Staff.StaffComponent_AccountManager
	 * @generated
	 */
	EClass getStaffComponent_AccountManager();

	/**
	 * Returns the meta object for the '{@link Staff.StaffComponent_AccountManager#findAccount(java.lang.String) <em>Find Account</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Account</em>' operation.
	 * @see Staff.StaffComponent_AccountManager#findAccount(java.lang.String)
	 * @generated
	 */
	EOperation getStaffComponent_AccountManager__FindAccount__String();

	/**
	 * Returns the meta object for class '{@link Staff.StaffComponent_IAuthentication <em>Component IAuthentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component IAuthentication</em>'.
	 * @see Staff.StaffComponent_IAuthentication
	 * @generated
	 */
	EClass getStaffComponent_IAuthentication();

	/**
	 * Returns the meta object for the '{@link Staff.StaffComponent_IAuthentication#logIn(java.lang.String, java.lang.String) <em>Log In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Log In</em>' operation.
	 * @see Staff.StaffComponent_IAuthentication#logIn(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getStaffComponent_IAuthentication__LogIn__String_String();

	/**
	 * Returns the meta object for the '{@link Staff.StaffComponent_IAuthentication#logOut(java.lang.String) <em>Log Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Log Out</em>' operation.
	 * @see Staff.StaffComponent_IAuthentication#logOut(java.lang.String)
	 * @generated
	 */
	EOperation getStaffComponent_IAuthentication__LogOut__String();

	/**
	 * Returns the meta object for the '{@link Staff.StaffComponent_IAuthentication#isLoggedIn(java.lang.String) <em>Is Logged In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Logged In</em>' operation.
	 * @see Staff.StaffComponent_IAuthentication#isLoggedIn(java.lang.String)
	 * @generated
	 */
	EOperation getStaffComponent_IAuthentication__IsLoggedIn__String();

	/**
	 * Returns the meta object for class '{@link Staff.StaffComponent_IAccountAdministration <em>Component IAccount Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component IAccount Administration</em>'.
	 * @see Staff.StaffComponent_IAccountAdministration
	 * @generated
	 */
	EClass getStaffComponent_IAccountAdministration();

	/**
	 * Returns the meta object for the '{@link Staff.StaffComponent_IAccountAdministration#createAccount(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Create Account</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Account</em>' operation.
	 * @see Staff.StaffComponent_IAccountAdministration#createAccount(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getStaffComponent_IAccountAdministration__CreateAccount__String_String_String_String_String();

	/**
	 * Returns the meta object for the '{@link Staff.StaffComponent_IAccountAdministration#editAccountDetails(java.lang.String) <em>Edit Account Details</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Account Details</em>' operation.
	 * @see Staff.StaffComponent_IAccountAdministration#editAccountDetails(java.lang.String)
	 * @generated
	 */
	EOperation getStaffComponent_IAccountAdministration__EditAccountDetails__String();

	/**
	 * Returns the meta object for the '{@link Staff.StaffComponent_IAccountAdministration#removeAccount(java.lang.String) <em>Remove Account</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Account</em>' operation.
	 * @see Staff.StaffComponent_IAccountAdministration#removeAccount(java.lang.String)
	 * @generated
	 */
	EOperation getStaffComponent_IAccountAdministration__RemoveAccount__String();

	/**
	 * Returns the meta object for class '{@link Staff.StaffComponent_Employee <em>Component Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Employee</em>'.
	 * @see Staff.StaffComponent_Employee
	 * @generated
	 */
	EClass getStaffComponent_Employee();

	/**
	 * Returns the meta object for the attribute '{@link Staff.StaffComponent_Employee#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Staff.StaffComponent_Employee#getId()
	 * @see #getStaffComponent_Employee()
	 * @generated
	 */
	EAttribute getStaffComponent_Employee_Id();

	/**
	 * Returns the meta object for the attribute '{@link Staff.StaffComponent_Employee#getSsn <em>Ssn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssn</em>'.
	 * @see Staff.StaffComponent_Employee#getSsn()
	 * @see #getStaffComponent_Employee()
	 * @generated
	 */
	EAttribute getStaffComponent_Employee_Ssn();

	/**
	 * Returns the meta object for the attribute '{@link Staff.StaffComponent_Employee#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Staff.StaffComponent_Employee#getName()
	 * @see #getStaffComponent_Employee()
	 * @generated
	 */
	EAttribute getStaffComponent_Employee_Name();

	/**
	 * Returns the meta object for the attribute '{@link Staff.StaffComponent_Employee#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see Staff.StaffComponent_Employee#getEmail()
	 * @see #getStaffComponent_Employee()
	 * @generated
	 */
	EAttribute getStaffComponent_Employee_Email();

	/**
	 * Returns the meta object for the attribute '{@link Staff.StaffComponent_Employee#getPhone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone</em>'.
	 * @see Staff.StaffComponent_Employee#getPhone()
	 * @see #getStaffComponent_Employee()
	 * @generated
	 */
	EAttribute getStaffComponent_Employee_Phone();

	/**
	 * Returns the meta object for the attribute '{@link Staff.StaffComponent_Employee#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see Staff.StaffComponent_Employee#getPassword()
	 * @see #getStaffComponent_Employee()
	 * @generated
	 */
	EAttribute getStaffComponent_Employee_Password();

	/**
	 * Returns the meta object for the '{@link Staff.StaffComponent_Employee#Employee(java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Employee</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Employee</em>' operation.
	 * @see Staff.StaffComponent_Employee#Employee(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getStaffComponent_Employee__Employee__String_String_String_String();

	/**
	 * Returns the meta object for the '{@link Staff.StaffComponent_Employee#Employee() <em>Employee</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Employee</em>' operation.
	 * @see Staff.StaffComponent_Employee#Employee()
	 * @generated
	 */
	EOperation getStaffComponent_Employee__Employee();

	/**
	 * Returns the meta object for the '{@link Staff.StaffComponent_Employee#getEmployeeInfo(java.lang.String) <em>Get Employee Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Employee Info</em>' operation.
	 * @see Staff.StaffComponent_Employee#getEmployeeInfo(java.lang.String)
	 * @generated
	 */
	EOperation getStaffComponent_Employee__GetEmployeeInfo__String();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StaffFactory getStaffFactory();

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
		 * The meta object literal for the '{@link Staff.impl.StaffComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Staff.impl.StaffComponentImpl
		 * @see Staff.impl.StaffPackageImpl#getStaffComponent()
		 * @generated
		 */
		EClass STAFF_COMPONENT = eINSTANCE.getStaffComponent();

		/**
		 * The meta object literal for the '{@link Staff.impl.StaffComponent_AccountManagerImpl <em>Component Account Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Staff.impl.StaffComponent_AccountManagerImpl
		 * @see Staff.impl.StaffPackageImpl#getStaffComponent_AccountManager()
		 * @generated
		 */
		EClass STAFF_COMPONENT_ACCOUNT_MANAGER = eINSTANCE.getStaffComponent_AccountManager();

		/**
		 * The meta object literal for the '<em><b>Find Account</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_COMPONENT_ACCOUNT_MANAGER___FIND_ACCOUNT__STRING = eINSTANCE.getStaffComponent_AccountManager__FindAccount__String();

		/**
		 * The meta object literal for the '{@link Staff.StaffComponent_IAuthentication <em>Component IAuthentication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Staff.StaffComponent_IAuthentication
		 * @see Staff.impl.StaffPackageImpl#getStaffComponent_IAuthentication()
		 * @generated
		 */
		EClass STAFF_COMPONENT_IAUTHENTICATION = eINSTANCE.getStaffComponent_IAuthentication();

		/**
		 * The meta object literal for the '<em><b>Log In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_COMPONENT_IAUTHENTICATION___LOG_IN__STRING_STRING = eINSTANCE.getStaffComponent_IAuthentication__LogIn__String_String();

		/**
		 * The meta object literal for the '<em><b>Log Out</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_COMPONENT_IAUTHENTICATION___LOG_OUT__STRING = eINSTANCE.getStaffComponent_IAuthentication__LogOut__String();

		/**
		 * The meta object literal for the '<em><b>Is Logged In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_COMPONENT_IAUTHENTICATION___IS_LOGGED_IN__STRING = eINSTANCE.getStaffComponent_IAuthentication__IsLoggedIn__String();

		/**
		 * The meta object literal for the '{@link Staff.StaffComponent_IAccountAdministration <em>Component IAccount Administration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Staff.StaffComponent_IAccountAdministration
		 * @see Staff.impl.StaffPackageImpl#getStaffComponent_IAccountAdministration()
		 * @generated
		 */
		EClass STAFF_COMPONENT_IACCOUNT_ADMINISTRATION = eINSTANCE.getStaffComponent_IAccountAdministration();

		/**
		 * The meta object literal for the '<em><b>Create Account</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_COMPONENT_IACCOUNT_ADMINISTRATION___CREATE_ACCOUNT__STRING_STRING_STRING_STRING_STRING = eINSTANCE.getStaffComponent_IAccountAdministration__CreateAccount__String_String_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Edit Account Details</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_COMPONENT_IACCOUNT_ADMINISTRATION___EDIT_ACCOUNT_DETAILS__STRING = eINSTANCE.getStaffComponent_IAccountAdministration__EditAccountDetails__String();

		/**
		 * The meta object literal for the '<em><b>Remove Account</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_COMPONENT_IACCOUNT_ADMINISTRATION___REMOVE_ACCOUNT__STRING = eINSTANCE.getStaffComponent_IAccountAdministration__RemoveAccount__String();

		/**
		 * The meta object literal for the '{@link Staff.impl.StaffComponent_EmployeeImpl <em>Component Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Staff.impl.StaffComponent_EmployeeImpl
		 * @see Staff.impl.StaffPackageImpl#getStaffComponent_Employee()
		 * @generated
		 */
		EClass STAFF_COMPONENT_EMPLOYEE = eINSTANCE.getStaffComponent_Employee();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_COMPONENT_EMPLOYEE__ID = eINSTANCE.getStaffComponent_Employee_Id();

		/**
		 * The meta object literal for the '<em><b>Ssn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_COMPONENT_EMPLOYEE__SSN = eINSTANCE.getStaffComponent_Employee_Ssn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_COMPONENT_EMPLOYEE__NAME = eINSTANCE.getStaffComponent_Employee_Name();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_COMPONENT_EMPLOYEE__EMAIL = eINSTANCE.getStaffComponent_Employee_Email();

		/**
		 * The meta object literal for the '<em><b>Phone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_COMPONENT_EMPLOYEE__PHONE = eINSTANCE.getStaffComponent_Employee_Phone();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_COMPONENT_EMPLOYEE__PASSWORD = eINSTANCE.getStaffComponent_Employee_Password();

		/**
		 * The meta object literal for the '<em><b>Employee</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_COMPONENT_EMPLOYEE___EMPLOYEE__STRING_STRING_STRING_STRING = eINSTANCE.getStaffComponent_Employee__Employee__String_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Employee</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_COMPONENT_EMPLOYEE___EMPLOYEE = eINSTANCE.getStaffComponent_Employee__Employee();

		/**
		 * The meta object literal for the '<em><b>Get Employee Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_COMPONENT_EMPLOYEE___GET_EMPLOYEE_INFO__STRING = eINSTANCE.getStaffComponent_Employee__GetEmployeeInfo__String();

	}

} //StaffPackage
