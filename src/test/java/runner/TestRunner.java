package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/cucumber_testng_html_report.html","pretty"},
                 features = "src/test/java/features/Register.feature",
                 glue = "stepdefinitions")
public class TestRunner extends AbstractTestNGCucumberTests {

}
