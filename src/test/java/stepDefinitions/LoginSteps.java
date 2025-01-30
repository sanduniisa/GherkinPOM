package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import pages.Loginpage;
import Utils.BaseTest;
import Utils.DriverFactory;
import Utils.ExtentReportManager;

import static org.junit.Assert.assertTrue;

public class LoginSteps extends BaseTest {

	WebDriver driver = DriverFactory.getDriver();
	Loginpage loginPage = new Loginpage();
	ExtentReports extentReports = ExtentReportManager.reports();
	ExtentTest extentTest = extentReports.startTest("testcase2");

	@Given("I navigate to the login page")
	public void i_navigate_to_the_login_page() {

		// ExtentReportManager.getTest().log(com.relevantcodes.extentreports.LogStatus.INFO,
		// "Navigating to login page");

		// Open the login page URL from config.properties
		loginPage.openLoginPage();

		// Log the successful navigation to the login page
		// ExtentReportManager.getTest().log(com.relevantcodes.extentreports.LogStatus.INFO,
		// "Successfully navigated to login page");
	}

	@When("User types {string} word in the search bar")
	public void user_types_word_in_the_search_bar(String string) throws InterruptedException {
		loginPage.user_types_in_the_search_bar(string);
	}

	@Then("user clicks the search button")
	public void user_clicks_the_search_button() throws InterruptedException {
		loginPage.user_clicks_the_search_button();
	}
}
