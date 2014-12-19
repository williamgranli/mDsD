package test;

import java.util.Date;
import java.util.Random;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import Implementation.BookingComponent_AdditionalService;

public class bookingTests {

	static Implementation.ImplementationFactory factory;
	static Implementation.BookingComponent_BookingHandler booking;
	static Implementation.RoomComponent_RoomHandler roomHandler;
	static Implementation.OccupancyComponent_OccupancyHandler occupancy;
	static Implementation.OccupancyComponent_IOccupancy occupancyHandler;
	static Implementation.AdditionalServiceComponent_AdditionalServiceHandler as;
	static Implementation.AdditionalServiceComponent_IEventManagement em;
	static Implementation.PaymentComponent_IPayment payment;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		factory = Implementation.impl.ImplementationFactoryImpl.init();
		booking = factory.createBookingComponent_BookingHandler();
		roomHandler = factory.createRoomComponent_RoomHandler();
		
		as = factory.createAdditionalServiceComponent_AdditionalServiceHandler();
		em = as;
		
		occupancyHandler = factory.createOccupancyComponent_OccupancyHandler();
		payment = factory.createPaymentComponent_PaymentHandler();
		
		booking.setIRoomInformation(roomHandler);
		booking.setIAdditionalServiceInformation(em);
		booking.setIPayment(payment);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		factory = null;
		booking = null;
		roomHandler = null;
		as = null;
		em = null;
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
		Date date = new Date();
		long dateTime = (date.getTime() / 1000) * 1000;
		date = new Date(dateTime);
		
		String location = "somewhere";
		int max = 10;
		int current = 0;
		
		as.createAdditionalService("Massage", true, max, "Massage from a lovely person");
		
		as.createEvent("Massage", date, location, max, current);
		as.createEvent("Massage", date, location + "1", max, current);
		as.createEvent("Massage", date, location + "2", max, current);
		as.createEvent("Massage", date, location + "3", max, current);
		as.createEvent("Massage", date, location + "4", max, current);
		
	}
	
	public String getRandomRoomType() {
    	Random rand = new Random();
    	int randomNumber = rand.nextInt(booking.getIRoomInformation().getRoomTypes().size()) + 0;
    	return booking.getIRoomInformation().getRoomTypes().get(randomNumber);
	}
	
	public String getRandomEventType() {
		Random rand = new Random();
    	int randomNumber = rand.nextInt(booking.getIRoomInformation().getRoomTypes().size()) + 0;
    	return booking.getIAdditionalServiceInformation().getServices().get(randomNumber);
	}
	
	public Date nextWeekDate() {
    	long theFuture = System.currentTimeMillis() + (86400 * 7 * 1000);
    	return new Date(theFuture);
	}
	
    @Test
    public void makeBooking() {
    	Date nextWeek = nextWeekDate();
    	
    	org.junit.Assert.assertTrue(booking.getBookings().size() == 0);
    	String ref = booking.makeBooking(getRandomRoomType(), new Date(), nextWeek, "880923", "John", "Burchell", "MyHouse", "123456789", "123", 9, 16);
    	org.junit.Assert.assertTrue(booking.getBookings().size() == 1);
    	org.junit.Assert.assertFalse(ref.equals("INVALID_BOOKING"));
    }
    
    @Test
    public void makeMultipleBookings() {
    	org.junit.Assert.assertTrue(booking.getBookings().size() == 0);
    	Date nextWeek = nextWeekDate();
    	
    	for(int i = 0; i < roomHandler.getAllRoomNumbers().size(); ++i) {
    		String ref = booking.makeBooking(getRandomRoomType(), new Date(), nextWeek, "880923", "John", "Burchell", "MyHouse", "123456789", "123", 9, 16);
    		org.junit.Assert.assertFalse(ref.equals("INVALID_BOOKING"));
    	}
    }
    
    @Test
    public void makeMultipleBookingsFail() {
    	Date nextWeek = nextWeekDate();
    	
    	Date today = new Date();
    	
    	for(int i = 0; i < roomHandler.getAllRoomNumbers().size(); i++) {
    		String ref = booking.makeBooking(getRandomRoomType(), today, nextWeek, "880923", "John", "Burchell", "MyHouse", "123456789", "123", 9, 16);
    		org.junit.Assert.assertFalse(ref.equals("INVALID_BOOKING"));
    	}
    	String ref = booking.makeBooking(getRandomRoomType(), today, nextWeek, "880923", "John", "Burchell", "MyHouse", "123456789", "123", 9, 16);
    	org.junit.Assert.assertTrue(ref.equals("INVALID_BOOKING"));
    }
    
    @Test
    public void cancelBooking() {
    	String referenceNumber = booking.makeBooking(getRandomRoomType(), new Date(), nextWeekDate(), "880923", "John", "Burchell", "MyHouse", "123456789", "123", 9, 16);
    	
    	setupAdditionalServiceHandler();
    	
    	String randomType = getRandomEventType();
    	
    	boolean successAS = booking.addAdditionalService(referenceNumber, randomType, booking.findBooking(referenceNumber).getGuests().size());
    	org.junit.Assert.assertTrue(successAS);
    	
    	boolean success = booking.cancelBooking(referenceNumber);
    	org.junit.Assert.assertFalse(booking.findBooking(referenceNumber).isActive());
    	org.junit.Assert.assertTrue(success);
    	
    	for(BookingComponent_AdditionalService as : booking.findBooking(referenceNumber).getAdditionalServices()) {
    		org.junit.Assert.assertTrue(as.getGuestCount() == 0);
    	}

    }
    
    @Test
    public void cancelBookingFail() {
    	String referenceNumber = booking.makeBooking(getRandomRoomType(), new Date(), nextWeekDate(), "880923", "John", "Burchell", "MyHouse", "123456789", "123", 9, 16);
    	booking.cancelBooking(referenceNumber);
    	
    	boolean result = booking.cancelBooking(referenceNumber);
    	org.junit.Assert.assertFalse(booking.findBooking(referenceNumber).isActive());
    	org.junit.Assert.assertFalse(result);
    }
    
    @Test
    public void addRoomToBooking() {
    	
    	String roomType = getRandomRoomType();
    	int price = booking.getIRoomInformation().getPriceOfRoomType(roomType);
    	
    	String referenceNumber = booking.makeBooking(roomType, new Date(), nextWeekDate(), "880923", "John", "Burchell", "MyHouse", "123456789", "123", 9, 16);
    	
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
    	
    	String roomType = getRandomRoomType();
    	String realRef = booking.makeBooking(roomType, nextWeek, nextWeek2, "880923", "John", "Burchell", "MyHouse", "123456789", "123", 9, 16);
    	booking.addRoom(realRef, roomType, booking.getIRoomInformation().getPriceOfRoomType(roomType));
    	org.junit.Assert.assertTrue(booking.findBooking(realRef).getRooms().get(0) != null);
    }
    
    @Test
    public void removeRoom() {
    	String roomType = getRandomRoomType();
    	String roomTypeTwo = getRandomRoomType();
    	
    	long theFuture = System.currentTimeMillis() + (86400 * 7 * 1000);
    	Date nextWeek = new Date(theFuture);
    	
    	String referenceNumber = booking.makeBooking(getRandomRoomType(), new Date(), nextWeek, "880923", "John", "Burchell", "MyHouse", "123456789", "123", 9, 16);
    	booking.addRoom(referenceNumber, roomTypeTwo, 150);
    	booking.removeRoom(referenceNumber, roomType);
    	org.junit.Assert.assertTrue(booking.findBooking(referenceNumber).getRooms().get(0).getRoomType().equals(roomTypeTwo));
    }
    
    @Test
    public void addGuestToBooking() {
    	String type = getRandomRoomType();
    	String referenceNumber = booking.makeBooking(type, new Date(), new Date(), "880923", "John", "Burchell", "MyHouse", "123456789", "123", 9, 16);
    	booking.addRoom(referenceNumber, type, booking.getIRoomInformation().getPriceOfRoomType(type));
    	
    	boolean attemptOne = booking.addGuestToBooking(referenceNumber, "Frodo", "Baggins", "The Shire", "01235 528942");
    	boolean attemptTwo = booking.addGuestToBooking(referenceNumber, "Bilbo", "Baggins", "The Old Shire", "01235 528942");
    	
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
    	String referenceNumber = booking.makeBooking(type, new Date(), nextWeek, "880923", "John", "Burchell", "MyHouse", "123456789", "123", 9, 16);
    	booking.addRoom(referenceNumber, type, booking.getIRoomInformation().getPriceOfRoomType(type));
    	
    	booking.addGuestToBooking(referenceNumber, "Frodo", "Baggins", "The Shire", "01235 528942");
    	booking.addGuestToBooking(referenceNumber, "Bilbo", "Baggins", "The Old Shire", "01235 528942");
    	boolean result = booking.addGuestToBooking(referenceNumber, "Sauron", "Baggins", "The Even Older Shire", "01235 528942");
    	
    	//This result should be false; there are not enough rooms
    	org.junit.Assert.assertFalse(result);
    	org.junit.Assert.assertTrue(booking.findBooking(referenceNumber).getGuests().size() == 2);
    	org.junit.Assert.assertTrue(booking.findBooking(referenceNumber).getGuests().get(0).getFirstName().equals("Frodo"));
    	org.junit.Assert.assertTrue(booking.findBooking(referenceNumber).getGuests().get(1).getFirstName().equals("Bilbo"));
    }
    
    @Test
    public void removeGuest() {
    	String type = getRandomRoomType();
    	String referenceNumber = booking.makeBooking(type, new Date(), new Date(), "880923", "John", "Burchell", "MyHouse", "123456789", "123", 9, 16);
    	booking.addRoom(referenceNumber, type, booking.getIRoomInformation().getPriceOfRoomType(type));
    	booking.addGuestToBooking(referenceNumber, "Frodo", "Baggins", "The Shire", "01235 528942");
    	booking.addGuestToBooking(referenceNumber, "Bilbo", "Baggins", "Mordor", "01235 528942");
    	booking.removeGuest(referenceNumber, "Frodo", "Baggins", "The Shire");
    	org.junit.Assert.assertTrue(booking.findBooking(referenceNumber).getGuests().size() == 1);
    	org.junit.Assert.assertTrue(booking.findBooking(referenceNumber).getGuests().get(0).getFirstName().equals("Bilbo"));
    }
    
    @Test
    public void addAdditionalService() {
    	Date nextWeek = nextWeekDate();
    	String referenceNumber = booking.makeBooking(getRandomRoomType(), new Date(), nextWeek, "880923", "John", "Burchell", "MyHouse", "123456789", "123", 9, 16);
    	booking.addGuestToBooking(referenceNumber, "Frodo", "Baggins", "The Shire", "01235 528942");
    	
    	setupAdditionalServiceHandler();
    	
    	String randomType = getRandomEventType();
    	
    	boolean success = booking.addAdditionalService(referenceNumber, randomType, booking.findBooking(referenceNumber).getGuests().size());
    	
    	org.junit.Assert.assertTrue(success);
    	org.junit.Assert.assertTrue(booking.findBooking(referenceNumber).getAdditionalServices().size() == 1);
    	org.junit.Assert.assertTrue(booking.findBooking(referenceNumber).getAdditionalServices().get(0).getName().equals(randomType));
    }
    
    
    @Test
    public void addAdditionalServiceFailTooManyGuests() {
    	Date nextWeek = nextWeekDate();
    	String referenceNumber = booking.makeBooking(getRandomRoomType(), new Date(), nextWeek, "880923", "John", "Burchell", "MyHouse", "123456789", "123", 9, 16);
    	booking.addGuestToBooking(referenceNumber, "Frodo", "Baggins", "The Shire", "01235 528942");
    	
    	setupAdditionalServiceHandler();
    	
    	String randomType = getRandomEventType();
    	
    	boolean success = booking.addAdditionalService(referenceNumber, randomType, 100);
    	
    	org.junit.Assert.assertFalse(success);
    }
    
    @Test
    public void removeAdditionalService() {
    	Date nextWeek = nextWeekDate();
    	String referenceNumber = booking.makeBooking(getRandomRoomType(), new Date(), nextWeek, "880923", "John", "Burchell", "MyHouse", "123456789", "123", 9, 16);
    	
    	String randomType = getRandomEventType();
    	
    	booking.addAdditionalService(referenceNumber, randomType, booking.findBooking(referenceNumber).getGuests().size());
    	
    	boolean success = booking.removeAdditionalService(referenceNumber, randomType);
    	
    	org.junit.Assert.assertTrue(booking.findBooking(referenceNumber).getAdditionalServices().size() == 0);
    	org.junit.Assert.assertTrue(success);
    }
    
    @Ignore
    @Test
    public void generateQuote() {
    	//TODO - Fix once implemented
    }
    
    @Test
    public void findBookingsByDate() {
    	
    	long theFuture = System.currentTimeMillis() + (86400 * 7 * 1000);
    	Date nextWeek = new Date(theFuture);
    	
    	long theFuture2 = System.currentTimeMillis() + (86400 * 14 * 1000);
    	Date nextWeek2 = new Date(theFuture2);
    	
    	setupRoomHandler();
    	
    	booking.makeBooking(getRandomRoomType(), nextWeek, nextWeek2, "880923", "John", "Burchell", "MyHouse", "123456789", "123", 9, 16);
    	booking.makeBooking(getRandomRoomType(), nextWeek, nextWeek2, "880923", "John", "Burchell", "MyHouse", "123456789", "123", 9, 16);
    	booking.makeBooking(getRandomRoomType(), nextWeek, nextWeek2, "880923", "John", "Burchell", "MyHouse", "123456789", "123", 9, 16);
    	booking.makeBooking(getRandomRoomType(), nextWeek, nextWeek2, "880923", "John", "Burchell", "MyHouse", "123456789", "123", 9, 16);
    	
    	System.out.println(">> " + booking.findBookingsByDate(nextWeek, nextWeek2));
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
    	String refernceNumber = booking.makeBooking(roomType, nextWeek, nextWeek2, "880923", "John", "Burchell", "MyHouse", "123456789", "123", 9, 16);
    
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
}