package TestNGPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import FacebookProject.ForgotPassword;
import FacebookProject.LoginOrSignUpPage;
import FacebookProject.SignUpForm;

public class TestClassTestNG {
	
	private WebDriver driver;
	private LoginOrSignUpPage loginOrSignUpPage;
	private ForgotPassword forgotPassword;
	private SignUpForm signUpForm;
	
	@Parameters("browser123")
	@BeforeTest
	public void launchBrowser(String browser)
	{
		System.out.println("Before Test");
		if(browser.equals("Chrome"))
		{	
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\PRIYA\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		}
		
		if(browser.equals("Edge"))
		{
			System.setProperty("webdriver.edge.driver","C:\\Users\\PRIYA\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			 driver=new EdgeDriver();
		}
			
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@BeforeClass
	public void createPOMObject()
	{
		loginOrSignUpPage=new LoginOrSignUpPage(driver);
		forgotPassword=new ForgotPassword(driver);
	}
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void test1()
	{
		System.out.println("Test 1");
		String actualTitle="Forgotten Home Page";
		String expectedTitle="Forgotten Home Page12";
		
		String actualUrl="https://www.facebook.com/";
		String expectedUrl="https://www.facebook.com/";
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(actualTitle, expectedTitle,"Home Page Title is Wrong");
		soft.assertEquals(actualUrl, expectedUrl,"Home Page URL is Wrong");
		
		soft.assertAll();
       
	}
	
	@Test
	public void test2()
	{
		
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
		System.out.println("LogOut");
	}
	
	@AfterClass
	public void test123()
	{
		loginOrSignUpPage=null;
		forgotPassword=null;
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
		driver.close();
		driver=null;
		System.gc();   //Garbage collector
	}

}
