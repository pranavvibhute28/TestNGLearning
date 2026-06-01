package pranav;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenersTest {
	
	@Test
	public void testcaseA() {
		System.out.println("This is tase case 1");
	}
	
	
	@Test
	public void testcaseB() {
		System.out.println("This is tase case 2");
	}
	
	
	@Test
	public void testcaseC() {
		System.out.println("This is tase case 3");
	}
	
	
	@Test
	public void testcaseD() {
		System.out.println("This is tase case 4");
		Assert.assertTrue(false);
	}

}
