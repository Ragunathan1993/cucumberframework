package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import BaseClass.Base;

public class AmazonPayment extends Base {
	public static WebDriver driver;

	@FindBy(id = "nav-cart-count")
	private WebElement cartPage;

	@FindBy(name = "proceedToRetailCheckout")
	private WebElement proceedToPay;

	@FindBy(xpath = "//input[@data-testid='Address_selectShipToThisAddress']")
	private WebElement UseThisAddress;

	@FindBy(xpath = "(//input[@type='radio'])[1]")
	private WebElement PaymentMethod;

	@FindBy(xpath = "(//a[contains(text(),'Enter card details')])[1]")
	private WebElement EnterCardDetails;

	@FindBy(name = "addCreditCardNumber")
	private WebElement CardNumber;

	@FindBy(xpath = "//input[@name='ppw-widgetEvent:AddCreditCardEvent']")
	private WebElement ClickEnter;

	@FindBy(xpath = "//h4[@class='a-alert-heading']")
	private WebElement ErrorMessage;
	
	
	
	//constructor
	public AmazonPayment(WebDriver driver1) {

		this.driver = driver1;
		PageFactory.initElements(driver, this);
	
	}
	
	public WebElement getCartPage() {
		return cartPage;
	}
	public WebElement getProceedToPay() {
		return proceedToPay;
	}
	public WebElement getUseThisAddress() {
		return UseThisAddress;
	}
	public WebElement getPaymentMethod() {
		return PaymentMethod;
	}
	public WebElement getEnterCardDetails() {
		return EnterCardDetails;
	}
	public WebElement getCardNumber() {
		return CardNumber;
	}
	public WebElement getClickEnter() {
		return ClickEnter;
	}
	public WebElement getErrorMessage() {
		return ErrorMessage;
	}
	
	
//public void proceedPayment(){
//		
//		implicitwait(30);
//		JSFindElement(cartPage);
//		ClickOnElement(driver, cartPage);
//		ClickOnElement(driver, proceedToPay);
//		ClickOnElement(driver, UseThisAddress);
//		staticwait(5000);
//		ClickOnElement(driver, PaymentMethod);
//		ClickOnElement(driver, EnterCardDetails);
//		staticwait(5000);
//		frameByIndex(0);
//		inputValues(driver, CardNumber, 30,"4546 5155 45");
//		ClickOnElement(driver, ClickEnter);
//		Assert.assertEquals(ErrorMessage.getText(), "There was a problem.");
//			
//	}

	
}
