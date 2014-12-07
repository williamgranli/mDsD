/**
 */
package Occupancy.util;

import Occupancy.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Occupancy.OccupancyPackage
 * @generated
 */
public class OccupancyAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OccupancyPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccupancyAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OccupancyPackage.eINSTANCE;
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
	protected OccupancySwitch<Adapter> modelSwitch =
		new OccupancySwitch<Adapter>() {
			@Override
			public Adapter caseOccupancyComponent(OccupancyComponent object) {
				return createOccupancyComponentAdapter();
			}
			@Override
			public Adapter caseOccupancyComponent_Occupancy(OccupancyComponent_Occupancy object) {
				return createOccupancyComponent_OccupancyAdapter();
			}
			@Override
			public Adapter caseOccupancyComponent_Guest(OccupancyComponent_Guest object) {
				return createOccupancyComponent_GuestAdapter();
			}
			@Override
			public Adapter caseOccupancyComponent_IOccupancy(OccupancyComponent_IOccupancy object) {
				return createOccupancyComponent_IOccupancyAdapter();
			}
			@Override
			public Adapter caseOccupancyComponent_OccupancyHandler(OccupancyComponent_OccupancyHandler object) {
				return createOccupancyComponent_OccupancyHandlerAdapter();
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
	 * Creates a new adapter for an object of class '{@link Occupancy.OccupancyComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Occupancy.OccupancyComponent
	 * @generated
	 */
	public Adapter createOccupancyComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Occupancy.OccupancyComponent_Occupancy <em>Component Occupancy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Occupancy.OccupancyComponent_Occupancy
	 * @generated
	 */
	public Adapter createOccupancyComponent_OccupancyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Occupancy.OccupancyComponent_Guest <em>Component Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Occupancy.OccupancyComponent_Guest
	 * @generated
	 */
	public Adapter createOccupancyComponent_GuestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Occupancy.OccupancyComponent_IOccupancy <em>Component IOccupancy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Occupancy.OccupancyComponent_IOccupancy
	 * @generated
	 */
	public Adapter createOccupancyComponent_IOccupancyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Occupancy.OccupancyComponent_OccupancyHandler <em>Component Occupancy Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Occupancy.OccupancyComponent_OccupancyHandler
	 * @generated
	 */
	public Adapter createOccupancyComponent_OccupancyHandlerAdapter() {
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

} //OccupancyAdapterFactory
