package com.G.P.Google.Pipeline;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoogleTest {
	
WebDriver driver;

	@Test
	public void alo (){
		
	 System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriverNew.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("http://www.google.com");
		
		
		GooglePage gp = new GooglePage(driver);
		gp.clickSearchBar();
		gp.enterValueInSearchBar();
		
		assertTrue(driver
				.findElement(GooglePage.resultsPage).isDisplayed());
		
		
		assertTrue(driver
				.findElement(GooglePage.googleLogo).isDisplayed());
		
	}
}
