package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class PaymentTests {
	
	static Implementation.ImplementationFactory factory;
	static Implementation.PaymentComponent_PaymentHandler payment;
	static Implementation.Bank_CustomerProvides customer;
	static Implementation.Bank_AdministratorProvides administrator;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		factory = Implementation.impl.ImplementationFactoryImpl.init();
		payment = factory.createPaymentComponent_PaymentHandler();
		payment.setCustomerProvides(customer);
		payment.setAdministratorProvides(administrator);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
		factory = null;
		payment = null;
		customer = null;
		administrator = null;
		
	}

	@Before
	public void setUp() throws Exception {
		payment.getPayment().clear();
	}

	@After
	public void tearDown() throws Exception {
	}
	

	
	@Test
	public void addValidateDepositBalancePayRemove() {
		
		//Add
		Boolean successfulAdd = payment.addCC("2020", "202", 9, 17, "William", "Granli");
		org.junit.Assert.assertTrue(successfulAdd == true);
		
		
		//Validate
		Boolean valid = payment.validateCC("2020", "202", 9, 17, "William", "Granli");
		org.junit.Assert.assertTrue(valid == true);
		
		
		//Deposit
		double balance1 = payment.makeDeposit("2020", "202", 9, 17, "William", "Granli", 5.0);
		org.junit.Assert.assertTrue(balance1 == 5.0);
		
		
		//Balance
		double balance2 = payment.checkBalance("2020", "202", 9, 17, "William", "Granli");
		org.junit.Assert.assertTrue(balance2 == 5.0);
		
		
		//Pay
		Boolean successfulPayment = payment.makePayment("2020", "202", 9, 17, "William", "Granli", 5);
		org.junit.Assert.assertTrue(successfulPayment == true);
		double balance3 = payment.checkBalance("2020", "202", 9, 17, "William", "Granli");
		org.junit.Assert.assertTrue(balance3 == 0);
		
		//Remove
		Boolean successRemoval = payment.removeCC("2020", "202", 9, 17, "William", "Granli");
		org.junit.Assert.assertTrue(successRemoval == true);
	}
}
