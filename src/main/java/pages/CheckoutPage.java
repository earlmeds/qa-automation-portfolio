package pages;

public class CheckoutPage extends BasePage {
    String itemField = "input#item";
    String checkoutButton = "button#checkout";

    public CheckoutPage(String browser) {
        super(browser);
    }

    public void checkout(String item) {
        System.out.println("Checking out: " + item);
    }

}