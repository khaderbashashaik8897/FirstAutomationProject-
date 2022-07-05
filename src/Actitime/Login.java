package Actitime;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login {
	public static WebDriver driver ;
	static Logger logger; 
	@Test()
	public static void login() throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
		 driver = new FirefoxDriver();
		 logger = Logger.getLogger("Login");
			PropertyConfigurator.configure("Log4j.properties");
			logger.info("Defined the drivers location");
		 String  project = System.getProperty("user.dir");
		 logger.info("broswer is opened ");
		driver.get("http://127.0.0.1:81/login.jsp");
		logger.info("url is entered ");
		//String title= driver.getTitle();
		driver.manage().window().maximize();
		logger.info("broswer is maximized");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		logger.info("username and password is enterd");
		driver.findElement(By.name("username")).sendKeys("admin"+Keys.TAB+"manager"+Keys.ENTER);
		Thread.sleep(3000);
		Assert.assertEquals("actiTIME - Open Tasks",driver.getTitle());
		logger.info("Home screen is validate with respect to title");
		driver.findElement(By.className("logoutImg")).click();
		logger.info("user click on logout");
		driver.close();
		logger.info("user close the browzer");
		

	}

}
