package test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class AllTestsRunner {
	public static void main(String[] args) {
	  Result result = JUnitCore.runClasses(AllTests.class);
	  System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	  System.out.println("----------------------------------------------------");
	  System.out.println("------------ TEST SUITE FAILURE SUMMARY ------------");
	  System.out.println("+++ Failure count: " + result.getFailureCount());
	  System.out.println("+++ Ignore count: " + result.getIgnoreCount());
	  System.out.println("+++ Total tests: " + result.getRunCount());
	  System.out.println("+++ Run time (ms): " + result.getRunTime());
	  System.out.println("----------------------------------------------------\n");
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
	}
} 