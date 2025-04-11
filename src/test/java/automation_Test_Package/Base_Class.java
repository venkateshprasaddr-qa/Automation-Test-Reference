package automation_Test_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Class {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Note:-

        //driver.het("  URL  ")-----is kept inside the TestScriptClass ,Application URL is opened in the respective test method, not in BaseClass(so, we can use multiple URL's for each test methods if required)

        //driver.get("  URL ")-----can be used here as well based on the requirement but according to this.


        System.out.println("Browser launched successfully");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("Browser closed");
        }
    }
}
