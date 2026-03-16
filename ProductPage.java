class ProductPage extends BasePage {
    String productList = "listproduct";
    String addToCartButton = "button#cart";

    ProductPage(String browser) {
        super(browser);
    }

    void addToCart(String product) {
        System.out.println("Adding to cart: " + product);
    }
}