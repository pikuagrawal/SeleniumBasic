package org.example.Lecture15;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest{
    public WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void CheckLoginTest() throws InterruptedException {
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(3000);
        driver.findElement(By.className("ico-login")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("Email")).sendKeys("Priyanka18888@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.id("Password")).sendKeys("12345");
        Thread.sleep(3000);
        driver.findElement(By.className("login-button")).click();
        Thread.sleep(3000);
    }
    @Test
    public void CheckRegisterationTest() throws InterruptedException {
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.className("ico-register")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("gender-female")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("FirstName")).sendKeys("Priyanka");
        Thread.sleep(3000);
        driver.findElement(By.id("LastName")).sendKeys("Agrawal");
        Thread.sleep(3000);
        driver.findElement(By.id("Email")).sendKeys("priyanka18888@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='Password'] ")).sendKeys("1234567");
        Thread.sleep(3000);
        driver.findElement(By.name("ConfirmPassword")).sendKeys("1234567");
        Thread.sleep(3000);
        driver.findElement(By.id("register-button")).click();
        Thread.sleep(3000);
    }
    @After
    public void tearDown(){
        driver.close();
    }
}
