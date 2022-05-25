package Actitime;

import org.openqa.selenium.By;

public class Createinfinateusers {
	public static void main(String[] args) throws InterruptedException
	{
		
		for(int i= 2;i<50;i++)
		{
			Login.login();
			
			Login.driver.findElement(By.linkText("Projects & Customers")).click();
			Login.driver.findElement(By.xpath("//input[@ value='Add New Customer']")).click();
			Login.driver.findElement(By.name("name")).sendKeys("sk"+i);
			Login.driver.findElement(By.name("createCustomerSubmit")).click();
			//String errormessage = Login.driver.findElement(By.className("errormsg")).getText();
			//System.out.println(errormessage);
			Login.driver.close();
		}
	}

}
