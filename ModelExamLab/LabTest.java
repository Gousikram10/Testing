package com.Model;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.util.Assert;

public class LabTest {
    /**
     * @throws InterruptedException
     */
    @Test
    public void test1() throws InterruptedException
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.shoppersstop.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='profileImage']/a/i")).click();
        Thread.sleep(3000);
        String a=driver.getCurrentUrl();
        System.out.println(driver.getTitle());
        String c=driver.getPageSource();
        System.out.println(c.length());
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.navigate().to("https://www.google.com");
        Thread.sleep(2000);
        driver.navigate().back();
        String b=driver.getCurrentUrl();
       SoftAssert assert1=new SoftAssert();
       assert1.assertTrue(a.equals(b));
       System.out.println(a.contains(b));
       System.out.println(a+" ");
       System.out.println(b);
        // driver.close();
        
    }
}
