package Sample;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class SimpleScreenShotMethod {
	
	public void  screenshotmethod()
	{
		EventFiringWebDriver even = new EventFiringWebDriver(DataDriven.driver);
		File f1= even.getScreenshotAs(OutputType.FILE);
		String currentdate = new SimpleDateFormat("YYYYMMddhhmmss").format(new Date());
		File f2 = new File(System.getProperty("user.dir")+"//ScreenShots//"+currentdate+".jpg");
		try {
			FileUtils.moveFile(f1, f2);
		} catch (IOException e) {
			System.out.println("location not found");
			}
	}

}
