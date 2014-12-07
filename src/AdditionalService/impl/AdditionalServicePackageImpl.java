/**
 */
package AdditionalService.impl;

import AdditionalService.AdditionalServiceComponent;
import AdditionalService.AdditionalServiceComponent_AdditionalService;
import AdditionalService.AdditionalServiceComponent_AdditionalServiceEvent;
import AdditionalService.AdditionalServiceComponent_IAdditionalServiceAdministration;
import AdditionalService.AdditionalServiceComponent_IAdditionalServiceInformation;
import AdditionalService.AdditionalServiceFactory;
import AdditionalService.AdditionalServicePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.types.impl.TypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdditionalServicePackageImpl extends EPackageImpl implements AdditionalServicePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionalServiceComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionalServiceComponent_AdditionalServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionalServiceComponent_AdditionalServiceEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionalServiceComponent_IAdditionalServiceAdministrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionalServiceComponent_IAdditionalServiceInformationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see AdditionalService.AdditionalServicePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AdditionalServicePackageImpl() {
		super(eNS_URI, AdditionalServiceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AdditionalServicePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AdditionalServicePackage init() {
		if (isInited) return (AdditionalServicePackage)EPackage.Registry.INSTANCE.getEPackage(AdditionalServicePackage.eNS_URI);

		// Obtain or create and register package
		AdditionalServicePackageImpl theAdditionalServicePackage = (AdditionalServicePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AdditionalServicePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AdditionalServicePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theAdditionalServicePackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theAdditionalServicePackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAdditionalServicePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AdditionalServicePackage.eNS_URI, theAdditionalServicePackage);
		return theAdditionalServicePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdditionalServiceComponent() {
		return additionalServiceComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdditionalServiceComponent_AdditionalService() {
		return additionalServiceComponent_AdditionalServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdditionalServiceComponent_AdditionalService_Name() {
		return (EAttribute)additionalServiceComponent_AdditionalServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdditionalServiceComponent_AdditionalService_Usable() {
		return (EAttribute)additionalServiceComponent_AdditionalServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdditionalServiceComponent_AdditionalService_Price() {
		return (EAttribute)additionalServiceComponent_AdditionalServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdditionalServiceComponent_AdditionalService_MaxAttendant() {
		return (EAttribute)additionalServiceComponent_AdditionalServiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdditionalServiceComponent_AdditionalService_Description() {
		return (EAttribute)additionalServiceComponent_AdditionalServiceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdditionalServiceComponent_AdditionalServiceEvent() {
		return additionalServiceComponent_AdditionalServiceEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdditionalServiceComponent_AdditionalServiceEvent_DateTime() {
		return (EAttribute)additionalServiceComponent_AdditionalServiceEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdditionalServiceComponent_AdditionalServiceEvent_Name() {
		return (EAttribute)additionalServiceComponent_AdditionalServiceEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdditionalServiceComponent_AdditionalServiceEvent_Location() {
		return (EAttribute)additionalServiceComponent_AdditionalServiceEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdditionalServiceComponent_AdditionalServiceEvent_Price() {
		return (EAttribute)additionalServiceComponent_AdditionalServiceEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdditionalServiceComponent_AdditionalServiceEvent_MaxAttendant() {
		return (EAttribute)additionalServiceComponent_AdditionalServiceEventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdditionalServiceComponent_AdditionalServiceEvent__GetAdditionalServiceInfo__String() {
		return additionalServiceComponent_AdditionalServiceEventEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdditionalServiceComponent_IAdditionalServiceAdministration() {
		return additionalServiceComponent_IAdditionalServiceAdministrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdditionalServiceComponent_IAdditionalServiceAdministration__CreateAdditionalService__String_int_int() {
		return additionalServiceComponent_IAdditionalServiceAdministrationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdditionalServiceComponent_IAdditionalServiceAdministration__EditAdditionalService__String_String_int_int() {
		return additionalServiceComponent_IAdditionalServiceAdministrationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdditionalServiceComponent_IAdditionalServiceAdministration__RemoveAdditionalService__String() {
		return additionalServiceComponent_IAdditionalServiceAdministrationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdditionalServiceComponent_IAdditionalServiceInformation() {
		return additionalServiceComponent_IAdditionalServiceInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdditionalServiceComponent_IAdditionalServiceInformation__GetAdditionalServiceInfo__String() {
		return additionalServiceComponent_IAdditionalServiceInformationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdditionalServiceComponent_IAdditionalServiceInformation__GetAllAdditionalServices() {
		return additionalServiceComponent_IAdditionalServiceInformationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalServiceFactory getAdditionalServiceFactory() {
		return (AdditionalServiceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		additionalServiceComponentEClass = createEClass(ADDITIONAL_SERVICE_COMPONENT);

		additionalServiceComponent_AdditionalServiceEClass = createEClass(ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE);
		createEAttribute(additionalServiceComponent_AdditionalServiceEClass, ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__NAME);
		createEAttribute(additionalServiceComponent_AdditionalServiceEClass, ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__USABLE);
		createEAttribute(additionalServiceComponent_AdditionalServiceEClass, ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__PRICE);
		createEAttribute(additionalServiceComponent_AdditionalServiceEClass, ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__MAX_ATTENDANT);
		createEAttribute(additionalServiceComponent_AdditionalServiceEClass, ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__DESCRIPTION);

		additionalServiceComponent_AdditionalServiceEventEClass = createEClass(ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT);
		createEAttribute(additionalServiceComponent_AdditionalServiceEventEClass, ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__DATE_TIME);
		createEAttribute(additionalServiceComponent_AdditionalServiceEventEClass, ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__NAME);
		createEAttribute(additionalServiceComponent_AdditionalServiceEventEClass, ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__LOCATION);
		createEAttribute(additionalServiceComponent_AdditionalServiceEventEClass, ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__PRICE);
		createEAttribute(additionalServiceComponent_AdditionalServiceEventEClass, ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__MAX_ATTENDANT);
		createEOperation(additionalServiceComponent_AdditionalServiceEventEClass, ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT___GET_ADDITIONAL_SERVICE_INFO__STRING);

		additionalServiceComponent_IAdditionalServiceAdministrationEClass = createEClass(ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION);
		createEOperation(additionalServiceComponent_IAdditionalServiceAdministrationEClass, ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___CREATE_ADDITIONAL_SERVICE__STRING_INT_INT);
		createEOperation(additionalServiceComponent_IAdditionalServiceAdministrationEClass, ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___EDIT_ADDITIONAL_SERVICE__STRING_STRING_INT_INT);
		createEOperation(additionalServiceComponent_IAdditionalServiceAdministrationEClass, ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___REMOVE_ADDITIONAL_SERVICE__STRING);

		additionalServiceComponent_IAdditionalServiceInformationEClass = createEClass(ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_INFORMATION);
		createEOperation(additionalServiceComponent_IAdditionalServiceInformationEClass, ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_INFORMATION___GET_ADDITIONAL_SERVICE_INFO__STRING);
		createEOperation(additionalServiceComponent_IAdditionalServiceInformationEClass, ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_INFORMATION___GET_ALL_ADDITIONAL_SERVICES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(additionalServiceComponentEClass, AdditionalServiceComponent.class, "AdditionalServiceComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(additionalServiceComponent_AdditionalServiceEClass, AdditionalServiceComponent_AdditionalService.class, "AdditionalServiceComponent_AdditionalService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdditionalServiceComponent_AdditionalService_Name(), theTypesPackage.getString(), "name", null, 1, 1, AdditionalServiceComponent_AdditionalService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAdditionalServiceComponent_AdditionalService_Usable(), theTypesPackage.getBoolean(), "usable", null, 1, 1, AdditionalServiceComponent_AdditionalService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAdditionalServiceComponent_AdditionalService_Price(), theTypesPackage.getInteger(), "price", null, 1, 1, AdditionalServiceComponent_AdditionalService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAdditionalServiceComponent_AdditionalService_MaxAttendant(), theTypesPackage.getInteger(), "maxAttendant", null, 1, 1, AdditionalServiceComponent_AdditionalService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAdditionalServiceComponent_AdditionalService_Description(), theTypesPackage.getString(), "Description", null, 1, 1, AdditionalServiceComponent_AdditionalService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(additionalServiceComponent_AdditionalServiceEventEClass, AdditionalServiceComponent_AdditionalServiceEvent.class, "AdditionalServiceComponent_AdditionalServiceEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdditionalServiceComponent_AdditionalServiceEvent_DateTime(), ecorePackage.getEDate(), "dateTime", null, 1, 1, AdditionalServiceComponent_AdditionalServiceEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAdditionalServiceComponent_AdditionalServiceEvent_Name(), theTypesPackage.getString(), "name", null, 1, 1, AdditionalServiceComponent_AdditionalServiceEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAdditionalServiceComponent_AdditionalServiceEvent_Location(), theTypesPackage.getString(), "location", null, 1, 1, AdditionalServiceComponent_AdditionalServiceEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAdditionalServiceComponent_AdditionalServiceEvent_Price(), theTypesPackage.getInteger(), "price", null, 1, 1, AdditionalServiceComponent_AdditionalServiceEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAdditionalServiceComponent_AdditionalServiceEvent_MaxAttendant(), theTypesPackage.getInteger(), "maxAttendant", null, 1, 1, AdditionalServiceComponent_AdditionalServiceEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getAdditionalServiceComponent_AdditionalServiceEvent__GetAdditionalServiceInfo__String(), null, "getAdditionalServiceInfo", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "addtionalServiceName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(additionalServiceComponent_IAdditionalServiceAdministrationEClass, AdditionalServiceComponent_IAdditionalServiceAdministration.class, "AdditionalServiceComponent_IAdditionalServiceAdministration", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getAdditionalServiceComponent_IAdditionalServiceAdministration__CreateAdditionalService__String_int_int(), null, "createAdditionalService", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "maxAttendants", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getAdditionalServiceComponent_IAdditionalServiceAdministration__EditAdditionalService__String_String_int_int(), null, "editAdditionalService", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "oldName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "maxAttendants", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getAdditionalServiceComponent_IAdditionalServiceAdministration__RemoveAdditionalService__String(), null, "removeAdditionalService", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(additionalServiceComponent_IAdditionalServiceInformationEClass, AdditionalServiceComponent_IAdditionalServiceInformation.class, "AdditionalServiceComponent_IAdditionalServiceInformation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getAdditionalServiceComponent_IAdditionalServiceInformation__GetAdditionalServiceInfo__String(), null, "getAdditionalServiceInfo", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getAdditionalServiceComponent_IAdditionalServiceInformation__GetAllAdditionalServices(), null, "getAllAdditionalServices", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //AdditionalServicePackageImpl
