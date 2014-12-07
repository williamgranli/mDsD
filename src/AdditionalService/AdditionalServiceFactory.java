/**
 */
package AdditionalService;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see AdditionalService.AdditionalServicePackage
 * @generated
 */
public interface AdditionalServiceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AdditionalServiceFactory eINSTANCE = AdditionalService.impl.AdditionalServiceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	AdditionalServiceComponent createAdditionalServiceComponent();

	/**
	 * Returns a new object of class '<em>Component Additional Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Additional Service</em>'.
	 * @generated
	 */
	AdditionalServiceComponent_AdditionalService createAdditionalServiceComponent_AdditionalService();

	/**
	 * Returns a new object of class '<em>Component Additional Service Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Additional Service Event</em>'.
	 * @generated
	 */
	AdditionalServiceComponent_AdditionalServiceEvent createAdditionalServiceComponent_AdditionalServiceEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AdditionalServicePackage getAdditionalServicePackage();

} //AdditionalServiceFactory
