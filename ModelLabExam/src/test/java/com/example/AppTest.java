package com.example;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    WebDriver driver;
    @Test
    public void test(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.shoppersstop.com/");
        driver.findElement(By.xpath("//*[@id=\"profileImage\"]/a/i")).click();
        String title = driver.getTitle();
        String pgsource = driver.getPageSource();
        System.out.println(title);
        System.out.println(pgsource);
        int length = pgsource.length();
        System.out.println(length);
        String url = driver.getCurrentUrl();
        driver.navigate().to("https://www.google.com");
        driver.navigate().back();
        Assert.assertTrue(driver.getCurrentUrl().equals(url));
        driver.quit();
    }
    
}
