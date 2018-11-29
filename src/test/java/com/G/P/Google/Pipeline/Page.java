package com.G.P.Google.Pipeline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page {
	
	WebDriver driver;
	
	public static By womenButton = By.xpath(".//*[@id='block_top_menu']/ul/li[1]/a");
	public static By searchBox = By.id("search_query_top");
	public static By searchAssertion = By.xpath(".//*[@id='center_column']/h1/span[1]");

	public Page(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void clickSearchBar(){
		driver.findElement(searchBox).click();
	}
	

	public void enterValueInSearchBar(){
		driver.findElement(searchBox).sendKeys("casual dresses" + "\n");
	}
	
	
	
}
