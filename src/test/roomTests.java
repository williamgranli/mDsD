package test;

import org.eclipse.emf.common.util.BasicEList;
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
		roomhandler.getAllRoomNumbers().clear();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	
	Implementation.ImplementationFactory factory = Implementation.impl.ImplementationFactoryImpl.init();
	Implementation.RoomComponent_RoomHandler roomhandler = factory.createRoomComponent_RoomHandler();
	
	@Test
	public void testCountNumberOfTotalRooms() {
		
		roomhandler.createBedRoom(101,true, 100, "bedroom", "A bedroom, which is nice to sleep in.", 2);
		roomhandler.createBedRoom(102,true, 100, "bedroom", "A bedroom, which is nice to sleep in.", 2);
		roomhandler.createConferenceRoom(101,true, 100, "conference", "A conference room, for conferences.",50, true, false);
		org.junit.Assert.assertTrue(roomhandler.countNumberOfTotalRooms() == 3);
		
	}
	
	@Test
	public void testCreateBedroom() {
		
		org.junit.Assert.assertTrue(roomhandler.getAllRoomNumbers().size() == 0);
		roomhandler.createBedRoom(101,true, 100, "bedroom", "A bedroom, which is nice to sleep in.", 2);
		org.junit.Assert.assertTrue(roomhandler.getAllRoomNumbers().size() == 1);
		
	}
	
	@Test
	public void testCreateConferenceRoom() {
		
		org.junit.Assert.assertTrue(roomhandler.getAllRoomNumbers().size() == 0);
		roomhandler.createConferenceRoom(101,true, 100, "conference", "A conference room, for conferences.",50, true, false);
		org.junit.Assert.assertTrue(roomhandler.getAllRoomNumbers().size() == 1);
		
	}
	
	@Test
	public void getRoomInfoForCreatedRoom() {
		
		roomhandler.createBedRoom(101,true, 100, "bedroom", "A bedroom, which is nice to sleep in.", 2);
		org.junit.Assert.assertTrue(roomhandler.getRoomInfo(101).equals("101" + "," + "bedroom" + "," + "100" + "," 
				+ "A bedroom, which is nice to sleep in."));
		
	}
	
	@Test
	public void testGetRoomTypes() {
		
		roomhandler.createBedRoom(101,true, 100, "bedroom", "A bedroom, which is nice to sleep in.", 2);
		roomhandler.createConferenceRoom(102,true, 100, "conference", "A conference room, for conferences.",50, true, false);
		org.junit.Assert.assertTrue(roomhandler.getRoomTypes().size() == 2);
		org.junit.Assert.assertTrue((roomhandler.getRoomTypes().get(0)).equals("bedroom"));
		org.junit.Assert.assertTrue(roomhandler.getRoomTypes().get(1).equals("conference"));
	}
	
	@Test
	public void testSearchRoom() {
		
		roomhandler.createBedRoom(101,true, 100, "bedroom", "A bedroom, which is nice to sleep in.", 2);
		roomhandler.createBedRoom(102,true, 100, "bedroom", "A bedroom, which is nice to sleep in.", 2);
		roomhandler.createConferenceRoom(102,true, 100, "conference", "A conference room, for conferences.",50, true, false);
		
		org.junit.Assert.assertTrue((roomhandler.searchRoom("bedroom").get(0)).equals("101,true,bedroom,100,2,A bedroom, which is nice to sleep in."));
		org.junit.Assert.assertTrue((roomhandler.searchRoom("bedroom").get(1)).equals("102,true,bedroom,100,2,A bedroom, which is nice to sleep in."));
		org.junit.Assert.assertTrue((roomhandler.searchRoom("conference").get(0)).equals("102,true,conference,100,50,true,false,A conference room, for conferences."));
		//org.junit.Assert.assertTrue(roomhandler.getRoomTypes().get(1).equals("conference"));

	}
	
	@Test
	public void testEditBedroom_changeAllFields() {
		
		roomhandler.createBedRoom(101,true, 100, "bedroom", "A bedroom, which is nice to sleep in.", 2);
		roomhandler.editBedRoom(101, 100, false, 200, "bedroom", "A bedroom, which is even better to sleep in.", 1);
		org.junit.Assert.assertTrue(roomhandler.getRoomInfo(100).equals("100" + "," + "bedroom" + "," + "200" + "," 
		+ "A bedroom, which is even better to sleep in."));
	}
	
	@Test
	public void testEditConferenceRoom_changeAllFields() {
		
		roomhandler.createConferenceRoom(101,true, 100, "conference", "A conference room, for conferences.",50, true, false);
		roomhandler.editConferenceRoom(101, 100, false, 200, "conference", "A very, very big conference room.", 150, false, true);
		org.junit.Assert.assertTrue(roomhandler.getRoomInfo(100).equals("100" + "," + "conference" + "," + "200" + "," 
		+ "A very, very big conference room."));
	}
	
	@Test
	public void testRemoveRoom() {
		
		
		roomhandler.createBedRoom(101,true, 100, "bedroom", "A bedroom, which is nice to sleep in.", 2);
		org.junit.Assert.assertTrue(roomhandler.getAllRoomNumbers().size() == 1);
		roomhandler.remove(101);
		org.junit.Assert.assertTrue(roomhandler.getAllRoomNumbers().size() == 0);
		
	}
	
	@Test
	public void testNotGetRoomIfUnusable() {
		
		org.junit.Assert.assertTrue(roomhandler.getAllRoomNumbers().size() == 0);
		roomhandler.createBedRoom(101,false, 100, "bedroom", "A bedroom, which is nice to sleep in.", 2);
		org.junit.Assert.assertTrue(roomhandler.getAllRoomNumbers().size() == 0);
		
	}
	
	@Test
	public void testGetPriceOfRoomType() {
		
		roomhandler.createBedRoom(101,true, 100, "bedroom", "A bedroom, which is nice to sleep in.", 2);
		org.junit.Assert.assertTrue(roomhandler.getPriceOfRoomType("bedroom") == 100);
	}

	@Test
	public void testGetCountOfRoomType() {
		
		roomhandler.createBedRoom(101,true, 100, "bedroom", "A bedroom, which is nice to sleep in.", 2);
		org.junit.Assert.assertTrue(roomhandler.getCountOfRoomType("bedroom") == 1);
		roomhandler.createBedRoom(102,true, 100, "bedroom", "A bedroom, which is nice to sleep in.", 2);
		org.junit.Assert.assertTrue(roomhandler.getCountOfRoomType("bedroom") == 2);
		
	}
	
}
