package Sample;

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
	TakingScreenShots.screenshot(Login.driver,"testsucess");
	System.out.println("This is on testsuccess");
}

public void onTestFinish(ITestResult tr)
{
	System.out.println("This is on test finish");
}
public void onTestFailure(ITestResult tr) {
TakingScreenShots.screenshot(Login.driver,"testFailure");
System.out.println("This is on testfailure");
}
public void onTestSkipped(ITestResult tr)
{
	TakingScreenShots.screenshot(Login.driver,"testskipped");
	System.out.println("This is on test skipped");
}
}
	