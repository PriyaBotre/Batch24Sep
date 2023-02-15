package FacebookProjectTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import FacebookProject.ForgotPassword;
import FacebookProject.LoginOrSignUpPage;

public class VerifyForgotPasswordFunctionality {
	
	public static void main(String[] args) {
	//Step 1-open browser & enter the Url	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PRIYA\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driverTest=new ChromeDriver();
		driverTest.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driverTest.manage().window().maximize();
		driverTest.get("https://www.facebook.com/");
		
	//step 2-click on forgot password link	
		LoginOrSignUpPage loginOrSignUpPage=new LoginOrSignUpPage(driverTest);
		loginOrSignUpPage.clickOnForgotPasswordLink();
	
	//step 3-verify the text	
		ForgotPassword forgotPassword=new ForgotPassword(driverTest);
		//Actual Result
		String actualMsg=forgotPassword.getTextMessage();
		if(actualMsg.equals("Please enter your email address or mobile number to search for your account."))
		{
			System.out.println("Msg is validated");
		}
		else
		{
			System.out.println("msg is Wrong");
		}
		
	//step 4-enter the emailid
		forgotPassword.enterEmailOrPhoneNumber("Priya");
		
	//step 5-click on search button
		forgotPassword.clickOnSearch();
		
		//Actual Result
		String actualTitle=driverTest.getTitle();
		String actualUrl=driverTest.getCurrentUrl();
		
		String expectedTitle="Forgotten Password | Can't Log In | Facebook";
		String expectedURL="https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0";
		if(actualTitle.equals(expectedTitle) && actualUrl.equals(expectedURL)) {
			System.out.println("test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}
	}

}
