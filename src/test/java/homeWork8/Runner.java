package homeWork8;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/featureFiles"},
        glue = {"homeWork8.stepDefinitions"},
        plugin = {"json:target/cucumber-reports/Cucumber.json"},
//        tags = "@RunMe",
        dryRun = false
)

public class Runner {
}
