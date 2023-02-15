package SWAGLABSProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy (xpath="//input[@id='user-name']")
	private WebElement userName;
	
	@FindBy (xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy (xpath="//input[@id='login-button']")
	private WebElement loginButton;
	
	

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
		loginButton.click();
	}

}
