/**
 */
package AdditionalService;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Additional Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link AdditionalService.AdditionalServiceComponent_AdditionalService#getName <em>Name</em>}</li>
 *   <li>{@link AdditionalService.AdditionalServiceComponent_AdditionalService#isUsable <em>Usable</em>}</li>
 *   <li>{@link AdditionalService.AdditionalServiceComponent_AdditionalService#getPrice <em>Price</em>}</li>
 *   <li>{@link AdditionalService.AdditionalServiceComponent_AdditionalService#getMaxAttendant <em>Max Attendant</em>}</li>
 *   <li>{@link AdditionalService.AdditionalServiceComponent_AdditionalService#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see AdditionalService.AdditionalServicePackage#getAdditionalServiceComponent_AdditionalService()
 * @model
 * @generated
 */
public interface AdditionalServiceComponent_AdditionalService extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see AdditionalService.AdditionalServicePackage#getAdditionalServiceComponent_AdditionalService_Name()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link AdditionalService.AdditionalServiceComponent_AdditionalService#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Usable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usable</em>' attribute.
	 * @see #setUsable(boolean)
	 * @see AdditionalService.AdditionalServicePackage#getAdditionalServiceComponent_AdditionalService_Usable()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isUsable();

	/**
	 * Sets the value of the '{@link AdditionalService.AdditionalServiceComponent_AdditionalService#isUsable <em>Usable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usable</em>' attribute.
	 * @see #isUsable()
	 * @generated
	 */
	void setUsable(boolean value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(int)
	 * @see AdditionalService.AdditionalServicePackage#getAdditionalServiceComponent_AdditionalService_Price()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getPrice();

	/**
	 * Sets the value of the '{@link AdditionalService.AdditionalServiceComponent_AdditionalService#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(int value);

	/**
	 * Returns the value of the '<em><b>Max Attendant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Attendant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Attendant</em>' attribute.
	 * @see #setMaxAttendant(int)
	 * @see AdditionalService.AdditionalServicePackage#getAdditionalServiceComponent_AdditionalService_MaxAttendant()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getMaxAttendant();

	/**
	 * Sets the value of the '{@link AdditionalService.AdditionalServiceComponent_AdditionalService#getMaxAttendant <em>Max Attendant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Attendant</em>' attribute.
	 * @see #getMaxAttendant()
	 * @generated
	 */
	void setMaxAttendant(int value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see AdditionalService.AdditionalServicePackage#getAdditionalServiceComponent_AdditionalService_Description()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link AdditionalService.AdditionalServiceComponent_AdditionalService#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // AdditionalServiceComponent_AdditionalService
