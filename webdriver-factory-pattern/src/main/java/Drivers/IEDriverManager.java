package Drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IEDriverManager extends DriverManager {

    static  String DriverPath = "C:\\Project\\omcc-html-selenium\\Lib\\";

    @Override
    protected void startService() {

    }

    @Override
    protected void stopService() {

    }

    @Override
    protected WebDriver createDriver() {
        System.setProperty("webdriver.ie.driver", DriverPath + "IEDriverServer.exe");
        DesiredCapabilities cap = new DesiredCapabilities();
        WebDriver driver = new InternetExplorerDriver(cap);
        driver.manage().window().maximize();
        return driver;

    }
}
