package TestRunnerF;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		

		features="Features",
		glue="StepDifination" ,
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:target/cucumber-reports/report5.html"}
		
		
		
		
		)



public class Run12 {

}
