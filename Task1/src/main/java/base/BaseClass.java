package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;


import java.time.Duration;

public class BaseClass {

        protected WebDriver driver;

         @BeforeMethod
        public void setup() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            driver.get("https://practicesoftwaretesting.com/");



         }

//        @AfterMethod
//        public void teardown() {
//                driver.quit();
//
//        }
    }

