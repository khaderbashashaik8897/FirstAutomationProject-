package Actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class ScrollingBar {
	// using javascript execuaters 
	// scroll up ,down, scroll to webelement.
public static void main(String[] args) throws InterruptedException
{
	Login.login();
	Login.driver.findElement(By.linkText("Projects & Customers")).click();
	JavascriptExecutor jse = (JavascriptExecutor)Login.driver;
	jse.executeScript("window.scrollBy(0,1500)");
	Thread.sleep(4000);
	jse.executeScript("window.scrollBy(0,-1500)");
}

}
