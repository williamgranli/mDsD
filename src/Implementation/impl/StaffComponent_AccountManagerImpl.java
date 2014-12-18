/**
 */
package Implementation.impl;

import Implementation.ImplementationPackage;
import Implementation.StaffComponent_AccountManager;
import Implementation.StaffComponent_Employee;
import Implementation.StaffComponent_IAccountAdministration;
import Implementation.StaffComponent_IAuthentication;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Staff Component Account Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Implementation.impl.StaffComponent_AccountManagerImpl#getLoggedIn <em>Logged In</em>}</li>
 *   <li>{@link Implementation.impl.StaffComponent_AccountManagerImpl#getEmployees <em>Employees</em>}</li>
 *   <li>{@link Implementation.impl.StaffComponent_AccountManagerImpl#getIAuthentication <em>IAuthentication</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StaffComponent_AccountManagerImpl extends MinimalEObjectImpl.Container implements StaffComponent_AccountManager {
	/**
	 * The cached value of the '{@link #getLoggedIn() <em>Logged In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoggedIn()
	 * @generated
	 * @ordered
	 */
	protected EList<StaffComponent_Employee> loggedIn;
	/**
	 * The cached value of the '{@link #getEmployees() <em>Employees</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployees()
	 * @generated
	 * @ordered
	 */
	protected EList<StaffComponent_Employee> employees;

	/**
	 * The cached value of the '{@link #getIAuthentication() <em>IAuthentication</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIAuthentication()
	 * @generated
	 * @ordered
	 */
	protected StaffComponent_IAuthentication iAuthentication;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT	
	 */
	protected StaffComponent_AccountManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.STAFF_COMPONENT_ACCOUNT_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffComponent_IAuthentication getIAuthentication() {
		if (iAuthentication != null && iAuthentication.eIsProxy()) {
			InternalEObject oldIAuthentication = (InternalEObject)iAuthentication;
			iAuthentication = (StaffComponent_IAuthentication)eResolveProxy(oldIAuthentication);
			if (iAuthentication != oldIAuthentication) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.STAFF_COMPONENT_ACCOUNT_MANAGER__IAUTHENTICATION, oldIAuthentication, iAuthentication));
			}
		}
		return iAuthentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffComponent_IAuthentication basicGetIAuthentication() {
		return iAuthentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIAuthentication(StaffComponent_IAuthentication newIAuthentication) {
		StaffComponent_IAuthentication oldIAuthentication = iAuthentication;
		iAuthentication = newIAuthentication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.STAFF_COMPONENT_ACCOUNT_MANAGER__IAUTHENTICATION, oldIAuthentication, iAuthentication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StaffComponent_Employee> getLoggedIn() {
		if (loggedIn == null) {
			loggedIn = new EObjectResolvingEList<StaffComponent_Employee>(StaffComponent_Employee.class, this, ImplementationPackage.STAFF_COMPONENT_ACCOUNT_MANAGER__LOGGED_IN);
		}
		return loggedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StaffComponent_Employee> getEmployees() {
		if (employees == null) {
			employees = new EObjectResolvingEList<StaffComponent_Employee>(StaffComponent_Employee.class, this, ImplementationPackage.STAFF_COMPONENT_ACCOUNT_MANAGER__EMPLOYEES);
		}
		return employees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void logIn(String ssn, String password) {
		StaffComponent_Employee emp = findAccount(ssn);
		
		if (emp != null) {
			loggedIn.add(emp);
			System.out.println("Log in successfull");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void logOut(String ssn) {
		for(StaffComponent_Employee e: loggedIn){
			if(e.getSsn().equals(ssn)){
				loggedIn.remove(e);
				System.out.println("Log out successfull");
				return;
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isLoggedIn(String ssn) {
		for(StaffComponent_Employee e : loggedIn){
			if(e.getSsn().equals("ssn")) {
				return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean createAccount(String name, String ssn, String email, String phone, String password) {
		if (findAccount(ssn) == null) {
			employees.add(new StaffComponent_EmployeeImpl(ssn,name,email,phone,password));
			System.out.println("Employee account created for SSN: " + ssn);
			return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean editAccountDetails(String ssn, String name, String email, String phone, String password) {
		StaffComponent_Employee emp = findAccount(ssn);
		if (emp != null) {
			emp.setSsn(ssn);
			emp.setName(name);
			emp.setEmail(email);
			emp.setPhone(phone);
			emp.setPassword(password);
			System.out.println("---\nAccount with SSN: " + ssn + " edited...");
			return true;
		}
		
		System.out.println("Employee account for SSN: " + ssn + " does not exist!");
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean removeAccount(String ssn) {
		StaffComponent_Employee employee = findAccount(ssn);
		if (employee != null) {
			employees.remove(employee);
			loggedIn.remove(employee);
			return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public StaffComponent_Employee findAccount(String ssn) {

		for (StaffComponent_Employee e: employees) {
			if (e.getSsn().equals(ssn)) {
				return e;
			}
		}
		
		System.out.println("Account for SSN: " + ssn + " was not found");
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImplementationPackage.STAFF_COMPONENT_ACCOUNT_MANAGER__LOGGED_IN:
				return getLoggedIn();
			case ImplementationPackage.STAFF_COMPONENT_ACCOUNT_MANAGER__EMPLOYEES:
				return getEmployees();
			case ImplementationPackage.STAFF_COMPONENT_ACCOUNT_MANAGER__IAUTHENTICATION:
				if (resolve) return getIAuthentication();
				return basicGetIAuthentication();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ImplementationPackage.STAFF_COMPONENT_ACCOUNT_MANAGER__LOGGED_IN:
				getLoggedIn().clear();
				getLoggedIn().addAll((Collection<? extends StaffComponent_Employee>)newValue);
				return;
			case ImplementationPackage.STAFF_COMPONENT_ACCOUNT_MANAGER__EMPLOYEES:
				getEmployees().clear();
				getEmployees().addAll((Collection<? extends StaffComponent_Employee>)newValue);
				return;
			case ImplementationPackage.STAFF_COMPONENT_ACCOUNT_MANAGER__IAUTHENTICATION:
				setIAuthentication((StaffComponent_IAuthentication)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ImplementationPackage.STAFF_COMPONENT_ACCOUNT_MANAGER__LOGGED_IN:
				getLoggedIn().clear();
				return;
			case ImplementationPackage.STAFF_COMPONENT_ACCOUNT_MANAGER__EMPLOYEES:
				getEmployees().clear();
				return;
			case ImplementationPackage.STAFF_COMPONENT_ACCOUNT_MANAGER__IAUTHENTICATION:
				setIAuthentication((StaffComponent_IAuthentication)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ImplementationPackage.STAFF_COMPONENT_ACCOUNT_MANAGER__LOGGED_IN:
				return loggedIn != null && !loggedIn.isEmpty();
			case ImplementationPackage.STAFF_COMPONENT_ACCOUNT_MANAGER__EMPLOYEES:
				return employees != null && !employees.isEmpty();
			case ImplementationPackage.STAFF_COMPONENT_ACCOUNT_MANAGER__IAUTHENTICATION:
				return iAuthentication != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == StaffComponent_IAccountAdministration.class) {
			switch (baseOperationID) {
				case ImplementationPackage.STAFF_COMPONENT_IACCOUNT_ADMINISTRATION___CREATE_ACCOUNT__STRING_STRING_STRING_STRING_STRING: return ImplementationPackage.STAFF_COMPONENT_ACCOUNT_MANAGER___CREATE_ACCOUNT__STRING_STRING_STRING_STRING_STRING;
				case ImplementationPackage.STAFF_COMPONENT_IACCOUNT_ADMINISTRATION___EDIT_ACCOUNT_DETAILS__STRING_STRING_STRING_STRING_STRING: return ImplementationPackage.STAFF_COMPONENT_ACCOUNT_MANAGER___EDIT_ACCOUNT_DETAILS__STRING_STRING_STRING_STRING_STRING;
				case ImplementationPackage.STAFF_COMPONENT_IACCOUNT_ADMINISTRATION___REMOVE_ACCOUNT__STRING: return ImplementationPackage.STAFF_COMPONENT_ACCOUNT_MANAGER___REMOVE_ACCOUNT__STRING;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ImplementationPackage.STAFF_COMPONENT_ACCOUNT_MANAGER___LOG_IN__STRING_STRING:
				logIn((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case ImplementationPackage.STAFF_COMPONENT_ACCOUNT_MANAGER___LOG_OUT__STRING:
				logOut((String)arguments.get(0));
				return null;
			case ImplementationPackage.STAFF_COMPONENT_ACCOUNT_MANAGER___IS_LOGGED_IN__STRING:
				return isLoggedIn((String)arguments.get(0));
			case ImplementationPackage.STAFF_COMPONENT_ACCOUNT_MANAGER___CREATE_ACCOUNT__STRING_STRING_STRING_STRING_STRING:
				return createAccount((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4));
			case ImplementationPackage.STAFF_COMPONENT_ACCOUNT_MANAGER___EDIT_ACCOUNT_DETAILS__STRING_STRING_STRING_STRING_STRING:
				return editAccountDetails((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4));
			case ImplementationPackage.STAFF_COMPONENT_ACCOUNT_MANAGER___REMOVE_ACCOUNT__STRING:
				return removeAccount((String)arguments.get(0));
			case ImplementationPackage.STAFF_COMPONENT_ACCOUNT_MANAGER___FIND_ACCOUNT__STRING:
				return findAccount((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //StaffComponent_AccountManagerImpl
