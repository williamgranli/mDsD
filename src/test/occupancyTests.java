package test;

import static org.junit.Assert.*;

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
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//My Stuff
		factory = Implementation.impl.ImplementationFactoryImpl.init();

		//Booking stuff
		booking = factory.createBookingComponent_BookingHandler();
		occupancy = factory.createOccupancyComponent_OccupancyHandler();
		occupancy.setIBooking(booking);
		
		roomHandler = factory.createRoomComponent_RoomHandler();
		additionalService =	factory.createAdditionalServiceComponent_AdditionalServiceHandler();
		booking.setIRoomInformation(roomHandler);
		booking.setIAdditionalServiceInformation(additionalService);
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		factory = null;
		occupancy = null;
	}

	@Before
	public void setUp() throws Exception {
		occupancy.getOccupancy().clear();

	}

	@After
	public void tearDown() throws Exception {
	}


	/*
   	org.junit.Assert.assertTrue(booking.getBookings().size() == 0);
	 */
	public String setupRoomHandler() {
    	long theFuture = System.currentTimeMillis() + (86400 * 7 * 1000);
    	Date nextWeek = new Date(theFuture);
		roomHandler.createBedRoom(1, true, 100, "Single Room", "A small single room with a single bed", 1);
    	org.junit.Assert.assertTrue(booking.getBookings().size() == 0);
    	String bookingReference = booking.makeBooking(
    			new Date(), nextWeek, "880923", "William", "Granli", "MyHouse", "123456789", "123", "september", "2015");
    	org.junit.Assert.assertTrue(booking.getBookings().size() == 1);
    	
    	return bookingReference;
	}
	
	@Test
	public void checkIn() {
    	String bookingReference = setupRoomHandler();
    	System.out.println(bookingReference);

		org.junit.Assert.assertTrue(occupancy.getOccupancy().size() == 0);
		
		occupancy.checkInGuest(bookingReference, "William", "Granli", "Suite", null, null);
		occupancy.checkInGuest(bookingReference, "Sofia", "Cao", "Suite", "William", "Granli");
		occupancy.checkInGuest(bookingReference, "Patrik", "Bäckström", "Suite", "William", "Granli");
		occupancy.checkInGuest(bookingReference, "John", "Burchell", "Suite", "William", "Granli");
		occupancy.checkInGuest(bookingReference, "Amirab", "Madna", "Suite", "William", "Granli");
		occupancy.checkInGuest(bookingReference, "Ioannis", "Kellaris", "Suite", "William", "Granli");
		
		
		System.out.println(occupancy.getOccupancy().size());

		org.junit.Assert.assertTrue(occupancy.getOccupancy().size() == 1);

	}	
	

}
