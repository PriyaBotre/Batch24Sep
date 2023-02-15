import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Assertion1 {
	
public static void main(String[] args) {
		   //SOFT ASSERT
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PRIYA\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    driver.get("https://www.amazon.in/");
	    
	    SoftAssert soft=new SoftAssert();
	    String actualTitle=driver.getTitle();
	    String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	    soft.assertEquals(actualTitle, expectedTitle,"Home Page Title is Wrong");
	    
	    String actualURL=driver.getCurrentUrl();
	    String expectedURL="https://www.amazon.in/home";
	    soft.assertNotEquals(actualURL, expectedURL,"home page URL is correct");
	    
	    boolean result=actualTitle.equals(expectedTitle);
	    soft.assertTrue(result,"title is wrong");
	    
	    boolean result1=actualURL.equals(expectedURL);
	    soft.assertFalse(result1,"url is right");
	    
	    soft.fail();  //Forcefully fail the test case
	    
	    if(result1==true)
	    {
	    	soft.fail();
	    }
	    
	    //to apply the results on test method
	    soft.assertAll();  
	    
	}


}
