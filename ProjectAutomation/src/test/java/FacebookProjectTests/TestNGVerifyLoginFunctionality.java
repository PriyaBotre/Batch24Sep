package FacebookProjectTests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
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
import base.Browser;
import utils.Utility;
                
public class TestNGVerifyLoginFunctionality extends Browser{
	                                       //new change
     private WebDriver driver;
	 private LoginOrSignUpPage loginOrSignUpPage;
	 String testID;
	@Parameters("browser01")
	@BeforeTest
	public void launchBrowser(String browser)
	{
		System.out.println("Before Test");
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
	public void createPOMObjects() {
		LoginOrSignUpPage loginOrSignUpPage=new LoginOrSignUpPage(driver);
		
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
		driver.get("https://www.facebook.com/");
		
		
	}
	
	@Test
	public void test1() throws EncryptedDocumentException, IOException
	{   
		testID="T101";
		LoginOrSignUpPage loginOrSignUpPage=new LoginOrSignUpPage(driver);
		loginOrSignUpPage.sendUserName(Utility.getDataFromExcelSheet("sheet1",1,0));
		loginOrSignUpPage.sendPasswordName(Utility.getDataFromExcelSheet("sheet1",1,1));
		loginOrSignUpPage.clickOnLoginButton();
		
		String actualURL="https://www.facebook.com/";
		String expectedURL="https://www.facebook.com/";
		
		SoftAssert soft=new SoftAssert();
		
		soft.assertEquals(actualURL, expectedURL,"Home Page URL is WRrong");
		
		soft.assertAll();
		
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
