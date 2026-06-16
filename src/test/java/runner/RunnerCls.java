package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
	(
			features = {"src\\test\\resources\\appFeatures\\Login.feature"},
			glue = {"steps"},
			plugin = {"pretty"}
	)



			
			public class RunnerCls extends AbstractTestNGCucumberTests 
{


}
