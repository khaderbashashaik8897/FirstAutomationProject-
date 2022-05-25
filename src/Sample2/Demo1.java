package Sample2;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Demo1 {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.geckho.driver",System.getProperty("user.dir")+"//drivers//geckho.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("http://127.0.0.1:81/login.do");
		driver.findElement(By.id("name")).sendKeys("admin"+Keys.TAB+"manager"+Keys.ENTER);
		Thread.sleep(2000);
		EventFiringWebDriver  evn = new EventFiringWebDriver(driver);
		File f1=evn.getScreenshotAs(OutputType.FILE);
 		
		
		
	}

}
