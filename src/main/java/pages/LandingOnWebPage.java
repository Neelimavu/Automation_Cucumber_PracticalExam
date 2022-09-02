package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LandingOnWebPage {

	
	WebDriver driver;
	public LandingOnWebPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"extra\"]/button[1]") WebElement SKYBLUEBACKGROUND_BUTTON;
	
	public void clickOnSetSkyBlueBackground() {
		SKYBLUEBACKGROUND_BUTTON.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@FindBy(how = How.XPATH, using ="//*[@id=\"extra\"]/button[2]") WebElement WHITEBACKGROUND_BUTTON;
	
	public void clickOnSetWhiteBackground( ) {
		WHITEBACKGROUND_BUTTON.click();
	}

	public String getTitle() {
		
		return driver.getTitle();
	}
}
