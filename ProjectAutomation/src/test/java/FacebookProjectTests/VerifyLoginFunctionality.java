package FacebookProjectTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import FacebookProject.ForgotPassword;
import FacebookProject.LoginOrSignUpPage;

public class VerifyLoginFunctionality {
	
	public static void main(String[] args) throws InterruptedException {
		//Step 1-open browser & enter the URL
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PRIYA\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driverTest=new ChromeDriver();
		driverTest.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driverTest.manage().window().maximize();
		driverTest.get("https://www.facebook.com/");
		
		//Step 2-enter the user name & password
		LoginOrSignUpPage loginOrSignUpPage=new LoginOrSignUpPage(driverTest);
		loginOrSignUpPage.sendUserName("Velocity");
		loginOrSignUpPage.sendPasswordName("12345678");
		
		//step 3-click on login button
		loginOrSignUpPage.clickOnLoginButton();
		Thread.sleep(1000);
		
		//step 4-Verify home page: URL & Title
		 //HomePagePOMClass object
		
		String actualTitle=driverTest.getTitle();
		String actualUrl=driverTest.getCurrentUrl();
		
		String expectedTitle="Forgotten Home Page";
		String expectedURL="https://www.facebook.com/home";
		
		if(actualTitle.equals(expectedTitle) && actualUrl.equals(expectedURL)) {
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}
       
	}

}
