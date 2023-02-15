package FacebookProjectTests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import FacebookProject.LoginOrSignUpPage;
import FacebookProject.SignUpForm;
import base.Browser;
import utils.Utility;

public class TestNGVerifySignUpForm extends Browser{
	
	
	private WebDriver driver;
	private LoginOrSignUpPage loginOrSignUpPage;
	private SignUpForm signUpForm;
	String testID;
	@Parameters("browser01")
	@BeforeTest
	public void launchBrowser(String browser)
	{
		if(browser.equals("Chrome"))
		{	
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\PRIYA\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    //driver=new ChromeDriver();
			driver=openChromeBrowser();
		}
		
		if(browser.equals("Edge"))
		{
			//System.setProperty("webdriver.edge.driver","C:\\Users\\PRIYA\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			// driver=new EdgeDriver();
			driver=openEdgeBrowser();
		}
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@BeforeClass
	public void createPOMObject() {
		
		LoginOrSignUpPage loginOrSignUpPage=new LoginOrSignUpPage(driver);
		SignUpForm signUpForm=new SignUpForm(driver);
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
	{    testID="T201";
		SignUpForm signUpForm=new SignUpForm(driver);
		signUpForm.clickOnTermsLink();
		
		ArrayList<String>addr=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(1));
		
		String expectedURL="https://www.facebook.com/legal/terms/update";
		String actualURL=driver.getCurrentUrl();
		

		SoftAssert soft=new SoftAssert();
		
		soft.assertEquals(actualURL, expectedURL,"TermsLink Page URL is WRrong");
		
		soft.assertAll();
    }
	
	@Test
	public void verifyPrivacyPolicyLinkOnSignUpFORM()
	{    testID="T202";
		SignUpForm signUpForm=new SignUpForm(driver);
		signUpForm.clickOnTermsLink();
		
		ArrayList<String>addr=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(1));
		
		String expectedURL="https://www.facebook.com/privacy/policy/?entry_point=data_policy_redirect&entry=0";
		String actualURL=driver.getCurrentUrl();
		

		SoftAssert soft=new SoftAssert();
		
		soft.assertNotEquals(actualURL, expectedURL,"PrivacyPolicy Page URL is Right");
		
		soft.assertAll();
    }
	
	@Test
	public void verifySignUpFORM() throws EncryptedDocumentException, IOException
	{    testID="T203";
		SignUpForm signUpForm=new SignUpForm(driver);
		signUpForm.sendFirstName(Utility.getDataFromExcelSheet("sheet1",2,2));
		signUpForm.sendSurName(Utility.getDataFromExcelSheet("sheet1",2,3));
		signUpForm.sendMobNumOrEmailAddress(Utility.getDataFromExcelSheet("sheet1",2,4));
		signUpForm.sendNewPassword(Utility.getDataFromExcelSheet("sheet1",2,1));
		signUpForm.selectDayOfBirth("12");
		signUpForm.selectMonthOfBirth("Mar");
		signUpForm.selectYearOfBirth("2018");
		signUpForm.selectFemaleRadioButton();
		signUpForm.clickOnSubmitButton();
		
		String expectedURL="https://www.facebook.com/";
		String actualURL=driver.getCurrentUrl();
		
		Assert.assertEquals(actualURL,expectedURL,"SignUpForm Page URL is Wrong");
		
	}
	
	@AfterMethod
	public void goBackToMainPage(ITestResult result) throws IOException {
		//driver.close();
		if(ITestResult.FAILURE==result.getStatus())
		{
			Utility.captureScreenshot(driver, testID);
		}
		ArrayList<String>addr=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(0));
	}
	
	@AfterClass
	public void closeTheBrowser() {
		driver.quit();
	}
	
	

}
