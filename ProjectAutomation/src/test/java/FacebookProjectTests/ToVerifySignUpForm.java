package FacebookProjectTests;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import FacebookProject.LoginOrSignUpPage;
import FacebookProject.SignUpForm;

public class ToVerifySignUpForm {
	
	private WebDriver driver;
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("Before Class");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PRIYA\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
		driver.get("https://www.facebook.com/");
		LoginOrSignUpPage loginOrSignUpPage=new LoginOrSignUpPage(driver);
		
		loginOrSignUpPage.clickOnCreateNewAccButton();
	}
	
	@Test
	public void verifyTermsLinkOnSignUpFORM()
	{
		SignUpForm signUpForm=new SignUpForm(driver);
		signUpForm.clickOnTermsLink();
		
		ArrayList<String>addr=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(1));
		
		String expectedURL="https://www.facebook.com/legal/terms/update";
		String actualURL=driver.getCurrentUrl();
		
		if(expectedURL.equals(actualURL)) {
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}
    }
	
	@Test
	public void verifyPrivacyPolicyLinkOnSignUpFORM()
	{
		SignUpForm signUpForm=new SignUpForm(driver);
		signUpForm.clickOnTermsLink();
		
		ArrayList<String>addr=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(1));
		
		String expectedURL="https://www.facebook.com/privacy/policy/?entry_point=data_policy_redirect&entry=0";
		String actualURL=driver.getCurrentUrl();
		
		if(expectedURL.equals(actualURL)) {
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}
    }
	
	@Test
	public void verifySignUpFORM()
	{
		SignUpForm signUpForm=new SignUpForm(driver);
		signUpForm.sendFirstName("Priya");
		signUpForm.sendSurName("Botre");
		signUpForm.sendMobNumOrEmailAddress("priya@gmail.com");
		signUpForm.sendNewPassword("123#45ab");
		signUpForm.selectDayOfBirth("12");
		signUpForm.selectMonthOfBirth("Mar");
		signUpForm.selectYearOfBirth("2018");
		signUpForm.selectFemaleRadioButton();
		signUpForm.clickOnSubmitButton();
		
		String expectedURL="https://www.facebook.com/";
		String actualURL=driver.getCurrentUrl();
		
		if(expectedURL.equals(actualURL)) {
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}
		
	}
	
	@AfterMethod
	public void goBackToMainPage() {
		//driver.close();
		ArrayList<String>addr=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(0));
	}
	
	@AfterClass
	public void closeTheBrowser() {
		driver.quit();
	}
	
	
	
}