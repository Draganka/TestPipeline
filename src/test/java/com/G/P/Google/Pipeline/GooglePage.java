package com.G.P.Google.Pipeline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage {
	
	WebDriver driver;
	
	public static By searchBar = By.xpath(".//*[@id='tsf']/div[2]/div/div[1]/div/div[1]/input");
	public static By resultsPage = By.id("rso");
	public static By googleLogo = By.id("logo");

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
