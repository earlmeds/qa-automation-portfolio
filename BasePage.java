class BasePage {
    String browser;

    BasePage(String browser) {
        this.browser = browser;
    }

    void navigate(String url) {
        System.out.println("Navigating to " + url + " using " + this.browser);
    }
}