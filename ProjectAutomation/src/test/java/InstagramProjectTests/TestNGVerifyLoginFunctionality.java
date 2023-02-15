package InstagramProjectTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import InstagramProject.LoginPage;
import InstagramProject.SignUpPage;

public class TestNGVerifyLoginFunctionality {
	
	private WebDriver driver;
	private LoginPage loginPage;
	private SignUpPage signUpPage;
	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PRIYA\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driverTest=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@BeforeClass
	public void createPOMObjects() {
		loginPage=new LoginPage(driver);
		signUpPage=new SignUpPage(driver);
	}
	
	@BeforeMethod
	public void beforeMethod() {
	 System.out.println("Before Method");
	 driver.get("https://www.instagram.com/");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
		System.out.println("LogOut");
	}
	
	@AfterClass
	public void test12() {
		loginPage=null;
		signUpPage=null;
	}
	
	@AfterTest
	public void afterClass() {
		System.out.println("After Class");
		driver.close();
		driver=null;
		System.gc(); //Garbage collector
	}

}
