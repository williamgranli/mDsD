package test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class bookingTests {

	static Implementation.ImplementationFactory factory;
	static Implementation.BookingComponent_BookingHandler booking;
	static Implementation.RoomComponent_RoomHandler roomHandler;
	static Implementation.OccupancyComponent_OccupancyHandler occupancy;
	static Implementation.OccupancyComponent_IOccupancy occupancyHandler;
	static Implementation.AdditionalServiceComponent_IAdditionalServiceInformation additionalService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		factory = Implementation.impl.ImplementationFactoryImpl.init();
		booking = factory.createBookingComponent_BookingHandler();
		roomHandler = factory.createRoomComponent_RoomHandler();
		additionalService =	factory.createAdditionalServiceComponent_AdditionalServiceHandler();
		occupancyHandler = factory.createOccupancyComponent_OccupancyHandler();
		booking.setIRoomInformation(roomHandler);
		booking.setIAdditionalServiceInformation(additionalService);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		factory = null;
		booking = null;
	}

	@Before
	public void setUp() throws Exception {
		booking.getBookings().clear();
	}

	@After
	public void tearDown() throws Exception {
		
	}
	
	public void setupRoomHandler() {
		System.out.println(booking.getIRoomInformation().countNumberOfTotalRooms());
		roomHandler.createBedRoom(1, true, 100, "Single Room", "A small single room with a single bed", 1);
		System.out.println(booking.getIRoomInformation().countNumberOfTotalRooms());
	}
	
	public void setupAdditionalServiceHandler() {
		
		booking.getIAdditionalServiceInformation();
	}
	
    @Test
    public void makeBooking() {
    	setupRoomHandler();
    	org.junit.Assert.assertTrue(booking.getBookings().size() == 0);
    	booking.makeBooking(new Date(), new Date(), "880923", "John", "Burchell", "MyHouse", "123456789", "123", "september", "2015");
    	org.junit.Assert.assertTrue(booking.getBookings().size() == 1);
    }
    
    @Test
    public void makeMultipleBookings() {
    	org.junit.Assert.assertTrue(booking.getBookings().size() == 0);
    	booking.makeBooking(new Date(), new Date(), "880923", "John", "Burchell", "MyHouse", "123456789", "123", "september", "2015");
    	booking.makeBooking(new Date(), new Date(), "880923", "Jani", "Kellaris", "MyHouse", "123456789", "123", "september", "2015");
    	booking.makeBooking(new Date(), new Date(), "880923", "Patrik", "Backstrom", "MyHouse", "123456789", "123", "september", "2015");
    	booking.makeBooking(new Date(), new Date(), "880923", "William", "Granli", "MyHouse", "123456789", "123", "september", "2015");
    	booking.makeBooking(new Date(), new Date(), "880923", "Sofia", "Chao", "MyHouse", "123456789", "123", "september", "2015");
    	org.junit.Assert.assertTrue(booking.getBookings().size() == 5);
    }
    
    @Test
    public void cancelBooking() {
    	String referenceNumber = booking.makeBooking(new Date(), new Date(2014, 12, 31), "880923", "John", "Burchell", "MyHouse", "123456789", "123", "september", "2015");
    	booking.cancelBooking(referenceNumber);
    	org.junit.Assert.assertFalse((booking.findBooking(referenceNumber) == null));
    	
    }
    
    @Test
    public void addRoomToBooking() {
    	String referenceNumber = booking.makeBooking(new Date(), new Date(2014, 12, 31), "880923", "John", "Burchell", "MyHouse", "123456789", "123", "september", "2015");
    	//TODO - Connect to room manager to get room type information
    	booking.addRoom(referenceNumber, "SingleRoom", 100);
    	org.junit.Assert.assertTrue(booking.findBooking(referenceNumber).getRooms().get(0) != null);
    }
    
    @Test
    public void removeRoom() {
    	String roomType = "SingleRoom";
    	String roomTypeTwo = "DoubleRoom";
    	
    	String referenceNumber = booking.makeBooking(new Date(), new Date(2014, 12, 31), "880923", "John", "Burchell", "MyHouse", "123456789", "123", "september", "2015");
    	booking.addRoom(referenceNumber, roomTypeTwo, 150);
    	booking.removeRoom(referenceNumber, roomType);
    	org.junit.Assert.assertTrue(booking.findBooking(referenceNumber).getRooms().get(0).getRoomType().equals(roomTypeTwo));
    }
    
    @Test
    public void addGuestToBooking() {
    	String referenceNumber = booking.makeBooking(new Date(), new Date(2014, 12, 31), "880923", "John", "Burchell", "MyHouse", "123456789", "123", "september", "2015");
    	booking.addGuestToBooking(referenceNumber, "Frodo", "Baggins", "The Shire");
    	booking.addGuestToBooking(referenceNumber, "Bilbo", "Baggins", "The Old Shire");
    	org.junit.Assert.assertTrue(booking.findBooking(referenceNumber).getGuests().size() == 2);
    	org.junit.Assert.assertTrue(booking.findBooking(referenceNumber).getGuests().get(0).getFirstName().equals("Frodo"));
    	org.junit.Assert.assertTrue(booking.findBooking(referenceNumber).getGuests().get(1).getFirstName().equals("Bilbo"));
    }
    
    @Test
    public void removeGuest() {
    	String referenceNumber = booking.makeBooking(new Date(), new Date(), "880923", "John", "Burchell", "MyHouse", "123456789", "123", "september", "2015");
    	booking.addGuestToBooking(referenceNumber, "Frodo", "Baggins", "The Shire");
    	booking.addGuestToBooking(referenceNumber, "Bilbo", "Baggins", "Mordor");
    	booking.removeGuest(referenceNumber, "Frodo", "Baggins", "The Shire");
    	org.junit.Assert.assertTrue(booking.findBooking(referenceNumber).getGuests().size() == 1);
    	org.junit.Assert.assertTrue(booking.findBooking(referenceNumber).getGuests().get(0).getFirstName().equals("Bilbo"));
    }
    
    @Test
    public void addAdditionalService() {
    	String referenceNumber = booking.makeBooking(new Date(), new Date(2014, 12, 31), "880923", "John", "Burchell", "MyHouse", "123456789", "123", "september", "2015");
    	booking.findBooking(referenceNumber).addAdditionalServiceToBooking("Massage From Andams Mum", 10);
    	booking.findBooking(referenceNumber).addAdditionalServiceToBooking("Massage From Willys Mum", 100);
    	org.junit.Assert.assertTrue(booking.findBooking(referenceNumber).getAdditionalServices().size() == 2);
    	org.junit.Assert.assertTrue(booking.findBooking(referenceNumber).getAdditionalServices().get(0).getName().equals("Massage From Andams Mum"));
    }
    
    @Test
    public void removeAdditionalService() {
    	String referenceNumber = booking.makeBooking(new Date(), new Date(2014, 12, 31), "880923", "John", "Burchell", "MyHouse", "123456789", "123", "september", "2015");
    	booking.findBooking(referenceNumber).addAdditionalServiceToBooking("Massage From Andams Mum", 10);
    	booking.findBooking(referenceNumber).addAdditionalServiceToBooking("Massage From Willys Mum", 100);
    	booking.removeAdditionalService(referenceNumber, "Massage From Andams Mum");
    	org.junit.Assert.assertTrue(booking.findBooking(referenceNumber).getAdditionalServices().size() == 1);
    	org.junit.Assert.assertTrue(booking.findBooking(referenceNumber).getAdditionalServices().get(0).getName().equals("Massage From Willys Mum"));
    }
    
    @Ignore
    @Test
    public void generateQuote() {
    	//TODO - Fix once implemented
    }

    @Ignore
    @Test
    public void bookingUseCase() {
    	
    	org.junit.Assert.assertTrue(booking.getBookings().size() == 0);
    	//MakeBooking - Return the reference Number.
    	//String refrenceNumber = booking.makeBooking("SingleRoom", new Date(), new Date(), "880923", "John", "Burchell", "MyHouse", "123456789", "123", "september", "2015");
    	String referenceNumber = "123";
    	    	
    	booking.addGuestToBooking(referenceNumber, "Patrik", "Backstrom", "somewhere gatan");
    	
    	//Communicate with payment module here for payment information
    	
    	//Method to update, add payment information?
    	//Loop the payment details, or interface side?
    	//Return booking reference
    	
    	//TODO
    	/*
    	 * Choice: User adds a room to their booking
    	 * Assume: User is finished adding to their booking
    	 * System requests details for each guest
    	 * User inputs the guest details; full name and address
    	 * System requests payment details to finalise booking
    	 * Assume: User has not input his credit card information incorrectly 3 times.
    	 * User inputs their credit card information
    	 * System validates credit card information
    	 * Assume: Credit card information is valid
    	 * The booking is finalised
    	 * System provides the User with a reference number
    	*/
    }

}