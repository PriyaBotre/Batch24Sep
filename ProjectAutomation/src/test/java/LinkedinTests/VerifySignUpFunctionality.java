package LinkedinTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import LinkedinProject.SignUpPage;

public class VerifySignUpFunctionality {
	
	public static void main(String[] args) throws InterruptedException {
		
	//step 1-open browser & hit the URL	 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PRIYA\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driverTest = new ChromeDriver();
        driverTest.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driverTest.manage().window().maximize();
        driverTest.get("https://www.linkedin.com/login?");
      
    //step 2-enter the email id & password
        SignUpPage signUpPage=new SignUpPage(driverTest);
        signUpPage.sendEmailOrPhoneNumber("priya@gmail.com");
        signUpPage.sendPasswordName("abc#6543");
        
    //step 3-click on sign in button
        signUpPage.clickOnSignIn();
        
        Thread.sleep(1000);
        
   //step 4-Verify home page: URL & Title
		 //HomePagePOMClass object
		
		String actualTitle=driverTest.getTitle();
		String actualUrl=driverTest.getCurrentUrl();
		
		String expectedTitle="Verification Page";
		String expectedURL="https://www.linkedin.com/checkpoint";
		
		if(actualTitle.equals(expectedTitle) && actualUrl.equals(expectedURL)) {
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}
         
	}
	
	
	
	
	
	
	
}

	