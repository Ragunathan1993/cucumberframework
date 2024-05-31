package com.StepDef;

import com.POM.AmazonPayment;
import com.POM.AmazonSearch;
import com.POM.amazonLogin;

import BaseClass.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonStepDef extends Base{
	
	
	amazonLogin al= new amazonLogin(driver);
	
	@Given("User Landed on The Amazon Page")
	public void userLandedOnTheAmazonPage() {
	launchUrl(driver, "https://www.amazon.in/");
	    
	}
	@When("User Enter The SignInButton And Navigate The LoginPage")
	public void userEnterTheSignInButtonAndNavigateTheLoginPage() {
	   ClickOnElement(driver,al.getSigninbtn() );
	}
	@When("User Enter The User Name In User Name Box {string}")
	public void userEnterTheUserNameInUserNameBox(String username) {
	    inputValues(driver, al.getEmailId(), 0, username);
	}
	@When("User Enter The Continue Button")
	public void userEnterTheContinueButton() {
		ClickOnElement(driver,al.getContnuBtn());
	    	}
	@When("User Enter The User Password In User Name Box {string}")
	public void userEnterTheUserPasswordInUserNameBox(String password) {
	    inputValues(driver,al.getPassword() , 0, password);
	}
	@When("User Click The SignIn Button And Move The HomePage")
	public void userClickTheSignInButtonAndMoveTheHomePage() {
		ClickOnElement(driver, al.getSignBtn1());
	    
	}
	@Then("User Landed On The Amazon Homepage")
	public void userLandedOnTheAmazonHomepage() {
	    System.out.println("User succesfully Amazon HomePage Landed");
	}
	
	AmazonSearch as= new AmazonSearch(driver);
	
	@When("User Enter The Product Name In Search Box {string}")
	public void userEnterTheProductNameInSearchBox(String product) {
		clearText(as.getSearchBox());
		inputValues(driver, as.getSearchBox(), 0, product);
	    	}
	@When("User Click The Search Button")
	public void userClickTheSearchButton() {
	    ClickOnElement(driver,as.getSearchButton());
	}
	@Then("User Click The Product Name And Navigate The New Window")
	public void userClickTheProductNameAndNavigateTheNewWindow() {
	    ClickOnElement(driver, as.getSearchProduct1());
	    staticwait(5000);
	    windowHandler(1);
	    staticwait(5000);
	}
	
	
	@Then("User Click The Add to Cart Button And Navigate To The PopUp Page")
	public void userClickTheAddToCartButtonAndNavigateToThePopUpPage() {
		 JSFindElement(as.getCartButton());
		 staticwait(5000);
		ClickOnElement(driver, as.getAddCart());
		staticwait(5000);
		closeTab();
		windowHandler(0);
	    
	}
	@Then("User Landed In CartPage")
	public void userLandedInCartPage() {
	   System.out.println("User Landed In CartPage");
	}
	
	
	AmazonPayment ap= new AmazonPayment(driver);
	
	@Then("User Go To  The Shopping Card Page")
	public void userGoToTheShoppingCardPage() {
	    ClickOnElement(driver, ap.getCartPage());
	}
	@Then("User Click The ProceedPay Button And Navigate The Amazon CheckOut Page")
	public void userClickTheProceedPayButtonAndNavigateTheAmazonCheckOutPage() {
		ClickOnElement(driver, ap.getProceedToPay());
	}
	    
	@Then("User Click The Use This Address Button")
	public void userClickTheUseThisAddressButton() {
	    ClickOnElement(driver, ap.getUseThisAddress());
	    staticwait(5000);
	}
	@Then("User Moving The Select Payment Method And Click The Credit Or Debit Card Button")
	public void userMovingTheSelectPaymentMethodAndClickTheCreditOrDebitCardButton() {
	    ClickOnElement(driver, ap.getPaymentMethod());
	    staticwait(5000);
	}
	@Then("User Click The End Card Details And Navigate The PopUp Page")
	public void userClickTheEndCardDetailsAndNavigateThePopUpPage() {
	    ClickOnElement(driver, ap.getEnterCardDetails());
	    frameByIndex(0);
	}
	@Then("User Enter The Card Number And Click Enter Card Details")
	public void userEnterTheCardNumberAndClickEnterCardDetails() {
	    inputValues(driver, ap.getCardNumber(), 0, "2345 7682 34");
	    ClickOnElement(driver, ap.getClickEnter());
	}







}
