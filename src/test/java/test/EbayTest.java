package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.EbaySearchPage;
import pages.GoogleSearchPage;

public class EbayTest {
	WebDriver driver = null;	
	
	
	@BeforeTest	
	public void testSetup() {
	System.setProperty("webdriver.chrome.driver","E:\\Ebay\\TestHM\\drivers\\chromedriver.exe");	
	driver = new ChromeDriver();	
	}	
		

	@Test	
	public void googleSearchTest() {
		driver.get("https://www.google.com/");
		GoogleSearchPage GoogleSearchPageOBJ = new GoogleSearchPage(driver);
		GoogleSearchPageOBJ.googleSearchText("Ebay");
		GoogleSearchPageOBJ.clickebaylink();

	}
	@Test
	public void ebaySearch() {
		EbaySearchPage EbaySearchPageOBJ = new EbaySearchPage(driver);
		EbaySearchPageOBJ.walletSearchText("Men's Leather Wallets");
		EbaySearchPageOBJ.selectwallet();
		
		
	}


	@BeforeTest	
	public void tearDown() {
	driver.quit();

		
	}
	
}
