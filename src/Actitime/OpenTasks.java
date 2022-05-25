package Actitime;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectUtiltiyClass.TakingScreenShots;

public class OpenTasks {
	@Test()
	public void opentask() throws InterruptedException, IOException
	{
		/*System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
		driver .get("http://127.0.0.1:81/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);*/
		Login.login();
		//TakingScreenShots.screenshot(Login.driver);
		WebElement dropdown = Login.driver .findElement(By.name("customerProject.shownCustomer"));
		Select ref = new Select(dropdown);
		ref.selectByIndex(0);
		ref.selectByVisibleText("sk3");
	Login.driver.findElement(By.name("searchTasks")).click();
	Login.driver.findElement(By.name("archiveSelectedCustomer")).click();
	String alertmessage = Login.driver.switchTo().alert().getText();
	Login.driver.switchTo().alert().dismiss();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Login.driver.findElement(By.name("archiveSelectedCustomer")).click();
	Thread.sleep(4000);
	Login.driver.switchTo().alert().accept();
	TakingScreenShots.screenshot(Login.driver,"Normalshot");
	//Thread.sleep(4000);
	//Login.driver.close();
	
	
	
		
		
		
		
		
	}

}
