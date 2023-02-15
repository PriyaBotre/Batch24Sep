package TestNGPack;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass1 {
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test-TestClass_1");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class-TestClass_1");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method-TestClass_1");
	}
	
	@Test
	public void testA() {
		System.out.println("Test A-TestClass_1");
		String actualTitle="Forgotton Home Page";
		String expectedTitle="Forgotton Home Page12";
		//Hard Assert
		Assert.assertEquals(actualTitle, expectedTitle,"Home Page Title is Wrong");
		//Assert.assertNotEquals(actualTitle, expectedTitle,"Home Page Title is Right");
	}
	

	@Test
	public void testB() {
		System.out.println("Test B-TestClass_1");
	}
	

	@Test
	public void testC() {
		System.out.println("Test C-TestClass_1");
	}
	

	@Test
	public void testD() {
		System.out.println("Test D-TestClass_1");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method-TestClass_1");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class-TestClass_1");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test-TestClass_1");
	}
}
