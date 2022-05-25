package Sample;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SampleDataDriven {
	@Parameters("a")
	@Test
	public void start(String data)
	{
		System.out.println(data);
	}

}
