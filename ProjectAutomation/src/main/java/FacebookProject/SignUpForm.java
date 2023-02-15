package FacebookProject;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpForm {
	
	private WebDriver driverG;
	
	private Actions act;
	
	private WebDriverWait wait;
	
	@FindBy (xpath= " (//input[@type='text'])[2]")
	private WebElement firstName;
	
	@FindBy (xpath="(//input[@type='text'])[3]")
	private WebElement surName;
	
	@FindBy (xpath="//input[@name='reg_email__']")
	private WebElement mobNumOrEmailAddress;
	
	@FindBy (xpath="(//input[@type='password'])[2]")
	private WebElement newPassword;
	
	@FindBy (xpath="//select[@id='day']")
	private WebElement dayOfBirth;
	
	@FindBy (xpath="//select[@id='month']")
	private WebElement monthOfBirth;
	
	@FindBy (xpath="//select[@id='year']")
	private WebElement yearOfBirth;
	
	@FindBy (xpath="//label[text()='Female']")
	private WebElement femaleRadioButton;
	
	@FindBy (xpath="//label[text()='Male']")
	private WebElement maleRadioButton;
	
	@FindBy (xpath="//label[text()='Custom']")
	private WebElement customRadioButton;
	
	@FindBy (xpath="(//button[text()='Sign Up'])[1]")
	private WebElement submitButton;
	
	@FindBy (xpath="common xpath")
	private List<WebElement>links;
	
	@FindBy (xpath="(//a[text()='Terms'])[2]")
	private WebElement termsLink;
	
	@FindBy (xpath="(//a[text()='Privacy Policy'])[2]")
	private WebElement privacyPolicyLink;
	
	@FindBy (xpath="//a[text()='Cookies Policy']")
	private WebElement cookiesPolicyLink;
	

	public SignUpForm(WebDriver driver)  //driver=driverTest=new ChromeDriver()
	  {
		 PageFactory.initElements(driver,this); 
		 this.driverG=driver;  //initilize the global driver
		 act=new Actions(driver);
	  }
	//scenario 2=Waiting for both element is same
	public void sendFirstName(String name) {
		//WebDriverWait wait =new WebDriverWait(driverG,20);
		////wait.until(ExpectedConditions.visibilityOf(firstName));
		firstName.sendKeys(name);
	}
	public void sendSurName(String name) {
		//WebDriverWait wait=new WebDriverWait(driverG,20);
		////wait.until(ExpectedConditions.visibilityOf(surName));
		surName.sendKeys(name);
	}
	public void sendMobNumOrEmailAddress(String emailOrPhone) {
		mobNumOrEmailAddress.sendKeys(emailOrPhone);
		////JavascriptExecutor js=(JavascriptExecutor)driverG;
		////js.executeAsyncScript("argument[0].scrollIntoView(true);",mobNumOrEmailAddress);
	}
	public void sendNewPassword(String pass) {
		newPassword.sendKeys(pass);
	}
	public void selectDayOfBirth(String name) {
		//dayOfBirth.sendKeys(name);
		Select s=new Select(dayOfBirth);
		s.selectByVisibleText("15");
	}
	public void selectMonthOfBirth(String name) {
		//dayOfBirth.sendKeys(name);
		Select s=new Select(monthOfBirth);
		s.selectByVisibleText("Apr");
	}
	public void selectYearOfBirth(String name) {
		//dayOfBirth.sendKeys(name);
		Select s=new Select(yearOfBirth);
		s.selectByVisibleText("2022");
	}
	public void selectFemaleRadioButton() {
		femaleRadioButton.click();
	}
	public void selectMaleRadioButton() {
		maleRadioButton.click();
	}
	public void selectCustomRadioButton() {
		//customRadioButton.click();
		//Actions act=new Actions(driverG);
		act.moveToElement(customRadioButton).click().build().perform();
	}
	public void clickOnSubmitButton() {
		//submitButton.click();
		//Actions act=new Actions(driverG);
		act.moveToElement(submitButton).click().build().perform();
	}
	

	public void clickOnTermsLink() {
		termsLink.click();
	}
	
	public void clickOnPrivacyPilicyLink() {
		privacyPolicyLink.click();
	}
	
	public void clickOnCookiesPolicyLink() {
		cookiesPolicyLink.click();
	}
}
  