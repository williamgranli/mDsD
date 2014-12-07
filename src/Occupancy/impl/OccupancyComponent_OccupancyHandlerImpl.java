/**
 */
package Occupancy.impl;

import Occupancy.OccupancyComponent_OccupancyHandler;
import Occupancy.OccupancyPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Occupancy Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OccupancyComponent_OccupancyHandlerImpl extends MinimalEObjectImpl.Container implements OccupancyComponent_OccupancyHandler {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OccupancyComponent_OccupancyHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OccupancyPackage.Literals.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkInGuest(String bookingReference, String firstName, String lastName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkOutGuest(String bookingReference, String firstName, String lastName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void listFreeRooms() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void listGuestsInRoom(int roomNumber) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void numberOfGuestsInHotel() {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OccupancyPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___CHECK_IN_GUEST__STRING_STRING_STRING:
				checkInGuest((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
				return null;
			case OccupancyPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___CHECK_OUT_GUEST__STRING_STRING_STRING:
				checkOutGuest((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
				return null;
			case OccupancyPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___LIST_FREE_ROOMS:
				listFreeRooms();
				return null;
			case OccupancyPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___LIST_GUESTS_IN_ROOM__INT:
				listGuestsInRoom((Integer)arguments.get(0));
				return null;
			case OccupancyPackage.OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER___NUMBER_OF_GUESTS_IN_HOTEL:
				numberOfGuestsInHotel();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //OccupancyComponent_OccupancyHandlerImpl
