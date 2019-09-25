package com.ps.learning.config;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "features"
		,glue = {"com.ps.learning.stepdefinitions"}
		,plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/report.html"})


public class TestRunner 
{
	@AfterClass
	public static void setup()
	{
		Reporter.loadXMLConfig(new File("src/test/java/com/ps/learning/config/extent-config.xml"));
        Reporter.setSystemInfo("user:", System.getProperty("user.name"));
        Reporter.setSystemInfo("os:", System.getProperty("os.name"));
        Reporter.setTestRunnerOutput("Sample test runner output message");
    }
}
