package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

// Example page for page class

/**
 * GlobalTopElements
 */
public class GlobalTopElements {
    private WebDriver driver;

    public GlobalTopElements() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='fedora-navbar-link navbar-link']")
    public WebElement Practice;

    @FindBy(xpath = "//a[@class='navbar-link fedora-navbar-link']")
    public WebElement Login;

    @FindBy(xpath = "//a[@class='btn btn-primary pull-right btn-lg']")
    public WebElement SignUp;

    public void clickPractice() {
        Practice.click();
    }

    public void clickLogin() {
        Login.click();
    }

    public void clickSignUp() {
        SignUp.click();
    }
    
}