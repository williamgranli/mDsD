/**
 */
package Implementation.impl;

import Implementation.ImplementationPackage;
import Implementation.StaffComponent;

import Implementation.StaffComponent_IAuthentication;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Staff Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class StaffComponentImpl extends MinimalEObjectImpl.Container implements StaffComponent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaffComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.STAFF_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean createAccount(String name, String ssn, String email, String phone, String password) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean editAccountDetails(String ssn, String name, String email, String phone, String password) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean removeAccount(String ssn) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void logIn(String ssn, String password) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void logOut(String ssn) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLoggedIn(String ssn) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == StaffComponent_IAuthentication.class) {
			switch (baseOperationID) {
				case ImplementationPackage.STAFF_COMPONENT_IAUTHENTICATION___LOG_IN__STRING_STRING: return ImplementationPackage.STAFF_COMPONENT___LOG_IN__STRING_STRING;
				case ImplementationPackage.STAFF_COMPONENT_IAUTHENTICATION___LOG_OUT__STRING: return ImplementationPackage.STAFF_COMPONENT___LOG_OUT__STRING;
				case ImplementationPackage.STAFF_COMPONENT_IAUTHENTICATION___IS_LOGGED_IN__STRING: return ImplementationPackage.STAFF_COMPONENT___IS_LOGGED_IN__STRING;
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
			case ImplementationPackage.STAFF_COMPONENT___CREATE_ACCOUNT__STRING_STRING_STRING_STRING_STRING:
				return createAccount((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4));
			case ImplementationPackage.STAFF_COMPONENT___EDIT_ACCOUNT_DETAILS__STRING_STRING_STRING_STRING_STRING:
				return editAccountDetails((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4));
			case ImplementationPackage.STAFF_COMPONENT___REMOVE_ACCOUNT__STRING:
				return removeAccount((String)arguments.get(0));
			case ImplementationPackage.STAFF_COMPONENT___LOG_IN__STRING_STRING:
				logIn((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case ImplementationPackage.STAFF_COMPONENT___LOG_OUT__STRING:
				logOut((String)arguments.get(0));
				return null;
			case ImplementationPackage.STAFF_COMPONENT___IS_LOGGED_IN__STRING:
				return isLoggedIn((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //StaffComponentImpl
