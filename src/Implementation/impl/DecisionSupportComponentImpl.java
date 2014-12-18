/**
 */
package Implementation.impl;

import Implementation.DecisionSupportComponent;
import Implementation.DecisionSupportComponent_BookingDSSInfo;
import Implementation.ImplementationPackage;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision Support Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DecisionSupportComponentImpl extends MinimalEObjectImpl.Container implements DecisionSupportComponent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionSupportComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.DECISION_SUPPORT_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getDSSData() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAllRoomTypeFrequency() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoomTypeFrequency(String roomType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int countRoomType(EList<DecisionSupportComponent_BookingDSSInfo> bookingDSSInfo, String roomType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAllCustomerBookingFrequency() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomerBookingFrequency(String customerSSN) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getDSSOccupancyInfo() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfOccupanciesOfRoom(int roomNumber) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT___GET_DSS_DATA:
				getDSSData();
				return null;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT___GET_ALL_ROOM_TYPE_FREQUENCY:
				return getAllRoomTypeFrequency();
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT___GET_ROOM_TYPE_FREQUENCY__STRING:
				return getRoomTypeFrequency((String)arguments.get(0));
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT___COUNT_ROOM_TYPE__ELIST_STRING:
				return countRoomType((EList<DecisionSupportComponent_BookingDSSInfo>)arguments.get(0), (String)arguments.get(1));
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT___GET_ALL_CUSTOMER_BOOKING_FREQUENCY:
				return getAllCustomerBookingFrequency();
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT___GET_CUSTOMER_BOOKING_FREQUENCY__STRING:
				return getCustomerBookingFrequency((String)arguments.get(0));
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT___GET_DSS_OCCUPANCY_INFO:
				getDSSOccupancyInfo();
				return null;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT___GET_NUMBER_OF_OCCUPANCIES_OF_ROOM__INT:
				return getNumberOfOccupanciesOfRoom((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //DecisionSupportComponentImpl
