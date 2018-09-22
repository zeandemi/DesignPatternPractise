package com.ford.gotd.Pages;

import org.openqa.selenium.WebDriver;

public class OmccSilverLightPage {

    private WebDriver driver;


    public OmccSilverLightPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle() throws InterruptedException {

        return driver.getTitle();
    }
}
