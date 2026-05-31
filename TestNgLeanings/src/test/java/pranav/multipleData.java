package pranav;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class multipleData {
	
	@DataProvider(name="data")
	public Object[][] Multipledatas(Method m) {
		
		Object[][] testdata = null;
		
		if(m.getName().equals("dualData"))
		{
			testdata = new Object[][] {
				{"data1","data2"}
			};
		}else if(m.getName().equals("tripleData"))
		{
			testdata =new Object[][] {
				{"data1","data2","data3"}
			};
		}
		
		return testdata;
		
	}

}
