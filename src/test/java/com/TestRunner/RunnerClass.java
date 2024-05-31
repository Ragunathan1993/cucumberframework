package com.TestRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import BaseClass.Base;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		
		features = {
				"src\\test\\java\\com\\Feature\\Amazon.feature"},
		glue ="com.StepDef",

		snippets = SnippetType.CAMELCASE,
		plugin = {
			    "html:HTMLReporsts/Facebook.html",
				"pretty",
				"json:JsonReports/Facebookjs.json",
				
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
						
		)
		
		

public class RunnerClass extends Base {
@BeforeClass	
public static void	browserStart(){
		browserlaunch("chrome");
	}
@AfterClass
 public static void terminate() {
		driver.quit();

	}

}
