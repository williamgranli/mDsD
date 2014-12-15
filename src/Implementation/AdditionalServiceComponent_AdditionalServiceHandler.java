/**
 */
package Implementation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additional Service Component Additional Service Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Implementation.AdditionalServiceComponent_AdditionalServiceHandler#getAdditionalService <em>Additional Service</em>}</li>
 *   <li>{@link Implementation.AdditionalServiceComponent_AdditionalServiceHandler#getIAuthentication <em>IAuthentication</em>}</li>
 * </ul>
 * </p>
 *
 * @see Implementation.ImplementationPackage#getAdditionalServiceComponent_AdditionalServiceHandler()
 * @model
 * @generated
 */
public interface AdditionalServiceComponent_AdditionalServiceHandler extends AdditionalServiceComponent_IAdditionalServiceInformation, AdditionalServiceComponent_IAdditionalServiceDecision, AdditionalServiceComponent_IAdditionalServiceAdministration {
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
	 * @see Implementation.ImplementationPackage#getAdditionalServiceComponent_AdditionalServiceHandler_IAuthentication()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StaffComponent_IAuthentication getIAuthentication();

	/**
	 * Sets the value of the '{@link Implementation.AdditionalServiceComponent_AdditionalServiceHandler#getIAuthentication <em>IAuthentication</em>}' reference.
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
	 * @see Implementation.ImplementationPackage#getAdditionalServiceComponent_AdditionalServiceHandler_AdditionalService()
	 * @model ordered="false"
	 * @generated
	 */
	EList<AdditionalServiceComponent_AdditionalService> getAdditionalService();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	AdditionalServiceComponent_AdditionalService findService(String name);

} // AdditionalServiceComponent_AdditionalServiceHandler
