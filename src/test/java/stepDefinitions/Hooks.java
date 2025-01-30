package stepDefinitions;

import Utils.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {
    private WebDriver driver;

    @Before
    public void setUp() {
        // Initialize the WebDriver before each scenario
        driver = DriverFactory.getDriver();
        System.out.println("Browser opened successfully.");
    }

    @After
    public void tearDown() {
        // Quit the WebDriver after each scenario
        if (driver != null) {
            DriverFactory.quitDriver();
            System.out.println("Browser closed successfully.");
        }
    }
}