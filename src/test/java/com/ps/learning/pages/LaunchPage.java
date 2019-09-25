package com.ps.learning.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ps.learning.config.Utilities;

public class LaunchPage extends Utilities
{
	public LaunchPage() 
	{ 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="My account")
	private WebElement lnk_MyAcc;
	
	@FindBy(xpath="//a[text()='Register for an account']")
	private WebElement lnk_RegisterAnAcc;
	
	public void clickOnSignIN()
	{
		lnk_MyAcc.click();
	}
	
	public void clickOnRegisterAnAccount()
	{
		lnk_RegisterAnAcc.click();
	}

}
