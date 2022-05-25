package TestScript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import utilityclass.ActiveProjectsAndCustomer;
import utilityclass.AddNewCustomer;
import utilityclass.BaseClass;
import utilityclass.OpenTasks;


public class AddnewCustomerTestScript extends BaseClass {
	
	@Test()
	public void addingnewcustomer() throws InterruptedException 
	{
		OpenTasks opt = new OpenTasks();
		opt.clickonprojectandcustomers();
		BaseClass.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		ActiveProjectsAndCustomer act = new ActiveProjectsAndCustomer();
		act.clickOnAddNewCustomerbutton();
		AddNewCustomer anc = new AddNewCustomer();
		anc.entercustomername("smb");
		anc.entercustomerdescription("There is nothing to add for testing the application  iam adding this");
		Thread.sleep(3000);
		anc.checkonaddmorecustomers();
		anc.checkoncreateanewprojectforthiscustomer();
		anc.checkonshowlistofactiveprojectsandcustomers();
		Thread.sleep(3000);
		anc.clickoncreatecustomer();
		String message = act.retrivingsucessmessage();
		System.out.println(message);
	}

}
