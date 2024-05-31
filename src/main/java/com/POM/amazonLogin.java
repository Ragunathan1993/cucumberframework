package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Base;

public class amazonLogin extends Base{
	
	
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSigninbtn() {
		return signinbtn;
	}
	public WebElement getEmailId() {
		return emailId;
	}
	public WebElement getContnuBtn() {
		return contnuBtn;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSignBtn1() {
		return signBtn1;
	}




//	public WebElement getEmailError() {
//		return emailError;
//	}
//
//
//
//
//	public WebElement getEmptyEmail() {
//		return emptyEmail;
//	}
//
//
//
//
//	public WebElement getEmptyPassword() {
//		return emptyPassword;
//	}




	@FindBy(id="nav-link-accountList")
	private WebElement  signinbtn;

	@FindBy(name="email")
	private WebElement  emailId;

	@FindBy(id="continue")
	private WebElement contnuBtn;

	@FindBy(name="password")
	private WebElement password;

	@FindBy(id="signInSubmit")
	private WebElement signBtn1;

//	@FindBy(xpath="//span[@class='a-list-item']")
//	private WebElement emailError;
//
//	@FindBy(xpath="//div[contains(text(),'Enter your email or')]")
//	private WebElement emptyEmail;	
//
//	
//	@FindBy(xpath="//div[contains(text(),'Enter your password')]")
//	private WebElement emptyPassword;	

	
	
	
	public amazonLogin(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
	}

}


