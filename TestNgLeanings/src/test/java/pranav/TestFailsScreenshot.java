package pranav;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFailsScreenshot extends BaseClass{
	@Test
	public void Checktitle() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		
		String ExpectedString ="google";
		
		driver.get("https://www.saucedemo.com/");
		
		String ActualString = driver.getTitle();
		
		Assert.assertEquals(ActualString, ExpectedString);
		
		driver.quit();
	}
	
}
