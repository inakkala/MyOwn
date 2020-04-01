package runner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\indra\\eclipse-workspace\\org.Indra\\resources\\features"
		,glue={"stepDefination"}
		)

public class TestRunner {

}