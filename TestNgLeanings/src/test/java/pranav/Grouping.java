package pranav;

import org.testng.annotations.Test;

//when we run Grouping-class from configuration all methods from grouping class gets executed 
@Test(groups="Grouping-class")
public class Grouping {
	
	
	//This executes for each test case or we can say test methods
	//This executes when smoke group executed
	
	@Test(groups="smoke")
	public void TestCaseA() {
		System.out.println("Grouping Program");
		System.out.println("Test Case smoke");
	}
	
	//This executes when sanity group executed
	@Test(groups="sanity")
	public void TestCaseB() {
		System.out.println("Test Case sanity");
	}
	
	//This executes when combination of sanity and smoke group executed
	@Test(groups= {"regression","smoke"})
	public void TestCaseC() {
		System.out.println("Test Case smoke + sanity");
	}

}
