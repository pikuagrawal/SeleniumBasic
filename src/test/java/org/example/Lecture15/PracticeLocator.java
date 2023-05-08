package org.example.Lecture15;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Practice locators in webpage  •5 weblements by id, name , class name  • construct xpath for 5 elements
public class PracticeLocator {
    @Test
    public void findLocatorInWebPage() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.eggfreecake.co.uk/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='megamenu-item-link item_3']")).click();// click on cakes category.
        Thread.sleep(4000);
        driver.findElement(By.xpath("//img[@title='Mango Collection']")).click();// mango collection
        Thread.sleep(3000);
        driver.findElement(By.className("product-image-photo")).click(); // Mango Cream Eid Cupcakes
        Thread.sleep(3000);
        driver.findElement(By.className("item_4")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//img[@alt='Red Roses 2-tier Wedding Cake 2 ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("item_182")).click();
        Thread.sleep(2000);

        driver.close();
    }

}
