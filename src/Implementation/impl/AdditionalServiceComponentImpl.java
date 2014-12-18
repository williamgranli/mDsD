/**
 */
package Implementation.impl;

import Implementation.AdditionalServiceComponent;
import Implementation.AdditionalServiceComponent_IEventManagement;
import Implementation.ImplementationPackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Additional Service Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AdditionalServiceComponentImpl extends MinimalEObjectImpl.Container implements AdditionalServiceComponent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdditionalServiceComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.ADDITIONAL_SERVICE_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean createAdditionalService(String name, boolean usable, int price, String description) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean editAdditionalService(String oldName, String name, boolean usable, int price, String description) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean removeAdditionalService(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean createEvent(String name, Date dateTime, String location, int maxAttendants, int currentAttendants) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean editEvent(String name, Date dateTime, String location, int maxAttendants, int currentAttendants) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean removeEvent(String name, Date dateTime, String location) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean removeEvents(String name, Date dateTime) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getServices() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEvents(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean addGuestToEvent(String name, Date dateTime, String location, int guests) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean removeGuestsFromEvent(String name, Date dateTime, String location, int guests) {
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == AdditionalServiceComponent_IEventManagement.class) {
			switch (baseOperationID) {
				case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_IEVENT_MANAGEMENT___GET_SERVICES: return ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT___GET_SERVICES;
				case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_IEVENT_MANAGEMENT___GET_EVENTS__STRING: return ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT___GET_EVENTS__STRING;
				case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_IEVENT_MANAGEMENT___ADD_GUEST_TO_EVENT__STRING_DATE_STRING_INT: return ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT___ADD_GUEST_TO_EVENT__STRING_DATE_STRING_INT;
				case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_IEVENT_MANAGEMENT___REMOVE_GUESTS_FROM_EVENT__STRING_DATE_STRING_INT: return ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT___REMOVE_GUESTS_FROM_EVENT__STRING_DATE_STRING_INT;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT___CREATE_ADDITIONAL_SERVICE__STRING_BOOLEAN_INT_STRING:
				return createAdditionalService((String)arguments.get(0), (Boolean)arguments.get(1), (Integer)arguments.get(2), (String)arguments.get(3));
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT___EDIT_ADDITIONAL_SERVICE__STRING_STRING_BOOLEAN_INT_STRING:
				return editAdditionalService((String)arguments.get(0), (String)arguments.get(1), (Boolean)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4));
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT___REMOVE_ADDITIONAL_SERVICE__STRING:
				return removeAdditionalService((String)arguments.get(0));
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT___CREATE_EVENT__STRING_DATE_STRING_INT_INT:
				return createEvent((String)arguments.get(0), (Date)arguments.get(1), (String)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT___EDIT_EVENT__STRING_DATE_STRING_INT_INT:
				return editEvent((String)arguments.get(0), (Date)arguments.get(1), (String)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT___REMOVE_EVENT__STRING_DATE_STRING:
				return removeEvent((String)arguments.get(0), (Date)arguments.get(1), (String)arguments.get(2));
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT___REMOVE_EVENTS__STRING_DATE:
				return removeEvents((String)arguments.get(0), (Date)arguments.get(1));
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT___GET_SERVICES:
				return getServices();
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT___GET_EVENTS__STRING:
				return getEvents((String)arguments.get(0));
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT___ADD_GUEST_TO_EVENT__STRING_DATE_STRING_INT:
				return addGuestToEvent((String)arguments.get(0), (Date)arguments.get(1), (String)arguments.get(2), (Integer)arguments.get(3));
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT___REMOVE_GUESTS_FROM_EVENT__STRING_DATE_STRING_INT:
				return removeGuestsFromEvent((String)arguments.get(0), (Date)arguments.get(1), (String)arguments.get(2), (Integer)arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AdditionalServiceComponentImpl
