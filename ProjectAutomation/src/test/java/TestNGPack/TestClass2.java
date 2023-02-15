package TestNGPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestClass2 {
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test-TestClass_2");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class-TestClass_2");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method-TestClass_2");
	}
	
	@Test
	public void testA() {
		System.out.println("Test A-TestClass_2");
		
		String actualTitle="Forgotten Home Page";
		String expectedTitle="Forgotten Home Page12";
		
		String actualUrl="https://www.facebook.com/";
		String expectedUrl="https://www.facebook.com/";
		//soft assert
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(actualTitle, expectedTitle,"Home Page Title is Wrong");
		soft.assertEquals(actualUrl, expectedUrl,"Home Page URL is Wrong");
		
		soft.assertAll();
	}
	

	@Test
	public void testB() {
		System.out.println("Test B-TestClass_2");
	}
	

	@Test
	public void testC() {
		System.out.println("Test C-TestClass_2");
	}
	

	@Test
	public void testD() {
		System.out.println("Test D-TestClass_2");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method-TestClass_2");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class-TestClass_2");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test-TestClass_2");
	}

}
