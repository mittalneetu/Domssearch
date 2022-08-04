/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Administrator
 */
public class DesignTest {
  private WebDriver driver;
  private String baseUrl;
    
    public DesignTest() {
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
  public void testDominos() throws Exception {
    driver.get(baseUrl + "chrome://newtab/");
    driver.get("https://www.google.com/search?q=www.dominos.com&rlz=1C1GCEU_enUS933US933&oq=&aqs=chrome.0.35i39i362l8.28496028j0j15&sourceid=chrome&ie=UTF-8");
    driver.findElement(By.linkText("Menu")).click();
    driver.get("https://www.dominos.com/en/pages/order/menu");
    driver.findElement(By.xpath("//div[@id='js-categoryArea']/div/div/a/div[2]/h2")).click();
    driver.get("https://www.dominos.com/en/pages/order/#!/product/S_PIZZA/builder/?flavorCode=HANDTOSS");
    driver.get("https://www.dominos.com/en/restaurants");
    driver.findElement(By.id("Carryout")).click();
    driver.findElement(By.id("City")).click();
    driver.findElement(By.id("Region")).click();
    driver.findElement(By.id("PostalCode")).click();
    driver.findElement(By.id("PostalCode")).clear();
    driver.findElement(By.id("PostalCode")).sendKeys("60563");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.get("https://www.dominos.com/en/pages/order/#!/locations/search?type=Carryout&c=Naperville%2C%20IL%2060563&s=&locationName=");

  }
    
}
