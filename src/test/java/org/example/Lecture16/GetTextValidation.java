package org.example.Lecture16;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class GetTextValidation {
    public WebDriver driver;
    public String url = "https://www.letskodeit.com/practice";
    String expectedText = "Practice Page";
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }
    @Test
    public void TestPracticePage(){
        String actualText = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div/h1")).getText();
        System.out.println(actualText);
        assertEquals("Test is failed",expectedText,actualText);
    }
    @After
    public void tearDown(){
        driver.close();
    }

}
