package pranav;

import org.testng.annotations.DataProvider;

public class LoginData {
	
	@DataProvider(name="LoginData")
	public Object[][] LoginDataMethod() {
		
		return new Object[][] {
			{"standard_user","secret_sauce"},
			{"visual_user","secret_sauce"},
			{"performance_glitch_user","secret_sauce"}
		};
		
	}

}
