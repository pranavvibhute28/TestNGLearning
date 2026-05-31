package pranav;

import org.testng.annotations.Test;

public class MultipleDataTest {
	@Test(dataProvider="data",dataProviderClass=multipleData.class)
	public void dualData(String username, String password) {
		System.out.println(username+"\t"+password);
	}
	
	@Test(dataProvider="data",dataProviderClass=multipleData.class)
	public void tripleData(String username, String password,String data3) {
		System.out.println(username+"\t"+password+"\t"+data3);
	}

}
