package Actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginActitime {
	public static void main(String[] args)
	{
System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
FirefoxDriver driver = new FirefoxDriver();
driver.get("http://127.0.0.1:81/login.do");
String url= driver.getCurrentUrl();
System.out.println(url);
String source= driver.getPageSource();
System.out.println(source);
String title = driver.getTitle();
System.out.println(title);
driver.findElement(By.name("username")).sendKeys("admin"+Keys.TAB+"manag"+Keys.ENTER);
//String message = driver.findElement(By.id("errormsg")).getText();
//System.out.println(message);
//driver.findElement(By.xpath(input[@value='admin'])).clear();
driver.findElement(By.name("username")).clear();
driver.findElement(By.name("username")).sendKeys("admin"+Keys.TAB+"manager"+Keys.ENTER);
//String message2 = driver.findElement(By.id("errormsg")).getText();
//System.out.println(message2);






	}

}
