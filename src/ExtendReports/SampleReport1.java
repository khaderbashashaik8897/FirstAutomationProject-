package ExtendReports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.observer.entity.MediaEntity;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Actitime.Login;
import PageObjectUtiltiyClass.TakingScreenShots;

public class SampleReport1 {
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.out.println("main method started");
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter reporter = new ExtentSparkReporter("samplereport2.html");
		extent.attachReporter(reporter );
		Login.login();
		String currentpath = TakingScreenShots.screenshot(Login.driver,"loginscreenshot");
		extent.createTest("test1").addScreenCaptureFromPath(currentpath,"login screen shot")
		.info(MediaEntityBuilder.createScreenCaptureFromPath(currentpath).build()).assignAuthor("shaik khaderbasha").assignCategory("logintest")
		.assignDevice("firfoxdiverversion 96.0.3");
		extent.flush();
		Desktop.getDesktop().browse(new File("samplereport2.html").toURI());
		
		
		
		
		
	}

}
