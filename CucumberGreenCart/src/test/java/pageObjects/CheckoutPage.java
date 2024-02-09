package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage 
{
	public WebDriver driver;

	public CheckoutPage


	(WebDriver driver)
	{
		this.driver=driver;
	}
	By cartBag=By.cssSelector("img[alt='Cart']");	
	By checkoutButton=By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	By promoButton=By.cssSelector(".promoBtn");
	By placeOrder=By.xpath("//button[contains(text(),'Place Order')]");

	public void CheckoutItems()
	{
		driver.findElement(cartBag).click();
		driver.findElement(checkoutButton).click();	
	}

	public Boolean verifyPromoBtn()
	{
		return driver.findElement(placeOrder).isDisplayed();
	}

	public Boolean verifyPlaceOrder()
	{
		return driver.findElement(placeOrder).isDisplayed();
	}
}
