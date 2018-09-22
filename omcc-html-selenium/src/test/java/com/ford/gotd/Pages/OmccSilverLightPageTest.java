package com.ford.gotd.Pages;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class OmccSilverLightPageTest extends BaseTest {

    private  WebDriver driver;
    private BaseTest baseTest;
    private OmccSilverLightPage omccSilverLightPage;

    public OmccSilverLightPageTest() throws InterruptedException {
        baseTest = new BaseTest();
        driver = baseTest.startBrowser();

    }


    @Test
    public void getPageTitleTest() throws InterruptedException {
        omccSilverLightPage = new OmccSilverLightPage(driver);
        String ActualSilverLightTitle = omccSilverLightPage.getPageTitle();
        String ExpectedSilverLightTitle = "OMCC";
        Assert.assertEquals(ActualSilverLightTitle,ExpectedSilverLightTitle);

    }

    @Test
    public void clickOnMpv(){

    }
}
