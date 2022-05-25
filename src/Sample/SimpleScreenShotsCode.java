package Sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class SimpleScreenShotsCode  extends Screenshots{
	
	public void  Screenshots(String date)
	{
		//System.setProperty("webDriver.geckodriver.driver",System.getProperty("user.dir")+"//drivers//geckodriver.exe")
		EventFiringWebDriver even = new EventFiringWebDriver(SimpleScreenShotsCode.driver);
		File f1= even.getScreenshotAs(OutputType.FILE);
		File f2 = new File(System.getProperty("user.dir")+"//ScreenShots//"+date+".jpg");
		try {
			FileUtils.moveFile(f1, f2);
		} catch (IOException e) {
			System.out.println("location not found");
			}
	}

}
