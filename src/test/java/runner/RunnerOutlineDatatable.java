package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
	features = {"src\\test\\resources\\appFeatures\\FormOutlineDatatable.feature"},
	
	glue = {"steps"},
	
	plugin = {"pretty"},
	
	
	
	dryRun = true
		
)

public class RunnerOutlineDatatable extends  AbstractTestNGCucumberTests
{
	

}
