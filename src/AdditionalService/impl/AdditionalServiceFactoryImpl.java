/**
 */
package AdditionalService.impl;

import AdditionalService.*;

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
public class AdditionalServiceFactoryImpl extends EFactoryImpl implements AdditionalServiceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AdditionalServiceFactory init() {
		try {
			AdditionalServiceFactory theAdditionalServiceFactory = (AdditionalServiceFactory)EPackage.Registry.INSTANCE.getEFactory(AdditionalServicePackage.eNS_URI);
			if (theAdditionalServiceFactory != null) {
				return theAdditionalServiceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AdditionalServiceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalServiceFactoryImpl() {
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
			case AdditionalServicePackage.ADDITIONAL_SERVICE_COMPONENT: return createAdditionalServiceComponent();
			case AdditionalServicePackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE: return createAdditionalServiceComponent_AdditionalService();
			case AdditionalServicePackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT: return createAdditionalServiceComponent_AdditionalServiceEvent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalServiceComponent createAdditionalServiceComponent() {
		AdditionalServiceComponentImpl additionalServiceComponent = new AdditionalServiceComponentImpl();
		return additionalServiceComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalServiceComponent_AdditionalService createAdditionalServiceComponent_AdditionalService() {
		AdditionalServiceComponent_AdditionalServiceImpl additionalServiceComponent_AdditionalService = new AdditionalServiceComponent_AdditionalServiceImpl();
		return additionalServiceComponent_AdditionalService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalServiceComponent_AdditionalServiceEvent createAdditionalServiceComponent_AdditionalServiceEvent() {
		AdditionalServiceComponent_AdditionalServiceEventImpl additionalServiceComponent_AdditionalServiceEvent = new AdditionalServiceComponent_AdditionalServiceEventImpl();
		return additionalServiceComponent_AdditionalServiceEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalServicePackage getAdditionalServicePackage() {
		return (AdditionalServicePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AdditionalServicePackage getPackage() {
		return AdditionalServicePackage.eINSTANCE;
	}

} //AdditionalServiceFactoryImpl
