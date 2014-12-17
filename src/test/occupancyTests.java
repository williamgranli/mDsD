package test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class occupancyTests {
	
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

	//My Stuff
	Implementation.ImplementationFactory occupancyFactory = Implementation.impl.ImplementationFactoryImpl.init();
	Implementation.OccupancyComponent_OccupancyHandler occupancy = occupancyFactory.createOccupancyComponent_OccupancyHandler();
	
	//Booking stuff
	Implementation.ImplementationFactory bookingFactory = Implementation.impl.ImplementationFactoryImpl.init();
	Implementation.BookingComponent_BookingHandler booking = bookingFactory.createBookingComponent_BookingHandler();
	
	
	/*
   	org.junit.Assert.assertTrue(booking.getBookings().size() == 0);
	 */
	
	@Test
	public void checkIn() {
	  	booking.getBookings().clear();
    	org.junit.Assert.assertTrue(booking.getBookings().size() == 0);
    	booking.makeBooking("SingleRoom", new Date(), new Date(), "880923", "John", "Burchell", "MyHouse", "123456789", "123", "september", "2015");
    	org.junit.Assert.assertTrue(booking.getBookings().size() == 1);
		
		occupancy.getOccupancy().clear();
		org.junit.Assert.assertTrue(occupancy.getOccupancy().size() == 0);
		
		occupancy.checkInGuest("testReference1", "William", "Granli", "Suite", "William", "Granli");
		occupancy.checkInGuest("testReference1", "Sofia", "Cao", "Suite", "William", "Granli");
		occupancy.checkInGuest("testReference1", "Patrik", "Bäckström", "Suite", "William", "Granli");
		occupancy.checkInGuest("testReference1", "John", "Burchell", "Suite", "William", "Granli");
		occupancy.checkInGuest("testReference1", "Amirab", "Madna", "Suite", "William", "Granli");
		occupancy.checkInGuest("testReference1", "Ioannis", "Kellaris", "Suite", "William", "Granli");
		
		org.junit.Assert.assertTrue(occupancy.getOccupancy().size() == 6);

	}	
	

}
