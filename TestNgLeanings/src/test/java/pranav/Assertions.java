package pranav;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions {
	
	@Test
	public void CheckTitle() {
		
		String expectedtitle = "Google";
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://google.com");
		
		String actualtitle = driver.getTitle();
		System.out.println("Assertion Program");
		Assert.assertEquals(actualtitle, expectedtitle);
		driver.close();
		
	}
}
