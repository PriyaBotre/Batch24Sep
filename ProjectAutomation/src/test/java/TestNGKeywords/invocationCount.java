package TestNGKeywords;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class invocationCount {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@Test (invocationCount=4,priority=3)
	public void test1() {
		System.out.println("Test 1");
	}
	
	@Test (priority=-2)
	public void test2() {
		System.out.println("Test 2");
	}
	
	@Test 
	public void test3() {
		System.out.println("Test 3");
	}
	
	@Test (priority=2)
	public void test4() {
		System.out.println("Test 4");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}

}
