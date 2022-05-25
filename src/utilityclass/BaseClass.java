package utilityclass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import PageObjectUtiltiyClass.FetchingDataUsingPropetiesfile;
import PageObjectUtiltiyClass.SelectingBroswer;

public class BaseClass {
	public static WebDriver driver;
	public static Logger logg= Logger.getLogger("BaseClass");

	@BeforeTest()
	public void openingBroswer() throws InterruptedException, IOException
	{
		PropertyConfigurator.configure("Log4j.properties");
	String currentbrowser=FetchingDataUsingPropetiesfile.fetchdata("browser");
	logg.info("browser data is selected "+currentbrowser);
		SelectingBroswer.broswer(currentbrowser);
		
		Thread.sleep(2000);
		logg.info("Broswer is selected ");
		Thread.sleep(2000);
	}
	@BeforeClass()
	public void loginIntoActitime() throws IOException
	{
		String data1 = FetchingDataUsingPropetiesfile.fetchdata("url");
		logg.info("url is fetched for the propety file");
		driver .manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(data1);
		logg.info("url is entered into the broswzer "+data1);
		ActitimeLogin login = new ActitimeLogin();
		String data2 = FetchingDataUsingPropetiesfile.fetchdata("username");
		logg.info("username is fetched from the property");
		login.enterusername(data2);
		logg.info("username is entered into the filed.");
		String data3 = FetchingDataUsingPropetiesfile.fetchdata("password");
		logg.info("password is fetched from the property file");
		login.enterpassword(data3);
		logg.info("password is enter into the password filed");
		login.clickloginbutton();
		logg.info("login button is clicked ");
	}
	@AfterClass()
	public void LogoutFromActitime() {
		driver.findElement(By.className("logoutImg")).click();
		logg.info("logout button is clicked ");
	}
	@AfterTest()
	public void closingBroswer()
	{
	driver.close();	
	logg.info("Broswzer is closed ");
	}
	
}
