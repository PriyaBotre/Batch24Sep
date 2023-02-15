package InstagramProjectTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import InstagramProject.LoginPage;

public class VerifyLoginFunctionality {
	
	public static void main(String[] args) throws InterruptedException {
	//step 1-open the browser & enter URL	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PRIYA\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driverTest=new ChromeDriver();
		driverTest.manage().window().maximize();
		driverTest.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driverTest.get("https://www.instagram.com/");
		
	//step 2-enter the user name & password
		LoginPage loginPage=new LoginPage(driverTest);
		loginPage.sendUserName("Priya");
		loginPage.sendPasswordName("pr#1234");
		
	//step 3-click on login button
		loginPage.clickOnLoginButton();
		
		Thread.sleep(1000);
		
	//step 4-Verify home page: URL & Title
		 //HomePagePOMClass object
		
		String actualTitle=driverTest.getTitle();
		String actualUrl=driverTest.getCurrentUrl();
		
		String expectedTitle="Forgotten Home Page";
		String expectedURL="https://www.instagram.com/home";
		
		if(actualTitle.equals(expectedTitle) && actualUrl.equals(expectedURL)) {
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}
      
	} 

}
