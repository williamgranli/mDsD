/**
 */
package Staff.impl;

import Staff.*;

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
public class StaffFactoryImpl extends EFactoryImpl implements StaffFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StaffFactory init() {
		try {
			StaffFactory theStaffFactory = (StaffFactory)EPackage.Registry.INSTANCE.getEFactory(StaffPackage.eNS_URI);
			if (theStaffFactory != null) {
				return theStaffFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StaffFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffFactoryImpl() {
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
			case StaffPackage.STAFF_COMPONENT: return createStaffComponent();
			case StaffPackage.STAFF_COMPONENT_ACCOUNT_MANAGER: return createStaffComponent_AccountManager();
			case StaffPackage.STAFF_COMPONENT_EMPLOYEE: return createStaffComponent_Employee();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffComponent createStaffComponent() {
		StaffComponentImpl staffComponent = new StaffComponentImpl();
		return staffComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffComponent_AccountManager createStaffComponent_AccountManager() {
		StaffComponent_AccountManagerImpl staffComponent_AccountManager = new StaffComponent_AccountManagerImpl();
		return staffComponent_AccountManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffComponent_Employee createStaffComponent_Employee() {
		StaffComponent_EmployeeImpl staffComponent_Employee = new StaffComponent_EmployeeImpl();
		return staffComponent_Employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffPackage getStaffPackage() {
		return (StaffPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StaffPackage getPackage() {
		return StaffPackage.eINSTANCE;
	}

} //StaffFactoryImpl
