package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {

WebDriver driver = null;

//Define Objects
By serchtext = By.id("btnk");
By clickebay = By.xpath("//h3[contains(text(),'eBay: Electronics, Cars, Fashion, Collectibles & M')]");

//Define Constructor
public GoogleSearchPage (WebDriver driver) {
	this.driver=driver;
}
	
//Define functions for the objects 	
public void googleSearchText(String text) {
	driver.findElement(serchtext).sendKeys(text);
	
}	
//click ebay link
public void clickebaylink() {
	driver.findElement(clickebay).click();	
}	



}
