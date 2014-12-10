/**
 */
package implementation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Support Component Dss Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link implementation.DecisionSupportComponent_DssController#getDssProcessor <em>Dss Processor</em>}</li>
 *   <li>{@link implementation.DecisionSupportComponent_DssController#getDssPresenter <em>Dss Presenter</em>}</li>
 * </ul>
 * </p>
 *
 * @see implementation.ImplementationPackage#getDecisionSupportComponent_DssController()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DSSController'"
 * @generated
 */
public interface DecisionSupportComponent_DssController extends OccupancyComponent_IOccupancy {
	/**
	 * Returns the value of the '<em><b>Dss Processor</b></em>' reference list.
	 * The list contents are of type {@link implementation.DecisionSupportComponent_DssProcessor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dss Processor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dss Processor</em>' reference list.
	 * @see implementation.ImplementationPackage#getDecisionSupportComponent_DssController_DssProcessor()
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='dSSProcessor'"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='dSSController'"
	 * @generated
	 */
	EList<DecisionSupportComponent_DssProcessor> getDssProcessor();

	/**
	 * Returns the value of the '<em><b>Dss Presenter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dss Presenter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dss Presenter</em>' reference.
	 * @see #setDssPresenter(DecisionSupportComponent_DssPresenter)
	 * @see implementation.ImplementationPackage#getDecisionSupportComponent_DssController_DssPresenter()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='dSSPresenter'"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='dSSController'"
	 * @generated
	 */
	DecisionSupportComponent_DssPresenter getDssPresenter();

	/**
	 * Sets the value of the '{@link implementation.DecisionSupportComponent_DssController#getDssPresenter <em>Dss Presenter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dss Presenter</em>' reference.
	 * @see #getDssPresenter()
	 * @generated
	 */
	void setDssPresenter(DecisionSupportComponent_DssPresenter value);

} // DecisionSupportComponent_DssController
