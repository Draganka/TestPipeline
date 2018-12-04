package com.Google.Pipeline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page {
	
	WebDriver driver;
	
	//locators for search dress
	public static By womenButton = By.xpath(".//*[@id='block_top_menu']/ul/li[1]/a");
	public static By searchBox = By.id("search_query_top");
	public static By searchAssertion = By.xpath(".//*[@id='center_column']/h1/span[1]");
	
	//locators for add to cart test
	public static By clickOnDress = By.xpath(".//*[@id='center_column']/ul/li[1]/div/div[2]/h5/a");
	public static By addToCartBtn = By.xpath(".//*[@id='add_to_cart']/button");
	public static By successfullyAdded = By.xpath(".//*[@id='layer_cart']/div[1]/div[1]/h2");
	
	//locators for proceed to checkout
	public static By closeWindow = By.xpath(".//*[@id='layer_cart']/div[1]/div[1]/span");
	public static By yourLogoBtn = By.xpath(".//*[@id='header_logo']/a/img"); 
	public static By homeCartBtn = By.xpath(".//*[@id='header']/div[3]/div/div/div[3]/div/a");
	public static By proceedToCheckoutBtn = By.xpath(".//*[@id='center_column']/p[2]/a[1]/span");
	public static By createAccountBtn = By.id("SubmitCreate");
	public static By signInBtn = By.id("SubmitLogin");
	

	public Page(WebDriver driver) {
		this.driver = driver;
	}
	
	//methods for search dress
	public void clickSearchBar(){
		driver.findElement(searchBox).click();
	}

	public void enterValueInSearchBar(){
		driver.findElement(searchBox).sendKeys("casual dresses" + "\n");
	}

	//methods for add to cart
	public void clickOnDress(){
		driver.findElement(clickOnDress).click();
	}
	
	public void clickAddToCart(){
		driver.findElement(addToCartBtn).click();
	}
	
	//methods to proceed to checkout
	public void closeWindow(){
		driver.findElement(closeWindow).click();
	}
	
	public void clickYourLogo(){
		driver.findElement(yourLogoBtn).click();
	}
	
	public void clickCartOnHome(){
		driver.findElement(homeCartBtn).click();
	}
	
	public void clickProceedToCheckout(){
		driver.findElement(proceedToCheckoutBtn).click();
	}
	
	
}
