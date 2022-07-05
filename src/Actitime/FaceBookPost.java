package Actitime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBookPost {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/?stype=lo&jlou=AfdC_bmwJudcfxWRJrDllnVuqvyvOI9Mo8QQLhlHiMJhfcwdOlxfS9qZkdKfDYFmZen4NQ-0hdWP6XhiqOplHm6BpNxinbguLPFjYtYc3-irGg&smuh=54123&lh=Ac-jnYRWf2Sdidj9CWc");
		driver.findElement(By.name("email")).sendKeys("9885243417");
		driver.findElement(By.name("pass")).sendKeys("Basha01@");
		driver.findElement(By.name("login")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[aria-label='Create a post']")));
		driver.findElement(By.xpath("//div[@id='mount_0_0_ic']/div/div/div/div[3]/div/div/div/div/div/div[2]/div/div/div/div[3]/div/div[2]/div/div/div/div/div/div/span")).click();
	}
	
}
