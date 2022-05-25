package PageObjectUtiltiyClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FetchingDataUsingPropetiesfile {
	
	public static String fetchdata(String value) throws IOException 
	{
	
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//staticdata.properties");
			Properties pro= new Properties();
			pro.load(fis);
			String data = pro.getProperty(value);
			return data;
		
	}

}
