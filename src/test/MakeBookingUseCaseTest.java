package test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class MakeBookingUseCaseTest {

	static Implementation.ImplementationFactory factory;
	
	// Instances to set up components
	static Implementation.BookingComponent_BookingHandler bh;
	static Implementation.RoomComponent_RoomHandler rh;
	static Implementation.AdditionalServiceComponent_AdditionalServiceHandler ah;
	static Implementation.PaymentComponent_PaymentHandler ph; 
	
	// Interfaces for actual testing
	static Implementation.AdditionalServiceComponent_IEventManagement ie;
	static Implementation.PaymentComponent_IPayment ip;
	static Implementation.BookingComponent_IBookingAdministration ib;
	
	// Local variables
	static String rt[] = {null,null}; // room types
	static Date ad;
	static Date dd;
	static String custFName, custLName, custCC, custCVC, custAddr;
	static int custExpMonth, custExpYear;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		factory = Implementation.impl.ImplementationFactoryImpl.init();
		
		bh = factory.createBookingComponent_BookingHandler();
		rh = factory.createRoomComponent_RoomHandler();
		ah = factory.createAdditionalServiceComponent_AdditionalServiceHandler();
		ph = factory.createPaymentComponent_PaymentHandler();
		
		ib = bh;
		ie = ah;
		ip = ph;
		
		bh.setIRoomInformation(rh);
		bh.setIAdditionalServiceInformation(ie);
		bh.setIPayment(ip);
		
		rt[0] = "Double Bedroom";
		rt[1] = "Single Bedroom";
		ad = new Date();
		dd = new Date(ad.getTime()+(1000*60*60*24*3));
		custFName = "John";
		custLName = "Burchell";
		custCC = "2021";
		custCVC = "101";
		custExpMonth = 10;
		custExpYear = 16;
		custAddr = "Miki's Avenue 1";
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		factory = null;
		bh = null;
		rh = null;
		ah = null;
		
		ie = null;
		ip = null;
	}

	@Before
	public void setUp() throws Exception {
		rh.createBedRoom(101, true, 1337, rt[0], "For the cheesy couple", 2);
		rh.createBedRoom(102, true, 1337, rt[0], "For the cheesy couple", 2);
		rh.createBedRoom(103, true, 1337, rt[0], "For the cheesy couple", 2);
		rh.createBedRoom(104, true, 1337, rt[0], "For the cheesy couple", 2);
		rh.createBedRoom(105, true, 899, rt[1], "For the lonewolf", 1);
		rh.createBedRoom(106, true, 899, rt[1], "For the lonewolf", 1);
	}

	@After
	public void tearDown() throws Exception {
		rh.getBedRooms().clear();
		bh.getBookings().clear();
	}

	@Test
	public void makeBookingSuccessFlow() {
		/*
		 * 1 User selects to start creating a booking after having selected a room type
		 * 2 Assume: User is finished adding to their booking
		 * 3 System requests details for each guest
		 * 4 User inputs the guest details; full name, address and phone number 
		 * 5 System requests payment details to finalise booking
		 * 6 User inputs their credit card information
		 * 7 Assume: User has not input his credit card information incorrectly 3 times.
		 * 8 System validates credit card information
		 * 9 Assume: Credit card information is valid
		 * 10 System provides the User with a reference number
		 */
		
		/** Step 1-2:
		 * Room type and dates has been selected by searching and selecting.
		 * User has added two room types to his/her booking. A temporary 
		 * booking is made to reserve room(s).
		 */
		String ref1 = ib.makeBooking(rt[1], ad, dd, "", "", "", "", custCC, custCVC, custExpMonth, custExpYear); // NOTE: Not through IBooking
		bh.findBooking(ref1).addRoomToBooking(rt[0], 1337);
		
		System.out.println(ref1);
		
		org.junit.Assert.assertTrue(!("INVALID_BOOKING".equals(ref1)));
		org.junit.Assert.assertTrue(bh.findBooking(ref1).getRooms().size() == 2);
		
		/** Step 3-4: 
		 * User adds guest information for all guests.
		 */
		ib.addGuestToBooking(ref1, "John", "Burchell", "Miki's Avenue 1", "1234-567890");
		ib.addGuestToBooking(ref1, "Patrik", "Bäckström", "Close to skool", "1234-567890");
		ib.addGuestToBooking(ref1, "William", "Granli", "Johanneberg 1", "1234-567890");
		
		org.junit.Assert.assertTrue(bh.findBooking(ref1).getGuests().size() == 3);
		
		/**
		 * Step 5-9:
		 * User adds payment details. The details are correctly inserted on 
		 * first try and passes the validation.
		 */
		
		// Verifies that the expected CC number exist within the booking.
		org.junit.Assert.assertTrue(bh.findBooking(ref1).getPaymentDetails().getCcNumber().equals(custCC));
		
		/**
		 * Step 10:
		 * Provide User with a reference number.
		 */
		System.out.println("Herro dear " + custFName + "\nYour reference number is " + ref1);
	}
	
	@Test
	public void inputFaultyCCDetailsThreeTimes() {
		/** Step 1-2:
		 * Room type and dates has been selected by searching and selecting.
		 * User has added two room types to his/her booking. A temporary 
		 * booking is made to reserve room(s).
		 */
		String ref1 = ib.makeBooking(rt[1], ad, dd, "", "", "", "", custCC, custCVC, custExpMonth, custExpYear); // NOTE: Not through IBooking
		bh.findBooking(ref1).addRoomToBooking(rt[0], 1337);
		
		org.junit.Assert.assertTrue(!"INVALID_BOOKING".equals(ref1));
		org.junit.Assert.assertTrue(bh.findBooking(ref1).getRooms().size() == 2);
		
		/** Step 3-4: 
		 * User adds guest information for all guests.
		 */
		ib.addGuestToBooking(ref1, "John", "Burchell", "Miki's Avenue 1", "1234-567890");
		ib.addGuestToBooking(ref1, "Patrik", "Bäckström", "Close to skool", "1234-567890");
		ib.addGuestToBooking(ref1, "William", "Granli", "Johanneberg 1", "1234-567890");
		
		org.junit.Assert.assertTrue(bh.findBooking(ref1).getGuests().size() == 3);
		
		/** Step 5-6:
		 * User adds payment details.
		 */
		// Not applicable to show programmatically. Details are stored within
		// this test case to prevent the necessity of UI interaction.
		
		/** Step 7-10a
		 * 
		 */
		boolean correct = false;
		int i = 2;
		while (!correct) {
			if (custCC.substring(0, i).length() == 4 && custCVC.length() == 3 && custExpMonth < 13 && custExpMonth > 0 && custExpYear < 10000 && custExpYear > 0) {
				System.out.println("Credit card information is CORRECT!");
				correct = true;
			}
			System.out.println("Credit card information is wrong!");
			i++;
		}
		
		/**
		 * Step 8-9:
		 * Use case has recovered from alternative flow 7-10a.
		 * Credit card information is validated with the bank service
		 */
		
		// Verifies that the expected CC number exist within the booking.
		org.junit.Assert.assertTrue(bh.findBooking(ref1).getPaymentDetails().getCcNumber().equals(custCC));
		
		/**
		 * Step 10:
		 * Provide User with a reference number.
		 */
		System.out.println("Herro dear " + custFName + "\nYour reference number is " + ref1);
	}
	
	@Test
	public void ccIsNotValid() {
		
		/** Step 1-2:
		 * Room type and dates has been selected by searching and selecting.
		 * User has added two room types to his/her booking. A temporary 
		 * booking is made to reserve room(s).
		 */
		String ref1 = ib.makeBooking(rt[1], ad, dd, "", "", "", "", custCC, custCVC, custExpMonth, custExpYear); // NOTE: Not through IBooking
		bh.findBooking(ref1).addRoomToBooking(rt[0], 1337);
		
		org.junit.Assert.assertTrue(!"INVALID_BOOKING".equals(ref1));
		org.junit.Assert.assertTrue(bh.findBooking(ref1).getRooms().size() == 2);
		
		/** Step 3-4: 
		 * User adds guest information for all guests.
		 */
		ib.addGuestToBooking(ref1, "John", "Burchell", "Miki's Avenue 1", "1234-567890");
		ib.addGuestToBooking(ref1, "Patrik", "Bäckström", "Close to skool", "1234-567890");
		ib.addGuestToBooking(ref1, "William", "Granli", "Johanneberg 1", "1234-567890");
		
		org.junit.Assert.assertTrue(bh.findBooking(ref1).getGuests().size() == 3);
		
		/**
		 * Step 5-9:
		 * User adds payment details. The details are correctly inserted on 
		 * first try and passes the validation.
		 */
		
		// Verifies that the expected CC number exist within the booking.
		org.junit.Assert.assertTrue(bh.findBooking(ref1).getPaymentDetails().getCcNumber().equals(custCC));
		
		/**
		 * Step 10:
		 * Provide User with a reference number.
		 */
		System.out.println("Herro dear " + custFName + "\nYour reference number is " + ref1);
	}
}
