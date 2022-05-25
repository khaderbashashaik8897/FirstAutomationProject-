package Actitime;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrokenLinks2 {
	public static void main(String[] args) throws InterruptedException, IOException
	{
		Login.login();
		Login.driver.findElement(By.linkText("Archives")).click();
		Thread.sleep(3000);
		List<WebElement> list = Login.driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		for(int i=0; i<list.size();i++)
		{
			WebElement element = list.get(i);
			String url = element.getAttribute("href");
			URL urllink = new URL(url);
			HttpURLConnection  connection = (HttpURLConnection) (urllink.openConnection());
			connection.connect();
			int responcecode = connection.getResponseCode();
			if(responcecode >400)
			{
				System.out.println(url+"This is broken link");
			}
			else {
				System.out.println(url+"This is not a broken link");
			}
			
			
		}
	} 

}
