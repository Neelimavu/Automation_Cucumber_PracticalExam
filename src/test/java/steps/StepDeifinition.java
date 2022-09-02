package steps;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pages.LandingOnWebPage;
import pages.TestBasePage;

public class StepDeifinition extends TestBasePage{
LandingOnWebPage Page;
	
	@Before
	public void methodName() {
		initDriver();
		Page = PageFactory.initElements(driver, LandingOnWebPage.class);
		}
	@Given("^Set SkyBlue Background button exists$")
	public void set_skyblue_background_button_exists() {
		driver.get("https://techfios.com/test/101/");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@When("^User clicks on the Set SkyBlue Background button$")
	public void user_clicks_on_the_set_skyblue_background_button() {
		Page.clickOnSetSkyBlueBackground();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Then("^The background color will change to SkyBlue$") 
	public void the_background_color_will_change_to_skyblue() {
		String expectedTitle=driver.getTitle();
		String actualTitle=Page.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	
	
	@Given("^Set White Background button exists$")
	public void set_white_background_button_exists( ) {
		driver.get("https://techfios.com/test/101/");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@When("^I click on the Set White Background button$")
	public void i_click_on_the_set_white_background_button() {
		Page.clickOnSetWhiteBackground();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Then("^The background color will change to white$")
	public void the_background_color_will_change_to_white( ) {
		String expectedTitle=driver.getTitle();
		String actualTitle=Page.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
