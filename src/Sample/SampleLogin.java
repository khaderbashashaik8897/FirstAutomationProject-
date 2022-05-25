package Sample;

import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleLogin {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//drivers//geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://admin.logicarts.in/");
		driver.close();

	}
}
