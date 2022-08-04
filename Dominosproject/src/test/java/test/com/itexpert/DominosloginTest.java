/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexpert;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Administrator
 */
public class DominosloginTest {
    private static WebDriver driver;
    private static String baseUrl;
    
    public DominosloginTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void testDominosCustomerLogin() throws Exception {
    driver.get("https://www.google.com/search?q=www.dominos.com&rlz=1C1GCEU_enUS933US933&oq=&aqs=chrome.1.35i39i362l8.1098309j0j15&sourceid=chrome&ie=UTF-8");
    driver.findElement(By.xpath("//div[@id='tads']/div/div/div/div/div/a/div/span")).click();
    driver.get("https://www.dominos.com/en/?utm_campaign=12900922688|c|GG&utm_source=Google&utm_medium=p_search&utm_content=aud-365150917357:kwd-498590466|12900922688|116791188690&utm_term=www%20dominos%20com&matchtype=e&gclid=Cj0KCQjwidSWBhDdARIsAIoTVb3SprLNt-uvWFTMTTwibUrVxoJO9rZT5_7Hf85YSf7NwH0Pp8o6pMMaAr30EALw_wcB");
    driver.findElement(By.xpath("//div[@id='__next']/header/div/nav/ul[2]/li/button")).click();
    driver.findElement(By.id("Email")).click();
    driver.findElement(By.id("Email")).clear();
    driver.findElement(By.id("Email")).sendKeys("abc@yahoo.com");
    driver.findElement(By.id("Password")).click();
    driver.findElement(By.id("Password")).clear();
    driver.findElement(By.id("Password")).sendKeys("neetu78");
    
  }

    
}
