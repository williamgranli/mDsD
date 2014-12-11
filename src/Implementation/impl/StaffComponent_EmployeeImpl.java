/**
 */
package Implementation.impl;

import Implementation.ImplementationPackage;
import Implementation.StaffComponent_Employee;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Staff Component Employee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Implementation.impl.StaffComponent_EmployeeImpl#getId <em>Id</em>}</li>
 *   <li>{@link Implementation.impl.StaffComponent_EmployeeImpl#getSsn <em>Ssn</em>}</li>
 *   <li>{@link Implementation.impl.StaffComponent_EmployeeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Implementation.impl.StaffComponent_EmployeeImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link Implementation.impl.StaffComponent_EmployeeImpl#getPhone <em>Phone</em>}</li>
 *   <li>{@link Implementation.impl.StaffComponent_EmployeeImpl#getPassword <em>Password</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StaffComponent_EmployeeImpl extends MinimalEObjectImpl.Container implements StaffComponent_Employee {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSsn() <em>Ssn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsn()
	 * @generated
	 * @ordered
	 */
	protected static final String SSN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSsn() <em>Ssn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsn()
	 * @generated
	 * @ordered
	 */
	protected String ssn = SSN_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhone() <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected static final String PHONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhone() <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected String phone = PHONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaffComponent_EmployeeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param password 
	 * @param phone 
	 * @param email 
	 * @param name 
	 * @param ssn 
	 * @generated NOT
	 */
	protected StaffComponent_EmployeeImpl(String ssn, String name, String email, String phone, String password) {
		super();
		this.setSsn(ssn);
		this.setName(name);
		this.setEmail(email);
		this.setPhone(phone);
		this.setPassword(password);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.STAFF_COMPONENT_EMPLOYEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.STAFF_COMPONENT_EMPLOYEE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSsn() {
		return ssn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSsn(String newSsn) {
		String oldSsn = ssn;
		ssn = newSsn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.STAFF_COMPONENT_EMPLOYEE__SSN, oldSsn, ssn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.STAFF_COMPONENT_EMPLOYEE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.STAFF_COMPONENT_EMPLOYEE__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhone(String newPhone) {
		String oldPhone = phone;
		phone = newPhone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.STAFF_COMPONENT_EMPLOYEE__PHONE, oldPhone, phone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.STAFF_COMPONENT_EMPLOYEE__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void Employee(String ssn, String name, String email, String phone, String password) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void Employee() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getEmployeeInfo() {

		String ssn = "\n* SSN: " + this.getSsn();
		String name = "\n* Name: " + this.getName();
		String email = "\n* Email: " + this.getEmail();
		String phone = "\n* Phone: " + this.getPhone();
		String password = "\n* Password: 1024-bits encryption, mate.";// + this.getPassword();
		return "\n---" + ssn + name + email + phone + password + "\n---";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImplementationPackage.STAFF_COMPONENT_EMPLOYEE__ID:
				return getId();
			case ImplementationPackage.STAFF_COMPONENT_EMPLOYEE__SSN:
				return getSsn();
			case ImplementationPackage.STAFF_COMPONENT_EMPLOYEE__NAME:
				return getName();
			case ImplementationPackage.STAFF_COMPONENT_EMPLOYEE__EMAIL:
				return getEmail();
			case ImplementationPackage.STAFF_COMPONENT_EMPLOYEE__PHONE:
				return getPhone();
			case ImplementationPackage.STAFF_COMPONENT_EMPLOYEE__PASSWORD:
				return getPassword();
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
			case ImplementationPackage.STAFF_COMPONENT_EMPLOYEE__ID:
				setId((Integer)newValue);
				return;
			case ImplementationPackage.STAFF_COMPONENT_EMPLOYEE__SSN:
				setSsn((String)newValue);
				return;
			case ImplementationPackage.STAFF_COMPONENT_EMPLOYEE__NAME:
				setName((String)newValue);
				return;
			case ImplementationPackage.STAFF_COMPONENT_EMPLOYEE__EMAIL:
				setEmail((String)newValue);
				return;
			case ImplementationPackage.STAFF_COMPONENT_EMPLOYEE__PHONE:
				setPhone((String)newValue);
				return;
			case ImplementationPackage.STAFF_COMPONENT_EMPLOYEE__PASSWORD:
				setPassword((String)newValue);
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
			case ImplementationPackage.STAFF_COMPONENT_EMPLOYEE__ID:
				setId(ID_EDEFAULT);
				return;
			case ImplementationPackage.STAFF_COMPONENT_EMPLOYEE__SSN:
				setSsn(SSN_EDEFAULT);
				return;
			case ImplementationPackage.STAFF_COMPONENT_EMPLOYEE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ImplementationPackage.STAFF_COMPONENT_EMPLOYEE__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case ImplementationPackage.STAFF_COMPONENT_EMPLOYEE__PHONE:
				setPhone(PHONE_EDEFAULT);
				return;
			case ImplementationPackage.STAFF_COMPONENT_EMPLOYEE__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
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
			case ImplementationPackage.STAFF_COMPONENT_EMPLOYEE__ID:
				return id != ID_EDEFAULT;
			case ImplementationPackage.STAFF_COMPONENT_EMPLOYEE__SSN:
				return SSN_EDEFAULT == null ? ssn != null : !SSN_EDEFAULT.equals(ssn);
			case ImplementationPackage.STAFF_COMPONENT_EMPLOYEE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ImplementationPackage.STAFF_COMPONENT_EMPLOYEE__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case ImplementationPackage.STAFF_COMPONENT_EMPLOYEE__PHONE:
				return PHONE_EDEFAULT == null ? phone != null : !PHONE_EDEFAULT.equals(phone);
			case ImplementationPackage.STAFF_COMPONENT_EMPLOYEE__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
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
			case ImplementationPackage.STAFF_COMPONENT_EMPLOYEE___EMPLOYEE__STRING_STRING_STRING_STRING_STRING:
				Employee((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4));
				return null;
			case ImplementationPackage.STAFF_COMPONENT_EMPLOYEE___EMPLOYEE:
				Employee();
				return null;
			case ImplementationPackage.STAFF_COMPONENT_EMPLOYEE___GET_EMPLOYEE_INFO:
				return getEmployeeInfo();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", ssn: ");
		result.append(ssn);
		result.append(", name: ");
		result.append(name);
		result.append(", email: ");
		result.append(email);
		result.append(", phone: ");
		result.append(phone);
		result.append(", password: ");
		result.append(password);
		result.append(')');
		return result.toString();
	}

} //StaffComponent_EmployeeImpl
