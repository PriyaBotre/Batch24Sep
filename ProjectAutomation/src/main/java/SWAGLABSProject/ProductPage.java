package SWAGLABSProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
	@FindBy (xpath="//div[text()='Sauce Labs Backpack']")
	private WebElement productName;
	
	@FindBy (xpath="//div[@class='inventory_details_price']")
	private WebElement priceTab;
	
	@FindBy (xpath="//button[text()='Add to cart']")
	private WebElement addToCartTab;
	
	@FindBy (xpath="//a[@class='shopping_cart_link']")
	private WebElement shoppingCartLink;
	
	@FindBy (xpath="//button[@id='back-to-products']")
	private WebElement backToProductButton;
	
	//Constructor
	public ProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Methods
	public void bagName() {
		productName.click();
	}
	
	public void priceTab() {
		priceTab.getText();
	
	}
	
	public void clickOnaddToCartTab() {
		addToCartTab.click();
	}
	
	public void clickOnshoppingcartLink() {
		shoppingCartLink.click();
	}
	
	public void clickOnbackToProductButton() {
		backToProductButton.click();
	}

}
