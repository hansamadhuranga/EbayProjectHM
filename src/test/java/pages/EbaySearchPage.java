package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EbaySearchPage {

	WebDriver driver = null;

	// Define Objects
	By serchtext = By.xpath("//input[@id='gh-ac']");
	By selectwallet = By.xpath("//span[contains(text(),'Mens RFID Blocking Soft Smooth Genuine Leather Wal')]");

	// Define Constructor
	public EbaySearchPage(WebDriver driver) {
		this.driver = driver;
	}

	// search the wallet
	public void walletSearchText(String text) {
		driver.findElement(serchtext).sendKeys(text);
	}
	//select wallet
	public void selectwallet( ) {
		driver.findElement(selectwallet).click();
	}
	
	
}
