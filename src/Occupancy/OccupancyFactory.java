/**
 */
package Occupancy;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Occupancy.OccupancyPackage
 * @generated
 */
public interface OccupancyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OccupancyFactory eINSTANCE = Occupancy.impl.OccupancyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	OccupancyComponent createOccupancyComponent();

	/**
	 * Returns a new object of class '<em>Component Occupancy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Occupancy</em>'.
	 * @generated
	 */
	OccupancyComponent_Occupancy createOccupancyComponent_Occupancy();

	/**
	 * Returns a new object of class '<em>Component Guest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Guest</em>'.
	 * @generated
	 */
	OccupancyComponent_Guest createOccupancyComponent_Guest();

	/**
	 * Returns a new object of class '<em>Component Occupancy Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Occupancy Handler</em>'.
	 * @generated
	 */
	OccupancyComponent_OccupancyHandler createOccupancyComponent_OccupancyHandler();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OccupancyPackage getOccupancyPackage();

} //OccupancyFactory
