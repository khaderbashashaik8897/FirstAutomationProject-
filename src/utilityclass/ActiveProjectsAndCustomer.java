package utilityclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ActiveProjectsAndCustomer {
	@FindBy(xpath="//input[@ value='Add New Customer']")
	private WebElement addNewCustomerbutton;
	@FindBy(xpath="//input[@ value='Add New Project']")
	private WebElement addNewProjectbutton;
	@FindBy(name="selectedCustomer")
	private WebElement dropdown;
	@FindBy(xpath="//input[@ onclick='showCustomersProjects(this.form)']")
	private WebElement showbutton;
	@FindBy(id="showProjects")
	private WebElement showprojectscheckbox;
	@FindBy(xpath="//input[@ value='Archive Selected Customers & Projects']")
	private WebElement archiveselectcustomerandprojects;
	@FindBy(name="recordsPerPage")
	private WebElement showcustomeronapage;
	@FindBy(linkText="Next")
	private WebElement nextlinktext;
	@FindBy(className="successmsg")
	private WebElement successmessage;

	public ActiveProjectsAndCustomer()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
		public void clickOnAddNewCustomerbutton()
		{
		addNewCustomerbutton.click();	
		}
		public void clickonAddNewProjectbutton()
		{
			addNewProjectbutton.click();
		}
		public void clickonShowbutton()
		{
			showbutton.click();
		}
		public void selectfromallactivecustomersdropdown(String value)
		{
			Select s= new Select(dropdown);
			s.selectByVisibleText(value);
			
		}
		public void selectfromallactivecustomersdropdown(int value)
		{
			Select s1= new Select(dropdown);
			s1.selectByIndex(value);
		}
		public void clickonshowprojectscheckbox()
		{
			showprojectscheckbox.click();
		}
		public void clickonarchiveselectedcustomersandprojects()
		{
			archiveselectcustomerandprojects.click();
		}
		public void selectfromshowcustomersonapage(String value)
		{
			Select s3= new Select(showcustomeronapage);
			s3.selectByVisibleText(value);
		}
		public String retrivingsucessmessage()
		{
			String message= successmessage.getText();
			return message;
		}
		
}
