package com.indexPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.init.AbstractPage;
import com.init.Common;
import com.verificationPage.LoginVerificationPage;

public class LoginIndexPage extends AbstractPage {
	
	public LoginIndexPage(WebDriver driver) {
		
		super(driver);
		// TODO Auto-generated constructor stub
	} 

	@FindBy(id="login-email")
	WebElement filechannel_email_field;
	public LoginVerificationPage EnterEmail(String username)
	{
		Common.enterDataIn(driver, filechannel_email_field, username);
		return new LoginVerificationPage(driver);
	}
	
	@FindBy(id="login-password")
	WebElement filechannel_password;
	public LoginVerificationPage Enterpass(String password)
	{
		Common.enterDataIn(driver, filechannel_password, password);
		return new LoginVerificationPage(driver);
	}
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement letsgo_btn;
	public LoginVerificationPage clickOnLetgoButton()
	{
		Common.clickOn(driver, letsgo_btn);
		return new LoginVerificationPage(driver);
	}
	
	
	@FindBy(id = "dropdownMenuButton")
	WebElement threedot;
	public LoginVerificationPage clickOnthreedot()
	{
		Common.clickOn(driver, threedot);
		return new LoginVerificationPage(driver);
	}
	
	@FindBy(xpath = " //a[@href='/logout']")
	WebElement logout;
	public LoginVerificationPage getsignouttext()
	{
		Common.clickOn(driver, logout);
		return new LoginVerificationPage(driver);
	}
	 
	
	

}
