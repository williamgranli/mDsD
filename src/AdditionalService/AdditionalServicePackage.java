/**
 */
package AdditionalService;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see AdditionalService.AdditionalServiceFactory
 * @model kind="package"
 * @generated
 */
public interface AdditionalServicePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "AdditionalService";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///AdditionalService.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "AdditionalService";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AdditionalServicePackage eINSTANCE = AdditionalService.impl.AdditionalServicePackageImpl.init();

	/**
	 * The meta object id for the '{@link AdditionalService.impl.AdditionalServiceComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AdditionalService.impl.AdditionalServiceComponentImpl
	 * @see AdditionalService.impl.AdditionalServicePackageImpl#getAdditionalServiceComponent()
	 * @generated
	 */
	int ADDITIONAL_SERVICE_COMPONENT = 0;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AdditionalService.impl.AdditionalServiceComponent_AdditionalServiceImpl <em>Component Additional Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AdditionalService.impl.AdditionalServiceComponent_AdditionalServiceImpl
	 * @see AdditionalService.impl.AdditionalServicePackageImpl#getAdditionalServiceComponent_AdditionalService()
	 * @generated
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Usable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__USABLE = 1;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__PRICE = 2;

	/**
	 * The feature id for the '<em><b>Max Attendant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__MAX_ATTENDANT = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__DESCRIPTION = 4;

	/**
	 * The number of structural features of the '<em>Component Additional Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Component Additional Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AdditionalService.impl.AdditionalServiceComponent_AdditionalServiceEventImpl <em>Component Additional Service Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AdditionalService.impl.AdditionalServiceComponent_AdditionalServiceEventImpl
	 * @see AdditionalService.impl.AdditionalServicePackageImpl#getAdditionalServiceComponent_AdditionalServiceEvent()
	 * @generated
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT = 2;

	/**
	 * The feature id for the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__DATE_TIME = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__PRICE = 3;

	/**
	 * The feature id for the '<em><b>Max Attendant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__MAX_ATTENDANT = 4;

	/**
	 * The number of structural features of the '<em>Component Additional Service Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Get Additional Service Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT___GET_ADDITIONAL_SERVICE_INFO__STRING = 0;

	/**
	 * The number of operations of the '<em>Component Additional Service Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link AdditionalService.AdditionalServiceComponent_IAdditionalServiceAdministration <em>Component IAdditional Service Administration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AdditionalService.AdditionalServiceComponent_IAdditionalServiceAdministration
	 * @see AdditionalService.impl.AdditionalServicePackageImpl#getAdditionalServiceComponent_IAdditionalServiceAdministration()
	 * @generated
	 */
	int ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION = 3;

	/**
	 * The number of structural features of the '<em>Component IAdditional Service Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Additional Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___CREATE_ADDITIONAL_SERVICE__STRING_INT_INT = 0;

	/**
	 * The operation id for the '<em>Edit Additional Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___EDIT_ADDITIONAL_SERVICE__STRING_STRING_INT_INT = 1;

	/**
	 * The operation id for the '<em>Remove Additional Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___REMOVE_ADDITIONAL_SERVICE__STRING = 2;

	/**
	 * The number of operations of the '<em>Component IAdditional Service Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link AdditionalService.AdditionalServiceComponent_IAdditionalServiceInformation <em>Component IAdditional Service Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AdditionalService.AdditionalServiceComponent_IAdditionalServiceInformation
	 * @see AdditionalService.impl.AdditionalServicePackageImpl#getAdditionalServiceComponent_IAdditionalServiceInformation()
	 * @generated
	 */
	int ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_INFORMATION = 4;

	/**
	 * The number of structural features of the '<em>Component IAdditional Service Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_INFORMATION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Additional Service Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_INFORMATION___GET_ADDITIONAL_SERVICE_INFO__STRING = 0;

	/**
	 * The operation id for the '<em>Get All Additional Services</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_INFORMATION___GET_ALL_ADDITIONAL_SERVICES = 1;

	/**
	 * The number of operations of the '<em>Component IAdditional Service Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_INFORMATION_OPERATION_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link AdditionalService.AdditionalServiceComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see AdditionalService.AdditionalServiceComponent
	 * @generated
	 */
	EClass getAdditionalServiceComponent();

	/**
	 * Returns the meta object for class '{@link AdditionalService.AdditionalServiceComponent_AdditionalService <em>Component Additional Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Additional Service</em>'.
	 * @see AdditionalService.AdditionalServiceComponent_AdditionalService
	 * @generated
	 */
	EClass getAdditionalServiceComponent_AdditionalService();

	/**
	 * Returns the meta object for the attribute '{@link AdditionalService.AdditionalServiceComponent_AdditionalService#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see AdditionalService.AdditionalServiceComponent_AdditionalService#getName()
	 * @see #getAdditionalServiceComponent_AdditionalService()
	 * @generated
	 */
	EAttribute getAdditionalServiceComponent_AdditionalService_Name();

	/**
	 * Returns the meta object for the attribute '{@link AdditionalService.AdditionalServiceComponent_AdditionalService#isUsable <em>Usable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usable</em>'.
	 * @see AdditionalService.AdditionalServiceComponent_AdditionalService#isUsable()
	 * @see #getAdditionalServiceComponent_AdditionalService()
	 * @generated
	 */
	EAttribute getAdditionalServiceComponent_AdditionalService_Usable();

	/**
	 * Returns the meta object for the attribute '{@link AdditionalService.AdditionalServiceComponent_AdditionalService#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see AdditionalService.AdditionalServiceComponent_AdditionalService#getPrice()
	 * @see #getAdditionalServiceComponent_AdditionalService()
	 * @generated
	 */
	EAttribute getAdditionalServiceComponent_AdditionalService_Price();

	/**
	 * Returns the meta object for the attribute '{@link AdditionalService.AdditionalServiceComponent_AdditionalService#getMaxAttendant <em>Max Attendant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Attendant</em>'.
	 * @see AdditionalService.AdditionalServiceComponent_AdditionalService#getMaxAttendant()
	 * @see #getAdditionalServiceComponent_AdditionalService()
	 * @generated
	 */
	EAttribute getAdditionalServiceComponent_AdditionalService_MaxAttendant();

	/**
	 * Returns the meta object for the attribute '{@link AdditionalService.AdditionalServiceComponent_AdditionalService#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see AdditionalService.AdditionalServiceComponent_AdditionalService#getDescription()
	 * @see #getAdditionalServiceComponent_AdditionalService()
	 * @generated
	 */
	EAttribute getAdditionalServiceComponent_AdditionalService_Description();

	/**
	 * Returns the meta object for class '{@link AdditionalService.AdditionalServiceComponent_AdditionalServiceEvent <em>Component Additional Service Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Additional Service Event</em>'.
	 * @see AdditionalService.AdditionalServiceComponent_AdditionalServiceEvent
	 * @generated
	 */
	EClass getAdditionalServiceComponent_AdditionalServiceEvent();

	/**
	 * Returns the meta object for the attribute '{@link AdditionalService.AdditionalServiceComponent_AdditionalServiceEvent#getDateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Time</em>'.
	 * @see AdditionalService.AdditionalServiceComponent_AdditionalServiceEvent#getDateTime()
	 * @see #getAdditionalServiceComponent_AdditionalServiceEvent()
	 * @generated
	 */
	EAttribute getAdditionalServiceComponent_AdditionalServiceEvent_DateTime();

	/**
	 * Returns the meta object for the attribute '{@link AdditionalService.AdditionalServiceComponent_AdditionalServiceEvent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see AdditionalService.AdditionalServiceComponent_AdditionalServiceEvent#getName()
	 * @see #getAdditionalServiceComponent_AdditionalServiceEvent()
	 * @generated
	 */
	EAttribute getAdditionalServiceComponent_AdditionalServiceEvent_Name();

	/**
	 * Returns the meta object for the attribute '{@link AdditionalService.AdditionalServiceComponent_AdditionalServiceEvent#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see AdditionalService.AdditionalServiceComponent_AdditionalServiceEvent#getLocation()
	 * @see #getAdditionalServiceComponent_AdditionalServiceEvent()
	 * @generated
	 */
	EAttribute getAdditionalServiceComponent_AdditionalServiceEvent_Location();

	/**
	 * Returns the meta object for the attribute '{@link AdditionalService.AdditionalServiceComponent_AdditionalServiceEvent#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see AdditionalService.AdditionalServiceComponent_AdditionalServiceEvent#getPrice()
	 * @see #getAdditionalServiceComponent_AdditionalServiceEvent()
	 * @generated
	 */
	EAttribute getAdditionalServiceComponent_AdditionalServiceEvent_Price();

	/**
	 * Returns the meta object for the attribute '{@link AdditionalService.AdditionalServiceComponent_AdditionalServiceEvent#getMaxAttendant <em>Max Attendant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Attendant</em>'.
	 * @see AdditionalService.AdditionalServiceComponent_AdditionalServiceEvent#getMaxAttendant()
	 * @see #getAdditionalServiceComponent_AdditionalServiceEvent()
	 * @generated
	 */
	EAttribute getAdditionalServiceComponent_AdditionalServiceEvent_MaxAttendant();

	/**
	 * Returns the meta object for the '{@link AdditionalService.AdditionalServiceComponent_AdditionalServiceEvent#getAdditionalServiceInfo(java.lang.String) <em>Get Additional Service Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Additional Service Info</em>' operation.
	 * @see AdditionalService.AdditionalServiceComponent_AdditionalServiceEvent#getAdditionalServiceInfo(java.lang.String)
	 * @generated
	 */
	EOperation getAdditionalServiceComponent_AdditionalServiceEvent__GetAdditionalServiceInfo__String();

	/**
	 * Returns the meta object for class '{@link AdditionalService.AdditionalServiceComponent_IAdditionalServiceAdministration <em>Component IAdditional Service Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component IAdditional Service Administration</em>'.
	 * @see AdditionalService.AdditionalServiceComponent_IAdditionalServiceAdministration
	 * @generated
	 */
	EClass getAdditionalServiceComponent_IAdditionalServiceAdministration();

	/**
	 * Returns the meta object for the '{@link AdditionalService.AdditionalServiceComponent_IAdditionalServiceAdministration#createAdditionalService(java.lang.String, int, int) <em>Create Additional Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Additional Service</em>' operation.
	 * @see AdditionalService.AdditionalServiceComponent_IAdditionalServiceAdministration#createAdditionalService(java.lang.String, int, int)
	 * @generated
	 */
	EOperation getAdditionalServiceComponent_IAdditionalServiceAdministration__CreateAdditionalService__String_int_int();

	/**
	 * Returns the meta object for the '{@link AdditionalService.AdditionalServiceComponent_IAdditionalServiceAdministration#editAdditionalService(java.lang.String, java.lang.String, int, int) <em>Edit Additional Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Additional Service</em>' operation.
	 * @see AdditionalService.AdditionalServiceComponent_IAdditionalServiceAdministration#editAdditionalService(java.lang.String, java.lang.String, int, int)
	 * @generated
	 */
	EOperation getAdditionalServiceComponent_IAdditionalServiceAdministration__EditAdditionalService__String_String_int_int();

	/**
	 * Returns the meta object for the '{@link AdditionalService.AdditionalServiceComponent_IAdditionalServiceAdministration#removeAdditionalService(java.lang.String) <em>Remove Additional Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Additional Service</em>' operation.
	 * @see AdditionalService.AdditionalServiceComponent_IAdditionalServiceAdministration#removeAdditionalService(java.lang.String)
	 * @generated
	 */
	EOperation getAdditionalServiceComponent_IAdditionalServiceAdministration__RemoveAdditionalService__String();

	/**
	 * Returns the meta object for class '{@link AdditionalService.AdditionalServiceComponent_IAdditionalServiceInformation <em>Component IAdditional Service Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component IAdditional Service Information</em>'.
	 * @see AdditionalService.AdditionalServiceComponent_IAdditionalServiceInformation
	 * @generated
	 */
	EClass getAdditionalServiceComponent_IAdditionalServiceInformation();

	/**
	 * Returns the meta object for the '{@link AdditionalService.AdditionalServiceComponent_IAdditionalServiceInformation#getAdditionalServiceInfo(java.lang.String) <em>Get Additional Service Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Additional Service Info</em>' operation.
	 * @see AdditionalService.AdditionalServiceComponent_IAdditionalServiceInformation#getAdditionalServiceInfo(java.lang.String)
	 * @generated
	 */
	EOperation getAdditionalServiceComponent_IAdditionalServiceInformation__GetAdditionalServiceInfo__String();

	/**
	 * Returns the meta object for the '{@link AdditionalService.AdditionalServiceComponent_IAdditionalServiceInformation#getAllAdditionalServices() <em>Get All Additional Services</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Additional Services</em>' operation.
	 * @see AdditionalService.AdditionalServiceComponent_IAdditionalServiceInformation#getAllAdditionalServices()
	 * @generated
	 */
	EOperation getAdditionalServiceComponent_IAdditionalServiceInformation__GetAllAdditionalServices();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AdditionalServiceFactory getAdditionalServiceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link AdditionalService.impl.AdditionalServiceComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AdditionalService.impl.AdditionalServiceComponentImpl
		 * @see AdditionalService.impl.AdditionalServicePackageImpl#getAdditionalServiceComponent()
		 * @generated
		 */
		EClass ADDITIONAL_SERVICE_COMPONENT = eINSTANCE.getAdditionalServiceComponent();

		/**
		 * The meta object literal for the '{@link AdditionalService.impl.AdditionalServiceComponent_AdditionalServiceImpl <em>Component Additional Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AdditionalService.impl.AdditionalServiceComponent_AdditionalServiceImpl
		 * @see AdditionalService.impl.AdditionalServicePackageImpl#getAdditionalServiceComponent_AdditionalService()
		 * @generated
		 */
		EClass ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE = eINSTANCE.getAdditionalServiceComponent_AdditionalService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__NAME = eINSTANCE.getAdditionalServiceComponent_AdditionalService_Name();

		/**
		 * The meta object literal for the '<em><b>Usable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__USABLE = eINSTANCE.getAdditionalServiceComponent_AdditionalService_Usable();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__PRICE = eINSTANCE.getAdditionalServiceComponent_AdditionalService_Price();

		/**
		 * The meta object literal for the '<em><b>Max Attendant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__MAX_ATTENDANT = eINSTANCE.getAdditionalServiceComponent_AdditionalService_MaxAttendant();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__DESCRIPTION = eINSTANCE.getAdditionalServiceComponent_AdditionalService_Description();

		/**
		 * The meta object literal for the '{@link AdditionalService.impl.AdditionalServiceComponent_AdditionalServiceEventImpl <em>Component Additional Service Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AdditionalService.impl.AdditionalServiceComponent_AdditionalServiceEventImpl
		 * @see AdditionalService.impl.AdditionalServicePackageImpl#getAdditionalServiceComponent_AdditionalServiceEvent()
		 * @generated
		 */
		EClass ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT = eINSTANCE.getAdditionalServiceComponent_AdditionalServiceEvent();

		/**
		 * The meta object literal for the '<em><b>Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__DATE_TIME = eINSTANCE.getAdditionalServiceComponent_AdditionalServiceEvent_DateTime();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__NAME = eINSTANCE.getAdditionalServiceComponent_AdditionalServiceEvent_Name();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__LOCATION = eINSTANCE.getAdditionalServiceComponent_AdditionalServiceEvent_Location();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__PRICE = eINSTANCE.getAdditionalServiceComponent_AdditionalServiceEvent_Price();

		/**
		 * The meta object literal for the '<em><b>Max Attendant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__MAX_ATTENDANT = eINSTANCE.getAdditionalServiceComponent_AdditionalServiceEvent_MaxAttendant();

		/**
		 * The meta object literal for the '<em><b>Get Additional Service Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT___GET_ADDITIONAL_SERVICE_INFO__STRING = eINSTANCE.getAdditionalServiceComponent_AdditionalServiceEvent__GetAdditionalServiceInfo__String();

		/**
		 * The meta object literal for the '{@link AdditionalService.AdditionalServiceComponent_IAdditionalServiceAdministration <em>Component IAdditional Service Administration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AdditionalService.AdditionalServiceComponent_IAdditionalServiceAdministration
		 * @see AdditionalService.impl.AdditionalServicePackageImpl#getAdditionalServiceComponent_IAdditionalServiceAdministration()
		 * @generated
		 */
		EClass ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION = eINSTANCE.getAdditionalServiceComponent_IAdditionalServiceAdministration();

		/**
		 * The meta object literal for the '<em><b>Create Additional Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___CREATE_ADDITIONAL_SERVICE__STRING_INT_INT = eINSTANCE.getAdditionalServiceComponent_IAdditionalServiceAdministration__CreateAdditionalService__String_int_int();

		/**
		 * The meta object literal for the '<em><b>Edit Additional Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___EDIT_ADDITIONAL_SERVICE__STRING_STRING_INT_INT = eINSTANCE.getAdditionalServiceComponent_IAdditionalServiceAdministration__EditAdditionalService__String_String_int_int();

		/**
		 * The meta object literal for the '<em><b>Remove Additional Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___REMOVE_ADDITIONAL_SERVICE__STRING = eINSTANCE.getAdditionalServiceComponent_IAdditionalServiceAdministration__RemoveAdditionalService__String();

		/**
		 * The meta object literal for the '{@link AdditionalService.AdditionalServiceComponent_IAdditionalServiceInformation <em>Component IAdditional Service Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AdditionalService.AdditionalServiceComponent_IAdditionalServiceInformation
		 * @see AdditionalService.impl.AdditionalServicePackageImpl#getAdditionalServiceComponent_IAdditionalServiceInformation()
		 * @generated
		 */
		EClass ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_INFORMATION = eINSTANCE.getAdditionalServiceComponent_IAdditionalServiceInformation();

		/**
		 * The meta object literal for the '<em><b>Get Additional Service Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_INFORMATION___GET_ADDITIONAL_SERVICE_INFO__STRING = eINSTANCE.getAdditionalServiceComponent_IAdditionalServiceInformation__GetAdditionalServiceInfo__String();

		/**
		 * The meta object literal for the '<em><b>Get All Additional Services</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_INFORMATION___GET_ALL_ADDITIONAL_SERVICES = eINSTANCE.getAdditionalServiceComponent_IAdditionalServiceInformation__GetAllAdditionalServices();

	}

} //AdditionalServicePackage
