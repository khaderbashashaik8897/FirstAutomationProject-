package Sample;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Screenshots {
	public static WebDriver driver ;
	@Test
	public void takingscreenshots() {
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//drivers//geckodriver.exe");
	 driver = new FirefoxDriver();
		driver.get("http://127.0.0.1:81/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("admin"+Keys.TAB+"manager"+Keys.ENTER);
		String currentdate = new SimpleDateFormat("yyyymmddhhmmss").format(new Date());
		System.out.println(currentdate);
		SimpleScreenShotsCode  code = new SimpleScreenShotsCode();
		code.Screenshots(currentdate);
		String updateddate = new SimpleDateFormat("yyyymmddhhmmss").format(new Date());
		code.Screenshots(updateddate);
		driver.findElement(By.xpath("//input[@value=' Login now ']")).click();
		String updateddate2 = new SimpleDateFormat("yyyymmddhhmmss").format(new Date());
		code.Screenshots(updateddate2);
		driver.quit();

		
		
		
	}


}
