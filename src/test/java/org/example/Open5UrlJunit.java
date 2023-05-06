package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Go to at least 5 webs url using junit(@Test 5mthods, use before and after for setup and teardown)
public class Open5UrlJunit {
    public WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test(timeout = 2000)
    public void openNetflixUrl() {
        driver.get("https://www.netflix.com/gb/");
    }
    @Test
    public void openMAndSUrl(){
        driver.get("https://www.asda.com/");
    }
    @Test
    public void openArgosUrl(){
        driver.get("https://www.argos.co.uk/");
    }
    @Test
    public void openNextUrl(){
        driver.get("https://www.next.co.uk/");
    }
    @Test
    public void openAmazonUrl(){
        driver.get("https://www.amazon.co.uk/");
    }
    @After
    public void tearDown() {
        driver.close();
    }
}
