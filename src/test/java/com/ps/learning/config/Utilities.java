package com.ps.learning.config;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utilities 
{
	public static WebDriver driver;
	
	public static WebDriver driver()
	{
		return driver;
	}
	
	static
	{
		launch();
	}
	
	public static void launch()
	{
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.tesco.com/");
	}
	
	public static void close()
	{
		driver.quit();
	}

}
