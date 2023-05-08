package org.example.Lecture15;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Open any url with java main method
public class OpenUrl {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(3000);

        driver.manage().window().maximize();
        driver.get("https://www.next.co.uk/");

        driver.manage().window().maximize();
        driver.get("https://www.diy.com/");

        driver.close();
    }
}
