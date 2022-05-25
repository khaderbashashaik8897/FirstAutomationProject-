package ExtendReports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class SampleExtentReport {
	public static void main(String[] args) throws IOException
	{
		System.out.println("main method started");
		// extentreprots is the mainengine of extentreports
		ExtentReports extent = new ExtentReports();
		
		// we have like four reporter , we use sparkReporter to define loaction of the extenreport where we would like to store.
		ExtentSparkReporter reports = new ExtentSparkReporter("samplereport.html");
		ExtentSparkReporter reprots1 = new ExtentSparkReporter(new File("samplereport2.html"));
		extent.attachReporter(reports);
		extent.attachReporter(reprots1);
		//the above line def where we are attaching the Reporter to extent Report.
		System.out.println("main method ended");
	ExtentTest extenttest =	extent.createTest("Test1");
			ExtentTest extenttest2=extent.createTest("Test2");
			extenttest.pass("Test is passed ");
			extenttest2.log(Status.FAIL,"Test is failed");
	extent.flush();
	Desktop.getDesktop().browse(new File ("samplereport.html").toURI());
/*
 * fail
 * pass
 * skip
 * warning
 * pass 
 * These are the five different log level in the extent reports.
 */
		
		
	}

}
