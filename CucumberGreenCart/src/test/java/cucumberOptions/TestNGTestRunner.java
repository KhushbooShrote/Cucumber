package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",
glue="stepDefinitions",monochrome=true,dryRun=true,
plugin= {"html:target/cucumber.html","json:target/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"rerun:target/failed_scenarios.txt"})
//html, json and xml are inbuilt but extent is 3rd party plugin need 
//to add some configuration for that
public class TestNGTestRunner extends AbstractTestNGCucumberTests
{
	@Override
	@DataProvider(parallel=true)
	//scenarios() helps to run scenarios parallel
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
	
}
