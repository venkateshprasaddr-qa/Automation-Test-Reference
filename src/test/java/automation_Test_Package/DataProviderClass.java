package automation_Test_Package;


	
	
	import org.testng.annotations.DataProvider;

	public class DataProviderClass {

	    @DataProvider(name = "loginCredentials")
	    
	    
	    public Object[][] getLoginData() 
	    
	    {
	        return new Object[][]{
	        	
	            {"test@example.com", "MySecurePassword"}
	        };
	    }
	}



