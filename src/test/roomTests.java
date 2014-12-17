package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class roomTests {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	Implementation.ImplementationFactory factory = Implementation.impl.ImplementationFactoryImpl.init();
	Implementation.RoomComponent_RoomHandler roomhandler = factory.createRoomComponent_RoomHandler();
	
	@Test
	public void testCreateBedroom() {
		
		roomhandler.getAllRoomNumbers().clear();
		org.junit.Assert.assertTrue(roomhandler.getAllRoomNumbers().size() == 0);
		roomhandler.createBedRoom(101,true, 100, "Double", "A bedroom, which is nice to sleep in.", 2);
		org.junit.Assert.assertTrue(roomhandler.getAllRoomNumbers().size() == 1);
		
	}

}
