/**
 */
package Implementation.impl;

import Implementation.AdditionalServiceComponent_AdditionalService;
import Implementation.AdditionalServiceComponent_AdditionalServiceEvent;
import Implementation.ImplementationPackage;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Additional Service Component Additional Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Implementation.impl.AdditionalServiceComponent_AdditionalServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link Implementation.impl.AdditionalServiceComponent_AdditionalServiceImpl#isUsable <em>Usable</em>}</li>
 *   <li>{@link Implementation.impl.AdditionalServiceComponent_AdditionalServiceImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link Implementation.impl.AdditionalServiceComponent_AdditionalServiceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Implementation.impl.AdditionalServiceComponent_AdditionalServiceImpl#getAdditionalServiceEvent <em>Additional Service Event</em>}</li>
 *   <li>{@link Implementation.impl.AdditionalServiceComponent_AdditionalServiceImpl#getTempEvents <em>Temp Events</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdditionalServiceComponent_AdditionalServiceImpl extends MinimalEObjectImpl.Container implements AdditionalServiceComponent_AdditionalService {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isUsable() <em>Usable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUsable() <em>Usable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsable()
	 * @generated
	 * @ordered
	 */
	protected boolean usable = USABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final int PRICE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected int price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAdditionalServiceEvent() <em>Additional Service Event</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalServiceEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<AdditionalServiceComponent_AdditionalServiceEvent> additionalServiceEvent;

	/**
	 * The cached value of the '{@link #getTempEvents() <em>Temp Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<AdditionalServiceComponent_AdditionalServiceEvent> tempEvents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdditionalServiceComponent_AdditionalServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected AdditionalServiceComponent_AdditionalServiceImpl(String name, boolean usable, int price, String description) {
		super();
		this.setName(name);
		this.setUsable(usable);
		this.setPrice(price);
		this.setDescription(description);
		this.additionalServiceEvent = getAdditionalServiceEvent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUsable() {
		return usable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsable(boolean newUsable) {
		boolean oldUsable = usable;
		usable = newUsable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__USABLE, oldUsable, usable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(int newPrice) {
		int oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdditionalServiceComponent_AdditionalServiceEvent> getAdditionalServiceEvent() {
		if (additionalServiceEvent == null) {
			additionalServiceEvent = new EObjectResolvingEList<AdditionalServiceComponent_AdditionalServiceEvent>(AdditionalServiceComponent_AdditionalServiceEvent.class, this, ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__ADDITIONAL_SERVICE_EVENT);
		}
		return additionalServiceEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdditionalServiceComponent_AdditionalServiceEvent> getTempEvents() {
		if (tempEvents == null) {
			tempEvents = new EObjectResolvingEList<AdditionalServiceComponent_AdditionalServiceEvent>(AdditionalServiceComponent_AdditionalServiceEvent.class, this, ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__TEMP_EVENTS);
		}
		return tempEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public AdditionalServiceComponent_AdditionalServiceEvent findEvent(Date date, String location) {
		for (AdditionalServiceComponent_AdditionalServiceEvent e : additionalServiceEvent) {
			if (e.getDateTime() == date && e.getLocation == location) {
				return this;
			}
		}
		System.out.println("findEvent(): Event not found (" + date + " at " + location + ")");
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public AdditionalServiceComponent_AdditionalServiceEvent findEvents(Date dateTime) {
		tempEvents = null;
		EList<AdditionalServiceComponent_AdditionalServiceEvent> tempEvents = getTempEvents();

		for (AdditionalServiceComponent_AdditionalServiceEvent e : additionalServiceEvent) {
			if (s.getDateTime() == date) {
				tempEvents.add(this);
			}
		}
		if (tempEvents != null) {
			return tempEvents;
		}
		System.out.println("findEvents(): Events not found (" + date + ")");
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean createEvent(Date dateTime, String location, int maxAttendants, int currentAttendants) {
		AdditionalServiceComponent_AdditionalServiceEvent event = findEvent(dateTime,location);
		if (event != null) {
			this.getAdditionalServiceEvent().add(new AdditionalServiceComponent_AdditionalServiceEvent(date,location));
			System.out.println("Event created!");
			return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean editEvent(Date dateTime, String location, int maxAttendants, int currentAttendants) {
		AdditionalServiceComponent_AdditionalServiceEvent event = findEvent(dateTime,location);
		if (event != null) {
			if (currentAttendants <= maxAttendants) {
				event.setMaxAttendants(maxAttendants);
				event.setCurrentAttendants(currentAttendants);
				return true;
			} else {
				System.out.println("Max number of attendants is " + maxAttendants + ". Cannot change to " + currentAttendants + "!");
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean removeEvent(Date date, String location) {
		AdditionalServiceComponent_AdditionalServiceEvent event = findEvent(dateTime,location);
		if (event != null) {
			this.getAdditionalServiceEvent().remove(event);
			System.out.println("Event removed!");
			return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean removeEvents(Date date) {
		// TODO: Not implemented. The administrator interface need 'boolean removeEvents(String name, Date date)'. ServiceHandler shall access this method.
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__NAME:
				return getName();
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__USABLE:
				return isUsable();
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__PRICE:
				return getPrice();
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__DESCRIPTION:
				return getDescription();
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__ADDITIONAL_SERVICE_EVENT:
				return getAdditionalServiceEvent();
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__TEMP_EVENTS:
				return getTempEvents();
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
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__NAME:
				setName((String)newValue);
				return;
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__USABLE:
				setUsable((Boolean)newValue);
				return;
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__PRICE:
				setPrice((Integer)newValue);
				return;
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__ADDITIONAL_SERVICE_EVENT:
				getAdditionalServiceEvent().clear();
				getAdditionalServiceEvent().addAll((Collection<? extends AdditionalServiceComponent_AdditionalServiceEvent>)newValue);
				return;
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__TEMP_EVENTS:
				getTempEvents().clear();
				getTempEvents().addAll((Collection<? extends AdditionalServiceComponent_AdditionalServiceEvent>)newValue);
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
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__USABLE:
				setUsable(USABLE_EDEFAULT);
				return;
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__ADDITIONAL_SERVICE_EVENT:
				getAdditionalServiceEvent().clear();
				return;
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__TEMP_EVENTS:
				getTempEvents().clear();
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
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__USABLE:
				return usable != USABLE_EDEFAULT;
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__PRICE:
				return price != PRICE_EDEFAULT;
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__ADDITIONAL_SERVICE_EVENT:
				return additionalServiceEvent != null && !additionalServiceEvent.isEmpty();
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__TEMP_EVENTS:
				return tempEvents != null && !tempEvents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE___FIND_EVENT__DATE_STRING:
				return findEvent((Date)arguments.get(0), (String)arguments.get(1));
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE___FIND_EVENTS__DATE:
				return findEvents((Date)arguments.get(0));
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE___CREATE_EVENT__DATE_STRING_INT_INT:
				return createEvent((Date)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE___EDIT_EVENT__DATE_STRING_INT_INT:
				return editEvent((Date)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE___REMOVE_EVENT__DATE_STRING:
				return removeEvent((Date)arguments.get(0), (String)arguments.get(1));
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE___REMOVE_EVENTS__DATE:
				return removeEvents((Date)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(name);
		result.append(", ");
		result.append(usable);
		result.append(", ");
		result.append(price);
		result.append(", ");
		result.append(description);
		result.append(", [");
		for (AdditionalServiceComponent_AdditionalServiceEvent e : additionalServiceEvent) {
			result.append(e.toString());
		}
		result.append('];');
		return result.toString();
	}

} //AdditionalServiceComponent_AdditionalServiceImpl
