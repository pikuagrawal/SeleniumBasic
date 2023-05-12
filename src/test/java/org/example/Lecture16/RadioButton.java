package org.example.Lecture16;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

public class RadioButton {
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
    public void testRadioButton() throws InterruptedException {
        driver.findElement(By.id("benzradio")).click();
        Thread.sleep(3000);
        boolean ans1 = driver.findElement(By.id("benzradio")).isSelected(); //yes or true
        assertEquals(true,ans1);

        boolean ans2 = driver.findElement(By.id("hondaradio")).isSelected();//false
        assertEquals(false,ans2);

        driver.findElement(By.id("bmwradio")).click();
        Thread.sleep(3000);
        boolean ans3 = driver.findElement(By.id("bmwradio")).isSelected(); //yes or true
        assertEquals(true,ans3);
    }
    @After
    public void TearDown(){
        driver.close();
    }
}
