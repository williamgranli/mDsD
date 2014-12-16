/**
 */
package Implementation;

import java.util.Date;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additional Service Component Additional Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Implementation.AdditionalServiceComponent_AdditionalService#getName <em>Name</em>}</li>
 *   <li>{@link Implementation.AdditionalServiceComponent_AdditionalService#isUsable <em>Usable</em>}</li>
 *   <li>{@link Implementation.AdditionalServiceComponent_AdditionalService#getPrice <em>Price</em>}</li>
 *   <li>{@link Implementation.AdditionalServiceComponent_AdditionalService#getDescription <em>Description</em>}</li>
 *   <li>{@link Implementation.AdditionalServiceComponent_AdditionalService#getAdditionalServiceEvent <em>Additional Service Event</em>}</li>
 *   <li>{@link Implementation.AdditionalServiceComponent_AdditionalService#getTempEvents <em>Temp Events</em>}</li>
 * </ul>
 * </p>
 *
 * @see Implementation.ImplementationPackage#getAdditionalServiceComponent_AdditionalService()
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
	 * @see Implementation.ImplementationPackage#getAdditionalServiceComponent_AdditionalService_Name()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Implementation.AdditionalServiceComponent_AdditionalService#getName <em>Name</em>}' attribute.
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
	 * @see Implementation.ImplementationPackage#getAdditionalServiceComponent_AdditionalService_Usable()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isUsable();

	/**
	 * Sets the value of the '{@link Implementation.AdditionalServiceComponent_AdditionalService#isUsable <em>Usable</em>}' attribute.
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
	 * @see Implementation.ImplementationPackage#getAdditionalServiceComponent_AdditionalService_Price()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getPrice();

	/**
	 * Sets the value of the '{@link Implementation.AdditionalServiceComponent_AdditionalService#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(int value);

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
	 * @see Implementation.ImplementationPackage#getAdditionalServiceComponent_AdditionalService_Description()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link Implementation.AdditionalServiceComponent_AdditionalService#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Additional Service Event</b></em>' reference list.
	 * The list contents are of type {@link Implementation.AdditionalServiceComponent_AdditionalServiceEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Service Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Service Event</em>' reference list.
	 * @see Implementation.ImplementationPackage#getAdditionalServiceComponent_AdditionalService_AdditionalServiceEvent()
	 * @model ordered="false"
	 * @generated
	 */
	EList<AdditionalServiceComponent_AdditionalServiceEvent> getAdditionalServiceEvent();

	/**
	 * Returns the value of the '<em><b>Temp Events</b></em>' reference list.
	 * The list contents are of type {@link Implementation.AdditionalServiceComponent_AdditionalServiceEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temp Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temp Events</em>' reference list.
	 * @see Implementation.ImplementationPackage#getAdditionalServiceComponent_AdditionalService_TempEvents()
	 * @model ordered="false"
	 * @generated
	 */
	EList<AdditionalServiceComponent_AdditionalServiceEvent> getTempEvents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" dateRequired="true" dateOrdered="false" locationDataType="org.eclipse.uml2.types.String" locationRequired="true" locationOrdered="false"
	 * @generated
	 */
	AdditionalServiceComponent_AdditionalServiceEvent findEvent(Date date, String location);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" dateTimeRequired="true" dateTimeOrdered="false"
	 * @generated
	 */
	AdditionalServiceComponent_AdditionalServiceEvent findEvents(Date dateTime);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" dateTimeRequired="true" dateTimeOrdered="false" locationDataType="org.eclipse.uml2.types.String" locationRequired="true" locationOrdered="false" maxAttendantsDataType="org.eclipse.uml2.types.Integer" maxAttendantsRequired="true" maxAttendantsOrdered="false" currentAttendantsDataType="org.eclipse.uml2.types.Integer" currentAttendantsRequired="true" currentAttendantsOrdered="false"
	 * @generated
	 */
	boolean createEvent(Date dateTime, String location, int maxAttendants, int currentAttendants);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" dateTimeRequired="true" dateTimeOrdered="false" locationDataType="org.eclipse.uml2.types.String" locationRequired="true" locationOrdered="false" maxAttendantsDataType="org.eclipse.uml2.types.Integer" maxAttendantsRequired="true" maxAttendantsOrdered="false" currentAttendantsDataType="org.eclipse.uml2.types.Integer" currentAttendantsRequired="true" currentAttendantsOrdered="false"
	 * @generated
	 */
	boolean editEvent(Date dateTime, String location, int maxAttendants, int currentAttendants);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" dateRequired="true" dateOrdered="false" locationDataType="org.eclipse.uml2.types.String" locationRequired="true" locationOrdered="false"
	 * @generated
	 */
	boolean removeEvent(Date date, String location);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" dateRequired="true" dateOrdered="false"
	 * @generated
	 */
	boolean removeEvents(Date date);

} // AdditionalServiceComponent_AdditionalService
