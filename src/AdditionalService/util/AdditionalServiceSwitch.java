/**
 */
package AdditionalService.util;

import AdditionalService.*;

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
 * @see AdditionalService.AdditionalServicePackage
 * @generated
 */
public class AdditionalServiceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AdditionalServicePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalServiceSwitch() {
		if (modelPackage == null) {
			modelPackage = AdditionalServicePackage.eINSTANCE;
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
			case AdditionalServicePackage.ADDITIONAL_SERVICE_COMPONENT: {
				AdditionalServiceComponent additionalServiceComponent = (AdditionalServiceComponent)theEObject;
				T result = caseAdditionalServiceComponent(additionalServiceComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdditionalServicePackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE: {
				AdditionalServiceComponent_AdditionalService additionalServiceComponent_AdditionalService = (AdditionalServiceComponent_AdditionalService)theEObject;
				T result = caseAdditionalServiceComponent_AdditionalService(additionalServiceComponent_AdditionalService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdditionalServicePackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT: {
				AdditionalServiceComponent_AdditionalServiceEvent additionalServiceComponent_AdditionalServiceEvent = (AdditionalServiceComponent_AdditionalServiceEvent)theEObject;
				T result = caseAdditionalServiceComponent_AdditionalServiceEvent(additionalServiceComponent_AdditionalServiceEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdditionalServicePackage.ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION: {
				AdditionalServiceComponent_IAdditionalServiceAdministration additionalServiceComponent_IAdditionalServiceAdministration = (AdditionalServiceComponent_IAdditionalServiceAdministration)theEObject;
				T result = caseAdditionalServiceComponent_IAdditionalServiceAdministration(additionalServiceComponent_IAdditionalServiceAdministration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdditionalServicePackage.ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_INFORMATION: {
				AdditionalServiceComponent_IAdditionalServiceInformation additionalServiceComponent_IAdditionalServiceInformation = (AdditionalServiceComponent_IAdditionalServiceInformation)theEObject;
				T result = caseAdditionalServiceComponent_IAdditionalServiceInformation(additionalServiceComponent_IAdditionalServiceInformation);
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
	public T caseAdditionalServiceComponent(AdditionalServiceComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Additional Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Additional Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionalServiceComponent_AdditionalService(AdditionalServiceComponent_AdditionalService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Additional Service Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Additional Service Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionalServiceComponent_AdditionalServiceEvent(AdditionalServiceComponent_AdditionalServiceEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component IAdditional Service Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component IAdditional Service Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionalServiceComponent_IAdditionalServiceAdministration(AdditionalServiceComponent_IAdditionalServiceAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component IAdditional Service Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component IAdditional Service Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionalServiceComponent_IAdditionalServiceInformation(AdditionalServiceComponent_IAdditionalServiceInformation object) {
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

} //AdditionalServiceSwitch
