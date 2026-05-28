package pranav;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertion {
	
	@Test
	public void CheckTitleOfBrowser() {
			
		String expectedtitle = "OrangeHRM";
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
	
		SoftAssert sa = new SoftAssert();
		
		driver.get("https://google.com");
		
		String actualtitle = driver.getTitle();
		
		System.out.println("Before soft assertion");
		
		//checks if OrangeHRM == google.. it's not so executes "after soft assertion" statement
		sa.assertEquals(actualtitle, expectedtitle);
		
		System.out.println("After soft assertion");
	
		//this is used to collect failed report or log
		sa.assertAll();
		
		driver.quit();
	
	}

}
