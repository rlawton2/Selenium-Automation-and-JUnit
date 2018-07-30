package com.ron.lawton;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeExample {

    public static void main(String[] args) throws Exception{
    	// Set webdriver
		System.setProperty("webdriver.chrome.driver", "src\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// visit "duckduckgo.com", locate search field, and enter "amazon"
		driver.get("https://duckduckgo.com/");
		WebElement we = driver.findElement(By.xpath("//input[@id='search_form_input_homepage']"));
		we.sendKeys("amazon");
		we.sendKeys(Keys.ENTER);

		// wait for results and click "https://www.amazon.com/"
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='https://www.amazon.com/']")).click();

        // locate search field and enter "mota 6000"
		Thread.sleep(3000);
		we = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		we.sendKeys("mota 6000");
		we.sendKeys(Keys.ENTER);

		Thread.sleep(3000);

		// close window
		driver.close();

    }
}
