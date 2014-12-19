package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class StaffAdministrationTest {

	static Implementation.ImplementationFactory factory;
	static Implementation.StaffComponent_AccountManager am;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		factory = Implementation.impl.ImplementationFactoryImpl.init();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		am = factory.createStaffComponent_AccountManager();
	}

	@After
	public void tearDown() throws Exception {
		am = null;
	}

	@Test
	public void createAccount() {
		//System.out.print("\n### FUNC: ");
		//System.out.println("createEmployee()\n");
		
		am.createAccount("TESTARN", "101010-1010", "mail@receiver.com", "1337-133337", "SuPeR_SeCrEt");
		
		org.junit.Assert.assertTrue(am.getEmployees().size() == 1);
	}

	@Test
	public void createFiveAccounts() {
		//System.out.print("\n### FUNC: ");
		//System.out.println("createFiveAccounts()\n");
		
		am.createAccount("TESTARN", "101010-1010", "mail@receiver.com", "1337-133337", "SuPeR_SeCrEt");
		am.createAccount("TESTARN", "101010-1011", "mail@receiver.com", "1337-133337", "SuPeR_SeCrEt");
		am.createAccount("TESTARN", "101010-1012", "mail@receiver.com", "1337-133337", "SuPeR_SeCrEt");
		am.createAccount("TESTARN", "101010-1013", "mail@receiver.com", "1337-133337", "SuPeR_SeCrEt");
		am.createAccount("TESTARN", "101010-1014", "mail@receiver.com", "1337-133337", "SuPeR_SeCrEt");
		
		org.junit.Assert.assertTrue(am.getEmployees().size() == 5);
	}

	@Test
	public void createTwoAndRemoveOne() {
		//System.out.print("\n### FUNC: ");
		//System.out.println("createTwoAndRemoveOne()\n");
		
		am.createAccount("TESTARN", "101010-1010", "mail@receiver.com", "1337-133337", "SuPeR_SeCrEt");
		am.createAccount("TESTARN", "101010-1011", "mail@receiver.com", "1337-133337", "SuPeR_SeCrEt");
		am.removeAccount("101010-1011");
		
		org.junit.Assert.assertTrue(am.getEmployees().size() == 1);
	}

	@Test
	public void createTwoEditLast() {
		//System.out.print("\n### FUNC: ");
		//System.out.println("createTwoEditLast()\n");
		
		am.createAccount("TESTARN", "101010-1010", "mail@receiver.com", "1337-133337", "SuPeR_SeCrEt");
		am.createAccount("TESTARN", "101010-1011", "mail@receiver.com", "1337-133337", "SuPeR_SeCrEt");
		am.editAccountDetails("101010-1011", "testarn", "new@email.com", "0226-022226", "IamDumb");
		
		org.junit.Assert.assertTrue(am.findAccount("101010-1011").getName().equals("testarn"));
	}

	@Test
	public void createOneLogInLogOut() {
		//System.out.print("\n### FUNC: ");
		//System.out.println("createOneLogInLogOut()\n");
		
		am.createAccount("TESTARN", "101010-1010", "mail@receiver.com", "1337-133337", "SuPeR_SeCrEt");
		am.logIn("101010-1010", "SuPeR_SeCrEt");
		org.junit.Assert.assertTrue(am.getLoggedIn().get(0).getName().equals("TESTARN"));
		am.logOut("101010-1010");
		org.junit.Assert.assertTrue(am.getLoggedIn().size() == 0);
	}

	@Test
	public void createOneLogInRemove() {
		//System.out.print("\n### FUNC: ");
		//System.out.println("createOneLogInRemove()\n");
		
		am.createAccount("TESTARN", "101010-1010", "mail@receiver.com", "1337-133337", "SuPeR_SeCrEt");
		am.logIn("101010-1010", "SuPeR_SeCrEt");
		am.removeAccount("101010-1010");
		org.junit.Assert.assertTrue(am.getLoggedIn().size() == 0);
	}

	@Test
	public void preventLoggingInTwice() {
		//System.out.print("\n### FUNC: ");
		//System.out.println("preventLoggingInTwice()\n");
		
		am.createAccount("TESTARN", "101010-1010", "mail@receiver.com", "1337-133337", "SuPeR_SeCrEt");
		am.logIn("101010-1010", "SuPeR_SeCrEt");
		am.logIn("101010-1010", "SuPeR_SeCrEt");
		org.junit.Assert.assertTrue(false == am.logIn("101010-1010", "SuPeR_SeCrEt"));
	}

	@Test
	public void createOneLogInIsLoggedIn() {
		//System.out.print("\n### FUNC: ");
		//System.out.println("createOneLogInIsLoggedIn()\n");
		
		am.createAccount("TESTARN", "101010-1010", "mail@receiver.com", "1337-133337", "SuPeR_SeCrEt");
		am.logIn("101010-1010", "SuPeR_SeCrEt");
		org.junit.Assert.assertTrue(true == am.isLoggedIn("101010-1010"));
	}
}
