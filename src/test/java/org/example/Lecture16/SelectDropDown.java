package org.example.Lecture16;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.junit.Assert.*;

public class SelectDropDown {
    public WebDriver driver;
    public String url = "https://www.letskodeit.com/practice";
    String expectedText = "BMW";
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }
    @Test
    public void TestDropDown() throws InterruptedException {
     WebElement dropDown =  driver.findElement(By.id("carselect"));
     Select select = new Select(dropDown);
     select.selectByVisibleText("Honda");
     Thread.sleep(3000);

     select.selectByIndex(0);
     Thread.sleep(3000);
     String actual = select.getFirstSelectedOption().getText();
     assertEquals("select class is not working", expectedText, actual);

     select.selectByValue("benz");
     Thread.sleep(3000);

     // print all text from drop down

        List<WebElement> options = select.getOptions();
        for(WebElement option : options){
            System.out.println(option.getText());
        }
    }
    @Test
    public void testmultipleSelect() throws InterruptedException {
        WebElement multipleSelect = driver.findElement(By.id("multiple-select-example"));
        Select select = new Select(multipleSelect);
        select.selectByVisibleText("Apple");
        Thread.sleep(3000);
        select.selectByValue("orange");
        Thread.sleep(3000);
        select.selectByIndex(2);
        Thread.sleep(3000);
        List<WebElement> options = select.getOptions();
        for(WebElement option : options){
            System.out.println(option.getText());
        }
    }
    @After
    public void tearDown(){
        driver.close();
    }
}
