package stepDefinitions.Util;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/cucumber/features",
        glue = {"stepDefinitions"},
        monochrome = true
        //plugin = {"pretty", "html:target/HtmlReports.html"},
        //tags = "@sunny"
)
public class TestRunner {
}
