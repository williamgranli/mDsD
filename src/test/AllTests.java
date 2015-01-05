package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	AdditionalServicesTests.class,
	BookingTests.class,
	DecisionSupportTests.class,
	OccupancyTests.class,
	PaymentTests.class,
	RoomTests.class,
	StaffAdministrationTest.class,
	MakeBookingUseCaseTest.class})

public class AllTests {

}