package Sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Actitime.Login;

public class Mouseactions {
@Test()
public void mouseactions() throws AWTException, InterruptedException
{
	Login.login();
	WebElement  actionelement = Login.driver.findElement(By.linkText("Projects & Customers"));
	Actions action = new Actions(Login.driver);
	action.moveToElement(actionelement).build().perform();
action.contextClick(actionelement).build().perform();
	Robot robo= new Robot();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	robo.keyPress(KeyEvent.VK_DOWN);
	robo.keyPress(KeyEvent.VK_ENTER);
	
	
			
}
}
