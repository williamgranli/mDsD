/**
 */
package AdditionalService;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Additional Service Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link AdditionalService.AdditionalServiceComponent_AdditionalServiceEvent#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link AdditionalService.AdditionalServiceComponent_AdditionalServiceEvent#getName <em>Name</em>}</li>
 *   <li>{@link AdditionalService.AdditionalServiceComponent_AdditionalServiceEvent#getLocation <em>Location</em>}</li>
 *   <li>{@link AdditionalService.AdditionalServiceComponent_AdditionalServiceEvent#getPrice <em>Price</em>}</li>
 *   <li>{@link AdditionalService.AdditionalServiceComponent_AdditionalServiceEvent#getMaxAttendant <em>Max Attendant</em>}</li>
 * </ul>
 * </p>
 *
 * @see AdditionalService.AdditionalServicePackage#getAdditionalServiceComponent_AdditionalServiceEvent()
 * @model
 * @generated
 */
public interface AdditionalServiceComponent_AdditionalServiceEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time</em>' attribute.
	 * @see #setDateTime(Date)
	 * @see AdditionalService.AdditionalServicePackage#getAdditionalServiceComponent_AdditionalServiceEvent_DateTime()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getDateTime();

	/**
	 * Sets the value of the '{@link AdditionalService.AdditionalServiceComponent_AdditionalServiceEvent#getDateTime <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time</em>' attribute.
	 * @see #getDateTime()
	 * @generated
	 */
	void setDateTime(Date value);

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
	 * @see AdditionalService.AdditionalServicePackage#getAdditionalServiceComponent_AdditionalServiceEvent_Name()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link AdditionalService.AdditionalServiceComponent_AdditionalServiceEvent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see AdditionalService.AdditionalServicePackage#getAdditionalServiceComponent_AdditionalServiceEvent_Location()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link AdditionalService.AdditionalServiceComponent_AdditionalServiceEvent#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

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
	 * @see AdditionalService.AdditionalServicePackage#getAdditionalServiceComponent_AdditionalServiceEvent_Price()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getPrice();

	/**
	 * Sets the value of the '{@link AdditionalService.AdditionalServiceComponent_AdditionalServiceEvent#getPrice <em>Price</em>}' attribute.
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
	 * @see AdditionalService.AdditionalServicePackage#getAdditionalServiceComponent_AdditionalServiceEvent_MaxAttendant()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getMaxAttendant();

	/**
	 * Sets the value of the '{@link AdditionalService.AdditionalServiceComponent_AdditionalServiceEvent#getMaxAttendant <em>Max Attendant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Attendant</em>' attribute.
	 * @see #getMaxAttendant()
	 * @generated
	 */
	void setMaxAttendant(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model addtionalServiceNameDataType="org.eclipse.uml2.types.String" addtionalServiceNameRequired="true" addtionalServiceNameOrdered="false"
	 * @generated
	 */
	void getAdditionalServiceInfo(String addtionalServiceName);

} // AdditionalServiceComponent_AdditionalServiceEvent
