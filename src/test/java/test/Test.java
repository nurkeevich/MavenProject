package test;

import org.openqa.selenium.WebDriver;

import utilities.Driver;

/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.google.com");      
    }

}