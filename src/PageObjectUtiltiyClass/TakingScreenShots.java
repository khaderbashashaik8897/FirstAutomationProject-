package PageObjectUtiltiyClass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class TakingScreenShots {
	
public static String   screenshot(WebDriver driver,String name) throws IOException
{
	EventFiringWebDriver  evn = new EventFiringWebDriver(driver);
	File f1 = evn.getScreenshotAs(OutputType.FILE);
	String s1= new SimpleDateFormat("yyyymmddhhmmss").format(new Date());
	String path = System.getProperty("user.dir")+"//ScreenShots//"+s1+name+".jpg" ;
	File f2 = new File(path);
	FileUtils.moveFile(f1, f2);

	return path;
	
	
	
}
}
