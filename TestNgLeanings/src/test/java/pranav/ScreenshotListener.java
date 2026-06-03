package pranav;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ScreenshotListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {

        System.out.println("Failed Test Case : "+ result.getName());

        try {

            String timestamp = new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss").format(new Date());

            // Create screenshot object
            TakesScreenshot ts = (TakesScreenshot) BaseClass.driver;

            // Capture screenshot
            File source = ts.getScreenshotAs(OutputType.FILE);

            // Destination path
            File destination = new File("C:\\Users\\lenovo\\Downloads\\Pranav_vibhute\\ss\\"
                            + result.getName()
                            + "_"
                            + timestamp
                            + ".png");

            // Copy screenshot
            FileUtils.copyFile(source, destination);

            System.out.println("Screenshot Saved Successfully");

        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}