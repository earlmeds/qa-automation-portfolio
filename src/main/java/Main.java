import pages.LoginPage;
import pages.CheckoutPage;
import pages.ProductPage;

public class Main {
    public static void main(String[] args) {

        String browser = "Chrome";
        String username = "standard_user";
        String password = "secret_sauce";
        String product = "product 001";

        LoginPage loginPage = new LoginPage(browser);
        CheckoutPage checkoutPage = new CheckoutPage(browser);
        ProductPage productPage = new ProductPage(browser);

        loginPage.navigate("https://saucedemo.com");

        loginPage.login(username, password);

        productPage.addToCart(product);

        checkoutPage.checkout(product);

    }
}
