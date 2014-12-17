/**
 */
package Implementation.impl;

import Implementation.AdditionalServiceComponent_AdditionalService;
import Implementation.AdditionalServiceComponent_AdditionalServiceHandler;
import Implementation.AdditionalServiceComponent_IAdditionalServiceAdministration;
import Implementation.AdditionalServiceComponent_IAdditionalServiceDecision;
import Implementation.ImplementationPackage;
import Implementation.StaffComponent_IAuthentication;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Additional Service Component Additional Service Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Implementation.impl.AdditionalServiceComponent_AdditionalServiceHandlerImpl#getAdditionalService <em>Additional Service</em>}</li>
 *   <li>{@link Implementation.impl.AdditionalServiceComponent_AdditionalServiceHandlerImpl#getIAuthentication <em>IAuthentication</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdditionalServiceComponent_AdditionalServiceHandlerImpl extends MinimalEObjectImpl.Container implements AdditionalServiceComponent_AdditionalServiceHandler {
	/**
	 * The cached value of the '{@link #getAdditionalService() <em>Additional Service</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalService()
	 * @generated
	 * @ordered
	 */
	protected EList<AdditionalServiceComponent_AdditionalService> additionalService;

	/**
	 * The cached value of the '{@link #getIAuthentication() <em>IAuthentication</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIAuthentication()
	 * @generated
	 * @ordered
	 */
	protected StaffComponent_IAuthentication iAuthentication;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected AdditionalServiceComponent_AdditionalServiceHandlerImpl() {
		super();
		this.additionalService = getAdditionalService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdditionalServiceComponent_AdditionalService> getAdditionalService() {
		if (additionalService == null) {
			additionalService = new EObjectResolvingEList<AdditionalServiceComponent_AdditionalService>(AdditionalServiceComponent_AdditionalService.class, this, ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER__ADDITIONAL_SERVICE);
		}
		return additionalService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffComponent_IAuthentication getIAuthentication() {
		if (iAuthentication != null && iAuthentication.eIsProxy()) {
			InternalEObject oldIAuthentication = (InternalEObject)iAuthentication;
			iAuthentication = (StaffComponent_IAuthentication)eResolveProxy(oldIAuthentication);
			if (iAuthentication != oldIAuthentication) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER__IAUTHENTICATION, oldIAuthentication, iAuthentication));
			}
		}
		return iAuthentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffComponent_IAuthentication basicGetIAuthentication() {
		return iAuthentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIAuthentication(StaffComponent_IAuthentication newIAuthentication) {
		StaffComponent_IAuthentication oldIAuthentication = iAuthentication;
		iAuthentication = newIAuthentication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER__IAUTHENTICATION, oldIAuthentication, iAuthentication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> getServices() {
		EList<String> result = new EObjectResolvingEList<String>(AdditionalServiceComponent_AdditionalService.class, this, ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER__ADDITIONAL_SERVICE);
		for (AdditionalServiceComponent_AdditionalService s : additionalService) {
			result.add(s.getName());
		}
		if (result.isEmpty()) {
			result.add("No additional services found...");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> getEvents(String name) {
		AdditionalServiceComponent_AdditionalService service = findService(name);
		if (service != null) {
			for (AdditionalServiceComponent_AdditionalServiceEvent e : service.getAdditionalServiceEvent()) {
				
			}
			//return service.toString();
		} else {
			//return "No service found (" + name + ")";
		}
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
	 * @generated NOT
	 */
	public boolean createAdditionalService(String name, boolean usable, int price, String description) {
		AdditionalServiceComponent_AdditionalService service = findService(name);
		if (service == null) {
			additionalService.add(new AdditionalServiceComponent_AdditionalServiceImpl(name, usable, price, description));
			System.out.println("A service with the name \"" + name + "\" was created!");
			return true;
		} else {
			System.out.println("ERROR: A service with the name \"" + name + "\" already exist...");
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean editAdditionalService(String oldName, String name, boolean usable, int price, String description) {
		AdditionalServiceComponent_AdditionalService service = findService(oldName);
		if (service != null) {
			if (removeAdditionalService(oldName)) {
				return createAdditionalService(name, usable, price, description);
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean removeAdditionalService(String name) {
		AdditionalServiceComponent_AdditionalService service = findService(name);
		if (service == null) {
			System.out.println("A service with the name \"" + name + "\" does not exist...");
			return false;
		} else {
			additionalService.remove(service);
			System.out.println("A service with the name \"" + name + "\" was removed!");
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean createEvent(String name, Date dateTime, String location, int maxAttendants, int currentAttendants) {
		AdditionalServiceComponent_AdditionalService service = findService(name);
		if (service == null) {
			System.out.println("A service with name " + name + " does not exist. Creating...");
			if (createAdditionalService(name,true,0,"description")) {
				service = findService(name);
			} else {
				return false;
			}
		}
		if (service.createEvent(dateTime,location,maxAttendants,currentAttendants)) {
			return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean editEvent(String name, Date dateTime, String location, int maxAttendants, int currentAttendants) {
		AdditionalServiceComponent_AdditionalService service = findService(name);
		if (service != null) {
			if(service.editEvent(dateTime,location,maxAttendants,currentAttendants)){
				return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean removeEvent(String name, Date dateTime, String location) {
		AdditionalServiceComponent_AdditionalService service = findService(name);
		if (service != null) {
			if (service.removeEvent(dateTime,location)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean removeEvents(String name, Date dateTime) {
		AdditionalServiceComponent_AdditionalService service = findService(name);
		if (service != null) {
			if (service.removeEvents(dateTime)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public AdditionalServiceComponent_AdditionalService findService(String name) {
		for (AdditionalServiceComponent_AdditionalService s : additionalService) {
			if (s.getName() == name) {
				return s;
			}
		}
		System.out.println("findService(): Service not found (" + name + ")");
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER__ADDITIONAL_SERVICE:
				return getAdditionalService();
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER__IAUTHENTICATION:
				if (resolve) return getIAuthentication();
				return basicGetIAuthentication();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER__ADDITIONAL_SERVICE:
				getAdditionalService().clear();
				getAdditionalService().addAll((Collection<? extends AdditionalServiceComponent_AdditionalService>)newValue);
				return;
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER__IAUTHENTICATION:
				setIAuthentication((StaffComponent_IAuthentication)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER__ADDITIONAL_SERVICE:
				getAdditionalService().clear();
				return;
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER__IAUTHENTICATION:
				setIAuthentication((StaffComponent_IAuthentication)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER__ADDITIONAL_SERVICE:
				return additionalService != null && !additionalService.isEmpty();
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER__IAUTHENTICATION:
				return iAuthentication != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == AdditionalServiceComponent_IAdditionalServiceDecision.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == AdditionalServiceComponent_IAdditionalServiceAdministration.class) {
			switch (baseOperationID) {
				case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___CREATE_ADDITIONAL_SERVICE__STRING_BOOLEAN_INT_STRING: return ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___CREATE_ADDITIONAL_SERVICE__STRING_BOOLEAN_INT_STRING;
				case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___EDIT_ADDITIONAL_SERVICE__STRING_STRING_BOOLEAN_INT_STRING: return ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___EDIT_ADDITIONAL_SERVICE__STRING_STRING_BOOLEAN_INT_STRING;
				case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___REMOVE_ADDITIONAL_SERVICE__STRING: return ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___REMOVE_ADDITIONAL_SERVICE__STRING;
				case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___CREATE_EVENT__STRING_DATE_STRING_INT_INT: return ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___CREATE_EVENT__STRING_DATE_STRING_INT_INT;
				case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___EDIT_EVENT__STRING_DATE_STRING_INT_INT: return ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___EDIT_EVENT__STRING_DATE_STRING_INT_INT;
				case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___REMOVE_EVENT__STRING_DATE_STRING: return ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___REMOVE_EVENT__STRING_DATE_STRING;
				case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___REMOVE_EVENTS__STRING_DATE: return ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___REMOVE_EVENTS__STRING_DATE;
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
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___GET_SERVICES:
				return getServices();
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___GET_EVENTS__STRING:
				return getEvents((String)arguments.get(0));
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___ADD_GUEST_TO_EVENT__STRING_DATE_STRING_INT:
				return addGuestToEvent((String)arguments.get(0), (Date)arguments.get(1), (String)arguments.get(2), (Integer)arguments.get(3));
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___REMOVE_GUESTS_FROM_EVENT__STRING_DATE_STRING_INT:
				return removeGuestsFromEvent((String)arguments.get(0), (Date)arguments.get(1), (String)arguments.get(2), (Integer)arguments.get(3));
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___CREATE_ADDITIONAL_SERVICE__STRING_BOOLEAN_INT_STRING:
				return createAdditionalService((String)arguments.get(0), (Boolean)arguments.get(1), (Integer)arguments.get(2), (String)arguments.get(3));
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___EDIT_ADDITIONAL_SERVICE__STRING_STRING_BOOLEAN_INT_STRING:
				return editAdditionalService((String)arguments.get(0), (String)arguments.get(1), (Boolean)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4));
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___REMOVE_ADDITIONAL_SERVICE__STRING:
				return removeAdditionalService((String)arguments.get(0));
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___CREATE_EVENT__STRING_DATE_STRING_INT_INT:
				return createEvent((String)arguments.get(0), (Date)arguments.get(1), (String)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___EDIT_EVENT__STRING_DATE_STRING_INT_INT:
				return editEvent((String)arguments.get(0), (Date)arguments.get(1), (String)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___REMOVE_EVENT__STRING_DATE_STRING:
				return removeEvent((String)arguments.get(0), (Date)arguments.get(1), (String)arguments.get(2));
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___REMOVE_EVENTS__STRING_DATE:
				return removeEvents((String)arguments.get(0), (Date)arguments.get(1));
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___FIND_SERVICE__STRING:
				return findService((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AdditionalServiceComponent_AdditionalServiceHandlerImpl
