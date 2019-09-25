package com.ps.learning.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.ps.learning.config.Utilities;
import com.ps.learning.pages.LaunchPage;
import com.ps.learning.pages.RegisterAnAccount;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RegisterAccount
{
	WebDriver driver;
	RegisterAnAccount register=new RegisterAnAccount();
	LaunchPage lp=new LaunchPage();
	
	@Before
	public void launch()
	{
		Utilities browser=new Utilities();
	}
	
	@Given("^user is able to launch browser$")
	public void clickonsignin()
	{
		lp.clickOnSignIN();
		lp.clickOnRegisterAnAccount();
	}
	
	@Then("^user closes the browser$")
	public void close()
	{
		Utilities.close();
	}

}
