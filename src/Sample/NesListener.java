package Sample;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import Actitime.Login;
import PageObjectUtiltiyClass.TakingScreenShots;

public class NesListener extends TestListenerAdapter {
	
public void onTestStart(ITestResult tr)
{
	System.out.println("This is on testStart");
}
public void onTestSuccess(ITestResult tr)
{
	try {
		TakingScreenShots.screenshot(Login.driver,"testsucess");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("This is on testsuccess");
}

public void onTestFinish(ITestResult tr)
{
	System.out.println("This is on test finish");
}
public void onTestFailure(ITestResult tr) {
try {
	TakingScreenShots.screenshot(Login.driver,"testFailure");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
System.out.println("This is on testfailure");
}
public void onTestSkipped(ITestResult tr)
{
	try {
		TakingScreenShots.screenshot(Login.driver,"testskipped");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("This is on test skipped");
}
}
	