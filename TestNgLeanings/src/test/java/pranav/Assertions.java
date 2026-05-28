package pranav;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions {
	
	@Test
	public void CheckTitle() {
		
		String expectedtitle = "OrangeHRM";
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String actualtitle = driver.getTitle();
		
		Assert.assertEquals(actualtitle, expectedtitle);
		driver.close();
		
	}
}
