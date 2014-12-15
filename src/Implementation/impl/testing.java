package Implementation.impl;

import java.util.Date;

import Implementation.BookingComponent_BookingManager;

public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookingComponent_BookingManager manager = new BookingComponent_BookingManagerImpl();
		manager.makeBooking("TEST", new Date(), new Date(), "880923", "John", "Burchell", "MyHouse", "123456789", "123", "september", "2015");
		System.out.println(manager.getBookings().get(0));
	}

}
