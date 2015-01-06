package test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CheckInUseCaseTest {

	/** Component setup instances */
	static Implementation.ImplementationFactory factory;
	static Implementation.OccupancyComponent_OccupancyHandler occupancyHandler;
	static Implementation.BookingComponent_BookingHandler bookingHandler;
	static Implementation.RoomComponent_RoomHandler roomHandler;
	
	static Implementation.AdditionalServiceComponent_IEventManagement additionalServiceHandler;

	/** Local Variables */
	static String bookingReference;
	static String bookingReference2;
	long guestCheckInDate;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		/**Initialize setup instances*/
		factory = Implementation.impl.ImplementationFactoryImpl.init();
		bookingHandler = factory.createBookingComponent_BookingHandler();
		roomHandler = factory.createRoomComponent_RoomHandler();
		additionalServiceHandler = factory.createAdditionalServiceComponent_AdditionalServiceHandler();
		occupancyHandler = factory.createOccupancyComponent_OccupancyHandler();
		
		/** BookingHandler setup */
		bookingHandler.setIRoomInformation(roomHandler);
		bookingHandler.setIAdditionalServiceInformation(additionalServiceHandler);
		
		/** OccupancyHandler setup */
		occupancyHandler.setIBooking(bookingHandler);
		occupancyHandler.setIRoomInformation(roomHandler);
		
		
		
		/** Add rooms to RoomHandler*/
		roomHandler.createBedRoom(101,true, 100, "Single Room", "A bedroom which is nice to sleep in.", 2);
		roomHandler.createBedRoom(102,true, 100, "Single Room", "A bedroom which is nice to sleep in.", 2);
		roomHandler.createBedRoom(1, true, 100, "Single Room", "A small single room with a single bed", 1);
		roomHandler.createBedRoom(104, true, 300, "Double Room","A big double room ", 3);
		
		/** Make a booking*/
    	long theFuture = System.currentTimeMillis() + (86400 * 7 * 1000);
    	Date nextWeek = new Date(theFuture);
    	bookingReference = bookingHandler.makeBooking("Single Room",new Date(), nextWeek, "880923");
    	bookingHandler.addGuestToBooking(bookingReference, "William", "Granli", "The Shire", "075482154");
    	bookingHandler.addGuestToBooking(bookingReference, "Berima", "Andam", "The Old Shire", "075896589");
    	bookingHandler.addRoom(bookingReference, "Single Room", 100);
    	bookingHandler.addRoom(bookingReference, "Single Room", 100);
		
	}

	/* @AfterClass
	public static void tearDownAfterClass() throws Exception {
	}*/

	@Before
	public void setUp() throws Exception {
		/** Clear up occupancies that exist before usecase */
		occupancyHandler.getOccupancy().clear();
	}

	/*@After
	public void tearDown() throws Exception {
	}*/



	/**
	 * Check-in Guest Main Flow 
	 * 1. Assume: Guest does not request to check in into a room with a partner who is already checked in 
	 * 2. Receptionist enters booking reference, name of guest and room type 
	 * 3. System checks if reference exists for the current date and Guest 
	 * 4. Assume: Booking reference exists and the booking is scheduled for the current date and Guest 
	 * 5. System looks for an available room of the type specified by guest 
	 * 6. Assume System finds an available room of the specified type 
	 * 7. System assigns guest to room 
	 * 8. System records check-in date as current date 
	 * 9. System makes room assigned to guest unavailable
	 * 
	 * **/
	
	@Test
	public void CheckInUseCaseMainFlow_test() {
		/*
		 * 2. Receptionist enters booking reference, name of guest and room type 
		 * 3. System checks if reference exists for the current date and Guest 
		 * 4. Assume: Booking reference exists and the booking is scheduled for the current date and Guest 
		 * 5. System looks for an available room of the type specified by guest 
		 * 6. Assume System finds an available room of the specified type 
		 */
		occupancyHandler.checkInGuest(bookingReference, "William", "Granli", "Single Room", null, null);
		guestCheckInDate = System.currentTimeMillis();
		
		/* 7. System assigns guest to room */
		org.junit.Assert.assertTrue(occupancyHandler.getOccupancy().get(0).getGuests().get(0).getLastName().equals("Granli"));
		
		/* System records check-in date as current date */
		org.junit.Assert.assertTrue(occupancyHandler.getOccupancy().get(0).getCheckInDateTime() <= guestCheckInDate);
		
		/* System makes room assigned to guest unavailable */
		org.junit.Assert.assertNotNull(roomHandler.getRoomInfo(occupancyHandler.getOccupancy().get(0).getRoomNumber()));
	}
	
	/** 
	 * Alternative Flow: 
	 * 1-6a: Guest requests to check in into a room with a partner who is already checked in
		1. Receptionist enters the name of the guest already checked in
		2. System checks if room has space for guest
		3. Assume room has bed for guest
		4. System checks guest in into the same room as partner
		5. System shows success message
	 */
	@Test
	public void CheckInWithPartnerAlternateFlow_test(){
		System.out.println("CheckInWithPartnerAlternateFlow_test: "); // Not part of Test
		
		/*
		1. Receptionist enters the name of the guest already checked in
		2. System checks if room has space for guest
		3. Assume room has bed for guest
		*/
		occupancyHandler.checkInGuest(bookingReference, "William", "Granli", "Single Room", null, null);
		occupancyHandler.checkInGuest(bookingReference, "Berima", "Andam", "Single Room", "William", "Granli");
		
		/* 4. System checks guest in into the same room as partner */
		org.junit.Assert.assertTrue(occupancyHandler.getOccupancy().get(0).getGuests().get(0).getLastName().equals("Granli") &&
									occupancyHandler.getOccupancy().get(0).getGuests().get(1).getLastName().equals("Andam"));
		
		
		System.out.println("\n");//Not part of Test
	}
	
	/**
	 * Alternative Flow: 
	 * 3-9a: Booking does not exist for current day
		1. System shows an error
		2. Use case ends
	 */
	
	@Test
	public void CheckInForBookingInFuture_test(){
		System.out.println("CheckInForBookingInFuture_test:"); //Not part of test
		
		/** Create a booking that starts in the future */
		bookingReference2 = bookingHandler.makeBooking("Double Room", new Date(System.currentTimeMillis() + (86400 * 2 * 1000)), new Date(System.currentTimeMillis() + (86400 * 5 * 1000)), "880923");
    	bookingHandler.addGuestToBooking(bookingReference2, "Albert", "Hanj", "The Shire", "075482154");
    	bookingHandler.addGuestToBooking(bookingReference2, "Gladys", "Owusu", "The Old Shire", "075896589");
    	bookingHandler.addRoom(bookingReference2, "Double Room", 300);
    	
    	
    	occupancyHandler.checkInGuest(bookingReference2, "Albert", "Hanj", "Double Room", null, null);
    	org.junit.Assert.assertTrue(occupancyHandler.getOccupancy().size() == 0);
    	
    	System.out.println("\n");//Not part of test
	}
	
	
	/**
	 * Alternative Flows: 
	 *  6-9a: System does not find an available room of the type specified by guest
			1. System shows an error
			2. Use case ends
	 * 
	 */
	@Test
	public void CheckInForWrongRoomType_test(){
		System.out.println("CheckInForWrongRoomType_test:"); // Not part of booking
		occupancyHandler.checkInGuest(bookingReference, "William", "Granli", "Expensive Room", null, null);
    	org.junit.Assert.assertTrue(occupancyHandler.getOccupancy().size() == 0);
    	
    	System.out.println("\n"); //Not part of booking
	}
}
