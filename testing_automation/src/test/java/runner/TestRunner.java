package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(	
		features = "src/test/resources/feature/login.feature",
		glue = {"com.definition"},
		dryRun = false,
		monochrome =false,
		plugin = { "pretty", "html:target/project-report/report.html"},
		publish = true
		//monochrome = true,
		//plugin = {"pretty"}
		)


public class TestRunner {
	
}

