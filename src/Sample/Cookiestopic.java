package Sample;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class Cookiestopic {
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//drivers//geckodriver.exe");
	FirefoxDriver driver =new FirefoxDriver ();
	Date date= new Date();
	String current =  new SimpleDateFormat("ddMMyyyy:hhmmss").format(date);
	System.out.println(current);
	/*driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.amazon.com/");
	java.util.Set<Cookie> cookies = driver.manage().getCookies();
	System.out.println(cookies.size());
	for(Cookie cooki:cookies)
	{
		System.out.println(cooki.getName()+":"+cooki.getValue());
	}
	Cookie obj = new Cookie("Myfirstcookie", "sk9885243417");
	System.out.println(cookies.size());
	driver.manage().addCookie(obj);
	Thread.sleep(3000);
	driver.manage().deleteCookieNamed("skin");
	driver.manage().deleteAllCookies();
	System.out.println(cookies.size());
	driver.close(); */
	

}
}
