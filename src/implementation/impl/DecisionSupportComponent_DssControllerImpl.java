/**
 */
package implementation.impl;

import implementation.DecisionSupportComponent_DssController;
import implementation.DecisionSupportComponent_DssPresenter;
import implementation.DecisionSupportComponent_DssProcessor;
import implementation.ImplementationPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision Support Component Dss Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link implementation.impl.DecisionSupportComponent_DssControllerImpl#getDssProcessor <em>Dss Processor</em>}</li>
 *   <li>{@link implementation.impl.DecisionSupportComponent_DssControllerImpl#getDssPresenter <em>Dss Presenter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecisionSupportComponent_DssControllerImpl extends MinimalEObjectImpl.Container implements DecisionSupportComponent_DssController {
	/**
	 * The cached value of the '{@link #getDssProcessor() <em>Dss Processor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDssProcessor()
	 * @generated
	 * @ordered
	 */
	protected EList<DecisionSupportComponent_DssProcessor> dssProcessor;

	/**
	 * The cached value of the '{@link #getDssPresenter() <em>Dss Presenter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDssPresenter()
	 * @generated
	 * @ordered
	 */
	protected DecisionSupportComponent_DssPresenter dssPresenter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionSupportComponent_DssControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DecisionSupportComponent_DssProcessor> getDssProcessor() {
		if (dssProcessor == null) {
			dssProcessor = new EObjectResolvingEList<DecisionSupportComponent_DssProcessor>(DecisionSupportComponent_DssProcessor.class, this, ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__DSS_PROCESSOR);
		}
		return dssProcessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionSupportComponent_DssPresenter getDssPresenter() {
		if (dssPresenter != null && dssPresenter.eIsProxy()) {
			InternalEObject oldDssPresenter = (InternalEObject)dssPresenter;
			dssPresenter = (DecisionSupportComponent_DssPresenter)eResolveProxy(oldDssPresenter);
			if (dssPresenter != oldDssPresenter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__DSS_PRESENTER, oldDssPresenter, dssPresenter));
			}
		}
		return dssPresenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionSupportComponent_DssPresenter basicGetDssPresenter() {
		return dssPresenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDssPresenter(DecisionSupportComponent_DssPresenter newDssPresenter) {
		DecisionSupportComponent_DssPresenter oldDssPresenter = dssPresenter;
		dssPresenter = newDssPresenter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__DSS_PRESENTER, oldDssPresenter, dssPresenter));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__DSS_PROCESSOR:
				return getDssProcessor();
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__DSS_PRESENTER:
				if (resolve) return getDssPresenter();
				return basicGetDssPresenter();
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
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__DSS_PROCESSOR:
				getDssProcessor().clear();
				getDssProcessor().addAll((Collection<? extends DecisionSupportComponent_DssProcessor>)newValue);
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__DSS_PRESENTER:
				setDssPresenter((DecisionSupportComponent_DssPresenter)newValue);
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
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__DSS_PROCESSOR:
				getDssProcessor().clear();
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__DSS_PRESENTER:
				setDssPresenter((DecisionSupportComponent_DssPresenter)null);
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
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__DSS_PROCESSOR:
				return dssProcessor != null && !dssProcessor.isEmpty();
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__DSS_PRESENTER:
				return dssPresenter != null;
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
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER___CHECK_IN_GUEST__STRING_STRING_STRING:
				checkInGuest((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
				return null;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER___CHECK_OUT_GUEST__STRING_STRING_STRING:
				checkOutGuest((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
				return null;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER___LIST_FREE_ROOMS:
				listFreeRooms();
				return null;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER___LIST_GUESTS_IN_ROOM__INT:
				listGuestsInRoom((Integer)arguments.get(0));
				return null;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER___NUMBER_OF_GUESTS_IN_HOTEL:
				numberOfGuestsInHotel();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //DecisionSupportComponent_DssControllerImpl
