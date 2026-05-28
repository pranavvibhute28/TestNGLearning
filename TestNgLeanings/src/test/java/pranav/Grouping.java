package pranav;

import org.testng.annotations.Test;

public class Grouping {
	
	//this executes when smoke group executed
	@Test(groups="smoke")
	public void TestCaseA() {
		System.out.println("Test Case smoke");
	}
	
	//this executes when sanity group executed
	@Test(groups="sanity")
	public void TestCaseB() {
		System.out.println("Test Case sanity");
	}
	
	//this executes when combination of sanity and smoke group executed
	@Test(groups= {"sanity","smoke"})
	public void TestCaseC() {
		System.out.println("Test Case smoke + sanity");
	}

}
