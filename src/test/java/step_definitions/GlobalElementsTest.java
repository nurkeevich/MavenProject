package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
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

    @Given("User locates Switch to Alert Button using Xpath and enters credentials")
    public void userLocatesSwitchToAlertButtonUsingXpathAndEntersCredentials() {
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("bermet");
    }

    @When("User clicks the  button for alert popup box")
    public void userClicksTheButtonForAlertPopupBox() {
        driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
    }

    @Then("User gets the displayed text of the alert popup and prints it to console")
    public void userGetsTheDisplayedTextOfTheAlertPopupAndPrintsItToConsole() {
        String text = driver.switchTo().alert().getText();
        System.out.println("text");
    }

    @And("User accepts the alert popup")
    public void userAcceptsTheAlertPopup() {
        driver.switchTo().alert().accept();
    }


    @Then("User locates Confirm Button using Xpath and User dismisses the confirm popup")
    public void userLocatesConfirmButtonUsingXpathAndUserDismissesTheConfirmPopup() {
        driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
        driver.switchTo().alert().dismiss();

    }

    @And("User accepts the confirm popup")
    public void userAcceptsTheConfirmPopup() {
        driver.switchTo().alert().accept();
    }
}
