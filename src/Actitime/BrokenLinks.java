package Actitime;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrokenLinks {
public static void main(String[] args) throws InterruptedException, IOException
{
	Login.login();
	Thread.sleep(3000);
	Login.driver.findElement(By.linkText("Projects & Customers")).click();
	List<WebElement> brokenlinks= Login.driver.findElements(By.tagName("a"));
	System.out.println(brokenlinks.size());
	for(int i =0; i<brokenlinks.size();i++)
	{
		WebElement element = brokenlinks.get(i);
		String url = element.getAttribute("href");
		URL link = new URL(url);
		HttpURLConnection  conn = (HttpURLConnection)link.openConnection();
		Thread.sleep(3000);
		conn.connect();
		int responsecode = conn.getResponseCode();
		if(responsecode>400)
		{
			System.out.println(url+"This is a broken link ");
		}
		else 
		{
			System.out.println(url+"This is not a broken link");
		}
		
		}
	
	
}
}
