package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.GlobalTopElements;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utilities.Driver;

public class GlobalElementsTest {
    private WebDriver driver = Driver.getDriver();
    private GlobalTopElements globaleTopElements = new GlobalTopElements();

    @Given("User navigates to {string} practice page")
    public void userNavigatesToPracticePage(String URL) {
        driver.get(URL);
    }

    @Then("Verifies Practice button is displayed")
    public void verifiesPracticeButtonIsDisplayed() {
        Assert.assertEquals(globaleTopElements.Practice.isDisplayed(), true);
    }

    @Then("Verifies Login button is displayed")
    public void verifiesLoginButtonIsDisplayed() {
        Assert.assertEquals(globaleTopElements.Login.isDisplayed(), true);
    }

    @Then("Verifies Sign Up button is displayed")
    public void verifiesSignUpButtonIsDisplayed() {
        Assert.assertEquals(globaleTopElements.SignUp.isDisplayed(), true);
    }
}
