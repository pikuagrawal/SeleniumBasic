package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitroseCakeOrder {
    public WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void waitRose() throws InterruptedException {
        driver.get("https://www.waitrose.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div/section/div[2]/button[2]")).click();//accept cookies
        Thread.sleep(9000);
        //driver.findElement(By.className("shopWindowText___Rqx0e")).click();
       // Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"cms-body-content\"]/nav/span[4]/a/span")).click();
        //driver.findElement(By.xpath("//*[@id=\"site-header-entertaining\"]")).click();
        Thread.sleep(3000);
        driver.close();

    }


}

