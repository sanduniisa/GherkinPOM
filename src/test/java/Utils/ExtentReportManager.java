package Utils;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentReportManager {

	public static ExtentReports reports() {
		ExtentReports extentReports = new ExtentReports("/Users/sanduniisa/Documents/extentReportsEselenium/report.html", false);
		return extentReports;
	}
}
