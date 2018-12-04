package com.Google.Pipeline;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddItemToCartTest {

	WebDriver driver;

	@Test
	public void google() throws InterruptedException{
		
	 System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriverNew.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("http://www.automationpractice.com");
		
	  assertTrue(driver
				.findElement(Page.womenButton).isDisplayed());
		
		Page gp = new Page(driver);
		gp.clickSearchBar();
		gp.enterValueInSearchBar();
		
		assertTrue(driver
				.findElement(Page.searchAssertion).isDisplayed());
	
		
		gp.clickOnDress();
		Thread.sleep(3000);
		gp.clickAddToCart();
		
		Thread.sleep(3000);
		assertEquals(driver
				.findElement(Page.successfullyAdded).getText(), "Product successfully added to your shopping cart");
		
		
	}
	
}
