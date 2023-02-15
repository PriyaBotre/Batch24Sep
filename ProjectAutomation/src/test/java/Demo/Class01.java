package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class01 {
	
		WebDriver driver;
		@Parameters("browser1")
		@BeforeMethod
		public void init(String browser) {

			System.out.println("Before Test");
			if(browser.equals("Chrome"))
			{	
				System.setProperty("webdriver.chrome.driver","C:\\Users\\PRIYA\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			 driver=new ChromeDriver();
			}
		
			if(browser.equals("Edge"))
			{
				System.setProperty("webdriver.edge.driver","C:\\Users\\PRIYA\\Downloads\\edgedriver_win64\\msedgedriver.exe");
				 driver=new EdgeDriver();
			}
				
				driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			    driver.manage().window().maximize();
		}
		
		@Test
		public void verifyPageTitle() {
			driver.get("https://www.google.com");
			Assert.assertEquals(driver.getTitle(),"Google");
		}
		
		@Test
		public void verifyPageTitle2() {
			driver.get("https://www.google.com");
			Assert.assertEquals(driver.getTitle(),"Google");
		}
		
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}

	}



