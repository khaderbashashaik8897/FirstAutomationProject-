package utilityclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenTasks {
	
	@FindBy(linkText="Projects & Customers")
	private WebElement projectsandcustomers;
	public OpenTasks()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	public void clickonprojectandcustomers()
	{
		projectsandcustomers.click();
	}
	

}
