/**
 */
package Implementation.impl;

//banking
import javax.xml.soap.SOAPException;

import Implementation.Bank_AdministratorProvides;
import Implementation.Bank_CustomerProvides;
import Implementation.ImplementationPackage;
import Implementation.PaymentComponent_Payment;
import Implementation.PaymentComponent_PaymentHandler;

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
 * An implementation of the model object '<em><b>Payment Component Payment Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Implementation.impl.PaymentComponent_PaymentHandlerImpl#getPayment <em>Payment</em>}</li>
 *   <li>{@link Implementation.impl.PaymentComponent_PaymentHandlerImpl#getCustomerProvides <em>Customer Provides</em>}</li>
 *   <li>{@link Implementation.impl.PaymentComponent_PaymentHandlerImpl#getAdministratorProvides <em>Administrator Provides</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PaymentComponent_PaymentHandlerImpl extends MinimalEObjectImpl.Container implements PaymentComponent_PaymentHandler {
	/**
	 * The cached value of the '{@link #getPayment() <em>Payment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment()
	 * @generated
	 * @ordered
	 */
	protected EList<PaymentComponent_Payment> payment;

	/**
	 * The cached value of the '{@link #getCustomerProvides() <em>Customer Provides</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerProvides()
	 * @generated
	 * @ordered
	 */
	protected Bank_CustomerProvides customerProvides;
	/**
	 * The cached value of the '{@link #getAdministratorProvides() <em>Administrator Provides</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdministratorProvides()
	 * @generated
	 * @ordered
	 */
	protected Bank_AdministratorProvides administratorProvides;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentComponent_PaymentHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.PAYMENT_COMPONENT_PAYMENT_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PaymentComponent_Payment> getPayment() {
		if (payment == null) {
			payment = new EObjectResolvingEList<PaymentComponent_Payment>(PaymentComponent_Payment.class, this, ImplementationPackage.PAYMENT_COMPONENT_PAYMENT_HANDLER__PAYMENT);
		}
		return payment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bank_CustomerProvides getCustomerProvides() {
		if (customerProvides != null && customerProvides.eIsProxy()) {
			InternalEObject oldCustomerProvides = (InternalEObject)customerProvides;
			customerProvides = (Bank_CustomerProvides)eResolveProxy(oldCustomerProvides);
			if (customerProvides != oldCustomerProvides) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.PAYMENT_COMPONENT_PAYMENT_HANDLER__CUSTOMER_PROVIDES, oldCustomerProvides, customerProvides));
			}
		}
		return customerProvides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bank_CustomerProvides basicGetCustomerProvides() {
		return customerProvides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerProvides(Bank_CustomerProvides newCustomerProvides) {
		Bank_CustomerProvides oldCustomerProvides = customerProvides;
		customerProvides = newCustomerProvides;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.PAYMENT_COMPONENT_PAYMENT_HANDLER__CUSTOMER_PROVIDES, oldCustomerProvides, customerProvides));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bank_AdministratorProvides getAdministratorProvides() {
		if (administratorProvides != null && administratorProvides.eIsProxy()) {
			InternalEObject oldAdministratorProvides = (InternalEObject)administratorProvides;
			administratorProvides = (Bank_AdministratorProvides)eResolveProxy(oldAdministratorProvides);
			if (administratorProvides != oldAdministratorProvides) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.PAYMENT_COMPONENT_PAYMENT_HANDLER__ADMINISTRATOR_PROVIDES, oldAdministratorProvides, administratorProvides));
			}
		}
		return administratorProvides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bank_AdministratorProvides basicGetAdministratorProvides() {
		return administratorProvides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdministratorProvides(Bank_AdministratorProvides newAdministratorProvides) {
		Bank_AdministratorProvides oldAdministratorProvides = administratorProvides;
		administratorProvides = newAdministratorProvides;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.PAYMENT_COMPONENT_PAYMENT_HANDLER__ADMINISTRATOR_PROVIDES, oldAdministratorProvides, administratorProvides));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean makePayment(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName, double amount) {
		// CustomerRequires interface
		try {
			// Acquire CustomerRequires object
			se.chalmers.cse.mdsd1415.banking.customerRequires.CustomerRequires banking = se.chalmers.cse.mdsd1415.banking.customerRequires.CustomerRequires
					.instance();

			// Make a payment
			if (banking.makePayment(ccNumber, ccv, expiryMonth, expiryYear, firstName,
					lastName, amount)) {
				System.out.println("Payment of 25.50 successfully processed");
				return true;
			} else {
				System.out
						.println("Payment failed - invalid credit card or insufficient credit");
				return false;
			}

		} catch (SOAPException e) {
			System.err
					.println("Error occurred while communicating with the bank");
			e.printStackTrace();
			return false;
		}
		

		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCC(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) {
		try {
			// Acquire CustomerRequires object
			se.chalmers.cse.mdsd1415.banking.customerRequires.CustomerRequires banking = se.chalmers.cse.mdsd1415.banking.customerRequires.CustomerRequires
					.instance();

			// Check for credit card validity
			if (banking.isCreditCardValid(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName)) {
				System.out.println("Valid credit card");
				return true;
			} else {
				System.out.println("Invalid credit card");
				return false;
			}
		} catch (SOAPException e) {
			System.err
					.println("Error occurred while communicating with the bank");
			e.printStackTrace();
			return false;
		}
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean addCC(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) {
		// BankingAdministrationRequires interface
		try {
			// Acquire AdministratorRequires object
			se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires bankingAdmin = se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires
					.instance();
			
			// Add new credit card
			if (bankingAdmin.addCreditCard(ccNumber, ccv, expiryMonth, expiryYear, firstName,
					lastName)) {
				System.out.println("Successfully added credit card.");
				return true;
			} else {
				System.out.println("Error while adding credit card.");
				return false;
			}


		} catch (SOAPException e) {
			System.err
					.println("Error occurred while communicating with the bank administration");
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double checkBalance(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) {
		// BankingAdministrationRequires interface
		double resultBalance = -1;
		try {
			// Acquire AdministratorRequires object
			se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires bankingAdmin = se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires
					.instance();


			// Get current Balance
			resultBalance = bankingAdmin.getBalance(ccNumber, ccv, expiryMonth, expiryYear, firstName,
					lastName);
			if (resultBalance != -1.0) {
				System.out.println("Balance: " + resultBalance);
				
			} else {
				System.out.println("Error while checking Balance.");
			}


		} catch (SOAPException e) {
			System.err
					.println("Error occurred while communicating with the bank administration");
			e.printStackTrace();
		}
		return resultBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double makeDeposit(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName, double amount) {

		
		double resultBalance = -1;
		// BankingAdministrationRequires interface
		try {
			// Acquire AdministratorRequires object
			se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires bankingAdmin = se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires
					.instance();
			
			// Make a deposit
			resultBalance = bankingAdmin.makeDeposit(ccNumber, ccv, expiryMonth, expiryYear, firstName,
					lastName, amount	);
			if (resultBalance != -1.0) {
				System.out.println("Successfully made a deposit: "
						+ resultBalance);
			} else {
				System.out.println("Error while making deposit.");
			}
			


		} catch (SOAPException e) {
			System.err
					.println("Error occurred while communicating with the bank administration");
			e.printStackTrace();
		}
		
		return resultBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean removeCC(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) {

		
		// BankingAdministrationRequires interface
				try {
					// Acquire AdministratorRequires object
					se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires bankingAdmin = se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires
							.instance();
					
					// Remove an existing credit card
					if (bankingAdmin.removeCreditCard(ccNumber, ccv, expiryMonth, expiryYear, firstName,
							lastName)) {
						System.out.println("Successfully removed credit card.");
						return true;
					} else {
						System.out.println("Error while removing credit card.");
						return false;
					}

				} catch (SOAPException e) {
					System.err
							.println("Error occurred while communicating with the bank administration");
					e.printStackTrace();
					return false;
				}
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImplementationPackage.PAYMENT_COMPONENT_PAYMENT_HANDLER__PAYMENT:
				return getPayment();
			case ImplementationPackage.PAYMENT_COMPONENT_PAYMENT_HANDLER__CUSTOMER_PROVIDES:
				if (resolve) return getCustomerProvides();
				return basicGetCustomerProvides();
			case ImplementationPackage.PAYMENT_COMPONENT_PAYMENT_HANDLER__ADMINISTRATOR_PROVIDES:
				if (resolve) return getAdministratorProvides();
				return basicGetAdministratorProvides();
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
			case ImplementationPackage.PAYMENT_COMPONENT_PAYMENT_HANDLER__PAYMENT:
				getPayment().clear();
				getPayment().addAll((Collection<? extends PaymentComponent_Payment>)newValue);
				return;
			case ImplementationPackage.PAYMENT_COMPONENT_PAYMENT_HANDLER__CUSTOMER_PROVIDES:
				setCustomerProvides((Bank_CustomerProvides)newValue);
				return;
			case ImplementationPackage.PAYMENT_COMPONENT_PAYMENT_HANDLER__ADMINISTRATOR_PROVIDES:
				setAdministratorProvides((Bank_AdministratorProvides)newValue);
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
			case ImplementationPackage.PAYMENT_COMPONENT_PAYMENT_HANDLER__PAYMENT:
				getPayment().clear();
				return;
			case ImplementationPackage.PAYMENT_COMPONENT_PAYMENT_HANDLER__CUSTOMER_PROVIDES:
				setCustomerProvides((Bank_CustomerProvides)null);
				return;
			case ImplementationPackage.PAYMENT_COMPONENT_PAYMENT_HANDLER__ADMINISTRATOR_PROVIDES:
				setAdministratorProvides((Bank_AdministratorProvides)null);
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
			case ImplementationPackage.PAYMENT_COMPONENT_PAYMENT_HANDLER__PAYMENT:
				return payment != null && !payment.isEmpty();
			case ImplementationPackage.PAYMENT_COMPONENT_PAYMENT_HANDLER__CUSTOMER_PROVIDES:
				return customerProvides != null;
			case ImplementationPackage.PAYMENT_COMPONENT_PAYMENT_HANDLER__ADMINISTRATOR_PROVIDES:
				return administratorProvides != null;
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
			case ImplementationPackage.PAYMENT_COMPONENT_PAYMENT_HANDLER___MAKE_PAYMENT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE:
				return makePayment((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5), (Double)arguments.get(6));
			case ImplementationPackage.PAYMENT_COMPONENT_PAYMENT_HANDLER___VALIDATE_CC__STRING_STRING_INT_INT_STRING_STRING:
				return validateCC((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5));
			case ImplementationPackage.PAYMENT_COMPONENT_PAYMENT_HANDLER___ADD_CC__STRING_STRING_INT_INT_STRING_STRING:
				return addCC((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5));
			case ImplementationPackage.PAYMENT_COMPONENT_PAYMENT_HANDLER___CHECK_BALANCE__STRING_STRING_INT_INT_STRING_STRING:
				return checkBalance((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5));
			case ImplementationPackage.PAYMENT_COMPONENT_PAYMENT_HANDLER___MAKE_DEPOSIT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE:
				return makeDeposit((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5), (Double)arguments.get(6));
			case ImplementationPackage.PAYMENT_COMPONENT_PAYMENT_HANDLER___REMOVE_CC__STRING_STRING_INT_INT_STRING_STRING:
				return removeCC((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5));
		}
		return super.eInvoke(operationID, arguments);
	}

} //PaymentComponent_PaymentHandlerImpl
