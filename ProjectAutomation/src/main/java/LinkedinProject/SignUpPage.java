package LinkedinProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	@FindBy (xpath="//a[@data-tracking-control-name='guest_homepage-basic_nav-header-signin']")
	private WebElement signInButton;
	
	@FindBy (xpath="//input[@id='username']")
	private WebElement emailOrPhoneNumber;
	
	@FindBy (xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy (xpath="//a[text()='Forgot password?']")
	private WebElement forgotPasswordLink;
	
	@FindBy (xpath="//button[text()='Sign in']")
	private WebElement signIn;
	
	@FindBy (xpath="//span[text()='Sign in with Google']")
	private WebElement signInWithGoogle;
	
	//constructor
	public SignUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Methods
	public void clickOnSignInButton() {
		signInButton.click();
	}
	public void sendEmailOrPhoneNumber(String email) {
		emailOrPhoneNumber.sendKeys(email);
	}
	
	public void sendPasswordName(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickOnForgotPasswordLink() {
		forgotPasswordLink.click();
	}
	
	public void clickOnSignIn() {
		signIn.click();
	}
	
	public void clickOnSignInWithGoogleButton() {
		signInWithGoogle.click();
	}

}
