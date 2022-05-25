package Actitime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateCustomer {
	public static void main(String[] args) throws InterruptedException  {
		/*System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//drivers//geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://127.0.0.1:81/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);*/
		Login.login();
		Login.driver.findElement(By.linkText("Projects & Customers")).click();
		Login.driver.findElement(By.xpath("//input[@ value='Add New Customer']")).click();
		Login.driver.findElement(By.name("name")).sendKeys("helloworld");
		Login.driver.findElement(By.name("createCustomerSubmit")).click();
		String errormessage = Login.driver.findElement(By.className("errormsg")).getText();
		System.out.println(errormessage);
		
		
		
		
		
		
		
	}

}
