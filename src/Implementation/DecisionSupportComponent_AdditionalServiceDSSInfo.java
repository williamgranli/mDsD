/**
 */
package Implementation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Support Component Additional Service DSS Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Implementation.DecisionSupportComponent_AdditionalServiceDSSInfo#getAdditionalServiceName <em>Additional Service Name</em>}</li>
 *   <li>{@link Implementation.DecisionSupportComponent_AdditionalServiceDSSInfo#getAdditionalServicePrice <em>Additional Service Price</em>}</li>
 * </ul>
 * </p>
 *
 * @see Implementation.ImplementationPackage#getDecisionSupportComponent_AdditionalServiceDSSInfo()
 * @model
 * @generated
 */
public interface DecisionSupportComponent_AdditionalServiceDSSInfo extends EObject {

	/**
	 * Returns the value of the '<em><b>Additional Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Service Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Service Name</em>' attribute.
	 * @see #setAdditionalServiceName(String)
	 * @see Implementation.ImplementationPackage#getDecisionSupportComponent_AdditionalServiceDSSInfo_AdditionalServiceName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getAdditionalServiceName();

	/**
	 * Sets the value of the '{@link Implementation.DecisionSupportComponent_AdditionalServiceDSSInfo#getAdditionalServiceName <em>Additional Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Service Name</em>' attribute.
	 * @see #getAdditionalServiceName()
	 * @generated
	 */
	void setAdditionalServiceName(String value);

	/**
	 * Returns the value of the '<em><b>Additional Service Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Service Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Service Price</em>' attribute.
	 * @see #setAdditionalServicePrice(long)
	 * @see Implementation.ImplementationPackage#getDecisionSupportComponent_AdditionalServiceDSSInfo_AdditionalServicePrice()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	long getAdditionalServicePrice();

	/**
	 * Sets the value of the '{@link Implementation.DecisionSupportComponent_AdditionalServiceDSSInfo#getAdditionalServicePrice <em>Additional Service Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Service Price</em>' attribute.
	 * @see #getAdditionalServicePrice()
	 * @generated
	 */
	void setAdditionalServicePrice(long value);
} // DecisionSupportComponent_AdditionalServiceDSSInfo
