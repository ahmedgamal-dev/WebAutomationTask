package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;

    }

    By proceedToCheckout = By.xpath("//div[@class='float-end ng-star-inserted']//button[@type='button']");

    public void proceedCheckout() {
        WebElement checkoutButton = driver.findElement(proceedToCheckout);
        checkoutButton.click();
    }
}

