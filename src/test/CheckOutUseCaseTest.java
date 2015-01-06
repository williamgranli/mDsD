package test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import Implementation.OccupancyComponent_Guest;
import Implementation.OccupancyComponent_Occupancy;

public class CheckOutUseCaseTest {
	static Implementation.ImplementationFactory factory;
	static Implementation.OccupancyComponent_OccupancyHandler occupancy;
	static Implementation.BookingComponent_BookingHandler booking;
	static Implementation.RoomComponent_RoomHandler roomHandler;
	static Implementation.OccupancyComponent_IOccupancy occupancyHandler;
	static Implementation.AdditionalServiceComponent_IEventManagement additionalService;
	
	static Implementation.PaymentComponent_PaymentHandler payment; //In class

	
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
		roomHandler.createBedRoom(1, true, 100, "Single Room", "A small single room with a single bed", 1);
		
		// Make a booking
    	long theFuture = System.currentTimeMillis() + (86400 * 7 * 1000);
    	Date nextWeek = new Date(theFuture);
    	bookingReference = booking.makeBooking("Single Room", new Date(), nextWeek, "880923");
    	booking.addPaymentDetails(bookingReference, "William", "Granli", "MyHouse", "123456789", "123", 6, 2015);
    	booking.addGuestToBooking(bookingReference, "William", "Granli", "The Shire", "telephoneNumber");
    	booking.addGuestToBooking(bookingReference, "Andam", "Berima", "The Old Shire", "telephoneNumber");
    	booking.addRoom(bookingReference, "Single Room", 100);
    	booking.addRoom(bookingReference, "Single Room", 100);
    	
    	payment = factory.createPaymentComponent_PaymentHandler(); //In setupBeforeClass
    	booking.setIPayment(payment);//In setupBeforeClass
    	


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
	public void checkOutGuestSuccessFlowTest() {
    	//SETUP: Check in two guests
		occupancy.getOccupancy().clear();

		occupancy.checkInGuest(bookingReference, "William", "Granli", "Single Room", null, null);
	
		/*
		Main flow
		1. Receptionist provides System the room number and name of the Guest
		2. System checks if room exists and guest is assigned to specified room
		3. Assume provided room number and name of guest matches an occupancy
		4. System  records check-out date to current date
		5. System makes room assigned to guest available 
		6. Assume person checking out is the first to check out for that booking
		7. Refer to Pay for Booking Use Case
		*/

		occupancy.checkOutGuest(101, "William", "Granli");
		System.out.println("Checkout date is " + new Date(occupancy.getOccupancy().get(0).getCheckOutDateTime()));
		org.junit.Assert.assertTrue((int)occupancy.getOccupancy().get(0).getCheckOutDateTime() != 0);
		
	}
	
	@Test
	public void nameAndRoomNumberDoesNotMatchOccupancyTest() {
		/*Alternative flow #1*/
		
		/**
		 * 1. Receptionist provides System the room number and name of the Guest
		 * 2-7a Provided room number and name of guest does not match an occupancy
		 * System shows an error
		 * Use case ends
		*/
		
		occupancy.checkInGuest(bookingReference, "William", "Granli", "Single Room", null, null);
		occupancy.checkOutGuest(101, "Stupid", "Name");
		
		org.junit.Assert.assertTrue((int)occupancy.getOccupancy().get(0).getCheckOutDateTime() == 0);
		
	}
	
	@Test
	public void moreGuestsCheckingOutForSameRoomTest() {
		/*Alternative flow #2*/
		
		/**
		 * 1. Receptionist provides System the room number and name of the Guest
		 * 2. System checks if room exists and guest is assigned to specified room
		 * 3. Assume provided room number and name of guest matches an occupancy
		 * 4. System  records check-out date to current date
		 * 5. System makes room as signed to guest available 
		 * 6-7a Guest checking out is not the first in the booking
		 * Use case ends
		 * 
		 */

    	//SETUP: Check in two guests
		occupancy.getOccupancy().clear();

		occupancy.checkInGuest(bookingReference, "William", "Granli", "Single Room", null, null);
		occupancy.checkInGuest(bookingReference, "Andam", "Berima", "Single Room", "William", "Granli");
		
		occupancy.checkOutGuest(101, "William", "Granli");
		org.junit.Assert.assertTrue((int)occupancy.getOccupancy().get(0).getCheckOutDateTime() != 0);

		occupancy.checkOutGuest(101, "Andam", "Berima");
		
		org.junit.Assert.assertTrue((int)occupancy.getOccupancy().get(0).getCheckOutDateTime() != 0);


		
	}
}
