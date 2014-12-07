/**
 */
package AdditionalService.util;

import AdditionalService.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see AdditionalService.AdditionalServicePackage
 * @generated
 */
public class AdditionalServiceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AdditionalServicePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalServiceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AdditionalServicePackage.eINSTANCE;
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
	protected AdditionalServiceSwitch<Adapter> modelSwitch =
		new AdditionalServiceSwitch<Adapter>() {
			@Override
			public Adapter caseAdditionalServiceComponent(AdditionalServiceComponent object) {
				return createAdditionalServiceComponentAdapter();
			}
			@Override
			public Adapter caseAdditionalServiceComponent_AdditionalService(AdditionalServiceComponent_AdditionalService object) {
				return createAdditionalServiceComponent_AdditionalServiceAdapter();
			}
			@Override
			public Adapter caseAdditionalServiceComponent_AdditionalServiceEvent(AdditionalServiceComponent_AdditionalServiceEvent object) {
				return createAdditionalServiceComponent_AdditionalServiceEventAdapter();
			}
			@Override
			public Adapter caseAdditionalServiceComponent_IAdditionalServiceAdministration(AdditionalServiceComponent_IAdditionalServiceAdministration object) {
				return createAdditionalServiceComponent_IAdditionalServiceAdministrationAdapter();
			}
			@Override
			public Adapter caseAdditionalServiceComponent_IAdditionalServiceInformation(AdditionalServiceComponent_IAdditionalServiceInformation object) {
				return createAdditionalServiceComponent_IAdditionalServiceInformationAdapter();
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
	 * Creates a new adapter for an object of class '{@link AdditionalService.AdditionalServiceComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AdditionalService.AdditionalServiceComponent
	 * @generated
	 */
	public Adapter createAdditionalServiceComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AdditionalService.AdditionalServiceComponent_AdditionalService <em>Component Additional Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AdditionalService.AdditionalServiceComponent_AdditionalService
	 * @generated
	 */
	public Adapter createAdditionalServiceComponent_AdditionalServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AdditionalService.AdditionalServiceComponent_AdditionalServiceEvent <em>Component Additional Service Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AdditionalService.AdditionalServiceComponent_AdditionalServiceEvent
	 * @generated
	 */
	public Adapter createAdditionalServiceComponent_AdditionalServiceEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AdditionalService.AdditionalServiceComponent_IAdditionalServiceAdministration <em>Component IAdditional Service Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AdditionalService.AdditionalServiceComponent_IAdditionalServiceAdministration
	 * @generated
	 */
	public Adapter createAdditionalServiceComponent_IAdditionalServiceAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AdditionalService.AdditionalServiceComponent_IAdditionalServiceInformation <em>Component IAdditional Service Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AdditionalService.AdditionalServiceComponent_IAdditionalServiceInformation
	 * @generated
	 */
	public Adapter createAdditionalServiceComponent_IAdditionalServiceInformationAdapter() {
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

} //AdditionalServiceAdapterFactory
