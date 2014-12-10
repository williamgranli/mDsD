/**
 */
package implementation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additional Service Component Additional Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link implementation.AdditionalServiceComponent_AdditionalService#getName <em>Name</em>}</li>
 *   <li>{@link implementation.AdditionalServiceComponent_AdditionalService#isUsable <em>Usable</em>}</li>
 *   <li>{@link implementation.AdditionalServiceComponent_AdditionalService#getPrice <em>Price</em>}</li>
 *   <li>{@link implementation.AdditionalServiceComponent_AdditionalService#getMaxAttendant <em>Max Attendant</em>}</li>
 *   <li>{@link implementation.AdditionalServiceComponent_AdditionalService#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see implementation.ImplementationPackage#getAdditionalServiceComponent_AdditionalService()
 * @model
 * @generated
 */
public interface AdditionalServiceComponent_AdditionalService extends AdditionalServiceComponent_IAdditionalServiceDecision {
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
	 * @see implementation.ImplementationPackage#getAdditionalServiceComponent_AdditionalService_Name()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link implementation.AdditionalServiceComponent_AdditionalService#getName <em>Name</em>}' attribute.
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
	 * @see implementation.ImplementationPackage#getAdditionalServiceComponent_AdditionalService_Usable()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isUsable();

	/**
	 * Sets the value of the '{@link implementation.AdditionalServiceComponent_AdditionalService#isUsable <em>Usable</em>}' attribute.
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
	 * @see implementation.ImplementationPackage#getAdditionalServiceComponent_AdditionalService_Price()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getPrice();

	/**
	 * Sets the value of the '{@link implementation.AdditionalServiceComponent_AdditionalService#getPrice <em>Price</em>}' attribute.
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
	 * @see implementation.ImplementationPackage#getAdditionalServiceComponent_AdditionalService_MaxAttendant()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getMaxAttendant();

	/**
	 * Sets the value of the '{@link implementation.AdditionalServiceComponent_AdditionalService#getMaxAttendant <em>Max Attendant</em>}' attribute.
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
	 * @see implementation.ImplementationPackage#getAdditionalServiceComponent_AdditionalService_Description()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link implementation.AdditionalServiceComponent_AdditionalService#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // AdditionalServiceComponent_AdditionalService
