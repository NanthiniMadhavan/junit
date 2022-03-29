package org.flipkart;



import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//@RunWith(Suite.class)
//@Suite.SuiteClasses({RealmeMobileValidation.class,SamsungMobileValidation.class})

public class TestRunner {
	public static void main (String[]args) {
		Result rs = JUnitCore.runClasses(RealmeMobileValidation.class,SamsungMobileValidation.class);
		System.out.println(rs.getRunCount());
		System.out.println(rs.getFailureCount());
		System.out.println(rs.getIgnoreCount());
		System.out.println(rs.getRunTime());
		
	
		
		
	}
}
