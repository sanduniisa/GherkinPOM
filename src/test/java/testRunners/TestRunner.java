package testRunners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "../ESeleniumFW/src/test/resources/features",
        glue = "stepDefinitions",
        plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"},
        monochrome = true
)

//@CucumberOptions(
//        features = "../ESeleniumFW/src/test/resources/features",
//        glue = "stepDefinitions",
//        plugin = {
//            "pretty", 
//            "html:target/cucumber-reports.html", 
//            "json:target/cucumber.json",
//            "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//        },
//        monochrome = true
//)

public class TestRunner {

}
