package utilityclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomer {
	@FindBy(name="name")
	WebElement customername;
	@FindBy(name="description")
	WebElement customerdescription;
	@FindBy(id="active_customers_action")
	WebElement showlistofactiveprojectsandcustomers;
	@FindBy(id="add_project_action")
	WebElement createanewprojectforthiscustomer;
	@FindBy(id="add_more_customers_action")
	WebElement addmorecustomers;
	@FindBy(name="createCustomerSubmit")
	WebElement createcustomer;
	@FindBy(xpath="//input[@ value='      Cancel      ']")
	WebElement cancel;
	@FindBy(className="successmsg")
	WebElement message;
	public AddNewCustomer() {
		
		PageFactory.initElements(BaseClass.driver, this);
	}
	public void entercustomername(String data)
	{
		customername.sendKeys(data);
	}
	public void entercustomerdescription(String data)
	{
		customerdescription.sendKeys();
	}
	public void checkonshowlistofactiveprojectsandcustomers()
	{
		showlistofactiveprojectsandcustomers.click();
	}
	public void checkoncreateanewprojectforthiscustomer()
	{	
		createanewprojectforthiscustomer.click();
	}
	public void checkonaddmorecustomers()
	{
	addmorecustomers.click();	
	}
	public void clickoncreatecustomer()
	{
		createcustomer.click();
	}
	public void clickoncancel()
	{
		cancel.click();
	}
	public String retrivemessage()
	{
	String data= message.getText();
	return data;
	}
	}
	
	


