package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/facebook.feature",
		glue = {"com.definition"},
		plugin = { "pretty", "html:target/projectReports/report.html"},
		publish = true
		)
public class FaceBookRunner {
	
}
