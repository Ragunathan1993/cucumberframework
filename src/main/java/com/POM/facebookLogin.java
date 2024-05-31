package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebookLogin {
	 
		
	
	@FindBy(id = "email")
	private WebElement username;

	@FindBy(id = "pass")
	private WebElement password;

	@FindBy(name = "login")
	private WebElement login;
	
	

	
	public facebookLogin(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	//	driver2=driver;
	}

	public WebElement getUsername() {
		return username;

	}

	public WebElement getPassword() {
		return password;

	}

	public WebElement getLogin() {
		return username;

	}

}
