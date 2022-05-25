package utilityclass;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import PageObjectUtiltiyClass.TakingScreenShots;


public class TestNGListenter extends TestListenerAdapter {
	ExtentReports reports ;
	ExtentSparkReporter reporter ;
	ExtentTest test;
	 String path ;
	public void onStart(ITestContext rv)
	{
		 reports = new ExtentReports();
		 path = System.getProperty("user.dir")+"//ExtendReports//first.html";
		 reporter = new ExtentSparkReporter(path);
		reports.attachReporter(reporter);
		reporter.config().setDocumentTitle("ActitimefirstReprot");
		reporter.config().setReportName("shaik khaderbasha");
		reporter.config().setTheme(Theme.STANDARD);
		reports.setSystemInfo("QA", "shaik");
		reports.setSystemInfo("module","login");
		reports.setSystemInfo("os", "windows");
		reports.setSystemInfo("broswerEnvironment", "firefox");
		System.out.println("This is the first method");
		
	}
	public void onTestStart(ITestResult rv)
	{
		test = reports.createTest(rv.getName());
		test.assignAuthor("shaik");
				test.assignDevice("firefoxbroswzer").assignCategory("functionTesting");
		
		System.out.println("This is the second method");

	}
	public void onTestSkipped(ITestResult rv)
	{
		test.log(Status.FAIL,MarkupHelper.createLabel("method is skipped", ExtentColor.ORANGE));
		System.out.println("This is the third method");

	}
	public void onTestSuccess(ITestResult tr)
	{
		try {
			String path = TakingScreenShots.screenshot(BaseClass.driver,"Pass");
			test.log(Status.PASS,MarkupHelper.createLabel("method is pass", ExtentColor.GREEN) );
			test.log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(path).build());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("This is the fourth method");

	}
	public void onTestFailure(ITestResult rv)
	{
		test.log(Status.FAIL,MarkupHelper.createLabel("method is failed", ExtentColor.RED));
		
			try {
				String path = TakingScreenShots.screenshot(BaseClass.driver,"failed");
				test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(path).build());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		System.out.println("This is the fifth method");

	}
	public void onFinish(ITestContext rv)
	{
		reports.flush();
		try {
			Desktop.getDesktop().browse(new File(path).toURI());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("This is the sixth method");

	}
	

	
}
