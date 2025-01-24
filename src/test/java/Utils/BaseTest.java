package Utils;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Dimension;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	protected static ExtentReports extent;
	protected static ExtentTest test;
	protected WebDriver driver;

	@BeforeMethod
	public void init() {
		driver = DriverFactory.getDriver(); // Retrieve the WebDriver instance

		try {
			System.out.println("Attempting to maximize the browser window...");
			driver.manage().window().maximize(); // Maximize the window
			System.out.println("Browser window maximized.");
		} catch (Exception e) {
			System.out.println("Maximizing failed. Setting window size manually.");
			driver.manage().window().setSize(new Dimension(1920, 1080)); // Set default size
		}
	}

	@AfterMethod
	public void tearDown() throws InterruptedException {
		System.out.println("Closing the browser...");
		DriverFactory.quitDriver(); // Quit the driver using DriverFactory
		System.out.println("Browser closed successfully.");
	}
}
