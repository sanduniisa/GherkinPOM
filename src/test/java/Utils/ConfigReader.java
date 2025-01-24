package Utils;

import java.io.InputStream;
import java.util.Properties;


public class ConfigReader {
	private static Properties properties = new Properties();

    static {
        try (InputStream input = ConfigReader.class.getClassLoader().getResourceAsStream("testdata/testdata.properties")) {
            if (input == null) {
                throw new RuntimeException("Sorry, unable to find testdata.properties");
            }
            properties.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
