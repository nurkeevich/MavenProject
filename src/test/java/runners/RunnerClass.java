package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * RunnerClass
 */

@CucumberOptions(
    plugin = {"html:target/cucumber"},
    features = "src/test/resources/features/",
    glue = "java/step_definitions",
    tags = "@any",
    dryRun = false
)

public class RunnerClass extends AbstractTestNGCucumberTests {
   
}