package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;

/**
 * RunnerClass
 */

@CucumberOptions(
    plugin = {"html:target/cucumber"},
    features = "src/test/resources/features/",
    glue = "step_definitions",
    tags = "@any",
    dryRun = false
)

public class RunnerClass extends AbstractTestNGCucumberTests {

   
}