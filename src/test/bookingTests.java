package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

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
	static Implementation.AdditionalServiceComponent_IEventManagement additionalService;
	static Implementation.PaymentComponent_IPayment payment;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		factory = Implementation.impl.ImplementationFactoryImpl.init();
		booking = factory.createBookingComponent_BookingHandler();
		roomHandler = factory.createRoomComponent_RoomHandler();
		additionalService =	factory.createAdditionalServiceComponent_AdditionalServiceHandler();
		occupancyHandler = factory.createOccupancyComponent_OccupancyHandler();
		payment = factory.createPaymentComponent_PaymentHandler();
		
		
		booking.setIRoomInformation(roomHandler);
		booking.setIAdditionalServiceInformation(additionalService);
		booking.setIPayment(payment);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		factory = null;
		booking = null;
		roomHandler = null;
		additionalService = null;
		occupancyHandler = null;
		payment = null;
	}

	@Before
	public void setUp() throws Exception {
		booking.getBookings().clear();
	}

	@After
	public void tearDown() throws Exception {
		
	}
	
	public void setupRoomHandler() {
		roomHandler.createBedRoom(1, true, 100, "SingleRoom", "A small single room with a single bed", 1);
		roomHandler.createBedRoom(2, true, 100, "SingleRoom", "A small single room with a single bed", 1);
		roomHandler.createBedRoom(3, true, 100, "SingleRoom", "A small single room with a single bed", 1);
		roomHandler.createBedRoom(4, true, 100, "SingleRoom", "A small single room with a single bed", 1);
		roomHandler.createBedRoom(5, true, 100, "SingleRoom", "A small single room with a single bed", 1);
	}
	
	public void setupAdditionalServiceHandler() {
		
		booking.getIAdditionalServiceInformation();
	}
	
	public String getRandomRoomType() {
    	Random rand = new Random();
    	int randomNumber = rand.nextInt(booking.getIRoomInformation().getRoomTypes().size()) + 0;
    	return booking.getIRoomInformation().getRoomTypes().get(randomNumber);
	}
	
	public Date nextWeekDate() {
    	long theFuture = System.currentTimeMillis() + (86400 * 7 * 1000);
    	return new Date(theFuture);
	}
	
    @Test
    public void makeBooking() {
    	Date nextWeek = nextWeekDate();
    	
    	org.junit.Assert.assertTrue(booking.getBookings().size() == 0);
    	String ref = booking.makeBooking(getRandomRoomType(), new Date(), nextWeek, "880923", "John", "Burchell", "MyHouse", "123456789", "123", 9, 16, 1);
    	org.junit.Assert.assertTrue(booking.getBookings().size() == 1);
    	org.junit.Assert.assertFalse(ref.equals("INVALID_BOOKING"));
    }
    
    @Test
    public void makeMultipleBookings() {
    	org.junit.Assert.assertTrue(booking.getBookings().size() == 0);
    	Date nextWeek = nextWeekDate();
    	
    	for(int i = 0; i < roomHandler.getAllRoomNumbers().size(); ++i) {
    		String ref = booking.makeBooking(getRandomRoomType(), new Date(), nextWeek, "880923", "John", "Burchell", "MyHouse", "123456789", "123", 9, 16, 1);
    		org.junit.Assert.assertFalse(ref.equals("INVALID_BOOKING"));
    	}
    }
    
    @Test
    public void makeMultipleBookingsFail() {
    	Date nextWeek = nextWeekDate();
    	
    	System.out.println(roomHandler.getAllRoomNumbers().size());
    	
    	for(int i = 0; i < roomHandler.getAllRoomNumbers().size(); i++) {
    		String ref = booking.makeBooking(getRandomRoomType(), new Date(), nextWeek, "880923", "John", "Burchell", "MyHouse", "123456789", "123", 9, 16, 1);
    		org.junit.Assert.assertFalse(ref.equals("INVALID_BOOKING"));
    	}
    	
    	String ref = booking.makeBooking(getRandomRoomType(), new Date(), nextWeek, "880923", "John", "Burchell", "MyHouse", "123456789", "123", 9, 16, 1);
    	org.junit.Assert.assertTrue(ref.equals("INVALID_BOOKING"));
    }
    
    @Test
    public void cancelBooking() {
    	String referenceNumber = booking.makeBooking(getRandomRoomType(), new Date(), nextWeekDate(), "880923", "John", "Burchell", "MyHouse", "123456789", "123", 9, 16, 1);
    	booking.cancelBooking(referenceNumber);
    	org.junit.Assert.assertTrue(booking.findBooking(referenceNumber).isActive() == false);
    }
    
    @Test
    public void cancelBookingFail() {
    	String referenceNumber = booking.makeBooking(getRandomRoomType(), new Date(), nextWeekDate(), "880923", "John", "Burchell", "MyHouse", "123456789", "123", 9, 16, 1);
    	booking.cancelBooking(referenceNumber);
    	boolean result = booking.cancelBooking(referenceNumber);
    	org.junit.Assert.assertFalse(booking.findBooking(referenceNumber).isActive());
    	org.junit.Assert.assertFalse(result);
    }
    
    @Test
    public void addRoomToBooking() {
    	
    	String roomType = getRandomRoomType();
    	int price = booking.getIRoomInformation().getPriceOfRoomType(roomType);
    	
    	String referenceNumber = booking.makeBooking(roomType, new Date(), nextWeekDate(), "880923", "John", "Burchell", "MyHouse", "123456789", "123", 9, 16, 1);
    	
    	booking.addRoom(referenceNumber, roomType, price);
    	
    	org.junit.Assert.assertTrue(booking.findBooking(referenceNumber).getRooms().get(1).getRoomType() == roomType);
    	org.junit.Assert.assertTrue(booking.findBooking(referenceNumber).getRooms().get(1).getCost() == price);
    	//Making a booking automatically adds a room
    	org.junit.Assert.assertTrue(booking.findBooking(referenceNumber).getRooms().size() == 2);
    }
    
    @Test
    public void addRoomToBookingFail() {
    	
    	Date nextWeek = nextWeekDate();
    	
    	long theFuture = System.currentTimeMillis() + (86400 * 14 * 1000);
    	Date nextWeek2 = new Date(theFuture);
    	
    	//TODO - ?? What did I intend here??
    	String roomType = getRandomRoomType();
    	String realRef = booking.makeBooking(roomType, nextWeek, nextWeek2, "880923", "John", "Burchell", "MyHouse", "123456789", "123", 9, 16, 1);
    	booking.addRoom(realRef, roomType, booking.getIRoomInformation().getPriceOfRoomType(roomType));
    	org.junit.Assert.assertTrue(booking.findBooking(realRef).getRooms().get(0) != null);
    }
    
    @Test
    public void removeRoom() {
    	String roomType = getRandomRoomType();
    	String roomTypeTwo = getRandomRoomType();
    	
    	long theFuture = System.currentTimeMillis() + (86400 * 7 * 1000);
    	Date nextWeek = new Date(theFuture);
    	
    	String referenceNumber = booking.makeBooking(getRandomRoomType(), new Date(), nextWeek, "880923", "John", "Burchell", "MyHouse", "123456789", "123", 9, 16, 1);
    	booking.addRoom(referenceNumber, roomTypeTwo, 150);
    	booking.removeRoom(referenceNumber, roomType);
    	org.junit.Assert.assertTrue(booking.findBooking(referenceNumber).getRooms().get(0).getRoomType().equals(roomTypeTwo));
    }
    
    @Test
    public void addGuestToBooking() {
    	String type = getRandomRoomType();
    	String referenceNumber = booking.makeBooking(type, new Date(), new Date(), "880923", "John", "Burchell", "MyHouse", "123456789", "123", 9, 16, 1);
    	booking.addRoom(referenceNumber, type, booking.getIRoomInformation().getPriceOfRoomType(type));
    	
    	boolean attemptOne = booking.addGuestToBooking(referenceNumber, "Frodo", "Baggins", "The Shire");
    	boolean attemptTwo = booking.addGuestToBooking(referenceNumber, "Bilbo", "Baggins", "The Old Shire");
    	
    	org.junit.Assert.assertTrue(attemptOne);
    	org.junit.Assert.assertTrue(attemptTwo);
    	org.junit.Assert.assertTrue(booking.findBooking(referenceNumber).getGuests().size() == 2);
    	org.junit.Assert.assertTrue(booking.findBooking(referenceNumber).getGuests().get(0).getFirstName().equals("Frodo"));
    	org.junit.Assert.assertTrue(booking.findBooking(referenceNumber).getGuests().get(1).getFirstName().equals("Bilbo"));
    }
    
    @Test
    public void addMoreGuestsThanRooms() {
    	Date nextWeek = nextWeekDate();
    	
    	String type = getRandomRoomType();
    	String referenceNumber = booking.makeBooking(type, new Date(), new Date(), "880923", "John", "Burchell", "MyHouse", "123456789", "123", 9, 16, 1);
    	booking.addRoom(referenceNumber, type, booking.getIRoomInformation().getPriceOfRoomType(type));
    	
    	booking.addGuestToBooking(referenceNumber, "Frodo", "Baggins", "The Shire");
    	booking.addGuestToBooking(referenceNumber, "Bilbo", "Baggins", "The Old Shire");
    	boolean result = booking.addGuestToBooking(referenceNumber, "Sauron", "Baggins", "The Even Older Shire");
    	
    	//This result should be false; there are not enough rooms
    	org.junit.Assert.assertFalse(result);
    	org.junit.Assert.assertTrue(booking.findBooking(referenceNumber).getGuests().size() == 2);
    	org.junit.Assert.assertTrue(booking.findBooking(referenceNumber).getGuests().get(0).getFirstName().equals("Frodo"));
    	org.junit.Assert.assertTrue(booking.findBooking(referenceNumber).getGuests().get(1).getFirstName().equals("Bilbo"));
    }
    
    @Test
    public void removeGuest() {
    	String type = getRandomRoomType();
    	String referenceNumber = booking.makeBooking(type, new Date(), new Date(), "880923", "John", "Burchell", "MyHouse", "123456789", "123", 9, 16, 1);
    	booking.addRoom(referenceNumber, type, booking.getIRoomInformation().getPriceOfRoomType(type));
    	booking.addGuestToBooking(referenceNumber, "Frodo", "Baggins", "The Shire");
    	booking.addGuestToBooking(referenceNumber, "Bilbo", "Baggins", "Mordor");
    	booking.removeGuest(referenceNumber, "Frodo", "Baggins", "The Shire");
    	System.out.println(booking.findBooking(referenceNumber).getGuests().size());
    	org.junit.Assert.assertTrue(booking.findBooking(referenceNumber).getGuests().size() == 1);
    	org.junit.Assert.assertTrue(booking.findBooking(referenceNumber).getGuests().get(0).getFirstName().equals("Bilbo"));
    }
    
    @Test
    public void addAdditionalService() {
    	String referenceNumber = booking.makeBooking(getRandomRoomType(), new Date(), new Date(2014, 12, 31), "880923", "John", "Burchell", "MyHouse", "123456789", "123", 9, 16, 1);
    	booking.findBooking(referenceNumber).addAdditionalServiceToBooking("Massage From Andams Mum", 10);
    	booking.findBooking(referenceNumber).addAdditionalServiceToBooking("Massage From Willys Mum", 100);
    	org.junit.Assert.assertTrue(booking.findBooking(referenceNumber).getAdditionalServices().size() == 2);
    	org.junit.Assert.assertTrue(booking.findBooking(referenceNumber).getAdditionalServices().get(0).getName().equals("Massage From Andams Mum"));
    }
    
    @Test
    public void removeAdditionalService() {
    	String referenceNumber = booking.makeBooking(getRandomRoomType(), new Date(), new Date(2014, 12, 31), "880923", "John", "Burchell", "MyHouse", "123456789", "123", 9, 16, 1);
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
    
    @Test
    public void searchForBooking() {
    	//TODO - Implement
    }
    
    @Test
    public void findBookingsByDate() {
    	
    	long theFuture = System.currentTimeMillis() + (86400 * 7 * 1000);
    	Date nextWeek = new Date(theFuture);
    	
    	long theFuture2 = System.currentTimeMillis() + (86400 * 14 * 1000);
    	Date nextWeek2 = new Date(theFuture2);
    	
    	setupRoomHandler();
    	
    	booking.makeBooking(getRandomRoomType(), nextWeek, nextWeek2, "880923", "John", "Burchell", "MyHouse", "123456789", "123", 9, 16, 1);
    	booking.makeBooking(getRandomRoomType(), nextWeek, nextWeek2, "880923", "John", "Burchell", "MyHouse", "123456789", "123", 9, 16, 1);
    	booking.makeBooking(getRandomRoomType(), nextWeek, nextWeek2, "880923", "John", "Burchell", "MyHouse", "123456789", "123", 9, 16, 1);
    	booking.makeBooking(getRandomRoomType(), nextWeek, nextWeek2, "880923", "John", "Burchell", "MyHouse", "123456789", "123", 9, 16, 1);
    	
    	org.junit.Assert.assertTrue(booking.findBookingsByDate(nextWeek, nextWeek2) == 4);
    	org.junit.Assert.assertTrue(booking.bookingAvailable(nextWeek, nextWeek2, getRandomRoomType()) == true);
    }
    
    @Test
    public void findBookingsByDateAndType() {
    	long theFuture = System.currentTimeMillis() + (86400 * 7 * 1000);
    	Date nextWeek = new Date(theFuture);
    	
    	long theFuture2 = System.currentTimeMillis() + (86400 * 14 * 1000);
    	Date nextWeek2 = new Date(theFuture2);
    	
    	String roomType = getRandomRoomType();
    	String refernceNumber = booking.makeBooking(roomType, nextWeek, nextWeek2, "880923", "John", "Burchell", "MyHouse", "123456789", "123", 9, 16, 1);
    
    	booking.findBooking(refernceNumber).addRoomToBooking("TrippleRoom", 300);
    	booking.findBooking(refernceNumber).addRoomToBooking("DoubleRoom", 200);
    	
    	int targetBookings = 5;
    	
    	//i = i because a booking must have a roomType upon creation
    	for(int i = 0; i < targetBookings; ++i) {
    		booking.findBooking(refernceNumber).addRoomToBooking(roomType, 100);
    	}
    	
    	org.junit.Assert.assertTrue(booking.findBookingsByDateAndType(nextWeek, nextWeek2, roomType) == targetBookings + 1);
    	org.junit.Assert.assertTrue(booking.bookingAvailable(nextWeek, nextWeek2, roomType) == true);
    }

    @Ignore
    @Test
    public void bookingUseCase() {
    	
    	org.junit.Assert.assertTrue(booking.getBookings().size() == 0);
    	//MakeBooking - Return the reference Number.
    	//String refrenceNumber = booking.makeBooking(getRandomRoomType(), "SingleRoom", new Date(), new Date(), "880923", "John", "Burchell", "MyHouse", "123456789", "123", 9, 16);
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