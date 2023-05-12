package org.example.Lecture16;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;
public class CheckBox {
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
    public void TestCheckBox() throws InterruptedException {
        driver.findElement(By.id("bmwcheck")).click();
        boolean answer = driver.findElement(By.id("bmwcheck")).isSelected();
        assertTrue(answer);
        Thread.sleep(3000);

        driver.findElement(By.id("benzcheck")).click();

        boolean ans = driver.findElement(By.id("hondacheck")).isSelected();
        assertFalse(ans);
    }
    @After
    public void tearDown(){
        driver.close();
    }
}
