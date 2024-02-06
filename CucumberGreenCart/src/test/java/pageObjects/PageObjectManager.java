package pageObjects;

import org.openqa.selenium.WebDriver;
// In this we are creating all objects for all the page object files 
public class PageObjectManager 
{
	public LandingPage landingPage;
	public OffersPage offersPage;
	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}

	public LandingPage getLandingPage()
	{
		landingPage=new LandingPage(driver);
		return landingPage;
	}
	public OffersPage getOffersPage()
	{
		offersPage =new OffersPage(driver);
		return offersPage;
	}
}
