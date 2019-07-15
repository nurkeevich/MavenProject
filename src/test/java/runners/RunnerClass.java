package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import utilities.Driver;

/**
 * RunnerClass
 */

@CucumberOptions(
    plugin = {"html:target/cucumber"},
    features = "src/test/resources/features/",
    glue = "step_definitions",
    tags = "@test3",
    dryRun = false
)

public class RunnerClass extends AbstractTestNGCucumberTests {
    @AfterClass
    public void cleanUp(){
        Driver.closeDriver();
    }
}