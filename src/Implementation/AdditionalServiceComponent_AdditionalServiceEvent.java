/**
 */
package Implementation;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additional Service Component Additional Service Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Implementation.AdditionalServiceComponent_AdditionalServiceEvent#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link Implementation.AdditionalServiceComponent_AdditionalServiceEvent#getLocation <em>Location</em>}</li>
 *   <li>{@link Implementation.AdditionalServiceComponent_AdditionalServiceEvent#getMaxAttendant <em>Max Attendant</em>}</li>
 *   <li>{@link Implementation.AdditionalServiceComponent_AdditionalServiceEvent#getCurrentAttendants <em>Current Attendants</em>}</li>
 * </ul>
 * </p>
 *
 * @see Implementation.ImplementationPackage#getAdditionalServiceComponent_AdditionalServiceEvent()
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
	 * @see Implementation.ImplementationPackage#getAdditionalServiceComponent_AdditionalServiceEvent_DateTime()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getDateTime();

	/**
	 * Sets the value of the '{@link Implementation.AdditionalServiceComponent_AdditionalServiceEvent#getDateTime <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time</em>' attribute.
	 * @see #getDateTime()
	 * @generated
	 */
	void setDateTime(Date value);

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
	 * @see Implementation.ImplementationPackage#getAdditionalServiceComponent_AdditionalServiceEvent_Location()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link Implementation.AdditionalServiceComponent_AdditionalServiceEvent#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

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
	 * @see Implementation.ImplementationPackage#getAdditionalServiceComponent_AdditionalServiceEvent_MaxAttendant()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getMaxAttendant();

	/**
	 * Sets the value of the '{@link Implementation.AdditionalServiceComponent_AdditionalServiceEvent#getMaxAttendant <em>Max Attendant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Attendant</em>' attribute.
	 * @see #getMaxAttendant()
	 * @generated
	 */
	void setMaxAttendant(int value);

	/**
	 * Returns the value of the '<em><b>Current Attendants</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Attendants</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Attendants</em>' attribute.
	 * @see #setCurrentAttendants(int)
	 * @see Implementation.ImplementationPackage#getAdditionalServiceComponent_AdditionalServiceEvent_CurrentAttendants()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getCurrentAttendants();

	/**
	 * Sets the value of the '{@link Implementation.AdditionalServiceComponent_AdditionalServiceEvent#getCurrentAttendants <em>Current Attendants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Attendants</em>' attribute.
	 * @see #getCurrentAttendants()
	 * @generated
	 */
	void setCurrentAttendants(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model addtionalServiceNameDataType="org.eclipse.uml2.types.String" addtionalServiceNameRequired="true" addtionalServiceNameOrdered="false"
	 * @generated
	 */
	void getAdditionalServiceInfo(String addtionalServiceName);

} // AdditionalServiceComponent_AdditionalServiceEvent
