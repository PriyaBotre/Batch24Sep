package rediff.comProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage {
	
	@FindBy (xpath="//input[@name='name893f19ef']")
	private WebElement fullName;
	
	@FindBy (xpath="//input[@name='login893f19ef']")
	private WebElement chooseARediffMailId;
	
	@FindBy (xpath="//input[@name='passwd893f19ef']")
	private WebElement password;
	
	@FindBy (xpath="//input[@name='confirm_passwd893f19ef']")
	private WebElement retypePassword;
	

	@FindBy (xpath="//input[@name='altemail893f19ef']")
	private WebElement alternateEmailAddress;
	
	@FindBy (xpath="//input[@name='chk_altemail893f19ef']")
	private WebElement checkBox;
	
	@FindBy (xpath="//input[@id='mobno']")
	private WebElement mobNum;
	
	@FindBy (xpath="//select[@name='DOB_Day893f19ef']")
	private WebElement dayOfBirth;
	
	@FindBy (xpath="//select[@name='DOB_Month893f19ef']")
	private WebElement monthOfBirth;

   @FindBy (xpath="//select[@name='DOB_Year893f19ef']")
     private WebElement yearOfBirth;
   
   @FindBy (xpath="(//input[@name='gendera1a0b896'])[1]")
   private WebElement maleRadioButtion;
   
   @FindBy (xpath="(//input[@name='gendera1a0b896'])[2]")
   private WebElement femaleRadioButtion;
   
   @FindBy (xpath="//select[@id='country']")
   private WebElement countryName;
   
   @FindBy (xpath="//select[@name='citya1a0b896']")
   private WebElement cityName;
   
   public CreateAccountPage(WebDriver driver)
   {
	   PageFactory.initElements(driver,this);
   }
   
   public void sendFullName(String name) {
	   fullName.sendKeys(name);
   }
   
   public void enterRediffEmailId(String email) {
	   chooseARediffMailId.sendKeys(email);
   }
   
   public void sendPasswordName(String pass) {
	   password.sendKeys(pass);
   }
    
   public void sendRetypePasswordName(String pass) {
	   retypePassword.sendKeys(pass);
   }
   
   public void enterAlternateEmailAddress(String email) {
	   alternateEmailAddress.sendKeys(email);
   }
   
   public void clickOnCheckBox() {
	   checkBox.click();
   }
   
   public void enterMobNumber(String mob) {
	   mobNum.sendKeys(mob);
   }
   
   public void selectDayOfBirth(String name) {
	 //dayOfBirth.sendKeys(name);  
	   Select s=new Select(dayOfBirth);
	   s.selectByVisibleText("16");
   }
   
   public void selectMonthOfBirth(String nmae) {
	   Select s=new Select(monthOfBirth);
	   s.selectByVisibleText("MAY");
   }
   
   public void selectYearOfBirth(String name) {
	   Select s=new Select(yearOfBirth);
	   s.selectByVisibleText("1993");
   }
   
   public void selectMaleRadioButton() {
	   
   }
   
   public void selectFemaleRadioButton() {
	   
   }
   
   public void selectCountryName(String name) {
	   Select s=new Select(countryName);
	   s.selectByVisibleText("India");
   }
   
   public void selectCityName(String name) {
	   Select s=new Select(cityName);
	   s.selectByVisibleText("Pune");
   }
   
}