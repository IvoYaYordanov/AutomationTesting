package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (features = {"src/test/resources"},
                  format = {"json:target/cucumber.json", "html:target/site/cucumber2"},
                  glue = "website")
public class TestRunner {
}
