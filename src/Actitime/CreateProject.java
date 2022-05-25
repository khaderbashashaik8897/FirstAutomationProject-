package Actitime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateProject {
	static int count =0;
	public static void main(String[] args) throws InterruptedException 
	{
		Login.login();
		Login.driver.findElement(By.linkText("Projects & Customers")).click();
		Login.driver.findElement(By.xpath("//input[@ value='Add New Project']")).click();
		WebElement dropdown = Login.driver.findElement(By.name("customerId"));
		Select drop = new Select(dropdown);
		List<WebElement> list = drop.getOptions();
		for(int i=1;i<list.size();i++)
		{
			String currentuser = list.get(i).getText();
			System.out.println(currentuser);
			count= count+1;
		}
		System.out.println(count);
		drop.selectByVisibleText("9885243417");
		
		Login.driver.findElement(By.name("name")).sendKeys("Random Project");
		Login.driver.findElement(By.name("createProjectSubmit")).click();
		String erromessage = Login.driver.findElement(By.className("errormsg")).getText();
		System.out.println(erromessage);
		
	}

}
