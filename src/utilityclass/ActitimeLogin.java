package utilityclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLogin {
	@FindBy(name="username")
	private WebElement username;
	@FindBy(name="pwd")
	private WebElement password;
	@FindBy(xpath="//input[@valign='absmiddle']")
	private WebElement loginButton;
	@FindBy(className="errormsg")
	private WebElement errormessage;
	public ActitimeLogin()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public void enterusername(String value)
	{
		username.sendKeys(value);
	}
	public void enterpassword(String value2)
	{
		password.sendKeys(value2);
	}
	public void clickloginbutton() {
		loginButton.click();
	}
	
}
