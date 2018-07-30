package com.ron.lawton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;



public class FindByDifferentElements {

    public static void main(String[] args) {
        // Set driver options
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);

        // Set driver
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "src\\resources\\chromedriver.exe");
        driver = new ChromeDriver(options);

        try {
            driver.get("https://www.journaldev.com");
            Thread.sleep(3000);
            // find element by id
            driver.findElement(By.id("menu-item-7611")).click();
            Thread.sleep(3000);
            // find element by class name
            driver.findElement(By.className("menu-item-7621"));
            Thread.sleep(3000);
            // find element by tag name
            driver.findElement(By.tagName("div"));
            System.out.println("End of automation");
        } catch (InterruptedException ie){
            System.out.println(ie.getMessage());
        }
        finally {
            driver.close();             // close window
        }
    }
}
