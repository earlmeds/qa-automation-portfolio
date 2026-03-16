package pages;

public class ProductPage extends BasePage {
    String productList = "listproduct";
    String addToCartButton = "button#cart";

    public ProductPage(String browser) {
        super(browser);
    }

    public void addToCart(String product) {
        System.out.println("Adding to cart: " + product);
    }
}