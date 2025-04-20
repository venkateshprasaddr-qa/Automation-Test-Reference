package automation_Test_Package;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.openqa.selenium.*;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ListenersClass implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        // Get the test class instance to access WebDriver
        Object testClassInstance = result.getInstance();
        WebDriver driver = ((automation_Test_Package.Base_Class) testClassInstance).driver;

        // Timestamp & screenshot name
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String testName = result.getName();
        String screenshotName = testName + "_" + timestamp + ".png";

        // Create screenshot folder if not exists
        File screenshotFolder = new File("screenshots");
        if (!screenshotFolder.exists()) {
            screenshotFolder.mkdir();
        }

        // Take screenshot and save
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destFile = new File(screenshotFolder + File.separator + screenshotName);
        try {
            java.nio.file.Files.copy(srcFile.toPath(), destFile.toPath());
            System.out.println("Screenshot captured: " + destFile.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("❌ Failed to save screenshot: " + e.getMessage());
        }
    }

    // Empty methods for other events
    @Override public void onStart(ITestContext context) {
    	
    	System.out.println("started");
    }
    @Override public void onFinish(ITestContext context) {
    	System.out.println("Finished");
    }
    @Override public void onTestStart(ITestResult result) {}
    @Override public void onTestSuccess(ITestResult result) {}
    @Override public void onTestSkipped(ITestResult result) {}
    @Override public void onTestFailedButWithinSuccessPercentage(ITestResult result) {}
    public void onTestFailedWithTimeout(ITestResult result) {}
}
