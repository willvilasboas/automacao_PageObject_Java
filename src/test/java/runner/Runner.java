package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/feature/Login.feature", 
glue = {""},
plugin = {"pretty", "html:target/report-html", "json:target/report.json"})
public class Runner {

}
