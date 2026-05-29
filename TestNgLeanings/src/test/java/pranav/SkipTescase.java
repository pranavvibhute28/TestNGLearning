package pranav;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTescase {
	
	boolean datasetup=true;
	@Test(enabled=false)
	public void testcaseA() {
		System.out.println("Skipping 1st testcase");
	}
	@Test
	public void testcaseB() {
		System.out.println("Skipping 2nd testcase");
		throw new SkipException("Skipping 2nd testcase by exception");
		
	}
	@Test
	public void testcaseC() {
		System.out.println("Skipping 3rd testcase");
		if(datasetup==true)
		{
			System.out.println("Execute 3rd testcase");
		}else {
			throw new SkipException("Skipping 3rd testcase because data condition false by exception");
		}
	}

}
