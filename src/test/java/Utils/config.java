package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class config {

    private static Properties urlProperties = new Properties();
    private static Properties locatorProperties = new Properties();
    
    static {
        try {
            // Load the config.properties file for URLs
            InputStream urlInputStream = new FileInputStream("../ESeleniumFW/src/test/resources/config.properties");
            urlProperties.load(urlInputStream);

            // Load the locators.properties file for XPath locators
            InputStream locatorInputStream = new FileInputStream("../ESeleniumFW/src/test/resources/locators.properties");
            locatorProperties.load(locatorInputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to get the value for a given URL key
    public static String getURL(String key) {
        return urlProperties.getProperty(key);
    }

    // Method to get the value for a given XPath key
    public static String getLocator(String key) {
        return locatorProperties.getProperty(key);
    }

    // Example for URLs
    public static String getLoginPageURL() {
        return getURL("loginPageURL");
    }
}
