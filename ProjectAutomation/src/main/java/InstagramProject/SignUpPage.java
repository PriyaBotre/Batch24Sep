package InstagramProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	
	@FindBy (xpath="//input[@aria-label='Mobile Number or Email']")
	private WebElement mobNumOrEmail;
	
	@FindBy (xpath="//input[@aria-label='Full Name']")
	private WebElement fullName;
	
	@FindBy (xpath="//input[@aria-label='Username']")
	private WebElement userName;
	
	@FindBy (xpath="//input[@aria-label='Password']")
	private WebElement password;
	
	@FindBy (xpath="//button[text()='Sign up']")
	private WebElement signUpButton;
	
	@FindBy (xpath="//a[text()='Learn More']")
	private WebElement learnMoreLink;
	
	@FindBy (xpath="//a[text()='Terms']")
	private WebElement termsLink;
	
	@FindBy (xpath="//a[text()='Privacy Policy']")
	private WebElement privacyPolicyLink;
	
	@FindBy (xpath="//a[text()='Cookies Policy']")
	private WebElement cookiesPolicyLink;
	
	//Constructor
	public SignUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Methods
	public void enterMobNumOrEmail(String email) {
		mobNumOrEmail.sendKeys(email);
	}
	
	public void sendFullName(String fname) {
		fullName.sendKeys(fname);
	}
	
	public void sendUserName(String user) {
		userName.sendKeys(user);
	}
	
	public void sendPasswordName(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickOnSignUpButton() {
		signUpButton.click();
	}
	
	public void clockOnLearnMoreLink() {
		learnMoreLink.click();
	}
	
	public void clickOnTermsLink() {
		termsLink.click();
	}
	
	public void clickOnPrivacyPolicyLink() {
		privacyPolicyLink.click();
	}
	
	public void clickOnCookiesPolicyLink() {
		cookiesPolicyLink.click();
	}

}
