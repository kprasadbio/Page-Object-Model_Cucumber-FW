package com.ps.learning.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ps.learning.config.Utilities;

public class RegisterAnAccount extends Utilities
{
	public RegisterAnAccount() 
	{ 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement txt_eMail;
	
	@FindBy(id="password")
	private WebElement txt_pwd;
	
	@FindBy(id="first-name")
	private WebElement txt_FirstName;
	
	@FindBy(id="last-name")
	private WebElement txt_LastName;
	
	@FindBy(id="phone-number")
	private WebElement txt_PhoneNumber;
	
	@FindBy(id="postcode")
	private WebElement txt_PostalCode;
	
	@FindBy(xpath="//button[@data-test='create-account']")
	private WebElement btn_CreateAccount;
	
	
	public void inputdata()
	{
		txt_eMail.sendKeys("mail@test.com");
		txt_pwd.sendKeys("!test123");
		
		txt_FirstName.sendKeys("self");
		txt_LastName.sendKeys("learning");
		
		txt_PhoneNumber.sendKeys("0123456789");
		txt_PostalCode.sendKeys("3458");
		
		btn_CreateAccount.click();
	}
	
}
