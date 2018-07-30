package com.ron.lawton;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestOne {

    private static  WebDriver driver;
    private static String driverPath = "src\\resources\\";

    @BeforeClass
    public static void setUp() {
        System.out.println("*******************");
        System.out.println("launching IE browser");
        System.setProperty("webdriver.ie.driver", driverPath+"IEDriverServer.exe");
        driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testGooglePageTitleInIEBrowser() {
        driver.navigate().to("http://www.google.com");
        String strPageTitle = driver.getTitle();
        System.out.println("Page title: - "+strPageTitle);
        Assert.assertTrue("Page title doesn't match",strPageTitle.equalsIgnoreCase("Google"));
    }

    @AfterClass
    public static void tearDown() {
        if(driver!=null) {
            System.out.println("Closing IE browser");
            driver.quit();
        }
    }
}
