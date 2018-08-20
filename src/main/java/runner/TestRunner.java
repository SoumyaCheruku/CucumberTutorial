package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="/home/sbv6/Desktop/Soumya/eclipse_workspace/FreeCrmBDDFramework/src/main/java/crm/taggedhooks.feature",
		glue={"stepDefinition"},//path of step definition file
		format={"pretty","html:test-output","json:json-output/cucumber.json","junit:junit_xml/cucumber.xml"},//to generate different reports
		monochrome =true,// to generate console out put in readable format
		strict=true,//it runs only if all scenarios have correct mapping
		dryRun = false// check whether method is available for each and every scenarios
		//tags={"~@SmokeTest" , "~@RegressionTest "}		

)

public class TestRunner {
	
	

}
