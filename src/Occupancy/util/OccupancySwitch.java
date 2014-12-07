/**
 */
package Occupancy.util;

import Occupancy.*;

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
 * @see Occupancy.OccupancyPackage
 * @generated
 */
public class OccupancySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OccupancyPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccupancySwitch() {
		if (modelPackage == null) {
			modelPackage = OccupancyPackage.eINSTANCE;
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
			case OccupancyPackage.OCCUPANCY_COMPONENT: {
				OccupancyComponent occupancyComponent = (OccupancyComponent)theEObject;
				T result = caseOccupancyComponent(occupancyComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OccupancyPackage.OCCUPANCY_COMPONENT_OCCUPANCY: {
				OccupancyComponent_Occupancy occupancyComponent_Occupancy = (OccupancyComponent_Occupancy)theEObject;
				T result = caseOccupancyComponent_Occupancy(occupancyComponent_Occupancy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OccupancyPackage.OCCUPANCY_COMPONENT_GUEST: {
				OccupancyComponent_Guest occupancyComponent_Guest = (OccupancyComponent_Guest)theEObject;
				T result = caseOccupancyComponent_Guest(occupancyComponent_Guest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OccupancyPackage.OCCUPANCY_COMPONENT_IOCCUPANCY: {
				OccupancyComponent_IOccupancy occupancyComponent_IOccupancy = (OccupancyComponent_IOccupancy)theEObject;
				T result = caseOccupancyComponent_IOccupancy(occupancyComponent_IOccupancy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OccupancyPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER: {
				OccupancyComponent_OccupancyHandler occupancyComponent_OccupancyHandler = (OccupancyComponent_OccupancyHandler)theEObject;
				T result = caseOccupancyComponent_OccupancyHandler(occupancyComponent_OccupancyHandler);
				if (result == null) result = caseOccupancyComponent_IOccupancy(occupancyComponent_OccupancyHandler);
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
	public T caseOccupancyComponent(OccupancyComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Occupancy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Occupancy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOccupancyComponent_Occupancy(OccupancyComponent_Occupancy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Guest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Guest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOccupancyComponent_Guest(OccupancyComponent_Guest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component IOccupancy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component IOccupancy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOccupancyComponent_IOccupancy(OccupancyComponent_IOccupancy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Occupancy Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Occupancy Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOccupancyComponent_OccupancyHandler(OccupancyComponent_OccupancyHandler object) {
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

} //OccupancySwitch
