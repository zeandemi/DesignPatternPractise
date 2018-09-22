package com.ford.gotd.BaseSetUp;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public class LoginPage {

    static WebDriver driver;
    static String path = getCwd();
    static String OmmcUrl = "https://wwwdev.gotd-omcc-tqa.ford.com/";
    static String DriverPath = path + "\\Lib\\";
    static WebElement secureLogTab;


    public static void tearDown() {
        driver.quit();
    }


    public static WebDriver getDriver() throws InterruptedException {
        initDriver();
        return driver;
    }

    private static WebDriver setDriver() throws InterruptedException {

        System.setProperty("webdriver.ie.driver", DriverPath + "IEDriverServer.exe");
        DesiredCapabilities cap = new DesiredCapabilities();
        WebDriver driver = new InternetExplorerDriver(cap);
        driver.manage().window().maximize();
        driver.navigate().to(OmmcUrl);
        secureLogTab = driver.findElement(By.id("ADloginStrongAuthRef"));
        secureLogTab.click();
        Thread.sleep(2000);
        return driver;
    }

    private static String getCwd() {
        return new File("").getAbsoluteFile().getAbsolutePath();

    }


    public static void initDriver() {

        try {
            driver = setDriver();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
