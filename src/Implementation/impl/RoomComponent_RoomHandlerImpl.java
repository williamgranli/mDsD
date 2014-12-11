/**
 */
package Implementation.impl;

import Implementation.ImplementationPackage;
import Implementation.RoomComponent_RoomHandler;
import Implementation.StaffComponent_IAuthentication;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Component Room Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Implementation.impl.RoomComponent_RoomHandlerImpl#getAuthenticator <em>Authenticator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomComponent_RoomHandlerImpl extends MinimalEObjectImpl.Container implements RoomComponent_RoomHandler {
	/**
	 * The cached value of the '{@link #getAuthenticator() <em>Authenticator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticator()
	 * @generated
	 * @ordered
	 */
	protected StaffComponent_IAuthentication authenticator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomComponent_RoomHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.ROOM_COMPONENT_ROOM_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffComponent_IAuthentication getAuthenticator() {
		if (authenticator != null && authenticator.eIsProxy()) {
			InternalEObject oldAuthenticator = (InternalEObject)authenticator;
			authenticator = (StaffComponent_IAuthentication)eResolveProxy(oldAuthenticator);
			if (authenticator != oldAuthenticator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER__AUTHENTICATOR, oldAuthenticator, authenticator));
			}
		}
		return authenticator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffComponent_IAuthentication basicGetAuthenticator() {
		return authenticator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthenticator(StaffComponent_IAuthentication newAuthenticator) {
		StaffComponent_IAuthentication oldAuthenticator = authenticator;
		authenticator = newAuthenticator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER__AUTHENTICATOR, oldAuthenticator, authenticator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER__AUTHENTICATOR:
				if (resolve) return getAuthenticator();
				return basicGetAuthenticator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER__AUTHENTICATOR:
				setAuthenticator((StaffComponent_IAuthentication)newValue);
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
			case ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER__AUTHENTICATOR:
				setAuthenticator((StaffComponent_IAuthentication)null);
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
			case ImplementationPackage.ROOM_COMPONENT_ROOM_HANDLER__AUTHENTICATOR:
				return authenticator != null;
		}
		return super.eIsSet(featureID);
	}

} //RoomComponent_RoomHandlerImpl
