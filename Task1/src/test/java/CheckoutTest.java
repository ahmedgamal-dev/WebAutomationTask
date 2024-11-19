import base.BaseClass;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutPage;
import pages.ProductPage;


public class CheckoutTest extends BaseClass {

    ProductPage productPage;
    CartPage cartPage;
    CheckoutPage checkoutPage;

    @Test
    public void testCheckoutProcess() throws InterruptedException {
        productPage = new ProductPage(driver);
        cartPage = new CartPage(driver);
        checkoutPage = new CheckoutPage(driver);

        // Steps
        productPage.selectProduct();
        productPage.addProductToCart();
        Thread.sleep(6000); // Avoid Thread.sleep; use explicit waits if possible
        productPage.openCard();
        cartPage.proceedCheckout();
        checkoutPage.login();
        checkoutPage.completeCheckout();
    }
}

















//public class CheckoutTest extends BaseClass {
//
//    ProductPage productPage;
//    CartPage cartPage;
//    CheckoutPage checkoutPage;
//
//
//    };
//    @Test
//    public void testCheckoutProcess()  {
//
//        productPage = new ProductPage(driver);
//        cartPage = new CartPage(driver);
//        checkoutPage = new CheckoutPage(driver);
//
//        //Steps
//        productPage.selectProduct();
//        productPage.addProductToCart();
//        Thread.sleep(6000);
//        productPage.openCard();
//        cartPage.proceedCheckout();
//        checkoutPage.login();
//        checkoutPage.completeCheckout();
//
//
//    }



