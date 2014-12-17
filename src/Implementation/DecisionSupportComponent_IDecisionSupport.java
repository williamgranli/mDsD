/**
 */
package Implementation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Support Component IDecision Support</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Implementation.ImplementationPackage#getDecisionSupportComponent_IDecisionSupport()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface DecisionSupportComponent_IDecisionSupport extends EObject {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getDSSData();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getAllRoomTypeFrequency();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	String getRoomTypeFrequency(String roomType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" bookingDSSInfoMany="true" bookingDSSInfoOrdered="false" roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	int countRoomType(EList<DecisionSupportComponent_BookingDSSInfo> bookingDSSInfo, String roomType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getAllCustomerBookingFrequency();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" customerSSNDataType="org.eclipse.uml2.types.String" customerSSNRequired="true" customerSSNOrdered="false"
	 * @generated
	 */
	String getCustomerBookingFrequency(String customerSSN);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getDSSOccupancyInfo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomNumberDataType="org.eclipse.uml2.types.Integer" roomNumberRequired="true" roomNumberOrdered="false"
	 * @generated
	 */
	int getNumberOfOccupanciesOfRoom(int roomNumber);
} // DecisionSupportComponent_IDecisionSupport
