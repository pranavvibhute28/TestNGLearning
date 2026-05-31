package pranav;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderBasic {
	
	//created dataset name Dataset1 and having return type Object
	@DataProvider
	public Object[][] Dataset1() {
		
		return new Object[][]{
			{"username1","password1"},
			{"username2","password2"}	
		};	
	}
	
	@DataProvider
	public Object[][] Dataset2(){
		Object[][] obj = new Object[][] {
			{"Pranav1","Vibhute1"},
			{"Pranav2","Vibhute2"}
		};
		
		return obj;
	}
	
	
	//created testcase to fetch data from dataset provided by dataprovider
	@Test(dataProvider="Dataset1")
	public 	void test1(String username,String password) {
		System.out.println(username +"\t"+ password);
		
		
	}
	
	@Test(dataProvider="Dataset2")
	public 	void test2(String username,String password) {
		System.out.println(username +"\t"+ password);
		
		
	}

}
