
package test;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class occupancyTests {
	static Implementation.ImplementationFactory factory;
	static Implementation.OccupancyComponent_OccupancyHandler occupancy;
	static Implementation.BookingComponent_BookingHandler booking;
	static Implementation.RoomComponent_RoomHandler roomHandler;
	static Implementation.OccupancyComponent_IOccupancy occupancyHandler;
	static Implementation.AdditionalServiceComponent_IEventManagement additionalService;
	
	static String bookingReference;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//My Stuff
		factory = Implementation.impl.ImplementationFactoryImpl.init();
		booking = factory.createBookingComponent_BookingHandler();
		roomHandler = factory.createRoomComponent_RoomHandler();
		additionalService =	factory.createAdditionalServiceComponent_AdditionalServiceHandler();
		occupancy = factory.createOccupancyComponent_OccupancyHandler();
		
		//Booking stuff
		
		booking.setIRoomInformation(roomHandler);
		booking.setIAdditionalServiceInformation(additionalService);
		
		
		occupancy.setIBooking(booking);
		occupancy.setIRoomInformation(roomHandler);
		
		// Add rooms to room handler
		roomHandler.createBedRoom(101,true, 100, "Single Room", "A bedroom which is nice to sleep in.", 2);
		roomHandler.createBedRoom(102,true, 100, "Single Room", "A bedroom which is nice to sleep in.", 2);
		roomHandler.createBedRoom(1, true, 100, "Single Room", "A small single room with a single bed", 2);
		
		// Make a booking
    	long theFuture = System.currentTimeMillis() + (86400 * 7 * 1000);
    	Date nextWeek = new Date(theFuture);
    	bookingReference = booking.makeBooking("Single Room",new Date(), nextWeek, "880923", "William", "Granli", "MyHouse", "123456789", "123", 6, 2015);
    	booking.addGuestToBooking(bookingReference, "William", "Granli", "The Shire");
    	booking.addGuestToBooking(bookingReference, "Andam", "Berima", "The Old Shire");
    	booking.addRoom(bookingReference, "Single Room", 100);
    	booking.addRoom(bookingReference, "Single Room", 100);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		/*factory = null;
		occupancy = null;*/
	}

	@Before
	public void setUp() throws Exception {
		occupancy.getOccupancy().clear();

	}

	@After
	public void tearDown() throws Exception {
	}


	
	@Test 
	public void testCheckInTwoGuestsInOneRoom(){
		occupancy.checkInGuest(bookingReference, "William", "Granli", "Single Room", null, null);
		occupancy.checkInGuest(bookingReference, "Andam", "Berima", "Single Room", "William", "Granli");
		org.junit.Assert.assertTrue(occupancy.getOccupancy().size() == 1);
	}
	
	
	@Test 
	
	public void testCheckInTwoGuestInTwoRooms(){
		occupancy.checkInGuest(bookingReference, "William", "Granli", "Single Room", null, null);
		occupancy.checkInGuest(bookingReference, "Andam", "Berima", "Single Room", null, null);
		org.junit.Assert.assertTrue(occupancy.getOccupancy().size() == 2);
	}
	
	@Test
	public void testGuestsNotOnBooking() {
		occupancy.checkInGuest(bookingReference, "Sofia", "Cao", "Singleroom", "William", "Granli");
		occupancy.checkInGuest(bookingReference, "Patrik", "Bäckström", "Singleroom", "William", "Granli");
		occupancy.checkInGuest(bookingReference, "John", "Burchell", "Singleroom", "William", "Granli");
		occupancy.checkInGuest(bookingReference, "Ioannis", "Kellaris", "Singleroom", "William", "Granli");
		
		org.junit.Assert.assertTrue(occupancy.getOccupancy().size() == 0);

	}	
	
	@Test
	public void testCheckInNoBooking(){
		booking.getBookings().clear();
		occupancy.checkInGuest(bookingReference, "William", "Granli", "Single Room", null, null);
		occupancy.checkInGuest(bookingReference, "Andam", "Berima", "Single Room", null, null);
		org.junit.Assert.assertTrue(occupancy.getOccupancy().size() == 0);
		
	}
	
}