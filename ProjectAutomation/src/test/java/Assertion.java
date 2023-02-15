import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertion {
	//HARD ASSERT
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PRIYA\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    driver.get("https://www.amazon.in/");
	    
	    String actualTitle=driver.getTitle();
	    String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	    
	    Assert.assertEquals(actualTitle, expectedTitle,"Home Page Title is Wrong");
	    
	    String actualURL=driver.getCurrentUrl();
	    String expectedURL="https://www.amazon.in/home";
	    Assert.assertNotEquals(actualURL, expectedURL,"home page URL is correct");
	    
	    boolean result=actualTitle.equals(expectedTitle);
	    Assert.assertTrue(result,"title is wrong");
	    
	     boolean result1=actualURL.equals(expectedURL);
	     Assert.assertFalse(result,"url is right");
	     
	     Assert.fail();   //Forcefully fail the test case
	    
	    if(result ==false)
	    {
	    	Assert.fail();
	    }
	    
	}

}
