package LinkedinTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import FacebookProject.LoginOrSignUpPage;
import LinkedinProject.ForgotPasswordPage;
import LinkedinProject.SignUpPage;

public class VerifyForgotPasswordFunctionality {
	public static void main(String[] args) {
		//step 1-open browser & hit the URL	 
				System.setProperty("webdriver.chrome.driver","C:\\Users\\PRIYA\\Downloads\\chromedriver_win32\\chromedriver.exe");
		        WebDriver driverTest = new ChromeDriver();
		        driverTest.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		        driverTest.manage().window().maximize();
		        driverTest.get("https://www.linkedin.com/login?");
		        
	  //step 2-click on forgot password link	
				SignUpPage signUpPage=new SignUpPage(driverTest);
				signUpPage.clickOnForgotPasswordLink();
				
	  //step 3-	verify the text
				ForgotPasswordPage forgotPasswordPage=new ForgotPasswordPage(driverTest);
				String actualMsg=forgotPasswordPage.getTextMessage();
				if(actualMsg.equals("Reset password in two quick steps"))
				{
					System.out.println("msg is validated");
				}
				else
				{
					System.out.println("msg is wrong");
				}
    //step 4-enter the email id
				forgotPasswordPage.enterEmailOrPhone("Priya");

	//step 5-click on reset password button
				forgotPasswordPage.clickOnResetPasswordButton();
			        
		
	}

}
