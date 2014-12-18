/**
 */
package Implementation.impl;

import Implementation.BookingComponent_IBookingDecision;
import Implementation.DecisionSupportComponent_AdditionalServiceDSSInfo;
import Implementation.DecisionSupportComponent_BookingDSSInfo;
import Implementation.DecisionSupportComponent_DSSController;
import Implementation.DecisionSupportComponent_OccupancyDSSInfo;
import Implementation.ImplementationPackage;
import Implementation.OccupancyComponent_IOccupancyDecision;
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
 * An implementation of the model object '<em><b>Decision Support Component DSS Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Implementation.impl.DecisionSupportComponent_DSSControllerImpl#getIOccupancyDecision <em>IOccupancy Decision</em>}</li>
 *   <li>{@link Implementation.impl.DecisionSupportComponent_DSSControllerImpl#getIBookingDecision <em>IBooking Decision</em>}</li>
 *   <li>{@link Implementation.impl.DecisionSupportComponent_DSSControllerImpl#getOccupancyDSSInfo <em>Occupancy DSS Info</em>}</li>
 *   <li>{@link Implementation.impl.DecisionSupportComponent_DSSControllerImpl#getAdditionalServiceDSSInfo <em>Additional Service DSS Info</em>}</li>
 *   <li>{@link Implementation.impl.DecisionSupportComponent_DSSControllerImpl#getBookingDSSInfo <em>Booking DSS Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecisionSupportComponent_DSSControllerImpl extends MinimalEObjectImpl.Container implements DecisionSupportComponent_DSSController {
	/**
	 * The cached value of the '{@link #getIOccupancyDecision() <em>IOccupancy Decision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIOccupancyDecision()
	 * @generated
	 * @ordered
	 */
	protected OccupancyComponent_IOccupancyDecision iOccupancyDecision;

	/**
	 * The cached value of the '{@link #getIBookingDecision() <em>IBooking Decision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIBookingDecision()
	 * @generated
	 * @ordered
	 */
	protected BookingComponent_IBookingDecision iBookingDecision;

	/**
	 * The cached value of the '{@link #getOccupancyDSSInfo() <em>Occupancy DSS Info</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccupancyDSSInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<DecisionSupportComponent_OccupancyDSSInfo> occupancyDSSInfo;

	/**
	 * The cached value of the '{@link #getAdditionalServiceDSSInfo() <em>Additional Service DSS Info</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalServiceDSSInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<DecisionSupportComponent_AdditionalServiceDSSInfo> additionalServiceDSSInfo;

	/**
	 * The cached value of the '{@link #getBookingDSSInfo() <em>Booking DSS Info</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingDSSInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<DecisionSupportComponent_BookingDSSInfo> bookingDSSInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionSupportComponent_DSSControllerImpl() {
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
	public OccupancyComponent_IOccupancyDecision getIOccupancyDecision() {
		if (iOccupancyDecision != null && iOccupancyDecision.eIsProxy()) {
			InternalEObject oldIOccupancyDecision = (InternalEObject)iOccupancyDecision;
			iOccupancyDecision = (OccupancyComponent_IOccupancyDecision)eResolveProxy(oldIOccupancyDecision);
			if (iOccupancyDecision != oldIOccupancyDecision) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__IOCCUPANCY_DECISION, oldIOccupancyDecision, iOccupancyDecision));
			}
		}
		return iOccupancyDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccupancyComponent_IOccupancyDecision basicGetIOccupancyDecision() {
		return iOccupancyDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIOccupancyDecision(OccupancyComponent_IOccupancyDecision newIOccupancyDecision) {
		OccupancyComponent_IOccupancyDecision oldIOccupancyDecision = iOccupancyDecision;
		iOccupancyDecision = newIOccupancyDecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__IOCCUPANCY_DECISION, oldIOccupancyDecision, iOccupancyDecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingComponent_IBookingDecision getIBookingDecision() {
		if (iBookingDecision != null && iBookingDecision.eIsProxy()) {
			InternalEObject oldIBookingDecision = (InternalEObject)iBookingDecision;
			iBookingDecision = (BookingComponent_IBookingDecision)eResolveProxy(oldIBookingDecision);
			if (iBookingDecision != oldIBookingDecision) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__IBOOKING_DECISION, oldIBookingDecision, iBookingDecision));
			}
		}
		return iBookingDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingComponent_IBookingDecision basicGetIBookingDecision() {
		return iBookingDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIBookingDecision(BookingComponent_IBookingDecision newIBookingDecision) {
		BookingComponent_IBookingDecision oldIBookingDecision = iBookingDecision;
		iBookingDecision = newIBookingDecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__IBOOKING_DECISION, oldIBookingDecision, iBookingDecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DecisionSupportComponent_OccupancyDSSInfo> getOccupancyDSSInfo() {
		if (occupancyDSSInfo == null) {
			occupancyDSSInfo = new EObjectResolvingEList<DecisionSupportComponent_OccupancyDSSInfo>(DecisionSupportComponent_OccupancyDSSInfo.class, this, ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__OCCUPANCY_DSS_INFO);
		}
		return occupancyDSSInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DecisionSupportComponent_AdditionalServiceDSSInfo> getAdditionalServiceDSSInfo() {
		if (additionalServiceDSSInfo == null) {
			additionalServiceDSSInfo = new EObjectResolvingEList<DecisionSupportComponent_AdditionalServiceDSSInfo>(DecisionSupportComponent_AdditionalServiceDSSInfo.class, this, ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__ADDITIONAL_SERVICE_DSS_INFO);
		}
		return additionalServiceDSSInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DecisionSupportComponent_BookingDSSInfo> getBookingDSSInfo() {
		if (bookingDSSInfo == null) {
			bookingDSSInfo = new EObjectResolvingEList<DecisionSupportComponent_BookingDSSInfo>(DecisionSupportComponent_BookingDSSInfo.class, this, ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__BOOKING_DSS_INFO);
		}
		return bookingDSSInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void getDSSData() {
//		if (bookingDSSInfo == null){
//			bookingDSSInfo = new EObjectResolvingEList<DecisionSupportComponent_BookingDSSInfo>(DecisionSupportComponent_BookingDSSInfo.class, this,
//					ImplementationPackage.BOOKING_COMPONENT_BOOKING_MANAGER__BOOKINGS);
//		}
	


		EList<String> dssInfo = iBookingDecision.getDSSInfo();
		
		for (String dssData: dssInfo){
			String[] DSSDataList= dssData.split(";");
			String[] DSSBookingList = DSSDataList[0].split(",");
			String[] additionalService = DSSDataList[1].split(",");
			
			
			DecisionSupportComponent_BookingDSSInfo bookingDSSInformation = new DecisionSupportComponent_BookingDSSInfoImpl(DSSBookingList[0],
					DSSBookingList[1],DSSBookingList[2],DSSBookingList[3],DSSBookingList[4],
					DSSBookingList[5],DSSBookingList[6], Integer.parseInt(DSSBookingList[7]));
			
//			EList<String> DSSInfo = new EObjectResolvingEList<String>(BookingComponent_Booking.class, this, 
//			ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__BOOKINGS);		
			
			
			EList<DecisionSupportComponent_AdditionalServiceDSSInfo> addServices = new EObjectResolvingEList<DecisionSupportComponent_AdditionalServiceDSSInfo>
			(DecisionSupportComponent_AdditionalServiceDSSInfo.class, this, ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__OCCUPANCY_DSS_INFO);
			for (String addService:additionalService){
				if(addService != null){
					String[] addServiceList= addService.split(":");
					bookingDSSInformation.addAdditionalService(addServiceList[0], Long.parseLong(addServiceList[1], 10));
				}
			}
			bookingDSSInfo.add(bookingDSSInformation);
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> getAllRoomTypeFrequency() {
		EList<String> roomTypeFrequency = new EObjectResolvingEList<String>(DecisionSupportComponent_DSSControllerImpl.class, this, 
				ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__OCCUPANCY_DSS_INFO);

		int[] count = new int[bookingDSSInfo.size()];
		EList<String> roomTypes = new EObjectResolvingEList<String>(DecisionSupportComponent_DSSControllerImpl.class, this, 
				ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__OCCUPANCY_DSS_INFO);


		// Add all unique roomtypes to a list
		for(int i = 0; i < bookingDSSInfo.size(); i++){
			DecisionSupportComponent_BookingDSSInfo current_bookingDSSInfo = bookingDSSInfo.get(i);
			if(getPositionInList(roomTypes, current_bookingDSSInfo.getRoomType()) == -1){
				roomTypes.add(current_bookingDSSInfo.getRoomType());
			}
		}

		// Count all the unique room types and add it to roomTypeFrequency list
		for(int i = 0; i < roomTypes.size(); i++){
			count[i] = countRoomType(bookingDSSInfo, roomTypes.get(i));
			roomTypeFrequency.add(roomTypes.get(i) + ":" + count[i]);
		}

		return roomTypeFrequency;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getRoomTypeFrequency(String roomType) {
		return roomType + ":" + countRoomType(bookingDSSInfo, roomType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int countRoomType(EList<DecisionSupportComponent_BookingDSSInfo> bookingDSSInfo, String roomType) {

		int countForCurrentBooking = 0;
		for(DecisionSupportComponent_BookingDSSInfo current_bookingDSSInfo: bookingDSSInfo){

			if(current_bookingDSSInfo.getRoomType().equals(roomType))
				countForCurrentBooking++;
		}

		return countForCurrentBooking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> getAllCustomerBookingFrequency() {
		EList<String> customerBookingFrequency = new EObjectResolvingEList<String>(DecisionSupportComponent_DSSControllerImpl.class, this, 
				ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__OCCUPANCY_DSS_INFO);

		int[] count = new int[bookingDSSInfo.size()];
		EList<String> customers = new EObjectResolvingEList<String>(DecisionSupportComponent_DSSControllerImpl.class, this, 
				ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__OCCUPANCY_DSS_INFO);


		// Add all unique customers to a list
		for(int i = 0; i < bookingDSSInfo.size(); i++){
			DecisionSupportComponent_BookingDSSInfo current_bookingDSSInfo = bookingDSSInfo.get(i);
			if(getPositionInList(customers, current_bookingDSSInfo.getCustomerSSN()) == -1){
				customers.add(current_bookingDSSInfo.getCustomerSSN());
			}
		}

		// Count all the occurances of customer in booking and adds it to customerBookingFrequency list
		for(int i = 0; i < customers.size(); i++){
			count[i] = countCustomerBooking(bookingDSSInfo, customers.get(i));
			customerBookingFrequency.add(customers.get(i) + ":" + count[i]);
		}

		return customerBookingFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getCustomerBookingFrequency(String customerSSN) {
		return customerSSN + ":" + countCustomerBooking(bookingDSSInfo, customerSSN);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void getDSSOccupancyInfo() {

		String DSSOccupancyInformation = iOccupancyDecision.getDSSOccupancyInfo();
		String[] DSSOccupancyList = DSSOccupancyInformation.split(";");
		for (String DSSOccupancy: DSSOccupancyList){
			String[] dssOccupanList = DSSOccupancy.split(",");
			occupancyDSSInfo.add(new DecisionSupportComponent_OccupancyDSSInfoImpl(Integer.parseInt(dssOccupanList[0]),dssOccupanList[1]
					,dssOccupanList[2],Integer.parseInt(dssOccupanList[3])));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getNumberOfOccupanciesOfRoom(int roomNumber) {
		int roomFrequency = 0;
		for(DecisionSupportComponent_OccupancyDSSInfo dssOccuInfo: occupancyDSSInfo){
			int roomNo = dssOccuInfo.getRoomNumber();
			if(roomNo == roomNumber){
				roomFrequency ++;
			}
		}
		return roomFrequency;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int countCustomerBooking(EList<DecisionSupportComponent_BookingDSSInfo> bookingDSSInfo, String customerSSN) {
		int countForCurrentCustomer = 0;
		for(DecisionSupportComponent_BookingDSSInfo current_bookingDSSInfo: bookingDSSInfo){

			if(current_bookingDSSInfo.getCustomerSSN().equals(customerSSN))
				countForCurrentCustomer++;
		}

		return countForCurrentCustomer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getPositionInList(EList<String> listToCheck, String element) {
		int i = 0;
		for(String member: listToCheck){
			i++;
			if(member.equals(element))
				return i;
		}

		return -1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__IOCCUPANCY_DECISION:
				if (resolve) return getIOccupancyDecision();
				return basicGetIOccupancyDecision();
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__IBOOKING_DECISION:
				if (resolve) return getIBookingDecision();
				return basicGetIBookingDecision();
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__OCCUPANCY_DSS_INFO:
				return getOccupancyDSSInfo();
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__ADDITIONAL_SERVICE_DSS_INFO:
				return getAdditionalServiceDSSInfo();
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__BOOKING_DSS_INFO:
				return getBookingDSSInfo();
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
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__IOCCUPANCY_DECISION:
				setIOccupancyDecision((OccupancyComponent_IOccupancyDecision)newValue);
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__IBOOKING_DECISION:
				setIBookingDecision((BookingComponent_IBookingDecision)newValue);
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__OCCUPANCY_DSS_INFO:
				getOccupancyDSSInfo().clear();
				getOccupancyDSSInfo().addAll((Collection<? extends DecisionSupportComponent_OccupancyDSSInfo>)newValue);
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__ADDITIONAL_SERVICE_DSS_INFO:
				getAdditionalServiceDSSInfo().clear();
				getAdditionalServiceDSSInfo().addAll((Collection<? extends DecisionSupportComponent_AdditionalServiceDSSInfo>)newValue);
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__BOOKING_DSS_INFO:
				getBookingDSSInfo().clear();
				getBookingDSSInfo().addAll((Collection<? extends DecisionSupportComponent_BookingDSSInfo>)newValue);
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
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__IOCCUPANCY_DECISION:
				setIOccupancyDecision((OccupancyComponent_IOccupancyDecision)null);
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__IBOOKING_DECISION:
				setIBookingDecision((BookingComponent_IBookingDecision)null);
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__OCCUPANCY_DSS_INFO:
				getOccupancyDSSInfo().clear();
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__ADDITIONAL_SERVICE_DSS_INFO:
				getAdditionalServiceDSSInfo().clear();
				return;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__BOOKING_DSS_INFO:
				getBookingDSSInfo().clear();
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
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__IOCCUPANCY_DECISION:
				return iOccupancyDecision != null;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__IBOOKING_DECISION:
				return iBookingDecision != null;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__OCCUPANCY_DSS_INFO:
				return occupancyDSSInfo != null && !occupancyDSSInfo.isEmpty();
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__ADDITIONAL_SERVICE_DSS_INFO:
				return additionalServiceDSSInfo != null && !additionalServiceDSSInfo.isEmpty();
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__BOOKING_DSS_INFO:
				return bookingDSSInfo != null && !bookingDSSInfo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER___GET_DSS_DATA:
				getDSSData();
				return null;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER___GET_ALL_ROOM_TYPE_FREQUENCY:
				return getAllRoomTypeFrequency();
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER___GET_ROOM_TYPE_FREQUENCY__STRING:
				return getRoomTypeFrequency((String)arguments.get(0));
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER___COUNT_ROOM_TYPE__ELIST_STRING:
				return countRoomType((EList<DecisionSupportComponent_BookingDSSInfo>)arguments.get(0), (String)arguments.get(1));
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER___GET_ALL_CUSTOMER_BOOKING_FREQUENCY:
				return getAllCustomerBookingFrequency();
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER___GET_CUSTOMER_BOOKING_FREQUENCY__STRING:
				return getCustomerBookingFrequency((String)arguments.get(0));
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER___GET_DSS_OCCUPANCY_INFO:
				getDSSOccupancyInfo();
				return null;
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER___GET_NUMBER_OF_OCCUPANCIES_OF_ROOM__INT:
				return getNumberOfOccupanciesOfRoom((Integer)arguments.get(0));
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER___COUNT_CUSTOMER_BOOKING__ELIST_STRING:
				return countCustomerBooking((EList<DecisionSupportComponent_BookingDSSInfo>)arguments.get(0), (String)arguments.get(1));
			case ImplementationPackage.DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER___GET_POSITION_IN_LIST__ELIST_STRING:
				return getPositionInList((EList<String>)arguments.get(0), (String)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //DecisionSupportComponent_DSSControllerImpl
