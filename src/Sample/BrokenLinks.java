package Sample;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Actitime.Login;

public class BrokenLinks {
	@Test()
	public void start() throws InterruptedException
	{
		Login.login();
		Login.driver.findElement(By.linkText("Projects & Customers")).click();
		List<WebElement> list = Login.driver.findElements(By.tagName("a"));
		for(int i =0;i<list.size();i++)
		{
			String a = list.get(i).getAttribute("href");
			try
			{
				URL url = new URL(a);
				HttpURLConnection connection = (HttpURLConnection)url.openConnection();
				Thread.sleep(3000);
				connection.connect();
				int resp = connection.getResponseCode();
				if(resp>200) {
					System.out.println("This is the Broken link"+url);
				}
				else
				{
					System.out.println("This not the Broken link"+url );
				}
			}
			catch(Exception ex)
			{ 
			System.out.println("please check the url");
			}
			
			
		}
		
	}

}
