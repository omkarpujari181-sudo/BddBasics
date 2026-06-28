package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
	


@CucumberOptions
	
	(
	   features = {"src\\test\\resources\\appFeatures\\Order.feature"},
	   glue = {"steps"},
	   plugin = {"pretty"}
			
	)


public class RunnerOrderFunc extends AbstractTestNGCucumberTests
{

}
