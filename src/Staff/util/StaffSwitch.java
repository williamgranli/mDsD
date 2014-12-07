/**
 */
package Staff.util;

import Staff.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Staff.StaffPackage
 * @generated
 */
public class StaffSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StaffPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffSwitch() {
		if (modelPackage == null) {
			modelPackage = StaffPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case StaffPackage.STAFF_COMPONENT: {
				StaffComponent staffComponent = (StaffComponent)theEObject;
				T result = caseStaffComponent(staffComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StaffPackage.STAFF_COMPONENT_ACCOUNT_MANAGER: {
				StaffComponent_AccountManager staffComponent_AccountManager = (StaffComponent_AccountManager)theEObject;
				T result = caseStaffComponent_AccountManager(staffComponent_AccountManager);
				if (result == null) result = caseStaffComponent_IAuthentication(staffComponent_AccountManager);
				if (result == null) result = caseStaffComponent_IAccountAdministration(staffComponent_AccountManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StaffPackage.STAFF_COMPONENT_IAUTHENTICATION: {
				StaffComponent_IAuthentication staffComponent_IAuthentication = (StaffComponent_IAuthentication)theEObject;
				T result = caseStaffComponent_IAuthentication(staffComponent_IAuthentication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StaffPackage.STAFF_COMPONENT_IACCOUNT_ADMINISTRATION: {
				StaffComponent_IAccountAdministration staffComponent_IAccountAdministration = (StaffComponent_IAccountAdministration)theEObject;
				T result = caseStaffComponent_IAccountAdministration(staffComponent_IAccountAdministration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StaffPackage.STAFF_COMPONENT_EMPLOYEE: {
				StaffComponent_Employee staffComponent_Employee = (StaffComponent_Employee)theEObject;
				T result = caseStaffComponent_Employee(staffComponent_Employee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaffComponent(StaffComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Account Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Account Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaffComponent_AccountManager(StaffComponent_AccountManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component IAuthentication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component IAuthentication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaffComponent_IAuthentication(StaffComponent_IAuthentication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component IAccount Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component IAccount Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaffComponent_IAccountAdministration(StaffComponent_IAccountAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Employee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Employee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaffComponent_Employee(StaffComponent_Employee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //StaffSwitch
