package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage {

    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    By selectProduct = By.xpath("//a[1]//div[3]");
    By addToCartButton = By.xpath("//button[@id='btn-add-to-cart']");

    By clickToCard = By.xpath("//span[@id='lblCartCount']");

    public void selectProduct() {
        WebElement clickOnProudct = driver.findElement(selectProduct);
        clickOnProudct.click();
    }

    public void addProductToCart() {
        WebElement addButton = driver.findElement(addToCartButton);
        addButton.click();
    }


    public void openCard() {
        WebElement addButton = driver.findElement(clickToCard);
        addButton.click();
    }
}
