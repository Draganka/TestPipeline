package com.G.P.Google.Pipeline;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleTest {
	
WebDriver driver;

	@Test
	public void google(){
		
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
		
		
	}
}
