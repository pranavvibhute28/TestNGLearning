package pranav;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterPassingByXML {
	
	@Parameters("browser")
	@Test
	public void browserOpening(String browser) {
		
		if(browser.equalsIgnoreCase("edge"))
		{
			System.out.println("opening Edge Browser");
		}else if(browser.equalsIgnoreCase("chrome"))
		{
			System.out.println("Opening Chrome Browser");
		}
		
	}

}
