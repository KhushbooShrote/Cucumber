package stepDefinitions;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CheckoutPage;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class CheckoutPageStepDefinition 
{
	public WebDriver driver;
	public String landingPageProductName;
	public String offerPageProductName;
	TestContextSetup testContextSetup;
	public CheckoutPage checkoutPage;
	public String checkoutPageProductName;
	
		public CheckoutPageStepDefinition(TestContextSetup testContextSetup)
		{
			this.testContextSetup=testContextSetup;
			checkoutPage=testContextSetup.pageObjectManager.getcheckoutPage();
		}
		
		@Then("verify user has ability to enter promo code and place the order")
		public void verify_user_has_ability_to_enter_promo_code_and_place_the_order()
		{
			Assert.assertTrue(checkoutPage.verifyPromoBtn());
			Assert.assertTrue(checkoutPage.verifyPlaceOrder());
		}
		@Then("^user proceeds to checkout and validate the (.+) items in checkout page$")
		public void user_proceeds_to_checkout_and_validate_the_items_in_checkout_page()
		{
			checkoutPage.CheckoutItems();	
			//Assertion to extract name from screen and compare with name
			Assert.assertEquals(offerPageProductName,testContextSetup.landingPageProductName );
		}
		
}
