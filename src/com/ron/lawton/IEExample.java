package com.ron.lawton;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class IEExample {

    private static final String baseURL = "https://www.google.com";

    public static void main(String[] args) throws InterruptedException{
        // Set driver
        WebDriver driver;
        System.setProperty("webdriver.ie.driver", "src\\resources\\IEDriverServer.exe");
        driver = new InternetExplorerDriver();
        // Visit google.com, find search field by xpath, enter "running"
        driver.get(baseURL);
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("running"+Keys.ENTER);
        driver.manage().window().maximize();

        Thread.sleep(6000);
        driver.quit();
    }
}


