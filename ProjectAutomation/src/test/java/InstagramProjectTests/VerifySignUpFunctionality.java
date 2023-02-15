package InstagramProjectTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import InstagramProject.LoginPage;
import InstagramProject.SignUpPage;

public class VerifySignUpFunctionality {
	
	public static void main(String[] args) throws InterruptedException {
	//step 1-open the chrome browser & enter URL	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PRIYA\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driverTest=new ChromeDriver();
		driverTest.manage().window().maximize();
		driverTest.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driverTest.get("https://www.instagram.com/");
	
	//step 2-click on sign up button link
		LoginPage loginPage=new LoginPage(driverTest);
		loginPage.clickOnSignUpButtonLink();
		Thread.sleep(1000);
		
	//step 3-enter the email,full name,user name & password	
		SignUpPage signUpPage=new SignUpPage(driverTest);
		signUpPage.enterMobNumOrEmail("9699716875");
		signUpPage.sendFullName("Priya Botre");
		signUpPage.sendUserName("Priya");
		signUpPage.sendPasswordName("prb#123");
		
	//step 4-click on sign up button
		signUpPage.clickOnSignUpButton();
		
		Thread.sleep(1000);
		
	//step 5-Verify home page: URL & Title
		 //HomePagePOMClass object
		
		String actualTitle=driverTest.getTitle();
		String actualUrl=driverTest.getCurrentUrl();
		
		String expectedTitle="Sign up to see photos and videos from your friends.";
		String expectedURL="https://www.instagram.com/accounts/emailsignup/";
		
		if(actualTitle.equals(expectedTitle) && actualUrl.equals(expectedURL)) {
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}
		
	}

}
