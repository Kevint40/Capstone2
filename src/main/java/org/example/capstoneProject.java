package org.example;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;


public class capstoneProject {

        static WebDriver driver;


    @BeforeAll
        public static void setup() {// driver setup
            System.setProperty("WebDriver.Chrome.Driver", "C:\\Program Files\\Google\\Chrome\\Application");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        }
        @Test
        public void Execution() {//Test
          //  driver.get("https://www.ecomdeveloper.com/demo/index.php?route=common/home");
            driver.get("https://www.ecomdeveloper.com/demo/index.php?route=product/product&product_id=40");
          //  driver.findElement(By.className("lazyloaded")).click();
            driver.findElement(By.xpath("//input[@value='Buy Now']")).click();
            WebElement radio1 = driver.findElement(By.name("account"));
            radio1.click();
            WebElement checkOutButton = driver.findElement(By.id("button-account"));
                    checkOutButton.click();
            Assert.assertEquals(checkOutButton.getAttribute("value"), "Loading...");}
        @AfterAll
        public static void teardown() {// Quit Browser
            driver.quit();
        }

}