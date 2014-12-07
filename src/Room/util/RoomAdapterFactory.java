/**
 */
package Room.util;

import Room.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Room.RoomPackage
 * @generated
 */
public class RoomAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RoomPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RoomPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomSwitch<Adapter> modelSwitch =
		new RoomSwitch<Adapter>() {
			@Override
			public Adapter caseRoomComponent(RoomComponent object) {
				return createRoomComponentAdapter();
			}
			@Override
			public Adapter caseRoomComponent_Room(RoomComponent_Room object) {
				return createRoomComponent_RoomAdapter();
			}
			@Override
			public Adapter caseRoomComponent_Bedroom(RoomComponent_Bedroom object) {
				return createRoomComponent_BedroomAdapter();
			}
			@Override
			public Adapter caseRoomComponent_ConferenceRoom(RoomComponent_ConferenceRoom object) {
				return createRoomComponent_ConferenceRoomAdapter();
			}
			@Override
			public Adapter caseRoomComponent_IRoomAdministration(RoomComponent_IRoomAdministration object) {
				return createRoomComponent_IRoomAdministrationAdapter();
			}
			@Override
			public Adapter caseRoomComponent_IRoomInformation(RoomComponent_IRoomInformation object) {
				return createRoomComponent_IRoomInformationAdapter();
			}
			@Override
			public Adapter caseRoomComponent_RoomHandler(RoomComponent_RoomHandler object) {
				return createRoomComponent_RoomHandlerAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Room.RoomComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Room.RoomComponent
	 * @generated
	 */
	public Adapter createRoomComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Room.RoomComponent_Room <em>Component Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Room.RoomComponent_Room
	 * @generated
	 */
	public Adapter createRoomComponent_RoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Room.RoomComponent_Bedroom <em>Component Bedroom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Room.RoomComponent_Bedroom
	 * @generated
	 */
	public Adapter createRoomComponent_BedroomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Room.RoomComponent_ConferenceRoom <em>Component Conference Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Room.RoomComponent_ConferenceRoom
	 * @generated
	 */
	public Adapter createRoomComponent_ConferenceRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Room.RoomComponent_IRoomAdministration <em>Component IRoom Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Room.RoomComponent_IRoomAdministration
	 * @generated
	 */
	public Adapter createRoomComponent_IRoomAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Room.RoomComponent_IRoomInformation <em>Component IRoom Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Room.RoomComponent_IRoomInformation
	 * @generated
	 */
	public Adapter createRoomComponent_IRoomInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Room.RoomComponent_RoomHandler <em>Component Room Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Room.RoomComponent_RoomHandler
	 * @generated
	 */
	public Adapter createRoomComponent_RoomHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RoomAdapterFactory
