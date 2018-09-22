package com.ford.gotd.Pages;

import org.junit.After;
import org.openqa.selenium.WebDriver;

import static com.ford.gotd.BaseSetUp.LoginPage.getDriver;
import static com.ford.gotd.BaseSetUp.LoginPage.tearDown;


public class BaseTest {


    public WebDriver startBrowser() throws InterruptedException {

        return getDriver();
    }

    @After
    public void tearDownBrowser() {
        tearDown();
    }
}
