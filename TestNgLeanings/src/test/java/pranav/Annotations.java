package pranav;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeTest
	public void BeforeTestFunction() {
		System.out.println("This runs Before test case (Preconditions)");
	}
	
	@AfterTest
	public void AfterTestFunction() {
		System.out.println("This runs After test case (PostConditions)");
	}
	
	@BeforeMethod
	public void BeforeMethodfn() {
		System.out.println("This runs Before every test case ");
	}

	@AfterMethod
	public void AfterMethodfn() {
		System.out.println("This runs After every test case ");
	}

	@Test
	public void TestCase01() {
		System.out.println("This is test case 1");
	}
	
	@Test
	public void TestCase02() {
		System.out.println("This is test case 2");
	}

}
