package TestScript;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import utilityclass.ActiveProjectsAndCustomer;
import utilityclass.AddNewCustomer;
import utilityclass.BaseClass;
import utilityclass.OpenTasks;

public class CancelAddNewCustomerTestScript extends BaseClass 
{
	@Test()
	public void canceladdnewcustomer() throws InterruptedException
	{
		OpenTasks opt = new OpenTasks();
		opt.clickonprojectandcustomers();
		BaseClass.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		ActiveProjectsAndCustomer act = new ActiveProjectsAndCustomer();
		act.clickOnAddNewCustomerbutton();
		AddNewCustomer anc = new AddNewCustomer();
		anc.entercustomername("skd");
		anc.entercustomerdescription("There is nothing to add for testing the application  iam adding this");
		Thread.sleep(3000);
		anc.checkoncreateanewprojectforthiscustomer();
		anc.clickoncreatecustomer();
		BaseClass.driver.navigate().back();
		anc.checkonshowlistofactiveprojectsandcustomers();
		anc.clickoncancel();
		Thread.sleep(2000);
		BaseClass.driver.switchTo().alert().dismiss();
		anc.clickoncancel();
		BaseClass.driver.switchTo().alert().accept();
	}

}
