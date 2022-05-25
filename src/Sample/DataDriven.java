package Sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataDriven {
	 public static WebDriver driver;
	@Parameters({"a","b","c"})
	@Test
	public void start(String data1,String data2,String data3)
	{
		
	System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//drivers//geckodriver.exe");
	 driver = new FirefoxDriver();
	driver.get(data1);
		driver.manage().window().maximize();
		SimpleScreenShotMethod screenshot = new SimpleScreenShotMethod();
		screenshot.screenshotmethod();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		screenshot.screenshotmethod();

		driver.findElement(By.name("username")).sendKeys(data2+Keys.TAB+data3+Keys.ENTER);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Time out");
		}
		screenshot.screenshotmethod();
		driver.findElement(By.className("logoutImg"));
		driver.quit();
	}

}
