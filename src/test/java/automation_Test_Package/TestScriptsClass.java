package automation_Test_Package;

	
	

	import org.openqa.selenium.By;
	import org.testng.Assert;
	import org.testng.annotations.Test;

        @Listeners(automation_Test_Package.ListenersClass.class)



	public class TestScriptsClass extends Base_Class {

	    @Test(dataProvider = "loginCredentials", dataProviderClass = DataProviderClass.class)
	    public void loginTest(String username, String password) {
	        driver.get("https://qa.ifaclick.com/login");

	        // Sample locators - change according to your actual app
	        driver.findElement(By.id("username")).sendKeys(username);
	        driver.findElement(By.id("password")).sendKeys(password);
	        driver.findElement(By.id("loginBtn")).click();

	        // Dummy validation - change this as per your app’s behavior
	        String currentUrl = driver.getCurrentUrl();
	        Assert.assertTrue(currentUrl.contains("dashboard"), "Login failed or did not redirect to dashboard.");
	    }
	    
	    //Multiple test cases can be written here.....
	    
	    
	    //@Test
	    //.....
	    //......
	    
	}



