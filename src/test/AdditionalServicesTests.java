package test;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AdditionalServicesTests {

	static Implementation.ImplementationFactory factory;
	static Implementation.AdditionalServiceComponent_AdditionalServiceHandler as;
	static Implementation.AdditionalServiceComponent_IAdditionalServiceInformation as2;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		factory = Implementation.impl.ImplementationFactoryImpl.init();
		as = factory.createAdditionalServiceComponent_AdditionalServiceHandler();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		as = factory.createAdditionalServiceComponent_AdditionalServiceHandler();
	}

	@After
	public void tearDown() throws Exception {
		as = null;
	}

	@Test
	public void emptyList() throws Exception {
		org.junit.Assert.assertTrue(as.getAdditionalService().size() == 0);
	}
	
	@Test
	public void createService() {
		System.out.print("\n\n### FUNC: ");
		System.out.println("createService()\n");
		
		as.createAdditionalService("SERVICE", true, 500, "Test description");
		org.junit.Assert.assertTrue(as.getAdditionalService().size() == 1);
	}
	
	@Test
	public void createAndEditService() {
		System.out.print("\n\n### FUNC: ");
		System.out.println("createAndEditService()\n");
		
		as.createAdditionalService("SERVICE", true, 500, "Test description");
		System.out.println(as.findService("SERVICE").toString());
		as.editAdditionalService("SERVICE", "NEW NAME", true, 500, "New name and new price");
		System.out.println(as.findService("NEW NAME").toString());
		
		org.junit.Assert.assertTrue("NEW NAME".equals(as.findService("NEW NAME").getName()));
	}
	
	@Test
	public void createTwoServicesRemoveOne() {
		System.out.print("\n\n### FUNC: ");
		System.out.println("createTwoServicesRemoveOne()\n");
		
		as.createAdditionalService("SERVICE1", true, 500, "Test description");
		as.createAdditionalService("SERVICE2", true, 500, "Test description");
		as.removeAdditionalService("SERVICE1");
		
		org.junit.Assert.assertTrue(as.getAdditionalService().size() == 1);
	}
	
	@Test
	public void createFiveRemoveOne() {
		System.out.print("\n\n### FUNC: ");
		System.out.println("createFiveRemoveOne()\n");
		
		as.createAdditionalService("SERVICE1", true, 500, "Test description");
		as.createAdditionalService("SERVICE2", true, 500, "Test description");
		as.createAdditionalService("SERVICE3", true, 500, "Test description");
		as.createAdditionalService("SERVICE4", true, 500, "Test description");
		as.createAdditionalService("SERVICE5", true, 500, "Test description");
		as.removeAdditionalService("SERVICE3");
		org.junit.Assert.assertTrue(as.getAdditionalService().size() == 4);
	}
	
	@Test
	public void preventDuplicateServices() {
		System.out.print("\n\n### FUNC: ");
		System.out.println("preventDuplicateServices()\n");
		
		as.createAdditionalService("SERVICE1", true, 500, "Test description");
		as.createAdditionalService("SERVICE1", true, 200, "Another test description");
		org.junit.Assert.assertTrue(as.getAdditionalService().size() == 1);
	}
	
	@Test
	public void addDeleteAddDeleteAdd() {
		System.out.print("\n\n### FUNC: ");
		System.out.println("addDeleteAddDeleteAdd()\n");
		
		as.createAdditionalService("SERVICE", true, 500, "Test description");
		as.removeAdditionalService("SERVICE");
		as.createAdditionalService("SERVICE", true, 500, "Test description");
		as.removeAdditionalService("SERVICE");
		as.createAdditionalService("SERVICE", true, 500, "Test description");
		org.junit.Assert.assertTrue(as.getAdditionalService().size() == 1);
	}
	
	@Test
	public void createServiceAddEventEditEvent() {
		System.out.print("\n\n### FUNC: ");
		System.out.println("createServiceAddEventEditEvent()\n");
		
		Date date = new Date();
		String location = "Over there";
		
		as.createAdditionalService("SERVICE", true, 500, "Test description");
		as.createEvent("SERVICE", date, location, 10, 5);
		
		as.editEvent("SERVICE", date, location, 10, 6);
		
		org.junit.Assert.assertTrue(as.findService("SERVICE").findEvent(date, location).getCurrentAttendants() == 6);
	}
	
	@Test
	public void addTooManyAttendantsToEvent() {
		System.out.print("\n\n### FUNC: ");
		System.out.println("addTooManyAttendantsToEvent()\n");
		
		Date date = new Date();
		String location = "Over there";
		
		as.createAdditionalService("SERVICE", true, 500, "Test description");
		as.createEvent("SERVICE", date, location, 10, 5);
		
		as.editEvent("SERVICE", date, location, 10, 11);
		
		org.junit.Assert.assertTrue(as.findService("SERVICE").findEvent(date, location).getCurrentAttendants() == 5);
	}
	
	@Test
	public void createServiceAddTwoEvent() {
		System.out.print("\n\n### FUNC: ");
		System.out.println("createServiceAddEvent()\n");
		
		Date date = new Date();
		String location = "Over there";
		String location2 = "Over anothere there";
		
		as.createAdditionalService("SERVICE", true, 500, "Test description");
		as.createEvent("SERVICE", date, location, 10, 5);
		as.createEvent("SERVICE", date, location2, 10, 5);
		
		// Print in terminal
		System.out.println(as.findService("SERVICE").toString());
		
		org.junit.Assert.assertTrue(as.findService("SERVICE").getAdditionalServiceEvent().size() == 2);
	}
	
	@Test
	public void createServiceAddTwoEventsRemoveOneEvent() {
		System.out.print("\n\n### FUNC: ");
		System.out.println("createServiceAddTwoEventsRemoveOneEvent()\n");
		
		Date date = new Date();
		String location = "Over there";
		String location2 = "Over anothere there";
		
		as.createAdditionalService("SERVICE", true, 500, "Test description");
		as.createEvent("SERVICE", date, location, 10, 5);
		as.createEvent("SERVICE", date, location2, 10, 5);
		as.removeEvent("SERVICE", date, location2);
		
		// Print in terminal
		System.out.println(as.findService("SERVICE").toString());
		
		org.junit.Assert.assertTrue(as.findService("SERVICE").getAdditionalServiceEvent().size() == 1);
	}
	
	@Test
	public void createEventWithoutExistingService() {
		System.out.print("\n\n### FUNC: ");
		System.out.println("createEventWithoutExistingService()\n");
		
		Date date = new Date();
		String location = "Over there";
		
		as.createEvent("SERVICE", date, location, 10, 5);
		
		// Print in terminal
		System.out.println(as.findService("SERVICE").toString());
		
		org.junit.Assert.assertTrue(as.findService("SERVICE").getAdditionalServiceEvent().size() == 1);
	}
	
	@Test
	public void removeAllEventsForDate() {
		System.out.print("\n\n### FUNC: ");
		System.out.println("removeAllEventsForDate()\n");
		
		Date date = new Date();
		
		as.createEvent("SERVICE", date, "Location 1", 10, 5);
		as.createEvent("SERVICE", date, "Location 2", 10, 5);
		as.createEvent("SERVICE", date, "Location 3", 10, 5);
		as.createEvent("SERVICE", date, "Location 4", 10, 5);
		
		// Print in terminal
		System.out.println(as.findService("SERVICE").toString());
		
		as.removeEvents("SERVICE", date);
		
		org.junit.Assert.assertTrue(as.findService("SERVICE").getAdditionalServiceEvent().size() == 0);
	}
	
	@Test
	public void returnMultipleEvents() {
		System.out.print("\n\n### FUNC: ");
		System.out.println("returnMultipleEvents()\n");
		
		Date date = new Date();
		
		as.createEvent("SERVICE", date, "Location 1", 10, 5);
		as.createEvent("SERVICE", date, "Location 2", 10, 5);
		as.createEvent("SERVICE", date, "Location 3", 10, 5);
		as.createEvent("SERVICE", date, "Location 4", 10, 5);
		
		// Print in terminal
		System.out.println(as.findService("SERVICE").toString());
		
		as.findService("SERVICE").findEvents(date);
		
		org.junit.Assert.assertTrue(as.findService("SERVICE").findEvents(date).size() == 4);
	}
}
