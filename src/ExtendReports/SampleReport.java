package ExtendReports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class SampleReport {
	public static void main(String[] args)
	{
		ExtentReports extentreport = new ExtentReports();
		System.out.println("main method is start");
		ExtentSparkReporter reporter = new ExtentSparkReporter("report.html");
		extentreport.attachReporter(reporter);
		try {
			Desktop.getDesktop().browse(new File("report.html").toURI());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e+"NO file is found in the specified location");
		}
		extentreport.createTest("Test1").log(Status.PASS, "This test is passed");
		extentreport.createTest("Test2").skip("This test is skiped ");
		extentreport.createTest("Test3").fail("tes is failed");
		
		extentreport.flush();
	}

}
