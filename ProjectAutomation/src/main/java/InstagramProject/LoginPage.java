package InstagramProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy (xpath="//input[@aria-label='Phone number, username, or email']")
	private WebElement userName;
	
	@FindBy (xpath="//input[@aria-label='Password']")
	private WebElement password;
	
	@FindBy (xpath="//button[@type='submit']")
	private WebElement logInButton;
	
	@FindBy (xpath="//span[text()='Log in with Facebook']")
	private WebElement loginWithFacebook;
	
	@FindBy (xpath="//a[text()='Forgot password?']")
	private WebElement forgotPasswordLink;
	
	@FindBy (xpath="//span[text()='Sign up']")
	private WebElement signUpButtonLink;
	
	//Constructor
		public LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		//Methods
		public void sendUserName(String user) {
			userName.sendKeys(user);
		}
		
		public void sendPasswordName(String pass) {
			password.sendKeys(pass);
		}
		
		public void clickOnLoginButton() {
			logInButton.click();
		}
		
		public void openFacebookPage() {
			loginWithFacebook.click();
		}
		
		public void clickOnForgotPasswordLink() {
			forgotPasswordLink.click();
		}
		
		public void clickOnSignUpButtonLink() {
			signUpButtonLink.click();
		}

}
