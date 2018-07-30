package com.ron.lawton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindByXPathAndCSS {

    public static void main(String[] args) {
        // Set driver options
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);

        // Set driver
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "src\\resources\\chromedriver.exe");
        driver = new ChromeDriver(options);

        driver.get("https://learn.letskodeit.com/p/practice");
        // find by custom
        driver.findElement(By.xpath("//input[@placeholder='Enter Your Name']"));
        // find by css id
        driver.findElement(By.cssSelector("#displayed-text")).sendKeys("hello");
        // find by css class
        driver.findElement(By.cssSelector(".inputs.displayed-class"));
        // find by xpath text
        driver.findElement(By.xpath("//div[@id='navbar']//a[contains(text(),'Sign Up')]")).click();
    }
}
