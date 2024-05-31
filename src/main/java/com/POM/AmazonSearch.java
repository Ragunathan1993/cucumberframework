package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import BaseClass.Base;


public class AmazonSearch extends Base{
	public static WebDriver driver;

	@FindBy(id = "twotabsearchtextbox")
	private WebElement SearchBox;

	@FindBy(id = "nav-search-submit-button")
	private WebElement SearchButton;

	@FindBy(xpath = "(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
	private WebElement SearchProduct1;

	@FindBy(xpath = "(//input[@id='add-to-cart-button'])[2]")
	private WebElement CartButton;

	@FindBy(xpath = "//input[@aria-labelledby='attach-sidesheet-view-cart-button-announce']")
	private WebElement AddCart;


	@FindBy(className = "s-no-outline")
	private WebElement InvalidName;

	@FindBy(xpath = "(//div[@class='a-row'])[1]")
	private WebElement NoResultMsg;
	

	// constructor
	public AmazonSearch(WebDriver driver1) {

		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}


	public WebElement getSearchBox() {
		return SearchBox;
	}


	public WebElement getSearchButton() {
		return SearchButton;
		
	}


	public WebElement getSearchProduct1() {
		return SearchProduct1;
	}


	public WebElement getCartButton() {
		return CartButton;
	}


	public WebElement getAddCart() {
		return AddCart;
	}


	public WebElement getInvalidName() {
		return InvalidName;
	}


	public WebElement getNoResultMsg() {
		return NoResultMsg;
	}

	
	
	
//	public void searchProduct1(){
//		
//		implicitwait(30);
//		ClickOnElement(driver, SearchBox);
//		inputValues(driver, SearchBox, 10, "pixel 8 pro");
//		ClickOnElement(driver, SearchButton);
//		ClickOnElement(driver, SearchProduct1);
//		staticwait(10000);
//		windowHandler(1);
//		JSScrollBy(900);
//		JSFindElement(CartButton);
//		staticwait(5000);
//		ClickOnElement(driver, AddCart);
//		
//		String title = driver.getTitle();
//	     Assert.assertEquals(title, "Amazon.in Shopping Cart");
//	     closeTab();
//	     windowHandler(0);
//	}
//	public void searchProduct2(){
//		implicitwait(30);
//		ClickOnElement(driver, SearchBox);
//		clearText(SearchBox);
//		inputValues(driver, SearchBox, 10, "oppo 5g mobile phone");
//		ClickOnElement(driver, SearchButton);
//		ClickOnElement(driver, SearchProduct1);
//		staticwait(5000);
//		windowHandler(1);
//		JSScrollBy(900);
//		JSFindElement(CartButton);
//		staticwait(5000);
//		ClickOnElement(driver, AddCart);
//		
//		String title = driver.getTitle();
//	     org.testng.Assert.assertEquals(title, "Amazon.in Shopping Cart");
//	     closeTab();
//	     windowHandler(0);
//	
//	}
//	public void searchProduct3(){
//		implicitwait(30);
//		ClickOnElement(driver, SearchBox);
//		clearText(SearchBox);
//		inputValues(driver, SearchBox, 10, "lenovo ideapad slim 3");
//		ClickOnElement(driver, SearchButton);
//		ClickOnElement(driver, SearchProduct1);
//		staticwait(5000);
//		windowHandler(1);
//		JSScrollBy(900);
//		JSFindElement(CartButton);
//		staticwait(5000);
//		ClickOnElement(driver, AddCart);
//		
//		String title = driver.getTitle();
//	     Assert.assertEquals(title, "Amazon.in Shopping Cart");
//	     closeTab();
//	     windowHandler(0);
//		
//	}
//	
//	public void searchWithInvalidName() {
//		implicitwait(30);
//		
//		ClickOnElement(driver, SearchBox);
//		clearText(SearchBox);
//		inputValues(driver, SearchBox, 10, "qwertgdseryqwedsawfg");
//		ClickOnElement(driver, SearchButton);
//		Assert.assertEquals(NoResultMsg.getText(), "No results for qwertgdseryqwedsawfg");
//
//	}
//
	
	
	
	
}
