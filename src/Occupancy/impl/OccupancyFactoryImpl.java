/**
 */
package Occupancy.impl;

import Occupancy.*;

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
public class OccupancyFactoryImpl extends EFactoryImpl implements OccupancyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OccupancyFactory init() {
		try {
			OccupancyFactory theOccupancyFactory = (OccupancyFactory)EPackage.Registry.INSTANCE.getEFactory(OccupancyPackage.eNS_URI);
			if (theOccupancyFactory != null) {
				return theOccupancyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OccupancyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccupancyFactoryImpl() {
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
			case OccupancyPackage.OCCUPANCY_COMPONENT: return createOccupancyComponent();
			case OccupancyPackage.OCCUPANCY_COMPONENT_OCCUPANCY: return createOccupancyComponent_Occupancy();
			case OccupancyPackage.OCCUPANCY_COMPONENT_GUEST: return createOccupancyComponent_Guest();
			case OccupancyPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER: return createOccupancyComponent_OccupancyHandler();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccupancyComponent createOccupancyComponent() {
		OccupancyComponentImpl occupancyComponent = new OccupancyComponentImpl();
		return occupancyComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccupancyComponent_Occupancy createOccupancyComponent_Occupancy() {
		OccupancyComponent_OccupancyImpl occupancyComponent_Occupancy = new OccupancyComponent_OccupancyImpl();
		return occupancyComponent_Occupancy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccupancyComponent_Guest createOccupancyComponent_Guest() {
		OccupancyComponent_GuestImpl occupancyComponent_Guest = new OccupancyComponent_GuestImpl();
		return occupancyComponent_Guest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccupancyComponent_OccupancyHandler createOccupancyComponent_OccupancyHandler() {
		OccupancyComponent_OccupancyHandlerImpl occupancyComponent_OccupancyHandler = new OccupancyComponent_OccupancyHandlerImpl();
		return occupancyComponent_OccupancyHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccupancyPackage getOccupancyPackage() {
		return (OccupancyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OccupancyPackage getPackage() {
		return OccupancyPackage.eINSTANCE;
	}

} //OccupancyFactoryImpl
