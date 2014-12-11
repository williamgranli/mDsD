/**
 */
package Implementation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Support Component DSS Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Implementation.DecisionSupportComponent_DSSController#getDSSProcessor <em>DSS Processor</em>}</li>
 *   <li>{@link Implementation.DecisionSupportComponent_DSSController#getDSSPresenter <em>DSS Presenter</em>}</li>
 *   <li>{@link Implementation.DecisionSupportComponent_DSSController#getIRoomDecision <em>IRoom Decision</em>}</li>
 *   <li>{@link Implementation.DecisionSupportComponent_DSSController#getIOccupancyDecision <em>IOccupancy Decision</em>}</li>
 *   <li>{@link Implementation.DecisionSupportComponent_DSSController#getIAdditionalServiceDecision <em>IAdditional Service Decision</em>}</li>
 *   <li>{@link Implementation.DecisionSupportComponent_DSSController#getIBookingDecision <em>IBooking Decision</em>}</li>
 * </ul>
 * </p>
 *
 * @see Implementation.ImplementationPackage#getDecisionSupportComponent_DSSController()
 * @model
 * @generated
 */
public interface DecisionSupportComponent_DSSController extends OccupancyComponent_IOccupancy {
	/**
	 * Returns the value of the '<em><b>DSS Processor</b></em>' reference list.
	 * The list contents are of type {@link Implementation.DecisionSupportComponent_DSSProcessor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DSS Processor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DSS Processor</em>' reference list.
	 * @see Implementation.ImplementationPackage#getDecisionSupportComponent_DSSController_DSSProcessor()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DecisionSupportComponent_DSSProcessor> getDSSProcessor();

	/**
	 * Returns the value of the '<em><b>DSS Presenter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DSS Presenter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DSS Presenter</em>' reference.
	 * @see #setDSSPresenter(DecisionSupportComponent_DSSPresenter)
	 * @see Implementation.ImplementationPackage#getDecisionSupportComponent_DSSController_DSSPresenter()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DecisionSupportComponent_DSSPresenter getDSSPresenter();

	/**
	 * Sets the value of the '{@link Implementation.DecisionSupportComponent_DSSController#getDSSPresenter <em>DSS Presenter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DSS Presenter</em>' reference.
	 * @see #getDSSPresenter()
	 * @generated
	 */
	void setDSSPresenter(DecisionSupportComponent_DSSPresenter value);

	/**
	 * Returns the value of the '<em><b>IRoom Decision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IRoom Decision</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IRoom Decision</em>' reference.
	 * @see #setIRoomDecision(RoomComponent_IRoomDecision)
	 * @see Implementation.ImplementationPackage#getDecisionSupportComponent_DSSController_IRoomDecision()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomComponent_IRoomDecision getIRoomDecision();

	/**
	 * Sets the value of the '{@link Implementation.DecisionSupportComponent_DSSController#getIRoomDecision <em>IRoom Decision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IRoom Decision</em>' reference.
	 * @see #getIRoomDecision()
	 * @generated
	 */
	void setIRoomDecision(RoomComponent_IRoomDecision value);

	/**
	 * Returns the value of the '<em><b>IOccupancy Decision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IOccupancy Decision</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IOccupancy Decision</em>' reference.
	 * @see #setIOccupancyDecision(OccupancyComponent_IOccupancyDecision)
	 * @see Implementation.ImplementationPackage#getDecisionSupportComponent_DSSController_IOccupancyDecision()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	OccupancyComponent_IOccupancyDecision getIOccupancyDecision();

	/**
	 * Sets the value of the '{@link Implementation.DecisionSupportComponent_DSSController#getIOccupancyDecision <em>IOccupancy Decision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IOccupancy Decision</em>' reference.
	 * @see #getIOccupancyDecision()
	 * @generated
	 */
	void setIOccupancyDecision(OccupancyComponent_IOccupancyDecision value);

	/**
	 * Returns the value of the '<em><b>IAdditional Service Decision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IAdditional Service Decision</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IAdditional Service Decision</em>' reference.
	 * @see #setIAdditionalServiceDecision(AdditionalServiceComponent_IAdditionalServiceDecision)
	 * @see Implementation.ImplementationPackage#getDecisionSupportComponent_DSSController_IAdditionalServiceDecision()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AdditionalServiceComponent_IAdditionalServiceDecision getIAdditionalServiceDecision();

	/**
	 * Sets the value of the '{@link Implementation.DecisionSupportComponent_DSSController#getIAdditionalServiceDecision <em>IAdditional Service Decision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IAdditional Service Decision</em>' reference.
	 * @see #getIAdditionalServiceDecision()
	 * @generated
	 */
	void setIAdditionalServiceDecision(AdditionalServiceComponent_IAdditionalServiceDecision value);

	/**
	 * Returns the value of the '<em><b>IBooking Decision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IBooking Decision</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IBooking Decision</em>' reference.
	 * @see #setIBookingDecision(BookingComponent_IBookingDecision)
	 * @see Implementation.ImplementationPackage#getDecisionSupportComponent_DSSController_IBookingDecision()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BookingComponent_IBookingDecision getIBookingDecision();

	/**
	 * Sets the value of the '{@link Implementation.DecisionSupportComponent_DSSController#getIBookingDecision <em>IBooking Decision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IBooking Decision</em>' reference.
	 * @see #getIBookingDecision()
	 * @generated
	 */
	void setIBookingDecision(BookingComponent_IBookingDecision value);

} // DecisionSupportComponent_DSSController
