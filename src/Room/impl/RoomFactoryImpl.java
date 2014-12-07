/**
 */
package Room.impl;

import Room.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoomFactoryImpl extends EFactoryImpl implements RoomFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RoomFactory init() {
		try {
			RoomFactory theRoomFactory = (RoomFactory)EPackage.Registry.INSTANCE.getEFactory(RoomPackage.eNS_URI);
			if (theRoomFactory != null) {
				return theRoomFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RoomFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RoomPackage.ROOM_COMPONENT: return createRoomComponent();
			case RoomPackage.ROOM_COMPONENT_ROOM: return createRoomComponent_Room();
			case RoomPackage.ROOM_COMPONENT_BEDROOM: return createRoomComponent_Bedroom();
			case RoomPackage.ROOM_COMPONENT_CONFERENCE_ROOM: return createRoomComponent_ConferenceRoom();
			case RoomPackage.ROOM_COMPONENT_ROOM_HANDLER: return createRoomComponent_RoomHandler();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomComponent createRoomComponent() {
		RoomComponentImpl roomComponent = new RoomComponentImpl();
		return roomComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomComponent_Room createRoomComponent_Room() {
		RoomComponent_RoomImpl roomComponent_Room = new RoomComponent_RoomImpl();
		return roomComponent_Room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomComponent_Bedroom createRoomComponent_Bedroom() {
		RoomComponent_BedroomImpl roomComponent_Bedroom = new RoomComponent_BedroomImpl();
		return roomComponent_Bedroom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomComponent_ConferenceRoom createRoomComponent_ConferenceRoom() {
		RoomComponent_ConferenceRoomImpl roomComponent_ConferenceRoom = new RoomComponent_ConferenceRoomImpl();
		return roomComponent_ConferenceRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomComponent_RoomHandler createRoomComponent_RoomHandler() {
		RoomComponent_RoomHandlerImpl roomComponent_RoomHandler = new RoomComponent_RoomHandlerImpl();
		return roomComponent_RoomHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomPackage getRoomPackage() {
		return (RoomPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RoomPackage getPackage() {
		return RoomPackage.eINSTANCE;
	}

} //RoomFactoryImpl
