package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
    WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }


    By emailFiled = By.id("email");
    By passwordFiled = By.id("password");
    By loginButton = By.xpath("//input[@value='Login']");
    By proceedBtn = By.xpath("//app-login//button[@type='button'][normalize-space()='Proceed to checkout']");


    By address = By.xpath("//input[@id='address']");
    By city = By.xpath("//input[@id='city']");
    By state = By.xpath("//input[@id='state']");
    By country = By.xpath("//input[@id='country']");
    By postcode = By.xpath("//input[@id='postcode']");
    By proceedButton = By.xpath("//app-address//div[@class='float-end']");



    public void completeCheckout() {
        WebElement yourAddress = driver.findElement(address);
        yourAddress.sendKeys("74 Ahly St");

        WebElement yourCity = driver.findElement(city);
        yourCity.sendKeys("Cairo");

        WebElement yourState = driver.findElement(state);
        yourState.sendKeys("Cairo");

        WebElement yourCountry = driver.findElement(country);
        yourCountry.sendKeys("Egypt");

        WebElement yourPostcode = driver.findElement(postcode);
        yourPostcode.sendKeys("2274");

        WebElement completeButton = driver.findElement(proceedButton);
        completeButton.click();


    }

    public void login (){
        WebElement email = driver.findElement(emailFiled);
        email.sendKeys("ahmedgamal19190@gmail.com");

        WebElement password = driver .findElement(passwordFiled);
        password.sendKeys("Ahmaadd@831");

        WebElement loginBtn = driver.findElement(loginButton);
        loginBtn.click();


        WebElement proceedBtnn = driver.findElement(proceedBtn);
        proceedBtnn.click();

    }
}
