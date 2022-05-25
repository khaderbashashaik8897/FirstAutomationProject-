package ExtendReports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SampleReport2 {
	public static void main(String[] args) throws IOException
	{
		ExtentReports report = new ExtentReports();
		ExtentSparkReporter reporter = new ExtentSparkReporter("samplereport3.html");
		report.attachReporter(reporter);
		report.createTest("Test1").log(Status.INFO, "This test is passed")
		.assignAuthor("shaikkhaderbasha")
		.assignCategory("regression")
		.assignDevice("firefoxversion96.0.3");
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setDocumentTitle("First TestScript");
		reporter.config().setReportName("samplereport");
		reporter.config().setTimeStampFormat("dd-MM-yyyy hh:mm:ss");
		report.createTest("Test2").log(Status.INFO, "This test is passed")
		.assignAuthor("basha")
		.assignCategory("smoke")
		.assignDevice("firefoxversion96.0.3");	report.createTest("Test3").log(Status.INFO, "This test is passed")
		.assignAuthor("shaikkhader")
		.assignCategory("regression")
		.assignDevice("firefoxversion96.0.3");	report.createTest("Test4").log(Status.INFO, "This test is passed")
		.assignAuthor("shaik")
		.assignCategory("smoke")
		.assignDevice("firefoxversion96.0.3");	report.createTest("Test5").log(Status.INFO, "This test is passed")
		.assignAuthor("shaikkhaderbasha")
		.assignCategory("sk khader")
		.assignDevice("firefoxversion96.0.3");
		report.flush();
		Desktop.getDesktop().browse(new File("samplereport3.html").toURI());


	}

}
