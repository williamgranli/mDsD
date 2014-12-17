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
	Implementation.ImplementationFactory factory = Implementation.impl.ImplementationFactoryImpl.init();
	Implementation.BookingComponent_BookingHandler booking = factory.createBookingComponent_BookingHandler();
	
    @Test
    public void makeBooking() {
    	booking.getBookings().clear();
    	org.junit.Assert.assertTrue(booking.getBookings().size() == 0);
    	booking.makeBooking("SingleRoom", new Date(), new Date(), "880923", "John", "Burchell", "MyHouse", "123456789", "123", "september", "2015");
    	org.junit.Assert.assertTrue(booking.getBookings().size() == 1);
    }
    
    @Test
    public void makeMultipleBookings() {
    	booking.getBookings().clear();
    	org.junit.Assert.assertTrue(booking.getBookings().size() == 0);
    	booking.makeBooking("SingleRoom", new Date(), new Date(), "880923", "John", "Burchell", "MyHouse", "123456789", "123", "september", "2015");
    	booking.makeBooking("SingleRoom", new Date(), new Date(), "880923", "Jani", "Kellaris", "MyHouse", "123456789", "123", "september", "2015");
    	booking.makeBooking("SingleRoom", new Date(), new Date(), "880923", "Patrik", "Backstrom", "MyHouse", "123456789", "123", "september", "2015");
    	booking.makeBooking("SingleRoom", new Date(), new Date(), "880923", "William", "Granli", "MyHouse", "123456789", "123", "september", "2015");
    	booking.makeBooking("SingleRoom", new Date(), new Date(), "880923", "Sofia", "Chao", "MyHouse", "123456789", "123", "september", "2015");
    	org.junit.Assert.assertTrue(booking.getBookings().size() == 5);
    }
    
    @Test
    public void cancelBooking() {
    	makeBooking();
    	String bookingReference = booking.getBookings().get(0).getBookingReference();
    	booking.cancelBooking(bookingReference);
    	org.junit.Assert.assertFalse((booking.findBooking(bookingReference) == null));
    }
    
    @Test
    public void addRoomToBooking() {
    	booking.getBookings().clear();
    	booking.makeBooking("SingleRoom", new Date(), new Date(2014, 12, 31), "880923", "John", "Burchell", "MyHouse", "123456789", "123", "september", "2015");
    	String referenceNumber = booking.getBookings().get(0).getBookingReference();
    	//TODO - Connect to room manager to get room type information
    	booking.addRoom(referenceNumber, "SingleRoom", 100);
    	org.junit.Assert.assertTrue(booking.findBooking(referenceNumber).getRooms().get(0) != null);
    }
    
    @Test
    public void removeRoom() {
    	booking.getBookings().clear();
    	
    	String roomType = "SingleRoom";
    	String roomTypeTwo = "DoubleRoom";
    	
    	booking.makeBooking(roomType, new Date(), new Date(2014, 12, 31), "880923", "John", "Burchell", "MyHouse", "123456789", "123", "september", "2015");
    	String referenceNumber = booking.getBookings().get(0).getBookingReference();
    	booking.addRoom(referenceNumber, roomTypeTwo, 150);
    	booking.removeRoom(referenceNumber, roomType);
    	org.junit.Assert.assertTrue(booking.findBooking(referenceNumber).getRooms().get(0).getRoomType().equals(roomTypeTwo));
    }
    
    @Test
    public void addGuestToBooking() {
    	booking.getBookings().clear();
    	booking.makeBooking("SingleRoom", new Date(), new Date(), "880923", "John", "Burchell", "MyHouse", "123456789", "123", "september", "2015");
    	String referenceNumber = booking.getBookings().get(0).getBookingReference();
    	booking.addGuestToBooking(referenceNumber, "Frodo", "Baggins", "The Shire");
    	booking.addGuestToBooking(referenceNumber, "Bilbo", "Baggins", "The Old Shire");
    	org.junit.Assert.assertTrue(booking.findBooking(referenceNumber).getGuests().size() == 2);
    	org.junit.Assert.assertTrue(booking.findBooking(referenceNumber).getGuests().get(0).getFirstName().equals("Frodo"));
    	org.junit.Assert.assertTrue(booking.findBooking(referenceNumber).getGuests().get(1).getFirstName().equals("Bilbo"));
    }
    
    @Test
    public void removeGuest() {
    	booking.getBookings().clear();
    	booking.makeBooking("SingleRoom", new Date(), new Date(), "880923", "John", "Burchell", "MyHouse", "123456789", "123", "september", "2015");
    	String referenceNumber = booking.getBookings().get(0).getBookingReference();
    	booking.addGuestToBooking(referenceNumber, "Frodo", "Baggins", "The Shire");
    	booking.addGuestToBooking(referenceNumber, "Bilbo", "Baggins", "The Old Shire");
    	booking.removeGuest(referenceNumber, "Frodo", "Baggins", "The Shire");
    	org.junit.Assert.assertTrue(booking.findBooking(referenceNumber).getGuests().size() == 1);
    	org.junit.Assert.assertTrue(booking.findBooking(referenceNumber).getGuests().get(0).getFirstName().equals("Bilbo"));
    }
    
    @Test
    public void addAdditionalService() {
    	booking.makeBooking("SingleRoom", new Date(), new Date(2014, 12, 31), "880923", "John", "Burchell", "MyHouse", "123456789", "123", "september", "2015");
    	String referenceNumber = booking.getBookings().get(0).getBookingReference();
    	booking.findBooking(referenceNumber).addAdditionalServiceToBooking("Massage From Andams Mum", 10);
    	booking.findBooking(referenceNumber).addAdditionalServiceToBooking("Massage From Willys Mum", 100);
    	org.junit.Assert.assertTrue(booking.findBooking(referenceNumber).getAdditionalServices().size() == 2);
    	org.junit.Assert.assertTrue(booking.findBooking(referenceNumber).getAdditionalServices().get(0).getName().equals("Massage From Andams Mum"));
    	booking.getBookings().clear();
    }
    
    @Test
    public void removeAdditionalService() {
    	booking.getBookings().clear();
    	booking.makeBooking("SingleRoom", new Date(), new Date(2014, 12, 31), "880923", "John", "Burchell", "MyHouse", "123456789", "123", "september", "2015");
    	String referenceNumber = booking.getBookings().get(0).getBookingReference();
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
