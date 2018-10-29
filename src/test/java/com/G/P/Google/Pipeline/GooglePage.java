package com.G.P.Google.Pipeline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage {
	
	WebDriver driver;
	
	By searchBar = By.id("lst-ib");
	public static By resultsPage = By.id("rso");
	public static By googleLogo = By.id("logocont");

	public GooglePage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void clickSearchBar(){
		driver.findElement(searchBar).click();
	}
	

	public void enterValueInSearchBar(){
		driver.findElement(searchBar).sendKeys("Google" + "\n");
	}
	
	
	
}
