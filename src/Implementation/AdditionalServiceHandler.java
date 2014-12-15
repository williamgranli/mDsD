/**
 */
package Implementation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additional Service Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Implementation.AdditionalServiceHandler#getIAuthentication <em>IAuthentication</em>}</li>
 *   <li>{@link Implementation.AdditionalServiceHandler#getAdditionalService <em>Additional Service</em>}</li>
 *   <li>{@link Implementation.AdditionalServiceHandler#getAdditionalServiceEvent <em>Additional Service Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see Implementation.ImplementationPackage#getAdditionalServiceHandler()
 * @model
 * @generated
 */
public interface AdditionalServiceHandler extends AdditionalServiceComponent_IAdditionalServiceInformation, AdditionalServiceComponent_IAdditionalServiceDecision, AdditionalServiceComponent_IAdditionalServiceAdministration {
	/**
	 * Returns the value of the '<em><b>IAuthentication</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IAuthentication</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IAuthentication</em>' reference.
	 * @see #setIAuthentication(StaffComponent_IAuthentication)
	 * @see Implementation.ImplementationPackage#getAdditionalServiceHandler_IAuthentication()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StaffComponent_IAuthentication getIAuthentication();

	/**
	 * Sets the value of the '{@link Implementation.AdditionalServiceHandler#getIAuthentication <em>IAuthentication</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IAuthentication</em>' reference.
	 * @see #getIAuthentication()
	 * @generated
	 */
	void setIAuthentication(StaffComponent_IAuthentication value);

	/**
	 * Returns the value of the '<em><b>Additional Service</b></em>' reference list.
	 * The list contents are of type {@link Implementation.AdditionalServiceComponent_AdditionalService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Service</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Service</em>' reference list.
	 * @see Implementation.ImplementationPackage#getAdditionalServiceHandler_AdditionalService()
	 * @model ordered="false"
	 * @generated
	 */
	EList<AdditionalServiceComponent_AdditionalService> getAdditionalService();

	/**
	 * Returns the value of the '<em><b>Additional Service Event</b></em>' reference list.
	 * The list contents are of type {@link Implementation.AdditionalServiceComponent_AdditionalServiceEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Service Event</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Service Event</em>' reference list.
	 * @see Implementation.ImplementationPackage#getAdditionalServiceHandler_AdditionalServiceEvent()
	 * @model ordered="false"
	 * @generated
	 */
	EList<AdditionalServiceComponent_AdditionalServiceEvent> getAdditionalServiceEvent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	AdditionalServiceComponent_AdditionalService findService(String name);

} // AdditionalServiceHandler
