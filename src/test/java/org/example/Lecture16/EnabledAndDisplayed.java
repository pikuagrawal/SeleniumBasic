package org.example.Lecture16;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;
public class EnabledAndDisplayed {
    public WebDriver driver;
    public String url = "https://www.letskodeit.com/practice";
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }
    @Test
    public void TestEnableAndDisable() throws InterruptedException {
        driver.findElement(By.id("disabled-button")).click();
        boolean ans1 = driver.findElement(By.id("enabled-example-input")).isEnabled(); //false
        assertFalse(ans1);
        Thread.sleep(3000);
        driver.findElement(By.id("enabled-button")).click();
        boolean ans2 = driver.findElement(By.id("enabled-example-input")).isEnabled();
        assertTrue(ans2);
        driver.findElement(By.id("enabled-example-input")).sendKeys("Priyanka");
        Thread.sleep(3000);
    }
    @Test
    public void TestDisplayed() throws InterruptedException {
        driver.findElement(By.id("hide-textbox")).click();
        boolean ans1 = driver.findElement(By.id("displayed-text")).isDisplayed(); //false
        System.out.println(ans1);
        assertFalse(ans1);
        Thread.sleep(3000);

        driver.findElement(By.id("show-textbox")).click();
        boolean ans2 = driver.findElement(By.id("displayed-text")).isDisplayed(); // true
        assertTrue(ans2);
        driver.findElement(By.id("displayed-text")).sendKeys("Priyanka");
        Thread.sleep(3000);
    }
    @After
    public void tearDown(){
        driver.close();
    }

}
