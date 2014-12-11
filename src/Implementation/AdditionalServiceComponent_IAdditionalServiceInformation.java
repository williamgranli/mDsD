/**
 */
package Implementation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additional Service Component IAdditional Service Information</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Implementation.ImplementationPackage#getAdditionalServiceComponent_IAdditionalServiceInformation()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AdditionalServiceComponent_IAdditionalServiceInformation extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	void getAdditionalServiceInfo(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getAllAdditionalServices();

} // AdditionalServiceComponent_IAdditionalServiceInformation
