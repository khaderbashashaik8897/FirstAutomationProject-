package Actitime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ArchieveCustomers {
	public static void main(String[] args) throws InterruptedException 
	{
		Login.login();
		Login.driver.findElement(By.linkText("Projects & Customers")).click();
		WebElement drop = Login.driver.findElement(By.name("selectedCustomer"));
		Select dropdown = new Select(drop);
		List<WebElement> list = dropdown.getOptions();
		for(int i=1;i<list.size();i++)
		{
			
			String customername = list.get(i).getText();
			Login.driver.findElement(By.linkText(customername)).click();
			Login.driver.findElement(By.xpath("//input[@ value='Archive This Customer']")).click();
			Login.driver.switchTo().alert().accept();
		String message =	Login.driver.findElement(By.className("successmsg")).getText();
		System.out.println(message);
		Login.driver.findElement(By.xpath("//input[@ value='Delete This Customer']")).click();
		Login.driver.switchTo().alert().accept();	
		}
	}

}
