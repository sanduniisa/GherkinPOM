package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;

import Utils.BaseTest;
import Utils.DriverFactory;
import Utils.config;

public class Loginpage extends BaseTest{
	WebDriver driver = DriverFactory.getDriver();

//    private By usernameField = By.xpath(config.getProperty("usernameField"));
//    private By passwordField = By.xpath(config.getProperty("passwordField"));
//    private By loginButton = By.xpath(config.getProperty("loginButton"));
//    private By dashboard = By.xpath(config.getProperty("dashboard"));
//    private By avatarWebElement = By.xpath(config.getProperty("avatarWebElement"));

	public void openLoginPage() {
		// Fetch the URL from config.properties
//        String loginPageURL = config.getLoginPageURL();
//        driver.get(loginPageURL);
		//driver.get("https://www.guru99.com");
		String loginPageURL = config.getLoginPageURL();
        driver.get(loginPageURL);
		
	}

	public void user_types_in_the_search_bar(String string) throws InterruptedException {
		// Assuming you have a WebDriver instance and a method to find the search bar
		Thread.sleep(1000);
		String searchTabXPath = config.getLocator("searchTab");
		WebElement searchInput = driver.findElement(By.xpath(searchTabXPath)); // Find the search bar
		searchInput.sendKeys(string); // Type the search term in the search bar
	}

	public void user_clicks_the_search_button() {
		WebElement searchbutton = driver.findElement(By.xpath(config.getLocator("searchButton")));
		searchbutton.click();
	}
}
