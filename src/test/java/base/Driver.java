package base;

import com.thoughtworks.gauge.AfterSuite;
import com.thoughtworks.gauge.BeforeSuite;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.http.HttpClient;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {

    // Holds the WebDriver instance
    public static AndroidDriver driver;

    // Initialize a webDriver instance of required browser
    // Since this does not have a significance in the application's business domain, the BeforeSuite hook is used to instantiate the webDriver
    @BeforeSuite
    public void initializeDriver() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviceName","R58M52H3GSK"); //emulator-5554 //10.1.34.202:4723
        cap.setCapability("platformName","Android");
        cap.setCapability("appPackage","com.ozdilek.ozdilekteyim");
        cap.setCapability("appActivity","com.ozdilek.ozdilekteyim.MainActivity");
        cap.setCapability("version","9");
        cap.setCapability("autoGrantPermissions","true");


        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
    }

    // Close the webDriver instance
    @AfterSuite
    public void closeDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
