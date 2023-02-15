package LinkedinProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {
	
	@FindBy (xpath="//input[@name='userName']")
	private WebElement emailOrPhone;
	
	@FindBy (xpath="//button[text()='Reset password']")
	private WebElement resetPasswordButton;
	
	@FindBy (xpath="//a[text()='Back']")
	private WebElement backButton;
	
	//Constructor
	public ForgotPasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Methods
	public void enterEmailOrPhone(String email) {
		emailOrPhone.sendKeys(email);
	}
	
	public void clickOnResetPasswordButton() {
		resetPasswordButton.click();
	}
	
	public void clickOnBackButton() {
		backButton.click();
	}

	public String getTextMessage() {
	
		String text=forgotMessage.getText();
		System.out.println(text);
		return text;
	}

}
