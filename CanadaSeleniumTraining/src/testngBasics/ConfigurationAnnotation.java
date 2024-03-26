package testngBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotation {

	
	@BeforeTest
	public void beforeTest() {
		
		System.out.println("Before Test");
	}
	@BeforeClass
	public void beforeClass() {
		/**
		 * launch browser, launch url, maximise browser
		 * Pre-condition
		 */
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void beforeMethod() {
		/**
		 * fetch method name
		 */
		System.out.println("Before Method");
	}
	
	@Test
	public void testAnnotation() {
		System.out.println("Test Annotation");
	}
	@AfterSuite
	public void afterSuite() {
		/**
		 * finish reports
		 */
		System.out.println("After Suite");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	@AfterClass
	public void afterClass() {
		/**
		 * close the browser
		 * Post condition
		 */
		System.out.println("After Class");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	@BeforeSuite
	public void beforeSuite() {
		/**
		 * Generate reports
		 */
		System.out.println("Before Suite");
	}
}
