package Project.Building_a_selenium_project;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.reporters.jq.TestPanel;
public class TestNG_Class {
		public static void main(String args[]) {
			beforeSuite();
			afterSuite();
			beforeClass();
			afterClass();
			beforeMethod();
			afterMethod();
			beforeTest();
			afterTest();
		}
			
	@BeforeSuite
	public static void beforeSuite() {
		 Reporter.log("beforeSuite", true);		
	}	
	
	@AfterSuite
	public static void afterSuite() {
		 Reporter.log("beforeSuite", true);		
	}
	
	@BeforeClass
	public static void beforeClass() {
		 Reporter.log("beforeClass", true);		
	}	
	
	@AfterClass
	public static void afterClass() {
		 Reporter.log("afterClass", true);		
	}
	
	@BeforeMethod
	public static void beforeMethod() {
		 Reporter.log("beforeMethod", true);		
	}	

	@AfterMethod
	public static void afterMethod() {
		 Reporter.log("afterMethod", true);		
	}		
		
	@BeforeTest
	public static void beforeTest() {
		 Reporter.log("beforeTest", true);		
	}
	@Test(priority = 0,groups = {"module1","module2"})
	public static void test() {
		Reporter.log("test", true);
	}
		
	@Test(priority = 1,invocationCount = 4)
	public static void testP() {
		Reporter.log("test", true);
	}
	
	@Test(enabled = false,priority = 2,dependsOnMethods = "testP")
	public static void disabledTest() {
		Reporter.log("test", true);
	}
	
	@AfterTest
	public static void afterTest() {
		 Reporter.log("afterTest", true);		
	
	}				
}
