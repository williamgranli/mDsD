/**
 */
package Staff.util;

import Staff.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Staff.StaffPackage
 * @generated
 */
public class StaffAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StaffPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StaffPackage.eINSTANCE;
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
	protected StaffSwitch<Adapter> modelSwitch =
		new StaffSwitch<Adapter>() {
			@Override
			public Adapter caseStaffComponent(StaffComponent object) {
				return createStaffComponentAdapter();
			}
			@Override
			public Adapter caseStaffComponent_AccountManager(StaffComponent_AccountManager object) {
				return createStaffComponent_AccountManagerAdapter();
			}
			@Override
			public Adapter caseStaffComponent_IAuthentication(StaffComponent_IAuthentication object) {
				return createStaffComponent_IAuthenticationAdapter();
			}
			@Override
			public Adapter caseStaffComponent_IAccountAdministration(StaffComponent_IAccountAdministration object) {
				return createStaffComponent_IAccountAdministrationAdapter();
			}
			@Override
			public Adapter caseStaffComponent_Employee(StaffComponent_Employee object) {
				return createStaffComponent_EmployeeAdapter();
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
	 * Creates a new adapter for an object of class '{@link Staff.StaffComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Staff.StaffComponent
	 * @generated
	 */
	public Adapter createStaffComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Staff.StaffComponent_AccountManager <em>Component Account Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Staff.StaffComponent_AccountManager
	 * @generated
	 */
	public Adapter createStaffComponent_AccountManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Staff.StaffComponent_IAuthentication <em>Component IAuthentication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Staff.StaffComponent_IAuthentication
	 * @generated
	 */
	public Adapter createStaffComponent_IAuthenticationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Staff.StaffComponent_IAccountAdministration <em>Component IAccount Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Staff.StaffComponent_IAccountAdministration
	 * @generated
	 */
	public Adapter createStaffComponent_IAccountAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Staff.StaffComponent_Employee <em>Component Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Staff.StaffComponent_Employee
	 * @generated
	 */
	public Adapter createStaffComponent_EmployeeAdapter() {
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

} //StaffAdapterFactory
