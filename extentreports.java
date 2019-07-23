package pack1;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class extentreports {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;
	
  @Test
  public void f() {
  }
  @AfterMethod
  public void afterMethod() {
  }

  @BeforeTest
  public void startReport(String OS, String browser) {
	  htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/testReport.html");
	  extent = new ExtentReports();
	  extent.attachReporter(htmlReporter);
	  extent.setSystemInfo("OS", OS);
	  extent.setSystemInfo("Browser", browser);
	  htmlReporter.config().setCharVisibilityOnOpen(true);
	  htmlReporter.config().setDocumentTitle("Extent Report Demo");
	  htmlReporter.config().setReportName("Test Report");
	  htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
	  htmlReporter.config().setTheme(Theme.STANDARD);
	  htmlReporter.config().setTimeStampFormat("EEEE,MMMM dd, yyyy, hh:mm a '('zzz')'");
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
