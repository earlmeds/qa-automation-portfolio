class CheckoutPage extends BasePage {
    String itemField = "input#item";
    String checkoutButton = "button#checkout";

    CheckoutPage(String browser) {
        super(browser);
    }

    void checkout(String item) {
        System.out.println("Checking out: " + item);
    }

}