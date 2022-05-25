package PageObjectUtiltiyClass;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import utilityclass.BaseClass;

public class SelectingBroswer {
	public static void broswer(String broswer)
	{	
		if(broswer.contains("ChromeDriver"))
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver.exe");
			BaseClass.driver = new ChromeDriver();
		}
		else if(broswer.contains("FirefoxDriver"))
		{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//drivers//geckodriver.exe");
			
			BaseClass.driver = new FirefoxDriver();
		}
		else if(broswer.contains("InternetExplorer"))
		{
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"//drivers//IEDriverServer.exe");
			BaseClass.driver = new InternetExplorerDriver();
		}
		else
		{
			System.out.println("please check the browser selection  onces");
		}
	}

}
