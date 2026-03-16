package pages;

public class BasePage {
    String browser;

    public BasePage(String browser) {
        this.browser = browser;
    }

    public void navigate(String url) {
        System.out.println("Navigating to " + url + " using " + this.browser);
    }
}